package Model;

public class PessoaFisica extends Cliente implements Entidade{
	
	private static final long serialVersionUID = 1L;
	
	private String cpf;

	public PessoaFisica(String cpf, String nome, int idade, String tipo) {
		super(nome, idade, tipo);
		this.cpf = cpf;
	}

	@Override
	public String getId() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	

}
