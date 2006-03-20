package fr.umlv.ir.dingo.tree;

import java.util.Iterator;
import java.util.LinkedHashMap;



public class ParamsList implements Tree {

	final LinkedHashMap<String, String> list = new LinkedHashMap<String, String>();
	  
	  public ParamsList()  {
	  }
	  public ParamsList(String ident, String type) {
	    list.put(ident, type);
	  }

	  public Iterator<String> variableIterator()  {
	    return list.keySet().iterator();
	  }
	  
	  public Iterator<String> typeIterator()  {
		    return list.values().iterator();
		  }
	  
	  public void accept(TreeVisitor v) {
	    v.visit(this);
	  }


	  public ParamsList add(String ident, String type) {
	    list.put(ident, type);
	    return this;
	  }
	  public int number() {
	    return list.size();
	  }


}
