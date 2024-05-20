package com.financas.controlefinanceiro.usuario.application.infra;

import com.financas.controlefinanceiro.usuario.application.repository.UsuarioRepository;
import com.financas.controlefinanceiro.usuario.domain.Usuario;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Repository;

@Repository
@Log4j2
public class UsuarioInfraRepository implements UsuarioRepository {
    @Override
    public Usuario salva(Usuario usuario) {
        log.info("[Start] UsuarioInfraRepository - salva");
        log.info("[Finish] UsuarioInfraRepository - salva");
        return null;
    }
}
