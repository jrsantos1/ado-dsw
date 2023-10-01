package br.senac.tads.dsw.exemplosspringmvc.domain;

import lombok.*;

import java.util.Date;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@EqualsAndHashCode
public class Experiencia {
    private String empresa;
    private String cargo;

    private String periodo;
    private List<String> atividades;



}
