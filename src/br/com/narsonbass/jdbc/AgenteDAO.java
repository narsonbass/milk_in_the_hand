package br.com.narsonbass.jdbc;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import br.com.narsonbass.entidades.Agente;

public class AgenteDAO {
	
	private Connection con= Conexao.getConnection();
	
	public void cadastrar (Agente agente) {
		
		String sql= "INSERT INTO AGENTE (nome, login, cpf, fone, senha, endereco, bairro, cep, cras_referencia) values (?, ?, ?, ?, ?, ?, ?, ?, ?)";
		
		try {
			PreparedStatement preparador= con.prepareStatement(sql);
			preparador.setString(1, agente.getNome());
			preparador.setString(2, agente.getLogin());
			preparador.setString(3, agente.getCpf());
			preparador.setString(4, agente.getFone());
			preparador.setString(5, agente.getSenha());
			preparador.setString(6, agente.getEndereco());
			preparador.setString(7, agente.getBairro());
			preparador.setString(8, agente.getCep());
			preparador.setString(9, agente.getCras_referencia());

			//preparador.execute();
			preparador.close();
			
			System.out.println("Registro cadastrado com sucesso!");
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
		
	}

}
