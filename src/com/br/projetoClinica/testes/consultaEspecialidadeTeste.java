package com.br.projetoClinica.testes;
import com.br.projetoClinica.classes.consultaEspecialidade;


public class consultaEspecialidadeTeste {

	public static void main(String[] args) {
		
		consultaEspecialidade consultaEsp = new consultaEspecialidade();
		
		consultaEsp.setCodigoEspecialidade("X07C7A6823SC");
		consultaEsp.setNomeEspecialidade("RAIO-X");
		
		System.out.println("===============================================================");
		System.out.println("O código da consulta especializada é: " + consultaEsp.getCodigoEspecialidade());
		System.out.println(" ");
		System.out.println("Sua consulta especializada é: " + consultaEsp.getNomeEspecialidade());
		System.out.println("===============================================================");	

	}

}
