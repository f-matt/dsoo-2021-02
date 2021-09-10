package br.edu.facthus.maven.view;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

@Named
@RequestScoped
public class Ex03 {
	
	private String entrada;
	
	private String saida;
	
	public void contaCaracteres() {
		saida = String.format("A string %s contém %d caracteres.",
				entrada, entrada.length());
	}

	/*
	 * Auto-generated 
	 */
	public String getEntrada() {
		return entrada;
	}

	public void setEntrada(String entrada) {
		this.entrada = entrada;
	}

	public String getSaida() {
		return saida;
	}

	public void setSaida(String saida) {
		this.saida = saida;
	}
	
}
