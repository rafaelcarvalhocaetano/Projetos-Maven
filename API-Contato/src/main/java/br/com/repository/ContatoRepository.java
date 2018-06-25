package br.com.repository;

import org.springframework.data.repository.CrudRepository;

import br.com.model.Contato;

public interface ContatoRepository extends CrudRepository<Contato, Long>{

}
