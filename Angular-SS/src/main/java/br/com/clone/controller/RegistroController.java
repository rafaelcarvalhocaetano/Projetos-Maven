package br.com.clone.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import br.com.clone.model.User;
import br.com.clone.service.UserService;

@Controller
public class RegistroController {
	
	
	@Autowired
	private UserService ss;
	
	@GetMapping("/registrar")
	public String registro(Model model) {
		
		model.addAttribute("user", new User());
		return "view/registroform";
	}
	
	@PostMapping("/registrar")
	public String registerUser(@Valid User user, BindingResult bindingResult, Model model) {
		if(bindingResult.hasErrors()) {
			return "view/registroform";
		}
		if(ss.isUserPreset(user.getEmail())) {
			model.addAttribute("exit", true);
			return "view/registroform";
		}
		ss.createUser(user);
		return "view/success";
		
	}

}
