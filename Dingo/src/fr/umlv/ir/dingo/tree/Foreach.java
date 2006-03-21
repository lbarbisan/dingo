package fr.umlv.ir.dingo.tree;

public class Foreach implements Instruction {

	private final Instructions instructions;

	private final Var firstIdentifier;

	private final Var secondIdentifier;
	
	public Foreach(Var variable,
			Var variable2, Instructions instructions) {
		this.firstIdentifier = variable;
		this.instructions = instructions;
		this.secondIdentifier = variable2;
	}

	public void accept(TreeVisitor v) {
		v.visit(this);
	}

	public final Instructions getInstructions() {
		return this.instructions;
	}

	public final Var getVar() {
		return this.firstIdentifier;
	}

	public final Var getVar2() {
		return this.secondIdentifier;
	}

}
