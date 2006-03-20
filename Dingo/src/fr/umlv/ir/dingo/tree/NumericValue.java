package fr.umlv.ir.dingo.tree;

import java.math.BigDecimal;


public class NumericValue implements NumericExpr {
	private BigDecimal value;

	  public NumericValue(BigDecimal value) {
	    this.value = value;
	  }

	  public BigDecimal getValue() {
	    return this.value;
	  }

	  public void accept(TreeVisitor v) {
	    v.visit(this);
	  }
	  
	  
}
