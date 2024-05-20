package com.financas.controlefinanceiro.usuario.application.api;

import lombok.Builder;
import lombok.Value;

import java.util.UUID;

@Value
@Builder
public class UsuarioResponse {
    private UUID idUsuario;
}
