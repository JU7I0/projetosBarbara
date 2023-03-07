package org.ada.locatecar.service;

import java.util.List;
import java.util.Optional;

import org.ada.locatecar.model.Cliente;
import org.ada.locatecar.model.PessoaFisica;
import org.ada.locatecar.model.PessoaJuridica;
import org.ada.locatecar.repository.ClientePessoaFisicaRepository;
import org.ada.locatecar.repository.ClientePessoaJuridicaRepository;
import org.ada.locatecar.repository.Clientes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClienteService {

    @Autowired
    private ClientePessoaFisicaRepository clienteRepositoryPf;

    @Autowired
    private  ClientePessoaJuridicaRepository clienteRepositoryPj;

    @Autowired
    private Clientes clienteRepository;

    public void cadastrarPf(PessoaFisica pessoaFisica){
        this.clienteRepositoryPf.save(pessoaFisica);
    }
    public void cadastrarPj(PessoaJuridica pessoaJuridica){
        this.clienteRepositoryPj.save(pessoaJuridica);
    }
    public List<Cliente> listarTodos(){
        return this.clienteRepository.findAll();
    }
    public Optional<PessoaFisica> buscarPorCpf(String cpf){
        return this.clienteRepositoryPf.findByCpf(cpf);
    }
    public Optional<PessoaJuridica> buscarPorCnpj(String cnpj){
        return this.clienteRepositoryPj.findByCnpj(cnpj);
    }
    public void deletarClienteporId(Long id){
        this.clienteRepository.deleteById(id);
    }
   
}
