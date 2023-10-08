package com.r2da.desafioapi.controller;

import com.r2da.desafioapi.entity.Pessoa;
import com.r2da.desafioapi.entity.form.PessoaForm;
import com.r2da.desafioapi.entity.form.PessoaUpdateForm;
import com.r2da.desafioapi.service.impl.PessoaServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/pessoas")
public class PessoaController {

    @Autowired
    private PessoaServiceImpl service;

    @GetMapping
    public List<Pessoa> getAll(){
        return service.getAll();
    }

    @GetMapping("/{id}")
    public Pessoa get(@PathVariable Long id){
        return service.get(id);
    }

    @PostMapping
    public Pessoa create(@RequestBody PessoaForm form){
        return  service.crete(form);
    }

    @DeleteMapping("/{id}")
    public Pessoa delete(@PathVariable Long id){
        return service.delete(id);
    }

    @PutMapping("/{id}")
    public Pessoa update(@PathVariable Long id, @RequestBody PessoaUpdateForm updateForm){
        return service.update(id, updateForm);
    }

}
