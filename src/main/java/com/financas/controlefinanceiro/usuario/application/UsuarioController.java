package com.financas.controlefinanceiro.usuario.application;

import com.financas.controlefinanceiro.usuario.service.UsuarioService;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Log4j2
@RequiredArgsConstructor
public class UsuarioController implements UsuarioAPI{
    private final UsuarioService usuarioService;

    @Override
    public UsuarioResponse cadastraUsuario(UsuarioRequest usuarioRequest) {
        log.info("[Start] UsuaioController - CadastraUsuario");
        UsuarioResponse usuarioCriado = usuarioService.criaUsuario(usuarioRequest);
        log.info("[Finish] UsuaioController - CadastraUsuario");
        return usuarioCriado;
    }
}
