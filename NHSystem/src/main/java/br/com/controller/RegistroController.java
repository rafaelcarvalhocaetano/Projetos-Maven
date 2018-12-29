package br.com.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import br.com.model.User;
import br.com.service.UserService;

@Controller
public class RegistroController {
	
	
	@Autowired
	private UserService uss;
	
	@GetMapping("/register")
	public String registroForm(Model model) {
		
		model.addAttribute("user", new User());
		return "view/registroform";
	}
	
	@PostMapping("/register")
	public String registroUser(@Valid User user, BindingResult bindingResult, Model model) {
		
		if(bindingResult.hasErrors()) {
			return "view/registroform";
		}
		if(uss.isUserPresent(user.getEmail())) {
			model.addAttribute("existe", true);
			return "view/registroform";
		}
		uss.createUser(user);
		return "view/success";
		
	}

}
