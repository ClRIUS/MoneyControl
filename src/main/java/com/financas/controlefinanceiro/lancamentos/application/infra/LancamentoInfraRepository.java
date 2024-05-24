package com.financas.controlefinanceiro.lancamentos.application.infra;

import com.financas.controlefinanceiro.lancamentos.application.repository.LancamentoRepository;
import com.financas.controlefinanceiro.lancamentos.domain.Lancamentos;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Repository;

@Repository
@Log4j2
@RequiredArgsConstructor
public class LancamentoInfraRepository implements LancamentoRepository {
    private final LancamentoSpringDataRepository lancamentoSpringDataRepository;

    @Override
    public Lancamentos salva(Lancamentos lancamentos) {
        log.info("[Start] LancamentoInfraRepository - salva");
        lancamentoSpringDataRepository.save(lancamentos);
        log.info("[Finish] LancamentoInfraRepository - salva");
        return lancamentos;
    }
}
