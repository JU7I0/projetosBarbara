package Repository;

import Model.PessoaFisica;

public interface ClientePessoaFisicaRepository extends Repository<PessoaFisica>{
	
	PessoaFisica consultarPorCpf(String cpf);
}
