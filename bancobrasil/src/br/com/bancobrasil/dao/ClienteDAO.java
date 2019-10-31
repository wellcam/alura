package br.com.bancobrasil.dao;

import java.util.List;

import javax.persistence.Query;
import javax.persistence.EntityManager;

import br.com.bancobrasil.conexao.JPAUtil;
import br.com.bancobrasil.model.Cliente;

public class ClienteDAO {
	
	EntityManager em = new JPAUtil().getConnection();

	public void adicionar(Cliente cliente) {

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

	public void excluir(Integer id) {
		em.getTransaction().begin();
		Cliente cliente = em.find(Cliente.class, id);
		
		try {
			em.remove(cliente);
		} catch (Exception e) {
			throw e;
		}
		em.getTransaction().commit();
		em.close();
	}

	public Cliente editar(Integer id) {
		em.getTransaction().begin();
		return em.find(Cliente.class, id);
	}

	public void salvar(Cliente cliente) {
		em.getTransaction().begin();
		Cliente editar = em.find(Cliente.class, cliente.getId());
		
		editar.setNome(cliente.getNome());
		editar.setIdade(cliente.getIdade());
		editar.setProfissao(cliente.getProfissao());
		editar.setDataNascimento(cliente.getDataNascimento());
		
		em.getTransaction().commit();
		em.close();
		
	}

}
