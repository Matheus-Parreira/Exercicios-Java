package Fundamentos_POO.Ex10;

import java.util.Scanner;

/* Por fim, especifique a classe de teste. */

public class NumeroTest 
{
    public static void main(String[] args) 
    {
        Scanner entrada = new Scanner(System.in);
        int num;   
        System.out.print("Informe um número inteiro: ");
        num = entrada.nextInt();
        
        if(num > 0)
        {
            Numero n = new Numero();
            n.numero = num;
            
            System.out.println(String.format("\nNúmero: %d", num));
            System.out.println(String.format("Raiz quadrada do número: %.2f", n.raizQuadrada()));
            System.out.println(String.format("Quadrado do número: %d", n.quadrado()));
            System.out.println(String.format("Número ao cubo: %d", n.cubo()));
        }
        else
            System.out.println("\nErro: Número deve ser positivo e maior que 0!");
    } 
}