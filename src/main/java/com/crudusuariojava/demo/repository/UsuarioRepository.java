package com.crudusuariojava.demo.repository;

import com.crudusuariojava.demo.model.Usuario;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface UsuarioRepository extends CrudRepository<Usuario, Long> {

    List<Usuario> findByNome(String filtro);
}
