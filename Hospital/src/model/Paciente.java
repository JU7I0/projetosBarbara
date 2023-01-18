package model;

import java.util.List;

public  class  Paciente extends Pessoa{
	
	private String cpf;
	private List<String>sintomas;
	private Double altura;
	private Double peso;
	private Boolean possuiAlergia;
	
	

	public Paciente(String cpf, List<String> sintomas, Double altura, Double peso, Boolean possuiAlergia) {
		super();
		this.cpf = cpf;
		this.sintomas = sintomas;
		this.altura = altura;
		this.peso = peso;
		this.possuiAlergia = possuiAlergia;

	}


	public String getCpf() {
		return cpf;
	}



	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public List<String> getSintomas() {
		return sintomas;
	}



	public void setSintomas(List<String> sintomas) {
		this.sintomas = sintomas;
	}



	public Double getAltura() {
		return altura;
	}



	public void setAltura(Double altura) {
		this.altura = altura;
	}



	public Double getPeso() {
		return peso;
	}



	public void setPeso(Double peso) {
		this.peso = peso;
	}



	public Boolean getPossuiAlergia() {
		return possuiAlergia;
	}



	public void setPossuiAlergia(Boolean possuiAlergia) {
		this.possuiAlergia = possuiAlergia;
	}
	

}
