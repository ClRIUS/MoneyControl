package com.financas.controlefinanceiro.usuario.application.api;

import com.financas.controlefinanceiro.usuario.application.service.UsuarioService;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.UUID;

@RestController
@Log4j2
@RequiredArgsConstructor
public class UsuarioController implements UsuarioAPI {
    private final UsuarioService usuarioService;

    @Override
    public UsuarioResponse cadastraUsuario(UsuarioRequest usuarioRequest) {
        log.info("[Start] UsuarioController - CadastraUsuario");
        UsuarioResponse usuarioCriado = usuarioService.criaUsuario(usuarioRequest);
        log.info("[Finish] UsuaioController - CadastraUsuario");
        return usuarioCriado;
    }

    @Override
    public List<UsuarioListResponse> listaUsuarios() {
        log.info("[Start] UsuarioController - ListaUsuarios");
        List<UsuarioListResponse> usuarios = usuarioService.listaUsuarios();
        log.info("[Finish] UsuarioController - ListaUsuarios");
        return usuarios;
    }

    @Override
    public UsuarioDetalhadoResponse detalhaUsuario(UUID idUsuario) {
        log.info("[Start] UsuarioController - detalhaUsuario");
        log.info("[idUsuario] {}", idUsuario);
        UsuarioDetalhadoResponse usuario = usuarioService.detalhaCadastroUsuario(idUsuario);
        log.info("[Start] UsuarioController - detalhaUsuario");
        return usuario;
    }

    @Override
    public void alteraUsuario(UUID idUsuario, UsuarioAlteraRequest usuarioAlteraRequest) {
        log.info("[Start] UsuarioController - alteraUsuario");
        log.info("[idUsuario] {}", idUsuario);
        usuarioService.alteraUsuario(idUsuario, usuarioAlteraRequest);
        log.info("[Finish] UsuarioController - alteraUsuario");
    }

    @Override
    public void deletaUsuario(UUID idUsuario) {
        log.info("[Start] UsuarioController - deletaUsuario");
        log.info("[idUsuario] {}", idUsuario);
        usuarioService.deletaUsuario(idUsuario);
        log.info("[Finish] UsuarioController - deletaUsuario");
    }
}
