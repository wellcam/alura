package br.com.bancobrasil.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;

import br.com.bancobrasil.conexao.JPAUtil;
import br.com.bancobrasil.model.CategoriaProfissao;

public class CategoriaProfissaoDAO {
	private EntityManager em = new JPAUtil().getConnection();
	
	public void adicionar(CategoriaProfissao categoria) {
		em.getTransaction().begin();
		em.persist(categoria);
		
		em.getTransaction().commit();
		em.close();
		
	}

	public List<CategoriaProfissao> listar() {
		/*QUERY COM JPQL*/
//		String jpql = "SELECT c FROM CategoriaProfissao c";
//		em.getTransaction().begin();
//		Query query = em.createQuery(jpql);
//		return query.getResultList();
		
		/*QUERY COM CRITERIA*/
		
		CriteriaBuilder criteriaBuilder = em.getCriteriaBuilder();
		CriteriaQuery<CategoriaProfissao> query = criteriaBuilder.createQuery(CategoriaProfissao.class);
		query.from(CategoriaProfissao.class);
		
		TypedQuery<CategoriaProfissao> typed = em.createQuery(query);
		return typed.getResultList();
	}

	public void excluir(Integer id) {
		em.getTransaction().begin();
		CategoriaProfissao categoria = em.find(CategoriaProfissao.class, id);

		try {
			em.remove(categoria);
		} catch (Exception e) {
			throw e;
		}
		em.getTransaction().commit();
		em.close();
	}

	public CategoriaProfissao buscarPorId(Integer categoriaId) {
		em.getTransaction().begin();
		CategoriaProfissao categoria = em.find(CategoriaProfissao.class, categoriaId);
		return categoria;
	}


}
