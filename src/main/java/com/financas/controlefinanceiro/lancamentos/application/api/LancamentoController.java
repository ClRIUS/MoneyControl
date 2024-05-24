package com.financas.controlefinanceiro.lancamentos.application.api;

import com.financas.controlefinanceiro.lancamentos.application.service.LancamentoService;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
@Log4j2
@RequiredArgsConstructor
public class LancamentoController implements LancamentosAPI{
    private final LancamentoService lancamentoService;

    @Override
    public LancamentoResponse novoLancamento(UUID idUsuario, LancamentoRequest lancamentoRequest) {
        log.info("[Start] LancamentoController - novoLancamento");
        log.info("[idUsuario] {}", idUsuario);
        LancamentoResponse lancamento = lancamentoService.novoLancamento(idUsuario, lancamentoRequest);
        log.info("[Finish] LancamentoController - novoLancamento");
        return lancamento;
    }
}
