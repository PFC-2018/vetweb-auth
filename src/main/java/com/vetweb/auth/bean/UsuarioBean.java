package com.vetweb.auth.bean;

import java.util.ArrayList;
import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;
import javax.transaction.Transactional;

import com.vetweb.auth.dao.PerfilDAO;
import com.vetweb.auth.dao.UsuarioDAO;
import com.vetweb.auth.model.Perfil;
import com.vetweb.auth.model.Usuario;

@Named
@RequestScoped
public class UsuarioBean {
	
	@Inject
	private UsuarioDAO usuarioDAO;
	
	@Inject
	private PerfilDAO perfilDAO;
	
	private Usuario usuario = new Usuario();
	
	private List<String> perfis = new ArrayList<>();
	
	@Transactional
	public void save() {
		System.out.println("save()");
		perfis
			.forEach(p -> usuario.getPerfis().add(perfilDAO.findByName(p)));
		usuarioDAO.save(usuario);
	}
	
	public Usuario getUsuario() {
		return usuario;
	}
	
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public List<String> getPerfis() {
		return perfis;
	}

	public void setPerfis(List<String> perfis) {
		this.perfis = perfis;
	}

}
