package Hogwarts;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public abstract class Casas {

    private String orientador;
    private Integer qtdAlunos;
    private Integer pontuacaoCasa;
    private Integer especialidade;

///cria a lista de Alunos que terá em cada uma das casas

    private static ArrayList<Alunos> listaAlunos = new ArrayList<>();

///construtor de casas

    public Casas(String orientador, Integer qtdAlunos, Integer pontuacaoCasa, Integer especialidade) {
        this.orientador = orientador;
        this.qtdAlunos = qtdAlunos;
        this.pontuacaoCasa = pontuacaoCasa;
        this.especialidade = especialidade;
    }

    //// 1- método de adicao de alunos na lista

    public static void addAluno (Alunos aluno){
            listaAlunos.add(aluno);
    }

    //// 2 - Método de calculo de quantidade de alunos por casa

    public int obterQuantidadeDeAlunos(){
        return 0;
    }

    //// 3 - Metodo para soma de pontuacao de cada aluno
//
//    public abstract int obterQuantidadeDeAlunos();

    public Integer somarPontos() {
        Integer total = 0;
        for (Alunos pontuacao : listaAlunos) {
            total += pontuacao.getPontuacao();
        }
        return total;
    }

        /////// getters and setters

        public String getOrientador () {
            return orientador;
        }

        public void setOrientador (String orientador){
            this.orientador = orientador;
        }

        public Integer getQtdAlunos () {
            return qtdAlunos;
        }

        public void setQtdAlunos (Integer qtdAlunos){
            this.qtdAlunos = qtdAlunos;
        }

        public Integer getPontuacaoCasa () {
            return pontuacaoCasa;
        }

        public void setPontuacaoCasa (Integer pontuacaoCasa){
            this.pontuacaoCasa = pontuacaoCasa;
        }

        public Integer getEspecialidade () {
            return especialidade;
        }

        public void setEspecialidade (Integer especialidade){
            this.especialidade = especialidade;
        }

        public static ArrayList<Alunos> getListaAlunos () {
            return listaAlunos;
        }

        public static void setListaAlunos (ArrayList < Alunos > listaAlunos) {
            Casas.listaAlunos = listaAlunos;
        }




    }