package br.senac.tads.dsw.exemplosspringmvc.domain;

import lombok.*;

import java.util.List;
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@EqualsAndHashCode
public class CursosExtraCurriculares {
    private String nomeCurso;
    private String nomeInstituicao;
    private String duracaoHrs;
    private List<String> topicos;
}
