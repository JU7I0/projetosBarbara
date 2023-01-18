package model;

public class Sala {

	private int numSala;
	private String tipoSala;
	
	public Sala(int numSala, String tipoSala) {
		super();
		this.numSala = numSala;
		this.tipoSala = tipoSala;
	}

	
	@Override
	public String toString() {
		return numSala +", do tipo: " + tipoSala;
	}


	public int getNumSala() {
		return numSala;
	}

	public void setNumSala(int numSala) {
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
