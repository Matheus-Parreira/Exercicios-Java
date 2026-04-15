package Interfaces_Graficas.Ex07;

public class Aluno 
{
    private int id;
    private String nome;
    private double nota_parcial;
    private double nota_final;

    public Aluno() 
    {
        id = 0;
        nome = "";
        this.nota_parcial = 0.0;
        this.nota_final = 0.0;
    }
    public Aluno(int id, String nome) 
    {
        this.id = id;
        this.nome = nome;
        this.nota_parcial = 0.0;
        this.nota_final = 0.0;
    }
    
    public int getId() 
    {
        return id;
    }
    public String getNome() 
    {
        return nome;
    }
    public double getNota_parcial() 
    {
        return nota_parcial;
    }
    public double getNota_final() 
    {
        return nota_final;
    }

    public void setId(int id) 
    {
        this.id = id;
    }
    public void setNome(String nome) 
    {
        this.nome = nome;
    } 
    public void setNota_parcial(double nota_parcial) 
    {
        if(nota_parcial >= 0.0 && nota_parcial <= 10.0)
            this.nota_parcial = nota_parcial;
    }
    public void setNota_final(double nota_final) 
    {
        if(nota_final >= 0.0 && nota_final <= 10.0)
            this.nota_final = nota_final;
    }
    
    public double calcularMedia()
    {
        return (nota_parcial * 0.40) + (nota_final * 0.60);
    }
    
    @Override
    public String toString() 
    {
        return this.nome; 
    }
}