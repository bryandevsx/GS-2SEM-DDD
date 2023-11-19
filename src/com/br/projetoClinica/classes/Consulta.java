package com.br.projetoClinica.classes;

public class Consulta {
	private int idConsulta;
    private int idMedicoConsulta;
    private String nomePacienteConsulta;
    private String nomeMedicoConsulta;
    private String descricaoConsulta;
    private String dataConsulta;
	
	//GET AND SET DE CADA ATRIBUTO:
    
    public int getIdConsulta() {
		return idConsulta;
	}
	public void setIdConsulta(int idConsulta) {
		this.idConsulta = idConsulta;
	}
	
	public int getIdMedicoConsulta() {
		return idMedicoConsulta;
	}
	public void setIdMedicoConsulta(int idMedicoConsulta) {
		this.idMedicoConsulta = idMedicoConsulta;
	}
	
	public String getNomePacienteConsulta() {
		return nomePacienteConsulta;
	}
	public void setNomePacienteConsulta(String nomePacienteConsulta) {
		this.nomePacienteConsulta = nomePacienteConsulta;
	}
	
	public String getNomeMedicoConsulta() {
		return nomeMedicoConsulta;
	}
	public void setNomeMedicoConsulta(String nomeMedicoConsulta) {
		this.nomeMedicoConsulta = nomeMedicoConsulta;
	}
	
	public String getDescricaoConsulta() {
		return descricaoConsulta;
	}
	public void setDescricaoConsulta(String descricaoConsulta) {
		this.descricaoConsulta = descricaoConsulta;
	}
	
	public String getDataConsulta() {
		return dataConsulta;
	}
	public void setDataConsulta(String dataConsulta) {
		this.dataConsulta = dataConsulta;
	}
    
    

}
