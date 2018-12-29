package io.apolice.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import io.apolice.model.Apolice;
import io.apolice.model.Cliente;
import io.apolice.repository.ApoliceRepository;
import io.apolice.repository.ClienteRepository;

@Controller
@RequestMapping(value="/ProvaJavaEE")
public class ApoliceController {
	
	
	@Autowired
	private ApoliceRepository ar;
	@Autowired
	private ClienteRepository cr;
	
	@RequestMapping(value="/home", method=RequestMethod.GET)
	public String home() {
		return "view/index";
	}
	
	@RequestMapping(value="/consulta", method=RequestMethod.GET)
	public String consulta() {
		return "view/consulta";
	}
	
	@RequestMapping(value="/apolices", method=RequestMethod.GET)
	public String comprar() {
		return "view/apolices";
	}
	
	
	@RequestMapping(value="/apolices", method=RequestMethod.POST)
	public String comprarApolice(Cliente c) {
		
		cr.save(c);
		
		return "view/apolices";
	}
	
	
	
	
	
	

}
