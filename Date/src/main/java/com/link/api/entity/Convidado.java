package com.link.api.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.springframework.format.annotation.NumberFormat;

@Entity
@Table(name="tbl_convidado")
public class Convidado {
	
	@Id
	@Column(name="id_convidado")
	@NumberFormat(pattern="##.###.###-##00.000.000-00")
	private String rg;
	
	@Column(name="nome", length=40)
	private String nomeConvidado;
	
	@ManyToOne
	private Evento evento;	

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	public String getNomeConvidado() {
		return nomeConvidado;
	}

	public void setNomeConvidado(String nomeConvidado) {
		this.nomeConvidado = nomeConvidado;
	}

	public Evento getEvento() {
		return evento;
	}

	public void setEvento(Evento evento) {
		this.evento = evento;
	}
	
	

}
