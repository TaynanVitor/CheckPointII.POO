package Hogwarts;

import java.time.LocalDate;

public class Sonserina extends Casas{

    public Sonserina(String orientador, Integer qtdAlunos, Integer pontuacaoCasa, Integer especialidade) {
        super(orientador, qtdAlunos, pontuacaoCasa, especialidade);
    }

    @Override
    public int obterQuantidadeDeAlunos() {
        int quantidadeDeAlunos = 0;
        for (Alunos aluno : getListaAlunos()) {
            if (aluno.getDisciplinaDestaque() == "defesa contra a arte das trevas") {
                quantidadeDeAlunos++;
            }
        }
        return quantidadeDeAlunos;
}

    @Override
    public Integer somarPontos() {
        Integer total = 0;
        for (Alunos pontuacao : getListaAlunos()) {
            if (pontuacao.getDisciplinaDestaque() == "defesa contra a arte das trevas") {
                total += pontuacao.getPontuacao();
            }
        }
        return total;
    }

}
