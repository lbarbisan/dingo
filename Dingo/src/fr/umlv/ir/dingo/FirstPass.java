package fr.umlv.ir.dingo;

import java.util.Iterator;

import org.objectweb.asm.ClassWriter;
import org.objectweb.asm.MethodVisitor;
import org.objectweb.asm.Opcodes;

import fr.umlv.ir.dingo.tree.And;
import fr.umlv.ir.dingo.tree.ArgsList;
import fr.umlv.ir.dingo.tree.BooleanValue;
import fr.umlv.ir.dingo.tree.Break;
import fr.umlv.ir.dingo.tree.Continue;
import fr.umlv.ir.dingo.tree.Div;
import fr.umlv.ir.dingo.tree.Else;
import fr.umlv.ir.dingo.tree.Equals;
import fr.umlv.ir.dingo.tree.ExprEval;
import fr.umlv.ir.dingo.tree.For;
import fr.umlv.ir.dingo.tree.Foreach;
import fr.umlv.ir.dingo.tree.Forever;
import fr.umlv.ir.dingo.tree.Function;
import fr.umlv.ir.dingo.tree.FunctionCall;
import fr.umlv.ir.dingo.tree.Identifier;
import fr.umlv.ir.dingo.tree.If;
import fr.umlv.ir.dingo.tree.Inf;
import fr.umlv.ir.dingo.tree.InfEquals;
import fr.umlv.ir.dingo.tree.Init;
import fr.umlv.ir.dingo.tree.Minus;
import fr.umlv.ir.dingo.tree.Modulo;
import fr.umlv.ir.dingo.tree.Not;
import fr.umlv.ir.dingo.tree.NotEquals;
import fr.umlv.ir.dingo.tree.NumericValue;
import fr.umlv.ir.dingo.tree.Or;
import fr.umlv.ir.dingo.tree.ParamsList;
import fr.umlv.ir.dingo.tree.Plus;
import fr.umlv.ir.dingo.tree.Print;
import fr.umlv.ir.dingo.tree.Println;
import fr.umlv.ir.dingo.tree.Return;
import fr.umlv.ir.dingo.tree.Star;
import fr.umlv.ir.dingo.tree.StringValue;
import fr.umlv.ir.dingo.tree.Sup;
import fr.umlv.ir.dingo.tree.SupEquals;
import fr.umlv.ir.dingo.tree.TreeVisitor;
import fr.umlv.ir.dingo.tree.Var;

public class FirstPass implements TreeVisitor {

	private final ClassWriter cw;
	private final ASMVisitor asmVisitor;
	private final String className;
	
	public FirstPass(ClassWriter cw, ASMVisitor asmVisitor, String className){
		this.cw=cw;
		this.asmVisitor = asmVisitor;
		this.className = className;
	}

	public void visit(Var variable) {
		
	}

	public void visit(Identifier ident) {
		
	}

	public void visit(ExprEval exprEval) {
		
	}

	public void visit(StringValue stringValue) {
		
	}

	public void visit(NumericValue numericValue) {
		
	}

	public void visit(BooleanValue booleanValue) {
		
	}

	public void visit(Plus plus) {
		
	}

	public void visit(Minus minus) {
		
	}

	public void visit(Star star) {
		
	}

	public void visit(Div divide) {
		
	}

	public void visit(Modulo modulo) {
		
	}

	public void visit(And and) {
		
	}

	public void visit(Or or) {
		
	}

	public void visit(Not not) {
		
	}

	public void visit(Sup superior) {
		
	}

	public void visit(Inf inferior) {
		
	}

	public void visit(InfEquals inferiorEquals) {
		
	}

	public void visit(SupEquals superiorEquals) {
		
	}

	public void visit(Equals equals) {
		
	}

	public void visit(NotEquals notEquals) {
		
	}

	public void visit(If If) {
		
	}

	public void visit(For For) {
		
	}

	public void visit(Foreach foreach) {
		
	}

	public void visit(Forever forever) {
		
	}

	public void visit(Print print) {
		
	}

	public void visit(Println println) {
		
	}

	public void visit(Return Return) {
	}

	public void visit(Continue Continue) {
		
	}

	public void visit(Break Break) {
		
	}

	public void visit(Init initialization) {
		
	}

	public void visit(Function function) {
		Iterator<String> it = function.getParameters().types();

		StringBuilder builder = new StringBuilder();
		while(it.hasNext()){
			
			builder.append(it.next());
			if(it.hasNext())
				builder.append(',');
				
		}
		
		MethodVisitor mv =cw.visitMethod(
				(Opcodes.ACC_PUBLIC | Opcodes.ACC_STATIC), function.getName(),
				"("+builder.toString()+")V", null, null);
		ASMVisitor v = new ASMVisitor(className, mv);
		
		Iterator <String> it2 = function.getParameters().identifiers();
		while(it2.hasNext()){
			String s = it2.next();
			v.getTable().push(s, new Var(s));
		}
		
		function.getExpr().accept(v);
		mv.visitInsn(Opcodes.RETURN);
		mv.visitEnd();
		asmVisitor.getFunctions().put(function.getName(), function);
	}

	public void visit(ParamsList params) {
		
	}

	public void visit(FunctionCall functionCall) {
		
	}

	public void visit(ArgsList args) {
		
	}

	public void visit(Else _else) {
		// TODO Auto-generated method stub
		
	}

	
}
