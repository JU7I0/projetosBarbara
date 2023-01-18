package model;

import java.util.Date;

public abstract class Espera {

	private Date dataEHora;
	private String motivoEspera;
	
	
	public Espera(Date dataEHora, String motivoEspera) {
		super();
		this.dataEHora = dataEHora;
		this.motivoEspera = motivoEspera;
	}


	public Date getDataEHora() {
		return dataEHora;
	}


	public void setDataEHora(Date dataEHora) {
		this.dataEHora = dataEHora;
	}


	public String getMotivoEspera() {
		return motivoEspera;
	}


	public void setMotivoEspera(String motivoEspera) {
		this.motivoEspera = motivoEspera;
	}
	public void reservarSala() {
		
	}
	
}

