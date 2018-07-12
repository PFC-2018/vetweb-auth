package com.vetweb.auth.bean;

import java.util.ArrayList;
import java.util.List;

import javax.enterprise.inject.Model;

import org.primefaces.model.DualListModel;

import com.vetweb.auth.model.Permissao;

@Model
public class PermissoesBean {
	
	private DualListModel<Permissao> dualListPermissao = new DualListModel<>();
	
	private List<Permissao> disponiveis = new ArrayList<>();
	
	private List<Permissao> atribuidas = new ArrayList<>();

	public DualListModel<Permissao> getDualListPermissao() {
		return dualListPermissao;
	}

	public void setDualListPermissao(DualListModel<Permissao> dualListPermissao) {
		this.dualListPermissao = new DualListModel<>(disponiveis, atribuidas);
	}

	public List<Permissao> getDisponiveis() {
		return disponiveis;
	}

	public void setDisponiveis(List<Permissao> disponiveis) {
		this.disponiveis = disponiveis;
	}

	public List<Permissao> getAtribuidas() {
		return atribuidas;
	}

	public void setAtribuidas(List<Permissao> atribuidas) {
		this.atribuidas = atribuidas;
	}

}
