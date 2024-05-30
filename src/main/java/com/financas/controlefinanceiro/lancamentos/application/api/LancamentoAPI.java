package com.financas.controlefinanceiro.lancamentos.application.api;

import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/v1/usuario/{idUsuario}/lancamentos")
public interface LancamentoAPI {
    @PostMapping
    @ResponseStatus(code = HttpStatus.CREATED)
    LancamentoResponse novoLancamento(@PathVariable UUID idUsuario,
                                      @Valid @RequestBody LancamentoRequest lancamentoRequest);

    @GetMapping
    @ResponseStatus(code = HttpStatus.OK)
    List<LancamentoListResponse>listaTodosLancamentos(@PathVariable UUID idUsuario);

    @GetMapping(value = "/{idLancamento}")
    @ResponseStatus(code = HttpStatus.OK)
    LancamentoDetalhadoResponse detalhaLancamento(@PathVariable UUID idUsuario, @PathVariable UUID idLancamento);

    @PatchMapping(value = "/{idLancamento}")
    @ResponseStatus(code = HttpStatus.NO_CONTENT)
    void editaLancamento(@PathVariable UUID idUsuario, @PathVariable UUID idLancamento,
                         @Valid @RequestBody LancamentoAlteracaoRequest lancamentoAlteracaoRequest);

    @DeleteMapping(value = "/{idLancamento}")
    @ResponseStatus(code = HttpStatus.NO_CONTENT)
    void deletaLancamento(@PathVariable UUID idUsuario, @PathVariable UUID idLancamento);

    @GetMapping("/soma-receitas")
    @ResponseStatus(code = HttpStatus.OK)
    String somaReceitas(@PathVariable UUID idUsuario, @Valid SomaLancamentosRequest somaLancamentosRequest);
}
