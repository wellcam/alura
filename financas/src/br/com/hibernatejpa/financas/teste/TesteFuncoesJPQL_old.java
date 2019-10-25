package br.com.hibernatejpa.financas.teste;

import java.math.BigDecimal;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import com.sun.xml.bind.v2.runtime.unmarshaller.Base64Data;

import br.com.hibernatejpa.financas.modelo.Conta;
import br.com.hibernatejpa.financas.modelo.Movimentacao;
import br.com.hibernatejpa.financas.modelo.TipoMovimentacao;
import br.com.hibernatejpa.financas.util.JPAUtil;

public class TesteFuncoesJPQL_old {

	public static void main(String[] args) {

		EntityManager em = new JPAUtil().getEntityManager();
		em.getTransaction().begin();
		
		Conta conta = new Conta();
		conta.setId(5);
		
		//SOMA
//		String jpql = "SELECT sum(m.valor) FROM Movimentacao m WHERE m.id.conta = :pConta AND m.tipo = :pTipo ORDER BY m.valor";
		
		//MEDIA
		String jpql = "SELECT avg(m.valor) FROM Movimentacao m WHERE m.id.conta = :pConta AND m.tipo = :pTipo ORDER BY m.valor";
		
		Query query = em.createQuery(jpql);
		query.setParameter("pConta", conta);
//		query.setParameter("pTipo", TipoMovimentacao.SAIDA);
		query.setParameter("pTipo", TipoMovimentacao.ENTRADA);
		
//		BigDecimal soma = (BigDecimal) query.getSingleResult();
		Double media = (Double) query.getSingleResult();
//		System.out.println("Soma das movimentações é: R$"+ soma); //SOMA
		System.out.println("Media das movimentações é: R$"+ media); //MEDIA
		
		em.getTransaction().commit();
		em.close();
		
	}

}
