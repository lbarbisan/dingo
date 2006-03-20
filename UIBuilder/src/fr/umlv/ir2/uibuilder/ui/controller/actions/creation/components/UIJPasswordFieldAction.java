package fr.umlv.ir2.uibuilder.ui.controller.actions.creation.components;

import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;
import javax.swing.JTable;

import fr.umlv.ir2.uibuilder.ui.elements.components.UIJPasswordField;

public class UIJPasswordFieldAction extends AbstractAction {

	public UIJPasswordFieldAction(JTable table) {
		
		super("JPasswordField",null);
		this.table = table;
	}
	
	public void actionPerformed(ActionEvent arg0) {

		new UIJPasswordField(this.table);	
	}
	
	private static final long serialVersionUID = 1L;
	private JTable table;
}
