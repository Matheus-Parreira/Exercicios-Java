package Fundamentos_POO.Ex20;

/*Classe FuncionarioIntegral
    bonus (double): representando o bônus adicional que o funcionário em período integral recebe.
  Sobrescreva o método calcular_salario() para incluir o bônus no cálculo do salário total */

public class FuncionarioIntegral extends Funcionario
{
    private double bonus;
    
    public FuncionarioIntegral() 
    {
        super();
    }
    public FuncionarioIntegral(String nome, double salario_base, double bonus) 
    {
        super(nome, salario_base);
        this.bonus = bonus;
    }

    public double getBonus() 
    {
        return bonus;
    }
    public void setBonus(double bonus) 
    {
        this.bonus = bonus;
    }
    
    @Override
    public double calcularSalario()
    {
        double salario_total = getSalario_base() + getBonus();
        return salario_total;
    }

    @Override
    public String toString() 
    {
        return String.format("Nome: %s\nSalário-Base: %.2f\nBônus: %.2f\nSalário total: R$ %.2f\n", 
                getNome(), getSalario_base(), getBonus(), calcularSalario());
    }
}