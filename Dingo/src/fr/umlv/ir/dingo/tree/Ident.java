package fr.umlv.ir.dingo.tree;


public class Ident implements Expr {
	final String id;

	  public Ident(String id) {
	    this.id = id;
	  }

	  public final String getId() {
	    return this.id;
	  }

	  public void accept(TreeVisitor v) {
	    v.visit(this);
	  }

}
