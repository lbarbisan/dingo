package fr.umlv.ir.dingo.tree;

public class Initialization implements ExprDefinition {

	private final Identifier variable;
	private final Tree expr;
	
	public Initialization(Identifier variable, Tree expr){
		this.variable=variable;
		this.expr = expr;
	}
	
	public void accept(TreeVisitor v) {
		v.visit(this);
	}

	public Tree getExpr() {
		return expr;
	}

	public Identifier getVariable() {
		return variable;
	}

}
