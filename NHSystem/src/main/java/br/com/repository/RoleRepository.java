package br.com.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.model.Role;

public interface RoleRepository extends JpaRepository<Role, String>{

}
