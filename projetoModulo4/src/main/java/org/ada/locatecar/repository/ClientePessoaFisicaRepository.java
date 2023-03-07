package org.ada.locatecar.repository;

import java.util.Optional;

import org.ada.locatecar.model.PessoaFisica;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientePessoaFisicaRepository extends JpaRepository<PessoaFisica, Long> {
    
    Optional<PessoaFisica> findByCpf(String cpf);
}