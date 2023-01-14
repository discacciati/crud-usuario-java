package com.crudusuariojava.demo.repository;

import com.crudusuariojava.demo.model.Tarefa;
import com.crudusuariojava.demo.model.Usuario;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface TarefaRepository extends CrudRepository<Tarefa, Long> {
    List<Tarefa> findByUsuarioResponsavel(String filtro);
}
