package fr.umlv.ir.dingo.tree;


public class FunctionCall implements DefinitionExpr {

	public FunctionCall(String ident, ArgsList args) {
	    this.ident = ident;
	    this.args = args;
	  }
	  public void accept(TreeVisitor v) {
	   v.visit(this);
	    
	  }
	  private String ident;
	  private ArgsList args;
	  public final ArgsList getArgs() {
	    return this.args;
	  }
	  public final String getIdent() {
	    return this.ident;
	  }
	  public final void setIdent(String ident){
		  this.ident = ident;
	  }

}
