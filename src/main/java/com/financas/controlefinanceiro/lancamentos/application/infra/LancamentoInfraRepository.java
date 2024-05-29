package com.financas.controlefinanceiro.lancamentos.application.infra;

import com.financas.controlefinanceiro.lancamentos.application.repository.LancamentoRepository;
import com.financas.controlefinanceiro.lancamentos.domain.Lancamentos;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

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

    @Override
    public List<Lancamentos> listaTodosLancamentos() {
        log.info("[Start] LancamentoInfraRepository - listaPositivos");
        List<Lancamentos> listaTodosLancamentos = lancamentoSpringDataRepository.findAll();
        log.info("[Finish] LancamentoInfraRepository - listaPositivos");
        return listaTodosLancamentos;
    }

    @Override
    public Lancamentos buscaLancamentoId(UUID idLancamento) {
        log.info("[Start] LacamentoInfraRepository - buscaLancamentoId");
        Lancamentos lancamento = lancamentoSpringDataRepository.findById(idLancamento)
                .orElseThrow(() -> new RuntimeException("Lançamento não encontrado!"));;;
        log.info("[Finish] LacamentoInfraRepository - buscaLancamentoId");
        return lancamento;
    }
}
