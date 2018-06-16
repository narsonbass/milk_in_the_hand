package br.com.narsonbass.teste;

import br.com.narsonbass.entidades.Responsavel;
import br.com.narsonbass.jdbc.ResponsavelDAO;


public class TestResponsavelDAO {

	public static void main(String[] args) {
		
		Responsavel res= new Responsavel();
		res.setCpf("75395148625");
		res.setNome("Paula");
		res.setRg("6945569");
		res.setEndereco("R. Otávio de Freitas");
		res.setCep("55173757");
		res.setMunicipio("Belo Jardim");
			
		
		ResponsavelDAO resDao= new ResponsavelDAO();
		resDao.cadastrar(res);
		
	}

}