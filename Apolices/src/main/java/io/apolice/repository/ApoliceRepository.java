package io.apolice.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import io.apolice.model.Apolice;

@Repository
public interface ApoliceRepository extends CrudRepository<Apolice, Long>{

}
