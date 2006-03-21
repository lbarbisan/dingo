package fr.umlv.ir.dingo;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

import org.objectweb.asm.ClassWriter;
import org.objectweb.asm.MethodVisitor;
import org.objectweb.asm.Opcodes;

import fr.umlv.ir.dingo.lexer.LexerDataTable;
import fr.umlv.ir.dingo.lexer.RuleEnum;
import fr.umlv.ir.dingo.parser.NonTerminalEnum;
import fr.umlv.ir.dingo.parser.ParserDataTable;
import fr.umlv.ir.dingo.parser.ProductionEnum;
import fr.umlv.ir.dingo.parser.TerminalEnum;
import fr.umlv.ir.dingo.tools.TerminalAttributeEvaluator;
import fr.umlv.ir.dingo.tools.TerminalRulesMap;
import fr.umlv.ir.dingo.tools.ToolsLexerListener;
import fr.umlv.ir.dingo.tools.ToolsParserListener;
import fr.umlv.ir.dingo.tree.Tree;
import fr.umlv.ir.dingo.tree.TreeVisitor;
import fr.umlv.tatoo.runtime.buffer.impl.LocationTokenBufferFilter;
import fr.umlv.tatoo.runtime.buffer.impl.ReaderWrapper;
import fr.umlv.tatoo.runtime.buffer.impl.TokenBuffer;
import fr.umlv.tatoo.runtime.lexer.Lexer;
import fr.umlv.tatoo.runtime.lexer.LexerListener;
import fr.umlv.tatoo.runtime.parser.Parser;
import fr.umlv.tatoo.runtime.tools.ForwardingErrorHandler;

public class DingoMain {

	private static final String JAVA_LANG_OBJECT = "java/lang/Object";

	public static void main(String[] args) throws FileNotFoundException {
		
		//Scanner scan = new Scanner(System.in);
		Reader reader = null;
		String file;
		
		if(args.length == 0) {
			System.err.println("Donnez un nom de fichier.");
			return;
		}
		
		file = args[0];
		try {
			reader = new FileReader(file);
		} catch (FileNotFoundException fnfe) {
			System.err.println("Invalid File");
			return;
		}

		DingoGrammarEvaluator grammarEvaluator = new DingoGrammarEvaluator();
		ToolsParserListener parserListener = new ToolsParserListener(
				grammarEvaluator);

		NonTerminalEnum start = NonTerminalEnum.start;
		Parser<TerminalEnum, NonTerminalEnum, ProductionEnum> parser = Parser
				.createParser(TerminalEnum.class, ParserDataTable.table,
						parserListener, start);

		LocationTokenBufferFilter buffer = new LocationTokenBufferFilter(
				new ReaderWrapper(reader));

		TerminalAttributeEvaluator lexerVisitor = new DingoTerminalAttributeEvaluator();

		LexerListener<RuleEnum, TokenBuffer> lexerListener = new ToolsLexerListener(
				parser, parserListener.getAttributeHolder(), lexerVisitor);

		Lexer<RuleEnum, LocationTokenBufferFilter> lexer = Lexer.createLexer(
				LexerDataTable.table, buffer, lexerListener, TerminalRulesMap
						.getActivator(parser), ForwardingErrorHandler
						.createForwardingLocationErrorHandler(parser));
		lexer.run();
		parser.close();

		ClassWriter cw = new ClassWriter(false);

		int dot = file.indexOf(".");
		String className = file.substring(0, dot);
		
		cw.visit(Opcodes.V1_5, Opcodes.ACC_PUBLIC, className, null,
				JAVA_LANG_OBJECT, null);

		Tree t = grammarEvaluator.getAllInstructions();
		MethodVisitor main = cw.visitMethod(
				(Opcodes.ACC_PUBLIC | Opcodes.ACC_STATIC), "main",
				"([Ljava/lang/String;)V", null, null);
		
		main.visitCode();
		ASMVisitor visitor = new ASMVisitor(className, main);
		TreeVisitor firstPass = new FirstPass(cw, visitor, className);

		t.accept(firstPass);
		t.accept(visitor);
		
		main.visitInsn(Opcodes.RETURN);
		main.visitEnd();
		
		try {

			String output = className + ".class";
			FileOutputStream fos = new FileOutputStream(new File(output));
			fos.write(cw.toByteArray());
			fos.close();

		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}