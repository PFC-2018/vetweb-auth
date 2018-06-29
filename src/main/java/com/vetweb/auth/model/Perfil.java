package com.vetweb.auth.model;

import javax.persistence.Entity;
import javax.persistence.Id;

import org.springframework.security.core.GrantedAuthority;

@Entity
public class Perfil implements GrantedAuthority {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	private String descricao;

	public Perfil() {
	}
	
	public Perfil(String descricao) {
		this.descricao = descricao;
	}

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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((descricao == null) ? 0 : descricao.hashCode());
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
		Perfil other = (Perfil) obj;
		if (descricao == null) {
			if (other.descricao != null)
				return false;
		} else if (!descricao.equals(other.descricao))
			return false;
		return true;
	}

}
