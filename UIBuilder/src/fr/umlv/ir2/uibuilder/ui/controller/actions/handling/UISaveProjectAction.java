package fr.umlv.ir2.uibuilder.ui.controller.actions.handling;

import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.ImageIcon;
import javax.swing.KeyStroke;

public class UISaveProjectAction extends AbstractAction{

	/**
	 * Creates an action in the menubar to save a project 
	 */   
    public UISaveProjectAction(){

        super("Sauvegarder...",new ImageIcon(UISaveProjectAction.class.getResource("/resources/icons/Save.gif")));
        super.putValue(Action.ACCELERATOR_KEY,KeyStroke.getKeyStroke('S',java.awt.event.InputEvent.CTRL_MASK));

    }
    
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	
	private static final long serialVersionUID = 1L;
}
