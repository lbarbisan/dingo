package fr.umlv.ir.dingo;

import java.util.HashMap;
import java.util.Iterator;

import org.objectweb.asm.Label;
import org.objectweb.asm.MethodVisitor;
import org.objectweb.asm.Opcodes;

import fr.umlv.ir.dingo.tree.And;
import fr.umlv.ir.dingo.tree.ArgsList;
import fr.umlv.ir.dingo.tree.BooleanValue;
import fr.umlv.ir.dingo.tree.Break;
import fr.umlv.ir.dingo.tree.Continue;
import fr.umlv.ir.dingo.tree.Div;
import fr.umlv.ir.dingo.tree.Equals;
import fr.umlv.ir.dingo.tree.Expr;
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

public class ASMVisitor implements TreeVisitor {

	private static final String JAVA_MATH_BIG_DECIMAL = "java/math/BigDecimal";

	public ASMVisitor(String className, MethodVisitor mv) {
		this.className = className;
		this.methodVisitor = mv;

		mv.visitMaxs(64, 32);
	}

	private final String className;

	private final MethodVisitor methodVisitor;

	private final SymbolTableImpl<Var> table = new SymbolTableImpl<Var>();

	private int currentRegister = 0;


	private HashMap<String, Function> functions = new HashMap<String, Function>();

	public HashMap<String, Function> getFunctions() {
		return functions;
	}

	public void visit(Var variable) {
		variable = table.get(variable.getIdentifier());
		methodVisitor.visitVarInsn(Opcodes.ALOAD, variable.getRegister());
	}

	public void visit(Identifier identifier) {
		
	}

	public void visit(ExprEval exprEval) {
		
	}

	public void visit(StringValue stringValue) {
		methodVisitor.visitLdcInsn(stringValue.getValue());
	}

	public void visit(NumericValue numericValue) {
		methodVisitor.visitLdcInsn(numericValue.getValue().longValue());
		methodVisitor.visitMethodInsn(Opcodes.INVOKESTATIC, JAVA_MATH_BIG_DECIMAL,
				"valueOf", "(J)Ljava/math/BigDecimal;");
	}

	public void visit(Plus plus) {
		plus.getLeft().accept(this);
		plus.getRight().accept(this);
		methodVisitor.visitMethodInsn(Opcodes.INVOKEVIRTUAL, JAVA_MATH_BIG_DECIMAL,
				"add", "(Ljava/math/BigDecimal;)Ljava/math/BigDecimal;");
	}

	public void visit(Minus minus) {
		minus.getLeft().accept(this);
		minus.getRight().accept(this);
		methodVisitor.visitMethodInsn(Opcodes.INVOKEVIRTUAL, JAVA_MATH_BIG_DECIMAL,
				"subtract", "(Ljava/math/BigDecimal;)Ljava/math/BigDecimal;");
	}

	public void visit(Star star) {
		star.getLeft().accept(this);
		star.getRight().accept(this);
		methodVisitor.visitMethodInsn(Opcodes.INVOKEVIRTUAL, JAVA_MATH_BIG_DECIMAL,
				"multiply", "(Ljava/math/BigDecimal;)Ljava/math/BigDecimal;");
	}

	public void visit(Div divide) {
		divide.getLeft().accept(this);
		divide.getRight().accept(this);
		methodVisitor.visitMethodInsn(Opcodes.INVOKEVIRTUAL, JAVA_MATH_BIG_DECIMAL,
				"divide", "(Ljava/math/BigDecimal;)Ljava/math/BigDecimal;");
	}

	public void visit(Modulo modulo) {
		modulo.getLeft().accept(this);
		modulo.getRight().accept(this);
		methodVisitor.visitMethodInsn(Opcodes.INVOKEVIRTUAL, JAVA_MATH_BIG_DECIMAL,
				"modulo", "(Ljava/math/BigDecimal;)Ljava/math/BigDecimal;");
	}

