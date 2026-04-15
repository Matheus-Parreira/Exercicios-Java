package Fundamentos_POO.Ex20;

/* Desenvolver um sistema de gerenciamento de funcionários para uma empresa.
   Classe Funcionario
    nome (string): representando o nome do funcionário.
    salario_base (double): representando o salário base do funcionário.
   Além disso, implemente um método chamado calcular_salario() que retorna 
   o salário total do funcionário */

public class Funcionario 
{
    private String nome;
    private double salario_base;

    public Funcionario() 
    {
        nome = "";
        salario_base = 0.0;
    }
    public Funcionario(String nome, double salario_base) 
    {
        this.nome = nome;
        this.salario_base = salario_base;
    }

    public String getNome() 
    {
        return nome;
    }
    public double getSalario_base() 
    {
        return salario_base;
    }

    public void setNome(String nome) 
    {
        this.nome = nome;
    }
    public void setSalario_base(double salario_base) 
    {
        if(salario_base >= 1621.00)
            this.salario_base = salario_base;
    }
    
    public double calcularSalario()
    {
        double salario_total = getSalario_base();
        return salario_total;
    }

    @Override
    public String toString() 
    {
        return String.format("Nome: %s\nSalário-Base: %.2f\n\nSalário total: R$ %.2f\n", 
                getNome(), getSalario_base(), calcularSalario());
    }    
}