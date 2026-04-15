package Fundamentos_POO.Ex23;

public class Gato extends Animal
{
    public Gato()
    {
        super();
    }
    public Gato(String nome) 
    {
        super(nome);
    }
    
    @Override
    public void emitirSom()
    {
        System.out.println("Miau!\n");
    }
    
    @Override
    public String toString()
    {
        return String.format("Nome do gato: %s", getNome());
    }
}