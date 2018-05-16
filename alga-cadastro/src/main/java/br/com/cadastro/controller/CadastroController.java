package br.com.cadastro.controller;

import java.util.Arrays;
import java.util.List;
import java.util.Observable;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import br.com.cadastro.model.StatusTitulos;
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
		//mav.addObject("todosStatusTitulos", StatusTitulos.values());
		return mav;
	}
	
	@RequestMapping(method=RequestMethod.POST)
	public ModelAndView salvar(Titulo t) {
		tr.save(t);
		//ModelAndView mav = new ModelAndView("view/CadastroTitulos");
		System.out.println(">>>>> "+t.getDescricao());
		ModelAndView mav = new ModelAndView("view/CadastroTitulos");
		//mav.addObject("mensagem","Título salvo com sucesso");
		return mav;
	}
	
	@ModelAttribute("todosStatusTitulos")
	public List<StatusTitulos> todosTitulos(){
		return Arrays.asList(StatusTitulos.values());
	}
	
	@RequestMapping()
	public ModelAndView pesquisa(){
		Iterable<Titulo> lt = tr.findAll();
		ModelAndView mav = new ModelAndView("view/PesquisaTitulos");
		mav.addObject("itens", lt);
		return mav;
	}
	
	//parei em produtividade  devtools e livereload 2.11

}
