package com.vetweb.auth.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Permissao implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	public Permissao(String url) {
		this.url = url;
	}
	
	public Permissao() {
	}

	@Id
	private Long id;
	
	private String url;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}
	
	@Override
	public String toString() {
		return url + " ";
	}

}
