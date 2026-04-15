package Fundamentos_POO.Ex13;

public class FuncionarioTest 
{
    public static void main(String[] args) 
    {
        Funcionario f = new Funcionario();
        f.setNome("Joana");
        f.setSalario(7200.00);
        f.setAnoContratacao(2004);
        
        f.getSalarioTotal();
    }
}