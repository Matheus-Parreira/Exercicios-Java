package Exercicios.Ex09;

public class Aluno 
{

    private String nome;
    private double notaparcial;
    private double notafinal;

    public String getNome() 
    {
        return nome;
    }
    public double getNotaParcial() 
    {
        return notaparcial;
    }
    public double getNotaFinal() 
    {
        return notafinal;
    }

    public void setNome(String nome) 
    {
        if(!nome.isBlank())
            this.nome = nome;
    }

    public void setNotaParcial(double notaparcial)
    {
        if(notaparcial >= 0)
            this.notaparcial = notaparcial;
    }

    public void setNotaFinal(double notafinal)
    {
        if(notafinal >= 0)
            this.notafinal = notafinal;
    }

    public double calcularMedia(double notaparcial, double notafinal)
    {
        return (notaparcial + notafinal) / 2;
    }

    public String exibirInformacoes()
    {
        return String.format("Nome: %s\nNota Parcial: %.1f\nNota Final: %.1f\nMédia final: %.1f",
                nome, notaparcial, notafinal, calcularMedia(notaparcial, notafinal));
    }
}