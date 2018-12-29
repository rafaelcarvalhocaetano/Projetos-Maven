package br.com;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import br.com.model.Contato;
import br.com.repository.ContatoRepository;

@SpringBootApplication
public class ApiContatoApplication implements CommandLineRunner{
	
	@Autowired
	private ContatoRepository cr;

	public static void main(String[] args) {
		SpringApplication.run(ApiContatoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
	
		cr.save(new Contato("Rafael", "33"));
		cr.save(new Contato("Rose", "29"));
		cr.save(new Contato("Vitor", "9"));
		cr.save(new Contato("Heitor", "3"));
	}
}
