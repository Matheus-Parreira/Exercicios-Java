package Fundamentos_POO.Ex21;

public class Moto extends Veiculo
{
    private String tipo;
    private double cilindradas;

    public Moto() 
    {
        super();
        this.tipo = "";
        this.cilindradas = 0.0;
    }
    public Moto(String marca, String modelo, int anoFabricacao, int velocidadeAtual, String tipo, double cilindradas) 
    {
        super(marca, modelo, anoFabricacao, velocidadeAtual);
        this.tipo = tipo;
        this.cilindradas = cilindradas;
    }

    public String getTipo() 
    {
        return tipo;
    }
    public double getCilindradas() 
    {
        return cilindradas;
    }

    public void setTipo(String tipo) 
    {
        if(!tipo.isEmpty());
            this.tipo = tipo;
    }
    public void setCilindradas(double cilindradas) 
    {
        if(cilindradas  >= 100)
            this.cilindradas = cilindradas;
    }
    
    @Override
    public void acelerar()
    {
        if(getVelocidadeAtual() < 100)
            setVelocidadeAtual(getVelocidadeAtual() + 10);
    }
    @Override
    public void virar()
    {
        System.out.println("A moto está virando!");
    }
    
    @Override
    public String toString() 
    {
        return String.format("Marca: %s\nModelo: %s\nAno de fabricação: %d\nVelocidade atual: %d Km/h"
                + "\nTipo: %s\nCilindradas: %.1f cc\n", getMarca(), getModelo(), getAnoFabricacao(), 
                getVelocidadeAtual(), getTipo(), getCilindradas());
    }
    
}