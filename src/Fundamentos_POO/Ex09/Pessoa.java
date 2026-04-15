package Fundamentos_POO.Ex09;

/* Especifique uma classe denominada Pessoa que contenha atributos 
   para armazenar os seguintes dados: Nome, Peso e Altura
   Crie um método para: calcular o IMC: (peso/(altura*altura)) */

public class Pessoa 
{
    String nome;
    double peso;
    double altura;
    
    public double calculoIMC()
    {
       return peso / (altura * altura);
    }
}