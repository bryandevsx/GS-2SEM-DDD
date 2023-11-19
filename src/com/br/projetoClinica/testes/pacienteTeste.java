package com.br.projetoClinica.testes;

import com.br.projetoClinica.classes.Paciente;

public class pacienteTeste {

	public static void main(String[] args) {
		
		Paciente paciente = new Paciente();
		
		paciente.setIdPaciente(01);
		paciente.setNomePaciente("Bryan Teixeira");
		paciente.setTelefonePaciente("11 9384678274");
		paciente.setRgPaciente("49.711.258-8");
		paciente.setCpfPaciente("533.480.889.22");
		paciente.setBairroPaciente("Brás Cubas");
		paciente.setEstadoPaciente("São Paulo");
		paciente.setDataNascimentoPaciente("01/08/2004");
		
		System.out.println("===============================================================");
		System.out.println("O id do paciente é: " + paciente.getIdPaciente());
		System.out.println(" ");
		System.out.println("O nome do paciente é: " + paciente.getNomePaciente());
		System.out.println(" ");
		System.out.println("O telefone do paciente é: " + paciente.getTelefonePaciente());
		System.out.println(" ");
		System.out.println("O RG do paciente é: " + paciente.getRgPaciente());
		System.out.println(" ");
		System.out.println("O CPF do paciente é: " + paciente.getCpfPaciente());
		System.out.println(" ");
		System.out.println("O bairro do paciente é: " + paciente.getBairroPaciente());
		System.out.println(" ");
		System.out.println("O estado do paciente é: " + paciente.getEstadoPaciente());
		System.out.println(" ");
		System.out.println("A data de nascimento do paciente é: " + paciente.getDataNascimentoPaciente());
		System.out.println("===============================================================");
		
	}

}
