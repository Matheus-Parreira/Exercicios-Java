package Interfaces_Graficas.Ex05;

public class Consumo 
{
    /*
     * Desenvolva uma aplicação em Java que permita calcular o consumo médio de
     * combustível de um veículo. 
     * A aplicação deverá possuir uma interface gráfica
     * para entrada de dados e uma classe responsável pelo processamento do cálculo.
     */
    private double distancia;
    private double combustivel;

    public Consumo()
    {
        this(0.0, 0.0);
    }
    public Consumo(double distancia, double combustivel) 
    {
        this.distancia = distancia;
        this.combustivel = combustivel;
    }
    
    public double getDistancia() 
    {
        return distancia;
    }
    public void setDistancia(double distancia) 
    {
        this.distancia = distancia;
    }

    public double getCombustivel() 
    {
        return combustivel;
    }
    public void setCombustivel(double combustivel) 
    {
        this.combustivel = combustivel;
    }
    
    // Realiza o cálculo do consumo, retornando resultado
    public double calculoConsumo()
    {
        double consumo = distancia / combustivel;
        return consumo;
    }
    
    @Override
    public String toString()
    {
        return String.format("Distância percorrida: %.2fKm\nCombustível gasto: %.2fL\n", distancia, combustivel);
    }
}
