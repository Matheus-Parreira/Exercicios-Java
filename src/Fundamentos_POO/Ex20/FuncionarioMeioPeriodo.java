package Fundamentos_POO.Ex20;

/* Classe FuncionarioMeioPeriodo
    * horas_trabalhadas (int): representando o número de horas 
      trabalhadas pelo funcionário em meio período.
   Sobrescreva o método calcular_salario() para calcular o salário total 
   com base nas horas trabalhadas multiplicadas pelo salário por hora */

public class FuncionarioMeioPeriodo extends Funcionario
{
    private int horas_trabalhadas;
    
    public FuncionarioMeioPeriodo() 
    {
        super();
    }
    public FuncionarioMeioPeriodo(String nome, double salario_base, int horas_trabalhadas) 
    {
        super(nome, salario_base);
        this.horas_trabalhadas = horas_trabalhadas;
    }
    
    public int getHorasTrabalhadas() 
    {
        return horas_trabalhadas;
    }
    public void settHorasTrabalhadas(int horas_trabalhadas) 
    {
        if(horas_trabalhadas <= 220)
            this.horas_trabalhadas = horas_trabalhadas;
    }
    
    @Override
    public double calcularSalario()
    {
        double salario_hora = getSalario_base() / 220;
        double salario_total = salario_hora * horas_trabalhadas;
        return salario_total;
    }

    @Override
    public String toString() 
    {
        return String.format("Nome: %s\nSalário-Base: %.2f\nHoras trabalhadas: %d\nSalário total: R$ %.2f\n", 
                getNome(), getSalario_base(), getHorasTrabalhadas(), calcularSalario());
    }
}