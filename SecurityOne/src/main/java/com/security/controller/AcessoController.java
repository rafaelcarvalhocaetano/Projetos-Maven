package com.security.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class AcessoController {
	
	@RequestMapping(path="/", method=RequestMethod.GET)
	public String entrar() {
		return "index";
	}
	
	@RequestMapping(path="/com", method=RequestMethod.GET)
	public String controle() {
		return "controle";
	}
	
	
	@RequestMapping(path="/logout", method=RequestMethod.GET)
	public String logout() {
		return "index";
	}
	
	
	
	
	
	

}
