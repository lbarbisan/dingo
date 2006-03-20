package fr.umlv.ir2.uibuilder.ui;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSplitPane;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.JToolBar;
import javax.swing.JTree;
import javax.swing.ScrollPaneConstants;

import fr.umlv.ir2.uibuilder.ui.controller.actions.creation.components.UIJButtonAction;
import fr.umlv.ir2.uibuilder.ui.controller.actions.creation.components.UIJCheckBoxAction;
import fr.umlv.ir2.uibuilder.ui.controller.actions.creation.components.UIJComboBoxAction;
import fr.umlv.ir2.uibuilder.ui.controller.actions.creation.components.UIJLabelAction;
import fr.umlv.ir2.uibuilder.ui.controller.actions.creation.components.UIJListAction;
import fr.umlv.ir2.uibuilder.ui.controller.actions.creation.components.UIJMenuItemAction;
import fr.umlv.ir2.uibuilder.ui.controller.actions.creation.components.UIJPasswordFieldAction;
import fr.umlv.ir2.uibuilder.ui.controller.actions.creation.components.UIJProgressBarAction;
import fr.umlv.ir2.uibuilder.ui.controller.actions.creation.components.UIJRadioButtonAction;
import fr.umlv.ir2.uibuilder.ui.controller.actions.creation.components.UIJTableAction;
import fr.umlv.ir2.uibuilder.ui.controller.actions.creation.components.UIJTextAreaAction;
import fr.umlv.ir2.uibuilder.ui.controller.actions.creation.components.UIJTextFieldAction;
import fr.umlv.ir2.uibuilder.ui.controller.actions.creation.components.UIJToggleButtonAction;
import fr.umlv.ir2.uibuilder.ui.controller.actions.creation.components.UIJTreeAction;
import fr.umlv.ir2.uibuilder.ui.controller.actions.creation.containers.UIJDialogAction;
import fr.umlv.ir2.uibuilder.ui.controller.actions.creation.containers.UIJInternalFrameAction;
import fr.umlv.ir2.uibuilder.ui.controller.actions.creation.containers.UIJMenuAction;
import fr.umlv.ir2.uibuilder.ui.controller.actions.creation.containers.UIJMenuBarAction;
import fr.umlv.ir2.uibuilder.ui.controller.actions.creation.containers.UIJPanelAction;
import fr.umlv.ir2.uibuilder.ui.controller.actions.creation.containers.UIJScrollPaneAction;
import fr.umlv.ir2.uibuilder.ui.controller.actions.creation.containers.UIJSpliPaneAction;
import fr.umlv.ir2.uibuilder.ui.controller.actions.creation.containers.UIJTabbedPaneAction;
import fr.umlv.ir2.uibuilder.ui.controller.actions.creation.containers.UIJToolBarAction;
import fr.umlv.ir2.uibuilder.ui.controller.actions.handling.UICopyAction;
import fr.umlv.ir2.uibuilder.ui.controller.actions.handling.UICutAction;
import fr.umlv.ir2.uibuilder.ui.controller.actions.handling.UIDeleteAction;
import fr.umlv.ir2.uibuilder.ui.controller.actions.handling.UIOpenProjectAction;
import fr.umlv.ir2.uibuilder.ui.controller.actions.handling.UIPasteAction;
import fr.umlv.ir2.uibuilder.ui.controller.actions.handling.UIQuitAction;
import fr.umlv.ir2.uibuilder.ui.controller.actions.handling.UISaveProjectAction;
import fr.umlv.ir2.uibuilder.ui.controller.actions.handling.UIShowWindowAction;
import fr.umlv.ir2.uibuilder.ui.elements.UIComponentTree;
import fr.umlv.ir2.uibuilder.ui.elements.UIDrawingTable;
import fr.umlv.ir2.uibuilder.ui.elements.UIPropertiesTable;
import fr.umlv.ir2.uibuilder.ui.program.UIBuilder;


public class MainFrame {
	
	public static JFrame createMainFrame() {
		
		final JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		createNewFrame(new UIBuilder(frame));
		return frame;
	}
	
