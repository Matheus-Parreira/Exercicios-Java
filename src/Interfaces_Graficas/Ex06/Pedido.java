package Interfaces_Graficas.Ex06;
import javax.swing.JOptionPane;

public class Pedido 
{
    /*
     * Sistema de Pedido de Lanches: O sistema deverá permitir que o usuário insira
     * o nome do cliente, selecione o tipo de lanche desejado e escolha adicionais
     * que poderão compor o pedido.
     */
    private double valor_total;
    private String msg_resumo;

    public Pedido()
    {
        valor_total = 0.0;
        msg_resumo = "";
    }
    public Pedido(double total, String resumo) 
    {
        this.valor_total = total;
        this.msg_resumo = resumo;
    }

    public double getValor_total() 
    {
        return valor_total;
    }
    public void setValor_total(double valor_total) 
    {
        this.valor_total = valor_total;
    }

    public String getMsg_resumo() 
    {
        return msg_resumo;
    }
    public void setMsg_resumo(String msg_resumo) 
    {
        this.msg_resumo = msg_resumo;
    }

    void gerar_resumo()
    {
        msg_resumo += String.format("\nValor total: R$ %.2f", valor_total);
        JOptionPane.showMessageDialog(null, msg_resumo, "Resumo do pedido", JOptionPane.INFORMATION_MESSAGE);
    }
    
    void processar_lanche(boolean ham, boolean xbg, boolean xtd)
    {
        msg_resumo += "Lanche:\n";
        if(ham == true)
        {
            valor_total += 20.00;
            msg_resumo += "- Hamburger\n";
            
        }
        else if(xbg == true)
        {           
            valor_total += 25.00;
            msg_resumo += "- X-Burger\n";
        }
        else if(xtd == true)
        {           
            valor_total += 30.00;
            msg_resumo += "- X-Tudo\n";
        }
        else
        {
            msg_resumo += "- Nenhum lanche selecionado\n";
        }         
    }
    
    void processar_adicionais(boolean qjo, boolean bcn, boolean rfr)
    {
        msg_resumo += "\nAdicionais:\n";
        if(!qjo && !bcn && !rfr)
        {
            msg_resumo += "- Nenhum adicional selecionado\n";
        }
        else
        {
            if(qjo == true)
            {
                valor_total += 5.00;
                msg_resumo += "- Queijo extra\n";
            }
            if(bcn == true)
            {
                valor_total += 5.00;
                msg_resumo += "- Bacon\n";
            }
            if(rfr == true)
            {
                valor_total += 10.00;
                msg_resumo += "- Refrigerante\n";
            }
        } 
    }
}