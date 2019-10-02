package br.com.hibernatejpa.financas.crud_nao_correto;

import javax.persistence.EntityManager;

import br.com.hibernatejpa.financas.modelo.Conta;
import br.com.hibernatejpa.financas.util.JPAUtil;

public class TesteInserir {
	
	public static void main(String[] args) {
		Conta conta = new Conta();
		conta.setTitular("João Pereira Antonio");
		conta.setAgencia("0001");
		conta.setBanco("Santander");
		conta.setNumero("01012560-0");
		
		EntityManager em = new JPAUtil().getEntityManager();
		
		em.getTransaction().begin();
//		ESTADO TRANSIENT
		
		em.persist(conta);
//		ESTADO MANAGED
		
		em.getTransaction().commit();
//		ESTADO DETACHED
		em.close();
		
	}

}
