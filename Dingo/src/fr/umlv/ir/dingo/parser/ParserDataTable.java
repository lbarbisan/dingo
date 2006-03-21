package fr.umlv.ir.dingo.parser;

import fr.umlv.ir.dingo.parser.NonTerminalEnum;
import fr.umlv.ir.dingo.parser.ParserDataTable;
import fr.umlv.ir.dingo.parser.ProductionEnum;
import fr.umlv.ir.dingo.parser.TerminalEnum;
import fr.umlv.tatoo.runtime.parser.AcceptAction;
import fr.umlv.tatoo.runtime.parser.Action;
import fr.umlv.tatoo.runtime.parser.ErrorAction;
import fr.umlv.tatoo.runtime.parser.ParserTable;
import fr.umlv.tatoo.runtime.parser.ReduceAction;
import fr.umlv.tatoo.runtime.parser.ShiftAction;
import fr.umlv.tatoo.runtime.parser.StateMetadata;
import java.util.EnumMap;

public class ParserDataTable {
  private static <T,N> StateMetadata<T,N>[] id(StateMetadata<T,N>... datas) {
    return datas;
  }

  private static int[] createArray(
    int arg0,int arg1,int arg2,int arg3,int arg4,int arg5,int arg6,int arg7,int arg8,int arg9,int arg10,int arg11,int arg12,int arg13,int arg14,int arg15,int arg16,int arg17,int arg18,int arg19,int arg20,int arg21,int arg22,int arg23,int arg24,int arg25,int arg26,int arg27,int arg28,int arg29,int arg30,int arg31,int arg32,int arg33,int arg34,int arg35,int arg36,int arg37,int arg38,int arg39,int arg40,int arg41,int arg42,int arg43,int arg44,int arg45,int arg46,int arg47,int arg48,int arg49,int arg50,int arg51,int arg52,int arg53,int arg54,int arg55,int arg56,int arg57,int arg58,int arg59,int arg60,int arg61,int arg62,int arg63,int arg64,int arg65,int arg66,int arg67,int arg68,int arg69,int arg70,int arg71,int arg72,int arg73,int arg74,int arg75,int arg76,int arg77,int arg78,int arg79,int arg80,int arg81,int arg82,int arg83,int arg84,int arg85,int arg86,int arg87,int arg88,int arg89,int arg90,int arg91,int arg92,int arg93,int arg94,int arg95,int arg96,int arg97,int arg98,int arg99,int arg100,int arg101,int arg102,int arg103,int arg104,int arg105,int arg106,int arg107,int arg108,int arg109,int arg110,int arg111,int arg112,int arg113,int arg114,int arg115,int arg116,int arg117,int arg118,int arg119,int arg120,int arg121,int arg122,int arg123,int arg124,int arg125,int arg126,int arg127,int arg128,int arg129,int arg130,int arg131,int arg132,int arg133,int arg134,int arg135,int arg136,int arg137) {
    return new int[] {
    arg0,arg1,arg2,arg3,arg4,arg5,arg6,arg7,arg8,arg9,arg10,arg11,arg12,arg13,arg14,arg15,arg16,arg17,arg18,arg19,arg20,arg21,arg22,arg23,arg24,arg25,arg26,arg27,arg28,arg29,arg30,arg31,arg32,arg33,arg34,arg35,arg36,arg37,arg38,arg39,arg40,arg41,arg42,arg43,arg44,arg45,arg46,arg47,arg48,arg49,arg50,arg51,arg52,arg53,arg54,arg55,arg56,arg57,arg58,arg59,arg60,arg61,arg62,arg63,arg64,arg65,arg66,arg67,arg68,arg69,arg70,arg71,arg72,arg73,arg74,arg75,arg76,arg77,arg78,arg79,arg80,arg81,arg82,arg83,arg84,arg85,arg86,arg87,arg88,arg89,arg90,arg91,arg92,arg93,arg94,arg95,arg96,arg97,arg98,arg99,arg100,arg101,arg102,arg103,arg104,arg105,arg106,arg107,arg108,arg109,arg110,arg111,arg112,arg113,arg114,arg115,arg116,arg117,arg118,arg119,arg120,arg121,arg122,arg123,arg124,arg125,arg126,arg127,arg128,arg129,arg130,arg131,arg132,arg133,arg134,arg135,arg136,arg137  };
}
  private static Action<ProductionEnum>[] createArray(
    Action<ProductionEnum> arg0,Action<ProductionEnum> arg1,Action<ProductionEnum> arg2,Action<ProductionEnum> arg3,Action<ProductionEnum> arg4,Action<ProductionEnum> arg5,Action<ProductionEnum> arg6,Action<ProductionEnum> arg7,Action<ProductionEnum> arg8,Action<ProductionEnum> arg9,Action<ProductionEnum> arg10,Action<ProductionEnum> arg11,Action<ProductionEnum> arg12,Action<ProductionEnum> arg13,Action<ProductionEnum> arg14,Action<ProductionEnum> arg15,Action<ProductionEnum> arg16,Action<ProductionEnum> arg17,Action<ProductionEnum> arg18,Action<ProductionEnum> arg19,Action<ProductionEnum> arg20,Action<ProductionEnum> arg21,Action<ProductionEnum> arg22,Action<ProductionEnum> arg23,Action<ProductionEnum> arg24,Action<ProductionEnum> arg25,Action<ProductionEnum> arg26,Action<ProductionEnum> arg27,Action<ProductionEnum> arg28,Action<ProductionEnum> arg29,Action<ProductionEnum> arg30,Action<ProductionEnum> arg31,Action<ProductionEnum> arg32,Action<ProductionEnum> arg33,Action<ProductionEnum> arg34,Action<ProductionEnum> arg35,Action<ProductionEnum> arg36,Action<ProductionEnum> arg37,Action<ProductionEnum> arg38,Action<ProductionEnum> arg39,Action<ProductionEnum> arg40,Action<ProductionEnum> arg41,Action<ProductionEnum> arg42,Action<ProductionEnum> arg43,Action<ProductionEnum> arg44,Action<ProductionEnum> arg45,Action<ProductionEnum> arg46,Action<ProductionEnum> arg47,Action<ProductionEnum> arg48,Action<ProductionEnum> arg49,Action<ProductionEnum> arg50,Action<ProductionEnum> arg51,Action<ProductionEnum> arg52,Action<ProductionEnum> arg53,Action<ProductionEnum> arg54,Action<ProductionEnum> arg55,Action<ProductionEnum> arg56,Action<ProductionEnum> arg57,Action<ProductionEnum> arg58,Action<ProductionEnum> arg59,Action<ProductionEnum> arg60,Action<ProductionEnum> arg61,Action<ProductionEnum> arg62,Action<ProductionEnum> arg63,Action<ProductionEnum> arg64,Action<ProductionEnum> arg65,Action<ProductionEnum> arg66,Action<ProductionEnum> arg67,Action<ProductionEnum> arg68,Action<ProductionEnum> arg69,Action<ProductionEnum> arg70,Action<ProductionEnum> arg71,Action<ProductionEnum> arg72,Action<ProductionEnum> arg73,Action<ProductionEnum> arg74,Action<ProductionEnum> arg75,Action<ProductionEnum> arg76,Action<ProductionEnum> arg77,Action<ProductionEnum> arg78,Action<ProductionEnum> arg79,Action<ProductionEnum> arg80,Action<ProductionEnum> arg81,Action<ProductionEnum> arg82,Action<ProductionEnum> arg83,Action<ProductionEnum> arg84,Action<ProductionEnum> arg85,Action<ProductionEnum> arg86,Action<ProductionEnum> arg87,Action<ProductionEnum> arg88,Action<ProductionEnum> arg89,Action<ProductionEnum> arg90,Action<ProductionEnum> arg91,Action<ProductionEnum> arg92,Action<ProductionEnum> arg93,Action<ProductionEnum> arg94,Action<ProductionEnum> arg95,Action<ProductionEnum> arg96,Action<ProductionEnum> arg97,Action<ProductionEnum> arg98,Action<ProductionEnum> arg99,Action<ProductionEnum> arg100,Action<ProductionEnum> arg101,Action<ProductionEnum> arg102,Action<ProductionEnum> arg103,Action<ProductionEnum> arg104,Action<ProductionEnum> arg105,Action<ProductionEnum> arg106,Action<ProductionEnum> arg107,Action<ProductionEnum> arg108,Action<ProductionEnum> arg109,Action<ProductionEnum> arg110,Action<ProductionEnum> arg111,Action<ProductionEnum> arg112,Action<ProductionEnum> arg113,Action<ProductionEnum> arg114,Action<ProductionEnum> arg115,Action<ProductionEnum> arg116,Action<ProductionEnum> arg117,Action<ProductionEnum> arg118,Action<ProductionEnum> arg119,Action<ProductionEnum> arg120,Action<ProductionEnum> arg121,Action<ProductionEnum> arg122,Action<ProductionEnum> arg123,Action<ProductionEnum> arg124,Action<ProductionEnum> arg125,Action<ProductionEnum> arg126,Action<ProductionEnum> arg127,Action<ProductionEnum> arg128,Action<ProductionEnum> arg129,Action<ProductionEnum> arg130,Action<ProductionEnum> arg131,Action<ProductionEnum> arg132,Action<ProductionEnum> arg133,Action<ProductionEnum> arg134,Action<ProductionEnum> arg135,Action<ProductionEnum> arg136,Action<ProductionEnum> arg137) {
    return (Action<ProductionEnum>[])new Action<?>[] {
    arg0,arg1,arg2,arg3,arg4,arg5,arg6,arg7,arg8,arg9,arg10,arg11,arg12,arg13,arg14,arg15,arg16,arg17,arg18,arg19,arg20,arg21,arg22,arg23,arg24,arg25,arg26,arg27,arg28,arg29,arg30,arg31,arg32,arg33,arg34,arg35,arg36,arg37,arg38,arg39,arg40,arg41,arg42,arg43,arg44,arg45,arg46,arg47,arg48,arg49,arg50,arg51,arg52,arg53,arg54,arg55,arg56,arg57,arg58,arg59,arg60,arg61,arg62,arg63,arg64,arg65,arg66,arg67,arg68,arg69,arg70,arg71,arg72,arg73,arg74,arg75,arg76,arg77,arg78,arg79,arg80,arg81,arg82,arg83,arg84,arg85,arg86,arg87,arg88,arg89,arg90,arg91,arg92,arg93,arg94,arg95,arg96,arg97,arg98,arg99,arg100,arg101,arg102,arg103,arg104,arg105,arg106,arg107,arg108,arg109,arg110,arg111,arg112,arg113,arg114,arg115,arg116,arg117,arg118,arg119,arg120,arg121,arg122,arg123,arg124,arg125,arg126,arg127,arg128,arg129,arg130,arg131,arg132,arg133,arg134,arg135,arg136,arg137  };
}
  public static final ParserTable<TerminalEnum,NonTerminalEnum,ProductionEnum> table;
  static {
    int[] gotoesExpr=createArray(-1,-1,-1,-1,-1,-1,-1,-1,12,-1,-1,-1,-1,14,-1,16,-1,18,-1,20,-1,22,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,35,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,63,63,-1,-1,67,66,-1,-1,69,-1,73,72,-1,-1,75,-1,-1,63,-1,63,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,63,-1,-1,-1,-1,-1,-1,-1,-1,105,-1,-1,-1,-1,-1,-1,112,-1,-1,-1,-1,112,-1,119,-1,-1,-1,-1,124,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1);
    int[] gotoesParam=createArray(-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,52,-1,-1,-1,52,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1);
    int[] gotoesBooleanExpr=createArray(-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,81,76,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,78,-1,80,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,96,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1);
    int[] gotoesExpr_def=createArray(-1,-1,-1,-1,107,-1,-1,107,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,107,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,107,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,107,-1,-1,107,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,107,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1);
    int[] gotoesString_expr=createArray(-1,-1,-1,-1,-1,-1,-1,-1,24,-1,-1,-1,-1,24,-1,24,-1,24,-1,24,-1,24,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,24,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,24,24,-1,-1,24,24,-1,-1,24,-1,24,24,-1,-1,24,-1,-1,24,-1,24,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,24,-1,-1,-1,-1,-1,-1,-1,-1,24,-1,-1,-1,-1,-1,-1,24,-1,-1,-1,-1,24,-1,24,-1,-1,-1,-1,24,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1);
    int[] gotoesParams_list=createArray(-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,55,-1,-1,-1,54,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1);
    int[] gotoesArg=createArray(-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,115,-1,-1,-1,-1,115,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1);
    int[] gotoesInstructions=createArray(-1,-1,-1,4,-1,-1,7,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,32,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,58,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,84,-1,-1,87,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,101,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1);
    int[] gotoesType=createArray(-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,47,-1,-1,45,-1,-1,-1,-1,-1,-1,-1,-1,50,-1,-1,-1,50,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,121,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,129,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1);
    int[] gotoesStart=createArray(136,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1);
    int[] gotoesArgs_list=createArray(-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,113,-1,-1,-1,-1,117,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1);
    int[] gotoesElse_bloc=createArray(-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,131,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1);
    int[] gotoesInit=createArray(-1,-1,-1,-1,108,-1,-1,108,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,108,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,108,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,108,-1,-1,108,-1,-1,-1,-1,-1,94,-1,-1,-1,98,-1,-1,-1,108,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1);
    int[] gotoesNumeric_expr=createArray(-1,-1,-1,-1,-1,-1,-1,-1,23,-1,-1,-1,-1,23,-1,23,-1,23,-1,23,-1,23,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,23,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,23,23,-1,-1,23,23,-1,-1,23,-1,23,23,-1,-1,23,-1,-1,23,-1,23,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,23,-1,-1,-1,-1,-1,-1,-1,-1,23,-1,-1,-1,-1,-1,-1,23,-1,-1,-1,-1,23,-1,23,-1,-1,-1,-1,23,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1);
    int[] gotoesVar=createArray(-1,-1,-1,-1,109,-1,-1,109,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,109,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,109,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,109,-1,-1,109,-1,-1,-1,-1,-1,127,-1,-1,-1,127,-1,-1,-1,109,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1);
    int[] gotoesInstruction=createArray(-1,-1,-1,-1,125,-1,-1,125,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,125,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,125,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,125,-1,-1,125,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,125,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1);
    int[] gotoesFunction_call=createArray(-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,120,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1);
    AcceptAction<ProductionEnum> accept =
      AcceptAction.<ProductionEnum>getInstance();
    ReduceAction<ProductionEnum> reduceprintln_def =
      new ReduceAction<ProductionEnum>(ProductionEnum.println_def,4,gotoesInstruction);
    ReduceAction<ProductionEnum> reducedivide_def =
      new ReduceAction<ProductionEnum>(ProductionEnum.divide_def,3,gotoesExpr);
    ReduceAction<ProductionEnum> reduceprint_def =
      new ReduceAction<ProductionEnum>(ProductionEnum.print_def,4,gotoesInstruction);
    ReduceAction<ProductionEnum> reduceempty_type_expr_def =
      new ReduceAction<ProductionEnum>(ProductionEnum.empty_type_expr_def,3,gotoesExpr_def);
    ReduceAction<ProductionEnum> reducestring_expr_def =
      new ReduceAction<ProductionEnum>(ProductionEnum.string_expr_def,1,gotoesExpr);
    ReduceAction<ProductionEnum> reduceinf_equals_def =
      new ReduceAction<ProductionEnum>(ProductionEnum.inf_equals_def,4,gotoesBooleanExpr);
    ReduceAction<ProductionEnum> reducereturn_def =
      new ReduceAction<ProductionEnum>(ProductionEnum.return_def,2,gotoesInstruction);
    ReduceAction<ProductionEnum> reducefunction_call_def =
      new ReduceAction<ProductionEnum>(ProductionEnum.function_call_def,3,gotoesFunction_call);
    ReduceAction<ProductionEnum> reducecontinue_def =
      new ReduceAction<ProductionEnum>(ProductionEnum.continue_def,1,gotoesInstruction);
    ReduceAction<ProductionEnum> reduceempty_type_init_identifier_def =
      new ReduceAction<ProductionEnum>(ProductionEnum.empty_type_init_identifier_def,4,gotoesInit);
    ReduceAction<ProductionEnum> reduceempty_instructions_def =
      new ReduceAction<ProductionEnum>(ProductionEnum.empty_instructions_def,0,gotoesInstructions);
    ReduceAction<ProductionEnum> reduceinit_def =
      new ReduceAction<ProductionEnum>(ProductionEnum.init_def,1,gotoesExpr_def);
    ReduceAction<ProductionEnum> reduceone_arg_list_def =
      new ReduceAction<ProductionEnum>(ProductionEnum.one_arg_list_def,1,gotoesArgs_list);
    ReduceAction<ProductionEnum> reduceobject_type_def =
      new ReduceAction<ProductionEnum>(ProductionEnum.object_type_def,1,gotoesType);
    ReduceAction<ProductionEnum> reducevoid_type_def =
      new ReduceAction<ProductionEnum>(ProductionEnum.void_type_def,1,gotoesType);
    ReduceAction<ProductionEnum> reducemodulo_def =
      new ReduceAction<ProductionEnum>(ProductionEnum.modulo_def,3,gotoesExpr);
    ReduceAction<ProductionEnum> reduceempty_params_list_def =
      new ReduceAction<ProductionEnum>(ProductionEnum.empty_params_list_def,0,gotoesParams_list);
    ReduceAction<ProductionEnum> reducenumeric_expr_def =
      new ReduceAction<ProductionEnum>(ProductionEnum.numeric_expr_def,1,gotoesExpr);
    ReduceAction<ProductionEnum> reducefull_type_expr_def =
      new ReduceAction<ProductionEnum>(ProductionEnum.full_type_expr_def,3,gotoesExpr_def);
    ReduceAction<ProductionEnum> reduceinstruction_expr_def =
      new ReduceAction<ProductionEnum>(ProductionEnum.instruction_expr_def,1,gotoesInstruction);
    ReduceAction<ProductionEnum> reducestring_value_def =
      new ReduceAction<ProductionEnum>(ProductionEnum.string_value_def,1,gotoesString_expr);
    ReduceAction<ProductionEnum> reducesup_def =
      new ReduceAction<ProductionEnum>(ProductionEnum.sup_def,3,gotoesBooleanExpr);
    ReduceAction<ProductionEnum> reducefunction_definition =
      new ReduceAction<ProductionEnum>(ProductionEnum.function_definition,9,gotoesInstruction);
    ReduceAction<ProductionEnum> reduceone_param_list_def =
      new ReduceAction<ProductionEnum>(ProductionEnum.one_param_list_def,1,gotoesParams_list);
    ReduceAction<ProductionEnum> reduceor_def =
      new ReduceAction<ProductionEnum>(ProductionEnum.or_def,3,gotoesBooleanExpr);
    ReduceAction<ProductionEnum> reducefull_else_bloc =
      new ReduceAction<ProductionEnum>(ProductionEnum.full_else_bloc,3,gotoesElse_bloc);
    ReduceAction<ProductionEnum> reduceidentifier_expr_def =
      new ReduceAction<ProductionEnum>(ProductionEnum.identifier_expr_def,1,gotoesExpr);
    ReduceAction<ProductionEnum> reduceparam_def =
      new ReduceAction<ProductionEnum>(ProductionEnum.param_def,2,gotoesParam);
    ReduceAction<ProductionEnum> reduceempty_else_bloc =
      new ReduceAction<ProductionEnum>(ProductionEnum.empty_else_bloc,0,gotoesElse_bloc);
    ReduceAction<ProductionEnum> reducefull_var_keyword =
      new ReduceAction<ProductionEnum>(ProductionEnum.full_var_keyword,1,gotoesVar);
    ReduceAction<ProductionEnum> reduceminus_def =
      new ReduceAction<ProductionEnum>(ProductionEnum.minus_def,3,gotoesExpr);
    ReduceAction<ProductionEnum> reducedingo_start =
      new ReduceAction<ProductionEnum>(ProductionEnum.dingo_start,5,gotoesStart);
    ReduceAction<ProductionEnum> reducefull_instructions_def =
      new ReduceAction<ProductionEnum>(ProductionEnum.full_instructions_def,3,gotoesInstructions);
    ReduceAction<ProductionEnum> reduceinf_def =
      new ReduceAction<ProductionEnum>(ProductionEnum.inf_def,3,gotoesBooleanExpr);
    ReduceAction<ProductionEnum> reduceforever_def =
      new ReduceAction<ProductionEnum>(ProductionEnum.forever_def,4,gotoesInstruction);
    ReduceAction<ProductionEnum> reducefor_def =
      new ReduceAction<ProductionEnum>(ProductionEnum.for_def,11,gotoesInstruction);
    ReduceAction<ProductionEnum> reducenot_def =
      new ReduceAction<ProductionEnum>(ProductionEnum.not_def,2,gotoesBooleanExpr);
    ReduceAction<ProductionEnum> reduceempty_args_list_def =
      new ReduceAction<ProductionEnum>(ProductionEnum.empty_args_list_def,0,gotoesArgs_list);
    ReduceAction<ProductionEnum> reducesup_equals_def =
      new ReduceAction<ProductionEnum>(ProductionEnum.sup_equals_def,4,gotoesBooleanExpr);
    ReduceAction<ProductionEnum> reducefunction_type_def =
      new ReduceAction<ProductionEnum>(ProductionEnum.function_type_def,1,gotoesType);
    ReduceAction<ProductionEnum> reducearg_def =
      new ReduceAction<ProductionEnum>(ProductionEnum.arg_def,1,gotoesArg);
    ReduceAction<ProductionEnum> reducenumeric_type_def =
      new ReduceAction<ProductionEnum>(ProductionEnum.numeric_type_def,1,gotoesType);
    ReduceAction<ProductionEnum> reduceequals_def =
      new ReduceAction<ProductionEnum>(ProductionEnum.equals_def,3,gotoesBooleanExpr);
    ReduceAction<ProductionEnum> reduceempty_function_call_def =
      new ReduceAction<ProductionEnum>(ProductionEnum.empty_function_call_def,0,gotoesFunction_call);
    ReduceAction<ProductionEnum> reduceargs_list_def =
      new ReduceAction<ProductionEnum>(ProductionEnum.args_list_def,3,gotoesArgs_list);
    ReduceAction<ProductionEnum> reducenumber_value_def =
      new ReduceAction<ProductionEnum>(ProductionEnum.number_value_def,1,gotoesNumeric_expr);
    ReduceAction<ProductionEnum> reducefull_type_init_identifier_def =
      new ReduceAction<ProductionEnum>(ProductionEnum.full_type_init_identifier_def,5,gotoesInit);
    ReduceAction<ProductionEnum> reduceand_def =
      new ReduceAction<ProductionEnum>(ProductionEnum.and_def,3,gotoesBooleanExpr);
    ReduceAction<ProductionEnum> reduceif_def =
      new ReduceAction<ProductionEnum>(ProductionEnum.if_def,8,gotoesInstruction);
    ReduceAction<ProductionEnum> reducearray_type_def =
      new ReduceAction<ProductionEnum>(ProductionEnum.array_type_def,4,gotoesType);
    ReduceAction<ProductionEnum> reducestring_type_def =
      new ReduceAction<ProductionEnum>(ProductionEnum.string_type_def,1,gotoesType);
    ReduceAction<ProductionEnum> reduceforeach_def =
      new ReduceAction<ProductionEnum>(ProductionEnum.foreach_def,9,gotoesInstruction);
    ReduceAction<ProductionEnum> reducebooleanValue_def =
      new ReduceAction<ProductionEnum>(ProductionEnum.booleanValue_def,1,gotoesBooleanExpr);
    ReduceAction<ProductionEnum> reduceparams_list_def =
      new ReduceAction<ProductionEnum>(ProductionEnum.params_list_def,3,gotoesParams_list);
    ReduceAction<ProductionEnum> reducenot_equals_def =
      new ReduceAction<ProductionEnum>(ProductionEnum.not_equals_def,3,gotoesBooleanExpr);
    ReduceAction<ProductionEnum> reduceempty_var_keyword =
      new ReduceAction<ProductionEnum>(ProductionEnum.empty_var_keyword,0,gotoesVar);
    ReduceAction<ProductionEnum> reducestar_def =
      new ReduceAction<ProductionEnum>(ProductionEnum.star_def,3,gotoesExpr);
    ReduceAction<ProductionEnum> reducebreak_def =
      new ReduceAction<ProductionEnum>(ProductionEnum.break_def,1,gotoesInstruction);
    ReduceAction<ProductionEnum> reduceplus_def =
      new ReduceAction<ProductionEnum>(ProductionEnum.plus_def,3,gotoesExpr);
    ShiftAction<ProductionEnum> shift70 =
      new ShiftAction<ProductionEnum>(70);
    ShiftAction<ProductionEnum> shift11 =
      new ShiftAction<ProductionEnum>(11);
    ShiftAction<ProductionEnum> shift86 =
      new ShiftAction<ProductionEnum>(86);
    ShiftAction<ProductionEnum> shift48 =
      new ShiftAction<ProductionEnum>(48);
    ShiftAction<ProductionEnum> shift17 =
      new ShiftAction<ProductionEnum>(17);
    ShiftAction<ProductionEnum> shift103 =
      new ShiftAction<ProductionEnum>(103);
    ShiftAction<ProductionEnum> shift46 =
      new ShiftAction<ProductionEnum>(46);
    ShiftAction<ProductionEnum> shift59 =
      new ShiftAction<ProductionEnum>(59);
    ShiftAction<ProductionEnum> shift102 =
      new ShiftAction<ProductionEnum>(102);
    ShiftAction<ProductionEnum> shift123 =
      new ShiftAction<ProductionEnum>(123);
    ShiftAction<ProductionEnum> shift133 =
      new ShiftAction<ProductionEnum>(133);
    ShiftAction<ProductionEnum> shift104 =
      new ShiftAction<ProductionEnum>(104);
    ShiftAction<ProductionEnum> shift39 =
      new ShiftAction<ProductionEnum>(39);
    ShiftAction<ProductionEnum> shift44 =
      new ShiftAction<ProductionEnum>(44);
    ShiftAction<ProductionEnum> shift40 =
      new ShiftAction<ProductionEnum>(40);
    ShiftAction<ProductionEnum> shift116 =
      new ShiftAction<ProductionEnum>(116);
    ShiftAction<ProductionEnum> shift97 =
      new ShiftAction<ProductionEnum>(97);
    ShiftAction<ProductionEnum> shift15 =
      new ShiftAction<ProductionEnum>(15);
    ShiftAction<ProductionEnum> shift88 =
      new ShiftAction<ProductionEnum>(88);
    ShiftAction<ProductionEnum> shift3 =
      new ShiftAction<ProductionEnum>(3);
    ShiftAction<ProductionEnum> shift85 =
      new ShiftAction<ProductionEnum>(85);
    ShiftAction<ProductionEnum> shift83 =
      new ShiftAction<ProductionEnum>(83);
    ShiftAction<ProductionEnum> shift21 =
      new ShiftAction<ProductionEnum>(21);
    ShiftAction<ProductionEnum> shift25 =
      new ShiftAction<ProductionEnum>(25);
    ShiftAction<ProductionEnum> shift13 =
      new ShiftAction<ProductionEnum>(13);
    ShiftAction<ProductionEnum> shift99 =
      new ShiftAction<ProductionEnum>(99);
    ShiftAction<ProductionEnum> shift30 =
      new ShiftAction<ProductionEnum>(30);
    ShiftAction<ProductionEnum> shift132 =
      new ShiftAction<ProductionEnum>(132);
    ShiftAction<ProductionEnum> shift31 =
      new ShiftAction<ProductionEnum>(31);
    ShiftAction<ProductionEnum> shift110 =
      new ShiftAction<ProductionEnum>(110);
    ShiftAction<ProductionEnum> shift43 =
      new ShiftAction<ProductionEnum>(43);
    ShiftAction<ProductionEnum> shift90 =
      new ShiftAction<ProductionEnum>(90);
    ShiftAction<ProductionEnum> shift134 =
      new ShiftAction<ProductionEnum>(134);
    ShiftAction<ProductionEnum> shift2 =
      new ShiftAction<ProductionEnum>(2);
    ShiftAction<ProductionEnum> shift100 =
      new ShiftAction<ProductionEnum>(100);
    ShiftAction<ProductionEnum> shift91 =
      new ShiftAction<ProductionEnum>(91);
    ShiftAction<ProductionEnum> shift89 =
      new ShiftAction<ProductionEnum>(89);
    ShiftAction<ProductionEnum> shift8 =
      new ShiftAction<ProductionEnum>(8);
    ShiftAction<ProductionEnum> shift93 =
      new ShiftAction<ProductionEnum>(93);
    ShiftAction<ProductionEnum> shift19 =
      new ShiftAction<ProductionEnum>(19);
    ShiftAction<ProductionEnum> shift41 =
      new ShiftAction<ProductionEnum>(41);
    ShiftAction<ProductionEnum> shift62 =
      new ShiftAction<ProductionEnum>(62);
    ShiftAction<ProductionEnum> shift118 =
      new ShiftAction<ProductionEnum>(118);
    ShiftAction<ProductionEnum> shift53 =
      new ShiftAction<ProductionEnum>(53);
    ShiftAction<ProductionEnum> shift49 =
      new ShiftAction<ProductionEnum>(49);
    ShiftAction<ProductionEnum> shift57 =
      new ShiftAction<ProductionEnum>(57);
    ShiftAction<ProductionEnum> shift79 =
      new ShiftAction<ProductionEnum>(79);
    ShiftAction<ProductionEnum> shift33 =
      new ShiftAction<ProductionEnum>(33);
    ShiftAction<ProductionEnum> shift1 =
      new ShiftAction<ProductionEnum>(1);
    ShiftAction<ProductionEnum> shift114 =
      new ShiftAction<ProductionEnum>(114);
    ShiftAction<ProductionEnum> shift82 =
      new ShiftAction<ProductionEnum>(82);
    ShiftAction<ProductionEnum> shift5 =
      new ShiftAction<ProductionEnum>(5);
    ShiftAction<ProductionEnum> shift29 =
      new ShiftAction<ProductionEnum>(29);
    ShiftAction<ProductionEnum> shift42 =
      new ShiftAction<ProductionEnum>(42);
    ShiftAction<ProductionEnum> shift10 =
      new ShiftAction<ProductionEnum>(10);
    ShiftAction<ProductionEnum> shift28 =
      new ShiftAction<ProductionEnum>(28);
    ShiftAction<ProductionEnum> shift34 =
      new ShiftAction<ProductionEnum>(34);
    ShiftAction<ProductionEnum> shift126 =
      new ShiftAction<ProductionEnum>(126);
    ShiftAction<ProductionEnum> shift61 =
      new ShiftAction<ProductionEnum>(61);
    ShiftAction<ProductionEnum> shift56 =
      new ShiftAction<ProductionEnum>(56);
    ShiftAction<ProductionEnum> shift92 =
      new ShiftAction<ProductionEnum>(92);
    ShiftAction<ProductionEnum> shift65 =
      new ShiftAction<ProductionEnum>(65);
    ShiftAction<ProductionEnum> shift74 =
      new ShiftAction<ProductionEnum>(74);
    ShiftAction<ProductionEnum> shift6 =
      new ShiftAction<ProductionEnum>(6);
    ShiftAction<ProductionEnum> shift36 =
      new ShiftAction<ProductionEnum>(36);
    ShiftAction<ProductionEnum> shift130 =
      new ShiftAction<ProductionEnum>(130);
    ShiftAction<ProductionEnum> shift106 =
      new ShiftAction<ProductionEnum>(106);
    ShiftAction<ProductionEnum> shift95 =
      new ShiftAction<ProductionEnum>(95);
    ShiftAction<ProductionEnum> shift135 =
      new ShiftAction<ProductionEnum>(135);
    ShiftAction<ProductionEnum> shift51 =
      new ShiftAction<ProductionEnum>(51);
    ShiftAction<ProductionEnum> shift122 =
      new ShiftAction<ProductionEnum>(122);
    ShiftAction<ProductionEnum> shift37 =
      new ShiftAction<ProductionEnum>(37);
    ShiftAction<ProductionEnum> shift27 =
      new ShiftAction<ProductionEnum>(27);
    ShiftAction<ProductionEnum> shift111 =
      new ShiftAction<ProductionEnum>(111);
    ShiftAction<ProductionEnum> shift77 =
      new ShiftAction<ProductionEnum>(77);
    ShiftAction<ProductionEnum> shift128 =
      new ShiftAction<ProductionEnum>(128);
    ShiftAction<ProductionEnum> shift38 =
      new ShiftAction<ProductionEnum>(38);
    ShiftAction<ProductionEnum> shift26 =
      new ShiftAction<ProductionEnum>(26);
    ShiftAction<ProductionEnum> shift60 =
      new ShiftAction<ProductionEnum>(60);
    ShiftAction<ProductionEnum> shift68 =
      new ShiftAction<ProductionEnum>(68);
    ShiftAction<ProductionEnum> shift9 =
      new ShiftAction<ProductionEnum>(9);
    ShiftAction<ProductionEnum> shift71 =
      new ShiftAction<ProductionEnum>(71);
    ShiftAction<ProductionEnum> shift64 =
      new ShiftAction<ProductionEnum>(64);
    ErrorAction<ProductionEnum> error0 =
      new ErrorAction<ProductionEnum>("parse error");
    EnumMap<TerminalEnum,Action<ProductionEnum>[]> tableMap =
      new EnumMap<TerminalEnum,Action<ProductionEnum>[]>(TerminalEnum.class);
    Action<ProductionEnum>[] identifierArray=createArray(error0,shift2,error0,reduceempty_instructions_def,reduceempty_var_keyword,error0,reduceempty_instructions_def,reduceempty_var_keyword,shift9,error0,error0,error0,error0,shift9,error0,shift9,error0,shift9,error0,shift9,error0,shift9,error0,error0,error0,error0,shift27,error0,shift29,error0,error0,reduceempty_instructions_def,reduceempty_var_keyword,error0,shift9,error0,error0,error0,reducefunction_type_def,error0,error0,reducevoid_type_def,reduceobject_type_def,reducenumeric_type_def,reducestring_type_def,error0,reducearray_type_def,shift48,error0,error0,shift51,error0,error0,error0,error0,error0,error0,reduceempty_instructions_def,reduceempty_var_keyword,error0,shift9,shift9,error0,error0,shift9,shift9,error0,error0,shift9,error0,shift9,shift9,error0,error0,shift9,error0,error0,shift9,error0,shift9,error0,error0,error0,reduceempty_instructions_def,reduceempty_var_keyword,error0,reduceempty_instructions_def,reduceempty_var_keyword,reducefull_var_keyword,error0,error0,error0,error0,reduceempty_var_keyword,error0,shift9,error0,reduceempty_var_keyword,error0,error0,reduceempty_instructions_def,reduceempty_var_keyword,error0,error0,shift9,error0,error0,error0,error0,shift110,error0,shift9,error0,error0,error0,error0,shift9,error0,shift9,error0,error0,shift122,error0,shift9,error0,error0,reducefull_instructions_def,shift128,error0,shift130,error0,error0,error0,error0,error0,error0,error0,error0);
    tableMap.put(TerminalEnum.identifier,identifierArray);
    Action<ProductionEnum>[] _returnArray=createArray(error0,error0,error0,reduceempty_instructions_def,shift8,error0,reduceempty_instructions_def,shift8,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,reduceempty_instructions_def,shift8,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,reduceempty_instructions_def,shift8,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,reduceempty_instructions_def,shift8,error0,reduceempty_instructions_def,shift8,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,reduceempty_instructions_def,shift8,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,reducefull_instructions_def,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0);
    tableMap.put(TerminalEnum._return,_returnArray);
    Action<ProductionEnum>[] minusArray=createArray(error0,error0,error0,error0,error0,error0,error0,error0,error0,reduceidentifier_expr_def,reducenumber_value_def,reducestring_value_def,shift13,error0,reduceminus_def,error0,reducestar_def,error0,reduceplus_def,error0,reducemodulo_def,error0,reducedivide_def,reducenumeric_expr_def,reducestring_expr_def,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,shift13,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,shift13,error0,error0,shift13,shift13,error0,shift13,error0,error0,shift13,shift13,error0,shift13,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,shift13,error0,error0,error0,error0,error0,error0,shift13,error0,error0,error0,error0,error0,error0,shift13,error0,error0,error0,error0,shift13,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0);
    tableMap.put(TerminalEnum.minus,minusArray);
    Action<ProductionEnum>[] starArray=createArray(error0,error0,error0,error0,error0,error0,error0,error0,error0,reduceidentifier_expr_def,reducenumber_value_def,reducestring_value_def,shift15,error0,shift15,error0,reducestar_def,error0,shift15,error0,reducemodulo_def,error0,reducedivide_def,reducenumeric_expr_def,reducestring_expr_def,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,shift15,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,shift15,error0,error0,shift15,shift15,error0,shift15,error0,error0,shift15,shift15,error0,shift15,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,shift15,error0,error0,error0,error0,error0,error0,shift15,error0,error0,error0,error0,error0,error0,shift15,error0,error0,error0,error0,shift15,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0);
    tableMap.put(TerminalEnum.star,starArray);
    Action<ProductionEnum>[] array_typeArray=createArray(error0,error0,error0,reduceempty_instructions_def,reduceempty_var_keyword,error0,reduceempty_instructions_def,reduceempty_var_keyword,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,reduceempty_instructions_def,reduceempty_var_keyword,error0,error0,error0,error0,shift39,error0,error0,shift39,error0,error0,error0,error0,error0,error0,error0,error0,shift39,error0,error0,error0,shift39,error0,error0,error0,reduceempty_instructions_def,reduceempty_var_keyword,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,reduceempty_instructions_def,reduceempty_var_keyword,error0,reduceempty_instructions_def,reduceempty_var_keyword,reducefull_var_keyword,error0,error0,error0,error0,reduceempty_var_keyword,error0,error0,error0,reduceempty_var_keyword,error0,error0,reduceempty_instructions_def,reduceempty_var_keyword,error0,error0,error0,error0,error0,error0,error0,shift39,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,reducefull_instructions_def,shift39,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0);
    tableMap.put(TerminalEnum.array_type,array_typeArray);
    Action<ProductionEnum>[] r_braceArray=createArray(error0,error0,error0,reduceempty_instructions_def,shift135,error0,reduceempty_instructions_def,shift134,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,reduceempty_instructions_def,shift133,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,reduceempty_instructions_def,shift132,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,reduceempty_instructions_def,shift85,error0,reduceempty_instructions_def,shift89,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,reduceempty_instructions_def,shift102,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,reducefull_instructions_def,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0);
    tableMap.put(TerminalEnum.r_brace,r_braceArray);
    Action<ProductionEnum>[] _varArray=createArray(error0,error0,error0,reduceempty_instructions_def,shift88,error0,reduceempty_instructions_def,shift88,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,reduceempty_instructions_def,shift88,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,reduceempty_instructions_def,shift88,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,reduceempty_instructions_def,shift88,error0,reduceempty_instructions_def,shift88,error0,error0,error0,error0,error0,shift88,error0,error0,error0,shift88,error0,error0,reduceempty_instructions_def,shift88,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,reducefull_instructions_def,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0);
    tableMap.put(TerminalEnum._var,_varArray);
    Action<ProductionEnum>[] moduloArray=createArray(error0,error0,error0,error0,error0,error0,error0,error0,error0,reduceidentifier_expr_def,reducenumber_value_def,reducestring_value_def,shift19,error0,shift19,error0,reducestar_def,error0,shift19,error0,reducemodulo_def,error0,reducedivide_def,reducenumeric_expr_def,reducestring_expr_def,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,shift19,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,shift19,error0,error0,shift19,shift19,error0,shift19,error0,error0,shift19,shift19,error0,shift19,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,shift19,error0,error0,error0,error0,error0,error0,shift19,error0,error0,error0,error0,error0,error0,shift19,error0,error0,error0,error0,shift19,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0);
    tableMap.put(TerminalEnum.modulo,moduloArray);
    Action<ProductionEnum>[] _breakArray=createArray(error0,error0,error0,reduceempty_instructions_def,shift90,error0,reduceempty_instructions_def,shift90,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,reduceempty_instructions_def,shift90,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,reduceempty_instructions_def,shift90,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,reduceempty_instructions_def,shift90,error0,reduceempty_instructions_def,shift90,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,reduceempty_instructions_def,shift90,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,reducefull_instructions_def,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0);
    tableMap.put(TerminalEnum._break,_breakArray);
    Action<ProductionEnum>[] printArray=createArray(error0,error0,error0,reduceempty_instructions_def,shift103,error0,reduceempty_instructions_def,shift103,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,reduceempty_instructions_def,shift103,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,reduceempty_instructions_def,shift103,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,reduceempty_instructions_def,shift103,error0,reduceempty_instructions_def,shift103,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,reduceempty_instructions_def,shift103,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,reducefull_instructions_def,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0);
    tableMap.put(TerminalEnum.print,printArray);
    Action<ProductionEnum>[] object_typeArray=createArray(error0,error0,error0,reduceempty_instructions_def,reduceempty_var_keyword,error0,reduceempty_instructions_def,reduceempty_var_keyword,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,reduceempty_instructions_def,reduceempty_var_keyword,error0,error0,error0,error0,shift42,error0,error0,shift42,error0,error0,error0,error0,error0,error0,error0,error0,shift42,error0,error0,error0,shift42,error0,error0,error0,reduceempty_instructions_def,reduceempty_var_keyword,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,reduceempty_instructions_def,reduceempty_var_keyword,error0,reduceempty_instructions_def,reduceempty_var_keyword,reducefull_var_keyword,error0,error0,error0,error0,reduceempty_var_keyword,error0,error0,error0,reduceempty_var_keyword,error0,error0,reduceempty_instructions_def,reduceempty_var_keyword,error0,error0,error0,error0,error0,error0,error0,shift42,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,reducefull_instructions_def,shift42,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0);
    tableMap.put(TerminalEnum.object_type,object_typeArray);
    Action<ProductionEnum>[] numeric_typeArray=createArray(error0,error0,error0,reduceempty_instructions_def,reduceempty_var_keyword,error0,reduceempty_instructions_def,reduceempty_var_keyword,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,reduceempty_instructions_def,reduceempty_var_keyword,error0,error0,error0,error0,shift43,error0,error0,shift43,error0,error0,error0,error0,error0,error0,error0,error0,shift43,error0,error0,error0,shift43,error0,error0,error0,reduceempty_instructions_def,reduceempty_var_keyword,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,reduceempty_instructions_def,reduceempty_var_keyword,error0,reduceempty_instructions_def,reduceempty_var_keyword,reducefull_var_keyword,error0,error0,error0,error0,reduceempty_var_keyword,error0,error0,error0,reduceempty_var_keyword,error0,error0,reduceempty_instructions_def,reduceempty_var_keyword,error0,error0,error0,error0,error0,error0,error0,shift43,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,reducefull_instructions_def,shift43,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0);
    tableMap.put(TerminalEnum.numeric_type,numeric_typeArray);
    Action<ProductionEnum>[] infArray=createArray(error0,error0,error0,error0,error0,error0,error0,error0,error0,reduceidentifier_expr_def,reducenumber_value_def,reducestring_value_def,error0,error0,reduceminus_def,error0,reducestar_def,error0,reduceplus_def,error0,reducemodulo_def,error0,reducedivide_def,reducenumeric_expr_def,reducestring_expr_def,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,reducefunction_type_def,error0,error0,reducevoid_type_def,reduceobject_type_def,reducenumeric_type_def,reducestring_type_def,shift46,reducearray_type_def,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,shift64,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0);
    tableMap.put(TerminalEnum.inf,infArray);
    Action<ProductionEnum>[] printlnArray=createArray(error0,error0,error0,reduceempty_instructions_def,shift33,error0,reduceempty_instructions_def,shift33,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,reduceempty_instructions_def,shift33,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,reduceempty_instructions_def,shift33,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,reduceempty_instructions_def,shift33,error0,reduceempty_instructions_def,shift33,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,reduceempty_instructions_def,shift33,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,reducefull_instructions_def,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0);
    tableMap.put(TerminalEnum.println,printlnArray);
    Action<ProductionEnum>[] lparArray=createArray(error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,shift26,error0,error0,error0,error0,error0,error0,error0,shift34,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,shift49,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,shift60,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,shift93,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,shift104,error0,error0,error0,error0,error0,error0,shift111,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0);
    tableMap.put(TerminalEnum.lpar,lparArray);
    Action<ProductionEnum>[] plusArray=createArray(error0,error0,error0,error0,error0,error0,error0,error0,error0,reduceidentifier_expr_def,reducenumber_value_def,reducestring_value_def,shift17,error0,reduceminus_def,error0,reducestar_def,error0,reduceplus_def,error0,reducemodulo_def,error0,reducedivide_def,reducenumeric_expr_def,reducestring_expr_def,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,shift17,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,shift17,error0,error0,shift17,shift17,error0,shift17,error0,error0,shift17,shift17,error0,shift17,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,shift17,error0,error0,error0,error0,error0,error0,shift17,error0,error0,error0,error0,error0,error0,shift17,error0,error0,error0,error0,shift17,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0);
    tableMap.put(TerminalEnum.plus,plusArray);
    Action<ProductionEnum>[] _voidArray=createArray(error0,error0,error0,reduceempty_instructions_def,reduceempty_var_keyword,error0,reduceempty_instructions_def,reduceempty_var_keyword,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,reduceempty_instructions_def,reduceempty_var_keyword,error0,error0,error0,error0,shift41,error0,error0,shift41,error0,error0,error0,error0,error0,error0,error0,error0,shift41,error0,error0,error0,shift41,error0,error0,error0,reduceempty_instructions_def,reduceempty_var_keyword,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,reduceempty_instructions_def,reduceempty_var_keyword,error0,reduceempty_instructions_def,reduceempty_var_keyword,reducefull_var_keyword,error0,error0,error0,error0,reduceempty_var_keyword,error0,error0,error0,reduceempty_var_keyword,error0,error0,reduceempty_instructions_def,reduceempty_var_keyword,error0,error0,error0,error0,error0,error0,error0,shift41,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,reducefull_instructions_def,shift41,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0);
    tableMap.put(TerminalEnum._void,_voidArray);
    Action<ProductionEnum>[] _inArray=createArray(error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,shift28,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0);
    tableMap.put(TerminalEnum._in,_inArray);
    Action<ProductionEnum>[] andArray=createArray(error0,error0,error0,error0,error0,error0,error0,error0,error0,reduceidentifier_expr_def,reducenumber_value_def,reducestring_value_def,error0,error0,reduceminus_def,error0,reducestar_def,error0,reduceplus_def,error0,reducemodulo_def,error0,reducedivide_def,reducenumeric_expr_def,reducestring_expr_def,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,reducebooleanValue_def,error0,error0,error0,reduceinf_equals_def,reduceinf_def,error0,reduceequals_def,error0,error0,reducesup_equals_def,reducesup_def,error0,reducenot_equals_def,reducenot_def,error0,shift79,error0,reduceand_def,shift79,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,shift79,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0);
    tableMap.put(TerminalEnum.and,andArray);
    Action<ProductionEnum>[] stringValueArray=createArray(error0,error0,error0,error0,error0,error0,error0,error0,shift11,error0,error0,error0,error0,shift11,error0,shift11,error0,shift11,error0,shift11,error0,shift11,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,shift11,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,shift11,shift11,error0,error0,shift11,shift11,error0,error0,shift11,error0,shift11,shift11,error0,error0,shift11,error0,error0,shift11,error0,shift11,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,shift11,error0,error0,error0,error0,error0,error0,error0,error0,shift11,error0,error0,error0,error0,error0,error0,shift11,error0,error0,error0,error0,shift11,error0,shift11,error0,error0,error0,error0,shift11,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0);
    tableMap.put(TerminalEnum.stringValue,stringValueArray);
    Action<ProductionEnum>[] equalsArray=createArray(error0,error0,error0,error0,error0,error0,error0,error0,error0,reduceidentifier_expr_def,reducenumber_value_def,reducestring_value_def,error0,error0,reduceminus_def,error0,reducestar_def,error0,reduceplus_def,error0,reducemodulo_def,error0,reducedivide_def,reducenumeric_expr_def,reducestring_expr_def,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,shift68,shift65,error0,error0,error0,error0,error0,shift71,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,shift118,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,shift123,error0,error0,error0,error0,error0,shift118,error0,shift123,error0,error0,error0,error0,error0,error0,error0);
    tableMap.put(TerminalEnum.equals,equalsArray);
    Action<ProductionEnum>[] supArray=createArray(error0,error0,error0,error0,error0,error0,error0,error0,error0,reduceidentifier_expr_def,reducenumber_value_def,reducestring_value_def,error0,error0,reduceminus_def,error0,reducestar_def,error0,reduceplus_def,error0,reducemodulo_def,error0,reducedivide_def,reducenumeric_expr_def,reducestring_expr_def,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,shift40,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,shift70,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0);
    tableMap.put(TerminalEnum.sup,supArray);
    Action<ProductionEnum>[] notEqualsArray=createArray(error0,error0,error0,error0,error0,error0,error0,error0,error0,reduceidentifier_expr_def,reducenumber_value_def,reducestring_value_def,error0,error0,reduceminus_def,error0,reducestar_def,error0,reduceplus_def,error0,reducemodulo_def,error0,reducedivide_def,reducenumeric_expr_def,reducestring_expr_def,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,shift74,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0);
    tableMap.put(TerminalEnum.notEquals,notEqualsArray);
    Action<ProductionEnum>[] dingoArray=createArray(shift1,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0);
    tableMap.put(TerminalEnum.dingo,dingoArray);
    Action<ProductionEnum>[] foreverArray=createArray(error0,error0,error0,reduceempty_instructions_def,shift5,error0,reduceempty_instructions_def,shift5,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,reduceempty_instructions_def,shift5,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,reduceempty_instructions_def,shift5,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,reduceempty_instructions_def,shift5,error0,reduceempty_instructions_def,shift5,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,reduceempty_instructions_def,shift5,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,reducefull_instructions_def,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0);
    tableMap.put(TerminalEnum.forever,foreverArray);
    Action<ProductionEnum>[] notArray=createArray(error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,shift61,shift61,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,shift61,error0,shift61,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,shift61,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0);
    tableMap.put(TerminalEnum.not,notArray);
    Action<ProductionEnum>[] numberValueArray=createArray(error0,error0,error0,error0,error0,error0,error0,error0,shift10,error0,error0,error0,error0,shift10,error0,shift10,error0,shift10,error0,shift10,error0,shift10,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,shift10,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,shift10,shift10,error0,error0,shift10,shift10,error0,error0,shift10,error0,shift10,shift10,error0,error0,shift10,error0,error0,shift10,error0,shift10,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,shift10,error0,error0,error0,error0,error0,error0,error0,error0,shift10,error0,error0,error0,error0,error0,error0,shift10,error0,error0,error0,error0,shift10,error0,shift10,error0,error0,error0,error0,shift10,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0);
    tableMap.put(TerminalEnum.numberValue,numberValueArray);
    Action<ProductionEnum>[] semicolonArray=createArray(error0,error0,error0,error0,error0,error0,error0,error0,error0,reduceidentifier_expr_def,reducenumber_value_def,reducestring_value_def,reducereturn_def,error0,reduceminus_def,error0,reducestar_def,error0,reduceplus_def,error0,reducemodulo_def,error0,reducedivide_def,reducenumeric_expr_def,reducestring_expr_def,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,reduceprintln_def,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,reducebooleanValue_def,error0,error0,error0,reduceinf_equals_def,reduceinf_def,error0,reduceequals_def,error0,error0,reducesup_equals_def,reducesup_def,error0,reducenot_equals_def,reducenot_def,error0,reduceor_def,error0,reduceand_def,error0,error0,error0,error0,reduceempty_else_bloc,error0,error0,error0,reducefull_else_bloc,reducebreak_def,reducecontinue_def,error0,error0,shift95,error0,shift97,error0,error0,error0,error0,error0,reducefor_def,error0,error0,error0,reduceprint_def,reduceinstruction_expr_def,reduceinit_def,error0,reduceempty_function_call_def,error0,error0,error0,reducefunction_call_def,error0,error0,error0,error0,reduceempty_type_init_identifier_def,reduceempty_type_expr_def,error0,reducefull_type_expr_def,error0,reducefull_type_init_identifier_def,shift126,error0,error0,error0,error0,error0,reduceif_def,reducefunction_definition,reduceforeach_def,reduceforever_def,error0,error0,error0);
    tableMap.put(TerminalEnum.semicolon,semicolonArray);
    Action<ProductionEnum>[] __eof__Array=createArray(error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,reducedingo_start,accept,accept);
    tableMap.put(TerminalEnum.__eof__,__eof__Array);
    Action<ProductionEnum>[] orArray=createArray(error0,error0,error0,error0,error0,error0,error0,error0,error0,reduceidentifier_expr_def,reducenumber_value_def,reducestring_value_def,error0,error0,reduceminus_def,error0,reducestar_def,error0,reduceplus_def,error0,reducemodulo_def,error0,reducedivide_def,reducenumeric_expr_def,reducestring_expr_def,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,reducebooleanValue_def,error0,error0,error0,reduceinf_equals_def,reduceinf_def,error0,reduceequals_def,error0,error0,reducesup_equals_def,reducesup_def,error0,reducenot_equals_def,reducenot_def,error0,reduceor_def,error0,reduceand_def,shift77,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,shift77,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0);
    tableMap.put(TerminalEnum.or,orArray);
    Action<ProductionEnum>[] l_braceArray=createArray(error0,error0,shift3,error0,error0,shift6,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,shift31,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,shift57,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,shift83,error0,error0,shift86,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,shift100,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0);
    tableMap.put(TerminalEnum.l_brace,l_braceArray);
    Action<ProductionEnum>[] _forArray=createArray(error0,error0,error0,reduceempty_instructions_def,shift92,error0,reduceempty_instructions_def,shift92,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,reduceempty_instructions_def,shift92,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,reduceempty_instructions_def,shift92,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,reduceempty_instructions_def,shift92,error0,reduceempty_instructions_def,shift92,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,reduceempty_instructions_def,shift92,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,reducefull_instructions_def,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0);
    tableMap.put(TerminalEnum._for,_forArray);
    Action<ProductionEnum>[] booleanValueArray=createArray(error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,shift62,shift62,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,shift62,error0,shift62,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,shift62,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0);
    tableMap.put(TerminalEnum.booleanValue,booleanValueArray);
    Action<ProductionEnum>[] _foreachArray=createArray(error0,error0,error0,reduceempty_instructions_def,shift25,error0,reduceempty_instructions_def,shift25,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,reduceempty_instructions_def,shift25,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,reduceempty_instructions_def,shift25,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,reduceempty_instructions_def,shift25,error0,reduceempty_instructions_def,shift25,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,reduceempty_instructions_def,shift25,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,reducefull_instructions_def,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0);
    tableMap.put(TerminalEnum._foreach,_foreachArray);
    Action<ProductionEnum>[] function_typeArray=createArray(error0,error0,error0,reduceempty_instructions_def,reduceempty_var_keyword,error0,reduceempty_instructions_def,reduceempty_var_keyword,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,reduceempty_instructions_def,reduceempty_var_keyword,error0,error0,error0,error0,shift38,error0,error0,shift38,error0,error0,error0,error0,error0,error0,error0,error0,shift38,error0,error0,error0,shift38,error0,error0,error0,reduceempty_instructions_def,reduceempty_var_keyword,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,reduceempty_instructions_def,reduceempty_var_keyword,error0,reduceempty_instructions_def,reduceempty_var_keyword,reducefull_var_keyword,error0,error0,error0,error0,reduceempty_var_keyword,error0,error0,error0,reduceempty_var_keyword,error0,error0,reduceempty_instructions_def,reduceempty_var_keyword,error0,error0,error0,error0,error0,error0,error0,shift38,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,reducefull_instructions_def,shift38,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0);
    tableMap.put(TerminalEnum.function_type,function_typeArray);
    Action<ProductionEnum>[] defArray=createArray(error0,error0,error0,reduceempty_instructions_def,shift37,error0,reduceempty_instructions_def,shift37,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,reduceempty_instructions_def,shift37,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,reduceempty_instructions_def,shift37,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,reduceempty_instructions_def,shift37,error0,reduceempty_instructions_def,shift37,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,reduceempty_instructions_def,shift37,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,reducefull_instructions_def,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0);
    tableMap.put(TerminalEnum.def,defArray);
    Action<ProductionEnum>[] commaArray=createArray(error0,error0,error0,error0,error0,error0,error0,error0,error0,reduceidentifier_expr_def,reducenumber_value_def,reducestring_value_def,error0,error0,reduceminus_def,error0,reducestar_def,error0,reduceplus_def,error0,reducemodulo_def,error0,reducedivide_def,reducenumeric_expr_def,reducestring_expr_def,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,reduceparam_def,shift53,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,reducearg_def,error0,error0,shift116,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0);
    tableMap.put(TerminalEnum.comma,commaArray);
    Action<ProductionEnum>[] _ifArray=createArray(error0,error0,error0,reduceempty_instructions_def,shift59,error0,reduceempty_instructions_def,shift59,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,reduceempty_instructions_def,shift59,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,reduceempty_instructions_def,shift59,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,reduceempty_instructions_def,shift59,error0,reduceempty_instructions_def,shift59,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,reduceempty_instructions_def,shift59,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,reducefull_instructions_def,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0);
    tableMap.put(TerminalEnum._if,_ifArray);
    Action<ProductionEnum>[] divArray=createArray(error0,error0,error0,error0,error0,error0,error0,error0,error0,reduceidentifier_expr_def,reducenumber_value_def,reducestring_value_def,shift21,error0,shift21,error0,reducestar_def,error0,shift21,error0,reducemodulo_def,error0,reducedivide_def,reducenumeric_expr_def,reducestring_expr_def,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,shift21,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,shift21,error0,error0,shift21,shift21,error0,shift21,error0,error0,shift21,shift21,error0,shift21,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,shift21,error0,error0,error0,error0,error0,error0,shift21,error0,error0,error0,error0,error0,error0,shift21,error0,error0,error0,error0,shift21,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0);
    tableMap.put(TerminalEnum.div,divArray);
    Action<ProductionEnum>[] _continueArray=createArray(error0,error0,error0,reduceempty_instructions_def,shift91,error0,reduceempty_instructions_def,shift91,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,reduceempty_instructions_def,shift91,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,reduceempty_instructions_def,shift91,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,reduceempty_instructions_def,shift91,error0,reduceempty_instructions_def,shift91,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,reduceempty_instructions_def,shift91,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,reducefull_instructions_def,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0);
    tableMap.put(TerminalEnum._continue,_continueArray);
    Action<ProductionEnum>[] rparArray=createArray(error0,error0,error0,error0,error0,error0,error0,error0,error0,reduceidentifier_expr_def,reducenumber_value_def,reducestring_value_def,error0,error0,reduceminus_def,error0,reducestar_def,error0,reduceplus_def,error0,reducemodulo_def,error0,reducedivide_def,reducenumeric_expr_def,reducestring_expr_def,error0,error0,error0,error0,shift30,error0,error0,error0,error0,error0,shift36,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,reduceempty_params_list_def,error0,reduceparam_def,reduceone_param_list_def,reduceempty_params_list_def,reduceparams_list_def,shift56,error0,error0,error0,error0,error0,error0,reducebooleanValue_def,error0,error0,error0,reduceinf_equals_def,reduceinf_def,error0,reduceequals_def,error0,error0,reducesup_equals_def,reducesup_def,error0,reducenot_equals_def,reducenot_def,error0,reduceor_def,error0,reduceand_def,shift82,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,shift99,error0,error0,error0,error0,error0,error0,shift106,error0,error0,error0,error0,error0,reduceempty_args_list_def,reducearg_def,shift114,error0,reduceone_arg_list_def,reduceempty_args_list_def,reduceargs_list_def,error0,reduceempty_type_init_identifier_def,error0,error0,error0,error0,reducefull_type_init_identifier_def,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0);
    tableMap.put(TerminalEnum.rpar,rparArray);
    Action<ProductionEnum>[] string_typeArray=createArray(error0,error0,error0,reduceempty_instructions_def,reduceempty_var_keyword,error0,reduceempty_instructions_def,reduceempty_var_keyword,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,reduceempty_instructions_def,reduceempty_var_keyword,error0,error0,error0,error0,shift44,error0,error0,shift44,error0,error0,error0,error0,error0,error0,error0,error0,shift44,error0,error0,error0,shift44,error0,error0,error0,reduceempty_instructions_def,reduceempty_var_keyword,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,reduceempty_instructions_def,reduceempty_var_keyword,error0,reduceempty_instructions_def,reduceempty_var_keyword,reducefull_var_keyword,error0,error0,error0,error0,reduceempty_var_keyword,error0,error0,error0,reduceempty_var_keyword,error0,error0,reduceempty_instructions_def,reduceempty_var_keyword,error0,error0,error0,error0,error0,error0,error0,shift44,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,reducefull_instructions_def,shift44,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0);
    tableMap.put(TerminalEnum.string_type,string_typeArray);
    StateMetadata<TerminalEnum,NonTerminalEnum>[] tableMetadata = id(
      StateMetadata.<TerminalEnum,NonTerminalEnum>createWithTerminal(TerminalEnum.minus),
      StateMetadata.<TerminalEnum,NonTerminalEnum>createWithTerminal(TerminalEnum.star),
      StateMetadata.<TerminalEnum,NonTerminalEnum>createWithNonTerminal(NonTerminalEnum.expr),
      StateMetadata.<TerminalEnum,NonTerminalEnum>createWithTerminal(TerminalEnum.array_type),
      StateMetadata.<TerminalEnum,NonTerminalEnum>createWithTerminal(TerminalEnum.r_brace),
      StateMetadata.<TerminalEnum,NonTerminalEnum>createWithNonTerminal(NonTerminalEnum.start),
      StateMetadata.<TerminalEnum,NonTerminalEnum>createWithTerminal(TerminalEnum.lpar),
      StateMetadata.<TerminalEnum,NonTerminalEnum>createWithTerminal(TerminalEnum.println),
      StateMetadata.<TerminalEnum,NonTerminalEnum>createWithNonTerminal(NonTerminalEnum.else_bloc),
      StateMetadata.<TerminalEnum,NonTerminalEnum>createWithTerminal(TerminalEnum._void),
      StateMetadata.<TerminalEnum,NonTerminalEnum>createWithNonTerminal(NonTerminalEnum.var),
      StateMetadata.<TerminalEnum,NonTerminalEnum>createWithTerminal(TerminalEnum._in),
      StateMetadata.<TerminalEnum,NonTerminalEnum>createWithTerminal(TerminalEnum.equals),
      StateMetadata.<TerminalEnum,NonTerminalEnum>createWithTerminal(TerminalEnum.dingo),
      StateMetadata.<TerminalEnum,NonTerminalEnum>createWithTerminal(TerminalEnum.forever),
      StateMetadata.<TerminalEnum,NonTerminalEnum>createWithNonTerminal(NonTerminalEnum.expr_def),
      StateMetadata.<TerminalEnum,NonTerminalEnum>createWithTerminal(TerminalEnum.numberValue),
      StateMetadata.<TerminalEnum,NonTerminalEnum>createWithTerminal(TerminalEnum.semicolon),
      StateMetadata.<TerminalEnum,NonTerminalEnum>createWithTerminal(TerminalEnum.or),
      StateMetadata.<TerminalEnum,NonTerminalEnum>createWithTerminal(TerminalEnum._for),
      StateMetadata.<TerminalEnum,NonTerminalEnum>createWithNonTerminal(NonTerminalEnum.instructions),
      StateMetadata.<TerminalEnum,NonTerminalEnum>createWithNonTerminal(NonTerminalEnum.type),
      StateMetadata.<TerminalEnum,NonTerminalEnum>createWithTerminal(TerminalEnum._foreach),
      StateMetadata.<TerminalEnum,NonTerminalEnum>createWithTerminal(TerminalEnum.def),
      StateMetadata.<TerminalEnum,NonTerminalEnum>createWithNonTerminal(NonTerminalEnum.init),
      StateMetadata.<TerminalEnum,NonTerminalEnum>createWithNonTerminal(NonTerminalEnum.numeric_expr),
      StateMetadata.<TerminalEnum,NonTerminalEnum>createWithTerminal(TerminalEnum._if),
      StateMetadata.<TerminalEnum,NonTerminalEnum>createWithTerminal(TerminalEnum._continue),
      StateMetadata.<TerminalEnum,NonTerminalEnum>createWithNonTerminal(NonTerminalEnum.instruction),
      StateMetadata.<TerminalEnum,NonTerminalEnum>createWithTerminal(TerminalEnum.string_type),
      StateMetadata.<TerminalEnum,NonTerminalEnum>createWithTerminal(TerminalEnum._return),
      StateMetadata.<TerminalEnum,NonTerminalEnum>createWithTerminal(TerminalEnum.identifier),
      StateMetadata.<TerminalEnum,NonTerminalEnum>createWithNonTerminal(NonTerminalEnum.booleanExpr),
      StateMetadata.<TerminalEnum,NonTerminalEnum>createWithTerminal(TerminalEnum.modulo),
      StateMetadata.<TerminalEnum,NonTerminalEnum>createWithTerminal(TerminalEnum._var),
      StateMetadata.<TerminalEnum,NonTerminalEnum>createWithTerminal(TerminalEnum._break),
      StateMetadata.<TerminalEnum,NonTerminalEnum>createWithTerminal(TerminalEnum.print),
      StateMetadata.<TerminalEnum,NonTerminalEnum>createWithTerminal(TerminalEnum.object_type),
      StateMetadata.<TerminalEnum,NonTerminalEnum>createWithNonTerminal(NonTerminalEnum.string_expr),
      StateMetadata.<TerminalEnum,NonTerminalEnum>createWithTerminal(TerminalEnum.numeric_type),
      StateMetadata.<TerminalEnum,NonTerminalEnum>createWithTerminal(TerminalEnum.inf),
      StateMetadata.<TerminalEnum,NonTerminalEnum>createWithNonTerminal(NonTerminalEnum.args_list),
      StateMetadata.<TerminalEnum,NonTerminalEnum>createWithTerminal(TerminalEnum.plus),
      StateMetadata.<TerminalEnum,NonTerminalEnum>createWithTerminal(TerminalEnum.stringValue),
      StateMetadata.<TerminalEnum,NonTerminalEnum>createWithTerminal(TerminalEnum.and),
      StateMetadata.<TerminalEnum,NonTerminalEnum>createWithTerminal(TerminalEnum.sup),
      StateMetadata.<TerminalEnum,NonTerminalEnum>createWithTerminal(TerminalEnum.notEquals),
      StateMetadata.<TerminalEnum,NonTerminalEnum>createWithTerminal(TerminalEnum.not),
      StateMetadata.<TerminalEnum,NonTerminalEnum>createWithNonTerminal(NonTerminalEnum.param),
      StateMetadata.<TerminalEnum,NonTerminalEnum>createWithTerminal(TerminalEnum.__eof__),
      StateMetadata.<TerminalEnum,NonTerminalEnum>createWithTerminal(TerminalEnum.l_brace),
      StateMetadata.<TerminalEnum,NonTerminalEnum>createWithTerminal(TerminalEnum.booleanValue),
      StateMetadata.<TerminalEnum,NonTerminalEnum>createWithNonTerminal(NonTerminalEnum.params_list),
      StateMetadata.<TerminalEnum,NonTerminalEnum>createWithNonTerminal(NonTerminalEnum.arg),
      StateMetadata.<TerminalEnum,NonTerminalEnum>createWithTerminal(TerminalEnum.function_type),
      StateMetadata.<TerminalEnum,NonTerminalEnum>createWithTerminal(TerminalEnum.comma),
      StateMetadata.<TerminalEnum,NonTerminalEnum>createWithTerminal(TerminalEnum.div),
      StateMetadata.<TerminalEnum,NonTerminalEnum>createWithTerminal(TerminalEnum.rpar),
      StateMetadata.<TerminalEnum,NonTerminalEnum>createWithNonTerminal(NonTerminalEnum.function_call));
    EnumMap<NonTerminalEnum,Integer> tableStarts =
      new EnumMap<NonTerminalEnum,Integer>(NonTerminalEnum.class);
    tableStarts.put(NonTerminalEnum.start,0);
    table = new ParserTable<TerminalEnum,NonTerminalEnum,ProductionEnum>(tableMap,tableMetadata,tableStarts,138,TerminalEnum.__eof__,null);
  }
}
