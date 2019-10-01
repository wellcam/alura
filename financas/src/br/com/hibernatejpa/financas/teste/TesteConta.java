package br.com.hibernatejpa.financas.teste;

import javax.persistence.EntityManager;

import br.com.hibernatejpa.financas.modelo.Conta;
import br.com.hibernatejpa.financas.util.JPAUtil;

public class TesteConta {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Conta conta = new Conta();
		conta.setTitular("Wellington");
		conta.setAgencia("123");
		conta.setBanco("Santander");
		conta.setNumero("456");

		EntityManager em = new JPAUtil().getEntityManager();
		
		em.getTransaction().begin();
		em.persist(conta);
		em.getTransaction().commit();
		
		em.close();
		
	}

}
