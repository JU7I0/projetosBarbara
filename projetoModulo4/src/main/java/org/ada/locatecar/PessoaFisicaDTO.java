package org.ada.locatecar;

import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PessoaFisicaDTO {
    
    private String nome;
	private int idade;
    @NotBlank(message = "Preencher o campo")
    private String cpf;
}
