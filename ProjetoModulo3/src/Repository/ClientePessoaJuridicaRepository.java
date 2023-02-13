package Repository;


import Model.PessoaJuridica;

public interface ClientePessoaJuridicaRepository extends Repository<PessoaJuridica>{

	PessoaJuridica consultarPorCnpj(String cnpj);
}
