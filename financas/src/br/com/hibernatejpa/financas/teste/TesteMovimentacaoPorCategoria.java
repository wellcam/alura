package br.com.hibernatejpa.financas.teste;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import br.com.hibernatejpa.financas.modelo.Categoria;
import br.com.hibernatejpa.financas.modelo.Movimentacao;
import br.com.hibernatejpa.financas.util.JPAUtil;

public class TesteMovimentacaoPorCategoria {

	public static void main(String[] args) {
		
		EntityManager em = new JPAUtil().getEntityManager();
		em.getTransaction().begin();
		
		Categoria categoria = new Categoria();
		categoria.setId(3);
		
		String jpql = "SELECT m FROM Movimentacao m JOIN m.categoria c WHERE c = :pCategoria ORDER BY valor";
		
		Query query = em.createQuery(jpql);
		query.setParameter("pCategoria", categoria);
		
		List <Movimentacao> resultados = query.getResultList();
		
		for (Movimentacao movimentacao : resultados) {
			System.out.println("Descricao: " + movimentacao.getDescricao() + " ---- Valor: " + movimentacao.getValor());
			System.out.println("Conta.id: " + movimentacao.getConta().getId());
		}
		
		em.getTransaction().commit();
		em.close();

	}

}
