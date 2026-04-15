package Fundamentos_POO.Ex12;

/* Escreva uma classe denominada Televisor que 
   contenha dois atributos encapsulados: volume e canal. 
   Especifique os métodos modificadores de acesso set/get para 
   cada atributo, bem como, os seguintes métodos:
        * aumentarVolume()
        * reduzirVolume()
        * trocarCanal(int canal)*/

public class Televisor 
{
    private int volume;
    private int canal;

    public int getVolume() 
    {
        return volume;
    }
    public void setCanal(int canal) 
    {
        this.canal = canal;
    }

    public void setVolume(int volume) 
    {
        this.volume = volume;
    }
    public int getCanal() 
    {
        return canal;
    }

    public void aumentarVolume()
    {
        if(volume < 100)
        {
            volume++;
            System.out.println(String.format("Volume aumentado: %d -> %d", volume - 1, volume));
        }
        else
            System.out.println("Voulme já está no máximo!");
    }
    
    public void reduzirVolume()
    {
        if(volume > 0)
        {
            volume--;
            System.out.println(String.format("Volume reduzido: %d -> %d", volume + 1, volume));
        }
        else
            System.out.println("Voulme já está no mínimo!");
    }
    
    public void trocarCanal (int canal)
    {
        if(canal > 0)
        {
            System.out.println(String.format("Canal trocado: %d -> %d", getCanal(), canal));
            setCanal(canal);
        }
        else
            System.out.println("Canal inválido!");
    }
}