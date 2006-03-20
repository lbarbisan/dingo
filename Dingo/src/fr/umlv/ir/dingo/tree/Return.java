package fr.umlv.ir.dingo.tree;

public class Return implements Instruction {

	private final Tree expr;
	
	public Return(Tree expr){
		this.expr=expr;
	}
	
	public void accept(TreeVisitor v) {
		v.visit(this);
	}

	public final Tree getExpr() {
		return expr;
	}
	
	

}
