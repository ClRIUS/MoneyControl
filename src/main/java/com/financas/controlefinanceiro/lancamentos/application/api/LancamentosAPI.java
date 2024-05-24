package com.financas.controlefinanceiro.lancamentos.application.api;

import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("/v1/usuario/{idUsuario}/lancamento")
public interface LancamentosAPI {
    @PostMapping
    @ResponseStatus(code = HttpStatus.CREATED)
    LancamentoResponse novoLancamento(@PathVariable UUID idUsuario,
                                      @Valid @RequestBody LancamentoRequest lancamentoRequest);
}
