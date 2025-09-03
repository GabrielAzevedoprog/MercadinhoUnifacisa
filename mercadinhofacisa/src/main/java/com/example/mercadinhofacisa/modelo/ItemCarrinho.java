package com.example.mercadinhofacisa.modelo;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
@Entity
public class ItemCarrinho {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne private Produto produto;
    @NotNull private Integer quantidade;
    public ItemCarrinho(){}
    public ItemCarrinho(Produto produto,Integer quantidade){this.produto=produto;this.quantidade=quantidade;}
    public Long getId(){return id;}
    public void setId(Long id){this.id=id;}
    public Produto getProduto(){return produto;}
    public void setProduto(Produto produto){this.produto=produto;}
    public Integer getQuantidade(){return quantidade;}
    public void setQuantidade(Integer quantidade){this.quantidade=quantidade;}
}
