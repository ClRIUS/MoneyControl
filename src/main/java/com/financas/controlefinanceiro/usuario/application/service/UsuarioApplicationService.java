package com.financas.controlefinanceiro.usuario.application.service;

import com.financas.controlefinanceiro.usuario.application.api.UsuarioRequest;
import com.financas.controlefinanceiro.usuario.application.api.UsuarioResponse;
import com.financas.controlefinanceiro.usuario.application.repository.UsuarioRepository;
import com.financas.controlefinanceiro.usuario.domain.Usuario;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

@Service
@Log4j2
@RequiredArgsConstructor
public class UsuarioApplicationService implements UsuarioService{
    private final UsuarioRepository usuarioRepository;

    @Override
    public UsuarioResponse criaUsuario(UsuarioRequest usuarioRequest) {
        log.info("[Start] UsuarioApplicationService - criaUsuario");
        Usuario usuario = usuarioRepository.salva(new Usuario(usuarioRequest));
        log.info("[Finish] UsuarioApplicationService - criaUsuario");
        return UsuarioResponse.builder()
                .idUsuario(usuario.getIdUsuario())
                .build();
    }
}
