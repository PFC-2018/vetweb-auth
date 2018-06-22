package com.vetweb.auth.model;

import javax.persistence.Entity;
import javax.persistence.Id;

import org.springframework.security.core.GrantedAuthority;

@Entity
public class Perfil implements GrantedAuthority {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	private String descricao;

	@Override
	public String getAuthority() {
		return descricao;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String perfil) {
		this.descricao = perfil;
	}

}
