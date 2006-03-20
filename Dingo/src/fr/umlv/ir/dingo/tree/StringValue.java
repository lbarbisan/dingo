package fr.umlv.ir.dingo.tree;



public class StringValue implements StringExpr {

	 private String value;

	  public StringValue(String value) {
	    this.value = value;
	  }

	  public String getValue() {
	    return this.value;
	  }

	  public void accept(TreeVisitor v) {
	    v.visit(this);
	  }
}
