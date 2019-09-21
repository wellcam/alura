package br.com.jdbc.crud;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import br.com.jdbc.conexao.ConnectionPool;

public class TestaRemocao {
	
	public static void main(String[] args) throws SQLException {
		
		
		Connection connection = new ConnectionPool().getConnection();
		Statement statement = connection.createStatement();
		statement.executeUpdate("delete from Produto where id>4");
		int updateCount = statement.getUpdateCount();
		System.out.println(updateCount + " linhas atualizadas");
		
		statement.close();
		connection.close();
	}

}
