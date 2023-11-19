package com.br.projetoClinica.testes;
import com.br.projetoClinica.classes.Consulta;


public class consultaTeste {

	public static void main(String[] args) {
		
		Consulta consulta = new  Consulta();
		
		consulta.setIdConsulta(01);
		consulta.setIdMedicoConsulta(01);
		consulta.setNomePacienteConsulta("Bryan Teixeira da Silva");
		consulta.setNomeMedicoConsulta("Italo Pacheco");
		consulta.setDescricaoConsulta("Exame de rotina");
		consulta.setDataConsulta("19/11/2023");
		
		
		System.out.println("===============================================================");
		System.out.println("Id da consulta: " + consulta.getIdConsulta());
		System.out.println(" ");
		System.out.println("Id do médico da consulta: " + consulta.getIdMedicoConsulta());
		System.out.println(" ");
		System.out.println("Nome do paciente da consulta: " + consulta.getNomePacienteConsulta());
		System.out.println(" ");
		System.out.println("Nome do médico da consulta: " + consulta.getNomeMedicoConsulta());
		System.out.println(" ");
		System.out.println("Descrição da Consulta: " + consulta.getDescricaoConsulta());
		System.out.println(" ");
		System.out.println("Data da consulta: " + consulta.getDataConsulta());
		System.out.println("===============================================================");

	}

}
