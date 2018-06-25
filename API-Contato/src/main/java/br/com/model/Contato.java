package br.com.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Size;

@Entity
public class Contato {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	@Size(min=4, max=120)
	private String nome;
	@Size(min=1, max=3)
	private String idade;
	
	public Contato() {
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	public Contato(@Size(min = 4, max = 120) String nome, @Size(min = 1, max = 3) String idade) {
		
		this.nome = nome;
		this.idade = idade;
	}




	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getIdade() {
		return idade;
	}
	public void setIdade(String idade) {
		this.idade = idade;
	}
	
	

}
