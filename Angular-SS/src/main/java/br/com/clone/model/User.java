package br.com.clone.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

@Entity
public class User {
	
	@Id
	@Email
	@NotEmpty
	@Column(unique=true)
	private String email;
	
	@NotEmpty
	private String nome;
	@Size(min=4)
	private String senha;
	
	@OneToMany(mappedBy="user", cascade=CascadeType.ALL)
	private List<Task> task;
	@ManyToMany(cascade=CascadeType.ALL)
	@JoinTable(name="USER_ROLES", joinColumns= {
			@JoinColumn(name="USER_EMAIL", referencedColumnName="email")
	}, inverseJoinColumns= {
			@JoinColumn(name="ROLES_NOME", referencedColumnName="nome")
	})
	private List<Roles> roles;
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public List<Task> getTask() {
		return task;
	}
	public void setTask(List<Task> task) {
		this.task = task;
	}
	public List<Roles> getRoles() {
		return roles;
	}
	public void setRoles(List<Roles> roles) {
		this.roles = roles;
	}
	public User(String email, String nome, String senha) {
		this.email = email;
		this.nome = nome;
		this.senha = senha;
	}
	public User() {
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	
	

}
