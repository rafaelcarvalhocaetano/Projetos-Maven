package com.valid.controller;

import java.util.HashMap;
import java.util.Map;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.valid.model.User;
import com.valid.repository.UserRepository;

@RestController
@RequestMapping("/form")
@CrossOrigin(origins="http://localhost:4200", allowedHeaders="*")
public class UserController {

	@Autowired
	private UserRepository ur;
	
	private Map<String, String> errors;
	
	@PostMapping("/create")
	public ResponseEntity<Object> createForm(@RequestBody @Valid User user, BindingResult bind) {
		
		if(bind.hasErrors()) {
			errors = new HashMap<>();
			for(FieldError erro : bind.getFieldErrors()) {
				//passando as mensagens de erro para o map
				errors.put(erro.getField(), erro.getDefaultMessage());
			}
			return new ResponseEntity<>(errors, HttpStatus.NOT_ACCEPTABLE);
		}
		
		User u = ur.findByEmail(user.getEmail());
		
		if(u != null) {
			return new ResponseEntity<>(HttpStatus.CONFLICT);
		}
		return new ResponseEntity<>(ur.save(user), HttpStatus.OK);
	}
}
