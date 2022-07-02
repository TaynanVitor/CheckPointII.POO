package Hogwarts;

import java.util.Scanner;

public class Alunos {


    //// Attributes
    
    private String nome;
    private String endereco;
    private Integer pontuacao;
    private Integer anoLetivo;
    private String disciplinaDestaque;
    private Integer matricula;


    ///// Constructor 
    
    public Alunos (String nome, String endereco, Integer pontuacao, Integer matricula, Integer anoLetivo, String disciplinaDestaque) {
        this.nome = nome;
        this.endereco = endereco;
        this.pontuacao = pontuacao;
        this.matricula = matricula;
        this.anoLetivo = anoLetivo;
        this.disciplinaDestaque = disciplinaDestaque;
    }

    //// methods
    
    //// 1- Matricular aluno
    
    public void matricularAluno(String[] args){

        Scanner sc = new Scanner(System.in);
            System.out.println("Por favor, digite o nome completo do aluno: ");
            nome = sc.next();
            System.out.println("Por favor, digite a cidade do aluno: ");
            endereco = sc.next();
            System.out.println("Por favor, digite a matricula do aluno: ");
            matricula = sc.nextInt();
            System.out.println("Por favor, digite o ano letivo do aluno: ");
            anoLetivo = sc.nextInt();
            System.out.println("Por favor, digite a disciplina destaque do aluno: ");
            disciplinaDestaque = sc.next();
            
            System.out.println("Parabéns, o aluno foi matriculado com sucesso!");

    }






//    Scanner sc = new Scanner(System.in); //cria um scanner para recuperar os dados digitados pelo usuário
//        System.out.println("Informe um nome: "); // exibe a frase na tela
//    nome = sc.next(); // ou nextLine() recupera a String digitada no console
//        System.out.println("Informe um sobrenome: ");
//    sobrenome = sc.next();
//        System.out.println("Qual o dia de nascimento: ");
//    dia = sc.nextInt(); //recupera a int digitada no console
//        System.out.println("Qual o mês de nascimento: ");
//    mes = sc.nextInt();
//        System.out.println("Qual o ano de nascimento: ");
//    ano = sc.nextInt();


//    iniciaisNome = nome.charAt(0)  + sobrenome.substring(0,1);// substring recuperar letras a partir das posições. Passamos a possição inicial do indice até a final
//    String dataNascimento =  dia.toString() + "/" + mes.toString() + "/" + ano.toString();
//
//        System.out.println("Eu me chamo: " + nome + " " + sobrenome + ", minhas inciais são: " +
//    iniciaisNome + ". Nasci em: " + dataNascimento);
//

    
    //// getters and setters

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

    public Integer getAnoLetivo() {
        return anoLetivo;
    }

    public void setAnoLetivo(Integer anoLetivo) {
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
