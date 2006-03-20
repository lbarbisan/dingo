package fr.umlv.ir.dingo.tree;

public class Function implements Instruction {

	private ParamsList parameters;

	private Instructions instructions;

	private String name;

	private String returnType;

	public Function(String returnType, String name, ParamsList params,
			Instructions instructions) {
		this.name = name;
		this.parameters = params;
		this.instructions = instructions;
		this.returnType = returnType;
	}

	public void accept(TreeVisitor v) {
		v.visit(this);

	}

	public final Instructions getExpr() {
		return this.instructions;
	}

	public final ParamsList getParameters() {
		return this.parameters;
	}

	public final String getName() {
		return this.name;
	}

	public String getReturnType() {
		return returnType;
	}

}
