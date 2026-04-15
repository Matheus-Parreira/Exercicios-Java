package Interfaces_Graficas.Ex01;
import javax.swing.JOptionPane;

public class Ex01 
{
    /*
     * Considere o seguinte trecho de código:
     * 
     * String nome = "João da Silva";
     * double altura = 1.95;
     * double peso = 92.58;
     * 
     * Escreva um programa em linguagem Java que apresente na tela o IMC e o
     * nome do João. Para isso, utilize a caixa de diálogo.
     */
    public static void main(String[] args) 
    {
        String nome = "João da Silva";
        double altura = 1.95;
        double peso = 92.58;

        JOptionPane.showMessageDialog(null, "O IMC de " + nome + " é " + peso / (altura * altura));
    }
}