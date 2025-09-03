package com.example.mercadinhofacisa.servico;
import com.example.mercadinhofacisa.modelo.Produto;
import com.example.mercadinhofacisa.repositorio.ProdutoRepositorio;
import org.springframework.stereotype.Service;
import java.util.List;
@Service
public class ProdutoServico {
    private final ProdutoRepositorio repositorio;
    public ProdutoServico(ProdutoRepositorio repositorio){this.repositorio=repositorio;}
    public List<Produto> listarTodos(){return repositorio.findAll();}
    public Produto salvar(Produto p){return repositorio.save(p);}
    public Produto buscarPorId(Long id){return repositorio.findById(id).orElseThrow();}
    public void remover(Long id){repositorio.deleteById(id);}
}
