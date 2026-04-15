package Fundamentos_POO.Ex20;

public class FuncionarioTest 
{
    public static void main(String[] args) 
    {
        FuncionarioIntegral f1 = new FuncionarioIntegral("Lucas Porto", 4000.00, 600.00);
        System.out.println(f1.toString());
        
        FuncionarioMeioPeriodo f2 = new FuncionarioMeioPeriodo("Adriana Costa", 3000.00, 165);
        System.out.println(f2.toString());
        
        FuncionarioIntegral f3 = new FuncionarioIntegral("Fabiano Gomes", 5200.00, 1000.00);
        System.out.println(f3.toString());
        
        FuncionarioMeioPeriodo f4 = new FuncionarioMeioPeriodo("Nicole Bosso", 2300.00, 200);
        System.out.println(f4.toString());
    }
}