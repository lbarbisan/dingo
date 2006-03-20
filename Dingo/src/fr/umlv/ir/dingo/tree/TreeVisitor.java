package fr.umlv.ir.dingo.tree;



public interface TreeVisitor {
	public void visit(Var variable);
	public void visit(Identifier ident);
	public void visit(ExprEval exprEval);
	public void visit(StringValue stringValue);
	public void visit(NumericValue numericValue);
	public void visit(BooleanValue booleanValue);
	public void visit(Plus plus);
	public void visit(Minus minus);
	public void visit(Star star);
	public void visit(Div divide);
	public void visit(Modulo modulo);
	public void visit(And and);
	public void visit(Or or);
	public void visit(Not not);
	public void visit(Sup superior);
	public void visit(Inf inferior);
	public void visit(InfEquals inferiorEquals);
	public void visit(SupEquals superiorEquals);
	public void visit(Equals equals);
	public void visit(NotEquals notEquals);
	public void visit(If If);
	public void visit(For For);
	public void visit(Foreach foreach);
	public void visit(Forever forever);
	public void visit(Print print);
	public void visit(Println println);
	public void visit(Return Return);
	public void visit(Continue Continue);
	public void visit(Break Break);
	public void visit(Init initialization);
	public void visit(Function function);
	public void visit(ParamsList params);
	public void visit(FunctionCall functionCall);
	public void visit(ArgsList args);
}
