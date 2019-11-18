package br.com.bancobrasil.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Path;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import br.com.bancobrasil.conexao.JPAUtil;
import br.com.bancobrasil.model.Cliente;
import br.com.bancobrasil.model.Usuario;

public class ClienteDAO {
	
	private EntityManager em = new JPAUtil().getConnection();

	public void adicionar(Cliente cliente) {

		em.getTransaction().begin();
		em.persist(cliente);
		em.getTransaction().commit();
		em.close();
		
	}

	public List<Cliente> listar(Usuario usuario) {
		/*QUERY COM JPQL*/
//		String jpql = "SELECT c FROM Cliente c WHERE c.usuario = :pUsuario";
//		em.getTransaction().begin();
//		Query query = em.createQuery(jpql);
//		query.setParameter("pUsuario", usuario);
//		return query.getResultList();
		
		/*CRITERIA QUERY*/ //ANALISAR NOVAMENTE, ESTÁ DANDO ERRO
		CriteriaBuilder criteriaBuilder = em.getCriteriaBuilder();
		CriteriaQuery<Cliente> query = criteriaBuilder.createQuery(Cliente.class);
		Root<Cliente> root = query.from(Cliente.class);
		Path<Usuario> usuarioPath = root.<Usuario>get("usuario");
		
		Predicate usuarioIgual = criteriaBuilder.equal(usuarioPath, usuario);
		
		query.where(usuarioIgual);
		
		TypedQuery<Cliente> typed = em.createQuery(query);
		return typed.getResultList();
		
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
		editar.setProfissao(cliente.getProfissao());
		editar.setDataNascimento(cliente.getDataNascimento());
		
		em.getTransaction().commit();
		em.close();
//		if(cliente.getId() != null) {
//			em.getTransaction().begin();
//			em.merge(cliente);
//			em.getTransaction().commit();
//			em.close();
//		}
		
	}

}
