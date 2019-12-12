package br.com.casadocodigo.loja.daos;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import br.com.casadocodigo.loja.models.Produto;

@Repository
@Transactional
public class ProdutoDao {

	@PersistenceContext
	private EntityManager em;
	
	public void cadastrar(Produto produto) {
		em.persist(produto);
	}

	public List<Produto> listar() {
		return em.createQuery("SELECT p FROM Produto p", Produto.class).getResultList();
	}

}
