package spring.boot.desafio.nubank.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import spring.boot.desafio.nubank.model.Clientes;

public interface ClientesRepository extends JpaRepository<Clientes, Long> {
    
}
