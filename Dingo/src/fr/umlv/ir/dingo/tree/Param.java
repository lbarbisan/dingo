package fr.umlv.ir.dingo.tree;

public class Param extends Params{

	private String type;
	private String ident;
	
	public Param(String type, String ident){
		this.type=type;
		this.ident=ident;
	}

	public String getIdent() {
		return ident;
	}

	public String getType() {
		return type;
	}
	
	
}
