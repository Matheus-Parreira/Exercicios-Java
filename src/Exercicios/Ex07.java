package Exercicios;
import java.text.DecimalFormat;

public class Ex07 
{
    public static void main(String[] args)
    {
        /* 
         * Cria formato para exibir raiz quadrada de cada número 
         * (com duas casas decimais) 
         */
        DecimalFormat form = new DecimalFormat("#.##");

        for(int i = 1; i <= 20; i++)
        {
            System.out.println("O número atual é: " + i);

            if(i % 2 == 0) // Verifica se o número é par ou impar (usando o operador de módulo da divisão)
                System.out.println("O número é par.");
            else
                System.out.println("O número é impar.");

            /*
             * Função Math.pow calcula o quadrado do número
             * Resultado é convertido para valor inteiro
             */
            System.out.println("Quadrado do número: " + (int) Math.pow(i, 2));
            /*
             * Função Math.sqrt calcula a raiz quadrada do número
             * Resultado é formatado para duas casas decimais
             */
            System.out.println("Raiz quadrada do número: " + form.format(Math.sqrt(i)) + "\n"); 
        }
    }
}
