package model;

public class Atendente extends Funcionario{

	private int pacientesAtendidos;
	private String experiencia;
	
	public Atendente(String nome, int matricula, String cargo, int pacientesAtendidos,
			String experiencia) {
		super(nome, matricula, cargo);
		this.pacientesAtendidos = pacientesAtendidos;
		this.experiencia = experiencia;
	}
	
	public int getPacientesAtendidos() {
		return pacientesAtendidos;
	}

	public void setPacientesAtendidos(int pacientesAtendidos) {
		this.pacientesAtendidos = pacientesAtendidos;
	}

	public String getExperiencia() {
		return experiencia;
	}


	public void setExperiencia(String experiencia) {
		this.experiencia = experiencia;
	}


	public void iniciarAtendimento(Paciente paciente) {
		
	}
	
	
	
	
}
