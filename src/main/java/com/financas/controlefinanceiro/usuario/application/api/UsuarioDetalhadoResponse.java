package com.financas.controlefinanceiro.usuario.application.api;

import com.financas.controlefinanceiro.usuario.domain.TipoUsuario;
import lombok.Value;

import java.util.UUID;

@Value
public class UsuarioDetalhadoResponse {
    private UUID idUsuario;
    private String email;
    private String senha;
    private TipoUsuario tipoUsuario;
}
