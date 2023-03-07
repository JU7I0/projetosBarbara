package org.ada.locatecar.controller;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

import org.ada.locatecar.PessoaFisicaDTO;
import org.ada.locatecar.PessoaJuridicaDTO;
import org.ada.locatecar.model.Cliente;
import org.ada.locatecar.model.PessoaFisica;
import org.ada.locatecar.model.PessoaJuridica;
import org.ada.locatecar.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.validation.Valid;


@RestController
@RequestMapping("/cliente")
public class ClienteController {
    

    @Autowired
	private ClienteService clienteService;
    
	
    @PostMapping("/cadastrarPf")
    public ResponseEntity<String> cadastrarPf(@Valid @RequestBody PessoaFisicaDTO pessoaFisica){
    try{

        PessoaFisica pessoaFisicaDB = PessoaFisica.builder()
                .nome(pessoaFisica.getNome())
                .idade(pessoaFisica.getIdade())
                .cpf(pessoaFisica.getCpf())
                .build();

            this.clienteService.cadastrarPf(pessoaFisicaDB);

            return ResponseEntity
            .status(HttpStatus.CREATED).body("Pessoa Física cadastrada!");

        } catch (Exception e) {
            return ResponseEntity.badRequest().build();
        }
    }

    @PostMapping("/cadastrarPj")
    public ResponseEntity<String> cadastrarPj(@Valid @RequestBody PessoaJuridicaDTO pessoaJuridica){
    try{

        PessoaJuridica pessoaJuridicaDB = PessoaJuridica.builder()
                .nome(pessoaJuridica.getNome())
                .idade(pessoaJuridica.getIdade())
                .cnpj(pessoaJuridica.getCnpj())
                .build();

            this.clienteService.cadastrarPj(pessoaJuridicaDB);

            return ResponseEntity
            .status(HttpStatus.CREATED).body("Pessoa Juridica cadastrada!");

        } catch (Exception e) {
            return ResponseEntity.badRequest().build();
        }
    }

    @GetMapping("/todos")
    public List<Cliente> listarTodos() {
        return this.clienteService.listarTodos();
    }

    @GetMapping("/by/{cpf}")
    public ResponseEntity<Cliente> buscarPorCpf(@PathVariable String cpf) {

        Optional<PessoaFisica> optionalClientePf = this.clienteService.buscarPorCpf(cpf);

        if (optionalClientePf.isPresent()) {
            return ResponseEntity.ok(optionalClientePf.get());
        }

        return ResponseEntity.status(HttpStatus.NO_CONTENT).build();

    }
    @GetMapping("/by/{cnpj}")
    public ResponseEntity<Cliente> buscarPorCnpj(@PathVariable String cnpj) {

        Optional<PessoaJuridica> optionalClientePj = this.clienteService.buscarPorCnpj(cnpj);

        if (optionalClientePj.isPresent()) {
            return ResponseEntity.ok(optionalClientePj.get());
        }

        return ResponseEntity.status(HttpStatus.NO_CONTENT).build();

    }
    @PutMapping("/Atualizarcpf")
    public ResponseEntity<String> atualizarCpf(@RequestBody PessoaFisicaDTO pessoaFisica){
       
        try{
            Optional<PessoaFisica> optionalPf = this.clienteService.buscarPorCpf(pessoaFisica.getCpf());
            
            if (optionalPf.isPresent()){

                PessoaFisica pessoaFisicaDB = optionalPf.get();
                PessoaFisica pessoaFisicaAtualizar = PessoaFisica.builder()
                .cpf(pessoaFisicaDB.getCpf())
                .nome(pessoaFisica.getNome())
                .idade(pessoaFisica.getIdade())
                .build();

                this.clienteService.cadastrarPf(pessoaFisicaAtualizar);
                return ResponseEntity.ok("Atualizado com sucesso!");
            } 
            return ResponseEntity
            .status(HttpStatus.NO_CONTENT).build();

        } catch (Exception e) {

         return ResponseEntity.badRequest().build();
        }

   }
   @PutMapping("/Atualizarcnpj")
    public ResponseEntity<String> atualizarCnpj(@RequestBody PessoaJuridicaDTO pessoaJuridica){
       
        try{
            Optional<PessoaJuridica> optionalPj = this.clienteService.buscarPorCnpj(pessoaJuridica.getCnpj());
            
            if (optionalPj.isPresent()){

                PessoaJuridica pessoaJuridicaDB = optionalPj.get();
                PessoaJuridica pessoaJuridicaAtualizar = PessoaJuridica.builder()
                .cnpj(pessoaJuridicaDB.getCnpj())
                .nome(pessoaJuridica.getNome())
                .idade(pessoaJuridica.getIdade())
                .build();

                this.clienteService.cadastrarPj(pessoaJuridicaAtualizar);
                return ResponseEntity.ok("Atualizado com sucesso!");
            } 
            return ResponseEntity
            .status(HttpStatus.NO_CONTENT).build();

        } catch (Exception e) {

         return ResponseEntity.badRequest().build();
        }

       }

    @DeleteMapping("/{id}")
    public void deletarClientePorId(@PathVariable Long id){
        this.clienteService.deletarClienteporId(id);
    }
}
