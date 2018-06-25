package br.com.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import br.com.model.Contato;
import br.com.repository.ContatoRepository;

@RestController
public class ContatoController {
	
	@Autowired
	private ContatoRepository cr;
	
	@GetMapping("/lista")
	public Iterable<Contato> getLista(){
		return cr.findAll();
	}
	@GetMapping("/lista/{id}")
	public Optional<Contato> getLista(@PathVariable Long id){
		return cr.findById(id);
	}

}
