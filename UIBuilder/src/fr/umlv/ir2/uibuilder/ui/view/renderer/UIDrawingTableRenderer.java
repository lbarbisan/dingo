package fr.umlv.ir2.uibuilder.ui.view.renderer;

import java.awt.Component;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.table.TableCellRenderer;

public class UIDrawingTableRenderer implements TableCellRenderer {
	
	public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
		
		//System.out.println("Row : " + row + "Column : " + column + " " + value.getClass());
		
		JPanel panel = new JPanel();
		
		
		if(column == 0) {
			
			panel.add(new JLabel(value.toString()));
			return panel;
		}
		else {
			
			if(value.getClass() != String.class ) {
				
				return (Component)value;
			}
			
			else {
				
				return null;
			}
		}
	}
}
