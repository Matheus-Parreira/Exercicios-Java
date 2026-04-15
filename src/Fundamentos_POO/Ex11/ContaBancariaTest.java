package Fundamentos_POO.Ex11;

/* ContaBancariaTest suas funcionalidades com algumas operações 
    de depósito, saque e verificação de saldo. */

public class ContaBancariaTest 
{
    public static void main(String[] args) 
    {
        ContaBancaria c1 = new ContaBancaria();
        c1.numeroConta = "12345678";
        c1.saldo = 1621.00;
        
        c1.verificarSaldo();
        c1.depositar(75.00);
        c1.sacar(436.58);
        c1.verificarSaldo();
        c1.depositar(-5.7);
        c1.sacar(721.43);
        c1.verificarSaldo();
    }
}