package br.senac.tads.dsw.exemplosspringmvc.controller;

import br.senac.tads.dsw.exemplosspringmvc.dto.DadosCurriculoDto;
import org.springframework.boot.Banner;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class ValidaFormularioController{

    @PostMapping("/valida_formulario")
    public ModelAndView validaForm(@ModelAttribute DadosCurriculoDto dadosCurriculoDto){
            String nome = dadosCurriculoDto.nome();
            String sobrenome = dadosCurriculoDto.sobrenome();

            ModelAndView modelAttribute = new ModelAndView("curriculo");
            modelAttribute.addObject("nome", nome);
            modelAttribute.addObject("sobrenome", sobrenome);
            return modelAttribute;

    }

}
