package fr.umlv.ir.dingo.tree;

public class For implements Instruction {

	public For(Init expr, BooleanExpr booleanExpr,
			Init expr2, Instructions program) {
		this.booleanExpr = booleanExpr;
		this.program = program;
		this.expr = expr;
		this.expr2 = expr2;
	}

	private final BooleanExpr booleanExpr;

	private final Instructions program;

	private final Init expr;

	private final Init expr2;

	public void accept(TreeVisitor v) {
		v.visit(this);
	}

	public final Instructions getProgram() {
		return this.program;
	}

	public final BooleanExpr getBooleanExpr() {
		return this.booleanExpr;
	}

	public final Init getDefinitionExpr() {
		return this.expr;
	}

	public final Init getDefinitionExpr2() {
		return this.expr2;
	}

}
