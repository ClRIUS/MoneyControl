package com.financas.controlefinanceiro.lancamentos.domain;

import com.financas.controlefinanceiro.lancamentos.application.api.LancamentoRequest;
import jakarta.persistence.*;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@NoArgsConstructor(access = AccessLevel.PRIVATE)
@Getter
public class Lancamentos {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "idLancamento", updatable = false, unique = true, nullable = false)
    private UUID idLancamento;
    @NotNull
    @Column(name = "idUsuarioLancamento", nullable = false)
    private UUID idUsuarioLancamento;
    @NotNull
    private TipoLancamento tipoLancamento;
    @NotNull
    private Categoria categoria;
    @Size(max = 35)
    private String descricao;
    @NotNull
    @Column(scale = 2)
    private double valor;
    private LocalDateTime dataHoraLancamento;
    private LocalDateTime dataHoraUltimaAlteracao;

    public Lancamentos(UUID idUsuario, @Valid LancamentoRequest lancamentoRequest) {
        this.idUsuarioLancamento = idUsuario;
        this.tipoLancamento = lancamentoRequest.getTipoLancamento();
        this.categoria = lancamentoRequest.getCategoria();
        this.descricao = lancamentoRequest.getDescricao();
        this.valor = lancamentoRequest.getValor();
        this.dataHoraLancamento = LocalDateTime.now();
    }
}
