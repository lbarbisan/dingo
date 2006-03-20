package fr.umlv.ir2.uibuilder.ui.elements;

import java.awt.Color;

import javax.swing.JTable;
import javax.swing.table.TableColumn;

import fr.umlv.ir2.uibuilder.ui.model.UIPropertiesTableModel;
import fr.umlv.ir2.uibuilder.ui.view.editor.BackgroundColorEditor;
import fr.umlv.ir2.uibuilder.ui.view.renderer.UIPropertiesTableRenderer;

public class UIPropertiesTable {
	
	private static JTable propertiesTable;
		
	public static JTable createUIPropertiesTable() {

		propertiesTable = new JTable();
		propertiesTable.setModel(new UIPropertiesTableModel());
		propertiesTable.setDefaultRenderer(JTable.class,new UIPropertiesTableRenderer());
		propertiesTable.setAutoResizeMode(JTable.AUTO_RESIZE_LAST_COLUMN);
		propertiesTable.setGridColor(Color.GRAY);
		propertiesTable.setCellSelectionEnabled(true);
		
		TableColumn column0 = propertiesTable.getColumnModel().getColumn(2);
		column0.setCellEditor(new BackgroundColorEditor());
		
		return propertiesTable;	
	}
	
	public static JTable getPropertiesTable() {
		
		return propertiesTable;
	}
	
}
