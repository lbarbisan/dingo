package fr.umlv.ir2.uibuilder.ui.elements;

import java.awt.Color;
import java.awt.dnd.DnDConstants;
import java.awt.dnd.DragGestureListener;
import java.awt.dnd.DragSource;
import java.awt.dnd.DropTarget;
import java.awt.dnd.DropTargetListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JTable;
import javax.swing.ListSelectionModel;

import fr.umlv.ir2.uibuilder.ui.controller.listeners.TableDndListener;
import fr.umlv.ir2.uibuilder.ui.elements.components.UIJComponent;
import fr.umlv.ir2.uibuilder.ui.model.UIDrawingTableModel;
import fr.umlv.ir2.uibuilder.ui.model.UIPropertiesTableModel;
import fr.umlv.ir2.uibuilder.ui.view.renderer.UIDrawingTableRenderer;

public class UIDrawingTable {
	
	public static JTable createUIDrawingTable() {
	
		drawingTable.setModel(new UIDrawingTableModel(25,25));
		drawingTable.getTableHeader().setReorderingAllowed(false);
		drawingTable.setDefaultRenderer(Object.class,new UIDrawingTableRenderer());
		drawingTable.setCellSelectionEnabled(true);
		drawingTable.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);		
		drawingTable.setShowGrid(true);
		drawingTable.setGridColor(Color.GRAY);
		
		DragSource dSource = DragSource.getDefaultDragSource();
		dSource.createDefaultDragGestureRecognizer(drawingTable, DnDConstants.ACTION_MOVE, (DragGestureListener)dndListener );
		DropTarget dTarget = new DropTarget(drawingTable, DnDConstants.ACTION_MOVE, (DropTargetListener) dndListener, true);
		
		drawingTable.addMouseListener(new MouseListener() {

			public void mouseClicked(MouseEvent arg0) {
				
				int row = drawingTable.getSelectedRow(); 
				int column = drawingTable.getSelectedColumn();
				if(column != 0) {
					
					((UIPropertiesTableModel)(UIPropertiesTable.getPropertiesTable().getModel())).setUIComponentPropertiesValues((UIJComponent)(((UIDrawingTableModel) drawingTable.getModel()).getUIJComponentValueAt(row,column)));
				}
									
			}

			public void mousePressed(MouseEvent arg0) {
				
				int row = drawingTable.getSelectedRow(); 
				int column = drawingTable.getSelectedColumn();if(column != 0) {
					
					((UIPropertiesTableModel)(UIPropertiesTable.getPropertiesTable().getModel())).setUIComponentPropertiesValues((UIJComponent)(((UIDrawingTableModel) drawingTable.getModel()).getUIJComponentValueAt(row,column)));
				}
			}

			public void mouseReleased(MouseEvent arg0) {
				// TODO Auto-generated method stub
				
			}

			public void mouseEntered(MouseEvent arg0) {
				// TODO Auto-generated method stub
				
			}

			public void mouseExited(MouseEvent arg0) {
				// TODO Auto-generated method stub
				
			}
			
		});
		
		
		return drawingTable;	
	}
	
	public static JTable getDrawingTable() {
	
		return drawingTable;
	}
	
	private final static JTable drawingTable = new JTable();
	private final static TableDndListener dndListener = new TableDndListener(); 
	
}
