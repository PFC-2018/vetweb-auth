package com.vetweb.auth.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.vetweb.auth.model.Perfil;

public class PerfilDAO {
	
	@PersistenceContext
	private EntityManager entityManager;
	
	public void save(Perfil perfil) {
		entityManager.persist(perfil);
	}
	
	public Perfil update(Perfil perfil) {
		return entityManager.merge(perfil);
	}
	
	public List<Perfil> all() {
		return entityManager
				.createQuery("SELECT p FROM Perfil p", Perfil.class)
				.getResultList();
	}

	public Perfil findByName(String descricao) {
		return entityManager
				.find(Perfil.class, descricao);
	}
	
}
