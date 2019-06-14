package br.cinema.DAO;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.apache.log4j.Logger;

import br.cinema.model.Funcionarios;

public class FuncionariosDAO {
	public static Logger log = Logger.getLogger(FuncionariosDAO.class);
	protected EntityManager em;

	public FuncionariosDAO() {
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

	public void save(Funcionarios func) {
		log.info("Salvando Funcionario");
		try {
			em.getTransaction().begin();
			em.persist(func);
			em.getTransaction().commit();
		} catch (Exception e) {
			// TODO: handle exception
			log.error("Erro ao salvar o cliente" + e.getMessage());
		} finally {
			em.close();
		}
	}

	public void atualizar(Funcionarios func) {
		em.getTransaction().begin();
		em.merge(func);
		em.getTransaction().commit();
	}

	public Funcionarios getById(final int id) {
		return em.find(Funcionarios.class, id);
	}
	
	public void remover(Funcionarios func) {
		em.getTransaction().begin();
		Funcionarios fncRemover = getById(func.getId());
		em.remove(fncRemover);
		em.getTransaction().commit();
	}
	public List<Funcionarios> getAll(){
		return em.createQuery("FROM" + Funcionarios.class.getName()).getResultList();
		
	}

}
