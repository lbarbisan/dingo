package fr.umlv.ir.dingo.tree;

public class Identifier extends Var implements Expr {

	public Identifier(String identifier) {
		super(identifier);
	}

	public final String getValue() {
		return this.getIdentifier();
	}

}
