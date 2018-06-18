package br.com.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.model.User;

public interface UserRepository extends JpaRepository<User, String>{

	User findByName(String email);


	

}
