package br.com.jdbc.conexao;

import java.sql.Connection;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.hsqldb.jdbc.JDBCPool;

public class Database {
	
	static final String URL_DB = "jdbc:hsqldb:hsql://localhost/loja-virtual";
	static final String USER_DB = "SA";
	static final String PASSWORD_DB = "";
	private DataSource dataSource;
	
	public Database() {
		//Criar pool de conexoes, JDBCPool é exclusivo do HSQLDB
		JDBCPool pool = new JDBCPool();
		pool.setUrl(URL_DB);
		pool.setUser(USER_DB);
		pool.setPassword(PASSWORD_DB);
		this.dataSource = pool;
	}

	public Connection getConnection() throws SQLException {
		Connection connection = dataSource.getConnection();
		return connection;
	}
	

//	CRIANDO UM CONEXAO UNICA
//	public static Connection getConnection() throws SQLException {
//		System.out.println("Abrindo conexão com o banco de dados");
//		Connection connection = DriverManager.getConnection(URL_DB, USER_DB, PASSWORD_DB);
//		return connection;
//	}	

}
