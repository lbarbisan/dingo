package fr.umlv.ir2.uibuilder.ui.model;

import java.awt.Color;
import java.awt.Component;

import javax.swing.table.AbstractTableModel;

import fr.umlv.ir2.uibuilder.ui.MainFrame;
import fr.umlv.ir2.uibuilder.ui.elements.components.UIJComponent;

public class UIDrawingTableModel extends AbstractTableModel {

	public UIDrawingTableModel(int row, int column) {
	
		this.rows = row;
		this.columns = column;
		this.rowData = new UIJComponent[this.rows][this.columns];
	}

	public int getColumnCount() {
		
		return this.columns;
	}
	
	public int getRowCount() {
		
		return this.rows;
	}

	public boolean isCellEditable(int row, int column) {
		
		if(column == 0) {
			
			return false;
		}
		else return true;
	}
	
	public Object getValueAt(int row, int column) {

		if(column==0) {
			
			return Integer.toString(row);
		}
		else if ((rowData[row][column]) != null) {
			
			return ((UIJComponent)(rowData[row][column])).getComponent();
		}
		else return emptyField;
	}
	
	public Object getUIJComponentValueAt(int row, int column) {

		if(column==0) {
			
			return Integer.toString(row);
		}
		else return rowData[row][column];
	}
	
	public void setValueAt(Object component, int row, int column) {
		
		this.rowData[row][column] = (UIJComponent)component;
		fireTableCellUpdated(row,column);
	}

	public void removeValueAt(int row, int column) {
		
		rowData[row][column] = null;
		fireTableCellUpdated(row,column);
	}
	
	public String getColumnName(int column) {
		return Integer.toString(column);
	}
	
	public Class<?> getColumnClass(int column) {
		
		return Component.class;
	}
	
	public void addComponent(Object component, int row, int column) {
		
		setValueAt(component,row,column);
		((UIComponentTreeModel)(MainFrame.getComponentTree().getModel())).getRoot().add((UIJComponent)component);
		fireTableCellUpdated(row,column);
	}
	
	public void removeComponent(Object component, int row, int column) {
		
		if(component instanceof String) {
			
		}else {
			
			removeValueAt(row,column);
			fireTableCellUpdated(row,column);
		}

	}
		
	public void changeComponentBackgroundColor(Color color, int row, int column) {
	
		UIJComponent component =  rowData[row][column];
		component.setBackground(color);
		fireTableCellUpdated(row,column);
	}
	
	public void clear() {
		
		for(int i=0;i<getRowCount();i++) {
			for(int j=0;j<getColumnCount();j++) {
				removeValueAt(i,j);
				fireTableCellUpdated(i,j);
			}
		}
	}
	
	private static final long serialVersionUID = 1L;
	private UIJComponent[][] rowData;
	private int rows;
	private int columns;
	private String emptyField = new String("");
}

