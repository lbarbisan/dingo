package fr.umlv.ir2.uibuilder.ui.controller.listeners;

import java.awt.Component;
import java.awt.Point;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.awt.dnd.DnDConstants;
import java.awt.dnd.DragGestureEvent;
import java.awt.dnd.DragGestureListener;
import java.awt.dnd.DragSource;
import java.awt.dnd.DragSourceContext;
import java.awt.dnd.DragSourceDragEvent;
import java.awt.dnd.DragSourceDropEvent;
import java.awt.dnd.DragSourceEvent;
import java.awt.dnd.DragSourceListener;
import java.awt.dnd.DropTarget;
import java.awt.dnd.DropTargetDragEvent;
import java.awt.dnd.DropTargetDropEvent;
import java.awt.dnd.DropTargetEvent;
import java.awt.dnd.DropTargetListener;
import java.io.IOException;

import javax.swing.JTable;

import fr.umlv.ir2.uibuilder.ui.model.UIDrawingTableModel;

public class TableDndListener implements DragSourceListener, DragGestureListener, DropTargetListener {

	private int sourceColumn;
	private int sourceRow;
	
	public void dragGestureRecognized(DragGestureEvent dge) 
	{
		JTable jTable =  (JTable)dge.getComponent();
		
		Point point = dge.getDragOrigin();
		sourceColumn = jTable.columnAtPoint(point);
		sourceRow = jTable.rowAtPoint(point);
		
		if (sourceColumn > 0) {
			
			Component component =  (Component)((UIDrawingTableModel)(jTable.getModel())).getUIJComponentValueAt(sourceRow,sourceColumn);
		

			dge.startDrag(DragSource.DefaultMoveDrop, new TransferableComponent(component) , (DragSourceListener) this);
		}

	}
	
	public void dragDropEnd(DragSourceDropEvent dsde)
	{
		if(dsde.getDropSuccess()==true)
		{
			JTable table = (JTable)((DragSourceContext)dsde.getSource()).getComponent();
			((UIDrawingTableModel)(table.getModel())).removeValueAt(sourceRow, sourceColumn);
		}
	}
	
	public void drop(DropTargetDropEvent dtde)
	{
		try {
			Component component =  (Component)dtde.getTransferable().getTransferData(TransferableComponent.componentFlavor);
			dtde.acceptDrop(DnDConstants.ACTION_MOVE);
			JTable table = (JTable)((DropTarget)dtde.getSource()).getComponent();
			int column = table.columnAtPoint(dtde.getLocation());
			int row = table.rowAtPoint(dtde.getLocation());
			if(row!=-1 && column>0)
			{
				table.getModel().setValueAt(component,row, column );
			}
			else
			{
			 dtde.dropComplete(false);
			}
			dtde.dropComplete(true);
		} catch (UnsupportedFlavorException e) {
			dtde.dropComplete(false);
		} catch (IOException e) {
			dtde.dropComplete(false);
		}
	}
	
	public void dragEnter(DropTargetDragEvent dtde)
	{
		dtde.acceptDrag(DnDConstants.ACTION_MOVE);
	}

	public void dragOver(DropTargetDragEvent dtde)
	{
		dtde.acceptDrag(DnDConstants.ACTION_MOVE);
	}
	
	public void dropActionChanged(DropTargetDragEvent dtde)
	{
		dtde.acceptDrag(DnDConstants.ACTION_MOVE);
	}

	public void dragExit(DropTargetEvent dte){}
	public void dragOver(DragSourceDragEvent dsde){}
	public void dropActionChanged(DragSourceDragEvent dsde){}
	public void dragExit(DragSourceEvent dsde){}
	public void dragEnter(DragSourceDragEvent arg0) {}
	
}
