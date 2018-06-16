package br.com.narsonbass.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {
	
	//Connection con;
	
	public static Connection getConnection() {
		Connection con= null;
		
		try {
			con= DriverManager.getConnection("jdbc:postgresql://localhost:5432/bd_milk","postgres","123");
			System.out.println("Conectado com Sucesso!");
		} catch (SQLException e) {
			
			System.out.println("Conexão falhou!" + e.getMessage()); 	
		}
		return con;
		
		
	}
}
