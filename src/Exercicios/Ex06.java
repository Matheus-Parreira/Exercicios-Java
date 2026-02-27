package Exercicios;
import javax.swing.JOptionPane;

public class Ex06 
{
    /*
     * Crie uma classe que simule a jogada de um dado de seis lados (números de 1 a
     * 6) por três vezes. Ao final some seus valores e apresente o resultado das
     * três jogadas.
     */
    public static void main(String[] args) 
    {
        String saida = "Números Sorteados\n\n";
        int soma = 0;

        for(int i = 0; i < 3; i++) 
        {
            int num = (int) ((Math.random() * 6) + 1);
            saida += String.format("%d\n", num);
            soma += num;
        }

        saida += String.format("Total = %d", soma);
        JOptionPane.showMessageDialog(null, saida);
    }
}
