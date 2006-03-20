package fr.umlv.ir.dingo;

import java.util.HashMap;
import java.util.LinkedList;

public class SymbolTableImpl<T> implements SymbolTable<T> {

	private final HashMap<String, LinkedList<T>> table = new HashMap<String, LinkedList<T>>();

	public T get(String s) throws UnknownSymbol {
		LinkedList<T> list = table.get(s);
		if (list != null)
			return list.getFirst();
		else
			throw new UnknownSymbol("unknow Symbol :" + s);
	}

	public void pop(String s) {
		LinkedList<T> list = table.get(s);
		list.removeFirst();
		if (list.isEmpty())
			table.remove(s);
	}

	public void push(String s, T d) {
		LinkedList<T> list = table.get(s);
		if (list != null)
			list.addFirst(d);
		else {
			list = new LinkedList<T>();
			list.addFirst(d);
			table.put(s, list);
		}

	}

}
