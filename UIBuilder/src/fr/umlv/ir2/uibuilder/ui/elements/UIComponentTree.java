package fr.umlv.ir2.uibuilder.ui.elements;

import javax.swing.JTable;
import javax.swing.JTree;
import javax.swing.event.TreeSelectionEvent;
import javax.swing.event.TreeSelectionListener;
import javax.swing.tree.TreeSelectionModel;

import fr.umlv.ir2.uibuilder.ui.controller.listeners.BridgeTableModelListener;
import fr.umlv.ir2.uibuilder.ui.elements.components.UIJComponent;
import fr.umlv.ir2.uibuilder.ui.model.UIComponentTreeModel;
import fr.umlv.ir2.uibuilder.ui.model.UIDrawingTableModel;
import fr.umlv.ir2.uibuilder.ui.model.UIPropertiesTableModel;
import fr.umlv.ir2.uibuilder.ui.model.UIComponentTreeModel.UIComponentTreeNode;
import fr.umlv.ir2.uibuilder.ui.view.renderer.UIComponentTreeCellRenderer;

public class UIComponentTree {
	
	public static JTree createUIComponentTree() {
		
		UIComponentTreeModel componentTreeModel;
		UIJComponent component = new UIJComponent();
		
		component.setComponent(new JTable());
		component.setComponentName("Root");
		
		componentTreeModel=  new UIComponentTreeModel(component);
		final JTree componentTree = new JTree(componentTreeModel);
		componentTree.getSelectionModel().setSelectionMode(TreeSelectionModel.SINGLE_TREE_SELECTION);
		componentTree.setCellRenderer(UIComponentTreeCellRenderer.createTreeRenderer());
		componentTree.addTreeSelectionListener( new TreeSelectionListener() {
			
			public void valueChanged(TreeSelectionEvent e) {
				
			}
		});
		
		UIDrawingTable.getDrawingTable().getModel().addTableModelListener(
				new BridgeTableModelListener(
						componentTreeModel,
						(UIDrawingTableModel) UIDrawingTable.getDrawingTable().getModel()
				));
		
		componentTree.addTreeSelectionListener(new TreeSelectionListener()
				{

					public void valueChanged(TreeSelectionEvent e) {
						UIJComponent component = ((UIComponentTreeNode)e.getPath().getLastPathComponent()).getComponent();
						((UIPropertiesTableModel)(UIPropertiesTable
							.getPropertiesTable().getModel())).
							setUIComponentPropertiesValues(
							(UIJComponent)(component));
						System.out.println(component);
					}
			
				}
				
		
		
		);
				
		
		return componentTree;			
	}
	
	
}