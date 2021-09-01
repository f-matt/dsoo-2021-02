package br.edu.facthus.maven.view;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

@Named
@RequestScoped
public class IndexView {
	
	private String texto = "Olá facelets!";
	
	public String getTexto() {
		return texto;
	}

}
