package Fundamentos_POO.Ex16;

/* Desenvolva uma classe denominada Retângulo com os atributos comprimento e largura. 
   Forneça métodos que calculem o perímetro e a área do retângulo. 
   Os métodos set devem verificar se o comprimento e largura são, cada um, 
   números ponto flutuante maiores que 0,0 e menores que 20,0.
   A estrutura da classe deve conter:
    * Atributos encapsulados
        * 1 (um) construtor padrão
        * 2 (dois) construtores sobrecarregados
        * Métodos modificadores de acesso (get/set)
        * Método toString
*/
public class Retangulo 
{
    private double comprimento;
    private double largura;

    public Retangulo() 
    {
        this.comprimento = 0.0;
        this.largura = 0.0;
    }
    public Retangulo(double comprimento) 
    {
        this.comprimento = comprimento;
        this.largura = 0.0;
    }
    public Retangulo(double comprimento, double largura) 
    {
        this.comprimento = comprimento;
        this.largura = largura;
    }
    
    public double getComprimento() 
    {
        return comprimento;
    }
    public double getLargura() 
    {
        return largura;
    }

    public void setComprimento(double comprimento) 
    {
        if(comprimento > 0.0 && comprimento < 20.0)
            this.comprimento = comprimento;
    }
    public void setLargura(double largura) 
    {
        if(largura > 0.0 && largura < 20.0)
            this.largura = largura;
    }
    
    public void calcularPerimetro()
    {
        double perimetro = (getComprimento() * 2) + (getLargura() * 2);
        System.out.println(String.format("Perímetro total: %.2f m\n", perimetro));
    }
    public void calcularArea()
    {
        double area = getComprimento() * getLargura();
        System.out.println(String.format("Área total: %.2f m2", area));
    }
    
    @Override
    public String toString()
    {
        return String.format("Comprimento: %.2f m\nLargura: %.2f m", getComprimento(), getLargura());
    }
}