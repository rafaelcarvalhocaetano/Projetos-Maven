package com.api.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.api.model.Evento;
import com.api.repository.EventoRepository;

@RestController
@RequestMapping("/evento")
@CrossOrigin(origins="http://localhost:4200", allowedHeaders="*")
public class EventoController {
	
	
	@Autowired
	private EventoRepository er;
	
	@PostMapping("/create")
	public Evento create(@RequestBody @Valid Evento evento) {
		return er.save(evento);
	}
	
	@GetMapping(produces="application/json")
	public @ResponseBody Iterable<Evento> lista(){
		return er.findAll();
	}
	
	@DeleteMapping("/delete/{id}")
	public boolean delete(@PathVariable("id") Long id) {
		er.deleteById(id);
		return true;
	}
	


}
