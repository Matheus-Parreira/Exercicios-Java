package Fundamentos_POO.Ex17;

/* Escreva uma classe de teste para demonstrar o 
   funcionamento de todos os construtores. */

public class HoraTest 
{
    public static void main(String[] args) 
    {
        Hora h1 = new Hora();
        h1.setHoras(2);
        h1.setMinutos(17);
        h1.setSegundos(49);
        h1.getHoraCompleta();
        h1.decrementarHora();
        h1.incrementarMinuto();
        h1.decrementarSegundo();
        h1.getHoraCompleta();
        
        Hora h2 = new Hora(13);
        h2.setMinutos(58);
        h2.setSegundos(7);
        h2.getHoraCompleta();
        h2.incrementarHora();
        h2.decrementarMinuto();
        h2.incrementarSegundo();
        h2.getHoraCompleta();
        
        Hora h3 = new Hora(4, 47);
        h3.setSegundos(28);
        h3.getHoraCompleta();
        h3.incrementarHora();
        h3.incrementarMinuto();
        h3.decrementarSegundo();
        h3.getHoraCompleta();
        
        Hora h4 = new Hora(0, 49, 58);
        h4.getHoraCompleta();
        h4.decrementarHora();
        h4.decrementarMinuto();
        h4.incrementarSegundo();
        h4.getHoraCompleta();
    }
}