package com.cadastroPessoa.API.pessoa.entity;

import com.cadastroPessoa.API.pessoa.Pessoa;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PessoaRepository extends JpaRepository<Pessoa, Long> {

}