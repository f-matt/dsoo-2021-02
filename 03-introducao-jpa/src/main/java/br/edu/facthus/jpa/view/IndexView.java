package br.edu.facthus.jpa.view;

import javax.enterprise.context.RequestScoped;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.inject.Inject;
import javax.inject.Named;

import br.edu.facthus.jpa.bean.ContatosBean;
import br.edu.facthus.jpa.entity.Contato;

@Named
@RequestScoped
public class IndexView {
	
	@Inject
	private ContatosBean contatosBean;
	
	private Contato contato = new Contato();
	
	public void cadastra() {
		contatosBean.cadastra(contato);
		FacesContext.getCurrentInstance().addMessage(null, 
				new FacesMessage("Contato cadastrado com sucesso!"));
	}
	
	public void lista() {
		contatosBean.lista();
	}

	/*
	 * Auto-generated
	 */
	public Contato getContato() {
		return contato;
	}

	public void setContato(Contato contato) {
		this.contato = contato;
	}
		
}
