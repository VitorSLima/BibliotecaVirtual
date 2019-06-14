package br.cinema.DAO;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.apache.log4j.Logger;

import br.cinema.model.Login;

public class LoginDAO {

	public static Logger log = Logger.getLogger(LoginDAO.class);
	protected EntityManager em;

	public LoginDAO() {
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

	public void save(Login login) {
		log.info("Salvando login");
		try {
			em.getTransaction().begin();
			em.persist(login);
			em.getTransaction().commit();
		} catch (Exception e) {
			// TODO: handle exception
			log.error("Erro ao fazer login" + e.getMessage());
		} finally {
			em.close();
		}
	}

	public void atualizar(Login login) {
		em.getTransaction().begin();
		em.merge(login);
		em.getTransaction().commit();
	}

	public Login getById(final int id) {
		return em.find(Login.class, id);
	}
	
	public void remover(Login pessoa) {
		em.getTransaction().begin();
		Login logRemover = getById(pessoa.getId());
		em.remove(logRemover);
		em.getTransaction().commit();
	}
	public List<Login> getAll(){
		return em.createQuery("FROM" + Login.class.getName()).getResultList();
		
	}
}
