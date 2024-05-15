package com.financas.controlefinanceiro.usuario.application;

import com.financas.controlefinanceiro.usuario.domain.TipoUsuario;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.Value;

@Value
public class UsuarioRequest {
    @Email
    @NotBlank
    private String email;
    @NotEmpty
    @Size(min = 5)
    private String senha;
    private TipoUsuario tipoUsuario;
}
