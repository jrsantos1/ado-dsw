package br.senac.tads.dsw.exemplosspringmvc.domain;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@EqualsAndHashCode
public class DadosPessoais {
    private String nome;
    private String objetivo;
    private String endereco;
    private String contato;
    private String resumo;
    private String telefone;
    private String github;
    private String linkedin;
    private String dataNascimento;
}
