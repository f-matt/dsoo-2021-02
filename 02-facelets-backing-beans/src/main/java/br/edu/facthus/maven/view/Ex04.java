package br.edu.facthus.maven.view;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

@Named
@RequestScoped
public class Ex04 {
	
	private String entrada;
	
	private String saida;
	
	public void calculaIdade() {
		// 1. Criar uma data a partir da string dd/mm/yyyy
		DateTimeFormatter formatador = 
				DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate dataNascimento = 
				LocalDate.parse(entrada, formatador);
		
		// 2. Calcular a idade
		LocalDate dataAtual = LocalDate.now();
		long idade = ChronoUnit.YEARS.between(dataNascimento, dataAtual);
		
		// 3. Formatar a saída
		saida = String.format("Você tem %d anos.", idade);
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
