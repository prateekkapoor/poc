package com.kapoopr.demo.test.controller;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.SimpleFormController;

import com.kapoopr.demo.test.beans.Name;
import com.kapoopr.demo.test.service.HelloService;

public class HelloController extends SimpleFormController {
	private HelloService helloService;

	public HelloService getHelloService() {
		return helloService;
	}

	public void setHelloService(HelloService helloService) {
		this.helloService = helloService;
	}

	public HelloController() {
		System.out.println("inside hello controller....");
		setCommandClass(Name.class);
		setCommandName("name");
	}

	@Override
	protected ModelAndView onSubmit(Object command) throws Exception {
		Name name = (Name) command;
		helloService.add(name);
		return new ModelAndView("helloView", "name", name);
	}
}
