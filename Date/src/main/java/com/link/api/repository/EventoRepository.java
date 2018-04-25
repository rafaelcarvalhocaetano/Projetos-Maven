package com.link.api.repository;

import org.springframework.data.repository.CrudRepository;

import com.link.api.entity.Evento;

public interface EventoRepository extends CrudRepository<Evento, String>{

	Evento findById(Long id);
}
