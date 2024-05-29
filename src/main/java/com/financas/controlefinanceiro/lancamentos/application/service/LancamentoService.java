package com.financas.controlefinanceiro.lancamentos.application.service;

import com.financas.controlefinanceiro.lancamentos.application.api.LancamentoDetalhadoResponse;
import com.financas.controlefinanceiro.lancamentos.application.api.LancamentoListResponse;
import com.financas.controlefinanceiro.lancamentos.application.api.LancamentoRequest;
import com.financas.controlefinanceiro.lancamentos.application.api.LancamentoResponse;

import java.util.List;
import java.util.UUID;

public interface LancamentoService {
    LancamentoResponse novoLancamento(UUID idUsuario, LancamentoRequest lancamentoRequest);
    List<LancamentoListResponse> listaTodosLancamentos(UUID idUsuario);
    LancamentoDetalhadoResponse detalhaLancamentoPorId(UUID idUsuario, UUID idLancamento);
}
