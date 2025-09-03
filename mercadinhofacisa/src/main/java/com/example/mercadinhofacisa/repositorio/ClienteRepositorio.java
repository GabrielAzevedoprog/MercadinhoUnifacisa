package com.example.mercadinhofacisa.repositorio;
import com.example.mercadinhofacisa.modelo.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
public interface ClienteRepositorio extends JpaRepository<Cliente, Long> {}
