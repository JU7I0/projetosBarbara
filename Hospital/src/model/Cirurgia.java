package model;

import java.util.Date;

public abstract class Cirurgia extends Atendimento{

	private Paciente paciente;
	private Cirurgiao cirurgiao;
	
	public Cirurgia(long tempo, Date dataEHora, String nomeMedico, Paciente paciente, Cirurgiao cirurgiao) {
		super(tempo, dataEHora, nomeMedico);
		this.paciente = paciente;
		this.cirurgiao = cirurgiao;
	}

	public Paciente getPaciente() {
		return paciente;
	}

	public void setPaciente(Paciente paciente) {
		this.paciente = paciente;
	}

	public Cirurgiao getCirurgiao() {
		return cirurgiao;
	}

	public void setCirurgiao(Cirurgiao cirurgiao) {
		this.cirurgiao = cirurgiao;
	}
	final public void realizarCirurgia() {
		
	}
	
}
