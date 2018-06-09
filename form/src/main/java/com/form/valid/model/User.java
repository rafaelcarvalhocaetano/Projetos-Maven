package com.form.valid.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

@Entity
@Table(name="table_usuario")
public class User {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	@NotBlank(message="Informe seu nome")
	@Column(name="nome", length=120)
	private String nome;
	
	@NotBlank(message="Informe seu sobre nome")
	private String sobreNome;
	
	@Email(message="Email invalido")
	private String email;
	
	@NotBlank(message="Informe seu cpf")
	private String cpf;
	
	@OneToMany
	private List<Evento> eventos;
	
	
	public User() {
		// TODO Auto-generated constructor stub
	}

	
	public User(Long id, @NotBlank(message = "Informe seu nome") String nome,
			@NotBlank(message = "Informe seu sobre nome") String sobreNome,
			@Email(message = "Email invalido") String email, @NotBlank(message = "Informe seu cpf") String cpf) {
		
		this.id = id;
		this.nome = nome;
		this.sobreNome = sobreNome;
		this.email = email;
		this.cpf = cpf;
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

	public String getSobreNome() {
		return sobreNome;
	}

	public void setSobreNome(String sobreNome) {
		this.sobreNome = sobreNome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	
	
	

}
