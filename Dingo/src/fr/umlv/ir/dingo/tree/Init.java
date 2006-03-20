package fr.umlv.ir.dingo.tree;

public class Init implements ExprDefinition {

	private final Identifier identifier;
	private String type;
	private final Tree expr;
	
	public Init(Identifier identifier, Tree expr){
		this.identifier = identifier;
		this.expr = expr;
	}
	
	public Init(String type, Identifier identifier, Expr expr) {
		this.type = type;
		this.identifier = identifier;
		this.expr = expr;
	}

	public void accept(TreeVisitor v) {
		v.visit(this);
	}

	public Tree getExpr() {
		return expr;
	}

	public Identifier getIdentifier() {
		return identifier;
	}

}
