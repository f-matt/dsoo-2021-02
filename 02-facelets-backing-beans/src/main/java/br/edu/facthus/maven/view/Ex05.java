package br.edu.facthus.maven.view;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

@Named
@RequestScoped
public class Ex05 {
	
	private String entrada;
	
	private String saida;
	
	public void validaEmail() {
		// 1. Cria o padrão de validação
		String regex = "^[A-Za-z0-9+_.-]+@(.+)$";
		Pattern pattern = Pattern.compile(regex);
		
		// 2. Verifica se o email segue o padrão
		Matcher matcher = pattern.matcher(entrada);
		
		// 3. Formata a saída
		if (matcher.matches())
			saida = "Email válido!";
		else
			saida = "Email inválido...";
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
