package com.cadastroPessoa.API.pessoa;

import com.cadastroPessoa.API.endereco.DadosEndereco;
import jakarta.validation.constraints.NotNull;

public record DadosAtualizacaoPessoa(

        @NotNull
        Long id,
        String nome,
        String dataNascimento,
        DadosEndereco enderecos
) {
}
