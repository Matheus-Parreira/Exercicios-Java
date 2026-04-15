package Fundamentos_POO.Ex18;

/* A seguir, crie uma classe chamada Robô que implemente esses métodos. 
   Dentro de cada método imprima uma mensagem em tela 
   contendo a ação correspondente.  */

public class Robo extends Controle
{
    @Override
    public void andar()
    {
        System.out.println("Estou andando!\n");
    }
    
    @Override
    public void virar()
    {
        System.out.println("Acabei de virar!\n");
    }

    @Override
    public void falar() 
    {
        System.out.println("Beep!\n");
    }
}