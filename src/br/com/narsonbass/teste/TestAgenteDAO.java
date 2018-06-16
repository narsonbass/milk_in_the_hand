package br.com.narsonbass.teste;

import br.com.narsonbass.entidades.Agente;
import br.com.narsonbass.jdbc.AgenteDAO;

public class TestAgenteDAO {

	public static void main(String[] args) {
		
		Agente agen= new Agente();
		agen.setNome("João Paulo");
		agen.setLogin("4515268");
		agen.setCpf("7415896375");
		agen.setFone("3747-2480");
		agen.setSenha("casa");
		agen.setEndereco("R. São José");
		agen.setBairro("Centro");
		agen.setCep("55170-000");
		agen.setCras_referencia("Fazenda Nova");
			
		
		AgenteDAO agenDao= new AgenteDAO();
		agenDao.cadastrar(agen);
		
	}

}