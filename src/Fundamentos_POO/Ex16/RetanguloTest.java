package Fundamentos_POO.Ex16;

/* Escreva uma classe de teste para demonstrar o funcionamento da 
   classe Retângulo e o uso de todos os construtores. */

public class RetanguloTest 
{
    public static void main(String[] args) 
    {
        Retangulo r1 = new Retangulo();
        r1.setComprimento(13.0);
        r1.setLargura(8.0);
        System.out.println(r1.toString());
        r1.calcularArea();
        r1.calcularPerimetro();
        
        Retangulo r2 = new Retangulo(19.0);
        r2.setLargura(11.0);
        System.out.println(r2.toString());
        r2.calcularArea();
        r2.calcularPerimetro();
        
        Retangulo r3 = new Retangulo(8.0, 3.0);
        System.out.println(r3.toString());
        r3.calcularArea();
        r3.calcularPerimetro();
    }
}