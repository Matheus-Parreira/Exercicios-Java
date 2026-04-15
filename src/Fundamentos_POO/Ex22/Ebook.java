package Fundamentos_POO.Ex22;

/* Ebook não possui atributos adicionais.
   Implemente o método calcularPreco() nas subclasses 
   de acordo com as seguintes especificações:
    * Para Ebook: o preço do ebook não inclui custos de envio. */

public class Ebook extends Livro
{
    public Ebook() 
    {
        super();
    }
    public Ebook(String nome, String genero, String autor, int numPaginas, double precoBase) 
    {
        super(nome, genero, autor, numPaginas, precoBase);
    }
    
    @Override
    public double calcularPreco()
    {
        double preco = getPrecoBase();
        return preco;
    }

    @Override
    public String toString() 
    {
        return String.format("Nome: %s\nGênero: %s\nAutor: %s\nPáginas: %d\nPreço-Base: %.2f",
                getNome(), getGenero(), getAutor(), getNumPaginas(), getPrecoBase());
    }
}