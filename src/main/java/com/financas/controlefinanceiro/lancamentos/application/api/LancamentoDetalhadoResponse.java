package com.financas.controlefinanceiro.lancamentos.application.api;

import com.financas.controlefinanceiro.lancamentos.domain.Categoria;
import com.financas.controlefinanceiro.lancamentos.domain.Lancamentos;
import com.financas.controlefinanceiro.lancamentos.domain.TipoLancamento;
import lombok.Value;

import java.time.LocalDate;
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
    private LocalDate dataLancamento;
    private LocalDateTime dataHoraUltimaAlteracao;

    public LancamentoDetalhadoResponse(Lancamentos lancamento) {
        this.idLancamento = lancamento.getIdLancamento();
        this.idUsuarioLancamento = lancamento.getIdLancamento();
        this.tipoLancamento = lancamento.getTipoLancamento();
        this.categoria = lancamento.getCategoria();
        this.descricao = lancamento.getDescricao();
        this.valor = lancamento.getValor();
        this.dataLancamento = lancamento.getDataLancamento();
        this.dataHoraUltimaAlteracao = lancamento.getDataHoraUltimaAlteracao();
    }
}
