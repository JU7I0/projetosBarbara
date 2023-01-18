package model;

public class Cirurgiao extends Medico{
	
	private String atuacao;
	private int numCirurgia;
	
	public Cirurgiao(String nome, int matricula, String cargo, String especialidade, int numCRM, String atuacao,
			int numCirurgia) {
		super(nome, matricula, cargo, especialidade, numCRM);
		this.atuacao = atuacao;
		this.numCirurgia = numCirurgia;
	}

	
	public String getAtuacao() {
		return atuacao;
	}

	public void setAtuacao(String atuacao) {
		this.atuacao = atuacao;
	}

	public int getNumCirurgia() {
		return numCirurgia;
	}

	public void setNumCirurgia(int numCirurgia) {
		this.numCirurgia = numCirurgia;
	}

	final public void realizarCirurgia() {
	}
	
}
