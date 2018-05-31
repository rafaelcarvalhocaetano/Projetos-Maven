package br.com.clone.controller;

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
import org.springframework.web.bind.annotation.RestController;

import br.com.clone.model.User;
import br.com.clone.repository.UserRepository;

@RestController
@CrossOrigin(origins="http://localhost:4200", allowedHeaders="*")
public class UserController {

	
	@Autowired
	private UserRepository usr;
	
	Map<String, String> erros;
	
	@PostMapping("/add")
	public ResponseEntity<Object> addUser(@RequestBody @Valid User u, BindingResult result) {
		
		if(result.hasErrors()) {
			erros = new HashMap<>();
			
			for(FieldError erro : result.getFieldErrors()) {
				erros.put(erro.getField(), erro.getDefaultMessage());
			}
			return new ResponseEntity<>(erros, HttpStatus.NOT_ACCEPTABLE);
		}
		
		User user = usr.findByEmail(u.getEmail());
		
		if(user != null) {
			return new ResponseEntity<>(HttpStatus.CONFLICT);
		}
		
		return new ResponseEntity<>(usr.save(u), HttpStatus.OK);
		
	}
	
	
	
}
