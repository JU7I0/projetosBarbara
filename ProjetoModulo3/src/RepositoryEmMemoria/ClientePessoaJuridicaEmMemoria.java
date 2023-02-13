package RepositoryEmMemoria;

import java.util.ArrayList;
import java.util.List;

import Model.PessoaJuridica;
import Repository.ClientePessoaJuridicaRepository;

public class ClientePessoaJuridicaEmMemoria extends RepositoryEmMemoria<PessoaJuridica>
implements ClientePessoaJuridicaRepository{

	@Override
	public PessoaJuridica consultarPorCnpj(String cnpj) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}
