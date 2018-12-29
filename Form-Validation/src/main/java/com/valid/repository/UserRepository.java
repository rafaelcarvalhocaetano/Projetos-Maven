package com.valid.repository;

import org.springframework.data.repository.CrudRepository;

import com.valid.model.User;

public interface UserRepository extends CrudRepository<User, Long>{

	User findByEmail(String email);

}
