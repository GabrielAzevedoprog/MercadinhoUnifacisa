package com.example.mercadinhofacisa.servico;
import com.example.mercadinhofacisa.modelo.Cliente;
import com.example.mercadinhofacisa.repositorio.ClienteRepositorio;
import org.springframework.stereotype.Service;
import java.util.List;
@Service
public class ClienteServico {
    private final ClienteRepositorio repositorio;
    public ClienteServico(ClienteRepositorio repositorio){this.repositorio=repositorio;}
    public List<Cliente> listarTodos(){return repositorio.findAll();}
    public Cliente salvar(Cliente c){return repositorio.save(c);}
    public Cliente buscarPorId(Long id){return repositorio.findById(id).orElseThrow();}
    public void remover(Long id){repositorio.deleteById(id);}
}
