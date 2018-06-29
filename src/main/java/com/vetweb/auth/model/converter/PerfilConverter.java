package com.vetweb.auth.model.converter;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;

import com.vetweb.auth.dao.PerfilDAO;
import com.vetweb.auth.model.Perfil;

@FacesConverter("perfilConverter")
public class PerfilConverter implements Converter {

	private PerfilDAO perfilDAO = new PerfilDAO();
	
	@Override
	public Object getAsObject(FacesContext context, UIComponent component, String value) {
		if(value == null || value.trim().isEmpty()) return null;
		System.out.println("getAsObject" + value);
		Perfil perfil = new Perfil();
		perfil.setDescricao(value);
		return perfil;
	}

	@Override
	public String getAsString(FacesContext context, UIComponent component, Object value) {
		if(value == null) return null;
		System.out.println("getAsString" + value);
		Perfil perfil = (Perfil)value;
		return perfil.getDescricao();
	}

}
