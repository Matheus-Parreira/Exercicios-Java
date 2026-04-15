package Interfaces_Graficas.Ex04;

public class Calculadora 
{
    /*
     * Desenvolva uma aplicação em Java para calcular o Índice de Massa Corporal
     * (IMC) de uma pessoa. 
     * A aplicação deve possuir uma interface gráfica, e uma
     * classe responsável pela lógica de cálculo.
     */

    private double peso;
    private double altura;

    public Calculadora()
    {
        this(0.0, 0.0);
    }
    public Calculadora(double peso, double altura) 
    {
        this.peso = peso;
        this.altura = altura;
    }
    
    public double getPeso() 
    {
        return peso;
    }
    public void setPeso(double peso) 
    {
        this.peso = peso;
    }

    public double getAltura() 
    {
        return altura;
    }
    public void setAltura(double altura) 
    {
        this.altura = altura;
    }
    
    public double calculoIMC()
    {
        double imc = peso / Math.pow(altura, 2);
        return imc;
    }
    
    @Override
    public String toString()
    {
        return String.format("Peso: %.2fkg\nAltura: %.2fm\n", peso, altura);
    }
}