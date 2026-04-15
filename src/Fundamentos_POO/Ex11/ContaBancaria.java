package Fundamentos_POO.Ex11;

/* Implementar a classe ContaBancaria com os seguintes atributos e métodos:
    Atributos:
        * numeroConta: número da conta bancária 
        * saldo: saldo atual da conta bancária 
    Métodos:
        * depositar(valor): Método que permite depositar um valor na conta. 
                            O valor do depósito deve ser maior que zero.
        * sacar(valor): Método que permite sacar um valor da conta, desde 
                        que haja saldo suficiente. O valor do saque deve 
                        ser maior que zero  e não pode exceder o saldo 
                        disponível na conta.
        * verificarSaldo(): Método que exibe o saldo atual da conta.
*/

public class ContaBancaria 
{
    String numeroConta;
    double saldo;
    
    public void depositar(double valor)
    {
        if(valor > 0.0)
        {
            saldo += valor;
            System.out.println(String.format("R$ %.2f depositados\nSaldo atual: R$ %.2f\n", 
                    valor, saldo));
        }       
        else
            System.out.println("\nErro: valor não pode ser menor ou igual a 0!\n");
    }
    
    public void sacar(double valor)
    {
        if(valor > 0.0 && valor <= saldo)
        {
            saldo -= valor;
            System.out.println(String.format("R$ %.2f sacados\nSaldo atual: R$ %.2f\n", 
                    valor, saldo));
        }      
        else
            System.out.println("\nErro: valor não pode ser 0 ou exceder saldo atual!\n");
    }
    
    public void verificarSaldo()
    {
        System.out.println(String.format("Saldo atual: R$ %.2f\n", saldo));
    }
}