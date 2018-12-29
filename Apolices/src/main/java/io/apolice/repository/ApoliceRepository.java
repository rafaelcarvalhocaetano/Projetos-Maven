package io.apolice.repository;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import io.apolice.model.Apolice;
import io.apolice.model.Cliente;

@Repository
public interface ApoliceRepository extends CrudRepository<Apolice, Long>{

	Cliente save(Optional<Cliente> cc);
}
