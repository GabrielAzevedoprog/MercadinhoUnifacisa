package com.example.mercadinhofacisa.modelo;
import jakarta.persistence.*;
import java.util.ArrayList;
import java.util.List;
@Entity
public class Carrinho {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    private List<ItemCarrinho> itens = new ArrayList<>();
    public Carrinho(){}
    public Long getId(){return id;}
    public void setId(Long id){this.id=id;}
    public List<ItemCarrinho> getItens(){return itens;}
    public void setItens(List<ItemCarrinho> itens){this.itens=itens;}
}
