package com.financas.controlefinanceiro.lancamentos.application.api;

import lombok.Value;

import java.util.UUID;

@Value
public class LancamentoResponse {
    private UUID idUsuarioLancamento;
}
