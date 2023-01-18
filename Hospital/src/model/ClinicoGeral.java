package model;

public class ClinicoGeral extends Medico{

	private String area;
	private Integer numPaciente;
	
	
	public ClinicoGeral(Integer matricula, String cargo, String especialidade, Integer numCRM, String area,
			Integer numPaciente) {
		super(matricula, cargo, especialidade, numCRM);
		this.area = area;
		this.numPaciente = numPaciente;
	}


	public String getArea() {
		return area;
	}


	public void setArea(String area) {
		this.area = area;
	}


	public Integer getNumPaciente() {
		return numPaciente;
	}


	public void setNumPaciente(Integer numPaciente) {
		this.numPaciente = numPaciente;
	}
	
	
}
