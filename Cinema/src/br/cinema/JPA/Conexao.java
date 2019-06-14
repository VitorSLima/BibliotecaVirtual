package br.cinema.JPA;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Conexao {
	
	
	private EntityManager em = null;
	final EntityManagerFactory emf = Persistence.createEntityManagerFactory("Cinema");

//-----------------------------------------------------------------
	public Conexao() {
		if (em == null) {
		   em = emf.createEntityManager();
		}else {
			getEntity();
		}
	}

//-----------------------------------------------------------------
	public EntityManagerFactory getEntity() {
		return emf;
	}

//-----------------------------------------------------------------
	public void closeEMF() {
		emf.close();
	}
}
