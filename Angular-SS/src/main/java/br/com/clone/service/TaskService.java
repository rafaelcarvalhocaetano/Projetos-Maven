package br.com.clone.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.clone.model.Task;
import br.com.clone.model.User;
import br.com.clone.repository.TaskRepository;

@Service
public class TaskService {

	@Autowired
	private TaskRepository tr;
	
	
	public void addTask(Task task, User user) {
		task.setUser(user);
		tr.save(task);
	}
	
	public List<Task> findUserTask(User user){
		return tr.findByUser(user);
	}
}
