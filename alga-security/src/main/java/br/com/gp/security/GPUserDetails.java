package br.com.gp.security;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.file.attribute.UserDefinedFileAttributeView;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

public class GPUserDetails implements UserDetailsService, UserDefinedFileAttributeView {

	
	private String nome;
	private String login;
	private String senha;
	private boolean ativo;
	private Collection<GrantedAuthority> permissoes = new ArrayList<>();
	
	
	
	
	public GPUserDetails(String nome, String login, String senha, boolean ativo,
			Collection<GrantedAuthority> permissoes) {
	
		this.nome = nome;
		this.login = login;
		this.senha = senha;
		this.ativo = ativo;
		this.permissoes = permissoes;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public boolean isAtivo() {
		return ativo;
	}

	public void setAtivo(boolean ativo) {
		this.ativo = ativo;
	}

	public Collection<GrantedAuthority> getPermissoes() {
		return permissoes;
	}

	public void setPermissoes(Collection<GrantedAuthority> permissoes) {
		this.permissoes = permissoes;
	}

	@Override
	public void delete(String arg0) throws IOException {
		// TODO Auto-generated method stub

	}

	@Override
	public List<String> list() throws IOException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String name() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int read(String arg0, ByteBuffer arg1) throws IOException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int size(String arg0) throws IOException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int write(String arg0, ByteBuffer arg1) throws IOException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public UserDetails loadUserByUsername(String arg0) throws UsernameNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

}
