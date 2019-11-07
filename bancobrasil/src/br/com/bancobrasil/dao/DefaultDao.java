package br.com.bancobrasil.dao;

import java.util.List;

public interface DefaultDao {
	
	void adicionar(Object object);
	
	void excluir(Integer id);
	
	List<E> listar();
	
	Object buscarPorId(Integer id);
}
