package br.com.jdbc.crud;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import br.com.jdbc.conexao.Database;

public class TestaInsercao {

	public static void main(String[] args) throws SQLException {
		
		
//		String nome = "Celular";
//		String descricao = "Galaxy S8+";
		String sql = "insert into produto (nome, descricao) values (?, ?)";
		
		Connection connection = Database.getConnection();
		
		PreparedStatement statement = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
		
		adiciona("TV LCD", "32 polegadas", statement);
		adiciona("Home Theater", "Som potente", statement);
		
		statement.close();
		connection.close();
	
	}

	private static void adiciona(String nome, String descricao, PreparedStatement statement) throws SQLException {
		statement.setString(1, nome);
		statement.setString(2, descricao);
		
		boolean resultado = statement.execute();
		System.out.println(resultado);
		
		ResultSet resulSet = statement.getGeneratedKeys();
		
		while(resulSet.next()) {
			long id = resulSet.getLong("id");
			System.out.println("id gerado: " + id);
		}
		
		resulSet.close();
	}
}
