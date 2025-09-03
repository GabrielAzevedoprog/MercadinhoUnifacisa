package com.example.mercadinhofacisa.modelo;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
@Entity
public class Cliente {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotBlank private String nome;
    public Cliente(){}
    public Cliente(Long id,String nome){this.id=id;this.nome=nome;}
    public Long getId(){return id;}
    public void setId(Long id){this.id=id;}
    public String getNome(){return nome;}
    public void setNome(String nome){this.nome=nome;}
}
