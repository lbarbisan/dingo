package fr.umlv.ir.dingo.lexer;

import fr.umlv.ir.dingo.lexer.RuleEnum;
import fr.umlv.tatoo.runtime.lexer.LexerTable;
import fr.umlv.tatoo.runtime.lexer.RuleData;
import fr.umlv.tatoo.runtime.regex.CharRegexTable;
import java.util.EnumMap;

public class LexerDataTable {
	public static final LexerTable<RuleEnum> table;
	static {
		boolean[] spaceMainAccepts = { true };
		int[][] spaceMainTransitions = { { 0, -1, 9, 0, 10, -1, 32, 0, 33, -1 } };
		CharRegexTable spaceMain = new CharRegexTable(0, spaceMainTransitions,
				spaceMainAccepts);
		RuleData space = new RuleData(spaceMain, null, false);
		boolean[] commentMainAccepts = { false, false, false, false, false,
				true };
		int[][] commentMainTransitions = { { 0, -1, 47, 2, 48, -1 },
				{ 0, -1, 10, 5, 11, -1, 13, 4, 14, -1 }, { 0, 1 },
				{ 0, -1, 47, 0, 48, -1 }, { 0, -1, 10, 5, 11, -1 }, { 0, -1 } };
		CharRegexTable commentMain = new CharRegexTable(3,
				commentMainTransitions, commentMainAccepts);
		RuleData comment = new RuleData(commentMain, null, false);
		boolean[] numberValueMainAccepts = { false, true };
		int[][] numberValueMainTransitions = { { 0, -1, 48, 1, 58, -1 },
				{ 0, -1, 48, 1, 58, -1 } };
		CharRegexTable numberValueMain = new CharRegexTable(0,
				numberValueMainTransitions, numberValueMainAccepts);
		RuleData numberValue = new RuleData(numberValueMain, null, false);
		boolean[] stringValueMainAccepts = { false, false, true };
		int[][] stringValueMainTransitions = { { 0, 0, 34, 2, 35, 0 },
				{ 0, -1, 34, 0, 35, -1 }, { 0, 0, 34, 2, 35, 0 } };
		CharRegexTable stringValueMain = new CharRegexTable(1,
				stringValueMainTransitions, stringValueMainAccepts);
		RuleData stringValue = new RuleData(stringValueMain, null, false);
		boolean[] string_typeMainAccepts = { false, false, false, false, false,
				false, true };
		int[][] string_typeMainTransitions = { { 0, -1, 105, 3, 106, -1 },
				{ 0, -1, 114, 0, 115, -1 }, { 0, -1, 103, 6, 104, -1 },
				{ 0, -1, 110, 2, 111, -1 }, { 0, -1, 83, 5, 84, -1 },
				{ 0, -1, 116, 1, 117, -1 }, { 0, -1 } };
		CharRegexTable string_typeMain = new CharRegexTable(4,
				string_typeMainTransitions, string_typeMainAccepts);
		RuleData string_type = new RuleData(string_typeMain, null, false);
		boolean[] numeric_typeMainAccepts = { false, false, false, false,
				false, false, false, true };
		int[][] numeric_typeMainTransitions = { { 0, -1, 114, 4, 115, -1 },
				{ 0, -1, 78, 3, 79, -1 }, { 0, -1, 101, 0, 102, -1 },
				{ 0, -1, 117, 6, 118, -1 }, { 0, -1, 105, 5, 106, -1 },
				{ 0, -1, 99, 7, 100, -1 }, { 0, -1, 109, 2, 110, -1 },
				{ 0, -1 } };
		CharRegexTable numeric_typeMain = new CharRegexTable(1,
				numeric_typeMainTransitions, numeric_typeMainAccepts);
		RuleData numeric_type = new RuleData(numeric_typeMain, null, false);
		boolean[] function_typeMainAccepts = { false, false, false, false,
				false, false, false, false, true };
		int[][] function_typeMainTransitions = { { 0, -1, 116, 6, 117, -1 },
				{ 0, -1, 110, 5, 111, -1 }, { 0, -1, 110, 8, 111, -1 },
				{ 0, -1, 111, 2, 112, -1 }, { 0, -1, 70, 7, 71, -1 },
				{ 0, -1, 99, 0, 100, -1 }, { 0, -1, 105, 3, 106, -1 },
				{ 0, -1, 117, 1, 118, -1 }, { 0, -1 } };
		CharRegexTable function_typeMain = new CharRegexTable(4,
				function_typeMainTransitions, function_typeMainAccepts);
		RuleData function_type = new RuleData(function_typeMain, null, false);
		boolean[] object_typeMainAccepts = { false, false, false, false, false,
				false, true };
		int[][] object_typeMainTransitions = { { 0, -1, 106, 5, 107, -1 },
				{ 0, -1, 79, 3, 80, -1 }, { 0, -1, 116, 6, 117, -1 },
				{ 0, -1, 98, 0, 99, -1 }, { 0, -1, 99, 2, 100, -1 },
				{ 0, -1, 101, 4, 102, -1 }, { 0, -1 } };
		CharRegexTable object_typeMain = new CharRegexTable(1,
				object_typeMainTransitions, object_typeMainAccepts);
		RuleData object_type = new RuleData(object_typeMain, null, false);
		boolean[] array_typeMainAccepts = { false, false, false, false, false,
				true };
		int[][] array_typeMainTransitions = { { 0, -1, 97, 4, 98, -1 },
				{ 0, -1, 114, 0, 115, -1 }, { 0, -1, 65, 3, 66, -1 },
				{ 0, -1, 114, 1, 115, -1 }, { 0, -1, 121, 5, 122, -1 },
				{ 0, -1 } };
		CharRegexTable array_typeMain = new CharRegexTable(2,
				array_typeMainTransitions, array_typeMainAccepts);
		RuleData array_type = new RuleData(array_typeMain, null, false);
		boolean[] identifierMainAccepts = { false, true };
		int[][] identifierMainTransitions = {
				{ 0, -1, 48, 1, 58, -1, 65, 1, 91, -1, 95, 1, 96, -1, 97, 1,
					123, -1 },
					{ 0, -1, 48, 1, 58, -1, 65, 1, 91, -1, 95, 1, 96, -1, 97, 1,
						123, -1 } };
		CharRegexTable identifierMain = new CharRegexTable(0,
				identifierMainTransitions, identifierMainAccepts);
		RuleData identifier = new RuleData(identifierMain, null, false);
		boolean[] numeric_identifierMainAccepts = { false, true };
		int[][] numeric_identifierMainTransitions = {
				{ 0, -1, 48, 1, 58, -1, 65, 1, 91, -1, 95, 1, 96, -1, 97, 1,
					123, -1 },
					{ 0, -1, 48, 1, 58, -1, 65, 1, 91, -1, 95, 1, 96, -1, 97, 1,
						123, -1 } };
		CharRegexTable numeric_identifierMain = new CharRegexTable(0,
				numeric_identifierMainTransitions,
				numeric_identifierMainAccepts);
		RuleData numeric_identifier = new RuleData(numeric_identifierMain,
				null, false);
		boolean[] string_identifierMainAccepts = { false, true };
		int[][] string_identifierMainTransitions = {
				{ 0, -1, 48, 1, 58, -1, 65, 1, 91, -1, 95, 1, 96, -1, 97, 1,
					123, -1 },
					{ 0, -1, 48, 1, 58, -1, 65, 1, 91, -1, 95, 1, 96, -1, 97, 1,
						123, -1 } };
		CharRegexTable string_identifierMain = new CharRegexTable(0,
				string_identifierMainTransitions, string_identifierMainAccepts);
		RuleData string_identifier = new RuleData(string_identifierMain, null,
				false);
		boolean[] plusMainAccepts = { false, true };
		int[][] plusMainTransitions = { { 0, -1, 43, 1, 44, -1 }, { 0, -1 } };
		CharRegexTable plusMain = new CharRegexTable(0, plusMainTransitions,
				plusMainAccepts);
		RuleData plus = new RuleData(plusMain, null, false);
		boolean[] minusMainAccepts = { false, true };
		int[][] minusMainTransitions = { { 0, -1, 45, 1, 46, -1 }, { 0, -1 } };
		CharRegexTable minusMain = new CharRegexTable(0, minusMainTransitions,
				minusMainAccepts);
		RuleData minus = new RuleData(minusMain, null, false);
		boolean[] starMainAccepts = { false, true };
		int[][] starMainTransitions = { { 0, -1, 42, 1, 43, -1 }, { 0, -1 } };
		CharRegexTable starMain = new CharRegexTable(0, starMainTransitions,
				starMainAccepts);
		RuleData star = new RuleData(starMain, null, false);
		boolean[] divMainAccepts = { false, true };
		int[][] divMainTransitions = { { 0, -1, 47, 1, 48, -1 }, { 0, -1 } };
		CharRegexTable divMain = new CharRegexTable(0, divMainTransitions,
				divMainAccepts);
		RuleData div = new RuleData(divMain, null, false);
		boolean[] equalsMainAccepts = { false, true };
		int[][] equalsMainTransitions = { { 0, -1, 61, 1, 62, -1 }, { 0, -1 } };
		CharRegexTable equalsMain = new CharRegexTable(0,
				equalsMainTransitions, equalsMainAccepts);
		RuleData equals = new RuleData(equalsMain, null, false);
		boolean[] notEqualsMainAccepts = { false, false, true };
		int[][] notEqualsMainTransitions = { { 0, -1, 61, 2, 62, -1 },
				{ 0, -1, 33, 0, 34, -1 }, { 0, -1 } };
		CharRegexTable notEqualsMain = new CharRegexTable(1,
				notEqualsMainTransitions, notEqualsMainAccepts);
		RuleData notEquals = new RuleData(notEqualsMain, null, false);
		boolean[] supMainAccepts = { false, true };
		int[][] supMainTransitions = { { 0, -1, 62, 1, 63, -1 }, { 0, -1 } };
		CharRegexTable supMain = new CharRegexTable(0, supMainTransitions,
				supMainAccepts);
		RuleData sup = new RuleData(supMain, null, false);
		boolean[] infMainAccepts = { false, true };
		int[][] infMainTransitions = { { 0, -1, 62, 1, 63, -1 }, { 0, -1 } };
		CharRegexTable infMain = new CharRegexTable(0, infMainTransitions,
				infMainAccepts);
		RuleData inf = new RuleData(infMain, null, false);
		boolean[] l_shiftMainAccepts = { false, false, true };
		int[][] l_shiftMainTransitions = { { 0, -1, 62, 2, 63, -1 },
				{ 0, -1, 62, 0, 63, -1 }, { 0, -1 } };
		CharRegexTable l_shiftMain = new CharRegexTable(1,
				l_shiftMainTransitions, l_shiftMainAccepts);
		RuleData l_shift = new RuleData(l_shiftMain, null, false);
		boolean[] r_shiftMainAccepts = { false, false, true };
		int[][] r_shiftMainTransitions = { { 0, -1, 62, 2, 63, -1 },
				{ 0, -1, 62, 0, 63, -1 }, { 0, -1 } };
		CharRegexTable r_shiftMain = new CharRegexTable(1,
				r_shiftMainTransitions, r_shiftMainAccepts);
		RuleData r_shift = new RuleData(r_shiftMain, null, false);
		boolean[] moduloMainAccepts = { false, true };
		int[][] moduloMainTransitions = { { 0, -1, 37, 1, 38, -1 }, { 0, -1 } };
		CharRegexTable moduloMain = new CharRegexTable(0,
				moduloMainTransitions, moduloMainAccepts);
		RuleData modulo = new RuleData(moduloMain, null, false);
		boolean[] notMainAccepts = { false, true };
		int[][] notMainTransitions = { { 0, -1, 33, 1, 34, -1 }, { 0, -1 } };
		CharRegexTable notMain = new CharRegexTable(0, notMainTransitions,
				notMainAccepts);
		RuleData not = new RuleData(notMain, null, false);
		boolean[] andMainAccepts = { false, true };
		int[][] andMainTransitions = { { 0, -1, 38, 1, 39, -1 }, { 0, -1 } };
		CharRegexTable andMain = new CharRegexTable(0, andMainTransitions,
				andMainAccepts);
		RuleData and = new RuleData(andMain, null, false);
		boolean[] orMainAccepts = { false, true };
		int[][] orMainTransitions = { { 0, -1, 124, 1, 125, -1 }, { 0, -1 } };
		CharRegexTable orMain = new CharRegexTable(0, orMainTransitions,
				orMainAccepts);
		RuleData or = new RuleData(orMain, null, false);
		boolean[] semicolonMainAccepts = { false, true };
		int[][] semicolonMainTransitions = { { 0, -1, 59, 1, 60, -1 },
				{ 0, -1 } };
		CharRegexTable semicolonMain = new CharRegexTable(0,
				semicolonMainTransitions, semicolonMainAccepts);
		RuleData semicolon = new RuleData(semicolonMain, null, false);
		boolean[] lparMainAccepts = { false, true };
		int[][] lparMainTransitions = { { 0, -1, 40, 1, 41, -1 }, { 0, -1 } };
		CharRegexTable lparMain = new CharRegexTable(0, lparMainTransitions,
				lparMainAccepts);
		RuleData lpar = new RuleData(lparMain, null, false);
		boolean[] rparMainAccepts = { false, true };
		int[][] rparMainTransitions = { { 0, -1, 41, 1, 42, -1 }, { 0, -1 } };
		CharRegexTable rparMain = new CharRegexTable(0, rparMainTransitions,
				rparMainAccepts);
		RuleData rpar = new RuleData(rparMain, null, false);
		boolean[] l_braceMainAccepts = { false, true };
		int[][] l_braceMainTransitions = { { 0, -1, 123, 1, 124, -1 },
				{ 0, -1 } };
		CharRegexTable l_braceMain = new CharRegexTable(0,
				l_braceMainTransitions, l_braceMainAccepts);
		RuleData l_brace = new RuleData(l_braceMain, null, false);
		boolean[] r_braceMainAccepts = { false, true };
		int[][] r_braceMainTransitions = { { 0, -1, 125, 1, 126, -1 },
				{ 0, -1 } };
		CharRegexTable r_braceMain = new CharRegexTable(0,
				r_braceMainTransitions, r_braceMainAccepts);
		RuleData r_brace = new RuleData(r_braceMain, null, false);
		boolean[] dotMainAccepts = { false, true };
		int[][] dotMainTransitions = { { 0, -1, 46, 1, 47, -1 }, { 0, -1 } };
		CharRegexTable dotMain = new CharRegexTable(0, dotMainTransitions,
				dotMainAccepts);
		RuleData dot = new RuleData(dotMain, null, false);
		boolean[] commaMainAccepts = { false, true };
		int[][] commaMainTransitions = { { 0, -1, 44, 1, 45, -1 }, { 0, -1 } };
		CharRegexTable commaMain = new CharRegexTable(0, commaMainTransitions,
				commaMainAccepts);
		RuleData comma = new RuleData(commaMain, null, false);
		boolean[] eolnMainAccepts = { false, false, true };
		int[][] eolnMainTransitions = {
				{ 0, -1, 10, 2, 11, -1, 13, 1, 14, -1 },
				{ 0, -1, 10, 2, 11, -1 }, { 0, -1 } };
		CharRegexTable eolnMain = new CharRegexTable(0, eolnMainTransitions,
				eolnMainAccepts);
		RuleData eoln = new RuleData(eolnMain, null, false);
		boolean[] dingoMainAccepts = { false, false, false, false, false,
				false, true };
		int[][] dingoMainTransitions = { { 0, -1, 64, 3, 65, -1 },
				{ 0, -1, 110, 5, 111, -1 }, { 0, -1, 111, 6, 112, -1 },
				{ 0, -1, 100, 4, 101, -1 }, { 0, -1, 105, 1, 106, -1 },
				{ 0, -1, 103, 2, 104, -1 }, { 0, -1 } };
		CharRegexTable dingoMain = new CharRegexTable(0, dingoMainTransitions,
				dingoMainAccepts);
		RuleData dingo = new RuleData(dingoMain, null, false);
		boolean[] argsMainAccepts = { false, false, false, false, false, true };
		int[][] argsMainTransitions = { { 0, -1, 103, 4, 104, -1 },
				{ 0, -1, 114, 0, 115, -1 }, { 0, -1, 64, 3, 65, -1 },
				{ 0, -1, 97, 1, 98, -1 }, { 0, -1, 115, 5, 116, -1 }, { 0, -1 } };
		CharRegexTable argsMain = new CharRegexTable(2, argsMainTransitions,
				argsMainAccepts);
		RuleData args = new RuleData(argsMain, null, false);
		boolean[] defMainAccepts = { false, false, false, false, true };
		int[][] defMainTransitions = { { 0, -1, 64, 2, 65, -1 },
				{ 0, -1, 102, 4, 103, -1 }, { 0, -1, 100, 3, 101, -1 },
				{ 0, -1, 101, 1, 102, -1 }, { 0, -1 } };
		CharRegexTable defMain = new CharRegexTable(0, defMainTransitions,
				defMainAccepts);
		RuleData def = new RuleData(defMain, null, false);
		boolean[] _varMainAccepts = { false, false, false, false, true };
		int[][] _varMainTransitions = { { 0, -1, 97, 1, 98, -1 },
				{ 0, -1, 114, 4, 115, -1 }, { 0, -1, 64, 3, 65, -1 },
				{ 0, -1, 118, 0, 119, -1 }, { 0, -1 } };
		CharRegexTable _varMain = new CharRegexTable(2, _varMainTransitions,
				_varMainAccepts);
		RuleData _var = new RuleData(_varMain, null, false);
		boolean[] _returnMainAccepts = { false, false, false, false, false,
				false, false, true };
		int[][] _returnMainTransitions = { { 0, -1, 114, 3, 115, -1 },
				{ 0, -1, 64, 0, 65, -1 }, { 0, -1, 117, 4, 118, -1 },
				{ 0, -1, 101, 6, 102, -1 }, { 0, -1, 114, 5, 115, -1 },
				{ 0, -1, 110, 7, 111, -1 }, { 0, -1, 116, 2, 117, -1 },
				{ 0, -1 } };
		CharRegexTable _returnMain = new CharRegexTable(1,
				_returnMainTransitions, _returnMainAccepts);
		RuleData _return = new RuleData(_returnMain, null, false);
		boolean[] _ifMainAccepts = { false, false, false, true };
		int[][] _ifMainTransitions = { { 0, -1, 105, 2, 106, -1 },
				{ 0, -1, 64, 0, 65, -1 }, { 0, -1, 102, 3, 103, -1 }, { 0, -1 } };
		CharRegexTable _ifMain = new CharRegexTable(1, _ifMainTransitions,
				_ifMainAccepts);
		RuleData _if = new RuleData(_ifMain, null, false);
		boolean[] _elseMainAccepts = { false, false, false, false, false, true };
		int[][] _elseMainTransitions = { { 0, -1, 101, 2, 102, -1 },
				{ 0, -1, 64, 0, 65, -1 }, { 0, -1, 108, 3, 109, -1 },
				{ 0, -1, 115, 4, 116, -1 }, { 0, -1, 101, 5, 102, -1 },
				{ 0, -1 } };
		CharRegexTable _elseMain = new CharRegexTable(1, _elseMainTransitions,
				_elseMainAccepts);
		RuleData _else = new RuleData(_elseMain, null, false);
		boolean[] _forMainAccepts = { false, false, false, false, true };
		int[][] _forMainTransitions = { { 0, -1, 111, 1, 112, -1 },
				{ 0, -1, 114, 4, 115, -1 }, { 0, -1, 102, 0, 103, -1 },
				{ 0, -1, 64, 2, 65, -1 }, { 0, -1 } };
		CharRegexTable _forMain = new CharRegexTable(3, _forMainTransitions,
				_forMainAccepts);
		RuleData _for = new RuleData(_forMain, null, false);
		boolean[] _foreachMainAccepts = { false, false, false, false, false,
				false, false, false, true };
		int[][] _foreachMainTransitions = { { 0, -1, 64, 5, 65, -1 },
				{ 0, -1, 97, 4, 98, -1 }, { 0, -1, 104, 8, 105, -1 },
				{ 0, -1, 111, 6, 112, -1 }, { 0, -1, 99, 2, 100, -1 },
				{ 0, -1, 102, 3, 103, -1 }, { 0, -1, 114, 7, 115, -1 },
				{ 0, -1, 101, 1, 102, -1 }, { 0, -1 } };
		CharRegexTable _foreachMain = new CharRegexTable(0,
				_foreachMainTransitions, _foreachMainAccepts);
		RuleData _foreach = new RuleData(_foreachMain, null, false);
		boolean[] _inMainAccepts = { false, false, false, true };
		int[][] _inMainTransitions = { { 0, -1, 64, 1, 65, -1 },
				{ 0, -1, 105, 2, 106, -1 }, { 0, -1, 110, 3, 111, -1 },
				{ 0, -1 } };
		CharRegexTable _inMain = new CharRegexTable(0, _inMainTransitions,
				_inMainAccepts);
		RuleData _in = new RuleData(_inMain, null, false);
		boolean[] foreverMainAccepts = { false, false, false, false, false,
				false, false, false, true };
		int[][] foreverMainTransitions = { { 0, -1, 101, 2, 102, -1 },
				{ 0, -1, 118, 0, 119, -1 }, { 0, -1, 114, 8, 115, -1 },
				{ 0, -1, 64, 5, 65, -1 }, { 0, -1, 101, 1, 102, -1 },
				{ 0, -1, 102, 7, 103, -1 }, { 0, -1, 114, 4, 115, -1 },
				{ 0, -1, 111, 6, 112, -1 }, { 0, -1 } };
		CharRegexTable foreverMain = new CharRegexTable(3,
				foreverMainTransitions, foreverMainAccepts);
		RuleData forever = new RuleData(foreverMain, null, false);
		boolean[] _breakMainAccepts = { false, false, false, false, false,
				false, true };
		int[][] _breakMainTransitions = { { 0, -1, 114, 5, 115, -1 },
				{ 0, -1, 97, 2, 98, -1 }, { 0, -1, 107, 6, 108, -1 },
				{ 0, -1, 98, 0, 99, -1 }, { 0, -1, 64, 3, 65, -1 },
				{ 0, -1, 101, 1, 102, -1 }, { 0, -1 } };
		CharRegexTable _breakMain = new CharRegexTable(4,
				_breakMainTransitions, _breakMainAccepts);
		RuleData _break = new RuleData(_breakMain, null, false);
		boolean[] _continueMainAccepts = { false, false, false, false, false,
				false, false, false, false, true };
		int[][] _continueMainTransitions = { { 0, -1, 105, 1, 106, -1 },
				{ 0, -1, 110, 5, 111, -1 }, { 0, -1, 101, 9, 102, -1 },
				{ 0, -1, 64, 7, 65, -1 }, { 0, -1, 116, 0, 117, -1 },
				{ 0, -1, 117, 2, 118, -1 }, { 0, -1, 111, 8, 112, -1 },
				{ 0, -1, 99, 6, 100, -1 }, { 0, -1, 110, 4, 111, -1 },
				{ 0, -1 } };
		CharRegexTable _continueMain = new CharRegexTable(3,
				_continueMainTransitions, _continueMainAccepts);
		RuleData _continue = new RuleData(_continueMain, null, false);
		boolean[] printMainAccepts = { false, false, false, false, false,
				false, true };
		int[][] printMainTransitions = { { 0, -1, 110, 2, 111, -1 },
				{ 0, -1, 114, 4, 115, -1 }, { 0, -1, 116, 6, 117, -1 },
				{ 0, -1, 112, 1, 113, -1 }, { 0, -1, 105, 0, 106, -1 },
				{ 0, -1, 64, 3, 65, -1 }, { 0, -1 } };
		CharRegexTable printMain = new CharRegexTable(5, printMainTransitions,
				printMainAccepts);
		RuleData print = new RuleData(printMain, null, false);
		boolean[] printlnMainAccepts = { false, false, false, false, false,
				false, false, false, true };
		int[][] printlnMainTransitions = { { 0, -1, 105, 3, 106, -1 },
				{ 0, -1, 114, 0, 115, -1 }, { 0, -1, 110, 8, 111, -1 },
				{ 0, -1, 110, 5, 111, -1 }, { 0, -1, 64, 7, 65, -1 },
				{ 0, -1, 116, 6, 117, -1 }, { 0, -1, 108, 2, 109, -1 },
				{ 0, -1, 112, 1, 113, -1 }, { 0, -1 } };
		CharRegexTable printlnMain = new CharRegexTable(4,
				printlnMainTransitions, printlnMainAccepts);
		RuleData println = new RuleData(printlnMain, null, false);
		boolean[] _nullMainAccepts = { false, false, false, false, false, true };
		int[][] _nullMainTransitions = { { 0, -1, 78, 1, 79, -1 },
				{ 0, -1, 85, 2, 86, -1 }, { 0, -1, 76, 4, 77, -1 },
				{ 0, -1, 64, 0, 65, -1 }, { 0, -1, 76, 5, 77, -1 }, { 0, -1 } };
		CharRegexTable _nullMain = new CharRegexTable(3, _nullMainTransitions,
				_nullMainAccepts);
		RuleData _null = new RuleData(_nullMain, null, false);
		boolean[] guiMainAccepts = { false, false, false, false, true };
		int[][] guiMainTransitions = { { 0, -1, 64, 2, 65, -1 },
				{ 0, -1, 105, 4, 106, -1 }, { 0, -1, 103, 3, 104, -1 },
				{ 0, -1, 117, 1, 118, -1 }, { 0, -1 } };
		CharRegexTable guiMain = new CharRegexTable(0, guiMainTransitions,
				guiMainAccepts);
		RuleData gui = new RuleData(guiMain, null, false);
		boolean[] _voidMainAccepts = { false, false, false, false, true };
		int[][] _voidMainTransitions = { { 0, -1, 111, 3, 112, -1 },
				{ 0, -1, 100, 4, 101, -1 }, { 0, -1, 118, 0, 119, -1 },
				{ 0, -1, 105, 1, 106, -1 }, { 0, -1 } };
		CharRegexTable _voidMain = new CharRegexTable(2, _voidMainTransitions,
				_voidMainAccepts);
		RuleData _void = new RuleData(_voidMain, null, false);
		EnumMap<RuleEnum, RuleData> datas = new EnumMap<RuleEnum, RuleData>(
				RuleEnum.class);
		datas.put(RuleEnum.space, space);
		datas.put(RuleEnum.comment, comment);
		datas.put(RuleEnum.numberValue, numberValue);
		datas.put(RuleEnum.stringValue, stringValue);
		datas.put(RuleEnum.string_type, string_type);
		datas.put(RuleEnum.numeric_type, numeric_type);
		datas.put(RuleEnum.function_type, function_type);
		datas.put(RuleEnum.object_type, object_type);
		datas.put(RuleEnum.array_type, array_type);
		datas.put(RuleEnum.identifier, identifier);
		datas.put(RuleEnum.numeric_identifier, numeric_identifier);
		datas.put(RuleEnum.string_identifier, string_identifier);
		datas.put(RuleEnum.plus, plus);
		datas.put(RuleEnum.minus, minus);
		datas.put(RuleEnum.star, star);
		datas.put(RuleEnum.div, div);
		datas.put(RuleEnum.equals, equals);
		datas.put(RuleEnum.notEquals, notEquals);
		datas.put(RuleEnum.sup, sup);
		datas.put(RuleEnum.inf, inf);
		datas.put(RuleEnum.l_shift, l_shift);
		datas.put(RuleEnum.r_shift, r_shift);
		datas.put(RuleEnum.modulo, modulo);
		datas.put(RuleEnum.not, not);
		datas.put(RuleEnum.and, and);
		datas.put(RuleEnum.or, or);
		datas.put(RuleEnum.semicolon, semicolon);
		datas.put(RuleEnum.lpar, lpar);
		datas.put(RuleEnum.rpar, rpar);
		datas.put(RuleEnum.l_brace, l_brace);
		datas.put(RuleEnum.r_brace, r_brace);
		datas.put(RuleEnum.dot, dot);
		datas.put(RuleEnum.comma, comma);
		datas.put(RuleEnum.eoln, eoln);
		datas.put(RuleEnum.dingo, dingo);
		datas.put(RuleEnum.args, args);
		datas.put(RuleEnum.def, def);
		datas.put(RuleEnum._var, _var);
		datas.put(RuleEnum._return, _return);
		datas.put(RuleEnum._if, _if);
		datas.put(RuleEnum._else, _else);
		datas.put(RuleEnum._for, _for);
		datas.put(RuleEnum._foreach, _foreach);
		datas.put(RuleEnum._in, _in);
		datas.put(RuleEnum.forever, forever);
		datas.put(RuleEnum._break, _break);
		datas.put(RuleEnum._continue, _continue);
		datas.put(RuleEnum.print, print);
		datas.put(RuleEnum.println, println);
		datas.put(RuleEnum._null, _null);
		datas.put(RuleEnum.gui, gui);
		datas.put(RuleEnum._void, _void);
		table = new LexerTable<RuleEnum>(datas);
	}
	
}
