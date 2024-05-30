package com.financas.controlefinanceiro.lancamentos.application.api;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import lombok.Value;

import java.time.LocalDate;

@Valid
@Value
public class SomaLancamentosRequest {
    @NotNull
    private LocalDate dataInicial;
    @NotNull
    private LocalDate dataFinal;
}
