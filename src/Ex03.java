import java.util.Scanner;

public class Ex03 
{
    /*
     * Crie uma classe para calcular e exibir na tela o peso ideal. 
     * IMC = (peso / (altura^2))
     */

    public static void main(String[] args) 
    {
        double altura, inferior, superior;
        Scanner inp = new Scanner(System.in);

        System.out.print("Insira sua altura: ");
        altura = inp.nextDouble();

        inferior = 18.5 * (altura * altura);
        superior = 24.9 * (altura * altura);

        System.out.print("Seu peso ideal está entre " + inferior + "kg e " + superior + "kg");
        inp.close();
    }
}
