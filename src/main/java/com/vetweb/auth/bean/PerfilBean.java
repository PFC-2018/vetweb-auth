package com.vetweb.auth.bean;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;
import javax.transaction.Transactional;

import com.vetweb.auth.dao.PerfilDAO;
import com.vetweb.auth.model.Perfil;

@Named(value = "beanPerfil")
@RequestScoped
public class PerfilBean {
	
	private Perfil perfil = new Perfil();
	
	@Inject
	private PerfilDAO perfilDAO;
	
	@Transactional
	public void save() {
		perfilDAO.save(perfil);
	}

	public Perfil getPerfil() {
		return perfil;
	}

	public void setPerfil(Perfil perfil) {
		this.perfil = perfil;
	}
	
}
