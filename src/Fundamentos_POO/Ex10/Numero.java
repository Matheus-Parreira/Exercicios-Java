package Fundamentos_POO.Ex10;

/*Escreva uma classe que receba um número inteiro positivo e maior que zero. 
  Especifique métodos para determinar:
    * A raiz quadrada do número; 
    * O número ao quadrado; 
    * O número ao cubo.
 */

public class Numero 
{
    int numero;
    
    public double raizQuadrada()
    {
        return Math.sqrt(numero);
    }
    
    public int quadrado()
    {
        return Math.powExact(numero, 2);
    }
    
    public int cubo()
    {
        return Math.powExact(numero, 3);
    }
}