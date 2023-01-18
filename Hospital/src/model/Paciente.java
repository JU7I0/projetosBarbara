package model;

import java.util.ArrayList;
import java.util.List;

public  class  Paciente extends Pessoa{
	
	private String cpf;
 private int idade;
	private double altura;
	private double peso;
	private boolean possuiAlergia;
	private List<String>sintomas;
	
	
	public Paciente(String nome, int idade, String cpf, double altura, double peso, boolean possuiAlergia) {
		super(nome);
		sintomas = new ArrayList<String>();
		this.cpf = cpf;
		this.idade = idade;
		this.altura = altura;
		this.peso = peso;
		this.possuiAlergia = possuiAlergia;
	}


	public void fazerTriagem(String sintomas) {
		this.sintomas.add(sintomas);
	}


	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public int getIdade() {
		return idade;
	}


	public void setIdade(int idade) {
		this.idade = idade;
	}


	public List<String> getSintomas() {
		return sintomas;
	}

	public void addSintomas(String sintoma) {
		this.sintomas.add(sintoma);
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public boolean getPossuiAlergia() {
		return possuiAlergia;
	}

	public void setPossuiAlergia(boolean possuiAlergia) {
		this.possuiAlergia = possuiAlergia;
	}

	@Override
	public String toString() {
		return "tem "+idade+" anos, portador do cpf: " + cpf + ", está com sintomas: " + sintomas + "\n, altura: " + altura + " metros, pesando: " + peso
				+ "kg, possuiAlergia: " + possuiAlergia;
	}
	
	
}
