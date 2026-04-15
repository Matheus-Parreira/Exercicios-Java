package Fundamentos_POO.Ex08;

public class PessoaJuridica extends Pessoa
{
    private String cnpj;

    public PessoaJuridica() 
    {
        this("", 0, "");
    }
    public PessoaJuridica(String nome, int idade, String cnpj) 
    {
        super(nome, idade);
        this.cnpj = cnpj;
    }

    public String getCnpj()
    {
        return cnpj;
    }
    public void setCnpj(String cnpj) 
    {
        this.cnpj = cnpj;
    }

    @Override
    public String toString() 
    {
        return super.toString() + String.format("CNPJ: %S\n", cnpj);
    }
}