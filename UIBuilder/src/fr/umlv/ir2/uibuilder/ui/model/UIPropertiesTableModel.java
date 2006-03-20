package fr.umlv.ir2.uibuilder.ui.model;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.table.AbstractTableModel;

import fr.umlv.ir2.uibuilder.ui.elements.components.UIJComponent;

public class UIPropertiesTableModel extends AbstractTableModel {
	
	public UIPropertiesTableModel() {
		
		rowData[0][0] = columnNames[0];
		rowData[0][1] = columnNames[1];
		rowData[0][2] = columnNames[2];;
		rowData[0][3] = columnNames[3];;
		rowData[0][4] = columnNames[4];;
	}
	
	public Class<?> getColumnClass(int column) {
		
		switch(column) {
		
		case 0 : return String.class;
			
		case 1 : return String.class;

		case 2 : return Color.class;

		case 3 : return String.class;

		case 4 : return Dimension.class;

		}
		return null;
	}
	
	public int getColumnCount() {
		
		return 5;
	}
	
	public int getRowCount() {
		
		return this.rowNames.length;
	}
	
	public Object getValueAt(int row, int column) {
		
		return rowData[row][column];
	}
	
	public String getColumnName(int column) {
		
		return this.columnNames[column];
	}
	
	public boolean isCellEditable(int row, int column) {
		
		if(row == 0) {
			
			return false;
		}
		else return true;
	}
	
	public void setValueAt(Object value, int row, int column) {
			
		switch(column) {
		
		case 2 : rowData[row][column] = (Color)value;
				fireTableCellUpdated(row,column);
				
		}
	}
	
	public void setUIComponentPropertiesValues(Object component) {
		
		if(component != null) {
			
			this.rowData[1][0] = ((UIJComponent)component).getComponentName();
			this.rowData[1][1] = ((UIJComponent)component).getComponentFont().getFamily();
			this.rowData[1][2] = ((UIJComponent)component).getComponentBackground();
			this.rowData[1][3] = Boolean.toString(((UIJComponent)component).getIsComponentVisible());
			this.rowData[1][4] = ((UIJComponent)component).getComponentSize();		
		}
		else {
			
			this.rowData[1][0] = this.emptyField;
			this.rowData[1][1] = this.emptyField;
			this.rowData[1][2] = this.emptyField;
			this.rowData[1][3] = this.emptyField;
			this.rowData[1][4] = this.emptyField;
			
		}
		fireTableDataChanged();	

	}
	
	private static final long serialVersionUID = 1L;
	private Object[][] rowData = new Object[2][5];
	private String[] rowNames = {"Properties", "Values"};
	private String[] columnNames = {"Name","Font","Background","isVisible","Size"};
	private String emptyField = new String("");
	
}
