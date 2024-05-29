package com.financas.controlefinanceiro.lancamentos.application.repository;

import com.financas.controlefinanceiro.lancamentos.domain.Lancamentos;

import java.util.List;

public interface LancamentoRepository {
    Lancamentos salva(Lancamentos lancamentos);
    List<Lancamentos> listaTodosLancamentos();
}
