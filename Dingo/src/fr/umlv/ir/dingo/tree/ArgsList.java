package fr.umlv.ir.dingo.tree;

import java.util.Iterator;
import java.util.LinkedList;

public class ArgsList implements Tree {

	final LinkedList<Expr> args = new LinkedList<Expr>();

	public ArgsList() {
		
	}

	public ArgsList(Expr expr) {
		args.addLast(expr);
	}

	public Iterator<Expr> iterator() {
		return args.iterator();
	}

	public void accept(TreeVisitor v) {
		v.visit(this);
	}

	public ArgsList add(Expr expr) {
		args.addLast(expr);
		return this;
	}

}
