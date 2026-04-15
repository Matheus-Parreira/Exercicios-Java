package Fundamentos_POO.Ex19;

/* Desenvolver um sistema de gerenciamento de veículos para uma concessionária. 
   Crie uma classe base chamada Veiculo com os seguintes atributos: 
    marca (string), modelo (string) e ano (int).  
*/

public class Veiculo 
{
    private String marca;
    private String modelo;
    private int ano;

    public Veiculo() 
    {
        this.marca = "";
        this.modelo = "";
        this.ano = 0;
    }
    public Veiculo(String marca, String modelo, int ano) 
    {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
    }

    public String getMarca() 
    {
        return marca;
    }
    public String getModelo() 
    {
        return modelo;
    }
    public int getAno() 
    {
        return ano;
    }

    public void setMarca(String marca) 
    {
        this.marca = marca;
    }
    public void setModelo(String modelo) 
    {
        this.modelo = modelo;
    }
    public void setAno(int ano) 
    {
        if(ano >= 2000)
            this.ano = ano;
    }
    
    @Override
    public String toString()
    {
        return String.format("Marca: %s\nModelo: %s\nAno: %d\n",
                getMarca(), getModelo(), getAno());
    }
}