package com.example.mercadinhofacisa.servico;
import com.example.mercadinhofacisa.modelo.Carrinho;
import com.example.mercadinhofacisa.modelo.ItemCarrinho;
import com.example.mercadinhofacisa.repositorio.CarrinhoRepositorio;
import com.example.mercadinhofacisa.repositorio.ItemCarrinhoRepositorio;
import org.springframework.stereotype.Service;
import java.util.List;
@Service
public class CarrinhoServico {
    private final CarrinhoRepositorio carrinhoRepo;
    private final ItemCarrinhoRepositorio itemRepo;
    public CarrinhoServico(CarrinhoRepositorio cRepo, ItemCarrinhoRepositorio iRepo){this.carrinhoRepo=cRepo;this.itemRepo=iRepo;}
    public Carrinho criar(){return carrinhoRepo.save(new Carrinho());}
    public List<Carrinho> listar(){return carrinhoRepo.findAll();}
    public void adicionarItem(Carrinho carrinho, ItemCarrinho item){carrinho.getItens().add(item);carrinhoRepo.save(carrinho);}
    public void removerItem(Carrinho carrinho, ItemCarrinho item){carrinho.getItens().remove(item);carrinhoRepo.save(carrinho);}
}
