package br.com.clone.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.clone.model.Roles;

public interface RoleRepository extends JpaRepository<Roles, String>{

}
