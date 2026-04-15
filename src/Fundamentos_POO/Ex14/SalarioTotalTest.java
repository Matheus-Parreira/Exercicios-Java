package Fundamentos_POO.Ex14;

import java.util.Scanner;

public class SalarioTotalTest 
{
    public static void main(String[] args) 
    {
        Scanner entrada = new Scanner(System.in);
        SalarioTotal s = new SalarioTotal();
        
        System.out.println("Informe o salário-base (em R$): ");
        s.setSalarioBase(entrada.nextDouble());
        
        System.out.println("Informe o total de horas trabalhadas: ");
        s.setHorasTrabalhadas(entrada.nextInt());
        
        System.out.println("Informe o total de horas extras no mês: ");
        s.setHorasExtras(entrada.nextInt());
        
        s.getSalarioTotal();
    }
}