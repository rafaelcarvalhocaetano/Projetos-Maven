package br.com.cadastro.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Service;

import br.com.cadastro.model.StatusTitulos;
import br.com.cadastro.model.Titulo;
import br.com.cadastro.repository.TituloRepository;

@Service
public class CadastroService {
	
	@Autowired
	private TituloRepository tr;
	
	
	public void salvar(Titulo titulo) {
		try {
			tr.save(titulo);
		} catch (DataIntegrityViolationException e) {
			throw new IllegalArgumentException("Formato inválido");
		}
		
	}


	public void deletar(Long id) {
		try {
			tr.deleteById(id);		
		} catch (Exception e) {
			System.out.println("Erro ao tentar excluir");
		}
		
	}


	public String receber(Long codigo) {
		Titulo titulo = tr.findByCodigo(codigo);
		titulo.setStatus(StatusTitulos.RECEBIDO);
		tr.save(titulo);
		
		return StatusTitulos.RECEBIDO.getDescricao();
	}

}
