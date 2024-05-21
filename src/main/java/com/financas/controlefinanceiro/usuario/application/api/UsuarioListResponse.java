package com.financas.controlefinanceiro.usuario.application.api;

import com.financas.controlefinanceiro.usuario.domain.TipoUsuario;
import com.financas.controlefinanceiro.usuario.domain.Usuario;
import lombok.Value;

import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

@Value
public class UsuarioListResponse {
    private UUID idUsuario;
    private String email;

    public static List<UsuarioListResponse> converte(List<Usuario> usuarios) {
        return usuarios.stream()
                .map(UsuarioListResponse::new)
                .collect(Collectors.toList());
    }

    public UsuarioListResponse(Usuario usuario) {
        this.idUsuario = usuario.getIdUsuario();
        this.email = usuario.getEmail();
    }
}
