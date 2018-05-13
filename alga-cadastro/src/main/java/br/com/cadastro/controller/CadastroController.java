package br.com.cadastro.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import br.com.cadastro.model.Titulo;
import br.com.cadastro.repository.TituloRepository;

@Controller
@RequestMapping("/titulos")
public class CadastroController {
	
	@Autowired
	private TituloRepository tr;
	
	@RequestMapping("/novo")
	public ModelAndView index() {
		ModelAndView mav = new ModelAndView("view/CadastroTitulos");
		return mav;
	}
	
	@RequestMapping(method=RequestMethod.POST)
	public String salvar(Titulo t) {
		tr.save(t);
		//ModelAndView mav = new ModelAndView("view/CadastroTitulos");
		System.out.println(">>>>> "+t.getDescricao());
		return "view/CadastroTitulos";
	}

}
