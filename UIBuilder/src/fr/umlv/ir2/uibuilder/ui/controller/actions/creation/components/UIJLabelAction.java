package fr.umlv.ir2.uibuilder.ui.controller.actions.creation.components;

import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;
import javax.swing.JTable;

import fr.umlv.ir2.uibuilder.ui.elements.components.UIJLabel;

public class UIJLabelAction extends AbstractAction{

	public UIJLabelAction(JTable table) {
		
		super("JLabel",null);
		this.table = table;
	}
	
	public void actionPerformed(ActionEvent arg0) {

		new UIJLabel(this.table);	
	}
	
	private static final long serialVersionUID = 1L;
	private JTable table;
}
