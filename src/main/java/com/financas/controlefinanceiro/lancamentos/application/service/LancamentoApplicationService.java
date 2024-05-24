package com.financas.controlefinanceiro.lancamentos.application.service;

import com.financas.controlefinanceiro.lancamentos.application.api.LancamentoRequest;
import com.financas.controlefinanceiro.lancamentos.application.api.LancamentoResponse;
import com.financas.controlefinanceiro.lancamentos.application.repository.LancamentoRepository;
import com.financas.controlefinanceiro.lancamentos.domain.Lancamentos;
import com.financas.controlefinanceiro.usuario.application.service.UsuarioService;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

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
}