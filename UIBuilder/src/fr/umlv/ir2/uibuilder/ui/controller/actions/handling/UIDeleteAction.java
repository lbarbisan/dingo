package fr.umlv.ir2.uibuilder.ui.controller.actions.handling;

import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.ImageIcon;
import javax.swing.KeyStroke;

import fr.umlv.ir2.uibuilder.ui.elements.UIDrawingTable;
import fr.umlv.ir2.uibuilder.ui.model.UIDrawingTableModel;

public class UIDeleteAction extends AbstractAction{

	public UIDeleteAction() {
		
		super("Supprimer",new ImageIcon(UIDeleteAction.class.getResource("/resources/icons/Quit.gif")));
		super.putValue(Action.ACCELERATOR_KEY,KeyStroke.getKeyStroke('S',java.awt.event.InputEvent.CTRL_MASK));
	}

	public void actionPerformed(ActionEvent e) {
		
		int row = UIDrawingTable.getDrawingTable().getSelectedRow();
		int column = UIDrawingTable.getDrawingTable().getSelectedColumn();
		UIDrawingTableModel model = ((UIDrawingTableModel)(UIDrawingTable.getDrawingTable().getModel()));
		model.removeComponent(model.getValueAt(row,column),row, column);
		
	}
	
	private static final long serialVersionUID = 1L;
}
