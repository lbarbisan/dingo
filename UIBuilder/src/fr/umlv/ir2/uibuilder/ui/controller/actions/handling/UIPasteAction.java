package fr.umlv.ir2.uibuilder.ui.controller.actions.handling;

import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.ImageIcon;
import javax.swing.KeyStroke;

public class UIPasteAction extends AbstractAction{
	
	public UIPasteAction() {
		
		super("Coller",new ImageIcon(UIPasteAction.class.getResource("/resources/icons/Paste.gif")));
		super.putValue(Action.ACCELERATOR_KEY,KeyStroke.getKeyStroke('V',java.awt.event.InputEvent.CTRL_MASK));
	}
	
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	
	private static final long serialVersionUID = 1L;
}
