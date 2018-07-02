package com.vetweb.auth.dao;

import java.util.List;

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
	
	public List<Usuario> all() {
		return entityManager
				.createQuery("SELECT DISTINCT(u) FROM Usuario u JOIN FETCH u.perfis p", Usuario.class)
				.getResultList();
	}

	public Usuario findById(String id) {
		return entityManager.find(Usuario.class, id);
	}
	
}
