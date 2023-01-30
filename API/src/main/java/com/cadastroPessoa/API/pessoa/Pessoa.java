package com.cadastroPessoa.API.pessoa;

import com.cadastroPessoa.API.endereco.Endereco;
import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Table(name = "pessoa")
@Entity(name = "Pessoa")
@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Pessoa {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String dataNascimento;
    @OneToMany(cascade = CascadeType.ALL)
    private List<Endereco> enderecos;

    public Pessoa(DadosCadastroPessoa dados) {
        this.nome = dados.nome();
        this.dataNascimento = dados.dataNascimento();
        this.enderecos = new ArrayList<Endereco>();
        this.enderecos.add(new Endereco(dados.enderecos()));

    }

    public void atualizarInformacoes(DadosAtualizacaoPessoa dados){
        if (dados.nome() != null){
            this.nome = dados.nome();
        }
        if (dados.dataNascimento() != null){
            this.dataNascimento = dados.dataNascimento();
        }
    }
}
