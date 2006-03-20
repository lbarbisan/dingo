package fr.umlv.ir.dingo.tree;

public class Println implements Instruction {

	public Println(Tree expr) {
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
