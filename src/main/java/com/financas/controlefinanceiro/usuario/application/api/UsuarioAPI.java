package com.financas.controlefinanceiro.usuario.application.api;

import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/v1/usuario")
public interface UsuarioAPI {
    @PostMapping
    @ResponseStatus(code = HttpStatus.CREATED)
    UsuarioResponse cadastraUsuario(@Valid @RequestBody UsuarioRequest usuarioRequest);

    @GetMapping
    @ResponseStatus(code = HttpStatus.OK)
    List<UsuarioListResponse> listaUsuarios();

    @GetMapping(value = "/{idUsuario}")
    @ResponseStatus(code = HttpStatus.OK)
    UsuarioDetalhadoResponse detalhaUsuario(@PathVariable UUID idUsuario);

    @PatchMapping(value = "/{idUsuario}")
    @ResponseStatus(code = HttpStatus.NO_CONTENT)
    void alteraUsuario(@PathVariable UUID idUsuario,
                  @Valid @RequestBody UsuarioAlteraRequest usuarioAlteraRequest);
}
