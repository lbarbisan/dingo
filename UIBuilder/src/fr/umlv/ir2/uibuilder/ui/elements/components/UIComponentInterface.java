package fr.umlv.ir2.uibuilder.ui.elements.components;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

public interface UIComponentInterface {
	
	public String getComponentText();
	
	public void setComponentText(String text);
	
	public String getComponentName();
	
	public void setComponentName(String name);
	
	public Font getComponentFont();
	
	public void setComponentFont(Font font);
	
	public String getComponentFontSize();
	
	public void setComponentFontSize(String fontSize);
	
	public Color getComponentBackground();
	
	public void setComponentBackground(Color color);
	
	public boolean getIsComponentVisible();
	
	public void setComponentVisible(boolean value);
	
	public Dimension getComponentSize();
	
	public void setComponentSize(Dimension size);
	
}
