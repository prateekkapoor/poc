package com.kapoopr.demo.entity;

import java.util.ArrayList;
import java.util.List;

import org.apache.http.NameValuePair;

/**
 * 
 * @author pkapo7
 *
 */
public class JobParam {
	private String username;
	private String password;
	private String token;
	private String server;
	private String port;
	private String job;
	private String jenkinsCrumb;

	public String getJenkinsCrumb() {
		return jenkinsCrumb;
	}

	public void setJenkinsCrumb(String jenkinsCrumb) {
		this.jenkinsCrumb = jenkinsCrumb;
	}

	private List<NameValuePair> parameters;

	public void setParameters(List<NameValuePair> parameters) {
		this.parameters = parameters;
	}

	public JobParam() {
		parameters = new ArrayList<NameValuePair>();
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public String getServer() {
		return server;
	}

	public void setServer(String server) {
		this.server = server;
	}

	public String getPort() {
		return port;
	}

	public void setPort(String port) {
		this.port = port;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public List<NameValuePair> getParameters() {
		return parameters;
	}
}
