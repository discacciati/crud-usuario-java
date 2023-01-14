package com.crudusuariojava.demo.controller;

import com.crudusuariojava.demo.model.Tarefa;
import com.crudusuariojava.demo.model.Usuario;
import com.crudusuariojava.demo.service.TarefaService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tarefa")
public class TarefaController {

    private final TarefaService tarefaService;

    public TarefaController(TarefaService tarefaService) {
        this.tarefaService = tarefaService;
    }

    @PostMapping
    public Tarefa salvar(@RequestBody Tarefa tarefa){
        return tarefaService.salvar(tarefa);
    }

    @GetMapping
    public List<Tarefa> listar(){
        return tarefaService.listar();
    }

    @GetMapping("/{usuarioResponsavel}")
    public List<Tarefa> buscarPorUsuarioResponsavel(@RequestParam String nome) {
        return tarefaService.buscarPorUsuarioResponsavel(nome);
    }

    @GetMapping("/{id}")
    public Tarefa buscarPorId(@PathVariable Long id){
        return tarefaService.buscarPorId(id);
    }

    @PutMapping("/{id}")
    public Tarefa atualizarPorId(@RequestBody Tarefa tarefa , @PathVariable Long id){
        return tarefaService.atualizar(tarefa, id);
    }

    @DeleteMapping("/{id}")
    public void deletarPorId(@PathVariable Long id){
        tarefaService.deletarPorId(id);
    }


}
