package Hogwarts;

public class Corvinal extends Casas {

    public Corvinal(String orientador, Integer qtdAlunos, Integer pontuacaoCasa, Integer especialidade) {
        super(orientador, qtdAlunos, pontuacaoCasa, especialidade);
    }


    @Override
    public int obterQuantidadeDeAlunos() {
        int quantidadeDeAlunos = 0;
        for (Alunos aluno : getListaAlunos()) {
            if (aluno.getDisciplinaDestaque() == "poções") {
                quantidadeDeAlunos++;
            }
        }
        return quantidadeDeAlunos;
    }

    @Override
    public Integer somarPontos() {
        Integer total = 0;
        for (Alunos pontuacao : getListaAlunos()) {
            if (pontuacao.getDisciplinaDestaque() == "poções") {
                total += pontuacao.getPontuacao();
            }
            }
            return total;
    }

}




