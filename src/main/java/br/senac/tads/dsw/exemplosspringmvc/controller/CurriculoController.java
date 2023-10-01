package br.senac.tads.dsw.exemplosspringmvc.controller;

import br.senac.tads.dsw.exemplosspringmvc.domain.Curriculo;
import br.senac.tads.dsw.exemplosspringmvc.service.CurriculoService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CurriculoController {

    @GetMapping("/")
    public ModelAndView home(){
        Curriculo curriculo = CurriculoService.getStaticModel();
        ModelAndView mv = new ModelAndView("home");
        mv.addObject("dadosPessoais", curriculo.getDadosPessoais());
        mv.addObject("experiencias", curriculo.getExperiencia());
        mv.addObject("educacao", curriculo.getEducacao());
        return mv;
    }

}
