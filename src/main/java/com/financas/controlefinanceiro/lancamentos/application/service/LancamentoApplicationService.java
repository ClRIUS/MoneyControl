package com.financas.controlefinanceiro.lancamentos.application.service;

import com.financas.controlefinanceiro.lancamentos.application.api.LancamentoRequest;
import com.financas.controlefinanceiro.lancamentos.application.api.LancamentoResponse;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@Log4j2
public class LancamentoApplicationService implements LancamentoService{
    @Override
    public LancamentoResponse novoLancamento(UUID idUsuario, LancamentoRequest lancamentoRequest) {
        log.info("[Start] LancamentoApplicationService - novoLancamento");
        log.info("[Finish] LancamentoApplicationService - novoLancamento");
        return null;
    }
}
