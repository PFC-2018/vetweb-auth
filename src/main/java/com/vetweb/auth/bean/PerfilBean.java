package com.vetweb.auth.bean;

import java.util.ArrayList;
import java.util.List;

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
	
	private List<Perfil> all = new ArrayList<>();
	
	@Inject
	private PerfilDAO perfilDAO;
	
	@Transactional
	public String save() {
		perfilDAO.save(perfil);
		return "/usuarios/cadastroUsuario?faces-redirect=true";
	}
	
	public List<Perfil> getAll() {
		all = perfilDAO.all(); 
		return all;
	}

	public Perfil getPerfil() {
		return perfil;
	}

	public void setPerfil(Perfil perfil) {
		this.perfil = perfil;
	}
	
}
