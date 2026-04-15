package Fundamentos_POO.Ex15;

/* Por fim, elabore a classe BrinquedoTest para testar as 
   funcionalidades da classe Brinquedo. */

public class BrinquedoTest 
{
    public static void main(String[] args) 
    {
        Brinquedo b = new Brinquedo("Boneca", 100.00);
        b.setFaixaEtaria("3 a 5");
        System.out.println(b.toString());
    }
}