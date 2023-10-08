package com.r2da.desafioapi.service.impl;

import com.r2da.desafioapi.entity.Pessoa;
import com.r2da.desafioapi.entity.form.PessoaForm;
import com.r2da.desafioapi.entity.form.PessoaUpdateForm;
import com.r2da.desafioapi.repository.PessoaRepository;
import com.r2da.desafioapi.service.IPessoaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PessoaServiceImpl implements IPessoaService {

    @Autowired
    private PessoaRepository repository;

    @Override
    public Pessoa crete(PessoaForm form) {
        Pessoa pessoa = new Pessoa();
        pessoa.setNome(form.getNome());
        pessoa.setEndereco(form.getEndereco());
        pessoa.setEmail(form.getEmail());
        pessoa.setTelefone(form.getTelefone());

        return repository.save(pessoa);
    }

    @Override
    public Pessoa get(Long id) {
        return repository.findById(id).get();
    }

    @Override
    public Pessoa update(Long id, PessoaUpdateForm updateForm){
        Optional<Pessoa> optionalPessoa = repository.findById(id);

        Pessoa pessoa = optionalPessoa.get();

        pessoa.setNome(updateForm.getNome());
        pessoa.setEndereco(updateForm.getEndereco());
        pessoa.setEmail(updateForm.getEmail());
        pessoa.setTelefone(updateForm.getTelefone());

        return repository.save(pessoa);
    }

    @Override
    public String delete(Long id) {
        try {
            Pessoa pessoa = repository.findById(id).get();
            String nome = pessoa.getNome();
            repository.deleteById(id);
            return "sucesso: Você deletou " + nome + " com sucesso";
        } catch (EmptyResultDataAccessException ex) {
            return "erro: Pessoa não encontrada com o ID " + id;
        }
    }

    @Override
    public List<Pessoa> getAll() {
        return repository.findAll();
    }
}
