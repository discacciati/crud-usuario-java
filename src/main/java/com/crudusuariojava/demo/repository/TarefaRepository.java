package com.crudusuariojava.demo.repository;

import com.crudusuariojava.demo.model.Tarefa;
import org.springframework.data.repository.CrudRepository;

public interface TarefaRepository extends CrudRepository<Tarefa, Long> {
}
