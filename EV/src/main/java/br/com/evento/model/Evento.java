package br.com.evento.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tbl_evento")
public class Evento {

	

	@Id
	@GeneratedValue
	private Long id;
	
	private String nome;
	private String evento;
	private String data;
	private String valor;
	
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
	public String getEvento() {
		return evento;
	}
	public void setEvento(String evento) {
		this.evento = evento;
	}
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
	public String getValor() {
		return valor;
	}
	public void setValor(String valor) {
		this.valor = valor;
	}
	
	
	
	
	

}

/**
 * 
 * 
 * @Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name = "codigo_evento", length = 10)
	private Long id;

	@Column(name = "nome", length = 50)
	private String nome;

	@Column(name = "evento", length = 30)
	private String evento;

	@Column(name = "data")
	@Temporal(TemporalType.TIMESTAMP)
	@DateTimeFormat(pattern = "dd/MM/yyyy")
	private Date data;

	@Column(name = "valor", precision = 8, scale = 2)
	@NumberFormat(pattern = "#,##0.00")
	private BigDecimal valor;

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

	public String getEvento() {
		return evento;
	}

	public void setEvento(String evento) {
		this.evento = evento;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public BigDecimal getValor() {
		return valor;
	}

	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}

	public Evento(Long id, String nome, String evento, Date data, BigDecimal valor) {
		super();
		this.id = id;
		this.nome = nome;
		this.evento = evento;
		this.data = data;
		this.valor = valor;
	}

	public Evento() {
	}*/

