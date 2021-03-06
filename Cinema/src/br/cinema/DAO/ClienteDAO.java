package br.cinema.DAO;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.apache.log4j.Logger;

import br.cinema.model.Cliente;

public class ClienteDAO {

	public static Logger log = Logger.getLogger(ClienteDAO.class);
	protected EntityManager em;

	public ClienteDAO() {
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

	public void save(Cliente cliente) {
		log.info("Salvando Cliente");
		try {
			em.getTransaction().begin();
			em.persist(cliente);
			em.getTransaction().commit();
		} catch (Exception e) {
			// TODO: handle exception
			log.error("Erro ao salvar o cliente" + e.getMessage());
			em.getTransaction().rollback();
		} finally {
			em.close();
		}
	}

	public void atualizar(Cliente cliente) {
		em.getTransaction().begin();
		em.merge(cliente);
		em.getTransaction().commit();
	}

	public Cliente getById(final int id) {
		return em.find(Cliente.class, id);
	}
	
	public void remover(Cliente cliente) {
		em.getTransaction().begin();
		Cliente cliRemover = getById(cliente.getId());
		em.remove(cliRemover);
		em.getTransaction().commit();
	}
	public List<Cliente> getAll(){
		return em.createQuery("FROM" + Cliente.class.getName()).getResultList();
		
	}
}
