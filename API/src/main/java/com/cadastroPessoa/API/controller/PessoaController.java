package com.cadastroPessoa.API.controller;

import com.cadastroPessoa.API.endereco.Endereco;
import com.cadastroPessoa.API.endereco.EnderecoServico;
import com.cadastroPessoa.API.pessoa.Pessoa;
import com.cadastroPessoa.API.pessoa.PessoaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/pessoa")
public class PessoaController {

    @Autowired
    private PessoaService pessoaService;

    @Autowired
    private EnderecoServico enderecoServico;

    @PostMapping("/registrar")
    public Pessoa create(@RequestBody Pessoa pessoa) {
        return pessoaService.save(pessoa);
    }

    @PostMapping("/{id}/registrar/endereco")
    public Pessoa registrarEndereco(@RequestBody Endereco endereco, @PathVariable Long id) {
        return pessoaService.salvarEndereco(endereco, id);
    }

    @GetMapping
    public List<Pessoa> listar() {
        return pessoaService.findAll();
    }
}