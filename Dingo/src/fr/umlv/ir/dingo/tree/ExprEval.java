package fr.umlv.ir.dingo.tree;


public class ExprEval implements ExprDefinition {

	public ExprEval(Expr expr) {
	    this.expr = expr;
	  }

	  public void accept(TreeVisitor v) {
	    v.visit(this);
	  }

	  private Expr expr;

	  public final Expr getExpr() {
	    return this.expr;
	  }

}
