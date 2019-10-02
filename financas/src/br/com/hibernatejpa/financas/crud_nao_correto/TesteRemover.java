package br.com.hibernatejpa.financas.crud_nao_correto;

import javax.persistence.EntityManager;

import br.com.hibernatejpa.financas.modelo.Conta;
import br.com.hibernatejpa.financas.util.JPAUtil;

public class TesteRemover {

	public static void main(String[] args) {
		
		EntityManager em = new JPAUtil().getEntityManager();
		
		em.getTransaction().begin();
//		ESTADO DETACHED
		
		Conta conta = em.find(Conta.class, 7);
//		ESTADO MANAGED
		
		em.remove(conta);
		
		em.getTransaction().commit();
//		ESTADO DETACHED
		
		em.close();
		
	}
	
}
