package br.com.clone.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.clone.model.Task;
import br.com.clone.model.User;

public interface TaskRepository extends JpaRepository<Task, Long>{

	List<Task> findByUser(User user);

}
