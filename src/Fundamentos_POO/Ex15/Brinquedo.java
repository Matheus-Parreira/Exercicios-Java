package Fundamentos_POO.Ex15;

/* Elabore a classe Brinquedo em Java, contendo os métodos get e set 
   necessários e os métodos construtores apresentados. 
   O atributo faixaEtaria é um atributo do tipo String que deve 
   receber apenas um dos valores seguintes:
        "0 a 2", "3 a 5", "6 a 10" e "Acima de 10". 
   Outros valores são inválidos e nÃo devem ser armazenados. 
   Essa validação deve ser realizada no método setFaixaEtaria. */

public class Brinquedo 
{
    private String nome;
    private String faixaEtaria;
    private double preco;

    public Brinquedo() 
    {
        nome = "";
        preco = 0.0;        
    }
    public Brinquedo(String nome) 
    {
        this.nome = nome;
        preco = 0.0; 
    }
    public Brinquedo(String nome, double preco) 
    {
        this.nome = nome;
        this.preco = preco;
    }

    public String getNome() 
    {
        return nome;
    }
    public String getFaixaEtaria() 
    {
        return faixaEtaria;
    }
    public double getPreco() 
    {
        return preco;
    }

    public void setNome(String nome) 
    {
        if(!nome.isEmpty())
            this.nome = nome;
    }

    public void setFaixaEtaria(String faixaEtaria) 
    {
        if(faixaEtaria.equals("0 a 2"))
            this.faixaEtaria = "0 a 2";
        else if(faixaEtaria.equals("3 a 5"))
            this.faixaEtaria = "3 a 5";
        else if(faixaEtaria.equals("6 a 10"))
            this.faixaEtaria = "6 a 10";
        else if(faixaEtaria.equals("Acima de 10"))
            this.faixaEtaria = "Acima de 10";
        else
            this.faixaEtaria = null;    
    }

    public void setPreco(double preco) 
    {
        if(preco > 0.0)
            this.preco = preco;
    }
    
    @Override
    public String toString()
    {
        return String.format("Nome do brinquedo: %s\nFaixa etária: %s\nPreço: R$ %.2f", nome, faixaEtaria, preco);
    }
}