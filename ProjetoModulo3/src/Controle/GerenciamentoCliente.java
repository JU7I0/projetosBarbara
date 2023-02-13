package Controle;

import java.util.Objects;

import Controle.Exception.RegistroExistenteException;
import Model.PessoaFisica;
import Model.PessoaJuridica;
import Repository.ClientePessoaFisicaRepository;
import Repository.ClientePessoaJuridicaRepository;

public class GerenciamentoCliente {

	public static final String CLIENTE_DESCRICAO_CLASSE = "Autor";
	private final ClientePessoaFisicaRepository clienteRepositoryPf;
	private final ClientePessoaJuridicaRepository clienteRepositoryPj;

	public GerenciamentoCliente(ClientePessoaFisicaRepository clienteRepositoryPf, ClientePessoaJuridicaRepository clienteRepositoryPj) {
		super();
		this.clienteRepositoryPf = clienteRepositoryPf;
		this.clienteRepositoryPj = clienteRepositoryPj;
	}
	
	public PessoaFisica cadastrarClientePF(String nome, int idade, String tipo, String cpf) {
	
		if (Objects.nonNull(clienteRepositoryPf.consultarPorCpf(cpf))) {
            throw new RegistroExistenteException(CLIENTE_DESCRICAO_CLASSE, cpf);
        }

		PessoaFisica pessoaFisica = new PessoaFisica(cpf, nome, idade, tipo);
		clienteRepositoryPf.cadastrar(pessoaFisica);
		System.out.println("Cliente Pessoa Física " + nome + " com CPF " + cpf + " foi cadastrado com sucesso.");
        return pessoaFisica;
	}
	
	public PessoaJuridica cadastrarClientePJ(String nome, int idade, String tipo, String cnpj) {
		
		if (Objects.nonNull(clienteRepositoryPj.consultarPorCnpj(cnpj))) {
            throw new RegistroExistenteException(CLIENTE_DESCRICAO_CLASSE, cnpj);
        }
		PessoaJuridica pessoaJuridica = new PessoaJuridica(cnpj, nome, idade, tipo);
		clienteRepositoryPj.cadastrar(pessoaJuridica);
		System.out.println("Cliente Pessoa Jurídica " + nome + " com CNPJ " + cnpj + " foi cadastrado com sucesso.");
        return pessoaJuridica;
		
	}
	
	public PessoaFisica alterarClientePessoaFisica(String nome, int idade, String tipo, String cpf) {

       PessoaFisica pessoaFisica = clienteRepositoryPf.consultarPorCpf(cpf);
       
       pessoaFisica.setNome(nome);
       pessoaFisica.setIdade(idade);
       pessoaFisica.setTipoDeCliente(tipo);
       pessoaFisica.setCpf(cpf);
       
       clienteRepositoryPf.cadastrar(pessoaFisica);
       System.out.println("Cliente Pessoa Física " + nome + " com CPF " + cpf + " foi alterado com sucesso.");
       return pessoaFisica;
    }
	
	public PessoaJuridica alterarClientePessoaJuridica(String nome, int idade, String tipo, String cnpj) {

	   PessoaJuridica pessoaJuridica = clienteRepositoryPj.consultarPorCnpj(cnpj);
	       
	   pessoaJuridica.setNome(nome);
	   pessoaJuridica.setIdade(idade);
	   pessoaJuridica.setTipoDeCliente(tipo);
       pessoaJuridica.setCnpj(cnpj);
	       
       clienteRepositoryPj.cadastrar(pessoaJuridica);
       System.out.println("Cliente Pessoa Jurídica " + nome + " com CNPJ " + cnpj + " foi alterado com sucesso.");
	   return pessoaJuridica;
	}
	

}
