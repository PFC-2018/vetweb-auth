package com.vetweb.auth.bean;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

import com.vetweb.auth.model.Perfil;

@Named(value = "beanPerfil")
@RequestScoped
public class PerfilBean {
	
	private Perfil perfil = new Perfil();
	
	public void save() {
		System.out.println(perfil);
	}

	public Perfil getPerfil() {
		return perfil;
	}

	public void setPerfil(Perfil perfil) {
		this.perfil = perfil;
	}
	
}
