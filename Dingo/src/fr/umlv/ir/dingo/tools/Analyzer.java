package fr.umlv.ir.dingo.tools;

import fr.umlv.ir.dingo.lexer.LexerDataTable;
import fr.umlv.ir.dingo.lexer.RuleEnum;
import fr.umlv.ir.dingo.parser.NonTerminalEnum;
import fr.umlv.ir.dingo.parser.ParserDataTable;
import fr.umlv.ir.dingo.parser.ProductionEnum;
import fr.umlv.ir.dingo.parser.TerminalEnum;
import fr.umlv.ir.dingo.tools.Analyzer;
import fr.umlv.ir.dingo.tools.GrammarEvaluator;
import fr.umlv.ir.dingo.tools.TerminalAttributeEvaluator;
import fr.umlv.ir.dingo.tools.TerminalRulesMap;
import fr.umlv.ir.dingo.tools.ToolsLexerListener;
import fr.umlv.ir.dingo.tools.ToolsParserListener;
import fr.umlv.tatoo.runtime.buffer.impl.LocationTokenBufferFilter;
import fr.umlv.tatoo.runtime.buffer.impl.ReaderWrapper;
import fr.umlv.tatoo.runtime.buffer.impl.TokenBuffer;
import fr.umlv.tatoo.runtime.lexer.Lexer;
import fr.umlv.tatoo.runtime.lexer.LexerListener;
import fr.umlv.tatoo.runtime.parser.Parser;
import fr.umlv.tatoo.runtime.tools.Debug;
import fr.umlv.tatoo.runtime.tools.ForwardingErrorHandler;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;

public class Analyzer {
  public static void run(
    Reader reader,
    TerminalAttributeEvaluator attributeEvaluator,
    GrammarEvaluator grammarEvaluator,
    NonTerminalEnum start) {

    ToolsParserListener parserListener=
      new ToolsParserListener(grammarEvaluator);

    Parser<TerminalEnum, NonTerminalEnum, ProductionEnum> parser=
      Parser.createParser(TerminalEnum.class,ParserDataTable.table,parserListener,start);

    LocationTokenBufferFilter buffer=
      new LocationTokenBufferFilter(new ReaderWrapper(reader));

    LexerListener<RuleEnum,TokenBuffer> lexerListener=
      new ToolsLexerListener(parser,parserListener.getAttributeHolder(),attributeEvaluator);

    Lexer<RuleEnum,LocationTokenBufferFilter> lexer=Lexer.createLexer(
      LexerDataTable.table,buffer,lexerListener,TerminalRulesMap.getActivator(parser),
      ForwardingErrorHandler.createForwardingLocationErrorHandler(parser));
    lexer.run();
    parser.close();
  }

  public static void main(String[] args) throws IOException {
    Reader reader;
    if (args.length>0) {
      reader = new FileReader(args[0]);
    } else {
      reader = new InputStreamReader(System.in);
    }
    //TODO implements the termninal attribute evaluator here
    TerminalAttributeEvaluator attributeEvaluator = Debug.createTraceProxy(TerminalAttributeEvaluator.class);

    //TODO implements the grammar evaluator here
    GrammarEvaluator grammarEvaluator = Debug.createTraceProxy(GrammarEvaluator.class);

    //TODO choose a start non terminal here
    NonTerminalEnum start = NonTerminalEnum.start;

    run(reader,attributeEvaluator,grammarEvaluator,start);
  }
}
