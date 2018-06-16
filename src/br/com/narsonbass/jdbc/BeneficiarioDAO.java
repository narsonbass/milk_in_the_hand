package br.com.narsonbass.jdbc;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import br.com.narsonbass.entidades.Beneficiario;

public class BeneficiarioDAO {
	
	private Connection con= Conexao.getConnection();
	
	public void cadastrar (Beneficiario beneficiario) {
		
		String sql= "INSERT INTO BENEFICIARIO (id, sexo, nome, data_de_nascimento, peso, idade) values (?, ?, ?, ?, ?, ?)";
		
		try {
			PreparedStatement preparador= con.prepareStatement(sql);
			preparador.setString(1, beneficiario.getId());
			preparador.setString(2, beneficiario.getSexo());
			preparador.setString(3, beneficiario.getNome());
			preparador.setString(4, beneficiario.getData_de_nascimento());
			preparador.setString(5, beneficiario.getPeso());
			preparador.setString(6, beneficiario.getIdade());
			
			
			//preparador.execute();
			preparador.close();
			
			System.out.println("Registro cadastrado com sucesso!");
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
		
	}

}
