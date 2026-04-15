package Fundamentos_POO.Ex21;

public class Bicicleta extends Veiculo
{
    private int aro;
    private int marchas;
    
    public Bicicleta() 
    {
        super();
        this.aro = 0;
        this.marchas = 0;
    }
    public Bicicleta(String marca, String modelo, int anoFabricacao, int velocidadeAtual, int aro, int marchas) 
    {
        super(marca, modelo, anoFabricacao, velocidadeAtual);
        this.aro = aro;
        this.marchas = marchas;
    }

    public int getAro() 
    {
        return aro;
    }
    public int getMarchas() 
    {
        return marchas;
    }

    public void setAro(int aro) 
    {
        if(aro >= 10)
            this.aro = aro;
    }
    public void setMarchas(int marchas) 
    {
        if(marchas >= 0)
            this.marchas = marchas;
    }
    
    @Override
    public void acelerar()
    {
        if(getVelocidadeAtual() < 50)
            setVelocidadeAtual(getVelocidadeAtual() + 10);
    }
    @Override
    public void virar()
    {
        System.out.println("A bicicleta está virando!\n");
    }
    
    @Override
    public String toString() 
    {
        return String.format("Marca: %s\nModelo: %s\nAno de fabricação: %d\nVelocidade atual: %d Km/h"
                + "\nAro: %d polegadas\nMarchas: %d\n", getMarca(), getModelo(), getAnoFabricacao(), 
                getVelocidadeAtual(), getAro(), getMarchas());
    }
}