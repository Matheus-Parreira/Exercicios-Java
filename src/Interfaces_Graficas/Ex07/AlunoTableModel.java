package Interfaces_Graficas.Ex07;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

public class AlunoTableModel extends AbstractTableModel 
{
    
    private final String[] colunas = {"Nome","Parcial","Final", "Média"};
    private final List<Aluno> dados = new ArrayList<>();

    //Adicionar novos produtos
    public void adicionar(Aluno a)
    {
        dados.add(a);
        fireTableDataChanged();
    }
    
    public boolean naTabela(String nome)
    {
        for(Aluno a : dados)
        {
            if(a.getNome().equals(nome))
                return true;
        }
        return false;
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
        Aluno a = dados.get(rowIndex);
        switch(columnIndex)
        {
            case 0: return a.getNome();
            case 1: return String.format("%.1f", a.getNota_parcial());
            case 2: return String.format("%.1f", a.getNota_final());
            case 3: return String.format("%.1f", a.calcularMedia());
            default: return null;
        }
    }
}