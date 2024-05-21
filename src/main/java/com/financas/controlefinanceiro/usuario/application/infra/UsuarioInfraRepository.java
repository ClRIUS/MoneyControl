package com.financas.controlefinanceiro.usuario.application.infra;

import com.financas.controlefinanceiro.usuario.application.repository.UsuarioRepository;
import com.financas.controlefinanceiro.usuario.domain.Usuario;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Repository;

@Repository
@Log4j2
@RequiredArgsConstructor
public class UsuarioInfraRepository implements UsuarioRepository {
    private final UsuarioSpringDataRepository usuarioSpringDataRepository;

    @Override
    public Usuario salva(Usuario usuario) {
        log.info("[Start] UsuarioInfraRepository - salva");
        usuarioSpringDataRepository.save(usuario);
        log.info("[Finish] UsuarioInfraRepository - salva");
        return usuario;
    }
}
