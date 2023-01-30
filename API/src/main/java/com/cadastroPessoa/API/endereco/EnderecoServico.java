package com.cadastroPessoa.API.endereco;

import com.cadastroPessoa.API.endereco.entity.EnderecoRepository;
import com.cadastroPessoa.API.pessoa.entity.PessoaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EnderecoServico {

    @Autowired
    private PessoaRepository pessoaRepository;
    @Autowired
    private EnderecoRepository enderecoRepository;

    public EnderecoServico(EnderecoRepository enderecoRepository) {
        this.enderecoRepository = enderecoRepository;
    }




    public List<Endereco> findAll() {
        return enderecoRepository.findAll();
    }

}