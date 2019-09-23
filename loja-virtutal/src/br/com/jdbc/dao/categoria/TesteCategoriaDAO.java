package br.com.jdbc.dao.categoria;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import br.com.jdbc.conexao.ConnectionPool;
import br.com.jdbc.dao.ProdutoDAO;
import br.com.jdbc.model.Categoria;
import br.com.jdbc.model.Produto;

public class TesteCategoriaDAO {
	
	public static void main(String[] args) throws SQLException {
		
		try(Connection connection = new ConnectionPool().getConnection()){
			List<Categoria> categorias = new CategoriaDAO(connection).listar();
			
			for (Categoria categoria : categorias) {
				System.out.println("Categoria --> " + categoria);
				for(Produto p : new ProdutoDAO(connection).buscaPorCategoria(categoria)) {
					System.out.println(categoria.getNome() + " - " + p.getNome());
				}
			}
		}
		
	}

}
