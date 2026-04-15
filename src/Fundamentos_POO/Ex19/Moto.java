package Fundamentos_POO.Ex19;

/* Crie uma classe Moto, que também herda da classe Veiculo, com um atributo adicional: 
    cilindradas (double): representando a capacidade em cilindradas do motor da moto.*/

public class Moto extends Veiculo
{
    private double cilindradas;
    public Moto()
    {
        super();
        cilindradas = 0.0;
    }
    public Moto(String marca, String modelo, int ano, double cilindradas)
    {
        super(marca, modelo, ano);
        this.cilindradas = cilindradas;
    }

    public double getCilindradas() 
    {
        return cilindradas;
    }
    public void setCilindradas(double cilindradas) 
    {
        if(cilindradas > 0)
            this.cilindradas = cilindradas;
    }
    
    @Override
    public String toString()
    {
        return String.format("Marca: %s\nModelo: %s\nAno: %d\nCilindradas: %.1f\n",
                getMarca(), getModelo(), getAno(), getCilindradas());
    }
}