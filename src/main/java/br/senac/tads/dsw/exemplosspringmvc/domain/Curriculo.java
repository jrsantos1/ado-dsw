package br.senac.tads.dsw.exemplosspringmvc.domain;

import br.senac.tads.dsw.exemplosspringmvc.dto.DadosCurriculoDto;
import lombok.*;

import java.util.List;


@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@EqualsAndHashCode
public class Curriculo {
    private DadosPessoais dadosPessoais;
    private List<Educacao> educacao;
    private List<Experiencia> experiencia;
    private List<CursosExtraCurriculares> cursosExtraCurriculares;
}
