package br.com.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.backend.model.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
