package fr.umlv.ir.dingo.tree;

public class Break implements Instruction {

	public void accept(TreeVisitor v) {
		v.visit(this);
	}

}
