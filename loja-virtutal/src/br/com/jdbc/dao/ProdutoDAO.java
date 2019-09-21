package br.com.jdbc.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import br.com.jdbc.model.Produto;

public class ProdutoDAO {

	private Connection connection;

	public ProdutoDAO(Connection connection) {
		this.connection = connection;
		// TODO Auto-generated constructor stub
	}

	public void salvar(Produto produto) throws SQLException {
		String sql = "INSERT INTO PRODUTO (nome, descricao) values(?,?)";
		
		try(PreparedStatement stmt = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)){
			
			stmt.setString(1, produto.getNome());
			stmt.setString(2, produto.getDescricao());
			stmt.execute();
			System.out.println("Executado");
			
			try(ResultSet result = stmt.getGeneratedKeys()){
				while (result.next()) {
					int id = result.getInt("id");
					produto.setId(id);
				}
			}
		}
	}

	public List<Produto> listar() throws SQLException {
		List<Produto> produtos = new ArrayList<>();
		String sql = "SELECT * FROM Produto";
		
		try(PreparedStatement stmt = connection.prepareStatement(sql)){
			stmt.execute();
			
			ResultSet result = stmt.getResultSet();
			while(result.next()) {
				int id = result.getInt("id");
				String nome = result.getString("nome");
				String descricao = result.getString("descricao");
				
				Produto produto = new Produto(nome, descricao);
				produto.setId(id);
				
				produtos.add(produto);
				
			}
			
		}
		
		return produtos;
	}
}
