package Exemplos.Exemplo01;

public class PessoaTest 
{
    public static void main(String[] args) 
    {
        Pessoa joao = new Pessoa();
        joao.setNome("João da Silva");
        joao.setEmail("joão.silva@email.com");
        joao.setIdade(25);

        System.out.println(joao.toString());
    }
}
