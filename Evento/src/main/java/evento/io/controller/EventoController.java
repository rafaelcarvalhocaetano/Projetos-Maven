package evento.io.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import evento.io.model.Evento;
import evento.io.repository.EventoRepository;

@Controller
@RequestMapping("/")
public class EventoController {
	
	@Autowired
	private EventoRepository er;
	
	@RequestMapping(value="/index", method=RequestMethod.GET)
	public ModelAndView home() {
		Iterable<Evento> eventos = er.findAll();
		ModelAndView mv = new ModelAndView("view/index");
		mv.addObject("lista", eventos);
		return mv;
	}
	
	@RequestMapping(value="/cadastro", method=RequestMethod.GET)
	public ModelAndView cadastro() {
		Iterable<Evento> eventos = er.findAll();
		ModelAndView mv = new ModelAndView("view/cadastro");
		mv.addObject("lista", eventos);
		return mv;
	}
	@RequestMapping(value="/cadastro", method=RequestMethod.POST)
	public String cadastro( Evento e) {
		er.save(e);
		return "redirect:/cadastro";
	}
	
	@RequestMapping(value="/deletar", method=RequestMethod.GET)
	public String deletar(Long id) {
		
		er.deleteById(id);
		
		return "redirect:/cadastro";
	}

}
