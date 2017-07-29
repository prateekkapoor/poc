package com.kapoopr.demo.test.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.kapoopr.demo.test.beans.Name;
import com.kapoopr.demo.test.service.HelloService;

@Controller
public class HelloController {
	@Autowired
	private HelloService helloService;

	public HelloService getHelloService() {
		return helloService;
	}

	public void setHelloService(HelloService helloService) {
		this.helloService = helloService;
	}

	@RequestMapping(value = "index", method = RequestMethod.GET)
	public ModelAndView addUser() {
		return new ModelAndView("nameView", "name", new Name());
	}

	@RequestMapping(value = "addName", method = RequestMethod.POST)
	public String addUser(@ModelAttribute("SpringTest3") Name name, ModelMap map) {
		map.addAttribute("userName", name.getUserName());
		map.addAttribute("country", name.getCountry());
		map.addAttribute("email", name.getEmail());

		return "helloView";

	}

	@RequestMapping(value = "test", method = RequestMethod.GET)
	public ModelAndView testUser() {
		System.out.println("testing...");
		return new ModelAndView("helloView");

	}
}
