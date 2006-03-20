package fr.umlv.ir2.uibuilder.ui.controller.listeners;

import java.awt.Component;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.Transferable;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.io.IOException;

public class TransferableComponent implements Transferable {

	  /** Create a new TransferableColor that encapsulates the specified component */
	  public TransferableComponent(Component component) { this.component = component; }

	  /** Return a list of DataFlavors we can support */
	  public DataFlavor[] getTransferDataFlavors() { return supportedFlavors; }

	  /** Check whether a specified DataFlavor is available */
	  public boolean isDataFlavorSupported(DataFlavor flavor) {
	    if (flavor.equals(componentFlavor))
	    	return true;
	    return false;
	  }

	  /** 
	   * Transfer the data.  Given a specified DataFlavor, return an Object
	   * appropriate for that flavor.  Throw UnsupportedFlavorException if we
	   * don't support the requested flavor.
	   */
	  public Object getTransferData(DataFlavor flavor) 
	       throws UnsupportedFlavorException, IOException
	  {
	    if (flavor.equals(componentFlavor)) return component;
	    else throw new UnsupportedFlavorException(flavor);
	  }
	  
	  // This DataFlavor object is used when we transfer Color objects directly
	  public final static DataFlavor componentFlavor = new DataFlavor(Component.class, "Java Component Object");

	  // These are the data flavors we support
	  protected final static DataFlavor[] supportedFlavors = {
		  componentFlavor,// Transfer as a Color object
	  };

	  private Component component;    

}
