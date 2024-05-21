package com.financas.controlefinanceiro.usuario.application.api;

import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/v1/usuario")
public interface UsuarioAPI {
    @PostMapping
    @ResponseStatus(code = HttpStatus.CREATED)
    UsuarioResponse cadastraUsuario(@Valid @RequestBody UsuarioRequest usuarioRequest);

    @GetMapping
    @ResponseStatus(code = HttpStatus.OK)
    List<UsuarioListResponse> listaUsuarios();
}
