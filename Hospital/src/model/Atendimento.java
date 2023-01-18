package model;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Atendimento {
	
	
	private LocalDateTime dataEHora;
	
	
	public Atendimento(LocalDateTime dataEHora) {
		super();
		this.dataEHora = dataEHora;
		
	}

	@Override
	public String toString() {
		return " data e hora:" + dataEHora;
	}


	public LocalDateTime getDataEHora() {
		return dataEHora;
	}

	public void setDataEHora(LocalDateTime dataEHora) {
		this.dataEHora = dataEHora;
	}

	public void agendarAtendimento() {
	}
	

}
