package br.com.jdbc.crud;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import br.com.jdbc.conexao.Database;

public class TestaInsercao {

	public static void main(String[] args) throws SQLException {

		try(Connection connection = new Database().getConnection()){
			connection.setAutoCommit(false);
			String sql = "insert into produto (nome, descricao) values (?, ?)";

			try(PreparedStatement statement = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)){
				adiciona("Relogio Digital", "Xaiomi Mi Band 4", statement);
				adiciona("Xbox", "Microsoft Xbox One", statement);
				connection.commit();
				System.out.println("Comitado!");
			} catch (Exception ex) {
				ex.printStackTrace();
				connection.rollback();
				System.out.println("Roolback");
			}
		}
	}

	private static void adiciona(String nome, String descricao, PreparedStatement statement) throws SQLException {

//		if(nome.equals("TV LCD")) {
//			throw new IllegalArgumentException("Errooo!");
//		}

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
