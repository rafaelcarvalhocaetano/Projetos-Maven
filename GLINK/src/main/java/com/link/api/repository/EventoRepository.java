package com.link.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.link.api.model.Evento;

public interface EventoRepository extends JpaRepository<Evento, Long>{
}
