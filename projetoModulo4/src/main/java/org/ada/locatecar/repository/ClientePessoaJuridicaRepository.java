package org.ada.locatecar.repository;

import java.util.Optional;

import org.ada.locatecar.model.PessoaJuridica;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientePessoaJuridicaRepository extends JpaRepository<PessoaJuridica, Long> {
    
    Optional<PessoaJuridica> findByCnpj(String cnpj);
}
