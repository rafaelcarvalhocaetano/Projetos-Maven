package br.com.clone;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import br.com.clone.model.Task;
import br.com.clone.model.User;
import br.com.clone.service.TaskService;
import br.com.clone.service.UserService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class AngularSsApplicationTests {
	
	@Autowired
	private UserService ss;
	@Autowired
	private TaskService ts;

	@Before
	public void initDB() {
		{
			User user = new User("rapha.pse@gmail.com", "Rafael", "123456");
			ss.createUser(user);
		}
		{
			User user = new User("rapha.ADMIN@gmail.com", "Rafael-ADMIN", "123456");
			ss.createUser(user);
		}
		Task task = new Task("04/06/2018", "12:00", "13:00", "Acorde é seu aniversário");
		User user = ss.findOne("rapha.pse@gmail.com");
		ts.addTask(task, user);
	}
	
	@Test
	public void teste() {
		User user = ss.findOne("rapha.pse@gmail.com");
		assertNotNull(user);
		User admin = ss.findOne("rapha.ADMIN@gmail.com");
		assertEquals(admin.getEmail(),"rapha.ADMIN@gmail.com");
	}
	
	@Test
	public void testTesk() {
		User user = ss.findOne("rapha.pse@gmail.com");
		List<Task> tasks = ts.findUserTask(user);
		assertNotNull(tasks);
	}

}
