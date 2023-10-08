package com.r2da.desafioapi.entity.form;


import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PessoaUpdateForm {

    @NotEmpty(message = "Insira o nome corretamente")
    @Size(min = 3, max= 50, message = "'${validatedValue}' precisar estrar entre {min} e {max}")
    private String nome;

    @NotEmpty(message = "Insira o endereço corretamente")
    @Size(min = 6, max= 70, message = "'${validatedValue}' precisar estrar entre {min} e {max}")
    private String endereco;

    @Email(message = "'${validatedValue}' é inválido")
    private String email;

    @NotEmpty(message = "Insira o telefone corretamente")
    @Size(min = 9, max= 11, message = "'${validatedValue}' precisar estrar entre {min} e {max}")
    private String telefone;

}
