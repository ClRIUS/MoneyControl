package com.financas.controlefinanceiro.usuario.application;

import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Log4j2
public class UsuarioController implements UsuarioAPI{
    @Override
    public UsuarioResponse cadastraUsuario(UsuarioRequest usuarioRequest) {
        log.info("[Start] UsuaioController - CadastraUsuario");
        log.info("[Finish] UsuaioController - CadastraUsuario");
        return null;
    }
}
