package fr.umlv.ir2.uibuilder.ui.program;

import javax.swing.JFrame;

import fr.umlv.ir2.uibuilder.ui.MainFrame;

/**
 * 
 * @author dguillon
 *
 */

public class UIBuilder {

	/**
	 * Create a new UIBuilder program.
	 * @param mainFrame the main fame which call this constructor.
	 */

	public UIBuilder(JFrame mainFrame) {

		this.mainFrame = mainFrame;
	}
	
	/**
	 * @return the project mainFrame
	 */
	public JFrame getMainFrame() {

		return mainFrame;
	}

	/**
	 * Launch the uibuilder frame
	 * Set the main frame visible.
	 */

	public void showFrame() {
		
		this.mainFrame.setVisible(true);
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		MainFrame.createMainFrame().setVisible(true);
	}
	
	private JFrame mainFrame;
}
