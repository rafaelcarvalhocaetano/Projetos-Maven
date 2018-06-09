package br.com.clone.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Roles {

	@Id
	private String nome;
	
	@ManyToMany(mappedBy="roles")
	private List<User> users;
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public List<User> getUsers() {
		return users;
	}
	public void setUsers(List<User> users) {
		this.users = users;
	}
	public Roles(String nome, List<User> users) {
		
		this.nome = nome;
		this.users = users;
	}
	public Roles(String nome) {
		
		this.nome = nome;
	}
	public Roles() {
		
	}
	
	
	
}
