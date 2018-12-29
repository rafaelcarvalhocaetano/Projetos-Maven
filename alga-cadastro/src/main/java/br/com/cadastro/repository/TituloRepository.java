package br.com.cadastro.repository;

import org.springframework.data.repository.CrudRepository;

import br.com.cadastro.model.Titulo;

public interface TituloRepository extends CrudRepository<Titulo, Long>{

	Titulo findByCodigo(Long codigo);
}
