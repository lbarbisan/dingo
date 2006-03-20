package fr.umlv.ir.dingo.tree;


public class BooleanValue implements BooleanExpr {

	private boolean value;

	  public BooleanValue(boolean value) {
	    this.value = value;
	  }

	  public boolean getValue() {
	    return this.value;
	  }

	  public void accept(TreeVisitor v) {
	    v.visit(this);
	  }

}
