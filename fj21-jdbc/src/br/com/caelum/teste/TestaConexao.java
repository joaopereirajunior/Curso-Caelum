package br.com.caelum.teste;

import java.sql.Connection;
import java.sql.SQLException;

import br.com.caelum.jdbc.FabricaConexao;

public class TestaConexao {
	public static void main(String[] args) throws SQLException {
		Connection conexao = new FabricaConexao().getConexao();
		
		System.out.println("Conectado!");
		conexao.close();
	}

}
