package br.com.clone.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.clone.model.User;

public interface UserRepository extends JpaRepository<User, String>{

	User findByEmail(String email);





	



	

}
