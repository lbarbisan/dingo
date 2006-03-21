package fr.umlv.ir.dingo.tree;

public class Forever implements Instruction {

	private final Instructions instructions;
	
	public Forever(Instructions program){
		this.instructions = program;
	}
	
	public final Instructions getInstructions(){
		return this.instructions;
	}

	public void accept(TreeVisitor v) {
		v.visit(this);
	}

}
