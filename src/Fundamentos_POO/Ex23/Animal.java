package Fundamentos_POO.Ex23;

/* Criar uma hierarquia de classes que representam diferentes tipos de 
  animais e demonstrar o polimorfismo através de um programa de teste.
  Crie uma classe base chamada Animal:
    * Atributo nome do tipo String para representar o nome do animal.
    * Um construtor que inicializa o nome do animal.
    * Um método emitirSom() que imprime uma mensagem genérica 
      para representar o som do animal.
  Crie pelo subclasses de Animais que representam tipos específicos de 
  animais, como Cachorro, Gato, Pato, etc. 
  Cada uma dessas subclasses deve sobrescrever o método emitirSom() 
  para representar o som específico do animal. */

public class Animal 
{
    private String nome;

    public Animal()
    {
        this.nome = "";
    }
    public Animal(String nome) 
    {
        this.nome = nome;
    }

    public String getNome() 
    {
        return nome;
    }
    
    public void setNome(String nome) 
    {
        if(!nome.isEmpty())
            this.nome = nome;
    }
    
    public void emitirSom()
    {
        System.out.println("O animal emitiu um som!\n");
    }
    
    @Override
    public String toString()
    {
        return String.format("Nome do animal: %s", getNome());
    }
}