/**
 * 
 */
package fr.umlv.ir2.uibuilder.ui.controller.listeners;

import java.awt.Component;

import javax.swing.event.TableModelEvent;
import javax.swing.event.TableModelListener;

import fr.umlv.ir2.uibuilder.ui.MainFrame;
import fr.umlv.ir2.uibuilder.ui.elements.components.UIJComponent;
import fr.umlv.ir2.uibuilder.ui.model.UIComponentTreeModel;
import fr.umlv.ir2.uibuilder.ui.model.UIDrawingTableModel;

/**
 * @author Administrateur
 *
 */
public class BridgeTableModelListener implements TableModelListener
	{
		private UIComponentTreeModel treeModel;
		private UIDrawingTableModel tableModel;
		
		public BridgeTableModelListener(UIComponentTreeModel treeModel, UIDrawingTableModel tableModel)
		{
			this.treeModel = treeModel;
			this.tableModel = tableModel;
		}
	
		public void tableChanged(TableModelEvent arg0) {

			if(arg0.getType()==TableModelEvent.DELETE)
			{
				treeModel.remove(
						(Component) tableModel.getUIJComponentValueAt(arg0.getFirstRow(), arg0.getColumn()));
						
			}
			else if(arg0.getType()==TableModelEvent.INSERT)
			{
				treeModel.getRoot().add(
						(UIJComponent) tableModel.getUIJComponentValueAt(arg0.getFirstRow(), arg0.getColumn()));
			}
					
		}	
}
