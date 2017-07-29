package com.kapoopr.demo.util;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import org.apache.commons.lang3.StringUtils;
import org.apache.http.NameValuePair;
import org.apache.http.message.BasicNameValuePair;
import org.apache.log4j.Logger;

import com.kapoopr.demo.entity.JobParam;
import com.kapoopr.demo.main.Application;

/**
 * 
 * @author pkapo7
 *
 */
public class PropertyUtil {
	private Properties prop = null;
	final static Logger log = Logger.getLogger(Application.class.getCanonicalName());

	public PropertyUtil() {
		loadProperties();
	}

	private void loadProperties() {
		prop = new Properties();
		InputStream input = null;

		try {
			log.info("loading properties...");
			// input = new FileInputStream("Application.properties");
			input = this.getClass().getResourceAsStream("/Application.properties");

			// load a properties file
			prop.load(input);

			log.info("properties are loaded..");

		} catch (IOException ex) {
			log.error(ex.getMessage(), ex);
		} finally {
			if (input != null) {
				try {
					input.close();
				} catch (IOException e) {
					log.error(e.getMessage(), e);
				}
			}
		}

	}

	public JobParam getJobParameterObject() {
		JobParam jobParam = new JobParam();
		jobParam.setJob(prop.getProperty("jenkins.job.name"));
		jobParam.setServer(prop.getProperty("jenkins.host"));
		jobParam.setPort(prop.getProperty("jenkins.port"));
		jobParam.setUsername(prop.getProperty("jenkins.user.name"));
		jobParam.setPassword(prop.getProperty("jenkins.password"));
		String parameterString = prop.getProperty("jenkins.parameters");
		jobParam.setJenkinsCrumb(prop.getProperty("jenkins.crumb"));
		if (StringUtils.isNotEmpty(parameterString)) {
			jobParam.setParameters(getParmeters(parameterString));
		}
		return jobParam;

	}

	private List<NameValuePair> getParmeters(String params) {
		List<NameValuePair> nameValuePairs = null;
		if (params != null) {
			nameValuePairs = new ArrayList<NameValuePair>();
			String[] paramLevel1 = params.split(",");
			for (String param : paramLevel1) {
				String valuePairs[] = param.split(":");
				nameValuePairs.add(new BasicNameValuePair(valuePairs[0], valuePairs[1]));
			}
		}
		return nameValuePairs;

	}
}
