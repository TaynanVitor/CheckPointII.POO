package Hogwarts;

import java.time.LocalDate;

public class Escola {
    private String nome;
    private String pais;
    private String diretor;
    private LocalDate anoFundacao;

    public Escola(String nome, String pais, String diretor, LocalDate anoFundacao) {
        this.nome = nome;
        this.pais = pais;
        this.diretor = diretor;
        this.anoFundacao = anoFundacao;
    }

    public String getNome() {
        return nome;
    }

    public String getPais() {
        return pais;
    }

    public String getDiretor() {
        return diretor;
    }

    public LocalDate getAnoFundacao() {
        return anoFundacao;
    }
}
