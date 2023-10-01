package br.senac.tads.dsw.exemplosspringmvc.service;

import br.senac.tads.dsw.exemplosspringmvc.domain.Curriculo;
import br.senac.tads.dsw.exemplosspringmvc.domain.DadosPessoais;
import br.senac.tads.dsw.exemplosspringmvc.domain.Educacao;
import br.senac.tads.dsw.exemplosspringmvc.domain.Experiencia;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CurriculoService {
    public static Curriculo getStaticModel(){

        DadosPessoais dadosPessoais = new DadosPessoais("JHONATAN RIBEIRO", "DESENVOLVEDOR WEB - PYTHON / JAVA",
                "RUA ACACIO FONTOURA Nº 775 - SÃO PAULO/SP",
                "JRDS.CONTATO@GMAIL.COM",
                "Sou apaixonado por tecnologia e adoro aprender coisas novas sobre diferentes áreas, atualmente sou analista do Itaú Unibanco na área de riscos financeiros, atuando nos times de atendimento e projetos, apoio o desenvolvimento das ferramentas internas de controle de riscos, também ajudo na automação de rotinas para melhor otimização do tempo de toda equipe. Estou no quarto semestre do curso de Análise e desenvolvimento de sistemas no Senac-SP e concluí o curso de técnico de informática na mesma instituição. Em meus estudos procuro dar maior enfoque nas áreas de desenvolvimento web e análise de dados.",
                "(11) 96656 - 3457",
                "https://github.com/jrsantos1",
                "https://www.linkedin.com/in/jhonatan-r-baa992a3/",
                "27/03/1998");


        Educacao educacao01 = new Educacao("CENTRO UNIVERSIÁRIO SENAC", "02/2022 à 06/2024", "ANÁLISE E DESENVOLVIMENTO DE SISTEMAS", "Cursando");
        Educacao educacao02 = new Educacao("SENAC NAÇÕES UNIDAS", "02/2014 à 06/2015", "TÉCNICO EM INFORMÁTICA", "Concluído");

        // atividades empresa 1
        List<String> atividades1 = new ArrayList<>();
        atividades1.add("Apoio no desenvolvimento de ferramentas internas, utilizando python (dash, flask, django) e javascript (angular)");
        atividades1.add("Apoio no tratamento de dados e na geração de consultas avançadas com sql para gerar novos relatórios");
        atividades1.add("Criação de dashboards para acompanhamento de indicadores");

        // atividades empresa 2

        List<String> atividades2 = new ArrayList<>();
        atividades2.add("Apoio no desenvolvimento de relatórios gerênciais, utilizando python e excel");
        atividades2.add("Apoio no gerenciamento das notas fiscais emitidas para cada filial e sua inserção no sistema de ERP");
        atividades2.add("Criação de dashboards para acompanhamento de indicadores");


        Experiencia experiencia1 = new Experiencia("ITAÚ UNIBANCO", "RISCO DE MERCADO - ANALISTA", "06/2022 - ATUAL", atividades1);
        Experiencia experiencia2 = new Experiencia("CINÉPOLIS CINEMAS", "OPERAÇÕES - ASSISTENTE", "06/2017 à 05/2022", atividades2);


        List<Experiencia> experiencias = new ArrayList<>();
        experiencias.add(experiencia1);
        experiencias.add(experiencia2);

        List<Educacao> educacaoList = new ArrayList<>();
        educacaoList.add(educacao01);
        educacaoList.add(educacao02);

        return new Curriculo(dadosPessoais, educacaoList, experiencias, null);


    }
}
