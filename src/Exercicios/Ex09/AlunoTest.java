package Exercicios.Ex09;

public class AlunoTest 
{
    public static void main(String[] args) 
    {
        Aluno nomeAluno = new Aluno();
        nomeAluno.setNome("Nome do aluno");
        nomeAluno.setNotaParcial(10.0);
        nomeAluno.setNotaFinal(10.0);

        System.out.println(nomeAluno.exibirInformacoes());
    }
}