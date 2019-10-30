package br.com.bancobrasil.conexao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JPAUtil {

	private final String persistenceUnitName = "bancobrasil";
	
	public EntityManager getConnection() {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory(persistenceUnitName);
		return emf.createEntityManager();
	}

}
