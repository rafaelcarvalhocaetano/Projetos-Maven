package com.security.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.security.model.Task;

public interface TaskRepository extends JpaRepository<Task, Long>{

}
