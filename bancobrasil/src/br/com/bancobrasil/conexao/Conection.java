package br.com.bancobrasil.conexao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.bancobrasil.model.Cliente;

public class Conection {

	public static void main(String[] args) {

		String persistenceUnitName = "bancobrasil";
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory(persistenceUnitName);
		
		EntityManager em = emf.createEntityManager();
		
		
		Cliente cliente = new Cliente();
		cliente.setNome("Wellington Camilo");
		cliente.setIdade(23);
		cliente.setDataNascimento("26/12/1995");
//		cliente.setProfissao("Programador");
		
		
		em.getTransaction().begin();
		
		em.persist(cliente);
		
		em.getTransaction().commit();
		
		em.close();
		
		
		
	}

}
