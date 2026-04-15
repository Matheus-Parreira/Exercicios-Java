package Interfaces_Graficas.Ex08;

public class Produto 
{
    /*
     * Uma loja deseja desenvolver um sistema simples para cadastro e visualização
     * de produtos. O objetivo é criar uma aplicação desktop em Java utilizando
     * Swing, permitindo ao usuário registrar produtos e visualizar os dados em
     * formato tabular.
     */
    private String nome;
    private double preco;
    private String categoria;

    public Produto() 
    {
        this.nome = "";
        this.preco = 0.0;
        this.categoria = "";
    }
    public Produto(String nome, double preco, String categoria) 
    {
        this.nome = nome;
        this.preco = preco;
        this.categoria = categoria;
    }

    public String getNome() 
    {
        return nome;
    }
    public double getPreco() 
    {
        return preco;
    }
    public String getCategoria() 
    {
        return categoria;
    }

    public void setNome(String nome) 
    {
        this.nome = nome;
    }
    public void setPreco(double preco) 
    {
        if(preco > 0.0)
            this.preco = preco;
    }
    public void setCategoria(String categoria) 
    {
        this.categoria = categoria;
    }

    @Override
    public String toString() 
    {
        return String.format("Nome do produto: %s\nPreço: R$%.2f\nCategoria: %s", nome, preco, categoria);
    }   
}