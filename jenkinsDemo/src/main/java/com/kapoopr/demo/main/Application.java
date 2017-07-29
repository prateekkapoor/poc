package com.kapoopr.demo.main;

import org.apache.log4j.Logger;

import com.kapoopr.demo.entity.JobParam;
import com.kapoopr.demo.http.client.JenkinsClient;
import com.kapoopr.demo.util.PropertyUtil;

/**
 * 
 * @author pkapo7
 *
 */
public class Application {
	final static Logger log = Logger.getLogger(Application.class.getCanonicalName());

	public static void main(String[] args) throws Exception {
		JobParam jobParam = getJobConfig();
		JenkinsClient jenkinsClient = new JenkinsClient(jobParam);
		log.info("executing postJenkinsJob");
		jenkinsClient.postJenkinsJob();
		log.info("executed postJenkinsJob");
	}

	public static JobParam getJobConfig() {
		PropertyUtil propertyUtil = new PropertyUtil();
		return propertyUtil.getJobParameterObject();
	}
}
