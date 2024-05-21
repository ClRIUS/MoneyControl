package com.financas.controlefinanceiro.usuario.application.service;

import com.financas.controlefinanceiro.usuario.application.api.UsuarioListResponse;
import com.financas.controlefinanceiro.usuario.application.api.UsuarioRequest;
import com.financas.controlefinanceiro.usuario.application.api.UsuarioResponse;

import java.util.List;

public interface UsuarioService {
    UsuarioResponse criaUsuario(UsuarioRequest usuarioRequest);
    List<UsuarioListResponse> listaUsuarios();
}
