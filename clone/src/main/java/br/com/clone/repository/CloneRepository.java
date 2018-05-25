package br.com.clone.repository;

import org.springframework.data.repository.CrudRepository;

import br.com.clone.model.Clone;

public interface CloneRepository extends CrudRepository<Clone, Long> {

}
