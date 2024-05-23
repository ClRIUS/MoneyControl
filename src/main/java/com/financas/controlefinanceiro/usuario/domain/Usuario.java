package com.financas.controlefinanceiro.usuario.domain;

import com.financas.controlefinanceiro.usuario.application.api.UsuarioAlteraRequest;
import com.financas.controlefinanceiro.usuario.application.api.UsuarioRequest;
import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Getter
@Entity
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", updatable = false, unique = true, nullable = false)
    private UUID idUsuario;
    @Email
    @NotBlank
    private String email;
    @NotEmpty
    private String senha;
    private TipoUsuario tipoUsuario;

    public Usuario(UsuarioRequest usuarioRequest) {
        this.email = usuarioRequest.getEmail();
        this.senha = usuarioRequest.getSenha();
        this.tipoUsuario = usuarioRequest.getTipoUsuario();
    }
    public void alteraUsuario(UsuarioAlteraRequest usuarioAlteraRequest) {
        this.email = usuarioAlteraRequest.getEmail();
        this.senha = usuarioAlteraRequest.getSenha();
        this.tipoUsuario = usuarioAlteraRequest.getTipoUsuario();
    }
}
