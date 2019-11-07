package br.com.bancobrasil.dao.impl;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import br.com.bancobrasil.conexao.JPAUtil;
import br.com.bancobrasil.model.Usuario;

public class UsuarioDAO {
	private EntityManager em = new JPAUtil().getConnection();
	
	public void adicionar(Usuario usuario) {
		em.getTransaction().begin();
		em.persist(usuario);
		
		em.getTransaction().commit();
		em.close();
		
	}

	public Usuario existe(String login, String password) {
		String jpql = "SELECT u FROM Usuario u WHERE u.login = :pLogin";
		em.getTransaction().begin();
		
		Query query = em.createQuery(jpql);
		query.setParameter("pLogin", login);
		
		Usuario usuario = (Usuario) query.getSingleResult();
		
		if(usuario.getPassword().equals(password)) {
			return usuario;
		} else {
			return null;
		}
		
	}

}
