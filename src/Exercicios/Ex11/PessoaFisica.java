package Exercicios.Ex11;

public class PessoaFisica extends Pessoa
{
    private String cpf;

    public PessoaFisica() 
    {
        this("", 0, "");
    }
    public PessoaFisica(String nome, int idade, String cpf) 
    {
        super(nome, idade);
        this.cpf = cpf;
    }

    public String getCpf() 
    {
        return cpf;
    }
    public void setCpf(String cpf) 
    {
        this.cpf = cpf;
    }

    @Override
    public String toString() 
    {
        return super.toString() + String.format("CPF: %s\n", cpf);
    }
}