package fr.umlv.ir.dingo.tree;

public class Minus implements Expr {

	public Minus(Tree left, Tree right) {
	    this.left = left;
	    this.right = right;
	  }

	  final Tree left;

	  final Tree right;

	  public void accept(TreeVisitor v) {
	    v.visit(this);
	  }

	  public final Tree getLeft() {
	    return this.left;
	  }

	  public final Tree getRight() {
	    return this.right;
	  }


}
