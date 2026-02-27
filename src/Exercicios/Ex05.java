package Exercicios;
import javax.swing.JOptionPane;

public class Ex05 
{
    /*
     * Faça uma classe que apresente em tela a tabuada de qualquer número. O usuário
     * fornece o número desejado e a classe apresenta a relação de todos os cálculos de 1 a 10.
     */

    public static void main(String[] args) 
    {
        String str;
        str = JOptionPane.showInputDialog("Informe um número: ");
        /*
         * Testa se string é igual a null (caso o usuário clique em "cancelar");
         * Se for nula, atribui valor vazio ("");
         */
        str = (str == null) ? "" : str;

        // Verifica se valor digitado é válido (se string não está vazia)
        if(!str.isEmpty()) 
        {
            // Valor digitado é convertido para tipo inteiro;
            int num = Integer.parseInt(str);

            String saida = "TABUADA\n\n";
            for (int i = 1; i <= 10; i++)
                saida += String.format("%d x %d = %d\n", num, i, (num * i));

            JOptionPane.showMessageDialog(null, saida);
        }
        else 
        {
            JOptionPane.showMessageDialog(null,
                    "Você precisa informar um número",
                    "Erro",
                    JOptionPane.ERROR_MESSAGE);
        }
    }
}