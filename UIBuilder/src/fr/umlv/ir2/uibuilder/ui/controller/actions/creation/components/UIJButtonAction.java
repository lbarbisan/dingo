package fr.umlv.ir2.uibuilder.ui.controller.actions.creation.components;

import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;
import javax.swing.JTable;

import fr.umlv.ir2.uibuilder.ui.elements.components.UIJButton;

public class UIJButtonAction extends AbstractAction{

	public UIJButtonAction(final JTable table) {
		
		super("JButton",null);
		this.table = table;
	}
	
	public void actionPerformed(ActionEvent arg0) {

		new UIJButton(this.table);	
	}
	
	private static final long serialVersionUID = 1L;
	private JTable table;
}
