package fr.umlv.ir2.uibuilder.ui.model;

import java.awt.Component;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;

import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;
import javax.swing.tree.TreeNode;

import fr.umlv.ir2.uibuilder.ui.elements.components.UIJComponent;

public class UIComponentTreeModel extends DefaultTreeModel {
	
	public UIComponentTreeModel(UIJComponent component) {
		
		super(null);
		this.root = new UIComponentTreeNode(null, component);
		this.setRoot(this.root);
	}
	
	public void remove(Component component)
	{
		for(UIComponentTreeNode selectUIComponentTreeNode : this.getRoot().childs)
		{
			if(selectUIComponentTreeNode.getComponent()==component)
			{
				this.getRoot().remove(selectUIComponentTreeNode);
				break;
			}
		}
		
	}
	
	public class UIComponentTreeNode extends DefaultMutableTreeNode {
		
		public UIComponentTreeNode(UIComponentTreeNode parent, UIJComponent component) {
			
			this.parent = parent;
			this.component = component;
			this.childs = new ArrayList<UIComponentTreeNode>();
		}
		
		public UIComponentTreeNode getChildAt(int arg0) {
			
			return this.childs.get(arg0);
		}
		
		public int getChildCount() {
			
			return this.childs.size();
		}
		
		public UIComponentTreeNode getParent() {
			
			return this.parent;
		}
		
		public int getIndex(TreeNode arg0) {
			
			return this.childs.indexOf(arg0);
		}
		
		public boolean getAllowsChildren() {
			
			return true;
		}
		
		public boolean isLeaf() {
			
			return this.childs.isEmpty();
		}
		
		public Enumeration children() {
			
			return Collections.enumeration(this.childs);
		}
		
		public UIComponentTreeNode add(UIJComponent component) {
			
			UIComponentTreeNode child = new UIComponentTreeNode(this,component);
			int size = this.childs.size();
			this.childs.add(child);
			nodesWereInserted(this,new int[]{size});
			return child;
		}
		
		public void remove(UIComponentTreeNode node) {
			
			int index = this.childs.indexOf(node);
			this.childs.remove(node);
			nodesWereRemoved(this, new int[]{index}, new Object[]{node.getComponent()});
		}
		
		
		public String toString() {
			
			return this.component.getComponentName();
		}
		
		public UIJComponent getComponent() {
			
			return component;
		}
		
		public ArrayList<UIComponentTreeNode> getChilds() {
			
			return childs;
		}
		
		public String getName() {
			
			return component.getComponentName();
		}
		
		/* Represents a parent node */
		private final UIComponentTreeNode parent;
		/* Represents a node */
		private final UIJComponent component; 
		/* Represents node's childs */
		private final ArrayList<UIComponentTreeNode> childs;
		private static final long serialVersionUID = 1L;
		
	}    
	
	public UIComponentTreeNode getRoot() {
		
		return this.root;
	}
	
	private static final long serialVersionUID = 1L;
	/* represent the tree root */
	private final UIComponentTreeNode root;
	
}
