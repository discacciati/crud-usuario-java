package com.crudusuariojava.demo.service;

import com.crudusuariojava.demo.model.Usuario;
import com.crudusuariojava.demo.repository.UsuarioRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioService {

    private final UsuarioRepository usuarioRepository;


    public UsuarioService(UsuarioRepository usuarioRepository) {
        this.usuarioRepository = usuarioRepository;
    }

    public Usuario salvar(Usuario usuario){
        return usuarioRepository.save(usuario);
    }

    public List<Usuario> listar(){
        return (List<Usuario>) usuarioRepository.findAll();
    }

    public Usuario buscarPorId(Long id){
        return usuarioRepository.findById(id).orElse(null);
    }


    public Usuario atualizar(Usuario usuario, Long id){
        Usuario usuarioFound = usuarioRepository.findById(id).orElse(null);

        usuarioFound.setNomeDeUsuario(usuario.getNomeDeUsuario());
        usuarioFound.setNome(usuario.getNome());
        usuarioFound.setSenha(usuario.getSenha());
        usuarioFound.setEmail(usuario.getEmail());
        usuarioFound.setDataNascimento(usuario.getDataNascimento());
        usuarioFound.setGenero(usuario.getGenero());
        usuarioFound.setNumeroTelefone(usuario.getNumeroTelefone());

        usuarioRepository.save(usuarioFound);

        return usuarioFound;
    }

    public void deletarPorId(long id){
        usuarioRepository.deleteById(id);
    }


}
