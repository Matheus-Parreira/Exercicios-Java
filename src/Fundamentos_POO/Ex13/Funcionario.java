package Fundamentos_POO.Ex13;

/* Exercício 2: Escreva uma classe denominada Funcionario que contenha 
   os atributos encapsulados: nome, salario e ano de contratação. 
   Especifique os métodos modificadores de acesso set/get para 
   cada atributo, bem como, os seguintes métodos:
    * getBonificacao()
        * 5% de bonificação para mais de 5 anos
        * 10% de bonificação para mais de 10 anos
        * 20% de bonificação para mais de 20 anos
    * getSalarioTotal() */

public class Funcionario 
{
    private String nome;
    private double salario;
    private int anoContratacao;

    public String getNome() 
    {
        return nome;
    }
    public double getSalario() 
    {
        return salario;
    }
    public int getAnoContratacao() 
    {
        return anoContratacao;
    }
    
    public void setNome(String nome) 
    {
        if(!nome.isEmpty())
            this.nome = nome;
    }
    public void setSalario(double salario) 
    {
        if(salario >= 1621.00)
            this.salario = salario;
    }
    public void setAnoContratacao(int anoContratacao) 
    {
        if(anoContratacao <= 2026 && anoContratacao >= 1970)
            this.anoContratacao = anoContratacao;
    }
    
    public double getBonificacao()
    {
        double bonificacao = 0.0;
        
        if(2026 - anoContratacao > 5 && 2026 - anoContratacao <= 10)
            bonificacao = salario * 0.05;
        else if(2026 - anoContratacao > 10 && 2026 - anoContratacao <= 20)
            bonificacao = salario * 0.1;
        else if(2026 - anoContratacao > 20)
            bonificacao = salario * 0.2;
        
        return bonificacao;
    }
    
    public void getSalarioTotal()
    {
        System.out.println(String.format("Nome do funcionário: %s\nSalario-Base: R$ %.2f\nBonificação: R$ %.2f\nSalário total: R$ %.2f",
                nome, salario, getBonificacao(), salario + getBonificacao()));
    }
}