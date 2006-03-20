package fr.umlv.ir2.uibuilder.ui.controller.actions.creation.components;

import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;
import javax.swing.JTable;

import fr.umlv.ir2.uibuilder.ui.elements.components.UIJList;

public class UIJListAction extends AbstractAction {

	public UIJListAction(JTable table) {
		
		super("JList",null);
		this.table = table;
	}
	
	public void actionPerformed(ActionEvent arg0) {

		new UIJList(this.table);	
	}
	
	private static final long serialVersionUID = 1L;
	private JTable table;
}
