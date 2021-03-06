package br.edu.facthus.jpa.bean;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import br.edu.facthus.jpa.entity.Contato;

@Stateless
public class ContatosBean {
	
	@PersistenceContext
	private EntityManager entityManager;
	
	public void cadastra(Contato contato) {
		entityManager.persist(contato);
	}
	
	public void lista() {
		List<Contato> contatos =  entityManager
				.createQuery("SELECT c FROM Contato c", Contato.class)
				.getResultList();
		
		for (Contato c : contatos)
			System.out.println(c.getNome());
	}

}
