package br.com.hibernatejpa.financas.teste;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import br.com.hibernatejpa.financas.modelo.Conta;
import br.com.hibernatejpa.financas.modelo.Movimentacao;
import br.com.hibernatejpa.financas.modelo.TipoMovimentacao;
import br.com.hibernatejpa.financas.util.JPAUtil;

//JAVA PERSISTENCE QUERY LANGUAGE
public class TesteJPQL {

	public static void main(String[] args) {

		EntityManager em = new JPAUtil().getEntityManager();
		em.getTransaction().begin();
		
		Conta conta = new Conta();
		conta.setId(5);
		
		
		String jpql = "SELECT m FROM Movimentacao m WHERE m.tipo = :pTipo ORDER BY m.valor";
//		String jpql = "SELECT m FROM Movimentacao m WHERE m.id.conta = :pConta AND m.tipo = :pTipo ORDER BY m.valor";
		
		Query query = em.createQuery(jpql);
//		query.setParameter("pConta", conta);
//		query.setParameter("pTipo", TipoMovimentacao.SAIDA);
		query.setParameter("pTipo", TipoMovimentacao.ENTRADA);
		
		List <Movimentacao> resultados = query.getResultList();
		
		for (Movimentacao movimentacao : resultados) {
			System.out.println("Dscricao: " + movimentacao.getDescricao() + " ---- Valor: " + movimentacao.getValor());
			System.out.println("Conta.id: " + movimentacao.getConta().getId());
		}
		
		
		em.getTransaction().commit();
		em.close();
		
	}

}
