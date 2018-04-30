package io.apolice.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Apolice {
	
	
	@Id
	@GeneratedValue
	private Long id;
	
	@OneToMany
	private List<Cliente> cliente;
	
	private String codigo;
	private String dataInicio;
	private String dataFim;
	private String valor;
	private String status;
	
	
	public Apolice() {
		// TODO Auto-generated constructor stub
	}
	
	

	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	
	public List<Cliente> getCliente() {
		return cliente;
	}



	public void setCliente(List<Cliente> cliente) {
		this.cliente = cliente;
	}



	public Apolice(Long id, List<Cliente> cliente, String codigo, String dataInicio, String dataFim, String valor,
			String status) {
		super();
		this.id = id;
		this.cliente = cliente;
		this.codigo = codigo;
		this.dataInicio = dataInicio;
		this.dataFim = dataFim;
		this.valor = valor;
		this.status = status;
	}



	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public String getDataInicio() {
		return dataInicio;
	}
	public void setDataInicio(String dataInicio) {
		this.dataInicio = dataInicio;
	}
	public String getDataFim() {
		return dataFim;
	}
	public void setDataFim(String dataFim) {
		this.dataFim = dataFim;
	}
	public String getValor() {
		return valor;
	}
	public void setValor(String valor) {
		this.valor = valor;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
	
	
	
	
	
	
	
	
	

}
