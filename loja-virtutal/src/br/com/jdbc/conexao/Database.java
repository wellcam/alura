package br.com.jdbc.conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Database {
	
	
	public static Connection getConnection() throws SQLException {
		System.out.println("Abrindo conexão com o banco de dados");
		Connection connection = DriverManager.getConnection("jdbc:hsqldb:hsql://localhost/loja-virtual", "SA", "");
		return connection;
	}	

}
