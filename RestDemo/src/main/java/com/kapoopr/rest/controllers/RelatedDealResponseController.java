package com.kapoopr.rest.controllers;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 
 * @author prateekkapoor
 * 
 */

@Controller
@RequestMapping("/snlPoc")
public class RelatedDealResponseController {

	@RequestMapping(value = "/{keyDeal}", method = RequestMethod.GET, produces = MediaType.TEXT_XML_VALUE)
	@ResponseBody
	public String testMethod(@PathVariable String keyDeal, Model model) {
		model.addAttribute("identifier", keyDeal);
		String response = "<Deal>" + "<KeyDeal>206822</KeyDeal>"
				+ "<BuyerName>Sarama Resources Ltd.</BuyerName>"
				+ "<TargetName>Royalty on the Cape Mount</TargetName>"
				+ "<SellerName>Undisclosed seller</SellerName>"
				+ "<DealEventAsOf>2015-11-03T00:00:00-05:00</DealEventAsOf>"
				+ "<KeyDealEvent>321137</KeyDealEvent>"
				+ "<EventDate>2015-11-03T00:00:00-05:00</EventDate>"
				+ "<DealValue>2426</DealValue>" + "</Deal>";
		return response;

	}
}
