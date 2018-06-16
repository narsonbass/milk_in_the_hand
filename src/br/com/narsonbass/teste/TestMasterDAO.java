package br.com.narsonbass.teste;

import br.com.narsonbass.entidades.Master;
import br.com.narsonbass.jdbc.MasterDAO;

public class TestMasterDAO {

	public static void main(String[] args) {
		
		Master mas= new Master();
		mas.setNome("Narson Bass");
		mas.setCpf("12345678910");
		mas.setLogin("753951");
		mas.setSenha("jbltbk");
		mas.setRg("12345678");
		mas.setEntidade_recebedora("Secretaria de Assistência Social");
		mas.setMunicipio("Brejo da Madre de Deus");
		mas.setBairro("Centro");
		mas.setEndereco("R. José Bonifácio da Silva");
		mas.setCep("55170-000");
		mas.setFone("3747-3031");
		
		MasterDAO masDao= new MasterDAO();
		masDao.cadastrar(mas);
		
	}

}
