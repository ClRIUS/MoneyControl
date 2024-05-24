package com.financas.controlefinanceiro.lancamentos.application.api;

import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v1/usuario/{idUsuario}/lancamento")
public interface LancamentosAPI {
    @PostMapping
    @ResponseStatus(code = HttpStatus.CREATED)
    LancamentoResponse novoLancamento(@Valid @RequestBody LancamentoRequest lancamentoRequest);
}
