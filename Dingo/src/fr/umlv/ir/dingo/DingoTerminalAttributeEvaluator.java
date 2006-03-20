package fr.umlv.ir.dingo;

import java.math.BigDecimal;

import fr.umlv.ir.dingo.tools.TerminalAttributeEvaluator;
import fr.umlv.ir.dingo.tree.Identifier;
import fr.umlv.ir.dingo.tree.NumericValue;

public class DingoTerminalAttributeEvaluator implements
		TerminalAttributeEvaluator {

	public void space(CharSequence seq) {
		// TODO Auto-generated method stub
		
	}

	public void comment(CharSequence seq) {
		
	}

	public NumericValue numberValue(CharSequence seq) {
		return new NumericValue(BigDecimal.valueOf(Integer.parseInt(seq
				.toString())));
	}

	public String stringValue(CharSequence seq) {
		return new String(seq.toString());
	}

	public void string_type(CharSequence seq) {
		// TODO Auto-generated method stub
		
	}

	public void numeric_type(CharSequence seq) {
		// TODO Auto-generated method stub
		
	}

	public void function_type(CharSequence seq) {
		// TODO Auto-generated method stub
		
	}

	public void object_type(CharSequence seq) {
		// TODO Auto-generated method stub
		
	}

	public void array_type(CharSequence seq) {
		// TODO Auto-generated method stub
		
	}

	public Identifier identifier(CharSequence seq) {
		return new Identifier(seq.toString());
	}

	public void plus(CharSequence seq) {
		// TODO Auto-generated method stub
		
	}

	public void minus(CharSequence seq) {
		// TODO Auto-generated method stub
		
	}

	public void star(CharSequence seq) {
		// TODO Auto-generated method stub
		
	}

	public void div(CharSequence seq) {
		// TODO Auto-generated method stub
		
	}

	public void equals(CharSequence seq) {
		// TODO Auto-generated method stub
		
	}

	public void notEquals(CharSequence seq) {
		// TODO Auto-generated method stub
		
	}

	public void sup(CharSequence seq) {
		// TODO Auto-generated method stub
		
	}

	public void inf(CharSequence seq) {
		// TODO Auto-generated method stub
		
	}

	public void l_shift(CharSequence seq) {
		// TODO Auto-generated method stub
		
	}

	public void r_shift(CharSequence seq) {
		// TODO Auto-generated method stub
		
	}

	public void modulo(CharSequence seq) {
		// TODO Auto-generated method stub
		
	}

	public void not(CharSequence seq) {
		// TODO Auto-generated method stub
		
	}

	public void and(CharSequence seq) {
		// TODO Auto-generated method stub
		
	}

	public void or(CharSequence seq) {
		// TODO Auto-generated method stub
		
	}

	public void semicolon(CharSequence seq) {
		// TODO Auto-generated method stub
		
	}

	public void lpar(CharSequence seq) {
		// TODO Auto-generated method stub
		
	}

	public void rpar(CharSequence seq) {
		// TODO Auto-generated method stub
		
	}

	public void l_brace(CharSequence seq) {
		// TODO Auto-generated method stub
		
	}

	public void r_brace(CharSequence seq) {
		// TODO Auto-generated method stub
		
	}

	public void dot(CharSequence seq) {
		// TODO Auto-generated method stub
		
	}

	public void comma(CharSequence seq) {
		// TODO Auto-generated method stub
		
	}

	public void eoln(CharSequence seq) {
		// TODO Auto-generated method stub
		
	}

	public void dingo(CharSequence seq) {
		// TODO Auto-generated method stub
		
	}

	public void args(CharSequence seq) {
		// TODO Auto-generated method stub
		
	}

	public void def(CharSequence seq) {
		// TODO Auto-generated method stub
		
	}

	public void _var(CharSequence seq) {
		// TODO Auto-generated method stub
		
	}

	public void _return(CharSequence seq) {
		// TODO Auto-generated method stub
		
	}

	public void _if(CharSequence seq) {
		// TODO Auto-generated method stub
		
	}

	public void _else(CharSequence seq) {
		// TODO Auto-generated method stub
		
	}

	public void _for(CharSequence seq) {
		// TODO Auto-generated method stub
		
	}

	public void _foreach(CharSequence seq) {
		// TODO Auto-generated method stub
		
	}

	public void _in(CharSequence seq) {
		// TODO Auto-generated method stub
		
	}

	public void forever(CharSequence seq) {
		// TODO Auto-generated method stub
		
	}

	public void _break(CharSequence seq) {
		// TODO Auto-generated method stub
		
	}

	public void _continue(CharSequence seq) {
		// TODO Auto-generated method stub
		
	}

	public void print(CharSequence seq) {
		// TODO Auto-generated method stub
		
	}

	public void println(CharSequence seq) {
		// TODO Auto-generated method stub
		
	}

	public void _null(CharSequence seq) {
		// TODO Auto-generated method stub
		
	}

	public void gui(CharSequence seq) {
		// TODO Auto-generated method stub
		
	}

	public void _void(CharSequence seq) {
		// TODO Auto-generated method stub
		
	}

	public void numeric_identifier(CharSequence seq) {
		// TODO Auto-generated method stub
		
	}

	public void string_identifier(CharSequence seq) {
		// TODO Auto-generated method stub
		
	}

}
