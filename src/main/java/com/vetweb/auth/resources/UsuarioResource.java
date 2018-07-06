package com.vetweb.auth.resources;

import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.jboss.resteasy.annotations.providers.jaxb.Wrapped;

import com.vetweb.auth.dao.UsuarioDAO;
import com.vetweb.auth.model.Usuario;

@RequestScoped
@Path("usuarios")
@Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
//http://localhost:8080/vetweb-auth/service/usuarios/all
public class UsuarioResource {
	
	@Inject
	private UsuarioDAO usuarioDAO;
	
	@GET
	@Path("all")
	@Wrapped(element = "usuarios")
	public List<Usuario> findAll() {
		return usuarioDAO.all();
	}
}