	public void visit(And and) {
		and.getLeft().accept(this);
		and.getRight().accept(this);

	}

	public void visit(Or or) {
		or.getLeft().accept(this);
		or.getRight().accept(this);

	}

	public void visit(Not not) {
		not.getExpr().accept(this);
	}

	public void visit(BooleanValue booleanValue) {
		booleanValue.getValue();

	}

	public void visit(If If) {
		Label lless = new Label();
		Label lout = new Label();
		If.getBooleanExpr().accept(this);
		methodVisitor.visitJumpInsn(Opcodes.IFNE, lless);
		If.getProgram().accept(this);
		methodVisitor.visitJumpInsn(Opcodes.GOTO, lout);
		methodVisitor.visitLabel(lless);
		methodVisitor.visitLabel(lout);

	}

	public void visit(Sup superior) {
		superior.getLeft().accept(this);
		superior.getRight().accept(this);
		methodVisitor.visitMethodInsn(Opcodes.INVOKEVIRTUAL, JAVA_MATH_BIG_DECIMAL,
				"compareTo", "(Ljava/math/BigDecimal;)I");
		Label lless = new Label();
		Label lout = new Label();
		methodVisitor.visitJumpInsn(Opcodes.IFGT, lless);
		methodVisitor.visitInsn(Opcodes.ICONST_1);
		methodVisitor.visitJumpInsn(Opcodes.GOTO, lout);
		methodVisitor.visitLabel(lless);
		methodVisitor.visitInsn(Opcodes.ICONST_0);
		methodVisitor.visitLabel(lout);
	}

	public void visit(Inf inferior) {
		inferior.getLeft().accept(this);
		inferior.getRight().accept(this);
		methodVisitor.visitMethodInsn(Opcodes.INVOKEVIRTUAL, JAVA_MATH_BIG_DECIMAL,
				"compareTo", "(Ljava/math/BigDecimal;)I");
		Label lless = new Label();
		Label lout = new Label();
		methodVisitor.visitJumpInsn(Opcodes.IFLT, lless);
		methodVisitor.visitInsn(Opcodes.ICONST_1);
		methodVisitor.visitJumpInsn(Opcodes.GOTO, lout);
		methodVisitor.visitLabel(lless);
		methodVisitor.visitInsn(Opcodes.ICONST_0);
		methodVisitor.visitLabel(lout);
	}

	public void visit(InfEquals infEquals) {
		infEquals.getLeft().accept(this);
		infEquals.getRight().accept(this);
		methodVisitor.visitMethodInsn(Opcodes.INVOKEVIRTUAL, JAVA_MATH_BIG_DECIMAL,
				"compareTo", "(Ljava/math/BigDecimal;)I");
		Label lless = new Label();
		Label lout = new Label();
		methodVisitor.visitJumpInsn(Opcodes.IFLE, lless);
		methodVisitor.visitInsn(Opcodes.ICONST_1);
		methodVisitor.visitJumpInsn(Opcodes.GOTO, lout);
		methodVisitor.visitLabel(lless);
		methodVisitor.visitInsn(Opcodes.ICONST_0);
		methodVisitor.visitLabel(lout);
	}

	public void visit(SupEquals supEquals) {
		supEquals.getLeft().accept(this);
		supEquals.getRight().accept(this);
		methodVisitor.visitMethodInsn(Opcodes.INVOKEVIRTUAL, JAVA_MATH_BIG_DECIMAL,
				"compareTo", "(Ljava/math/BigDecimal;)I");
		Label lless = new Label();
		Label lout = new Label();
		methodVisitor.visitJumpInsn(Opcodes.IFGE, lless);
		methodVisitor.visitInsn(Opcodes.ICONST_1);
		methodVisitor.visitJumpInsn(Opcodes.GOTO, lout);
		methodVisitor.visitLabel(lless);
		methodVisitor.visitInsn(Opcodes.ICONST_0);
		methodVisitor.visitLabel(lout);

	}

