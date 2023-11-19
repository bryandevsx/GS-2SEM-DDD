package com.br.projetoClinica.testes;
import com.br.projetoClinica.classes.Especialidade;

public class especialidadeTeste {

	public static void main(String[] args) {
		
		Especialidade esp = new Especialidade();
		
		esp.setIdEspecialidade(01);
		esp.setCodigoEspecialidade("SD87SD73HX");
		esp.setNomeEspecialidade("Pediatria");
		
		System.out.println("===============================================================");
		System.out.println("O id da sua especialidade é: " + esp.getIdEspecialidade());
		System.out.println(" ");
		System.out.println("O código da sua especialidade é: " + esp.getCodigoEspecialidade());
		System.out.println(" ");
		System.out.println("O nome da sua especialidade é: " + esp.getNomeEspecialidade());
		System.out.println("===============================================================");

	}

}
