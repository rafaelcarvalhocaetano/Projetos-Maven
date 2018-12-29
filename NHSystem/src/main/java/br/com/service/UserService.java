package br.com.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import br.com.model.Role;
import br.com.model.User;
import br.com.repository.UserRepository;

@Service
public class UserService {
	
	
	@Autowired
	private UserRepository userRepository;
	
	
	public void createUser(User user) {
		BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
		
		user.setPassword(encoder.encode(user.getPassword()));
		
		Role userRoles = new Role("USER");
		List<Role> roles = new ArrayList<>();
		roles.add(userRoles);
		user.setRoles(roles);
		userRepository.save(user);
	}
	
	public void createAdmin(User user) {
		BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
		
		user.setPassword(encoder.encode(user.getPassword()));
		
		Role userRoles = new Role("ADMIN");
		List<Role> roles = new ArrayList<>();
		roles.add(userRoles);
		user.setRoles(roles);
		userRepository.save(user);
	}
	
	public User findOne(String email) {
		return userRepository.findByName(email);
	}

	public boolean isUserPresent(String email) {
		User u = userRepository.findByName(email);
		if(u != null) {
			return true;
		}
		return false;
	}

}
