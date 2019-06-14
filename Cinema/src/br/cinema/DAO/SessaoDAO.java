package br.cinema.DAO;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.apache.log4j.Logger;

import br.cinema.model.Sessao;

public class SessaoDAO {
	public static Logger log = Logger.getLogger(SessaoDAO.class);
	protected EntityManager em;

	public SessaoDAO() {
		em = getEntityManager();
	}

	private EntityManager getEntityManager() {
		em = getEntityManager();
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("Cinema");
		if (em == null) {
			log.info("Criando conexao");
			em = factory.createEntityManager();
		}
		return em;
	}

	public void save(Sessao sessao) {
		log.info("Salvando Sessão");
		try {
			em.getTransaction().begin();
			em.persist(sessao);
			em.getTransaction().commit();
		} catch (Exception e) {
			// TODO: handle exception
			log.error("Erro ao salvar o sessão" + e.getMessage());
		} finally {
			em.close();
		}
	}

	public void atualizar(Sessao sessao) {
		em.getTransaction().begin();
		em.merge(sessao);
		em.getTransaction().commit();
	}

	public Sessao getById(final int id) {
		return em.find(Sessao.class, id);
	}
	
	public void remover(Sessao sessao) {
		em.getTransaction().begin();
		Sessao cliRemover = getById(sessao.getId());
		em.remove(cliRemover);
		em.getTransaction().commit();
	}
	public List<Sessao> getAll(){
		return em.createQuery("FROM" + Sessao.class.getName()).getResultList();
		
	}

}
