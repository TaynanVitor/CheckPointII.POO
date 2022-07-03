package Hogwarts;

public class LufaLufa extends Casas{

    public LufaLufa(String orientador, Integer qtdAlunos, Integer pontuacaoCasa, String especialidade) {
        super(orientador, qtdAlunos, pontuacaoCasa, especialidade);
    }

    @Override
    public int obterQuantidadeDeAlunos() throws AlunosException {
        int quantidadeDeAlunos = 0;
        for (Alunos aluno : listaAlunos) {
            if (aluno.getDisciplinaDestaque() == "herbologia" || aluno.getAnoLetivo() <=7) {
                quantidadeDeAlunos++;
            } else {
                throw new AlunosException("Aluno já formado");
            }
            System.out.println("A quantidadde de alunos nessa casa é de: "+ quantidadeDeAlunos);
        }

        return quantidadeDeAlunos;
    }



    @Override
    public int somarPontos () {
        int total = 0;
        for (Alunos pontuacao : getListaAlunos()) {
            if (pontuacao.getDisciplinaDestaque() == "herbologia") {
                total += pontuacao.getPontuacao();
            }
        }
        return total;
    }

}