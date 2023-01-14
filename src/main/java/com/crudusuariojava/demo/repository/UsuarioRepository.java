package com.crudusuariojava.demo.repository;

import com.crudusuariojava.demo.model.Usuario;
import org.springframework.data.repository.CrudRepository;

public interface UsuarioRepository extends CrudRepository<Usuario, Long> {

}
