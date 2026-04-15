package Fundamentos_POO.Ex23;
import java.util.ArrayList;

/* Implemente o TesteAnimais. 
  Neste método, crie uma lista de animais que inclua objetos de 
  diferentes tipos (cachorro, gato, pato, etc.). 
  Em seguida, percorra a lista e chame o método emitirSom() 
  para cada animal, observando como o método correto é chamado 
  de acordo com o tipo real do animal na lista. */

public class TesteAnimais 
{
    public static void main(String[] args) 
    {       
        Animal a1 = new Cachorro("Max");
        Animal a2 = new Gato("Felix");
        Animal a3 = new Pato("Donald");
        Animal a4 = new Porco("Rodolfo");
        
        ArrayList<Animal> animais = new ArrayList<>();
        animais.add(a1);
        animais.add(a2);
        animais.add(a3);
        animais.add(a4);
        
        for(Animal a : animais)
        {
            System.out.println(a.toString());
            a.emitirSom();
        }
    }
}