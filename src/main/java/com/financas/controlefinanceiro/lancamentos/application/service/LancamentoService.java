package com.financas.controlefinanceiro.lancamentos.application.service;

import com.financas.controlefinanceiro.lancamentos.application.api.LancamentoRequest;
import com.financas.controlefinanceiro.lancamentos.application.api.LancamentoResponse;

import java.util.UUID;

public interface LancamentoService {
    LancamentoResponse novoLancamento(UUID idUsuario, LancamentoRequest lancamentoRequest);
}
