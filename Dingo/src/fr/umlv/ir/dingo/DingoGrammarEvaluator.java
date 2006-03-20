package fr.umlv.ir.dingo;

import java.math.BigDecimal;

import fr.umlv.ir.dingo.tools.GrammarEvaluator;
import fr.umlv.ir.dingo.tree.And;
import fr.umlv.ir.dingo.tree.ArgsList;
import fr.umlv.ir.dingo.tree.BooleanExpr;
import fr.umlv.ir.dingo.tree.BooleanValue;
import fr.umlv.ir.dingo.tree.Break;
import fr.umlv.ir.dingo.tree.Continue;
import fr.umlv.ir.dingo.tree.Div;
import fr.umlv.ir.dingo.tree.Equals;
import fr.umlv.ir.dingo.tree.Expr;
import fr.umlv.ir.dingo.tree.ExprDefinition;
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
import fr.umlv.ir.dingo.tree.Instruction;
import fr.umlv.ir.dingo.tree.Instructions;
import fr.umlv.ir.dingo.tree.Minus;
import fr.umlv.ir.dingo.tree.Modulo;
import fr.umlv.ir.dingo.tree.Not;
import fr.umlv.ir.dingo.tree.NotEquals;
import fr.umlv.ir.dingo.tree.NumericExpr;
import fr.umlv.ir.dingo.tree.NumericIdentifier;
import fr.umlv.ir.dingo.tree.NumericValue;
import fr.umlv.ir.dingo.tree.Or;
import fr.umlv.ir.dingo.tree.Param;
import fr.umlv.ir.dingo.tree.ParamsList;
import fr.umlv.ir.dingo.tree.Plus;
import fr.umlv.ir.dingo.tree.Print;
import fr.umlv.ir.dingo.tree.Println;
import fr.umlv.ir.dingo.tree.Return;
import fr.umlv.ir.dingo.tree.Star;
import fr.umlv.ir.dingo.tree.StringExpr;
import fr.umlv.ir.dingo.tree.StringIdentifier;
import fr.umlv.ir.dingo.tree.StringValue;
import fr.umlv.ir.dingo.tree.Sup;
import fr.umlv.ir.dingo.tree.SupEquals;
import fr.umlv.ir.dingo.tree.Var;

public class DingoGrammarEvaluator implements GrammarEvaluator {

	private Instructions allInstructions;
	
	public final Instructions getAllInstructions() {
		return allInstructions;
	}
	
	public void dingo_start(Identifier identifier, Instructions instructions) {
		this.allInstructions = instructions;
	}

	public Instructions empty_instructions_def() {
		return new Instructions();
	}

	public Instructions full_instructions_def(Instructions instructions, Instruction instruction) {
		return instructions.add(instruction);
	}

	public Instruction instruction_expr_def(ExprDefinition expr_def) {
		return expr_def;
	}

	public void full_var_keyword() {
		
	}

	public void empty_var_keyword() {
		
	}

	public ExprDefinition empty_type_expr_def(Identifier identifier) {
		return new Var(identifier.getValue());
	}

	public ExprDefinition full_type_expr_def(String type, Identifier identifier) {
		return new Var(type,identifier.getValue());
	}

	public ExprDefinition init_def(Init init) {
		return init;
	}

	public Init full_type_init_identifier_def(String type, Identifier identifier, Expr expr) {
		return new Init(type,identifier,expr);
	}

	public Init empty_type_init_identifier_def(Identifier identifier, Expr expr) {
		return new Init(identifier,expr);
	}

	public Expr numeric_expr_def(NumericExpr numeric_expr) {
		return numeric_expr;
	}

	public Expr string_expr_def(StringExpr string_expr) {
		return string_expr;
	}

	public Expr function_call_expr_def(FunctionCall function_call) {
		return function_call;
	}

	public NumericExpr identifier_numeric_def() {
		// TODO A SUPPRIME
		return new NumericValue(new BigDecimal(0));
	}

	public StringExpr identifier_string_def() {
		// TODO A SUPPRIME
		return new StringValue("");
	}

	public StringExpr string_value_def(String stringValue) {
		return new StringValue(stringValue);
	}

	public StringExpr concat_def(StringExpr string_expr, StringExpr string_expr2) {
		//return new Plus(string_expr,string_expr2);
		return null;
	}

	public Expr plus_def(Expr numeric_expr, Expr numeric_expr2) {
		return new Plus(numeric_expr, numeric_expr2);
	}

	public Expr minus_def(Expr numeric_expr, Expr numeric_expr2) {
		return new Minus(numeric_expr, numeric_expr2);
	}

	public Expr star_def(Expr numeric_expr, Expr numeric_expr2) {
		return new Star(numeric_expr, numeric_expr2);
	}

	public Expr divide_def(Expr numeric_expr, Expr numeric_expr2) {
		return new Div(numeric_expr, numeric_expr2);
	}

	public Expr modulo_def(Expr numeric_expr, Expr numeric_expr2) {
		return new Modulo(numeric_expr, numeric_expr2);
	}

