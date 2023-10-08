package com.r2da.desafioapi.service;

import com.r2da.desafioapi.entity.Pessoa;
import com.r2da.desafioapi.entity.form.PessoaForm;
import com.r2da.desafioapi.entity.form.PessoaUpdateForm;

import java.util.List;

public interface IPessoaService {

    /**
     * Cria uma Pessoa e salva no banco de dados.
     * @param form - formulário referente aos dados para criação de uma Pessoa no banco de dados.
     * @return - Pessoa recém-criada.
     */
    Pessoa crete(PessoaForm form);

    /**
     * Retorna uma Pessoa que está no banco de dados de acordo com seu Id.
     * @param id - id de Pessoa que será exibido.
     * @return - Pessoa de acordo com o Id fornecido.
     */
    Pessoa get(Long id);

    /**
     * Atualiza a Pessoa.
     * @param formUpdate - formulário referente aos dados necessários para atualização de Pessoa
     * no banco de dados.
     * @return - Pessoa recém-atualizada.
     */
    Pessoa update(Long id, PessoaUpdateForm formUpdate);

    /**
     * Deleta uma Pessoa específica.
     * @param id - id da Pessoa que será removida.
     */
    Pessoa delete(Long id);

    /**
     * Pega todas as Pessoas do banco.
     * @return - Pessoas cadastradas.
     */
    List<Pessoa> getAll();
}
