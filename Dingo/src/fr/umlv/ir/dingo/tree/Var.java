package fr.umlv.ir.dingo.tree;

public class Var implements DefinitionExpr {

	private String ident;

	private int register=-1;
	
	private Expr expr;

	public Var(String ident, Expr expr) {
		this.ident = ident;
		this.expr = expr;
	}

	public Var(String ident) {
		this.ident = ident;
		this.expr = null;
	}

	public void accept(TreeVisitor v) {
		v.visit(this);
	}

	public final String getIdent() {
		return this.ident;
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
