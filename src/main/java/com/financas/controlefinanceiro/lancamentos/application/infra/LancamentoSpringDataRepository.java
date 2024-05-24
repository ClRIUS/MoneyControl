package com.financas.controlefinanceiro.lancamentos.application.infra;

import com.financas.controlefinanceiro.lancamentos.domain.Lancamentos;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface LancamentoSpringDataRepository extends JpaRepository<Lancamentos, UUID> {
}
