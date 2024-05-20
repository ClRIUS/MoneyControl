package com.financas.controlefinanceiro.usuario.application.service;

import com.financas.controlefinanceiro.usuario.application.api.UsuarioRequest;
import com.financas.controlefinanceiro.usuario.application.api.UsuarioResponse;

public interface UsuarioService {
    UsuarioResponse criaUsuario(UsuarioRequest usuarioRequest);
}
