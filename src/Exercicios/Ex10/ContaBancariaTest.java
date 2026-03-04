package Exercicios.Ex10;

public class ContaBancariaTest 
{
    public static void main(String[] args) 
    {
        ContaBancaria nometitular = new ContaBancaria();
        nometitular.setTitular("Nome do titular");
        nometitular.setNumeroConta(123456);
        nometitular.setSaldo(0.00);

        System.out.println(nometitular.exibirSaldo());
        System.out.println(nometitular.depositar(1000.00));
        System.out.println(nometitular.sacar(550.00));
        System.out.println(nometitular.exibirSaldo());
        System.out.println(nometitular.depositar(100.00));
        System.out.println(nometitular.sacar(1000.00));
        System.out.println(nometitular.exibirSaldo());
    }
}