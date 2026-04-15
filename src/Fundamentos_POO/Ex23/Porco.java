package Fundamentos_POO.Ex23;

public class Porco extends Animal
{
    public Porco()
    {
        super();
    }
    public Porco(String nome) 
    {
        super(nome);
    }
    
    @Override
    public void emitirSom()
    {
        System.out.println("Oinc!\n");
    }
    
    @Override
    public String toString()
    {
        return String.format("Nome do porco: %s", getNome());
    }
}
