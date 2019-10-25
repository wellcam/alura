package br.com.hibernatejpa.financas.teste;

import javax.persistence.EntityManager;

import br.com.hibernatejpa.financas.modelo.Conta;
import br.com.hibernatejpa.financas.modelo.Movimentacao;
import br.com.hibernatejpa.financas.util.JPAUtil;

public class TesteMovimentacaoConta {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManager em = new JPAUtil().getEntityManager();
		em.getTransaction().begin();
		
		Movimentacao movimentacao = em.find(Movimentacao.class, 2);
		Conta conta = movimentacao.getConta();
		
		System.out.println("Titular: " + conta.getTitular());
		
		System.out.println(conta.getMovimentacoes().size());
		
		em.getTransaction().commit();
		em.close();

	}

}
