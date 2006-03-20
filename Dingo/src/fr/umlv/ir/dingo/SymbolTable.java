package fr.umlv.ir.dingo;

public interface SymbolTable<T> {
	
	public Object get(String s) throws UnknownSymbol; 

	public void pop(String s); 
	
	public void push(String s, T d); 

}
