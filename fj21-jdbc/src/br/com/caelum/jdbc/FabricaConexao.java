package br.com.caelum.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class FabricaConexao {

	public Connection getConexao() throws SQLException {
		try {

			return DriverManager.getConnection("jdbc:mysql://localhost/fj21", "root", "root");

		} catch (SQLException e) {
			throw new RuntimeException(e);

		}

	}

}
