package com.vetweb.auth.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.vetweb.auth.model.Usuario;

public class UsuarioDAO {

	@PersistenceContext
	private EntityManager entityManager;
	
	public void save(Usuario usuario) {
		entityManager.persist(usuario);
	}
	
	public Usuario update(Usuario usuario) {
		return entityManager.merge(usuario);
	}
	
}
