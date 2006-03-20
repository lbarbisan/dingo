package fr.umlv.ir.dingo.tree;

public class Var implements ExprDefinition {

	private String identifier;

	private String type;
	
	private int register=-1;
	
	private Expr expr;

	public Var(String identifier, Expr expr) {
		this.identifier = identifier;
		this.expr = expr;
	}

	public Var(String identifier) {
		this.identifier = identifier;
		this.expr = null;
	}

	public Var(String type,String identifier) {
		this.type = type;
		this.identifier = identifier;
	}

	public void accept(TreeVisitor v) {
		v.visit(this);
	}

	public final String getIdentifier() {
		return this.identifier;
	}
	
	public final String getType() {
		return this.type;
	}

	public final Expr getExpr() {
		return this.expr;
	}

	public int getRegister() {
		return register;
	}

	public void setRegister(int register) {
		this.register = register;
	}
	
}
