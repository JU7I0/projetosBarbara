package model;

import java.util.Date;

public class Espera {

	private long tempo = System.currentTimeMillis();
	private Date dataEHora = new Date(tempo );
	private String motivoEspera;
	
	
	public Espera(long tempo, Date dataEHora, String motivoEspera) {
		super();
		this.tempo = tempo;
		this.dataEHora = dataEHora;
		this.motivoEspera = motivoEspera;
	}


	public long getTempo() {
		return tempo;
	}


	public void setTempo(long tempo) {
		this.tempo = tempo;
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
	
	
}

