package com.r2da.desafioapi.controller;

import com.r2da.desafioapi.entity.Pessoa;
import com.r2da.desafioapi.entity.form.PessoaForm;
import com.r2da.desafioapi.entity.form.PessoaUpdateForm;
import com.r2da.desafioapi.service.impl.PessoaServiceImpl;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*")
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
    public Pessoa create(@Valid @RequestBody PessoaForm form){
        return  service.crete(form);
    }

    @DeleteMapping("/{id}")
    public String delete(@PathVariable Long id){
        return service.delete(id);
    }

    @PutMapping("/{id}")
    public Pessoa update(@Valid @PathVariable Long id, @RequestBody PessoaUpdateForm updateForm){
        return service.update(id, updateForm);
    }

}
