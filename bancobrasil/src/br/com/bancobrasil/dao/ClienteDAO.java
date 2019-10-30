package br.com.bancobrasil.dao;

import java.util.List;

import javax.persistence.Query;
import javax.persistence.EntityManager;

import br.com.bancobrasil.conexao.JPAUtil;
import br.com.bancobrasil.model.Cliente;

public class ClienteDAO {
	
	EntityManager em = new JPAUtil().getConnection();

	public void salvar(Cliente cliente) {

		em.getTransaction().begin();
		em.persist(cliente);
		em.getTransaction().commit();
		em.close();
		
	}

	public List<Cliente> listar() {
		String jpql = "SELECT c FROM Cliente c";
		em.getTransaction().begin();
		
		Query query = em.createQuery(jpql);
		
		return query.getResultList();
	}

}
