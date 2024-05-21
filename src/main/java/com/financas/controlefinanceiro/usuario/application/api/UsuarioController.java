package com.financas.controlefinanceiro.usuario.application.api;

import com.financas.controlefinanceiro.usuario.application.service.UsuarioService;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

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
        log.info("[Finish] UsuarioController - ListaUsuarios");
        return null;
    }
}
