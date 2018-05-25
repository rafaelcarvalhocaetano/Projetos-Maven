package br.com.clone.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import br.com.clone.model.Clone;
import br.com.clone.repository.CloneRepository;

@Controller
@RequestMapping("/clone")
public class CloneController {
	
	@Autowired
	private CloneRepository cr;
	
	@RequestMapping()
	public ModelAndView home() {
		
		Iterable<Clone> clones = cr.findAll();
		ModelAndView mv = new ModelAndView("Index");
		mv.addObject("itens", clones);
		return mv;
	}
		
	@RequestMapping("/cadastro")
	public String cadastro() {
		return "CadastroUsuario";
	}
	
	@RequestMapping(method=RequestMethod.POST)
	public String salva(Clone clone) {
		cr.save(clone);
		return "redirect:/clone/cadastro";
	}
	
	
	

}
