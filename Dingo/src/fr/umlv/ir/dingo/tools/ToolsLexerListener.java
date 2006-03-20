package fr.umlv.ir.dingo.tools;

import fr.umlv.ir.dingo.lexer.RuleEnum;
import fr.umlv.ir.dingo.parser.TerminalEnum;
import fr.umlv.ir.dingo.tools.TerminalAttributeEvaluator;
import fr.umlv.ir.dingo.tools.ToolsLexerListener;
import fr.umlv.tatoo.runtime.buffer.impl.TokenBuffer;
import fr.umlv.tatoo.runtime.parser.Parser;
import fr.umlv.tatoo.runtime.tools.AbstractLexerListener;
import fr.umlv.tatoo.runtime.tools.AttributeHolder;

public class ToolsLexerListener extends AbstractLexerListener<RuleEnum,TokenBuffer> {
  public ToolsLexerListener(Parser<? super TerminalEnum,?,?> parser,
    AttributeHolder holder,TerminalAttributeEvaluator attributeEvaluator) {

    this.parser=parser;
    this.holder=holder;
    this.attributeEvaluator=attributeEvaluator;
  }

  @Override
  public BufferOperation ruleVerified(RuleEnum rule, CharSequence seq) {
    switch(rule) {
      case space:
        attributeEvaluator.space(seq);
        return BufferOperation.DISCARD;
      case comment:
        attributeEvaluator.comment(seq);
        return BufferOperation.DISCARD;
      case numberValue:
        holder.set_Object(attributeEvaluator.numberValue(seq));
        parser.step(TerminalEnum.numberValue);
        return BufferOperation.DISCARD;
      case stringValue:
        holder.set_Object(attributeEvaluator.stringValue(seq));
        parser.step(TerminalEnum.stringValue);
        return BufferOperation.DISCARD;
      case string_type:
        attributeEvaluator.string_type(seq);
        parser.step(TerminalEnum.string_type);
        return BufferOperation.DISCARD;
      case numeric_type:
        attributeEvaluator.numeric_type(seq);
        parser.step(TerminalEnum.numeric_type);
        return BufferOperation.DISCARD;
      case function_type:
        attributeEvaluator.function_type(seq);
        parser.step(TerminalEnum.function_type);
        return BufferOperation.DISCARD;
      case object_type:
        attributeEvaluator.object_type(seq);
        parser.step(TerminalEnum.object_type);
        return BufferOperation.DISCARD;
      case array_type:
        attributeEvaluator.array_type(seq);
        parser.step(TerminalEnum.array_type);
        return BufferOperation.DISCARD;
      case identifier:
        holder.set_Object(attributeEvaluator.identifier(seq));
        parser.step(TerminalEnum.identifier);
        return BufferOperation.DISCARD;
      case numeric_identifier:
        attributeEvaluator.numeric_identifier(seq);
        parser.step(TerminalEnum.numeric_identifier);
        return BufferOperation.DISCARD;
      case string_identifier:
        attributeEvaluator.string_identifier(seq);
        parser.step(TerminalEnum.string_identifier);
        return BufferOperation.DISCARD;
      case plus:
        attributeEvaluator.plus(seq);
        parser.step(TerminalEnum.plus);
        return BufferOperation.DISCARD;
      case minus:
        attributeEvaluator.minus(seq);
        parser.step(TerminalEnum.minus);
        return BufferOperation.DISCARD;
      case star:
        attributeEvaluator.star(seq);
        parser.step(TerminalEnum.star);
        return BufferOperation.DISCARD;
      case div:
        attributeEvaluator.div(seq);
        parser.step(TerminalEnum.div);
        return BufferOperation.DISCARD;
      case equals:
        attributeEvaluator.equals(seq);
        parser.step(TerminalEnum.equals);
        return BufferOperation.DISCARD;
      case notEquals:
        attributeEvaluator.notEquals(seq);
        parser.step(TerminalEnum.notEquals);
        return BufferOperation.DISCARD;
      case sup:
        attributeEvaluator.sup(seq);
        parser.step(TerminalEnum.sup);
        return BufferOperation.DISCARD;
      case inf:
        attributeEvaluator.inf(seq);
        parser.step(TerminalEnum.inf);
        return BufferOperation.DISCARD;
      case l_shift:
        attributeEvaluator.l_shift(seq);
        return BufferOperation.DISCARD;
      case r_shift:
        attributeEvaluator.r_shift(seq);
        return BufferOperation.DISCARD;
      case modulo:
        attributeEvaluator.modulo(seq);
        parser.step(TerminalEnum.modulo);
        return BufferOperation.DISCARD;
      case not:
        attributeEvaluator.not(seq);
        parser.step(TerminalEnum.not);
        return BufferOperation.DISCARD;
      case and:
        attributeEvaluator.and(seq);
        parser.step(TerminalEnum.and);
        return BufferOperation.DISCARD;
      case or:
        attributeEvaluator.or(seq);
        parser.step(TerminalEnum.or);
        return BufferOperation.DISCARD;
      case semicolon:
        attributeEvaluator.semicolon(seq);
        parser.step(TerminalEnum.semicolon);
        return BufferOperation.DISCARD;
      case lpar:
        attributeEvaluator.lpar(seq);
        parser.step(TerminalEnum.lpar);
        return BufferOperation.DISCARD;
      case rpar:
        attributeEvaluator.rpar(seq);
        parser.step(TerminalEnum.rpar);
        return BufferOperation.DISCARD;
      case l_brace:
        attributeEvaluator.l_brace(seq);
        parser.step(TerminalEnum.l_brace);
        return BufferOperation.DISCARD;
      case r_brace:
        attributeEvaluator.r_brace(seq);
        parser.step(TerminalEnum.r_brace);
        return BufferOperation.DISCARD;
      case dot:
        attributeEvaluator.dot(seq);
        parser.step(TerminalEnum.dot);
        return BufferOperation.DISCARD;
      case comma:
        attributeEvaluator.comma(seq);
        parser.step(TerminalEnum.comma);
        return BufferOperation.DISCARD;
      case eoln:
        attributeEvaluator.eoln(seq);
        return BufferOperation.DISCARD;
      case dingo:
        attributeEvaluator.dingo(seq);
        parser.step(TerminalEnum.dingo);
        return BufferOperation.DISCARD;
      case args:
        attributeEvaluator.args(seq);
        return BufferOperation.DISCARD;
      case def:
        attributeEvaluator.def(seq);
        parser.step(TerminalEnum.def);
        return BufferOperation.DISCARD;
      case _var:
        attributeEvaluator._var(seq);
        parser.step(TerminalEnum._var);
        return BufferOperation.DISCARD;
      case _return:
        attributeEvaluator._return(seq);
        parser.step(TerminalEnum._return);
        return BufferOperation.DISCARD;
      case _if:
        attributeEvaluator._if(seq);
        parser.step(TerminalEnum._if);
        return BufferOperation.DISCARD;
      case _else:
        attributeEvaluator._else(seq);
        parser.step(TerminalEnum._else);
        return BufferOperation.DISCARD;
      case _for:
        attributeEvaluator._for(seq);
        parser.step(TerminalEnum._for);
        return BufferOperation.DISCARD;
      case _foreach:
        attributeEvaluator._foreach(seq);
        parser.step(TerminalEnum._foreach);
        return BufferOperation.DISCARD;
      case _in:
        attributeEvaluator._in(seq);
        parser.step(TerminalEnum._in);
        return BufferOperation.DISCARD;
      case forever:
        attributeEvaluator.forever(seq);
        parser.step(TerminalEnum.forever);
        return BufferOperation.DISCARD;
      case _break:
        attributeEvaluator._break(seq);
        parser.step(TerminalEnum._break);
        return BufferOperation.DISCARD;
      case _continue:
        attributeEvaluator._continue(seq);
        parser.step(TerminalEnum._continue);
        return BufferOperation.DISCARD;
      case print:
        attributeEvaluator.print(seq);
        parser.step(TerminalEnum.print);
        return BufferOperation.DISCARD;
      case println:
        attributeEvaluator.println(seq);
        parser.step(TerminalEnum.println);
        return BufferOperation.DISCARD;
      case _null:
        attributeEvaluator._null(seq);
        return BufferOperation.DISCARD;
      case gui:
        attributeEvaluator.gui(seq);
        parser.step(TerminalEnum.gui);
        return BufferOperation.DISCARD;
      case _void:
        attributeEvaluator._void(seq);
        parser.step(TerminalEnum._void);
        return BufferOperation.DISCARD;
    }
    throw new AssertionError("unknown rule "+rule);
  }

  private final AttributeHolder holder;
  private final TerminalAttributeEvaluator attributeEvaluator;
  private final Parser<? super TerminalEnum,?,?> parser;
}
