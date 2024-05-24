package com.financas.controlefinanceiro.lancamentos.application.repository;

import com.financas.controlefinanceiro.lancamentos.domain.Lancamentos;

public interface LancamentoRepository {
    Lancamentos salva(Lancamentos lancamentos);
}
