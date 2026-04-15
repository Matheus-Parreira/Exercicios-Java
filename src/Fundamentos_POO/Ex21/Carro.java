package Fundamentos_POO.Ex21;

/* Na classe Carro crie um método denominado velocidadeMaxima capaz de 
  indicar se o veículo atingiu a velocidade máxima permitida */

public class Carro extends Veiculo
{
    private int portas;
    private double potencia;
    
    public Carro()
    {
        super();
        this.portas = 0;
        this.potencia = 0.0;
    }
    public Carro(String marca, String modelo, int anoFabricacao, int velocidadeAtual, int portas, double potencia) 
    {
        super(marca, modelo, anoFabricacao, velocidadeAtual);
        this.portas = portas;
        this.potencia = potencia;
    }

    public int getPortas() 
    {
        return portas;
    }
    public double getPotencia() 
    {
        return potencia;
    }

    public void setPortas(int portas) 
    {
        if(portas == 2 || portas == 4)
            this.portas = portas;
    }
    public void setPotencia(double potencia) 
    {
        if(potencia >= 50)
            this.potencia = potencia;
    }
    
    @Override
    public void acelerar()
    {
        if(getVelocidadeAtual() < 150)
            setVelocidadeAtual(getVelocidadeAtual() + 10);
    }
    @Override
    public void virar()
    {
        System.out.println("O carro está virando!");
    }
    
    public void velocidadeMaxima()
    {
        if(getVelocidadeAtual() == 150)
            System.out.println(String.format("O carro %s %s está na velocidade máxima!\n", 
                    getMarca(), getModelo()));
        else
            System.out.println(String.format("O carro %s %s está abaixo da velocidade máxima!\n", 
                    getMarca(), getModelo()));
    }
    
    @Override
    public String toString() 
    {
        return String.format("Marca: %s\nModelo: %s\nAno de fabricação: %d\nVelocidade atual: %d Km/h"
                + "\nPortas: %d\nPotência: %.1f cavalos\n", getMarca(), getModelo(), getAnoFabricacao(), 
                getVelocidadeAtual(), getPortas(), getPotencia());
    }
}