package Exercicios;
import java.text.DecimalFormat;

public class Ex08 
{
    public static void main(String[] args) 
    {
        int num;
        DecimalFormat form = new DecimalFormat("#.##");

        for(int i = 0; i < 10; i++)
        {
            num = (int) ((Math.random() * 100) + 1);

            System.out.println("O número atual é: " + num);

            if(num % 2 == 0) // Verifica se o número é par ou impar (usando o operador de módulo da divisão)
                System.out.println("O número é par.");
            else
                System.out.println("O número é impar.");

            if(num > 50) // Verifica se o número é maior ou menor que 50
                System.out.println("O número é maior que 50.");
            else
                System.out.println("O número é menor/igual a 50.");

            /*
             * Função Math.abs calcula o absoluto do número
             * Resultado é convertido para valor inteiro
             */
            System.out.println("Absoluto do número: " + Math.abs(num));
            /*
             * Função Math.sqrt calcula a raiz quadrada do número
             * Resultado é formatado para duas casas decimais
             */ 
            System.out.println("Raiz quadrada do número: " + form.format(Math.sqrt(num)) + "\n");                                                                                       
        }
    }
}
