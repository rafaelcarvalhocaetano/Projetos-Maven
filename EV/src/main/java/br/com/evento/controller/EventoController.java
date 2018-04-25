package br.com.evento.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import br.com.evento.model.Evento;
import br.com.evento.repository.EventoRepository;

@Controller
@RequestMapping("/")
public class EventoController {
		
	@Autowired
	private EventoRepository er;
	
	@RequestMapping(method=RequestMethod.GET)
	public String index() {
		return "index";
	}
	
		
	@RequestMapping(value="/cadastro", method=RequestMethod.GET)
	public String evento() {
		return "view/formulario";
	}
	@RequestMapping(value="/cadastro", method=RequestMethod.POST)
	public String evento(Evento e) {
		er.save(e);
		return "redirect:/cadastro";
	}

}
