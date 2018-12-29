package com.link.api.model;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.NumberFormat;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
@Entity
@Table(name="tbl_evento")
public class Evento {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="codigo_evento", length=10)
	private Long id;
	
	@Column(name="novo_convidado", length=50)
	private String nome;
	
	@Column(name="nove_evento", length=30)
	private String nomeEvento;
	
	@Column(name="data")
	@DateTimeFormat(pattern="dd/MM/yyyy")
	private Date dataEvento;
	
	@Column(name="valor", precision=8, scale=2)
	@NumberFormat(pattern="#,##0.00")
	private BigDecimal valorEvento;
	
	
	public Evento(Long id, String nome, String nomeEvento, Date dataEvento, BigDecimal valorEvento) {
		this.id = id;
		this.nome = nome;
		this.nomeEvento = nomeEvento;
		this.dataEvento = dataEvento;
		this.valorEvento = valorEvento;
	}

	public Evento() {
		
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

	public String getNomeEvento() {
		return nomeEvento;
	}

	public void setNomeEvento(String nomeEvento) {
		this.nomeEvento = nomeEvento;
	}

	public Date getDataEvento() {
		return dataEvento;
	}

	public void setDataEvento(Date dataEvento) {
		this.dataEvento = dataEvento;
	}

	public BigDecimal getValorEvento() {
		return valorEvento;
	}

	public void setValorEvento(BigDecimal valorEvento) {
		this.valorEvento = valorEvento;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((dataEvento == null) ? 0 : dataEvento.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		result = prime * result + ((nomeEvento == null) ? 0 : nomeEvento.hashCode());
		result = prime * result + ((valorEvento == null) ? 0 : valorEvento.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Evento other = (Evento) obj;
		if (dataEvento == null) {
			if (other.dataEvento != null)
				return false;
		} else if (!dataEvento.equals(other.dataEvento))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		if (nomeEvento == null) {
			if (other.nomeEvento != null)
				return false;
		} else if (!nomeEvento.equals(other.nomeEvento))
			return false;
		if (valorEvento == null) {
			if (other.valorEvento != null)
				return false;
		} else if (!valorEvento.equals(other.valorEvento))
			return false;
		return true;
	}

}
