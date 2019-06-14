package br.cinema.DAO;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.apache.log4j.Logger;

import br.cinema.model.Filme;

public class FilmeDAO {
	public static Logger log = Logger.getLogger(FilmeDAO.class);
	protected EntityManager em;

	public FilmeDAO() {
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

	public void save(Filme filme) {
		log.info("Salvando Filme");
		try {
			em.getTransaction().begin();
			em.persist(filme);
			em.getTransaction().commit();
		} catch (Exception e) {
			// TODO: handle exception
			log.error("Erro ao salvar o filme" + e.getMessage());
		} finally {
			em.close();
		}
	}

	public void atualizar(Filme filme) {
		em.getTransaction().begin();
		em.merge(filme);
		em.getTransaction().commit();
	}

	public Filme getById(final int id) {
		return em.find(Filme.class, id);
	}

	public void remover(Filme filme) {
		em.getTransaction().begin();
		Filme filRemover = getById(filme.getId());
		em.remove(filRemover);
		em.getTransaction().commit();
	}

	public List<Filme> getAll() {
		return em.createQuery("FROM" + Filme.class.getName()).getResultList();

	}
}
