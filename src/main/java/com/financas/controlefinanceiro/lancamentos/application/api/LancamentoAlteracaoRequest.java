package com.financas.controlefinanceiro.lancamentos.application.api;

import com.financas.controlefinanceiro.lancamentos.domain.Categoria;
import com.financas.controlefinanceiro.lancamentos.domain.TipoLancamento;
import jakarta.persistence.Column;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Value;

@Valid
@Value
public class LancamentoAlteracaoRequest {
    @NotNull
    private TipoLancamento tipoLancamento;
    @NotNull
    private Categoria categoria;
    @Size(max = 35)
    private String descricao;
    @NotNull
    @Column(scale = 2)
    private double valor;
}
