package fr.umlv.ir.dingo.tree;

public class Initialization implements DefinitionExpr {

	private final Ident variable;
	private final Tree expr;
	
	public Initialization(Ident variable, Tree expr){
		this.variable=variable;
		this.expr = expr;
	}
	
	public void accept(TreeVisitor v) {
		v.visit(this);
	}

	public Tree getExpr() {
		return expr;
	}

	public Ident getVariable() {
		return variable;
	}

}
