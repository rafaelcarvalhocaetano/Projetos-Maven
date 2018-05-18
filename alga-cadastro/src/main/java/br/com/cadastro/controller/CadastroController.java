package br.com.cadastro.controller;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.Errors;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

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
		mav.addObject(new Titulo());
		return mav;
	}

	@RequestMapping(method = RequestMethod.POST)
	public String salvar(@Validated Titulo titulo, Errors errors, RedirectAttributes attributes) {

		//ModelAndView mav = new ModelAndView("view/CadastroTitulos");

		if (errors.hasErrors()) {
			return "view/CadastroTitulos";
		}
		tr.save(titulo);
		//ModelAndView mav2 = new ModelAndView("redirect:/titulos/novo");
		attributes.addFlashAttribute("mensagem","Título salvo com sucesso");
		//mav.addObject("mensagem","Título salvo com sucesso");
		//return mav2;
		return "redirect:/titulos/novo";
	}

	@ModelAttribute("todosStatusTitulos")
	public List<StatusTitulos> todosTitulos() {
		return Arrays.asList(StatusTitulos.values());
	}

	@RequestMapping()
	public ModelAndView pesquisa() {
		Iterable<Titulo> lt = tr.findAll();
		ModelAndView mav = new ModelAndView("view/PesquisaTitulos");
		mav.addObject("itens", lt);
		return mav;
	}
	
	@RequestMapping(value="{codigo}")
	public ModelAndView edicao(@PathVariable("codigo") Titulo titulo) {
		ModelAndView mv = new ModelAndView("view/CadastroTitulos"); 
		mv.addObject(titulo);
		return mv;
	}

	// -->>>> 2.15

}
