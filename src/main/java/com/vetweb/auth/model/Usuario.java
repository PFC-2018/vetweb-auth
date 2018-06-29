package com.vetweb.auth.model;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

import org.springframework.security.core.userdetails.UserDetails;

@Entity
public class Usuario implements UserDetails {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	private String username;
	
	private String password;
	
	@ManyToMany(fetch = FetchType.EAGER)
	private List<Perfil> perfis = new ArrayList<>();

	public Usuario() {
	}
	
	public Usuario(String username, String password, List<Perfil> perfis) {
		this.username = username;
		this.password = password;
		this.perfis = perfis;
	}

	@Override
	public Collection<Perfil> getAuthorities() {
		return perfis;
	}
	
	public void setAuthorities(List<Perfil> perfis) {
		this.perfis = perfis;
	}

	@Override
	public String getPassword() {
		return password;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String getUsername() {
		return username;
	}
	
	public void setUsername(String username) {
		this.username = username;
	}

	@Override
	public boolean isAccountNonExpired() {
		return true;
	}

	@Override
	public boolean isAccountNonLocked() {
		return true;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		return true;
	}

	@Override
	public boolean isEnabled() {
		return true;
	}

	public List<Perfil> getPerfis() {
		return perfis;
	}

	public void setPerfis(List<Perfil> perfis) {
		this.perfis = perfis;
	}

}
