package com.br.projetoClinica.testes;
import com.br.projetoClinica.classes.Medico;

public class medicoTeste {
	
	public static void main(String[]args) {
		
		Medico medico = new Medico();
		
		medico.setIdMedico(01);
		medico.setCrmMedico("CRM/SP 736204");
		medico.setNomeMedico("André Matzumura");
		medico.setTelefoneMedico("11 953589251");
		medico.setEspecialidadeMedico("Fisioterapia");
		
		
		System.out.println("===============================================================");
		System.out.println("O id do médico é: " + medico.getIdMedico());
		System.out.println(" ");
		System.out.println("O crm do médico é: " + medico.getCrmMedico());
		System.out.println(" ");
		System.out.println("O nome do médico é: " + medico.getNomeMedico());
		System.out.println(" ");
		System.out.println("A especialidade do médico é: " + medico.getEspecialidadeMedico());
		System.out.println("===============================================================");
		
	}
	
	
}
