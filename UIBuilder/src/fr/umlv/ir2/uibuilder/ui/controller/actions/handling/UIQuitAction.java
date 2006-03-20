package fr.umlv.ir2.uibuilder.ui.controller.actions.handling;

import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.KeyStroke;

public class UIQuitAction extends AbstractAction {

	public UIQuitAction(JFrame frame) {

		super("Quitter",new ImageIcon(UIQuitAction.class.getResource("/resources/icons/Quit.gif")));
		super.putValue(Action.ACCELERATOR_KEY,KeyStroke.getKeyStroke('Q',java.awt.event.InputEvent.CTRL_MASK));
	    this.frame = frame;
	}

	public void actionPerformed(ActionEvent arg0) {
		this.frame.dispose();
	}

	private static final long serialVersionUID = 1L;
	JFrame frame = new JFrame();
}
