package com.example.mercadinhofacisa.controlador;
import com.example.mercadinhofacisa.modelo.Carrinho;
import com.example.mercadinhofacisa.modelo.ItemCarrinho;
import com.example.mercadinhofacisa.servico.CarrinhoServico;
import org.springframework.web.bind.annotation.*;
import java.util.List;
@RestController
@RequestMapping("/carrinhos")
public class CarrinhoControlador {
    private final CarrinhoServico servico;
    public CarrinhoControlador(CarrinhoServico servico){this.servico=servico;}
    @GetMapping public List<Carrinho> listar(){return servico.listar();}
    @PostMapping public Carrinho criar(){return servico.criar();}
    @PostMapping("/{id}/adicionar") public void adicionarItem(@PathVariable Long id,@RequestBody ItemCarrinho item){
        Carrinho c = servico.listar().stream().filter(x->x.getId().equals(id)).findFirst().orElseThrow();
        servico.adicionarItem(c,item);
    }
    @PostMapping("/{id}/remover") public void removerItem(@PathVariable Long id,@RequestBody ItemCarrinho item){
        Carrinho c = servico.listar().stream().filter(x->x.getId().equals(id)).findFirst().orElseThrow();
        servico.removerItem(c,item);
    }
}
