package Model;

public class PessoaJuridica extends Cliente implements Entidade{
	
	private static final long serialVersionUID = 1L;
	
	private String cnpj;

	public PessoaJuridica(String cnpj, String nome, int idade, String tipo) {
		super(nome, idade, tipo);
		this.cnpj = cnpj;
	}

	@Override
	public String getId() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	

}
