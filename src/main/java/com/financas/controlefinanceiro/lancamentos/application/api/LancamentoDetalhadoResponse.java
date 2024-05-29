package com.financas.controlefinanceiro.lancamentos.application.api;

import com.financas.controlefinanceiro.lancamentos.domain.Categoria;
import com.financas.controlefinanceiro.lancamentos.domain.TipoLancamento;
import lombok.Value;

import java.time.LocalDateTime;
import java.util.UUID;

@Value
public class LancamentoDetalhadoResponse {
    private UUID idLancamento;
    private UUID idUsuarioLancamento;
    private TipoLancamento tipoLancamento;
    private Categoria categoria;
    private String descricao;
    private double valor;
    private LocalDateTime dataHoraLancamento;
    private LocalDateTime dataHoraUltimaAlteracao;
}
