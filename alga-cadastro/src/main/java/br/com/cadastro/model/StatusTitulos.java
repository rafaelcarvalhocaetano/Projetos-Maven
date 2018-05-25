package br.com.cadastro.model;

public enum StatusTitulos {
	
	
	PENDENTE("Pendente"),
	RECEBIDO("Recebido");
	
	public  String descricao;
	
	private StatusTitulos(String descricao) {
		this.descricao = descricao;
	}
	
	public String getDescricao() {
		return descricao;
	}

}
