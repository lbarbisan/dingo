package fr.umlv.ir2.uibuilder.ui.controller.actions.handling;

import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.ImageIcon;
import javax.swing.KeyStroke;

public class UIShowWindowAction extends AbstractAction{

	public UIShowWindowAction() {
		
		super("Afficher la fenêtre",new ImageIcon(UIShowWindowAction.class.getResource("/resources/icons/Launch.gif")));
		super.putValue(Action.ACCELERATOR_KEY,KeyStroke.getKeyStroke('L',java.awt.event.InputEvent.CTRL_MASK));			
	}
	
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	
	private static final long serialVersionUID = 1L;
}
