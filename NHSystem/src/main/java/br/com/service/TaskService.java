package br.com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.model.Task;
import br.com.model.User;
import br.com.repository.TaskRepository;

@Service
public class TaskService {

	
	
	@Autowired
	private TaskRepository taskRepository;
	
	
	public void addTask(Task task, User user) {
		task.setUser(user);
		taskRepository.save(task);
	}
	
	
	public List<Task> findUserTask(User user){
		return taskRepository.findByUser(user);
	}
}
