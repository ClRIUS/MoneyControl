package com.financas.controlefinanceiro.lancamentos.application.service;

import com.financas.controlefinanceiro.lancamentos.application.api.*;

import java.util.List;
import java.util.UUID;

public interface LancamentoService {
    LancamentoResponse novoLancamento(UUID idUsuario, LancamentoRequest lancamentoRequest);
    List<LancamentoListResponse> listaTodosLancamentos(UUID idUsuario);
    LancamentoDetalhadoResponse detalhaLancamentoPorId(UUID idUsuario, UUID idLancamento);
    void editaLancamentoUsuario(UUID idUsuario, UUID idLancamento, LancamentoAlteracaoRequest lancamentoAlteracaoRequest);
}
