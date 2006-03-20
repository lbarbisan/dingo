package fr.umlv.ir.dingo.tree;

public class Foreach implements Instruction {

	public Foreach(Var variable,
			Var variable2, Instructions program) {
		this.variable = variable;
		this.program = program;
		this.variable2 = variable2;
	}

	private final Instructions program;

	private final Var variable;

	private final Var variable2;

	public void accept(TreeVisitor v) {
		v.visit(this);
	}

	public final Instructions getProgram() {
		return this.program;
	}

	public final Var getVar() {
		return this.variable;
	}

	public final Var getVar2() {
		return this.variable2;
	}

}
