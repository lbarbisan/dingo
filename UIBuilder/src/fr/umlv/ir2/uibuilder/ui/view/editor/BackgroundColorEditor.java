package fr.umlv.ir2.uibuilder.ui.view.editor;

import java.awt.Color;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.util.EventObject;

import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JTable;
import javax.swing.event.CellEditorListener;
import javax.swing.table.TableCellEditor;

import fr.umlv.ir2.uibuilder.ui.elements.UIDrawingTable;
import fr.umlv.ir2.uibuilder.ui.elements.components.UIJComponent;
import fr.umlv.ir2.uibuilder.ui.model.UIDrawingTableModel;
import fr.umlv.ir2.uibuilder.ui.model.UIPropertiesTableModel;

public class BackgroundColorEditor implements TableCellEditor{
	
	public BackgroundColorEditor() {
		
		button.addActionListener(new java.awt.event.ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				
				button_actionPerformed(e);
			}
		});
	}
	
	public Component getTableCellEditorComponent(JTable table, Object value, boolean isSelected,int row, int column) {
		
		this.table = table;
		this.row = row;
		this.column = column;
		
		//int selectedRow = UIDrawingTable.getDrawingTable().getSelectedRow();
		//int selectedColumn = UIDrawingTable.getDrawingTable().getSelectedColumn();
		
		//if(selectedRow != -1) {
			
			if(value instanceof String) {
				
				button.setBackground(Color.WHITE);
			} 
			else {
				System.out.println(value);	
				//UIJComponent component = (UIJComponent) ((UIDrawingTableModel)(UIDrawingTable.getDrawingTable().getModel())).getUIJComponentValueAt(selectedRow,selectedColumn);
				UIJComponent component = (UIJComponent) ((UIPropertiesTableModel)table.getModel()).getComponent(); 
				button.setBackground(component.getComponentBackground());
			}
		//}
		
		return this.button;
	}
	
	
	public void button_actionPerformed(ActionEvent e) {
		
		int selectedRow = UIDrawingTable.getDrawingTable().getSelectedRow();
		int selectedColumn = UIDrawingTable.getDrawingTable().getSelectedColumn();
		
		if(selectedRow != -1) {
		
			if(this.table.getModel().getValueAt(row, column) instanceof String) {
				
				button.setBackground(Color.WHITE);
				
			} else {
				
				Color color =  JColorChooser.showDialog(this.button, "choix de couleur", button.getBackground());
				
				((UIDrawingTableModel)(UIDrawingTable.getDrawingTable().getModel())).changeComponentBackgroundColor(color, selectedRow, selectedColumn);
				
				((UIPropertiesTableModel)(table.getModel())).setValueAt(color,1,2);
				button.setBackground(color);
			}
		}
	}
	
	
	public Object getCellEditorValue() {
		
		return button;
	}
	
	public boolean isCellEditable(EventObject anEvent) {
		
		return true;
	}
	
	public boolean shouldSelectCell(EventObject anEvent) {
		
		return true;
	}
	
	public boolean stopCellEditing() {
		
		return false;
		// return true pour ne pas pouvoir recommencer une édition
		//return false ; // pour pouvoir recommencer une édition
	}
	
	public void cancelCellEditing() { 
		
	}
	
	public void addCellEditorListener(CellEditorListener l) {  
		
	}
	
	public void removeCellEditorListener(CellEditorListener l) {
		
	}
	
	
	private JColorChooser colorChooser = new JColorChooser();
	private JButton button = new JButton();
	private JTable table;
	private int row;
	private int column;
}
