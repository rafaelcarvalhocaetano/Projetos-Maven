package io.apolice.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Cliente {
	
	
	@Id
	@GeneratedValue
	private Long codigo;
	private String nome;
	private String cpf;
	
	@ManyToOne
	private Apolice apolice;
	
	public Cliente() {
		// TODO Auto-generated constructor stub
	}
	

	public Cliente(Long codigo, String nome, String cpf, Apolice apolice) {
		super();
		this.codigo = codigo;
		this.nome = nome;
		this.cpf = cpf;
		this.apolice = apolice;
	}


	public Long getCodigo() {
		return codigo;
	}

	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public Apolice getApolice() {
		return apolice;
	}

	public void setApolice(Apolice apolice) {
		this.apolice = apolice;
	}
	
	
}
