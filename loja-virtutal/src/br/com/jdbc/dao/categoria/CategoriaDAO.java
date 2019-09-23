package br.com.jdbc.dao.categoria;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.jdbc.model.Categoria;

public class CategoriaDAO {

	private Connection connection;

	public CategoriaDAO(Connection connection) {
		this.connection = connection;
	}

	public List<Categoria> listar() throws SQLException {
		String sql = "SELECT * FROM Categoria";
		List<Categoria> categorias = new ArrayList<>();

		try (PreparedStatement stmt = connection.prepareStatement(sql)) {
			stmt.execute();

			try (ResultSet result = stmt.getResultSet()) {

				while (result.next()) {
					int id = result.getInt("id");
					String nome = result.getString("nome");
					Categoria categoria = new Categoria(nome);
					categoria.setId(id);

					categorias.add(categoria);
				}
			}
		}

		return categorias;
	}

}
