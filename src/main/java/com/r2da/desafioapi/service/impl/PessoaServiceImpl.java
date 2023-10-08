package com.r2da.desafioapi.service.impl;

import com.r2da.desafioapi.entity.Pessoa;
import com.r2da.desafioapi.entity.form.PessoaForm;
import com.r2da.desafioapi.entity.form.PessoaUpdateForm;
import com.r2da.desafioapi.repository.PessoaRepository;
import com.r2da.desafioapi.service.IPessoaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PessoaServiceImpl implements IPessoaService {

    @Autowired
    private PessoaRepository repository;

    @Override
    public Pessoa crete(PessoaForm form) {
        return null;
    }

    @Override
    public Pessoa get(Long id) {
        return null;
    }

    @Override
    public Pessoa update(Long id, PessoaUpdateForm updateForm){
        return null;
    }

    @Override
    public Pessoa delete(Long id) {
        return null;
    }

    @Override
    public List<Pessoa> getAll() {
        return null;
    }
}
