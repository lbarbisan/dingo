package fr.umlv.ir.dingo.tools;

import fr.umlv.ir.dingo.parser.NonTerminalEnum;
import fr.umlv.ir.dingo.parser.ProductionEnum;
import fr.umlv.ir.dingo.parser.TerminalEnum;
import fr.umlv.ir.dingo.tools.GrammarEvaluator;
import fr.umlv.ir.dingo.tools.ToolsParserListener;
import fr.umlv.ir.dingo.tree.ArgsList;
import fr.umlv.ir.dingo.tree.BooleanExpr;
import fr.umlv.ir.dingo.tree.BooleanValue;
import fr.umlv.ir.dingo.tree.Expr;
import fr.umlv.ir.dingo.tree.ExprDefinition;
import fr.umlv.ir.dingo.tree.FunctionCall;
import fr.umlv.ir.dingo.tree.Identifier;
import fr.umlv.ir.dingo.tree.Init;
import fr.umlv.ir.dingo.tree.Instruction;
import fr.umlv.ir.dingo.tree.Instructions;
import fr.umlv.ir.dingo.tree.NumericExpr;
import fr.umlv.ir.dingo.tree.NumericValue;
import fr.umlv.ir.dingo.tree.Param;
import fr.umlv.ir.dingo.tree.ParamsList;
import fr.umlv.ir.dingo.tree.StringExpr;
import fr.umlv.tatoo.runtime.parser.ErrorRecoveryListener;
import fr.umlv.tatoo.runtime.parser.FatalErrorListener;
import fr.umlv.tatoo.runtime.parser.ParseException;
import fr.umlv.tatoo.runtime.parser.ParserListener;
import fr.umlv.tatoo.runtime.tools.AttributeHolder;
import fr.umlv.tatoo.runtime.tools.GenericStack;
import java.util.Set;

