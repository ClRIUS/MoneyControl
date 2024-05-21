package com.financas.controlefinanceiro.usuario.application.repository;

import com.financas.controlefinanceiro.usuario.domain.Usuario;

import java.util.List;

public interface UsuarioRepository {
    Usuario salva(Usuario usuario);
    List<Usuario> buscaTodosUsuarios();
}
