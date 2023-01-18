package model;

public class Medico extends Funcionario{

	private String especialidade;
	private int numCRM;
	private Cirurgiao cirurgiao;
	private ClinicoGeral clinico;

	public Medico(String nome, int matricula, String cargo, String especialidade, int numCRM) {
		super(nome, matricula, cargo);
		this.especialidade = especialidade;
		this.numCRM = numCRM;
		
	}


	@Override
	public String toString() {
		return getNome()+" especialidade: " + especialidade + "\n, numº CRM:" + numCRM + ", numº da matricula:" + getMatricula();
	}


	public String realizarDiagnostico(Paciente paciente) {
		paciente.getSintomas();
	return new String("diagnostico");
	}

	public String getEspecialidade() {
		return especialidade;
	}

	public void setEspecialidade(String especialidade) {
		this.especialidade = especialidade;
	}

	public int getNumCRM() {
		return numCRM;
	}

	public void setNumCRM(int numCRM) {
		this.numCRM = numCRM;
	}


	public Cirurgiao getCirurgiao() {
		return cirurgiao;
	}


	public void setCirurgiao(Cirurgiao cirurgiao) {
		this.cirurgiao = cirurgiao;
	}


	public ClinicoGeral getClinico() {
		return clinico;
	}


	public void setClinico(ClinicoGeral clinico) {
		this.clinico = clinico;
	}
	
	

}
