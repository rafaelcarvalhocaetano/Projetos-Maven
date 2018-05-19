package br.com.clone.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/clone")
public class CloneController {
	
	@RequestMapping()
	public String home() {
		return "Index";
	}
	
	@RequestMapping("/cadastro")
	public String cadastro() {
		return "CadastroUsuario";
	}

}
