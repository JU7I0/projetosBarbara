package org.ada.locatecar.controller;

import java.util.List;
import java.util.Optional;


import org.ada.locatecar.model.Cliente;
import org.ada.locatecar.model.PessoaFisica;
import org.ada.locatecar.model.PessoaJuridica;
import org.ada.locatecar.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

@Controller
public class ClienteController {
    

    @Autowired
	private ClienteService clienteService;
    
    @GetMapping("/cliente")
    public String cliente(Model model) {
        List<Cliente> cliente = this.clienteService.listarTodos();
        model.addAttribute("cliente", cliente);
        return "cliente";
    }

    @GetMapping("/cliente/add")
    public String addCliente(Model model) {
        model.addAttribute("add", Boolean.TRUE);
        model.addAttribute("cliente", new Cliente());
        return "cliente-add";
    }
   
    @PostMapping("/clientePf/add")
    public String cadastrarPf(@ModelAttribute("clientePf") PessoaFisica pessoaFisica){
        this.clienteService.cadastrarPf(pessoaFisica);
        return "redirect:/cliente";
    }

    @PostMapping("/clientePj/add")
    public String cadastrarPj(@ModelAttribute("clientePj") PessoaJuridica pessoaJuridica){
        this.clienteService.cadastrarPj(pessoaJuridica);
        return "redirect:/cliente";
    }

    @GetMapping("/cliente/{clienteId}/delete")
    public String deletarClientePorId(@PathVariable("clienteId") Long Id) {
        this.clienteService.deletarClienteporId(Id);
        return "redirect:/cliente";
    }

    @GetMapping("/cliente/{clientePf}/edit")
    public String mostrarClientesPf(Model model, @PathVariable("clientePf") String cpf) {
        Optional<PessoaFisica> optionalClientePf = this.clienteService.buscarPorCpf(cpf);
        optionalClientePf.ifPresent(clientePf -> model.addAttribute("clientePf", clientePf));
        model.addAttribute("add", Boolean.FALSE);
        return "cliente-add";
    }

    @GetMapping("/cliente/{clientePj}/edit")
    public String mostrarClientesPj(Model model, @PathVariable("clientePj") String cnpj) {
        Optional<PessoaJuridica> optionalClientePj = this.clienteService.buscarPorCnpj(cnpj);
        optionalClientePj.ifPresent(clientePj -> model.addAttribute("clientePj", clientePj));
        model.addAttribute("add", Boolean.FALSE);
        return "cliente-add";
    }

    @PutMapping("/cliente/{clienteCpf}/edit")
    public String editarClientePf(@ModelAttribute("clienteCpf") PessoaFisica pessoaFisica,
                                @PathVariable("clienteCpf") String cpf) {
        pessoaFisica.setCpf(cpf);
        this.clienteService.cadastrarPf(pessoaFisica);
        return "redirect:/cliente";
    }

    @PutMapping("/cliente/{clienteCnpj}/edit")
    public String editarClientePj(@ModelAttribute("clienteCnpj") PessoaJuridica pessoaJuridica,
                                @PathVariable("clienteCnpj") String cnpj) {
        pessoaJuridica.setCnpj(cnpj);
        this.clienteService.cadastrarPj(pessoaJuridica);
        return "redirect:/cliente";
    }
}

