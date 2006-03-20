package fr.umlv.ir.dingo.tree;

public class Forever implements Instruction {

	private final Instructions program;
	
	public Forever(Instructions program){
		this.program = program;
	}
	
	public final Instructions getProgram(){
		return this.program;
	}

	public void accept(TreeVisitor v) {
		v.visit(this);
	}

}
