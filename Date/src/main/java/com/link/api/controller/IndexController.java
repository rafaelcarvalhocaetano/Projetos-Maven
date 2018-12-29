package com.link.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.link.api.entity.Evento;
import com.link.api.repository.EventoRepository;

@Controller
public class IndexController {
	
	@Autowired
	private EventoRepository er;
	
	
	@RequestMapping("/")
	public ModelAndView lista() {
		
		ModelAndView mv = new ModelAndView("index");
		Iterable<Evento> eventos = er.findAll();
		mv.addObject("lista", eventos);
		
		return mv;
	}

}
