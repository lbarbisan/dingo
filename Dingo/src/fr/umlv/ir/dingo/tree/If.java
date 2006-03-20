package fr.umlv.ir.dingo.tree;

public class If implements Instruction{

	public If(BooleanExpr booleanExpr, Instructions program) {
	    this.booleanExpr = booleanExpr;
	    this.program = program;
	  }

	  final BooleanExpr booleanExpr;

	  final Instructions program;

	  public void accept(TreeVisitor v) {
	    v.visit(this);
	  }

	  public final Instructions getProgram(){
	    return this.program;
	  }

	  public final BooleanExpr getBooleanExpr(){
	    return this.booleanExpr;
	  }

}
