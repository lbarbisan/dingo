package fr.umlv.ir2.uibuilder.ui.parameters;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GraphicsEnvironment;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SpinnerModel;
import javax.swing.SpinnerNumberModel;

import fr.umlv.ir2.uibuilder.ui.elements.components.UIJComponent;
import fr.umlv.ir2.uibuilder.ui.model.UIDrawingTableModel;

public class UIComponentProperties {
	
	public static void createUIComponentProperties(final UIJComponent component, final JTable table) {
		
		final JFrame frame = new JFrame();
		frame.setSize(800, 450);
		Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
		frame.setLocation(dim.width / 2 - (frame.getWidth() / 2) ,dim.height / 2 - (frame.getHeight() / 2));
		
		JPanel panel = new JPanel();
		String[] boolean_list = {"true","false"};
		String[] fontSize_list = {"8","10","12","14","16","18","20","24"};
		final Font[] font_list = GraphicsEnvironment.getLocalGraphicsEnvironment().getAllFonts();
		String[] policies_list = new String[font_list.length];
		for(int i=0;i<font_list.length;i++) {
			policies_list[i] = font_list[i].getFamily().toString();
		}
		
		String[] color_list = new String[256];
		
		for(int i=0;i<color_list.length;i++) {
			color_list[i] = Integer.toString(i);
		}
		
		// Definition of the panel layout
		panel.setLayout(new GridBagLayout());
		GridBagConstraints gbc = new GridBagConstraints();
		
		// Components to add to the panel
		JLabel text = new JLabel("Texte ");
		final JTextArea textField = new JTextArea(15,3);
		
		JLabel name = new JLabel("Nom ");
		final JTextField nameField = new JTextField(15);
		
		JLabel font = new JLabel("Police");
		final JComboBox fontField = new JComboBox(policies_list);
		
		JLabel fontSize = new JLabel("Taille de la police");
		final JComboBox fontSizeField = new JComboBox(fontSize_list);
		
		JLabel background = new JLabel("Couleur de  fond (R V B)");
		final JComboBox redBkg = new JComboBox(color_list);
		final JComboBox greenBkg = new JComboBox(color_list);
		final JComboBox blueBkg = new JComboBox(color_list);
		
		JLabel isVisible = new JLabel("Visible");
		final JComboBox isVisibleField = new JComboBox(boolean_list);
		
		JLabel size = new JLabel("Taille");
		SpinnerModel spinnerModelx = new SpinnerNumberModel(1,1,200,1);
		SpinnerModel spinnerModely = new SpinnerNumberModel(1,1,200,1);
		final JSpinner sizeFieldx = new JSpinner(spinnerModelx);
		final JSpinner sizeFieldy = new JSpinner(spinnerModely);
		
		JLabel position = new JLabel("Position dans la grille : (x,y)");
		SpinnerModel spinnerGridModelx = new SpinnerNumberModel(0,0,table.getColumnCount() -1,1);
		SpinnerModel spinnerGridModely = new SpinnerNumberModel(1,1,table.getColumnCount() -1,1);
		final JSpinner gridx = new JSpinner(spinnerGridModelx);
		final JSpinner gridy = new JSpinner(spinnerGridModely);
		
		
		JButton ok = new JButton("OK");
		ok.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				
				if(((UIDrawingTableModel) table.getModel()).getUIJComponentValueAt(Integer.parseInt(gridx.getValue().toString()),Integer.parseInt(gridy.getValue().toString())) == null ) {
					
					component.setComponentText(textField.getText());
					component.setComponentName(nameField.getText());
					component.setComponentFont((Font)(font_list[fontField.getSelectedIndex()]));
					component.setComponentFontSize(fontSizeField.getSelectedItem().toString());
					component.setComponentBackground(new Color(Integer.parseInt((String) redBkg.getSelectedItem()), Integer.parseInt((String) greenBkg.getSelectedItem()), Integer.parseInt((String) blueBkg.getSelectedItem())));
					component.setComponentVisible(Boolean.valueOf(isVisibleField.getSelectedItem().toString()));
					component.setComponentSize(new Dimension(Integer.parseInt(sizeFieldx.getValue().toString()),Integer.parseInt(sizeFieldy.getValue().toString())));
					
					frame.dispose();	
					
					((UIDrawingTableModel)(table.getModel())).addComponent(component,Integer.parseInt(gridx.getValue().toString()),Integer.parseInt(gridy.getValue().toString()));
				}
				else {
					
					JOptionPane.showMessageDialog(null, "Il existe déjà un composant à cette position, veuillez modifier votre choix", "Problème de placement", JOptionPane.ERROR_MESSAGE);
				}
			}
		});
		
		gbc.gridwidth = 1;
		gbc.gridheight = 1;
		gbc.gridx = 0;
		gbc.gridy = 0;
		gbc.weightx = 1;
		gbc.weighty = 1;
		gbc.fill = GridBagConstraints.HORIZONTAL;
		gbc.anchor = GridBagConstraints.EAST;
		gbc.insets = new Insets(2,5,2,5);
		panel.add(text,gbc);
		
		gbc.gridx = 1;
		panel.add(textField,gbc);
		
		gbc.gridx = 0;
		gbc.gridy = 1;
		panel.add(name,gbc);
		
		gbc.gridx = 1;
		panel.add(nameField,gbc);
		
		gbc.gridx = 0;
		gbc.gridy = 2;
		panel.add(font,gbc);
		
		gbc.gridx = 1;
		panel.add(fontField,gbc);
		
		gbc.gridx = 0;
		gbc.gridy = 3;
		panel.add(fontSize,gbc);
		
		gbc.gridx = 1;
		panel.add(fontSizeField,gbc);
		
		gbc.gridx = 0;
		gbc.gridy = 4;
		panel.add(background,gbc);
		
		gbc.gridx = 1;
		panel.add(redBkg,gbc);
		gbc.gridx = 2;
		panel.add(greenBkg,gbc);
		gbc.gridx = 3;
		panel.add(blueBkg,gbc);
		
		gbc.gridx = 0;
		gbc.gridy = 5;
		panel.add(isVisible,gbc);
		
		gbc.gridx = 1;
		panel.add(isVisibleField,gbc);
		
		gbc.gridx = 0;
		gbc.gridy = 6;
		panel.add(size,gbc);
		
		gbc.gridx = 1;
		panel.add(sizeFieldx,gbc);
		
		gbc.gridx = 2;
		panel.add(sizeFieldy,gbc);

		gbc.gridx = 0;
		gbc.gridy = 7;
		panel.add(position,gbc);
		
		gbc.gridx = 1;
		panel.add(gridx,gbc);
		
		gbc.gridx = 2;
		panel.add(gridy,gbc);
		
		gbc.gridx = 4;
		gbc.gridy = 8;
		gbc.anchor = GridBagConstraints.LAST_LINE_END;
		panel.add(ok,gbc);
		
		frame.getContentPane().add(panel);
		frame.setVisible(true);
	}
}	
