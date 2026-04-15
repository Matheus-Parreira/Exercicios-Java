package Fundamentos_POO.Ex19;

/*  Crie uma classe Carro, que herda da classe Veiculo, com um atributo adicional: 
    numPortas (int): representando o número de portas do carro. */

public class Carro extends Veiculo
{
    private int numPortas;
    
    public Carro()
    {
        super();
        numPortas = 0;
    }
    public Carro(String marca, String modelo, int ano, int numPortas)
    {
        super(marca, modelo, ano);
        this.numPortas = numPortas;
    }

    public int getNumPortas() 
    {
        return numPortas;
    }
    public void setNumPortas(int numPortas) 
    {
        if(numPortas == 2 || numPortas == 4)
            this.numPortas = numPortas;
    }
    
    @Override
    public String toString()
    {
        return String.format("Marca: %s\nModelo: %s\nAno: %d\nPortas: %d\n",
                getMarca(), getModelo(), getAno(), getNumPortas());
    }
}