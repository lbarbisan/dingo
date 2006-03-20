package fr.umlv.ir.dingo.tree;

public class Print implements Instruction {

	public Print(Tree expr) {
	    this.expr = expr;
	  }

	  final Tree expr;

	  public void accept(TreeVisitor v) {
	    v.visit(this);
	  }

	  public final Tree getExpr() {
	    return this.expr;
	  }
}
