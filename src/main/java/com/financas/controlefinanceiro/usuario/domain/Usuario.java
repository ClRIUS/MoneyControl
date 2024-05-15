package com.financas.controlefinanceiro.usuario.domain;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import org.springframework.data.annotation.Id;

import java.util.UUID;

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
}
