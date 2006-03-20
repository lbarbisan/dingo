package fr.umlv.ir2.uibuilder.ui.elements.components;

import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.JComponent;

public class UIJComponent extends JComponent implements UIComponentInterface {

	public Component getComponent() {
		
		return this.component;
	}
	
	public void setComponent(Component component) {
		
		this.component = component;
	}
	
	public String getComponentName() {
		
		return this.component.getName();
	}
	
	public void setComponentName(String name) {
		
		this.component.setName(name);
	}
	
	public Font getComponentFont() {
		
		return this.component.getFont();
	}
	
	public void setComponentFont(Font font) {
		
		this.component.setFont(font);
	}
	
	public Color getComponentBackground() {
	
		return this.component.getBackground();
	}
	
	public void setComponentBackground(Color color) {
	
		this.component.setBackground(color);
	}
	
	public boolean getIsComponentVisible() {
	
		return this.component.isVisible();
	}
	
	public void setComponentVisible(boolean value) {
	
		this.component.setVisible(value);
	}
	
	public Dimension getComponentSize() {
	
		return this.component.getSize();
	}
	
	public void setComponentSize(Dimension size) {
	
		this.component.setSize(size);
	}
	
	public String getComponentText() {
		
		return this.text;
	}

	public void setComponentText(String text) {
	
		this.text = text;
	}

	public String getComponentFontSize() {

		return this.fontSize;
	}

	public void setComponentFontSize(String fontSize) {
		
		this.fontSize = fontSize;
	}
	
	private Component component;
	private String text;
	private String fontSize;
	
}
