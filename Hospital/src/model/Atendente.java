package model;

public class Atendente extends Funcionario{

	private Integer pacientesAtendidos;
	private String experiencia;
	
	
	public Atendente(Integer matricula, String cargo, Integer pacientesAtendidos, String experiencia) {
		super(matricula, cargo);
		this.pacientesAtendidos = pacientesAtendidos;
		this.experiencia = experiencia;
	}


	public Integer getPacientesAtendidos() {
		return pacientesAtendidos;
	}


	public void setPacientesAtendidos(Integer pacientesAtendidos) {
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
