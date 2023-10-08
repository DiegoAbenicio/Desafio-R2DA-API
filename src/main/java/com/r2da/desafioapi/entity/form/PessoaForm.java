package com.r2da.desafioapi.entity.form;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PessoaForm {

    private String nome;

    private String endereco;

    private String email;

    private Double telefone;
}

