package com.cadastroPessoa.API.endereco.entity;

import com.cadastroPessoa.API.endereco.Endereco;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EnderecoRepository extends JpaRepository<Endereco, Long> {
}
