package com.financas.controlefinanceiro.usuario.application.api;

import com.financas.controlefinanceiro.usuario.domain.TipoUsuario;
import lombok.Value;

import java.util.UUID;

@Value
public class UsuarioListResponse {
    private UUID idUsuario;
    private String email;
    private TipoUsuario tipoUsuario;
}
