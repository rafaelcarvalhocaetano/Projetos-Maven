package com.link.api.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.link.api.model.Evento;
import com.link.api.repository.EventoRepository;

@RestController
@RequestMapping("/evento")
public class EventoController {
	
	@Autowired
	private EventoRepository er;
		
	@GetMapping(value="/lista", produces="Application/json")
	public @ResponseBody Iterable<Evento> lista(){
		Iterable<Evento> listaEvento = er.findAll();
		
		return listaEvento;
	}
	
	@GetMapping(value="/{id}", produces="Application/json")
	public @ResponseBody Optional<Evento> listaId(@PathVariable("id") Long id){
		return er.findById(id);
	}
	
	@PostMapping(produces="Application/json", value="/cadastro")
	public Evento cadastro(@RequestBody Evento e) {
		return er.save(e);
	}
	
	@DeleteMapping("/deletando")
	public boolean delete(@RequestBody Long id) {
		er.deleteById(id);
		return true;
	}

}
