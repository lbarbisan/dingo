package fr.umlv.ir.dingo.tree;

public class For implements Instruction {

	private final BooleanExpr booleanExpr;

	private final Instructions instructions;

	private final Init init;

	private final Init increment;

	public For(Init init, BooleanExpr booleanExpr, Init inc,
			Instructions instructions) {
		this.booleanExpr = booleanExpr;
		this.instructions = instructions;
		this.init = init;
		this.increment = inc;
	}

	public void accept(TreeVisitor v) {
		v.visit(this);
	}

	public final Instructions getInstructions() {
		return this.instructions;
	}

	public final BooleanExpr getBooleanExpr() {
		return this.booleanExpr;
	}

	public final Init getInit() {
		return this.init;
	}

	public final Init getIncrement() {
		return this.increment;
	}

}
