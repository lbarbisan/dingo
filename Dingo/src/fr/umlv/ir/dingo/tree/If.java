package fr.umlv.ir.dingo.tree;

public class If implements Instruction {

	private final BooleanExpr booleanExpr;

	private final Instructions instructions;
	
	private final Else _else;
	
	public If(BooleanExpr booleanExpr, Instructions instructions) {
		this.booleanExpr = booleanExpr;
		this.instructions = instructions;
		_else = null;
	}

	public If(BooleanExpr booleanExpr, Instructions instructions, Else else_bloc) {
		this.booleanExpr = booleanExpr;
		this.instructions = instructions;
		this._else = else_bloc;
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

}
