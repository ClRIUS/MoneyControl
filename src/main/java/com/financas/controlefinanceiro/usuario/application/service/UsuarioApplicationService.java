package com.financas.controlefinanceiro.usuario.application.service;

import com.financas.controlefinanceiro.usuario.application.api.UsuarioDetalhadoResponse;
import com.financas.controlefinanceiro.usuario.application.api.UsuarioListResponse;
import com.financas.controlefinanceiro.usuario.application.api.UsuarioRequest;
import com.financas.controlefinanceiro.usuario.application.api.UsuarioResponse;
import com.financas.controlefinanceiro.usuario.application.repository.UsuarioRepository;
import com.financas.controlefinanceiro.usuario.domain.Usuario;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

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

    @Override
    public List<UsuarioListResponse> listaUsuarios() {
        log.info("[Start] UsuarioApplicationService - listaUsuarios");
        List<Usuario> usuarios = usuarioRepository.buscaTodosUsuarios();
        log.info("[Finish] UsuarioApplicationService - listaUsuarios");
        return UsuarioListResponse.converte(usuarios);
    }

    @Override
    public UsuarioDetalhadoResponse detalhaCadastroUsuario(UUID idUsuario) {
        log.info("[Start] UsuarioApplicationService - detalhaCadastroUsuario");
        log.info("[Finish] UsuarioApplicationService - detalhaCadastroUsuario");
        return null;
    }
}
