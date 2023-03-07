package org.ada.locatecar.config;

import org.ada.locatecar.model.PessoaFisica;
import org.ada.locatecar.model.PessoaJuridica;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SwaggrConfig {

    @Bean
    public PessoaFisica getCpf(){
        return new PessoaFisica();
    }
    @Bean
    public PessoaJuridica getCnpj(){
        return new PessoaJuridica();
    }
    
}
