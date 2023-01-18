package model;

public class Funcionario extends Pessoa{

	private Integer matricula;
	private String cargo;
	
	public Funcionario(Integer matricula, String cargo) {
		super();
		this.matricula = matricula;
		this.cargo = cargo;
	}

	public Integer getMatricula() {
		return matricula;
	}

	public void setMatricula(Integer matricula) {
		this.matricula = matricula;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	
	
	
	
}
