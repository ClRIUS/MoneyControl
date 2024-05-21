package com.financas.controlefinanceiro.usuario.application.infra;

import com.financas.controlefinanceiro.usuario.domain.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface UsuarioSpringDataRepository extends JpaRepository <Usuario, UUID> {
}
