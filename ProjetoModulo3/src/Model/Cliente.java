package Model;

public class Cliente{
	
	private String nome;
	private int idade;
	private String tipoDeCliente;
	
	public Cliente() {
		super();
	}

	public Cliente(String nome, int idade, String tipoDeCliente) {
		super();
		this.nome = nome;
		this.idade = idade;
		this.tipoDeCliente = tipoDeCliente;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getTipoDeCliente() {
		return tipoDeCliente;
	}

	public void setTipoDeCliente(String tipoDeCliente) {
		this.tipoDeCliente = tipoDeCliente;
	}
}
