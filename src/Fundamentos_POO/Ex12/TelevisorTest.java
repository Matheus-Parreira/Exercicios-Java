package Fundamentos_POO.Ex12;

// Por fim, escreva a classe TelevisorTest

public class TelevisorTest 
{
    public static void main(String[] args) 
    {
        Televisor t = new Televisor();
        t.setCanal(8);
        t.setVolume(0);
        
        t.aumentarVolume();
        t.reduzirVolume();
        t.trocarCanal(0);
        t.reduzirVolume();
        t.reduzirVolume();
        t.trocarCanal(3);
        t.aumentarVolume();
        t.aumentarVolume();
    }
}