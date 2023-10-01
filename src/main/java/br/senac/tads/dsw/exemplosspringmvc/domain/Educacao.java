package br.senac.tads.dsw.exemplosspringmvc.domain;

import lombok.*;

import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@EqualsAndHashCode
public class Educacao {
    private String instituicao;
    private String periodo;
    private String nomeCurso;
    private String status;
}
