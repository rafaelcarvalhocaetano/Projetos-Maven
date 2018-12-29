package com.security.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.security.model.Role;
import com.security.model.User;
import com.security.repository.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository userRepository;
	
	
	public void createUSER(User user) {
		BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
		user.setPassword(encoder.encode(user.getPassword()));
		
		Role userRole = new Role("USER");
		List<Role> roles = new ArrayList<>();
		roles.add(userRole);
		user.setRoles(roles);
		userRepository.save(user);
	}
	
	public void createADMIN(User user) {
		BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
		//setando a senha para o admin
		user.setPassword(encoder.encode(user.getPassword()));
		
		Role adminRole = new Role("ADMIN");
		List<Role> roles = new ArrayList<>();
		roles.add(adminRole);
		user.setRoles(roles);
		userRepository.save(user);		
	}
	
	public User findOne(String email) {
		return userRepository.findOne(email);
	}
}
