package fr.umlv.ir.dingo.tree;

public class Continue implements Instruction {

	public void accept(TreeVisitor v) {
		v.visit(this);
	}

}
