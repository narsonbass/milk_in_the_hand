package br.com.narsonbass.jdbc;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import br.com.narsonbass.entidades.Responsavel;

public class ResponsavelDAO {
	
	private Connection con= Conexao.getConnection();
	
	public void cadastrar (Responsavel responsavel) {
		
		String sql= "INSERT INTO RESPONSAVEL (cpf, nome, rg, endereco, cep, municipio, bairro, nis) values (?, ?, ?, ?, ?, ?, ?, ?)";
		
		try {
			PreparedStatement preparador= con.prepareStatement(sql);
			preparador.setString(1, responsavel.getCpf());
			preparador.setString(2, responsavel.getNome());
			preparador.setString(3, responsavel.getRg());
			preparador.setString(4, responsavel.getEndereco());
			preparador.setString(5, responsavel.getCep());
			preparador.setString(6, responsavel.getMunicipio());
			preparador.setString(7, responsavel.getBairro());
			preparador.setString(8, responsavel.getNis());
			
			
			
			//preparador.execute();
			preparador.close();
			
			System.out.println("Registro cadastrado com sucesso!");
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
		
	}

}