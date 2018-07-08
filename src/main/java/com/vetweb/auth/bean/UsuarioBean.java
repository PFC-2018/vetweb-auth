package com.vetweb.auth.bean;

import java.io.IOException;

import javax.enterprise.inject.Model;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.inject.Inject;
import javax.servlet.http.Part;
import javax.transaction.Transactional;

import com.vetweb.auth.dao.UsuarioDAO;
import com.vetweb.auth.model.Usuario;
import com.vetweb.auth.service.EmailSender;

@Model
public class UsuarioBean {
	
	@Inject
	private UsuarioDAO usuarioDAO;
	
	private Part fotoUsuario;
	
	@Inject
	private FacesContext context;
	
	@Inject
	private EmailSender emailSender;
	
	private Usuario usuario = new Usuario();
	
	@Transactional
	public String save() {
		messageFlash();
		String caminhoFoto = "/tmp/" + fotoUsuario.getSubmittedFileName();
		try {
			fotoUsuario.write(caminhoFoto);
		} catch (IOException e) {
			context
				.addMessage(null, new FacesMessage("ERRO AO SALVAR O ARQUIVO COM A FOTO DO USUÁRIO"));
		}
		usuario.setCaminhoFoto(caminhoFoto);
		usuarioDAO.save(usuario);
		context
			.addMessage(null, new FacesMessage("USUÁRIO INCLUÍDO COM SUCESSO	"));
		emailSender.send("springbootalura@gmail.com", usuario.getEmail(), "INCLUSÃO DE USUÁRIO NA VETWEB",
				"SEU USUÁRIO PARA ACESSO A VETWEB FOI CRIADO, SEU USERNAME É " + usuario.getUsername() + " E SEU PASSWORD É " + usuario.getPassword());
		return "/usuarios/usuarios?faces-redirect=true";
	}

	private void messageFlash() {
		context
			.getExternalContext()
			.getFlash()
			.setKeepMessages(true);
	}	
	
	public Usuario getUsuario() {
		return usuario;
	}
	
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public Part getFotoUsuario() {
		return fotoUsuario;
	}

	public void setFotoUsuario(Part fotoUsuario) {
		this.fotoUsuario = fotoUsuario;
	}

}
