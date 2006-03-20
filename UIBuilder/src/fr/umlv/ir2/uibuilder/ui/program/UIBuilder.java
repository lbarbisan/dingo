package fr.umlv.ir2.uibuilder.ui.program;

import javax.swing.JFrame;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

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
	 * @throws UnsupportedLookAndFeelException 
	 * @throws IllegalAccessException 
	 * @throws InstantiationException 
	 * @throws ClassNotFoundException 
	 */
	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, UnsupportedLookAndFeelException {
		
		UIManager.setLookAndFeel("javax.swing.plaf.metal.MetalLookAndFeel");
		MainFrame.createMainFrame().setVisible(true);
	}
	
	private JFrame mainFrame;
}
