package Fundamentos_POO.Ex23;

public class Cachorro extends Animal
{
    public Cachorro()
    {
        super();
    }
    public Cachorro(String nome) 
    {
        super(nome);
    }
    
    @Override
    public void emitirSom()
    {
        System.out.println("Au Au!\n");
    }
    
    @Override
    public String toString()
    {
        return String.format("Nome do cachorro: %s", getNome());
    }
}