package Fundamentos_POO.Ex07;

public class ContaBancaria 
{
    private String titular;
    private double saldo;
    private int numeroConta;

    public String getTitular() 
    {
        return titular;
    }
    public double getSaldo() 
    {
        return saldo;
    }
    public int getNumeroConta() 
    {
        return numeroConta;
    }

    public void setTitular(String titular) 
    {
        if(!titular.isBlank())
            this.titular = titular;
    }
    public void setSaldo(double saldo)
    {
        this.saldo = saldo;
    }
    public void setNumeroConta(int numeroConta) 
    {
        if(numeroConta > 0)
            this.numeroConta = numeroConta;
    }

    public String depositar(double valor)
    {
        saldo += valor;
        return String.format("R$%.2f depositados\nSaldo atual: R$%.2f\n", valor, saldo);
    }

    public String sacar(double valor) 
    {
        if(saldo > 0 && valor <= saldo)
        {
            saldo -= valor;
            return String.format("R$%.2f sacados\nSaldo atual: R$%.2f\n", valor, saldo);
        } 
        else // Caso contrário
            return String.format("Erro: saldo insuficiente\n");
    }

    public String exibirSaldo() 
    {
        return String.format("Saldo atual da conta: %.2f\n", saldo);
    }
}