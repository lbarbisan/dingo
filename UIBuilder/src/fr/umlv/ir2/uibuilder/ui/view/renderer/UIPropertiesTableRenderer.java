package fr.umlv.ir2.uibuilder.ui.view.renderer;

import java.awt.Component;

import javax.swing.JTable;
import javax.swing.table.TableCellRenderer;

public class UIPropertiesTableRenderer implements TableCellRenderer  {

	public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
		
		return (Component)value;
	}
	
	
}
