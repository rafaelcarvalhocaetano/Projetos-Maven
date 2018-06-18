package br.com;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import br.com.model.Task;
import br.com.model.User;
import br.com.service.TaskService;
import br.com.service.UserService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class NhSystemApplicationTests {
	
	@Autowired
	private UserService ss;
	
	@Autowired
	private TaskService ts;
	
	@Before
	public void initDB() {
		{
			User newUser = new User("rapha.user@gmail.com", "testeUser", "12345");
			ss.createUser(newUser);
		}
		{
			User newUser = new User("rapha.admin@gmail.com", "testeAdmin", "12345");
			ss.createUser(newUser);
		}
		
		Task userTask = new Task("18/06/2018", "00:30", "12:00", "Você precisa trabalhar hoje !!! ");
		User user = ss.findOne("rapha.user@gmail.com");
		ts.addTask(userTask, user);
	}
	
	@Test
	public void testUser() {
		User user = ss.findOne("rapha.user@gmail.com");
		assertNotNull(user);
		User admin = ss.findOne("rapha.admin@gmail.com");
		assertEquals(admin.getEmail(), "rapha.admin@gmail.com");
	}
	
	@Test
	public void testTask() {
		User user = ss.findOne("rapha.user@gmail.com");
		List<Task> tasks = ts.findUserTask(user);
		assertNotNull(tasks);
	}

}
