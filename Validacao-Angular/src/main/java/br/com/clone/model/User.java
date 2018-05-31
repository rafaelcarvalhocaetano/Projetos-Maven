package br.com.clone.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

@Entity
@Table(name="usuario")
public class User {
	
	
	@Id
	@Column(name="email_user", length=70)
	@Email(message="Por favor, entre com um email valido")
	@NotBlank(message="Entre com o email")
	private String email;
		
	@Column(name="nome_usuario", length=120)
	@NotBlank(message="Entre com seu nome")
	private String nome;
	
	@Column(name="senha_user")
	@NotBlank(message="Informar sua senha")
	@Size(min=4, max=120, message="Senha menor ou maior que o permitido")
	private String senha;
	
	@Column(name="ano_user", length=10)
	@NotBlank(message="Informe o ano de nascimento")
	@Size(min=2, max=10)
	@Pattern(regexp="[\\d]{2}", message="Data de nascimento invalida")
	private String ano;
	
	@Column(name="telefone_user")
	@NotBlank(message="Informar seu telefone")
	@Pattern(regexp="[\\d] {7}", message="Número de telefone invalido")
	private String telefone;

	

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getAno() {
		return ano;
	}

	public void setAno(String ano) {
		this.ano = ano;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public User() {
		// TODO Auto-generated constructor stub
	}

	public User(
			@Email(message = "Por favor, entre com um email valido") @NotBlank(message = "Entre com o email") String email,
			@NotBlank(message = "Entre com seu nome") String nome,
			@NotBlank(message = "Informar sua senha") @Size(min = 4, max = 120, message = "Senha menor ou maior que o permitido") String senha,
			@NotBlank(message = "Informe o ano de nascimento") @Size(min = 4, max = 10) @Pattern(regexp = "[\\d]{2}", message = "Data de nascimento invalida") String ano,
			@NotBlank(message = "Informar seu telefone") @Size(min = 10, max = 10, message = "Telefone menor ou maior que o permitido") @Pattern(regexp = "[\\d] {7}", message = "Número de telefone invalido") String telefone) {
		super();
		this.email = email;
		this.nome = nome;
		this.senha = senha;
		this.ano = ano;
		this.telefone = telefone;
	}

	

	
}
