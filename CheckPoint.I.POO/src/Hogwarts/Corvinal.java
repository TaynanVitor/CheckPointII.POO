package Hogwarts;

import java.time.LocalDate;

public class Corvinal extends Alunos{
    public Corvinal(String nome, String endereco, Integer pontuacao, LocalDate idade, Byte anoLetivo, String disciplinaDestaque, Integer matricula){
        super(nome, endereco, pontuacao, idade, anoLetivo, disciplinaDestaque, matricula);
    }

    private String orientador;
    private Integer qtdAlunos;
    private Integer pontuacaoCasa;
    private Integer especialidade;

    public Corvinal(String nome, String endereco, Integer pontuacao, LocalDate idade, Byte anoLetivo, String disciplinaDestaque, Integer matricula, String orientador, Integer qtdAlunos, Integer pontuacaoCasa, Integer especialidade) {
        super(nome, endereco, pontuacao, idade, anoLetivo, disciplinaDestaque, matricula);
        this.orientador = orientador;
        this.qtdAlunos = qtdAlunos;
        this.pontuacaoCasa = pontuacaoCasa;
        this.especialidade = especialidade;
    }

    public String getOrientador() {
        return orientador;
    }

    public void setOrientador(String orientador) {
        this.orientador = orientador;
    }

    public Integer getQtdAlunos() {
        return qtdAlunos;
    }

    public void setQtdAlunos(Integer qtdAlunos) {
        this.qtdAlunos = qtdAlunos;
    }

    public Integer getPontuacaoCasa() {
        return pontuacaoCasa;
    }

    public void setPontuacaoCasa(Integer pontuacaoCasa) {
        this.pontuacaoCasa = pontuacaoCasa;
    }

    public Integer getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(Integer especialidade) {
        this.especialidade = especialidade;
    }

//    public void calcularQtdAlunos(){
//        return *somar matricula*;
//    }

//    public void calcularPontuacaoCasa(){
//        return somar pontuacao alunos;
//    }


}

