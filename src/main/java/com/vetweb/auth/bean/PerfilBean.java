package com.vetweb.auth.bean;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.inject.Inject;
import javax.inject.Named;
import javax.transaction.Transactional;

import org.primefaces.model.DualListModel;

import com.vetweb.auth.dao.PerfilDAO;
import com.vetweb.auth.model.Perfil;

@Named(value = "beanPerfil")
@RequestScoped
public class PerfilBean {
	
	private Perfil perfil = new Perfil();
	
	private List<Perfil> all = new ArrayList<>();
	
	@Inject
	private PerfilDAO perfilDAO;
	
	@Inject
	private FacesContext context;
	
	private DualListModel<Perfil> dualListPerfil = new DualListModel<>(Arrays.asList(new Perfil("Teste")), Arrays.asList(new Perfil("Outro teste")));
	
	@Transactional
	public String save() {
		perfilDAO.save(perfil);
		messageFlash();
		context
			.addMessage(null, new FacesMessage("PERFIL INCLUÍDO COM SUCESSO	"));
		return "/perfis/perfis?faces-redirect=true";
	}

	private void messageFlash() {
		context
			.getExternalContext()
			.getFlash()
			.setKeepMessages(true);
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

	public DualListModel<Perfil> getDualListPerfil() {
		return dualListPerfil;
	}

	public void setDualListPerfil(DualListModel<Perfil> dualListPerfil) {
		this.dualListPerfil = dualListPerfil;
	}
	
}
