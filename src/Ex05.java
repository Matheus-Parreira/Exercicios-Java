import javax.swing.JOptionPane;

public class Ex05 
{
    /*
     * Faça uma classe que apresente em tela a tabuada de qualquer número. O usuário
     * fornece o número desejado e a classe apresenta a relação de todos os cálculos de 1 a 10.
     */

    public static void main(String[] args) 
    {
        int num = 0;
        StringBuilder msg = new StringBuilder();

        num = Integer.parseInt(JOptionPane.showInputDialog("Digite um número inteiro:"));

        for(int i = 1; i <= 10; i++) 
            msg.append(num).append(" * ").append(i).append(" = ").append(num * i).append("\n");

        JOptionPane.showMessageDialog(null, msg);
    }
}
