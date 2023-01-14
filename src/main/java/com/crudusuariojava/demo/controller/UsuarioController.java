package com.crudusuariojava.demo.controller;

import com.crudusuariojava.demo.model.Usuario;
import com.crudusuariojava.demo.service.UsuarioService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/usuario")
public class UsuarioController {
    private final UsuarioService usuarioService;

    public UsuarioController(UsuarioService usuarioService) {
        this.usuarioService = usuarioService;
    }

    @PostMapping
    public Usuario salvar(@RequestBody Usuario usuario){
        return usuarioService.salvar(usuario);
    }

    @GetMapping
    public List<Usuario> listar(){
        return usuarioService.listar();
    }

    @GetMapping("/{id}")
    public Usuario buscarPorId(@PathVariable Long id){
        return usuarioService.buscarPorId(id);
    }

    @PutMapping("/{id}")
    public Usuario atualizarPorId(@RequestBody Usuario usuario , @PathVariable Long id){
        return usuarioService.atualizar(usuario, id);
    }

    @DeleteMapping("/{id}")
    public void deletarPorId(@PathVariable Long id){
        usuarioService.deletarPorId(id);
    }



}
