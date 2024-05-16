package com.financas.controlefinanceiro.usuario.service;

import com.financas.controlefinanceiro.usuario.application.UsuarioRequest;
import com.financas.controlefinanceiro.usuario.application.UsuarioResponse;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

@Service
@Log4j2
public class UsuarioApplicationService implements UsuarioService{
    @Override
    public UsuarioResponse criaUsuario(UsuarioRequest usuarioRequest) {
        log.info("[Start] UsuarioApplicationService - criaUsuario");
        log.info("[Finish] UsuarioApplicationService - criaUsuario");
        return null;
    }
}
