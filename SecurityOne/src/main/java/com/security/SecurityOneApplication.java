package com.security;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SecurityOneApplication {

	public static void main(String[] args) {
		SpringApplication.run(SecurityOneApplication.class, args);
		
		//System.out.println(new BCryptPasswordEncoder().encode("123"));
	}
}
