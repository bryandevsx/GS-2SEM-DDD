package com.br.projetoClinica.classes;

public class Medico {

	private int idMedico;
	private String crmMedico;
	private String nomeMedico;
	private String telefoneMedico;
	private String especialidadeMedico;
	
	//GET AND SET DE CADA ATRIBUTO:
	
	public int getIdMedico() {
		return idMedico;
	}
	public void setIdMedico(int idMedico) {
		this.idMedico = idMedico;
	}
	
	public String getCrmMedico() {
		return crmMedico;
	}
	public void setCrmMedico(String crmMedico) {
		this.crmMedico = crmMedico;
	}
	
	public String getNomeMedico() {
		return nomeMedico;
	}
	public void setNomeMedico(String nomeMedico) {
		this.nomeMedico = nomeMedico;
	}
	
	public String getTelefoneMedico() {
		return telefoneMedico;
	}
	public void setTelefoneMedico(String telefoneMedico) {
		this.telefoneMedico = telefoneMedico;
	}
	
	public String getEspecialidadeMedico() {
		return especialidadeMedico;
	}
	public void setEspecialidadeMedico(String especialidadeMedico) {
		this.especialidadeMedico = especialidadeMedico;
	}
	

}
