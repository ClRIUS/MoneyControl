package com.financas.controlefinanceiro.lancamentos.application.infra;

import com.financas.controlefinanceiro.lancamentos.application.repository.LancamentoRepository;
import com.financas.controlefinanceiro.lancamentos.domain.Lancamentos;
import com.financas.controlefinanceiro.lancamentos.domain.TipoLancamento;
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
    public List<Lancamentos> listaTodosLancamentos(UUID idUsuario) {
        log.info("[Start] LancamentoInfraRepository - listaPositivos");
        List<Lancamentos> listaTodosLancamentos = lancamentoSpringDataRepository.findByIdUsuarioLancamento(idUsuario);
        log.info("[Finish] LancamentoInfraRepository - listaPositivos");
        return listaTodosLancamentos;
    }

    @Override
    public Lancamentos buscaLancamentoId(UUID idLancamento) {
        log.info("[Start] LancamentoInfraRepository - buscaLancamentoId");
        Lancamentos lancamento = lancamentoSpringDataRepository.findById(idLancamento)
                .orElseThrow(() -> new RuntimeException("Lançamento não encontrado!"));;;
        log.info("[Finish] LacamentoInfraRepository - buscaLancamentoId");
        return lancamento;
    }

    @Override
    public void deletaLancamentoPorId(UUID idLancamento) {
        log.info("[Start] LancamentoInfraRepository - deletaLancamentoPorId");
        lancamentoSpringDataRepository.deleteById(idLancamento);
        log.info("[Finish] LancamentoInfraRepository - deletaLancamentoPorId");
    }

    @Override
    public Double somaReceitas(UUID idUsuario) {
        log.info("[Start] LancamentoInfraRepository - somaReceitas");
        Double soma = lancamentoSpringDataRepository
                .sumByTipoLancamentoAndIdUsuarioLancamento(TipoLancamento.RECEITA, idUsuario);
        log.info("[Finish] LancamentoInfraRepository - somaReceitas");
        return soma;
    }
}
