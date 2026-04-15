package Fundamentos_POO.Ex09;

// Especifique a classe PessoaTest contendo quatro objetos instanciados da classe Pessoa.

public class PessoaTest 
{
    public static void main(String[] args) 
    {
        Pessoa p1 = new Pessoa();
        p1.nome = "Pedro";
        p1.peso = 67.1;
        p1.altura = 1.65;
        
        Pessoa p2 = new Pessoa();
        p2.nome = "Sabrina";
        p2.peso = 81.7;
        p2.altura = 1.73;
        
        Pessoa p3 = new Pessoa();
        p3.nome = "Itallo";
        p3.peso = 113.0;
        p3.altura = 1.75;
        
        Pessoa p4 = new Pessoa();
        p4.nome = "Silvia";
        p4.peso = 84.1;
        p4.altura = 1.70;
        
        System.out.println(String.format("O IMC de %s é: %.1f", p1.nome, p1.calculoIMC()));
        System.out.println(String.format("O IMC de %s é: %.1f", p2.nome, p2.calculoIMC()));
        System.out.println(String.format("O IMC de %s é: %.1f", p3.nome, p3.calculoIMC()));
        System.out.println(String.format("O IMC de %s é: %.1f", p4.nome, p4.calculoIMC()));
    }
}