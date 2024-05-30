package com.financas.controlefinanceiro.lancamentos.application.infra;

import com.financas.controlefinanceiro.lancamentos.domain.Lancamentos;
import com.financas.controlefinanceiro.lancamentos.domain.TipoLancamento;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.time.LocalDate;
import java.util.List;
import java.util.UUID;

public interface LancamentoSpringDataRepository extends JpaRepository<Lancamentos, UUID> {
    List<Lancamentos> findByIdUsuarioLancamento(UUID idUsuarioLancamento);
    @Query("SELECT SUM(l.valor) FROM Lancamentos l WHERE l.tipoLancamento = :tipoLancamento AND l.idUsuarioLancamento = :idUsuario AND l.dataLancamento BETWEEN :dataInicial AND :dataFinal")
    Double sumByTipoLancamentoAndIdUsuarioLancamento(TipoLancamento tipoLancamento, UUID idUsuario, LocalDate dataInicial, LocalDate dataFinal);
}
