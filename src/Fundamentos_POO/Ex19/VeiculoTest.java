package Fundamentos_POO.Ex19;

// Por fim, escreva a classe VeiculoTest para demonstrar o funcionamento da solução

import java.util.ArrayList;


public class VeiculoTest 
{
    public static void main(String[] args) 
    {
        Carro c1 = new Carro("Hyundai", "HB20 Premium", 2018, 4);   
        Moto m1 = new Moto("Honda", "CB300F Twister", 2021, 300);        
        Carro c2 = new Carro("Citroen", "C3 Start", 2013, 4);        
        Moto m2 = new Moto("Honda", "CB500 Hornet", 2019, 500);
        
        ArrayList<Veiculo> veiculos = new ArrayList<>();
        veiculos.add(c1);
        veiculos.add(m1);
        veiculos.add(c2);
        
        for(Veiculo v : veiculos)
            System.out.println(v.toString());
        
        veiculos.remove(c2);
        
        for(Veiculo v : veiculos)
            System.out.println(v.toString());
        
        veiculos.set(0, m2);
        
        for(Veiculo v : veiculos)
            System.out.println(v.toString());
    }
}