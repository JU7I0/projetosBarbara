package model;

public class Cirurgiao extends Medico{
	
	private String atuacao;
	private Integer numCirurgia;
	
	
	public Cirurgiao(Integer matricula, String cargo, String especialidade, Integer numCRM, String atuacao,
			Integer numCirurgia) {
		super(matricula, cargo, especialidade, numCRM);
		this.atuacao = atuacao;
		this.numCirurgia = numCirurgia;
	}

	public String getAtuacao() {
		return atuacao;
	}

	public void setAtuacao(String atuacao) {
		this.atuacao = atuacao;
	}

	public Integer getNumCirurgia() {
		return numCirurgia;
	}

	public void setNumCirurgia(Integer numCirurgia) {
		this.numCirurgia = numCirurgia;
	}
	
	

	
}
