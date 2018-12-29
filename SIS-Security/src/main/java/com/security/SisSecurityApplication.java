package com.security;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SisSecurityApplication {

	public static void main(String[] args) {
		SpringApplication.run(SisSecurityApplication.class, args);
		//System.out.println(new BCryptPasswordEncoder().encode("12345678"));
	}
}
