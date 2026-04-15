package Fundamentos_POO.Ex22;

/* Desenvolver um sistema para uma livraria online que vende livros físicos e ebooks. 
   Classe base (chamada Livro):
    * Atributo precoBase do tipo double para representar o preço base do livro.
    * Um construtor que inicializa o preço base do livro.
    * Um método calcularPreco() que retorna o preço do livro. Esse método 
      será sobreposto pelas subclasses. */

public class Livro 
{
    private String nome;
    private String genero;
    private String autor;
    private int numPaginas;
    private double precoBase;

    public Livro()
    {
        this.nome = "";
        this.genero = "";
        this.autor = "";
        this.numPaginas = 0;
        this.precoBase = 0.0;
    }
    public Livro(String nome, String genero, String autor, int numPaginas, double precoBase) 
    {
        this.nome = nome;
        this.genero = genero;
        this.autor = autor;
        this.numPaginas = numPaginas;
        this.precoBase = precoBase;
    }   

    public String getNome() 
    {
        return nome;
    }
    public String getGenero() 
    {
        return genero;
    }
    public String getAutor()
    {
        return autor;
    }
    public int getNumPaginas() 
    {
        return numPaginas;
    }
        public double getPrecoBase() 
    {
        return precoBase;
    }

    public void setNome(String nome) 
    {
        if(!nome.isEmpty())
            this.nome = nome;
    }
    public void setGenero(String genero) 
    {
        if(!genero.isEmpty())
            this.genero = genero;
    }
    public void setAutor(String autor)
    {
        if(!autor.isEmpty())
            this.autor = autor;
    }
    public void setNumPaginas(int numPaginas) 
    {
        if(numPaginas > 0)
            this.numPaginas = numPaginas;
    }
    public void setPrecoBase(double precoBase) 
    {
        if(precoBase > 0.0)
            this.precoBase = precoBase;
    }
    
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