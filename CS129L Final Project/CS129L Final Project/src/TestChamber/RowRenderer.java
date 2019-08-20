
package TestChamber;

import java.awt.Component;
import javax.swing.AbstractCellEditor;
import javax.swing.JTable;
import javax.swing.table.TableCellEditor;

public class RowRenderer extends AbstractCellEditor implements TableCellEditor{
    
    
    
    @Override
    public Object getCellEditorValue() {
    return null;
  }
    @Override
    public Component getTableCellEditorComponent(JTable table, Object value,
    boolean isSelected, int row, int column) {
    RssFeed feed = (RssFeed)value;
    updateData(feed, true, table);
    return panel;
  }
}
