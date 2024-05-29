package com.financas.controlefinanceiro.lancamentos.application.api;

import com.financas.controlefinanceiro.lancamentos.domain.Categoria;
import com.financas.controlefinanceiro.lancamentos.domain.Lancamentos;
import com.financas.controlefinanceiro.lancamentos.domain.TipoLancamento;
import lombok.Value;

import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

@Value
public class LancamentoListResponse {
    private UUID idLancamento;
    private TipoLancamento tipoLancamento;
    private Categoria categoria;
    private double valor;

    public static List<LancamentoListResponse> converte(List<Lancamentos> positivos) {
        return positivos.stream()
                .map(LancamentoListResponse::new)
                .collect(Collectors.toList());
    }

    public LancamentoListResponse(Lancamentos lancamentos) {
        this.tipoLancamento = lancamentos.getTipoLancamento();
        this.idLancamento = lancamentos.getIdLancamento();
        this.categoria = lancamentos.getCategoria();
        this.valor = lancamentos.getValor();
    }
}