	public NumericExpr number_value_def(NumericValue numberValue) {
		return numberValue;
	}

	public Instruction if_def(BooleanExpr booleanExpr, Instructions instructions) {
		return new If(booleanExpr,instructions); //TODO Gestion du bloc else
	}

	public void empty_else_bloc() {
		// TODO Auto-generated method stub
		
	}

	public void full_else_bloc(Instructions instructions) {
		//TODO CREER LE BLOC ELSE
	}

	public BooleanExpr and_def(BooleanExpr booleanExpr, BooleanExpr booleanExpr2) {
		return new And(booleanExpr, booleanExpr2);
	}

	public BooleanExpr or_def(BooleanExpr booleanExpr, BooleanExpr booleanExpr2) {
		return new Or(booleanExpr, booleanExpr2);
	}

	public BooleanExpr equals_def(Expr numeric_expr, Expr numeric_expr2) {
		return new Equals(numeric_expr, numeric_expr2); //TODO A CHANGER
	}

	public BooleanExpr not_equals_def(Expr numeric_expr, Expr numeric_expr2) {
		return new NotEquals(numeric_expr, numeric_expr2); //TODO A CHANGER
	}

	public BooleanExpr not_def(BooleanExpr booleanExpr) {
		return new Not(booleanExpr);
	}

	public BooleanExpr sup_def(Expr numeric_expr, Expr numeric_expr2) {
		return new Sup(numeric_expr, numeric_expr2);
	}

	public BooleanExpr inf_def(Expr numeric_expr, Expr numeric_expr2) {
		return new Inf(numeric_expr, numeric_expr2);
	}

	public BooleanExpr inf_equals_def(Expr numeric_expr, Expr numeric_expr2) {
		return new InfEquals(numeric_expr, numeric_expr2);
	}

	public BooleanExpr sup_equals_def(Expr numeric_expr, Expr numeric_expr2) {
		return new SupEquals(numeric_expr, numeric_expr2);
	}

	public BooleanExpr booleanValue_def(BooleanValue booleanValue) {
		return booleanValue;
	}

	public Instruction for_def(Init init, BooleanExpr booleanExpr, Init increment, Instructions instructions) {
		return new For(init, booleanExpr, increment, instructions);
	}

	public Instruction foreach_def(Identifier identifier, Identifier identifiersList, Instructions instructions) {
		return new Foreach(new Var(identifier.getValue()),
				new Var(identifiersList.getValue()), instructions);
	}

	public Instruction forever_def(Instructions instructions) {
		return new Forever(instructions);
	}

	public Instruction print_def(Expr expr) {
		return new Print(expr);
	}

	public Instruction println_def(Expr expr) {
		return new Println(expr);
	}

	public Instruction return_def(Expr expr) {
		return new Return(expr);
	}

	public Instruction break_def() {
		return new Break();
	}

	public Instruction continue_def() {
		return new Continue();
	}

	public Instruction function_definition(String type, Identifier identifier, ParamsList params_list, Instructions instructions) {
		return new Function(type, identifier.getValue(), params_list, instructions);
	}

	public Param param_def(String type, Identifier identifier) {
		return new Param(type, identifier.getValue());
	}

	public String object_type_def() {
		return null;
	}

	public String numeric_type_def() {
		return "java/math/BigDecimal";
	}

	public String string_type_def() {
		return "java/lang/String";
	}

	public String void_type_def() {
		return "void";
	}

	public String array_type_def(String type) {
		// TODO Auto-generated method stub
		return null;
	}

	public String function_type_def() {
		// TODO Auto-generated method stub
		return null;
	}

	public FunctionCall function_call_def(Identifier identifier,ArgsList args_list) {
		return new FunctionCall(identifier.getValue(),args_list);
	}

	public Expr arg_def(Expr expr) {
		return expr;
	}

	public ParamsList one_param_list_def(Param param) {
		return new ParamsList(param.getIdentifier(), param.getType());
	}

	public ParamsList params_list_def(Param param, ParamsList params_list) {
		if(params_list != null)
			return params_list.add(param.getIdentifier(), param.getType());
		else
			return params_list; //TODO CHECK FOR ERROR IF NO PARAM AFTER COMMA
	}

	public ParamsList empty_params_list_def() {
		return null; //TODO CHECK
	}

	public ArgsList one_arg_list_def(Expr arg) {
		return new ArgsList(arg);
	}

	public ArgsList args_list_def(Expr arg, ArgsList args_list) {
		if(args_list != null)
			return args_list.add(arg);
		else
			return args_list; //TODO CHECK FOR ERROR IF NO PARAM AFTER COMMA
	}

	public ArgsList empty_args_list_def() {
		return null; //TODO CHECK
	}

	public Expr identifier_expr_def(Identifier identifier) {
		return identifier;
	}

	public Expr identifier_numeric_def(Identifier numeric_identifier) {
		return new NumericIdentifier(numeric_identifier.getValue()) ;
	}

	public StringExpr identifier_string_def(Identifier string_identifier) {
		return new StringIdentifier(string_identifier.getValue()) ;
	}

}
