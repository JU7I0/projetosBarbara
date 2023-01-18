package model;

public abstract class Medico extends Funcionario{

	private String especialidade;
	private Integer numCRM;
	
	public Medico(Integer matricula, String cargo, String especialidade, Integer numCRM) {
		super(matricula, cargo);
		this.especialidade = especialidade;
		this.numCRM = numCRM;
	}

	public String getEspecialidade() {
		return especialidade;
	}

	public void setEspecialidade(String especialidade) {
		this.especialidade = especialidade;
	}

	public Integer getNumCRM() {
		return numCRM;
	}

	public void setNumCRM(Integer numCRM) {
		this.numCRM = numCRM;
	}
	
	public String realizarDiagnostico(Paciente paciente) {
		paciente.getSintomas();
	return new String("diagnostico");
	}
}
