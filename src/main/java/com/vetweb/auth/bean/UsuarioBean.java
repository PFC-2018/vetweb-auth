package com.vetweb.auth.bean;

import java.util.ArrayList;
import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;
import javax.transaction.Transactional;

import com.vetweb.auth.dao.UsuarioDAO;
import com.vetweb.auth.model.Perfil;
import com.vetweb.auth.model.Usuario;

@Named
@RequestScoped
public class UsuarioBean {
	
	@Inject
	private UsuarioDAO usuarioDAO;
	
	private Usuario usuario = new Usuario();
	
	private List<Perfil> perfis = new ArrayList<>();
	
	@Transactional
	public void save() {
		System.out.println("save()");
		usuarioDAO.save(usuario);
	}
	
	public Usuario getUsuario() {
		return usuario;
	}
	
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public List<Perfil> getPerfis() {
		return perfis;
	}

	public void setPerfis(List<Perfil> perfis) {
		this.perfis = perfis;
	}

}
