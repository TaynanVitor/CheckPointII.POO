package Hogwarts;

import java.time.LocalDate;

public class Alunos {

    private String nome;
    private String endereco;
    private Integer pontuacao;
    private LocalDate idade;
    private Byte anoLetivo;
    private String disciplinaDestaque;
    private Integer matricula;

    public Alunos (String nome, String endereco, Integer pontuacao, LocalDate idade, Byte anoLetivo, String disciplinaDestaque, Integer matricula) {
        this.nome = nome;
        this.endereco = endereco;
        this.pontuacao = pontuacao;
        this.idade = idade;
        this.anoLetivo = anoLetivo;
        this.disciplinaDestaque = disciplinaDestaque;
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public Integer getPontuacao() {
        return pontuacao;
    }

    public void setPontuacao(Integer pontuacao) {
        this.pontuacao = pontuacao;
    }

    public LocalDate getIdade() {
        return idade;
    }

    public void setIdade(LocalDate idade) {
        this.idade = idade;
    }

    public Byte getAnoLetivo() {
        return anoLetivo;
    }

    public void setAnoLetivo(Byte anoLetivo) {
        this.anoLetivo = anoLetivo;
    }

    public String getDisciplinaDestaque() {
        return disciplinaDestaque;
    }

    public void setDisciplinaDestaque(String disciplinaDestaque) {
        this.disciplinaDestaque = disciplinaDestaque;
    }

    public Integer getMatricula() {
        return matricula;
    }

    public void setMatricula(Integer matricula) {
        this.matricula = matricula;
    }
}
