package fr.umlv.ir.dingo.tree;

public class Else implements Tree {

	  private final Instructions instructions;

	  public Else(Instructions instructions) {
		  this.instructions = instructions;
	}

	  public void accept(TreeVisitor v) {
	    v.visit(this);
	  }

	  public final Instructions getInstructions(){
	    return this.instructions;
	  }

}
