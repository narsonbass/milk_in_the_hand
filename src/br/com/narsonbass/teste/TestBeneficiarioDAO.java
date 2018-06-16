package br.com.narsonbass.teste;

import br.com.narsonbass.entidades.Beneficiario;
import br.com.narsonbass.jdbc.BeneficiarioDAO;

public class TestBeneficiarioDAO {

	public static void main(String[] args) {
		
		Beneficiario ben= new Beneficiario();
		ben.setId("001");
		ben.setSexo("M");
		ben.setNome("Allef");
		ben.setData_de_nascimento("11/06/1989");
		ben.setPeso("23,4");
		ben.setIdade("13 anos");
			
		
		BeneficiarioDAO benDao= new BeneficiarioDAO();
		benDao.cadastrar(ben);
		
	}

}