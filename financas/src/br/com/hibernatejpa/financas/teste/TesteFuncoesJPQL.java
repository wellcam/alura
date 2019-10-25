package br.com.hibernatejpa.financas.teste;

import java.util.List;

import javax.persistence.EntityManager;

import br.com.hibernatejpa.financas.dao.MovimentacaoDao;
import br.com.hibernatejpa.financas.modelo.Conta;
import br.com.hibernatejpa.financas.modelo.TipoMovimentacao;
import br.com.hibernatejpa.financas.util.JPAUtil;

public class TesteFuncoesJPQL {

	public static void main(String[] args) {

		EntityManager em = new JPAUtil().getEntityManager();
		em.getTransaction().begin();
		
		Conta conta = new Conta();
		conta.setId(3);
		
		MovimentacaoDao dao = new MovimentacaoDao(em);
		List<Double> medias = dao.getMediasPorDiaETipo(TipoMovimentacao.ENTRADA, conta);
		
		System.out.println("Media das movimentações é: "+ medias); //MEDIA
		
		em.getTransaction().commit();
		em.close();
		
	}

}
