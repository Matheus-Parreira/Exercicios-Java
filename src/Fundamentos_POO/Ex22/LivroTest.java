package Fundamentos_POO.Ex22;

import java.util.ArrayList;

/* Escreva uma classe LivroTest para demonstrar o polimorfismo por sobreposição. 
  Neste método, crie pelo menos um objeto de cada tipo (livro físico e ebook) 
  e chame o método calcularPreco() para cada objeto, mostrando o preço calculado. */

public class LivroTest 
{
    public static void main(String[] args) 
    {
        ArrayList<Livro> listaLivros = new ArrayList<>();
        
        Livro l1 = new LivroFisico("Faça um Pedido", "Romance", "Lucas Johnson", 248, 46.99, 19.96);
        Livro l2 = new Ebook("Os Visitantes", "Ficção Cientifica", "Adam Rodgers", 356, 32.65);
        Livro l3 = new LivroFisico("Novo Mundo", "Poesia", "Pedro Machado", 128, 35.99, 7.78);
        Livro l4 = new Ebook("A Coroa de Gelo", "Fantasia", "Jomus Croyt", 412, 48.99);
        
        listaLivros.add(l1);
        listaLivros.add(l2);
        for (Livro l : listaLivros) 
        {
            System.out.println(l.toString());
            System.out.println(String.format("Preço total: %.2f\n", l.calcularPreco()));
        }
        
        listaLivros.remove(1);
        listaLivros.add(l3);
        listaLivros.add(l4);
        for (Livro l : listaLivros) 
        {
            System.out.println(l.toString());
            System.out.println(String.format("Preço total: %.2f\n", l.calcularPreco()));
        }
        
        listaLivros.set(1, l2);
        for (Livro l : listaLivros) 
        {
            System.out.println(l.toString());
            System.out.println(String.format("Preço total: %.2f\n", l.calcularPreco()));
        }
    }  
}