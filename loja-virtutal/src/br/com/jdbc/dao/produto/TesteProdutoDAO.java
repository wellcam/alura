package br.com.jdbc.dao.produto;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import br.com.jdbc.conexao.ConnectionPool;
import br.com.jdbc.dao.ProdutoDAO;
import br.com.jdbc.model.Produto;

public class TesteProdutoDAO {

	public static void main(String[] args) throws SQLException {
		ConnectionPool database = new ConnectionPool();

		Produto produto = new Produto("Copo", "Copo personalizado");

		try (Connection connection = database.getConnection()) {
			ProdutoDAO dao = new ProdutoDAO(connection);
			dao.salvar(produto);
			List<Produto> produtos = dao.listar();
			for (Produto p : produtos) {
				System.out.println("Produtos --> " + p);
			}
		}
	}
}
