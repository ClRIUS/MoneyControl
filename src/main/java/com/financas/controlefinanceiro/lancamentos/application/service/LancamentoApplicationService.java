package com.financas.controlefinanceiro.lancamentos.application.service;

import com.financas.controlefinanceiro.lancamentos.application.api.*;
import com.financas.controlefinanceiro.lancamentos.application.repository.LancamentoRepository;
import com.financas.controlefinanceiro.lancamentos.domain.Lancamentos;
import com.financas.controlefinanceiro.usuario.application.service.UsuarioService;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
import java.util.UUID;

@Service
@Log4j2
@RequiredArgsConstructor
public class LancamentoApplicationService implements LancamentoService{
    private final UsuarioService usuarioService;
    private final LancamentoRepository lancamentoRepository;

    @Override
    public LancamentoResponse novoLancamento(UUID idUsuario, LancamentoRequest lancamentoRequest) {
        log.info("[Start] LancamentoApplicationService - novoLancamento");
        usuarioService.detalhaCadastroUsuario(idUsuario);
        Lancamentos lancamento = lancamentoRepository.salva(new Lancamentos(idUsuario, lancamentoRequest));
        log.info("[Finish] LancamentoApplicationService - novoLancamento");
        return new LancamentoResponse(lancamento.getIdLancamento());
    }

    @Override
    public List<LancamentoListResponse> listaTodosLancamentos(UUID idUsuario) {
        log.info("[Start] LancamentoApplicationService - listaLancamentosPositivos");
        usuarioService.detalhaCadastroUsuario(idUsuario);
        List<Lancamentos> listaLancamentos = lancamentoRepository.listaTodosLancamentos(idUsuario);
        log.info("[Finish] LancamentoApplicationService - listaLancamentosPositivos");
        return LancamentoListResponse.converte(listaLancamentos);
        }

    @Override
    public LancamentoDetalhadoResponse detalhaLancamentoPorId(UUID idUsuario, UUID idLancamento) {
        log.info("[Start] LancamentoApplicationService - detalhaLancamentoPorId");
        usuarioService.detalhaCadastroUsuario(idUsuario);
        Lancamentos lancamento = lancamentoRepository.buscaLancamentoId(idLancamento);
        log.info("[Finish] LancamentoApplicationService - detalhaLancamentoPorId");
        return new LancamentoDetalhadoResponse(lancamento);
    }

    @Override
    public void editaLancamentoUsuario(UUID idUsuario, UUID idLancamento, LancamentoAlteracaoRequest lancamentoAlteracaoRequest) {
        log.info("[Start] LancamentoApplicationService - editaLancamentoUsuario");
        usuarioService.detalhaCadastroUsuario(idUsuario);
        Lancamentos lancamento = lancamentoRepository.buscaLancamentoId(idLancamento);
        lancamento.edita(lancamentoAlteracaoRequest);
        lancamentoRepository.salva(lancamento);
        log.info("[Finish] LancamentoApplicationService - editaLancamentoUsuario");
    }

    @Override
    public void deletaLancamentoId(UUID idUsuario, UUID idLancamento) {
        log.info("[Start] LancamentoApplicationService - deletaLancamentoId");
        usuarioService.detalhaCadastroUsuario(idUsuario);
        Lancamentos lancamento = lancamentoRepository.buscaLancamentoId(idLancamento);
        lancamentoRepository.deletaLancamentoPorId(idLancamento);
        log.info("[Finish] LancamentoApplicationService - deletaLancamentoId");
    }

    @Override
    public double calculaSomaReceitas(UUID idUsuario, LocalDate dataInicial, LocalDate dataFinal) {
        log.info("[Start] LancamentoApplicationService - calculaSomaReceitas");
        usuarioService.detalhaCadastroUsuario(idUsuario);
        Double somaReceitas = lancamentoRepository.somaReceitas(idUsuario, dataInicial, dataFinal);
        log.info("[Finish] LancamentoApplicationService - calculaSomaReceitas");
        return somaReceitas != null ? somaReceitas : 0.0;
    }

    @Override
    public double calculaSomaDespesas(UUID idUsuario, LocalDate dataInicial, LocalDate dataFinal) {
        log.info("[Start] LancamentoApplicationService - calculaSomaDespesas");
        usuarioService.detalhaCadastroUsuario(idUsuario);
        Double somaDespesas = lancamentoRepository.somaDespesas(idUsuario, dataInicial, dataFinal);
        log.info("[Finish] LancamentoApplicationService - calculaSomaDespesas");
        return somaDespesas != null ? somaDespesas : 0.0;
    }
}
