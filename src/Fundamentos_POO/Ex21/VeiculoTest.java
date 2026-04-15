package Fundamentos_POO.Ex21;

public class VeiculoTest 
{
    public static void main(String[] args) 
    {      
        Veiculo[] veiculos = new Veiculo[3];
        veiculos[0] = new Carro("Ford", "Fiesta", 2009, 80, 4, 75);
        veiculos[1] = new Moto("Honda", "Biz", 2015, 60, "Urbana", 125);
        veiculos[2] = new Bicicleta("Caloi", "Aluminium Pro", 2020, 20, 29, 20);
        
        for(Veiculo v : veiculos)
        {
            System.out.println(v.toString());
        }
        
        Carro c1 = new Carro(veiculos[0].getMarca(), veiculos[0].getModelo(), 
                veiculos[0].getAnoFabricacao(), veiculos[0].getVelocidadeAtual(), 4, 75);
        c1.velocidadeMaxima();
        
        for(Veiculo v : veiculos)
        {
            v.virar();
        }
        
        for(Veiculo v : veiculos)
        {
            for(int i = 0; i < 10; i++)
                v.acelerar();
        }
        
        for(Veiculo v : veiculos)
        {
            System.out.println(v.toString());
        }
        
        Carro c2 = new Carro(veiculos[0].getMarca(), veiculos[0].getModelo(), 
                veiculos[0].getAnoFabricacao(), veiculos[0].getVelocidadeAtual(), 4, 75);
        c2.velocidadeMaxima();
    }
}