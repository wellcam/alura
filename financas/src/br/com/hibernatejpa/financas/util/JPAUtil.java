package br.com.hibernatejpa.financas.util;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JPAUtil {
	private final String persistenceUnitName = "financas";	
	private EntityManagerFactory emf = Persistence.createEntityManagerFactory(persistenceUnitName);
	
	public EntityManager getEntityManager() {
		return emf.createEntityManager();
	}

}
