package br.com.clone.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.clone.model.User;

@Repository
public interface UserRepository extends CrudRepository<User, String>{

	User findByEmail(String email);

}
