package Exemplos.Exemplo01;

public class Pessoa 
{
    // Atributos
    private String nome;
    private String email;
    private int idade;

    // Manipuladores de Acesso
    // Manipulador get => retornar
    public int getIdade()
    {
        return idade;
    }
    public String getNome()
    {
        return nome;
    }
    public String getEmail() 
    {
        return email;
    }

    // Manipulador set => alterar
    public void setIdade(int idade)
    {
        if(idade >= 0)
            this.idade = idade;
    }

    public void setNome(String nome)
    {
        if(!nome.isBlank())
            this.nome = nome;
    }

    public void setEmail(String email)
    {
        if(email.contains("@"))
            this.email = email;
    }

    // Métodos = Comportamentos
    @Override
    public String toString() 
    {
        return String.format("Nome: %s\nEmail: %s\nIdade: %d\n", nome, email, idade);
    }
}
