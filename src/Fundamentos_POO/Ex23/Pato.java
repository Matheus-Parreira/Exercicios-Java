package Fundamentos_POO.Ex23;

public class Pato extends Animal
{
    public Pato()
    {
        super();
    }
    public Pato(String nome) 
    {
        super(nome);
    }
    
    @Override
    public void emitirSom()
    {
        System.out.println("Quack!\n");
    }
    
    @Override
    public String toString()
    {
        return String.format("Nome do pato: %s", getNome());
    }
}