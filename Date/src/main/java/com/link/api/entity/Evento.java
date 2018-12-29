package com.link.api.entity;


import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.NumberFormat;

@Entity
@Table(name="table_evento")
public class Evento {

	
	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	@Column(name="codigo", length=100)
	private long id;

	@Column(name="nome_user", length=70)
	private String nome;
	
	@Column(name="local_evento", length=80)
	private String local;
	
	@Column(name="data_evento")
	@DateTimeFormat(pattern="dd/MM/yyyy")
	@Temporal(TemporalType.TIMESTAMP)
	private Date data;
	
	@Column(name="horario_evento")
	@NumberFormat(pattern="##:##00:00")
	private String horario;

	@OneToMany
	private List<Convidado> convidados;
	

	public long getId() {
		return id;
	}


	public void setId(long id) {
		this.id = id;
	}


	public Date getData() {
		return data;
	}


	public void setData(Date data) {
		this.data = data;
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


	public String getHorario() {
		return horario;
	}


	public void setHorario(String horario) {
		this.horario = horario;
	}


	
	

}
