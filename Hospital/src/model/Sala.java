package model;

public class Sala {

	private Integer numSala;
	private String tipoSala;
	
	public Sala(Integer numSala, String tipoSala) {
		super();
		this.numSala = numSala;
		this.tipoSala = tipoSala;
	}

	public Integer getNumSala() {
		return numSala;
	}

	public void setNumSala(Integer numSala) {
		this.numSala = numSala;
	}

	public String getTipoSala() {
		return tipoSala;
	}

	public void setTipoSala(String tipoSala) {
		this.tipoSala = tipoSala;
	}
	
	public void reservar(int dia, int mes, int ano) {
		
	}
}
