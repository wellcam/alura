package br.com.caelum.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Path;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.springframework.stereotype.Repository;

import br.com.caelum.model.Loja;
import br.com.caelum.model.Produto;

@Repository
public class ProdutoDao {

	@PersistenceContext
	private EntityManager em;

	public List<Produto> getProdutos() {
		return em.createQuery("from Produto", Produto.class).getResultList();
	}

	public Produto getProduto(Integer id) {
		Produto produto = em.find(Produto.class, id);
		return produto;
	}

	public List<Produto> getProdutos(String nome, Integer categoriaId, Loja lojaId) {
		CriteriaBuilder criteriaBuilder = em.getCriteriaBuilder();
		CriteriaQuery<Produto> query = criteriaBuilder.createQuery(Produto.class);
		Root<Produto> root = query.from(Produto.class);

		Path<String> nomePath = root.<String> get("nome");
		Path<Loja> lojaPath = root.<Loja> get("loja");
		Path<Integer> categoriaPath = root.join("categorias").<Integer> get("id");

		List<Predicate> predicates = new ArrayList<>();

		if (!nome.isEmpty()) {
			Predicate nomeIgual = criteriaBuilder.like(nomePath, nome);
			predicates.add(nomeIgual);
		}
		if (categoriaId != null) {
			Predicate categoriaIgual = criteriaBuilder.equal(categoriaPath, categoriaId);
			predicates.add(categoriaIgual);
		}
		if (lojaId != null) {
			Predicate lojaIgual = criteriaBuilder.equal(lojaPath, lojaId);
			predicates.add(lojaIgual);
		}

		query.where((Predicate[]) predicates.toArray(new Predicate[0]));

		TypedQuery<Produto> typedQuery = em.createQuery(query);
		return typedQuery.getResultList();

	}
	
  /*FORMA SEM CRITERIA, CONCATENANDO STRINGS. NAO PERFORMATICA E DE DIFICIL MANUTENÇÃO*/
	public List<Produto> getProdutos (String nome, Integer categoriaId, Integer lojaId){
		String jpql = "SELECT p FROM Produto p ";
		
		if(categoriaId != null) {
			jpql += "JOIN FETCH p.categorias c WHERE c.id = :pCategoriaId ";
		} else {
			jpql += " WHERE 1 = 1";
		}
		if(lojaId != null) {
			jpql += "AND p.loja.id = :pLojaId ";
		}
		if(!nome.isEmpty()) {
			jpql += "AND p.nome LIKE :pProdutoNome ";
		}
		
		TypedQuery<Produto> query = em.createQuery(jpql, Produto.class);
		
		query.setParameter("pProdutoNome", nome);
		query.setParameter("pCategoriaId", categoriaId);
		query.setParameter("pLojaId", lojaId);
		
		return query.getResultList();
	}
	

	public void insere(Produto produto) {
		if (produto.getId() == null)
			em.persist(produto);
		else
			em.merge(produto);
	}

}