public class ToolsParserListener
  implements ParserListener<TerminalEnum,ProductionEnum>,
             FatalErrorListener<TerminalEnum>,
             ErrorRecoveryListener<TerminalEnum,NonTerminalEnum>{

  public ToolsParserListener(GrammarEvaluator attributeEvaluator) {
   this.attributeEvaluator=attributeEvaluator;
}

  public void shift(TerminalEnum terminal) {
     switch(terminal) {
      case __eof__:
        return;
      case plus:
        return;
      case star:
        return;
      case div:
        return;
      case modulo:
        return;
      case minus:
        return;
      case equals:
        return;
      case notEquals:
        return;
      case sup:
        return;
      case inf:
        return;
      case sup_equals:
        return;
      case inf_equals:
        return;
      case l_shift:
        return;
      case r_shift:
        return;
      case not:
        return;
      case and:
        return;
      case or:
        return;
      case semicolon:
        return;
      case lpar:
        return;
      case rpar:
        return;
      case l_brace:
        return;
      case r_brace:
        return;
      case dot:
        return;
      case comma:
        return;
      case dingo:
        return;
      case def:
        return;
      case _if:
        return;
      case _else:
        return;
      case _for:
        return;
      case _foreach:
        return;
      case _in:
        return;
      case forever:
        return;
      case _break:
        return;
      case _continue:
        return;
      case print:
        return;
      case println:
        return;
      case gui:
        return;
      case _return:
        return;
      case _void:
        return;
      case _var:
        return;
      case numberValue:
        stack.push_Object(holder.get_Object());
        return;
      case stringValue:
        stack.push_Object(holder.get_Object());
        return;
      case booleanValue:
        stack.push_Object(holder.get_Object());
        return;
      case string_type:
        return;
      case numeric_type:
        return;
      case array_type:
        return;
      case function_type:
        return;
      case object_type:
        return;
      case error:
        return;
      case identifier:
        stack.push_Object(holder.get_Object());
        return;
    }
    throw new AssertionError("unknown terminal "+terminal);
  }

  public void reduce(ProductionEnum production) {
    switch(production) {
      case dingo_start: {
          Instructions arg1=(Instructions)stack.pop_Object();
          Identifier arg2=(Identifier)stack.pop_Object();
          attributeEvaluator.dingo_start(arg2,arg1);
          return;
      }
      case empty_instructions_def: {
          stack.push_Object(attributeEvaluator.empty_instructions_def());
          return;
      }
      case full_instructions_def: {
          Instruction arg1=(Instruction)stack.pop_Object();
          Instructions arg2=(Instructions)stack.pop_Object();
          stack.push_Object(attributeEvaluator.full_instructions_def(arg2,arg1));
          return;
      }
      case instruction_expr_def: {
          ExprDefinition arg1=(ExprDefinition)stack.pop_Object();
          stack.push_Object(attributeEvaluator.instruction_expr_def(arg1));
          return;
      }
      case full_var_keyword: {
          attributeEvaluator.full_var_keyword();
          return;
      }
      case empty_var_keyword: {
          attributeEvaluator.empty_var_keyword();
          return;
      }
      case empty_type_expr_def: {
          Identifier arg1=(Identifier)stack.pop_Object();
          stack.push_Object(attributeEvaluator.empty_type_expr_def(arg1));
          return;
      }
      case full_type_expr_def: {
          Identifier arg1=(Identifier)stack.pop_Object();
          String arg2=(String)stack.pop_Object();
          stack.push_Object(attributeEvaluator.full_type_expr_def(arg2,arg1));
          return;
      }
      case init_def: {
          Init arg1=(Init)stack.pop_Object();
          stack.push_Object(attributeEvaluator.init_def(arg1));
          return;
      }
      case full_type_init_identifier_def: {
          Expr arg1=(Expr)stack.pop_Object();
          Identifier arg2=(Identifier)stack.pop_Object();
          String arg3=(String)stack.pop_Object();
          stack.push_Object(attributeEvaluator.full_type_init_identifier_def(arg3,arg2,arg1));
          return;
      }
      case empty_type_init_identifier_def: {
          Expr arg1=(Expr)stack.pop_Object();
          Identifier arg2=(Identifier)stack.pop_Object();
          stack.push_Object(attributeEvaluator.empty_type_init_identifier_def(arg2,arg1));
          return;
      }
      case function_definition: {
          Instructions arg1=(Instructions)stack.pop_Object();
          ParamsList arg2=(ParamsList)stack.pop_Object();
          Identifier arg3=(Identifier)stack.pop_Object();
          String arg4=(String)stack.pop_Object();
          stack.push_Object(attributeEvaluator.function_definition(arg4,arg3,arg2,arg1));
          return;
      }
      case string_value_def: {
          String arg1=(String)stack.pop_Object();
          stack.push_Object(attributeEvaluator.string_value_def(arg1));
          return;
      }
      case number_value_def: {
          NumericValue arg1=(NumericValue)stack.pop_Object();
          stack.push_Object(attributeEvaluator.number_value_def(arg1));
          return;
      }
      case if_def: {
          Instructions arg1=(Instructions)stack.pop_Object();
          BooleanExpr arg2=(BooleanExpr)stack.pop_Object();
          stack.push_Object(attributeEvaluator.if_def(arg2,arg1));
          return;
      }
      case empty_else_bloc: {
          attributeEvaluator.empty_else_bloc();
          return;
      }
      case full_else_bloc: {
          Instructions arg1=(Instructions)stack.pop_Object();
          attributeEvaluator.full_else_bloc(arg1);
          return;
      }
      case and_def: {
          BooleanExpr arg1=(BooleanExpr)stack.pop_Object();
          BooleanExpr arg2=(BooleanExpr)stack.pop_Object();
          stack.push_Object(attributeEvaluator.and_def(arg2,arg1));
          return;
      }
      case or_def: {
          BooleanExpr arg1=(BooleanExpr)stack.pop_Object();
          BooleanExpr arg2=(BooleanExpr)stack.pop_Object();
          stack.push_Object(attributeEvaluator.or_def(arg2,arg1));
          return;
      }
      case equals_def: {
          Expr arg1=(Expr)stack.pop_Object();
          Expr arg2=(Expr)stack.pop_Object();
          stack.push_Object(attributeEvaluator.equals_def(arg2,arg1));
          return;
      }
      case not_equals_def: {
          Expr arg1=(Expr)stack.pop_Object();
          Expr arg2=(Expr)stack.pop_Object();
          stack.push_Object(attributeEvaluator.not_equals_def(arg2,arg1));
          return;
      }
      case not_def: {
          BooleanExpr arg1=(BooleanExpr)stack.pop_Object();
          stack.push_Object(attributeEvaluator.not_def(arg1));
          return;
      }
      case sup_def: {
          Expr arg1=(Expr)stack.pop_Object();
          Expr arg2=(Expr)stack.pop_Object();
          stack.push_Object(attributeEvaluator.sup_def(arg2,arg1));
          return;
      }
      case inf_def: {
          Expr arg1=(Expr)stack.pop_Object();
          Expr arg2=(Expr)stack.pop_Object();
          stack.push_Object(attributeEvaluator.inf_def(arg2,arg1));
          return;
      }
      case inf_equals_def: {
          Expr arg1=(Expr)stack.pop_Object();
          Expr arg2=(Expr)stack.pop_Object();
          stack.push_Object(attributeEvaluator.inf_equals_def(arg2,arg1));
          return;
      }
      case sup_equals_def: {
          Expr arg1=(Expr)stack.pop_Object();
          Expr arg2=(Expr)stack.pop_Object();
          stack.push_Object(attributeEvaluator.sup_equals_def(arg2,arg1));
          return;
      }
      case booleanValue_def: {
          BooleanValue arg1=(BooleanValue)stack.pop_Object();
          stack.push_Object(attributeEvaluator.booleanValue_def(arg1));
          return;
      }
      case for_def: {
          Instructions arg1=(Instructions)stack.pop_Object();
          Init arg2=(Init)stack.pop_Object();
          BooleanExpr arg3=(BooleanExpr)stack.pop_Object();
          Init arg4=(Init)stack.pop_Object();
          stack.push_Object(attributeEvaluator.for_def(arg4,arg3,arg2,arg1));
          return;
      }
      case foreach_def: {
          Instructions arg1=(Instructions)stack.pop_Object();
          Identifier arg2=(Identifier)stack.pop_Object();
          Identifier arg3=(Identifier)stack.pop_Object();
          stack.push_Object(attributeEvaluator.foreach_def(arg3,arg2,arg1));
          return;
      }
      case forever_def: {
          Instructions arg1=(Instructions)stack.pop_Object();
          stack.push_Object(attributeEvaluator.forever_def(arg1));
          return;
      }
      case print_def: {
          Expr arg1=(Expr)stack.pop_Object();
          stack.push_Object(attributeEvaluator.print_def(arg1));
          return;
      }
      case println_def: {
          Expr arg1=(Expr)stack.pop_Object();
          stack.push_Object(attributeEvaluator.println_def(arg1));
          return;
      }
      case return_def: {
          Expr arg1=(Expr)stack.pop_Object();
          stack.push_Object(attributeEvaluator.return_def(arg1));
          return;
      }
      case break_def: {
          stack.push_Object(attributeEvaluator.break_def());
          return;
      }
      case continue_def: {
          stack.push_Object(attributeEvaluator.continue_def());
          return;
      }
      case one_param_list_def: {
          Param arg1=(Param)stack.pop_Object();
          stack.push_Object(attributeEvaluator.one_param_list_def(arg1));
          return;
      }
      case params_list_def: {
          ParamsList arg1=(ParamsList)stack.pop_Object();
          Param arg2=(Param)stack.pop_Object();
          stack.push_Object(attributeEvaluator.params_list_def(arg2,arg1));
          return;
      }
      case empty_params_list_def: {
          stack.push_Object(attributeEvaluator.empty_params_list_def());
          return;
      }
      case param_def: {
          Identifier arg1=(Identifier)stack.pop_Object();
          String arg2=(String)stack.pop_Object();
          stack.push_Object(attributeEvaluator.param_def(arg2,arg1));
          return;
      }
      case object_type_def: {
          stack.push_Object(attributeEvaluator.object_type_def());
          return;
      }
      case numeric_type_def: {
          stack.push_Object(attributeEvaluator.numeric_type_def());
          return;
      }
      case string_type_def: {
          stack.push_Object(attributeEvaluator.string_type_def());
          return;
      }
      case void_type_def: {
          stack.push_Object(attributeEvaluator.void_type_def());
          return;
      }
      case array_type_def: {
          String arg1=(String)stack.pop_Object();
          stack.push_Object(attributeEvaluator.array_type_def(arg1));
          return;
      }
      case function_type_def: {
          stack.push_Object(attributeEvaluator.function_type_def());
          return;
      }
      case function_call_def: {
          ArgsList arg1=(ArgsList)stack.pop_Object();
          Identifier arg2=(Identifier)stack.pop_Object();
          stack.push_Object(attributeEvaluator.function_call_def(arg2,arg1));
          return;
      }
      case one_arg_list_def: {
          Expr arg1=(Expr)stack.pop_Object();
          stack.push_Object(attributeEvaluator.one_arg_list_def(arg1));
          return;
      }
      case args_list_def: {
          ArgsList arg1=(ArgsList)stack.pop_Object();
          Expr arg2=(Expr)stack.pop_Object();
          stack.push_Object(attributeEvaluator.args_list_def(arg2,arg1));
          return;
      }
      case empty_args_list_def: {
          stack.push_Object(attributeEvaluator.empty_args_list_def());
          return;
      }
      case arg_def: {
          Expr arg1=(Expr)stack.pop_Object();
          stack.push_Object(attributeEvaluator.arg_def(arg1));
          return;
      }
      case plus_def: {
          Expr arg1=(Expr)stack.pop_Object();
          Expr arg2=(Expr)stack.pop_Object();
          stack.push_Object(attributeEvaluator.plus_def(arg2,arg1));
          return;
      }
      case minus_def: {
          Expr arg1=(Expr)stack.pop_Object();
          Expr arg2=(Expr)stack.pop_Object();
          stack.push_Object(attributeEvaluator.minus_def(arg2,arg1));
          return;
      }
      case star_def: {
          Expr arg1=(Expr)stack.pop_Object();
          Expr arg2=(Expr)stack.pop_Object();
          stack.push_Object(attributeEvaluator.star_def(arg2,arg1));
          return;
      }
      case divide_def: {
          Expr arg1=(Expr)stack.pop_Object();
          Expr arg2=(Expr)stack.pop_Object();
          stack.push_Object(attributeEvaluator.divide_def(arg2,arg1));
          return;
      }
      case modulo_def: {
          Expr arg1=(Expr)stack.pop_Object();
          Expr arg2=(Expr)stack.pop_Object();
          stack.push_Object(attributeEvaluator.modulo_def(arg2,arg1));
          return;
      }
      case identifier_expr_def: {
          Identifier arg1=(Identifier)stack.pop_Object();
          stack.push_Object(attributeEvaluator.identifier_expr_def(arg1));
          return;
      }
      case numeric_expr_def: {
          NumericExpr arg1=(NumericExpr)stack.pop_Object();
          stack.push_Object(attributeEvaluator.numeric_expr_def(arg1));
          return;
      }
      case string_expr_def: {
          StringExpr arg1=(StringExpr)stack.pop_Object();
          stack.push_Object(attributeEvaluator.string_expr_def(arg1));
          return;
      }
      case function_call_expr_def: {
          FunctionCall arg1=(FunctionCall)stack.pop_Object();
          stack.push_Object(attributeEvaluator.function_call_expr_def(arg1));
          return;
      }
    }
    throw new AssertionError("unknown production "+production);
  }

  public void accept() {
    // youpi youpi
  }

  public void fatalError(String message, TerminalEnum terminal, Set<? extends TerminalEnum> lookahead) {
    throw new ParseException(message,terminal,lookahead);
  }

  public void popTerminalOnError(TerminalEnum terminal) {
    switch(terminal) {
      case __eof__:
        return;
      case plus:
        return;
      case star:
        return;
      case div:
        return;
      case modulo:
        return;
      case minus:
        return;
      case equals:
        return;
      case notEquals:
        return;
      case sup:
        return;
      case inf:
        return;
      case sup_equals:
        return;
      case inf_equals:
        return;
      case l_shift:
        return;
      case r_shift:
        return;
      case not:
        return;
      case and:
        return;
      case or:
        return;
      case semicolon:
        return;
      case lpar:
        return;
      case rpar:
        return;
      case l_brace:
        return;
      case r_brace:
        return;
      case dot:
        return;
      case comma:
        return;
      case dingo:
        return;
      case def:
        return;
      case _if:
        return;
      case _else:
        return;
      case _for:
        return;
      case _foreach:
        return;
      case _in:
        return;
      case forever:
        return;
      case _break:
        return;
      case _continue:
        return;
      case print:
        return;
      case println:
        return;
      case gui:
        return;
      case _return:
        return;
      case _void:
        return;
      case _var:
        return;
      case numberValue:
        stack.pop_Object();
        return;
      case stringValue:
        stack.pop_Object();
        return;
      case booleanValue:
        stack.pop_Object();
        return;
      case string_type:
        return;
      case numeric_type:
        return;
      case array_type:
        return;
      case function_type:
        return;
      case object_type:
        return;
      case error:
        return;
      case identifier:
        stack.pop_Object();
        return;
    }
    throw new AssertionError("unknown terminal "+terminal);
  }

  public void popNonTerminalOnError(NonTerminalEnum nonterminal) {
    switch(nonterminal) {
      case start:
        return;
      case instructions:
        stack.pop_Object();
        return;
      case instruction:
        stack.pop_Object();
        return;
      case expr_def:
        stack.pop_Object();
        return;
      case var:
        return;
      case type:
        stack.pop_Object();
        return;
      case init:
        stack.pop_Object();
        return;
      case expr:
        stack.pop_Object();
        return;
      case params_list:
        stack.pop_Object();
        return;
      case string_expr:
        stack.pop_Object();
        return;
      case numeric_expr:
        stack.pop_Object();
        return;
      case booleanExpr:
        stack.pop_Object();
        return;
      case else_bloc:
        return;
      case param:
        stack.pop_Object();
        return;
      case function_call:
        stack.pop_Object();
        return;
      case args_list:
        stack.pop_Object();
        return;
      case arg:
        stack.pop_Object();
        return;
    }
    throw new AssertionError("unknown nonterminal "+nonterminal);
  }

  public AttributeHolder getAttributeHolder() {
    return holder;
  }

  private final AttributeHolder holder=new AttributeHolder();
  private final GrammarEvaluator attributeEvaluator;
  private final GenericStack stack=new GenericStack(20);
}
