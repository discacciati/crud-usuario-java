package com.crudusuariojava.demo.service;

import com.crudusuariojava.demo.model.Endereco;
import com.crudusuariojava.demo.model.Tarefa;
import com.crudusuariojava.demo.model.Usuario;
import com.crudusuariojava.demo.repository.EnderecoRepository;
import org.springframework.stereotype.Service;

@Service
public class EnderecoService {

    private final EnderecoRepository enderecoRepository;

    public EnderecoService(EnderecoRepository enderecoRepository) {
        this.enderecoRepository = enderecoRepository;
    }

    public Endereco buscarPorId(Long id){
        return enderecoRepository.findById(id).orElse(null);
    }
    public Endereco atualizar(Endereco endereco, Long id){
        Endereco enderecoFound = enderecoRepository.findById(id).orElse(null);

        enderecoFound.setCep(endereco.getCep());
        enderecoFound.setLogradouro(endereco.getLogradouro());
        enderecoFound.setNumero(endereco.getNumero());
        enderecoFound.setCidade(endereco.getCidade());
        enderecoFound.setEstado(endereco.getEstado());

        enderecoRepository.save(enderecoFound);

        return enderecoFound;
    }


}
