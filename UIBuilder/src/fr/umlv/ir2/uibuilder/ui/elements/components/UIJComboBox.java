package fr.umlv.ir2.uibuilder.ui.elements.components;

import javax.swing.JComboBox;
import javax.swing.JTable;

import fr.umlv.ir2.uibuilder.ui.parameters.UIComponentProperties;

public class UIJComboBox extends UIJComponent {

	public UIJComboBox(final JTable table) {

		this.setComponent(new JComboBox());
		setId(componentId);
		componentId++;
		UIComponentProperties.createUIComponentProperties((UIJComponent)this, table);
	}
	
	public int getId() {
		
		return componentId;
	}
	
	public void setId(int id) {
		
		componentId = id;
	}
	
	private static int componentId = 0;
	private static final long serialVersionUID = 1L;
}
