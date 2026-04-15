package Fundamentos_POO.Ex22;

/* LivroFisico deve ter um atributo adicional custoEnvio do 
   tipo double para representar os custos de envio. 
   Implemente o método calcularPreco() nas subclasses
   de acordo com as seguintes especificações:
    * Para LivroFisico: o preço do livro físico deve incluir o custo de envio.
*/

public class LivroFisico extends Livro
{
    private double custoEnvio;

    public LivroFisico() 
    {
        super();
        this.custoEnvio = 0.0;
    }
    public LivroFisico(String nome, String genero, String autor, int numPaginas, double precoBase, double custoEnvio) 
    {
        super(nome, genero, autor, numPaginas, precoBase);
        this.custoEnvio = custoEnvio;
    }

    public double getCustoEnvio() 
    {
        return custoEnvio;
    }

    public void setCustoEnvio(double custoEnvio) 
    {
        this.custoEnvio = custoEnvio;
    }
    
    @Override
    public double calcularPreco()
    {
        double preco = getPrecoBase() + getCustoEnvio();
        return preco;
    }

    @Override
    public String toString() 
    {
        return String.format("Nome: %s\nGênero: %s\nAutor: %s\nPáginas: %d\nPreço-Base: %.2f\nCusto de envio: %.2f",
                getNome(), getGenero(), getAutor(), getNumPaginas(), getPrecoBase(), getCustoEnvio());
    }   
}