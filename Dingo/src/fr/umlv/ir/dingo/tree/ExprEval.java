package fr.umlv.ir.dingo.tree;

public class ExprEval implements ExprDefinition {

	private Expr expr;

	public ExprEval(Expr expr) {
		this.expr = expr;
	}

	public void accept(TreeVisitor v) {
		v.visit(this);
	}

	public final Expr getExpr() {
		return this.expr;
	}

}
