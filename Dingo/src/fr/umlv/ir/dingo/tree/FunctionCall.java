package fr.umlv.ir.dingo.tree;

public class FunctionCall implements ExprDefinition {

	private String identifier;

	private ArgsList args;
	
	public FunctionCall(String identifier, ArgsList args) {
		this.identifier = identifier;
		this.args = args;
	}

	public void accept(TreeVisitor v) {
		v.visit(this);

	}

	public final ArgsList getArgs() {
		return this.args;
	}

	public final String getIdentifier() {
		return this.identifier;
	}

	public final void setIdentifier(String ident) {
		this.identifier = ident;
	}

}
