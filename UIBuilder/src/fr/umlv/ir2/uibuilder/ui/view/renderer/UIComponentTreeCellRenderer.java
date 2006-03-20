package fr.umlv.ir2.uibuilder.ui.view.renderer;

import java.awt.Color;
import java.awt.Component;

import javax.swing.JTree;
import javax.swing.tree.DefaultTreeCellRenderer;

import fr.umlv.ir2.uibuilder.ui.model.UIComponentTreeModel.UIComponentTreeNode;

public class UIComponentTreeCellRenderer {
	
	public static DefaultTreeCellRenderer createTreeRenderer(){
		
		DefaultTreeCellRenderer renderer = new DefaultTreeCellRenderer() {
			
			public Component getTreeCellRendererComponent(JTree tree, Object component, boolean selected, boolean expanded, boolean isLeaf, int row, boolean hasFocus) {
				
				super.getTreeCellRendererComponent(tree, (UIComponentTreeNode)component, selected, expanded, isLeaf, row, hasFocus);
				
				//UIComponentTreeNode node = (UIComponentTreeNode)component;
				setOpaque(true);
				setBackground(new Color(255,255,255));
				
				if(((UIComponentTreeNode)component).isRoot()) {
					
					 setText(((UIComponentTreeNode)component).toString());
				}
				else if(isLeaf) {
					
					setText("Composant");
				}
				else setText("Conteneur");
				
				if(selected) {	
					
					setBackground(new Color(200,200,200));
				}
				
				return this;
			}
			
			private static final long serialVersionUID = 1L;
		};
		
		return renderer;
	}
}
