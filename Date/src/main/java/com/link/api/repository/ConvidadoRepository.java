package com.link.api.repository;

import org.springframework.data.repository.CrudRepository;

import com.link.api.entity.Convidado;
import com.link.api.entity.Evento;

public interface ConvidadoRepository extends CrudRepository<Convidado, Long>{

	Iterable<Convidado> findByEvento(Evento e);
}
