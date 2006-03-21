package fr.umlv.ir.dingo.tree;

import java.util.Iterator;
import java.util.LinkedHashMap;

public class ParamsList implements Tree {

	final LinkedHashMap<String, String> list = new LinkedHashMap<String, String>();

	public ParamsList() {
	}

	public ParamsList(String ident, String type) {
		list.put(ident, type);
	}

	public Iterator<String> identifiers() {
		return list.keySet().iterator();
	}

	public Iterator<String> types() {
		return list.values().iterator();
	}

	public void accept(TreeVisitor v) {
		v.visit(this);
	}

	public ParamsList add(String identifier, String type) {
		list.put(identifier, type);
		return this;
	}

}
