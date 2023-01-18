package model;

public class Funcionario extends Pessoa{

	private int matricula;
	private String cargo;
	private Medico medico;
	private Atendente atendente;
	
	public Funcionario(String nome, int matricula, String cargo) {
		super(nome);
		this.matricula = matricula;
		this.cargo = cargo;
		
	}

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public Medico getMedico() {
		return medico;
	}

	public void setMedico(Medico medico) {
		this.medico = medico;
	}

	public Atendente getAtendente() {
		return atendente;
	}

	public void setAtendente(Atendente atendente) {
		this.atendente = atendente;
	}

	
	
}
