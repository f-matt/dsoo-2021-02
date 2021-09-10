package br.edu.facthus.maven.view;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

@Named
@RequestScoped
public class Ex02 {
	
	private Integer n1;
	
	private Integer n2;
	
	private String resultado;
	
	public void soma() {
		resultado = String.format("%d + %d = %d",
				n1, n2, n1 + n2);
	}
	
	public void subtracao() {
		resultado = String.format("%d - %d = %d",
				n1, n2, n1 - n2);
	}
	
	public void multiplicacao() {
		resultado = String.format("%d * %d = %d",
				n1, n2, n1 * n2);
	}
	
	public void divisao() {
		resultado = String.format("%d / %d = %.4f",
				n1, n2, Double.valueOf(n1) / n2);
	}
	
	/*
	 * Auto-generated 
	 */
	public Integer getN1() {
		return n1;
	}

	public void setN1(Integer n1) {
		this.n1 = n1;
	}

	public Integer getN2() {
		return n2;
	}

	public void setN2(Integer n2) {
		this.n2 = n2;
	}

	public String getResultado() {
		return resultado;
	}

	public void setResultado(String resultado) {
		this.resultado = resultado;
	}

}