	public static void createNewFrame(UIBuilder uibuilder){
		
		final JFrame frame = uibuilder.getMainFrame();
		final JDesktopPane desktopPane = new JDesktopPane();
		final JInternalFrame iframe = new JInternalFrame();
		
		frame.setTitle("UIBuilder");
		frame.setSize(1024,768);
		
		/* Creation of the panel containing the components tree */
		JPanel treePanel = new JPanel();
		treePanel.setLayout(new BorderLayout());
		
		/* Creation of the panel containing the components properties tree */
		JPanel propertiesPanel = new JPanel();
		propertiesPanel.setOpaque(false);
		propertiesPanel.setLayout(new BorderLayout());
				
		final JTable drawingTable = UIDrawingTable.createUIDrawingTable();
		
		final JTable propertiesTable = UIPropertiesTable.createUIPropertiesTable();
		propertiesPanel.add(propertiesTable);
		
		componentTree = UIComponentTree.createUIComponentTree();
		treePanel.add(componentTree);
		
		JScrollPane drawingTableScrollPane = new JScrollPane(drawingTable);
		
		iframe.getContentPane().add(drawingTableScrollPane);
		iframe.setSize(600,600);
		iframe.setResizable(true);
		iframe.setVisible(true);
		desktopPane.add(iframe);
		
		// JSplitPane
		JScrollPane scrollTable = new JScrollPane(desktopPane,ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED,ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);
	
		JScrollPane scrollTree = new JScrollPane(treePanel);
		JScrollPane scrollProperties = new JScrollPane(propertiesPanel);
		
		JSplitPane leftSplitPane = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT,scrollTree,scrollTable);
		leftSplitPane.setResizeWeight(0.25);
		JSplitPane mainsplitPane = new JSplitPane(JSplitPane.VERTICAL_SPLIT,leftSplitPane,scrollProperties);
		mainsplitPane.setResizeWeight(0.75);
		
		// JMenuBar
		final JMenuBar menuBar = createUIMenuBar(frame);
		// ToolBar
		final JToolBar toolBar = createUIToolBar(drawingTable);
		
		frame.setJMenuBar(menuBar);
		
		frame.getContentPane().add(toolBar,BorderLayout.PAGE_START);
		frame.getContentPane().add(mainsplitPane);		
		uibuilder.showFrame();
		frame.validate();
		frame.repaint();
	}
	
	private static JMenuBar createUIMenuBar(final JFrame frame) {
		
		JMenuBar menuBar = new JMenuBar();
        
        // Menu Projet
        JMenu menuFile = new JMenu("Projet");
        
        menuFile.add(new JMenuItem(new UIOpenProjectAction()));
        menuFile.add(new JMenuItem(new UISaveProjectAction()));
        menuFile.add(new JMenuItem(new UIQuitAction(frame)));
        
        menuBar.add(menuFile);
        
        
        // Menu Edition
        JMenu menuEdit = new JMenu("Edition");
        
        menuEdit.add(new JMenuItem(new UICutAction()));
        menuEdit.add(new JMenuItem(new UICopyAction()));
        menuEdit.add(new JMenuItem (new UIPasteAction()));
        menuEdit.add(new JMenuItem(new UIDeleteAction()));
        
        menuBar.add(menuEdit);
         
        // Menu Affichage
        JMenu menuView = new JMenu("Affichage");
        menuView.add(new JMenuItem(new UIShowWindowAction()));
        menuBar.add(menuView);
        
        return menuBar;
	}

	private static JToolBar createUIToolBar(JTable drawingTable) {
		
		JToolBar toolBar = new JToolBar();
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		
		JPanel containerPanel = new JPanel();
		containerPanel.add(new JButton(new UIJDialogAction()));
		containerPanel.add(new JButton(new UIJInternalFrameAction()));
		containerPanel.add(new JButton(new UIJMenuAction()));
		containerPanel.add(new JButton(new UIJMenuBarAction()));
		containerPanel.add(new JButton(new UIJPanelAction()));
		containerPanel.add(new JButton(new UIJScrollPaneAction()));
		containerPanel.add(new JButton(new UIJSpliPaneAction()));
		containerPanel.add(new JButton(new UIJTabbedPaneAction()));
		containerPanel.add(new JButton(new UIJToolBarAction()));
		
		JPanel componentPanel = new JPanel();
		componentPanel.add(new JButton(new UIJButtonAction(drawingTable)));
		componentPanel.add(new JButton(new UIJCheckBoxAction(drawingTable)));
		componentPanel.add(new JButton(new UIJComboBoxAction(drawingTable)));
		componentPanel.add(new JButton(new UIJLabelAction(drawingTable)));
		componentPanel.add(new JButton(new UIJListAction(drawingTable)));
		componentPanel.add(new JButton(new UIJMenuItemAction()));
		componentPanel.add(new JButton(new UIJPasswordFieldAction(drawingTable)));
		componentPanel.add(new JButton(new UIJProgressBarAction()));
		componentPanel.add(new JButton(new UIJRadioButtonAction()));
		componentPanel.add(new JButton(new UIJTableAction()));
		componentPanel.add(new JButton(new UIJTextAreaAction()));
		componentPanel.add(new JButton(new UIJTextFieldAction()));
		componentPanel.add(new JButton(new UIJToggleButtonAction()));
		componentPanel.add(new JButton(new UIJTreeAction()));
		
		tabbedPane.addTab("Conteneurs", containerPanel);
		tabbedPane.addTab("Composants", componentPanel);
		toolBar.add(tabbedPane);
		
		return toolBar;
	}
	
	public static JTree getComponentTree() {
		
		return componentTree;
	}
	
	private static JTree componentTree = null;
}
