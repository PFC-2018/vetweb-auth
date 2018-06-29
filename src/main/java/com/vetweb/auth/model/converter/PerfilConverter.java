package com.vetweb.auth.model.converter;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.inject.Inject;
import javax.inject.Named;

import com.vetweb.auth.dao.PerfilDAO;
import com.vetweb.auth.model.Perfil;

@Named
public class PerfilConverter implements Converter {

	@Inject
	private PerfilDAO perfilDAO;
	
	@Override
	public Object getAsObject(FacesContext context, UIComponent component, String value) {
		return value == null? 
				null :
					perfilDAO.findByName(value);
	}

	@Override
	public String getAsString(FacesContext context, UIComponent component, Object value) {
		if (value != null) {
			Perfil perfil = (Perfil)value;
			return perfil.getDescricao();
		}
		return null;
	}

}
