package br.com.narsonbass.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import br.com.narsonbass.entidades.Master;

public class MasterDAO {
	
	private Connection con= Conexao.getConnection();
	
	public void cadastrar(Master master) {

		//Criar sql
		String sql= "INSERT INTO MASTER (nome, login, senha, rg, cpf, entidade_recebedora, municipio, bairro, endereço, cep, fone) values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
		
		//Cria o PreparedeStatement + sql
		try {
			PreparedStatement preparador= con.prepareStatement(sql);
			preparador.setString(1, master.getNome());
			preparador.setString(2, master.getLogin());
			preparador.setString(3, master.getSenha());
			preparador.setString(4, master.getRg());
			preparador.setString(5, master.getCpf());
			preparador.setString(6, master.getEntidade_recebedora());
			preparador.setString(7, master.getMunicipio());
			preparador.setString(8, master.getBairro());
			preparador.setString(9, master.getEndereco());
			preparador.setString(10, master.getCep());
			preparador.setString(11, master.getFone());
			
			//preparador.execute();
			preparador.close();
			
			System.out.println("Registro cadastrado com sucesso!");
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
		
	}

}
