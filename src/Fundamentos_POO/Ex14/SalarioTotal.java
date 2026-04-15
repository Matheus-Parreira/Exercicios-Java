package Fundamentos_POO.Ex14;

/*Desenvolver uma aplicação Java utilizando todos os conceitos de POO 
  apresentados até o momento para o cálculo do Salário Total de um 
  funcionário.
  Requisitos Funcionais:
    * Entrada de Dados
        * Salário Base
        * Total de Horas Trabalhadas no Mês
        * Total de Horas Extras
    * Saída
        * Salário Total
 */

public class SalarioTotal 
{
    private double salarioBase;
    private int horasTrabalhadas;
    private int horasExtras;

    public double getSalarioBase() 
    {
        return salarioBase;
    }
    public int getHorasTrabalhadas() 
    {
        return horasTrabalhadas;
    }
    public int getHorasExtras() 
    {
        return horasExtras;
    }
    
    public void setSalarioBase(double salarioBase) 
    {
        if(salarioBase >= 1621.00)
            this.salarioBase = salarioBase;
    }
    public void setHorasTrabalhadas(int horasTrabalhadas) 
    {
        this.horasTrabalhadas = horasTrabalhadas;
    }
    public void setHorasExtras(int horasExtras) 
    {
        this.horasExtras = horasExtras;
    }
    
    public double getValorTotalHorasExtras()
    {
        double valTrab, valExtra, totalExtra;
        
        valTrab = salarioBase/horasTrabalhadas;
        System.out.println(String.format("\nValor da hora trabalhada: R$ %.2f", valTrab));
        
        valExtra = valTrab + (valTrab * 0.5);
        System.out.println(String.format("Valor da hora extra: R$ %.2f", valExtra));
        
        totalExtra = valExtra * horasExtras;
        System.out.println(String.format("Valor total de horas extras: R$ %.2f", totalExtra));
        
        return totalExtra;
    }
    
    public void getSalarioTotal()
    {
        double totalExtra = getValorTotalHorasExtras();
        System.out.println(String.format("Salário total: R$ %.2f", salarioBase + totalExtra));        
    }
}