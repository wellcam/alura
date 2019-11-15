package br.com.bancobrasil.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;

import br.com.bancobrasil.conexao.JPAUtil;
import br.com.bancobrasil.model.Profissao;

public class ProfissaoDAO {
	private EntityManager em = new JPAUtil().getConnection();
	
	public void adicionar(Profissao profissao) {
		em.getTransaction().begin();
		em.persist(profissao);
		
		em.getTransaction().commit();
		em.close();
		
	}

	public List<Profissao> listar() {
		/*QUERY COM JPQL*/
//		String jpql = "SELECT p FROM Profissao p";
//		em.getTransaction().begin();
//		Query query = em.createQuery(jpql);
//		return query.getResultList();
		
		/*CRITERIA QUERY*/
		CriteriaBuilder criteriaBuilder = em.getCriteriaBuilder();
		CriteriaQuery<Profissao> query = criteriaBuilder.createQuery(Profissao.class);
		query.from(Profissao.class);
		
		TypedQuery<Profissao> typed = em.createQuery(query);
		return typed.getResultList();
		
	}

	public void excluir(Integer id) {
		em.getTransaction().begin();
		Profissao profissao = em.find(Profissao.class, id);

		try {
			em.remove(profissao);
		} catch (Exception e) {
			throw e;
		}
		em.getTransaction().commit();
		em.close();
	}

	public Profissao buscarPorId(Integer idProfissao) {
		em.getTransaction().begin();
		Profissao profissao = em.find(Profissao.class, idProfissao);
		em.getTransaction().commit();
		em.close();
		return profissao;
	}
}
