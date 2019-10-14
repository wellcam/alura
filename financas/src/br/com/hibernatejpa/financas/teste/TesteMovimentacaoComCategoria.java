package br.com.hibernatejpa.financas.teste;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Calendar;

import javax.persistence.EntityManager;

import br.com.hibernatejpa.financas.modelo.Categoria;
import br.com.hibernatejpa.financas.modelo.Conta;
import br.com.hibernatejpa.financas.modelo.Movimentacao;
import br.com.hibernatejpa.financas.modelo.TipoMovimentacao;
import br.com.hibernatejpa.financas.util.JPAUtil;

public class TesteMovimentacaoComCategoria {

	public static void main(String[] args) {
		
		Conta conta1 = new Conta();
		conta1.setId(1);
		
		Conta conta2 = new Conta();
		conta2.setId(5);
		
		Conta conta3 = new Conta();
		conta3.setId(3);
		
		Conta conta4 = new Conta();
		conta4.setId(4);
		
//		CRIANDO CATEGORIAS
//		Categoria categoria1 = new Categoria("VIAGEM");
//		Categoria categoria2 = new Categoria("NEGÓCIOS");
//		Categoria categoria3 = new Categoria("ALUGUEL");
//		Categoria categoria4 = new Categoria("SALÁRIO");
		
		Categoria categoria1 = new Categoria();
		categoria1.setId(1);
		Categoria categoria2 = new Categoria();
		categoria2.setId(2);
		Categoria categoria3 = new Categoria();
		categoria3.setId(3);
		Categoria categoria4 = new Categoria();
		categoria4.setId(4);
		
		Movimentacao movimentacao1 = new Movimentacao();
		movimentacao1.setConta(conta1);
		movimentacao1.setData(Calendar.getInstance());
		movimentacao1.setDescricao("Pagamento de Aluguel");
		movimentacao1.setTipo(TipoMovimentacao.ENTRADA);
		movimentacao1.setValor(new BigDecimal(234));
		movimentacao1.setCategoria(Arrays.asList(categoria3));
		
		Movimentacao movimentacao2 = new Movimentacao();
		movimentacao2.setConta(conta2);
		movimentacao2.setData(Calendar.getInstance());
		movimentacao2.setDescricao("Saláro Mês Agosto");
		movimentacao2.setTipo(TipoMovimentacao.ENTRADA);
		movimentacao2.setValor(new BigDecimal(9874));
		movimentacao2.setCategoria(Arrays.asList(categoria4));
		
		Movimentacao movimentacao3 = new Movimentacao();
		movimentacao3.setConta(conta3);
		movimentacao3.setData(Calendar.getInstance());
		movimentacao3.setDescricao("Pagamento de Aluguel");
		movimentacao3.setTipo(TipoMovimentacao.ENTRADA);
		movimentacao3.setValor(new BigDecimal(123322));
		movimentacao3.setCategoria(Arrays.asList(categoria1));
		
		Movimentacao movimentacao4 = new Movimentacao();
		movimentacao4.setConta(conta4);
		movimentacao4.setData(Calendar.getInstance());
		movimentacao4.setDescricao("Saláro Mês Dezembro");
		movimentacao4.setTipo(TipoMovimentacao.ENTRADA);
		movimentacao4.setValor(new BigDecimal(123123));
		movimentacao4.setCategoria(Arrays.asList(categoria2));
		
		EntityManager em = new JPAUtil().getEntityManager();
		em.getTransaction().begin();

//		em.persist(categoria1);
//		em.persist(categoria2);
//		em.persist(categoria4);
//		em.persist(categoria3);
		
		em.persist(movimentacao1);
		em.persist(movimentacao2);
		em.persist(movimentacao3);
		em.persist(movimentacao4);
		
		em.getTransaction().commit();
		em.close();
		
	}

}
