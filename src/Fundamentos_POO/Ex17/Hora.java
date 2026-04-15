package Fundamentos_POO.Ex17;

/* Elabore uma classe denominada Hora contendo os atributos hora, minuto e segundo. 
  Os métodos set deverão garantir a integridade dos dados atributos ao objeto, 
  de forma que a hora esteja no intervalo de 0 a 23, os minutos no intervalo de 
  0 a 59 e os segundos no intervalo de 0 a 59. 
  Especifique métodos para as seguintes tarefas:
    * Incrementar e decrementar o valor da hora
    * Incrementar e decrementar o valor do minuto
    * Incrementar e decrementar o valor do segundo
    * Retornar a hora completa no formato hh:mm:ss

  A estrutura da classe deve conter:
    * Atributos encapsulados
    * 1 (um) construtor padrão
    * 4 (quatro) construtores sobrecarregados
    * Métodos modificadores de acesso (get/set)
    * Método toString */

public class Hora 
{
    private int horas;
    private int minutos;
    private int segundos;

    public Hora() 
    {
        this.horas = 0;
        this.minutos = 0;
        this.segundos = 0;
    }
    public Hora(int horas) 
    {
        this.horas = horas;
        this.minutos = 0;
        this.segundos = 0;
    }
    public Hora(int horas, int minutos) 
    {
        this.horas = horas;
        this.minutos = minutos;
        this.segundos = 0;
    }
    public Hora(int horas, int minutos, int segundos)
    {
        this.horas = horas;
        this.minutos = minutos;
        this.segundos = segundos;
    }
    
    public int getHoras() 
    {
        return horas;
    }
    public int getMinutos() 
    {
        return minutos;
    }
    public int getSegundos() 
    {
        return segundos;
    }

    public void setHoras(int horas) 
    {
        if(horas >= 0 && horas <= 23)
            this.horas = horas;
    }
    public void setMinutos(int minutos) 
    {
        if(minutos >= 0 && minutos <= 59)
            this.minutos = minutos;
    }
    public void setSegundos(int segundos) 
    {
        if(segundos >= 0 && segundos <= 59)
            this.segundos = segundos;
    }
    
    public void incrementarHora()
    {
        int hr = getHoras();
        if(hr < 23)
            setHoras(hr + 1);
        else
             setHoras(0);
        
       System.out.println(String.format("Hora alterada: %02dh -> %02dh", 
               hr, getHoras()));
    }
    public void decrementarHora()
    {
        int hr = getHoras();
        if(hr > 0)
            setHoras(hr - 1);
        else
            setHoras(23);
        
       System.out.println(String.format("Hora alterada: %02dh -> %02dh", 
               hr, getHoras()));
    }
    
    public void incrementarMinuto()
    {
        int min = getMinutos();
        if(min < 59)
            setMinutos(min + 1);
        else
             setMinutos(0);
        
       System.out.println(String.format("Minuto alterado: %02dm -> %02dm", 
               min, getMinutos()));
    }
    public void decrementarMinuto()
    {
        int min = getMinutos();
        if(min > 0)
            setMinutos(min - 1);
        else
             setMinutos(59);
        
       System.out.println(String.format("Minuto alterado: %02dm -> %02dm", 
               min, getMinutos()));
    }
    
    public void incrementarSegundo()
    {
        int seg = getSegundos();
        if(seg < 59)
            setSegundos(seg + 1);
        else
             setSegundos(0);
        
       System.out.println(String.format("Segundo alterado: %02ds -> %02ds", 
               seg, getSegundos()));
    }
    public void decrementarSegundo()
    {
        int seg = getSegundos();
        if(seg > 0)
            setSegundos(seg - 1);
        else
             setSegundos(59);
        
       System.out.println(String.format("Segundo alterado: %02ds -> %02ds", 
               seg, getSegundos()));
    }
    
    public void getHoraCompleta()
    {
        System.out.println(String.format("Hora atual: %02d:%02d:%02d\n", 
                getHoras(), getMinutos(), getSegundos()));
    }
    
    @Override
    public String toString()
    {
        return String.format("Horas: %02dh\nMinutos: %02dm\nSegundos: %02ds\n", 
                getHoras(), getMinutos(), getSegundos());
    }  
}