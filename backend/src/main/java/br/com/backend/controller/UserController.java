package br.com.backend.controller;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.backend.model.User;
import br.com.backend.repository.UserRepository;

@RestController
@CrossOrigin(origins="http://localhost:4200", allowedHeaders="*")
public class UserController {
	
	@Autowired
	private UserRepository us;
	
	Map<String, String> errors;
	
	@PostMapping("/formulario/create")
	public ResponseEntity<Object> createUser(@RequestBody @Valid User user, BindingResult bindingResult){
		
		if(bindingResult.hasErrors()) {
			errors = new HashMap<>();
			for(FieldError error:bindingResult.getFieldErrors()) {
				errors.put(error.getField(), error.getDefaultMessage());
			}
			return new ResponseEntity<>(errors, HttpStatus.NOT_ACCEPTABLE);
		}
		Optional<User> u = us.findById(user.getId());
		if(u != null) {
			return new ResponseEntity<>(HttpStatus.CONFLICT);
		}
		return new ResponseEntity<>(us.save(user), HttpStatus.OK);
	}
	
	@GetMapping("/usuarios")
	public Iterable<User> listandoUsuario(){
		return us.findAll();
	}
	
	@GetMapping(value="/usuario/{id}")
	public Optional<User> usuarioId(@PathVariable("id") Long id){
		return us.findById(id);
	}
	
	@DeleteMapping("/excluir/{id}")
	public boolean deletandoUsuario(@PathVariable("id") Long id) {
		us.deleteById(id);
		return true;
	}

	@PutMapping("/usuario")
	public User atualizandoUsuario(User u) {
		return us.save(u);
	}

}
