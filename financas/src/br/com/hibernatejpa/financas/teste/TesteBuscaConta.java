package br.com.hibernatejpa.financas.teste;

import javax.persistence.EntityManager;

import br.com.hibernatejpa.financas.modelo.Conta;
import br.com.hibernatejpa.financas.util.JPAUtil;

public class TesteBuscaConta {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		EntityManager em = new JPAUtil().getEntityManager();
		
		Conta conta = em.find(Conta.class, 1);
		
		
		System.out.println(conta.getTitular());
		
	}

}
