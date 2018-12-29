package com.form.valid.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

@Entity
@Table(name="table_evento")
public class Evento {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	@NotBlank(message="Nome do evento é obrigatório")
	private String nome;
	@NotBlank(message="Local do evento é obrigatório")
	private String local;
	@NotBlank(message="Data do evento é obrigatório")
	private String data;
	@NotBlank(message="Horario do evento é obrigatório")
	private String horario;
	
	@ManyToOne
	private User user;
	
	
	public Evento() {

	}
	
	public Evento(Long id, String nome, String local, String data, String horario) {

		this.id = id;
		this.nome = nome;
		this.local = local;
		this.data = data;
		this.horario = horario;
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
	public String getLocal() {
		return local;
	}
	public void setLocal(String local) {
		this.local = local;
	}
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
	public String getHorario() {
		return horario;
	}
	public void setHorario(String horario) {
		this.horario = horario;
	}
	

	
	

}
