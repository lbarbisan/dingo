package fr.umlv.ir.dingo.tree;


public class Function implements Instruction {

	public Function(String returnType, String name, Params params, Instructions program) {
	    this.name = name;
	    this.params = params;
	    this.program = program;
	    this.returnType = returnType;
	  }

	  public void accept(TreeVisitor v) {
	    v.visit(this);
	    
	  }
	  private Params params;
	  private Instructions program;
	  private String name;
	  private String returnType;
	  
	  public final Instructions getExpr() {
	    return this.program;
	  }

	  public final Params getParams() {
	    return this.params;
	  }

	  public final String getIdent() {
	    return this.name;
	  }

	public String getReturnType() {
		return returnType;
	}

	  
}
