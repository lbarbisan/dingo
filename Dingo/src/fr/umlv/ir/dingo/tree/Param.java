package fr.umlv.ir.dingo.tree;

public class Param extends ParamsList{

	private String type;
	private String identifier;
	
	public Param(String type, String ident){
		this.type=type;
		this.identifier=ident;
	}

	public String getIdentifier() {
		return identifier;
	}

	public String getType() {
		return type;
	}
	
	
}
