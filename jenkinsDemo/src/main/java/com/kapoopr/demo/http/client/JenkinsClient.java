package com.kapoopr.demo.http.client;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.auth.AuthScope;
import org.apache.http.auth.UsernamePasswordCredentials;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.auth.BasicScheme;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.protocol.BasicHttpContext;
import org.apache.http.util.EntityUtils;
import org.apache.log4j.Logger;

import com.kapoopr.demo.entity.JobParam;

/**
 * 
 * @author pkapo7
 *
 */
public class JenkinsClient {
	final Logger log = Logger.getLogger(getClass().getCanonicalName());
	private JobParam jobParam;

	public JenkinsClient(JobParam JobParam) {
		this.jobParam = JobParam;
	}

	public void postJenkinsJob() throws UnsupportedEncodingException {
		// Jenkins url
		String jenkinsUrl = String.format("%s:%s", jobParam.getServer(), jobParam.getPort());
		log.info("url = " + jenkinsUrl);
		// Create your httpclient
		DefaultHttpClient client = new DefaultHttpClient();
		// Then provide the right credentials
		client.getCredentialsProvider().setCredentials(new AuthScope(AuthScope.ANY_HOST, AuthScope.ANY_PORT),
				new UsernamePasswordCredentials(jobParam.getUsername(), jobParam.getPassword()));
		// Generate BASIC scheme object and stick it to the execution context
		BasicScheme basicAuth = new BasicScheme();
		BasicHttpContext context = new BasicHttpContext();
		context.setAttribute("preemptive-auth", basicAuth);
		// Add as the first (because of the zero) request interceptor
		// It will first intercept the request and preemptively initialize the
		// authentication scheme if there is not
		client.addRequestInterceptor(new JenkinsAuthenticator(), 0);

		// Post the request to start the build
		List<NameValuePair> parameters = new ArrayList<NameValuePair>();
		parameters.add(new BasicNameValuePair("Jenkins-Crumb", jobParam.getJenkinsCrumb()));
		UrlEncodedFormEntity uefe = null;
		String buildUrl = "http://";
		if (jobParam.getParameters().isEmpty()) {
			buildUrl += jenkinsUrl + "/job/" + jobParam.getJob() + "/build";
		} else {
			buildUrl += jenkinsUrl + "/job/" + jobParam.getJob() + "/buildWithParameters";
			parameters.addAll(jobParam.getParameters());
		}
		uefe = new UrlEncodedFormEntity(parameters);
		HttpPost post = new HttpPost(buildUrl);
		post.setHeader("User-Agent", "Mozilla/5.0");
		if (uefe != null) {
			post.setEntity(uefe);
		}

		try {
			// Execute your request with the given context
			HttpResponse response = client.execute(post, context);
			HttpEntity entity = response.getEntity();
			log.info(EntityUtils.toString(entity));
			EntityUtils.consume(entity);
		} catch (IOException e) {
			log.error(e, e.getCause());
		} finally {
		}

	}
}
