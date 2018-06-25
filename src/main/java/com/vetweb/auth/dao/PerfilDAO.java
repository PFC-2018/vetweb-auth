package com.vetweb.auth.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.vetweb.auth.model.Perfil;

public class PerfilDAO {
	
	@PersistenceContext
	private EntityManager entityManager;
	
	public void save(Perfil perfil) {
		if (perfil.getPerfilId() == null) {
			entityManager.persist(perfil);
		} else {
			entityManager.merge(perfil);
		}
	}
	
}
