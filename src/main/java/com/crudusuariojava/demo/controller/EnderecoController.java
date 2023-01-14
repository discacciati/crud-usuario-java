package com.crudusuariojava.demo.controller;

import com.crudusuariojava.demo.model.Endereco;
import com.crudusuariojava.demo.model.Tarefa;
import com.crudusuariojava.demo.model.Usuario;
import com.crudusuariojava.demo.service.EnderecoService;
import org.springframework.web.bind.annotation.*;

@RestController
public class EnderecoController {
    private final EnderecoService enderecoService;

    public EnderecoController(EnderecoService enderecoService) {
        this.enderecoService = enderecoService;
    }

    @GetMapping("/{id}")
    public Endereco buscarPorId(@PathVariable Long id){
        return enderecoService.buscarPorId(id);
    }

    @PutMapping()
    public Endereco atualizarPorId(@RequestBody Endereco endereco , @PathVariable Long id){
        return enderecoService.atualizar(endereco, id);
    }

}
