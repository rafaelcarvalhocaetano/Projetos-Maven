package com.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.api.model.Evento;
import com.api.repository.EventoRepository;

@SpringBootApplication
public class ApiRestfulApplication implements CommandLineRunner{
	
	@Autowired
	private EventoRepository er;

	public static void main(String[] args) {
		SpringApplication.run(ApiRestfulApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		
	}
	
	
	
}
