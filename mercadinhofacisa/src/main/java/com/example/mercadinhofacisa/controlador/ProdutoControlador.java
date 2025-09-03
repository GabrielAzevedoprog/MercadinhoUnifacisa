package com.example.mercadinhofacisa.controlador;
import com.example.mercadinhofacisa.modelo.Produto;
import com.example.mercadinhofacisa.servico.ProdutoServico;
import org.springframework.web.bind.annotation.*;
import java.util.List;
@RestController
@RequestMapping("/produtos")
public class ProdutoControlador {
    private final ProdutoServico servico;
    public ProdutoControlador(ProdutoServico servico){this.servico=servico;}
    @GetMapping public List<Produto> listar(){return servico.listarTodos();}
    @PostMapping public Produto criar(@RequestBody Produto p){return servico.salvar(p);}
    @GetMapping("/{id}") public Produto buscar(@PathVariable Long id){return servico.buscarPorId(id);}
    @PutMapping("/{id}") public Produto atualizar(@PathVariable Long id,@RequestBody Produto p){
        Produto existente = servico.buscarPorId(id);
        existente.setNome(p.getNome());
        existente.setPreco(p.getPreco());
        return servico.salvar(existente);
    }
    @DeleteMapping("/{id}") public void remover(@PathVariable Long id){servico.remover(id);}
}
