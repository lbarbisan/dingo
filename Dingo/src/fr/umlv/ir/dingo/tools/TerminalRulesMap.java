package fr.umlv.ir.dingo.tools;

import fr.umlv.ir.dingo.lexer.RuleEnum;
import fr.umlv.ir.dingo.parser.TerminalEnum;
import fr.umlv.tatoo.runtime.parser.Parser;
import fr.umlv.tatoo.runtime.tools.DefaultLexerActivator;
import java.util.EnumMap;
import java.util.EnumSet;

public class TerminalRulesMap {
  public static EnumMap<TerminalEnum,EnumSet<RuleEnum>> getTerminalRulesMap() {
    EnumMap<TerminalEnum,EnumSet<RuleEnum>> map=new EnumMap<TerminalEnum,EnumSet<RuleEnum>>(TerminalEnum.class);
    map.put(TerminalEnum.l_brace,EnumSet.of(RuleEnum.l_brace));
    map.put(TerminalEnum.numeric_type,EnumSet.of(RuleEnum.numeric_type));
    map.put(TerminalEnum.modulo,EnumSet.of(RuleEnum.modulo));
    map.put(TerminalEnum._if,EnumSet.of(RuleEnum._if));
    map.put(TerminalEnum._foreach,EnumSet.of(RuleEnum._foreach));
    map.put(TerminalEnum._return,EnumSet.of(RuleEnum._return));
    map.put(TerminalEnum.numeric_identifier,EnumSet.of(RuleEnum.numeric_identifier));
    map.put(TerminalEnum.string_identifier,EnumSet.of(RuleEnum.string_identifier));
    map.put(TerminalEnum.rpar,EnumSet.of(RuleEnum.rpar));
    map.put(TerminalEnum.notEquals,EnumSet.of(RuleEnum.notEquals));
    map.put(TerminalEnum.semicolon,EnumSet.of(RuleEnum.semicolon));
    map.put(TerminalEnum.or,EnumSet.of(RuleEnum.or));
    map.put(TerminalEnum.inf,EnumSet.of(RuleEnum.inf));
    map.put(TerminalEnum.dot,EnumSet.of(RuleEnum.dot));
    map.put(TerminalEnum.object_type,EnumSet.of(RuleEnum.object_type));
    map.put(TerminalEnum._break,EnumSet.of(RuleEnum._break));
    map.put(TerminalEnum.print,EnumSet.of(RuleEnum.print));
    map.put(TerminalEnum.div,EnumSet.of(RuleEnum.div));
    map.put(TerminalEnum.string_type,EnumSet.of(RuleEnum.string_type));
    map.put(TerminalEnum.plus,EnumSet.of(RuleEnum.plus));
    map.put(TerminalEnum.dingo,EnumSet.of(RuleEnum.dingo));
    map.put(TerminalEnum._void,EnumSet.of(RuleEnum._void));
    map.put(TerminalEnum.minus,EnumSet.of(RuleEnum.minus));
    map.put(TerminalEnum.gui,EnumSet.of(RuleEnum.gui));
    map.put(TerminalEnum.stringValue,EnumSet.of(RuleEnum.stringValue));
    map.put(TerminalEnum.println,EnumSet.of(RuleEnum.println));
    map.put(TerminalEnum.comma,EnumSet.of(RuleEnum.comma));
    map.put(TerminalEnum.identifier,EnumSet.of(RuleEnum.identifier));
    map.put(TerminalEnum._in,EnumSet.of(RuleEnum._in));
    map.put(TerminalEnum._else,EnumSet.of(RuleEnum._else));
    map.put(TerminalEnum.sup,EnumSet.of(RuleEnum.sup));
    map.put(TerminalEnum.array_type,EnumSet.of(RuleEnum.array_type));
    map.put(TerminalEnum._var,EnumSet.of(RuleEnum._var));
    map.put(TerminalEnum.not,EnumSet.of(RuleEnum.not));
    map.put(TerminalEnum.lpar,EnumSet.of(RuleEnum.lpar));
    map.put(TerminalEnum.def,EnumSet.of(RuleEnum.def));
    map.put(TerminalEnum.forever,EnumSet.of(RuleEnum.forever));
    map.put(TerminalEnum.numberValue,EnumSet.of(RuleEnum.numberValue));
    map.put(TerminalEnum.and,EnumSet.of(RuleEnum.and));
    map.put(TerminalEnum._for,EnumSet.of(RuleEnum._for));
    map.put(TerminalEnum.star,EnumSet.of(RuleEnum.star));
    map.put(TerminalEnum._continue,EnumSet.of(RuleEnum._continue));
    map.put(TerminalEnum.function_type,EnumSet.of(RuleEnum.function_type));
    map.put(TerminalEnum.r_brace,EnumSet.of(RuleEnum.r_brace));
    map.put(TerminalEnum.equals,EnumSet.of(RuleEnum.equals));
    return map;
  }

  public static EnumSet<RuleEnum> getUnconditionalRules() {
    return EnumSet.of(RuleEnum.eoln,RuleEnum.comment,RuleEnum.space);
  }

  public static DefaultLexerActivator<RuleEnum,TerminalEnum> getActivator(Parser<TerminalEnum,?,?> parser) {
    return new DefaultLexerActivator<RuleEnum,TerminalEnum>(
      parser,getTerminalRulesMap(),getUnconditionalRules(),EnumSet.noneOf(RuleEnum.class));
  }
}
