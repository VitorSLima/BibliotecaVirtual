package br.cinema.DAO;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.apache.log4j.Logger;

import br.cinema.model.Pessoa;

public class PessoaDAO {
	public static Logger log = Logger.getLogger(PessoaDAO.class);
	protected EntityManager em;

	public PessoaDAO() {
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

	public void save(Pessoa pessoa) {
		log.info("Salvando Pessoa");
		try {
			em.getTransaction().begin();
			em.persist(pessoa);
			em.getTransaction().commit();
		} catch (Exception e) {
			// TODO: handle exception
			log.error("Erro ao salvar pessoa" + e.getMessage());
		} finally {
			em.close();
		}
	}

	public void atualizar(Pessoa pessoa) {
		em.getTransaction().begin();
		em.merge(pessoa);
		em.getTransaction().commit();
	}

	public Pessoa getById(final int id) {
		return em.find(Pessoa.class, id);
	}
	
	public void remover(Pessoa pessoa) {
		em.getTransaction().begin();
		Pessoa pesRemover = getById(pessoa.getId());
		em.remove(pesRemover);
		em.getTransaction().commit();
	}
	public List<Pessoa> getAll(){
		return em.createQuery("FROM" + Pessoa.class.getName()).getResultList();
		
	}

}
