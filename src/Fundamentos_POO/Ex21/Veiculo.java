package Fundamentos_POO.Ex21;

/* Especifique as classes e seus respectivos atributos 
  (Veículo, Carro, Moto, Bicicleta).
  Cada classe deverá conter pelo menos dois atributos. 
  Demonstre a utilização do polimorfismo por generalização. */

public class Veiculo
{
    private String marca;
    private String modelo;
    private int anoFabricacao;
    private int velocidadeAtual;

    public Veiculo()
    {
        this.marca = "";
        this.modelo = "";
        this.anoFabricacao = 0;
        this.velocidadeAtual = 0;
    }
    public Veiculo(String marca, String modelo, int anoFabricacao, int velocidadeAtual) 
    {
        this.marca = marca;
        this.modelo = modelo;
        this.anoFabricacao = anoFabricacao;
        this.velocidadeAtual = velocidadeAtual;
    }

    public String getMarca() 
    {
        return marca;
    }
    public String getModelo() 
    {
        return modelo;
    }
    public int getAnoFabricacao() 
    {
        return anoFabricacao;
    }
    public int getVelocidadeAtual() 
    {
        return velocidadeAtual;
    }

    public void setMarca(String marca) 
    {
        if(!marca.isEmpty())
            this.marca = marca;
    }
    public void setModelo(String modelo) 
    {
        if(!modelo.isEmpty())
            this.modelo = modelo;
    }
    public void setAnoFabricacao(int anoFabricacao) 
    {
        if(anoFabricacao <= 2026 && anoFabricacao >= 1900)
            this.anoFabricacao = anoFabricacao;
    }
    public void setVelocidadeAtual(int velocidadeAtual) 
    {
        this.velocidadeAtual = velocidadeAtual;
    }
    
    public void acelerar()
    {
        setVelocidadeAtual(getVelocidadeAtual() + 10);
    }
    public void desacelerar()
    {
        if(getVelocidadeAtual() >= 10)
            setVelocidadeAtual(getVelocidadeAtual() - 10);
    }
    public void virar()
    {
        System.out.println("O veículo está virando!");
    }
    public void frear()
    {
        setVelocidadeAtual(0);
    }

    @Override
    public String toString() 
    {
        return String.format("Marca: %s\nModelo: %s\nAno de fabricação: %d\nVelocidade atual: %d Km/h\n",
                getMarca(), getModelo(), getAnoFabricacao(), getVelocidadeAtual());
    }   
}