	public void visit(Equals equals) {
		equals.getLeft().accept(this);
		equals.getRight().accept(this);
		methodVisitor.visitMethodInsn(Opcodes.INVOKEVIRTUAL, JAVA_MATH_BIG_DECIMAL,
				"compareTo", "(Ljava/math/BigDecimal;)I");
		Label lless = new Label();
		Label lout = new Label();
		methodVisitor.visitJumpInsn(Opcodes.IFEQ, lless);
		methodVisitor.visitInsn(Opcodes.ICONST_1);
		methodVisitor.visitJumpInsn(Opcodes.GOTO, lout);
		methodVisitor.visitLabel(lless);
		methodVisitor.visitInsn(Opcodes.ICONST_0);
		methodVisitor.visitLabel(lout);
	}

	public void visit(NotEquals notEquals) {
		notEquals.getLeft().accept(this);
		notEquals.getRight().accept(this);
		methodVisitor.visitMethodInsn(Opcodes.INVOKEVIRTUAL, JAVA_MATH_BIG_DECIMAL,
				"compareTo", "(Ljava/math/BigDecimal;)I");
		Label lless = new Label();
		Label lout = new Label();
		methodVisitor.visitJumpInsn(Opcodes.IFNE, lless);
		methodVisitor.visitInsn(Opcodes.ICONST_1);
		methodVisitor.visitJumpInsn(Opcodes.GOTO, lout);
		methodVisitor.visitLabel(lless);
		methodVisitor.visitInsn(Opcodes.ICONST_0);
		methodVisitor.visitLabel(lout);
	}

	public void visit(For For) {
		

	}

	public void visit(Foreach Foreach) {
		

	}

	public void visit(Forever forever) {
		

	}

	public void visit(Print print) {
		methodVisitor.visitFieldInsn(Opcodes.GETSTATIC, "java/lang/System", "out",
				"Ljava/io/PrintStream;");
		print.getExpr().accept(this);
		methodVisitor.visitMethodInsn(Opcodes.INVOKEVIRTUAL, "java/io/PrintStream",
				"print", "(Ljava/lang/Object;)V");

	}

	public void visit(Println println) {
		methodVisitor.visitFieldInsn(Opcodes.GETSTATIC, "java/lang/System", "out",
				"Ljava/io/PrintStream;");
		println.getExpr().accept(this);
		methodVisitor.visitMethodInsn(Opcodes.INVOKEVIRTUAL, "java/io/PrintStream",
				"println", "(Ljava/lang/Object;)V");

	}

	public void visit(Return Return) {
		

	}

	public void visit(Continue Continue) {
		

	}

	public void visit(Break Break) {

	}

	public void visit(Init initialization) {
		initialization.getExpr().accept(this);

		String var = initialization.getIdentifier().getValue();
		
		Var variable = null;
		try {
			variable = table.get(var);
			if (variable.getRegister() == -1) {
				variable.setRegister(currentRegister);
				currentRegister++;
			}

		}
		catch (UnknownSymbol us) {
			variable = new Var(var, (Expr) initialization.getExpr());
			variable.setRegister(currentRegister);
			table.push(var, variable);
			currentRegister++;

		}
		methodVisitor.visitVarInsn(Opcodes.ASTORE, variable.getRegister());

	}

	public void visit(Function function) {
		

	}

	public void visit(ParamsList params) {
		

	}

	public void visit(FunctionCall functionCall) {
		Function f = functions.get(functionCall.getIdentifier());
		Iterator<String> it = f.getParameters().typeIterator();
		StringBuilder sb = new StringBuilder();
		while (it.hasNext()) {
			sb.append(it.next());
			if (it.hasNext())
				sb.append(",");
		}
		methodVisitor.visitMethodInsn(Opcodes.INVOKESTATIC, className, functionCall
				.getIdentifier(), "(" + sb.toString() + ")V");

	}

	public void visit(ArgsList args) {

	}

	public SymbolTableImpl<Var> getTable() {
		return table;
	}
	
	

}
