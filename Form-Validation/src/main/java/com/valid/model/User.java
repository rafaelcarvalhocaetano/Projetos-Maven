package com.valid.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

@Entity
public class User {
	
	@Id
	@Email(message="Por favor informar um e-mail valido")
	@NotBlank(message="Por favor entre com um e-mail")
	private String email;
	
	@NotBlank(message="Por favor entre com um nome")
	@Size(min=2, message="Nome muito pequeno")
	private String name;
	
	@NotBlank(message="Por favor entre com sua senha")
	@Size(min=4, message="Senha Pequena")
	private String password;
	
	@NotBlank(message="Por favor entre com o ano")
	@Pattern(regexp="[\\d]{2}", message="Valor invalido")
	private String age;
	
	@NotBlank(message="Por favor entre com o ano")
	@Pattern(regexp="[\\d]{7}", message="Informe um telefone valido")
	private String phone;
	
	public User() {
		// TODO Auto-generated constructor stub
	}
	
	public User(String email, String name, String password, String age, String phone) {
	
		this.email = email;
		this.name = name;
		this.password = password;
		this.age = age;
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	
	

}
