package fr.umlv.ir.dingo.tree;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;



public class ParamsList implements Tree {

	final LinkedHashMap<String, String> params = new LinkedHashMap<String, String>();
	  
	  public ParamsList()  {
	  }
	  public ParamsList(String ident, String type) {
	    params.put(ident, type);
	  }

	  public Iterator<String> variableIterator()  {
	    return params.keySet().iterator();
	  }
	  
	  public Iterator<String> typeIterator()  {
		    return params.values().iterator();
		  }
	  
	  public void accept(TreeVisitor v) {
	    v.visit(this);
	  }


	  public ParamsList add(String ident, String type) {
	    params.put(ident, type);
	    return this;
	  }
	  public int number() {
	    return params.size();
	  }


}
