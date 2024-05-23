package com.financas.controlefinanceiro.usuario.application.repository;

import com.financas.controlefinanceiro.usuario.domain.Usuario;

import java.util.List;
import java.util.UUID;

public interface UsuarioRepository {
    Usuario salva(Usuario usuario);
    List<Usuario> buscaTodosUsuarios();
    Usuario buscaUsuario(UUID idUsuario);
}
