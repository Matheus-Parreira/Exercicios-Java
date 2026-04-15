package Interfaces_Graficas.Ex08;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

public class ProdutoTableModel extends AbstractTableModel
{
    private final String[] colunas = {"Nome", "Categoria", "Preço"};
    private final List<Produto> dados = new ArrayList<>();
    
    public void adicionar(Produto p)
    {
        dados.add(p);
        fireTableDataChanged();
    }
    
    @Override
    public int getRowCount() 
    {
        return dados.size();
    }

    @Override
    public int getColumnCount() 
    {
        return colunas.length;
    }
    
    @Override
    public String getColumnName(int column)
    {
        return colunas[column];
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) 
    {
        Produto p = dados.get(rowIndex);
        return switch(columnIndex)
        {
            case 0 -> p.getNome();
            case 1 -> String.format("%.2f", p.getPreco());
            case 2 -> p.getCategoria();
            default -> null;
        };
    }
}