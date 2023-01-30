package com.cadastroPessoa.API.pessoa;

import com.cadastroPessoa.API.endereco.Endereco;
import com.cadastroPessoa.API.endereco.entity.EnderecoRepository;
import java.util.List;

import com.cadastroPessoa.API.pessoa.entity.PessoaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PessoaService {
    @Autowired
    private PessoaRepository pessoaRepository;
    @Autowired
    private EnderecoRepository enderecoRepository;

    public PessoaService(PessoaRepository pessoaRepository) {
        this.pessoaRepository = pessoaRepository;
    }
    public Pessoa save(Pessoa pessoa) {
        return pessoaRepository.save(pessoa);
    }
    public List<Pessoa> findAll() {
        return pessoaRepository.findAll();
    }

    public Pessoa salvarEndereco(Endereco endereco, Long pessoaId) {
        var pessoa = pessoaRepository.getReferenceById(pessoaId);
        pessoa.getEnderecos().add(endereco);
        return pessoaRepository.save(pessoa);
    }
}