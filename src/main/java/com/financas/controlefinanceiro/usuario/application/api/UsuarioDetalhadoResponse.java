package com.financas.controlefinanceiro.usuario.application.api;

import com.financas.controlefinanceiro.usuario.domain.TipoUsuario;
import com.financas.controlefinanceiro.usuario.domain.Usuario;
import lombok.Value;

import java.util.UUID;

@Value
public class UsuarioDetalhadoResponse {
    private UUID idUsuario;
    private String email;
    private String senha;
    private TipoUsuario tipoUsuario;

    public UsuarioDetalhadoResponse(Usuario usuario) {
        this.idUsuario = usuario.getIdUsuario();
        this.email = usuario.getEmail();
        this.senha = usuario.getSenha();
        this.tipoUsuario = usuario.getTipoUsuario();
    }
}
