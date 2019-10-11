package br.com.hibernatejpa.financas.teste;

import java.math.BigDecimal;
import java.util.Calendar;

import javax.persistence.EntityManager;

import br.com.hibernatejpa.financas.modelo.Conta;
import br.com.hibernatejpa.financas.modelo.Movimentacao;
import br.com.hibernatejpa.financas.modelo.TipoMovimentacao;
import br.com.hibernatejpa.financas.util.JPAUtil;

public class TesteJPARelacionamento {

	public static void main(String[] args) {
		
		Conta conta = new Conta();
		conta.setTitular("Wellington Camilo");
		conta.setAgencia("211");
		conta.setBanco("Bradesco");
		conta.setNumero("4568795");
		
		Movimentacao movimentacao = new Movimentacao();
		movimentacao.setConta(conta);
		movimentacao.setDescricao("MCDONALDS");
		movimentacao.setTipo(TipoMovimentacao.SAIDA);
		movimentacao.setValor(new BigDecimal(200));
		movimentacao.setData(Calendar.getInstance());
		
		
		EntityManager em = new JPAUtil().getEntityManager();
		em.getTransaction().begin();
		
		em.persist(conta);
		em.persist(movimentacao);
		
		em.getTransaction().commit();
		
		em.close();

	}

}
