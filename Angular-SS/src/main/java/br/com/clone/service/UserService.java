package br.com.clone.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import br.com.clone.model.Roles;
import br.com.clone.model.User;
import br.com.clone.repository.UserRepository;

@Service
public class UserService {
	
	@Autowired
	private UserRepository ss;
	
	
	public void createUser(User user) {
		BCryptPasswordEncoder encode = new BCryptPasswordEncoder();
	
		user.setSenha(encode.encode(user.getSenha()));
		Roles userRole = new Roles("USER");
		List<Roles> roles = new ArrayList<>();
		roles.add(userRole);
		user.setRoles(roles);
		ss.save(user);
	}
	
	public void createAdmin(User user) {
		BCryptPasswordEncoder encode = new BCryptPasswordEncoder();
	
		user.setSenha(encode.encode(user.getSenha()));
		Roles userRole = new Roles("ADMIN");
		List<Roles> roles = new ArrayList<>();
		roles.add(userRole);
		user.setRoles(roles);
		ss.save(user);
	}
	public User findOne(String email) {
		return ss.findByEmail(email);
	}

	public boolean isUserPreset(String email) {
		
		User user = ss.findByEmail(email);
		
		if(user != null)
			return true;
		
		return false;
	}
	
	

}
