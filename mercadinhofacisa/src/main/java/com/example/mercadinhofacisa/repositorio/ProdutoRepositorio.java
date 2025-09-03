package com.example.mercadinhofacisa.repositorio;
import com.example.mercadinhofacisa.modelo.Produto;
import org.springframework.data.jpa.repository.JpaRepository;
public interface ProdutoRepositorio extends JpaRepository<Produto, Long> {}
