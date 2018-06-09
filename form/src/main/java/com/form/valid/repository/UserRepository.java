package com.form.valid.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.form.valid.model.User;

public interface UserRepository extends JpaRepository<User, Long>{

	User findByEmail(String email);

}
