package Exercicios;
import java.util.Scanner;

public class Ex04 
{
    /*
     * Crie uma classe que receba dois valores numéricos e apresente na tela o
     * resultado das quatro operações básicas: soma, subtração, multiplicação e
     * divisão.
     */

    public static void main(String[] args) 
    {
        double op1, op2;
        Scanner inp = new Scanner(System.in);

        System.out.print("Digite o primeiro operando: ");
        op1 = inp.nextDouble();
        System.out.print("Digite o segundo operando: ");
        op2 = inp.nextDouble();
        
        System.out.println(op1 + " + " + op2 + " = " + (op1 + op2));
        System.out.println(op1 + " - " + op2 + " = " + (op1 - op2));
        System.out.println(op1 + " * " + op2 + " = " + (op1 * op2));
        System.out.println(op1 + " / " + op2 + " = " + (op1 / op2));

        inp.close();
    }
}
