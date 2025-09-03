package com.example.mercadinhofacisa.controlador;
import com.example.mercadinhofacisa.modelo.Cliente;
import com.example.mercadinhofacisa.servico.ClienteServico;
import org.springframework.web.bind.annotation.*;
import java.util.List;
@RestController
@RequestMapping("/clientes")
public class ClienteControlador {
    private final ClienteServico servico;
    public ClienteControlador(ClienteServico servico){this.servico=servico;}
    @GetMapping public List<Cliente> listar(){return servico.listarTodos();}
    @PostMapping public Cliente criar(@RequestBody Cliente c){return servico.salvar(c);}
    @GetMapping("/{id}") public Cliente buscar(@PathVariable Long id){return servico.buscarPorId(id);}
    @PutMapping("/{id}") public Cliente atualizar(@PathVariable Long id,@RequestBody Cliente c){
        Cliente existente = servico.buscarPorId(id);
        existente.setNome(c.getNome());
        return servico.salvar(existente);
    }
    @DeleteMapping("/{id}") public void remover(@PathVariable Long id){servico.remover(id);}
}
