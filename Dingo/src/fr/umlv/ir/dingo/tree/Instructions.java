package fr.umlv.ir.dingo.tree;

import java.util.LinkedList;



public class Instructions implements Tree {

	final private LinkedList<Instruction> instructions = new LinkedList<Instruction>(); 
	  public Instructions() {
	  }
	  public Instructions add(Instruction instruction) {
	    instructions.addLast(instruction);
	    return this;
	  }
	  public void accept(TreeVisitor v) {
	    for (Instruction instruction : instructions)  {
	      instruction.accept(v);
	    }
	  }

}
