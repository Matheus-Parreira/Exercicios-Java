package Fundamentos_POO.Ex08;

public class PessoaTest 
{
    public static void main(String[] args) 
    {
        Pessoa p1 = new Pessoa();
        Pessoa p2 = new Pessoa("Ana Maria", 21);
        PessoaFisica p3 = new PessoaFisica("José", 23, "123.456.789-00");
        PessoaJuridica p4 = new PessoaJuridica("João", 25, "12.345.678/0001-90");

        p1.setNome("João da Silva");
        p1.setIdade(23);

        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
        System.out.println(p4);
    }
}