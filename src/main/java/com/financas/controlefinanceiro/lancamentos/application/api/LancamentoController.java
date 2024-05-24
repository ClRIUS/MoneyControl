package com.financas.controlefinanceiro.lancamentos.application.api;

import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Log4j2
public class LancamentoController implements LancamentosAPI{
    @Override
    public LancamentoResponse novoLancamento(LancamentoRequest lancamentoRequest) {
        log.info("[Start] LancamentoController - novoLancamento");
        log.info("[Finish] LancamentoController - novoLancamento");
        return null;
    }
}
