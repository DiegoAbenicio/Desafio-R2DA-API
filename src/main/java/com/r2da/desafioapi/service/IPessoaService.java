package com.r2da.desafioapi.service;

import com.r2da.desafioapi.entity.Pessoa;
import com.r2da.desafioapi.entity.form.PessoaForm;
import com.r2da.desafioapi.entity.form.PessoaUpdateForm;

import java.util.List;

public interface IPessoaService {

    Pessoa crete(PessoaForm form);

    Pessoa get(Long id);

    Pessoa update(Long id, PessoaUpdateForm formUpdate);

    String delete(Long id);
    
    List<Pessoa> getAll();
}
