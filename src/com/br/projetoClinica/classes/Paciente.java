package com.br.projetoClinica.classes;

public class Paciente {
	
	private int idPaciente;
    private String nomePaciente;
    private String telefonePaciente;
    private String rgPaciente;
    private String cpfPaciente;
    private String bairroPaciente;
    private String estadoPaciente;
    private String dataNascimentoPaciente;
	
    //GET AND SET DE CADA ATRIBUTO:
    
    public int getIdPaciente() {
		return idPaciente;
	}
	public void setIdPaciente(int idPaciente) {
		this.idPaciente = idPaciente;
	}
	
	public String getNomePaciente() {
		return nomePaciente;
	}
	public void setNomePaciente(String nomePaciente) {
		this.nomePaciente = nomePaciente;
	}
	
	public String getTelefonePaciente() {
		return telefonePaciente;
	}
	public void setTelefonePaciente(String telefonePaciente) {
		this.telefonePaciente = telefonePaciente;
	}
	
	public String getRgPaciente() {
		return rgPaciente;
	}
	public void setRgPaciente(String rgPaciente) {
		this.rgPaciente = rgPaciente;
	}
	
	public String getCpfPaciente() {
		return cpfPaciente;
	}
	public void setCpfPaciente(String cpfPaciente) {
		this.cpfPaciente = cpfPaciente;
	}
	
	public String getBairroPaciente() {
		return bairroPaciente;
	}
	public void setBairroPaciente(String bairroPaciente) {
		this.bairroPaciente = bairroPaciente;
	}
	
	public String getEstadoPaciente() {
		return estadoPaciente;
	}
	public void setEstadoPaciente(String estadoPaciente) {
		this.estadoPaciente = estadoPaciente;
	}
	
	public String getDataNascimentoPaciente() {
		return dataNascimentoPaciente;
	}
	public void setDataNascimentoPaciente(String dataNascimentoPaciente) {
		this.dataNascimentoPaciente = dataNascimentoPaciente;
	}
    
    
	
}
