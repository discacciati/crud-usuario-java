package com.crudusuariojava.demo.service;


import com.crudusuariojava.demo.model.Tarefa;
import com.crudusuariojava.demo.model.Usuario;
import com.crudusuariojava.demo.repository.TarefaRepository;
import com.crudusuariojava.demo.repository.UsuarioRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TarefaService {

    private final TarefaRepository tarefaRepository;


    public TarefaService(TarefaRepository tarefaRepository) {
        this.tarefaRepository = tarefaRepository;
    }

    public Tarefa salvar(Tarefa tarefa){
        return tarefaRepository.save(tarefa);
    }

    public List<Tarefa> listar(){
        return (List<Tarefa>) tarefaRepository.findAll();
    }

    public Tarefa buscarPorId(Long id){
        return tarefaRepository.findById(id).orElse(null);
    }

    public List<Tarefa> buscarPorUsuarioResponsavel(String filtro) {
        return (List<Tarefa>) tarefaRepository.findByUsuarioResponsavel(filtro);
    }

    public Tarefa atualizar(Tarefa tarefa, Long id){
        Tarefa tarefaFound = tarefaRepository.findById(id).orElse(null);

        tarefaFound.setDescricao(tarefa.getDescricao());
        tarefaFound.setStatus(tarefa.getStatus());
        tarefaFound.setDataDeCriacao(tarefa.getDataDeCriacao());
        tarefaFound.setDataDeVencimento(tarefa.getDataDeVencimento());
        tarefaFound.setPrioridade(tarefa.getPrioridade());
        tarefaFound.setUsuarioResponsavel(tarefa.getUsuarioResponsavel());
        tarefaFound.setCategoria(tarefa.getCategoria());
        tarefaFound.setEtiquetas(tarefa.getEtiquetas());

        tarefaRepository.save(tarefaFound);

        return tarefaFound;
    }

    public void deletarPorId(long id){
        tarefaRepository.deleteById(id);
    }

}
