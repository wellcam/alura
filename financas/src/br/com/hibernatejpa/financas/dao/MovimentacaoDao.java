package br.com.hibernatejpa.financas.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import br.com.hibernatejpa.financas.modelo.Conta;
import br.com.hibernatejpa.financas.modelo.TipoMovimentacao;

public class MovimentacaoDao {

	private EntityManager em;

	public MovimentacaoDao(EntityManager em) {
		this.em = em;
	}

	public List<Double> getMediasPorDiaETipo(TipoMovimentacao entrada, Conta conta) {
		String jpql = "SELECT DISTINCT avg(m.valor) FROM Movimentacao m " + 
					  "WHERE m.conta = :pConta " + 
					  "AND m.tipo = :pTipo " + 
					  "GROUP BY m.data";

		TypedQuery<Double> query = em.createQuery(jpql, Double.class);
		query.setParameter("pConta", conta);
		query.setParameter("pTipo", entrada);

		return query.getResultList();
	}

}
