package com.kapoopr.rest.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LandingPage {
	@RequestMapping("/index.htm")
	public String getLandingPage() {
		return "index";

	}

	@RequestMapping("/index.html")
	public String getLandingPageAlias() {
		return getLandingPage();

	}
}
