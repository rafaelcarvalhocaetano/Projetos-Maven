package com.form.valid.controller;

import java.util.HashMap;
import java.util.Map;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.form.valid.model.User;
import com.form.valid.repository.UserRepository;

@RestController
@RequestMapping(path="/convidado")
public class EventoController {
	
	@Autowired
	private UserRepository repo;
	
	Map<String, String> errors;
	
	@PostMapping("/save")
	public ResponseEntity<Object> create(@RequestBody @Valid User user, BindingResult bindingResult){
		
		if(bindingResult.hasErrors()) {
			
			errors = new HashMap<>();
			for(FieldError e : bindingResult.getFieldErrors()) {
				errors.put(e.getField(), e.getDefaultMessage());
			}
			return new ResponseEntity<>(errors, HttpStatus.NOT_ACCEPTABLE);			
		}
		User u = repo.findByEmail(user.getEmail());
		
		if(u != null) {
			return new ResponseEntity<>(errors, HttpStatus.CONFLICT);
		}
		return new ResponseEntity<>(repo.save(user), HttpStatus.OK);
	}

}
