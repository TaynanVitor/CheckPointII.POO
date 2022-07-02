package Hogwarts;

import java.time.LocalDate;

public class Grifinoria extends Casas {

    public Grifinoria(String orientador, Integer qtdAlunos, Integer pontuacaoCasa, Integer especialidade) {
        super(orientador, qtdAlunos, pontuacaoCasa, especialidade);
    }

    @Override
    public int obterQuantidadeDeAlunos() {
        int quantidadeDeAlunos = 0;
        for (Alunos aluno : getListaAlunos()) {
            if (aluno.getDisciplinaDestaque() == "quadribol") {
                quantidadeDeAlunos++;
            }
        }
        return quantidadeDeAlunos;
    }


    @Override
    public Integer somarPontos() {
        Integer total = 0;
        for (Alunos pontuacao : getListaAlunos()) {
            if (pontuacao.getDisciplinaDestaque() == "quadribol") {
                total += pontuacao.getPontuacao();
            }
        }
        return total;
    }

}
