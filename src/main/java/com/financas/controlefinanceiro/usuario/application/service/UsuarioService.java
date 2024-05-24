package com.financas.controlefinanceiro.usuario.application.service;

import com.financas.controlefinanceiro.usuario.application.api.*;

import java.util.List;
import java.util.UUID;

public interface UsuarioService {
    UsuarioResponse criaUsuario(UsuarioRequest usuarioRequest);
    List<UsuarioListResponse> listaUsuarios();
    UsuarioDetalhadoResponse detalhaCadastroUsuario(UUID idUsuario);
    void alteraUsuario(UUID idUsuario, UsuarioAlteraRequest usuarioAlteraRequest);
    void deletaUsuario(UUID idUsuario);
}
