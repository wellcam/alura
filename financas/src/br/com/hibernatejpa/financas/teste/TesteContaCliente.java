package br.com.hibernatejpa.financas.teste;

import javax.persistence.EntityManager;

import br.com.hibernatejpa.financas.modelo.Cliente;
import br.com.hibernatejpa.financas.modelo.Conta;
import br.com.hibernatejpa.financas.util.JPAUtil;

public class TesteContaCliente {

	public static void main(String[] args) {
		
		Conta conta = new Conta();
		conta.setId(2);

		
		Cliente cliente = new Cliente();
		cliente.setNome("Wellington Camilo");
		cliente.setEndereco("Rua Manoel Francisco Sa, 5");
		cliente.setProfissao("Programador Jr.");
		cliente.setConta(conta);
		
		Cliente cliente2 = new Cliente();
		cliente2.setNome("André Camilo");
		cliente2.setEndereco("Rua Manoel Francisco Sa, 5");
		cliente2.setProfissao("Fotografo");
		cliente2.setConta(conta);
		
		
		EntityManager em = new JPAUtil().getEntityManager();
		em.getTransaction().begin();
		
//		em.persist(cliente);
		em.persist(cliente2);
		
		em.getTransaction().commit();
		em.close();

	}

}
