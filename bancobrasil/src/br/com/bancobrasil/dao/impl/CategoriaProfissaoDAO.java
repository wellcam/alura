package br.com.bancobrasil.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import br.com.bancobrasil.conexao.JPAUtil;
import br.com.bancobrasil.dao.DefaultDao;
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
		String jpql = "SELECT c FROM CategoriaProfissao c";
		em.getTransaction().begin();
		
		Query query = em.createQuery(jpql);
		
		return query.getResultList();
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
