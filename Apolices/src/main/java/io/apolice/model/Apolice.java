package io.apolice.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Apolice {
	
	
	@Id
	@GeneratedValue
	private Long codigo;
	private String nome;
	private String numeroApolice;
	private String cpf;
	private String rua;
	private String cidade;
	private String estado;
	
	public Apolice() {
		// TODO Auto-generated constructor stub
	}
	public Apolice(String nome, String numeroApolice, String cpf, String rua, String cidade, String estado) {
		this.nome = nome;
		this.numeroApolice = numeroApolice;
		this.cpf = cpf;
		this.rua = rua;
		this.cidade = cidade;
		this.estado = estado;
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
	public String getNumeroApolice() {
		return numeroApolice;
	}
	public void setNumeroApolice(String numeroApolice) {
		this.numeroApolice = numeroApolice;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getRua() {
		return rua;
	}
	public void setRua(String rua) {
		this.rua = rua;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	
	
	

}
