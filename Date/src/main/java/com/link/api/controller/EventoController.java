package com.link.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.link.api.entity.Convidado;
import com.link.api.entity.Evento;
import com.link.api.repository.ConvidadoRepository;
import com.link.api.repository.EventoRepository;

@Controller
public class EventoController {
	
	@Autowired
	private EventoRepository er;
	
	@Autowired
	private ConvidadoRepository cr;
	
	@RequestMapping(value="/cadastrarEvento", method=RequestMethod.GET)
	public ModelAndView form() {
		Iterable<Evento> lista = er.findAll();
		ModelAndView mv = new ModelAndView("view/form");
		mv.addObject("lista", lista);
		return mv;
	}
	
	@RequestMapping(value="/cadastrarEvento", method=RequestMethod.POST)
	public String form(Evento e) {
		er.save(e);
		return "redirect:/cadastrarEvento";
	}
	
	@RequestMapping(value="/{id}", method=RequestMethod.GET)
	public ModelAndView detalhesEvento(@PathVariable("id") Long id ) {
		Evento evento = er.findById(id);
		ModelAndView mv = new ModelAndView("view/detalhes");
		mv.addObject("evento", evento);
		
		Iterable<Convidado> convidados = cr.findByEvento(evento);
		mv.addObject("cdd", convidados);
		
		return mv;
	}
	
	@RequestMapping(value="/{id}", method=RequestMethod.POST)
	public String salvandoConvidados(@PathVariable("id") Long id, Convidado convidado ) {
		Evento evento = er.findById(id);
		convidado.setEvento(evento);
		cr.save(convidado);		
		return "redirect:/{id}";
	}
	
	
	
	
	
	
	
	
	
	
	

}
