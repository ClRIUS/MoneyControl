package com.financas.controlefinanceiro.usuario.service;

import com.financas.controlefinanceiro.usuario.application.UsuarioRequest;
import com.financas.controlefinanceiro.usuario.application.UsuarioResponse;

public interface UsuarioService {
    UsuarioResponse criaUsuario(UsuarioRequest usuarioRequest);
}
