package model;

import java.util.Date;

public abstract class Atendimento {
	
	private long tempo = System.currentTimeMillis();
	private Date dataEHora = new Date(tempo );
	private String nomeMedico;
	
	
	public Atendimento(long tempo, Date dataEHora, String nomeMedico) {
		super();
		this.tempo = tempo;
		this.dataEHora = dataEHora;
		this.nomeMedico = nomeMedico;
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


	public String getNomeMedico() {
		return nomeMedico;
	}


	public void setNomeMedico(String nomeMedico) {
		this.nomeMedico = nomeMedico;
	}
	
	public abstract void agendarAtendimento();
	
	

	
}
