package br.cinema.app;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

public class Teste {

	public static Logger log = Logger.getLogger(Teste.class);

	public static void main(String[] args) {

		BasicConfigurator.configure();

		EntityManagerFactory factory = Persistence.createEntityManagerFactory("Cinema");

		/*
		 * try { EntityManager em = factory.createEntityManager(); } catch (Exception e)
		 * {
		 * 
		 * log.error("Erro na abertura da conexao" + e.getMessage()); }
		 */
		EntityManager em = factory.createEntityManager();
	}
}
