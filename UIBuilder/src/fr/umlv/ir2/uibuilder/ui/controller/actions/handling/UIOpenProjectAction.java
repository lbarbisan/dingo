package fr.umlv.ir2.uibuilder.ui.controller.actions.handling;

import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.ImageIcon;
import javax.swing.KeyStroke;


public class UIOpenProjectAction extends AbstractAction{
	
	public UIOpenProjectAction() {
		
		super("Ouvrir...",new ImageIcon(UIOpenProjectAction.class.getResource("/resources/icons/Open.gif")));
		super.putValue(Action.ACCELERATOR_KEY,KeyStroke.getKeyStroke('O',java.awt.event.InputEvent.CTRL_MASK));		
	}
	
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	
	private static final long serialVersionUID = 1L;
}
