package org.ada.locatecar.repository;

import java.util.Optional;

import org.ada.locatecar.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Clientes extends JpaRepository<Cliente, Long>{
    
    public Optional<Cliente> findByCliente(Long id);
}
