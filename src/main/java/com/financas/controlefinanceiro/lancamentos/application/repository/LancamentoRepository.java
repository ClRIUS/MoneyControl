package com.financas.controlefinanceiro.lancamentos.application.repository;

import com.financas.controlefinanceiro.lancamentos.domain.Lancamentos;

import java.time.LocalDate;
import java.util.List;
import java.util.UUID;

public interface LancamentoRepository {
    Lancamentos salva(Lancamentos lancamentos);
    List<Lancamentos> listaTodosLancamentos(UUID idUsuario);
    Lancamentos buscaLancamentoId(UUID idLancamento);
    void deletaLancamentoPorId(UUID idLancamento);
    Double somaReceitas(UUID idUsuario, LocalDate dataInicial, LocalDate dataFinal);
    Double somaDespesas(UUID idUsuario, LocalDate dataInicial, LocalDate dataFinal);
}
