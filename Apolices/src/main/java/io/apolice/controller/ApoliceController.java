package io.apolice.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value="/ProvaJavaEE")
public class ApoliceController {
	
	@RequestMapping(value="/home", method=RequestMethod.GET)
	public String home() {
		return "view/index";
	}

}
