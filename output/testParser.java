// $ANTLR 3.5.1 /Users/xuyi/Downloads/ANTLR/test.g 2015-06-27 11:06:22

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

import org.antlr.runtime.debug.*;
import java.io.IOException;
@SuppressWarnings("all")
public class testParser extends DebugParser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "EXPONENT", "FLOAT", "HEX_DIGIT", 
		"ID", "INT", "'('", "')'", "'*'", "','", "';'", "'='", "'['", "']'", "'char'", 
		"'double'", "'float'", "'if'", "'int'", "'long'", "'short'", "'void'", 
		"'{'", "'}'"
	};
	public static final int EOF=-1;
	public static final int T__9=9;
	public static final int T__10=10;
	public static final int T__11=11;
	public static final int T__12=12;
	public static final int T__13=13;
	public static final int T__14=14;
	public static final int T__15=15;
	public static final int T__16=16;
	public static final int T__17=17;
	public static final int T__18=18;
	public static final int T__19=19;
	public static final int T__20=20;
	public static final int T__21=21;
	public static final int T__22=22;
	public static final int T__23=23;
	public static final int T__24=24;
	public static final int T__25=25;
	public static final int T__26=26;
	public static final int EXPONENT=4;
	public static final int FLOAT=5;
	public static final int HEX_DIGIT=6;
	public static final int ID=7;
	public static final int INT=8;

	// delegates
	public Parser[] getDelegates() {
		return new Parser[] {};
	}

	// delegators


	public static final String[] ruleNames = new String[] {
		"invalidRule", "program", "synpred14_test", "synpred9_test", "function_declaration", 
		"synpred10_test", "type", "synpred15_test", "function_body", "statPart", 
		"array_assign", "synpred20_test", "variable", "declaration", "synpred21_test", 
		"array_length", "synpred19_test", "synpred23_test", "synpred22_test", 
		"variablePart", "basicType", "synpred8_test", "synpred4_test", "synpred5_test", 
		"synpred16_test", "synpred17_test", "synpred7_test", "function_parameters", 
		"synpred1_test", "synpred3_test", "synpred2_test", "stat", "synpred11_test", 
		"synpred18_test", "synpred6_test", "synpred12_test", "var_assign", "synpred13_test"
	};

	public static final boolean[] decisionCanBacktrack = new boolean[] {
		false, // invalid decision
		false, true, false, false, false, false, false, false, false, false
	};

 
	public int ruleLevel = 0;
	public int getRuleLevel() { return ruleLevel; }
	public void incRuleLevel() { ruleLevel++; }
	public void decRuleLevel() { ruleLevel--; }
	public testParser(TokenStream input) {
		this(input, DebugEventSocketProxy.DEFAULT_DEBUGGER_PORT, new RecognizerSharedState());
	}
	public testParser(TokenStream input, int port, RecognizerSharedState state) {
		super(input, state);
		DebugEventSocketProxy proxy =
			new DebugEventSocketProxy(this, port, null);

		setDebugListener(proxy);
		try {
			proxy.handshake();
		}
		catch (IOException ioe) {
			reportError(ioe);
		}
	}

	public testParser(TokenStream input, DebugEventListener dbg) {
		super(input, dbg, new RecognizerSharedState());
	}

	protected boolean evalPredicate(boolean result, String predicate) {
		dbg.semanticPredicate(result, predicate);
		return result;
	}

	@Override public String[] getTokenNames() { return testParser.tokenNames; }
	@Override public String getGrammarFileName() { return "/Users/xuyi/Downloads/ANTLR/test.g"; }


		



	// $ANTLR start "program"
	// /Users/xuyi/Downloads/ANTLR/test.g:11:1: program : ( declaration )+ ;
	public final void program() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "program");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(11, 0);

		try {
			// /Users/xuyi/Downloads/ANTLR/test.g:12:2: ( ( declaration )+ )
			dbg.enterAlt(1);

			// /Users/xuyi/Downloads/ANTLR/test.g:12:4: ( declaration )+
			{
			dbg.location(12,4);
			// /Users/xuyi/Downloads/ANTLR/test.g:12:4: ( declaration )+
			int cnt1=0;
			try { dbg.enterSubRule(1);

			loop1:
			while (true) {
				int alt1=2;
				try { dbg.enterDecision(1, decisionCanBacktrack[1]);

				int LA1_0 = input.LA(1);
				if ( ((LA1_0 >= 12 && LA1_0 <= 13)||(LA1_0 >= 17 && LA1_0 <= 19)||(LA1_0 >= 21 && LA1_0 <= 24)) ) {
					alt1=1;
				}

				} finally {dbg.exitDecision(1);}

				switch (alt1) {
				case 1 :
					dbg.enterAlt(1);

					// /Users/xuyi/Downloads/ANTLR/test.g:12:4: declaration
					{
					dbg.location(12,4);
					pushFollow(FOLLOW_declaration_in_program28);
					declaration();
					state._fsp--;
					if (state.failed) return;
					}
					break;

				default :
					if ( cnt1 >= 1 ) break loop1;
					if (state.backtracking>0) {state.failed=true; return;}
					EarlyExitException eee = new EarlyExitException(1, input);
					dbg.recognitionException(eee);

					throw eee;
				}
				cnt1++;
			}
			} finally {dbg.exitSubRule(1);}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(13, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "program");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "program"



	// $ANTLR start "declaration"
	// /Users/xuyi/Downloads/ANTLR/test.g:15:1: declaration : ( variable | function_declaration ';' | function_declaration function_body );
	public final void declaration() throws RecognitionException {
		String variable1 =null;
		String function_declaration2 =null;
		String function_declaration3 =null;
		String function_body4 =null;

		try { dbg.enterRule(getGrammarFileName(), "declaration");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(15, 0);

		try {
			// /Users/xuyi/Downloads/ANTLR/test.g:17:2: ( variable | function_declaration ';' | function_declaration function_body )
			int alt2=3;
			try { dbg.enterDecision(2, decisionCanBacktrack[2]);

			int LA2_0 = input.LA(1);
			if ( ((LA2_0 >= 17 && LA2_0 <= 19)||(LA2_0 >= 21 && LA2_0 <= 24)) ) {
				int LA2_1 = input.LA(2);
				if ( (synpred2_test()) ) {
					alt2=1;
				}
				else if ( (synpred3_test()) ) {
					alt2=2;
				}
				else if ( (true) ) {
					alt2=3;
				}

			}
			else if ( ((LA2_0 >= 12 && LA2_0 <= 13)) ) {
				alt2=1;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 2, 0, input);
				dbg.recognitionException(nvae);
				throw nvae;
			}

			} finally {dbg.exitDecision(2);}

			switch (alt2) {
				case 1 :
					dbg.enterAlt(1);

					// /Users/xuyi/Downloads/ANTLR/test.g:17:4: variable
					{
					dbg.location(17,4);
					pushFollow(FOLLOW_variable_in_declaration41);
					variable1=variable();
					state._fsp--;
					if (state.failed) return;dbg.location(18,2);
					if ( state.backtracking==0 ) {
							System.out.println(variable1+"\n");
						}
					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// /Users/xuyi/Downloads/ANTLR/test.g:22:4: function_declaration ';'
					{
					dbg.location(22,4);
					pushFollow(FOLLOW_function_declaration_in_declaration50);
					function_declaration2=function_declaration();
					state._fsp--;
					if (state.failed) return;dbg.location(22,25);
					match(input,13,FOLLOW_13_in_declaration52); if (state.failed) return;dbg.location(23,2);
					if ( state.backtracking==0 ) {
							System.out.println(function_declaration2+";\n");
						}
					}
					break;
				case 3 :
					dbg.enterAlt(3);

					// /Users/xuyi/Downloads/ANTLR/test.g:27:4: function_declaration function_body
					{
					dbg.location(27,4);
					pushFollow(FOLLOW_function_declaration_in_declaration61);
					function_declaration3=function_declaration();
					state._fsp--;
					if (state.failed) return;dbg.location(27,25);
					pushFollow(FOLLOW_function_body_in_declaration63);
					function_body4=function_body();
					state._fsp--;
					if (state.failed) return;dbg.location(28,2);
					if ( state.backtracking==0 ) {
							System.out.println(function_declaration3+function_body4+"\n");
						}
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(31, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "declaration");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "declaration"



	// $ANTLR start "variable"
	// /Users/xuyi/Downloads/ANTLR/test.g:34:1: variable returns [String val] : ( type var_assign next_var= variable | ',' var_assign next_var= variable | type ID array_length array_assign next_var= variable | ',' ID array_length array_assign next_var= variable | ';' );
	public final String variable() throws RecognitionException {
		String val = null;


		Token ID7=null;
		Token ID10=null;
		String next_var =null;
		String var_assign5 =null;
		String var_assign6 =null;
		String array_length8 =null;
		String array_assign9 =null;
		String array_length11 =null;
		String array_assign12 =null;


			val = null;

		try { dbg.enterRule(getGrammarFileName(), "variable");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(34, 0);

		try {
			// /Users/xuyi/Downloads/ANTLR/test.g:38:2: ( type var_assign next_var= variable | ',' var_assign next_var= variable | type ID array_length array_assign next_var= variable | ',' ID array_length array_assign next_var= variable | ';' )
			int alt3=5;
			try { dbg.enterDecision(3, decisionCanBacktrack[3]);

			switch ( input.LA(1) ) {
			case 17:
			case 18:
			case 19:
			case 21:
			case 22:
			case 23:
			case 24:
				{
				switch ( input.LA(2) ) {
				case ID:
					{
					int LA3_4 = input.LA(3);
					if ( ((LA3_4 >= 12 && LA3_4 <= 13)||(LA3_4 >= 17 && LA3_4 <= 19)||(LA3_4 >= 21 && LA3_4 <= 24)) ) {
						alt3=1;
					}
					else if ( (LA3_4==15) ) {
						alt3=3;
					}

					else {
						if (state.backtracking>0) {state.failed=true; return val;}
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 3, 4, input);
							dbg.recognitionException(nvae);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

					}
					break;
				case 12:
				case 13:
				case 17:
				case 18:
				case 19:
				case 21:
				case 22:
				case 23:
				case 24:
					{
					alt3=1;
					}
					break;
				case 11:
					{
					int LA3_6 = input.LA(3);
					if ( (LA3_6==ID) ) {
						int LA3_4 = input.LA(4);
						if ( ((LA3_4 >= 12 && LA3_4 <= 13)||(LA3_4 >= 17 && LA3_4 <= 19)||(LA3_4 >= 21 && LA3_4 <= 24)) ) {
							alt3=1;
						}
						else if ( (LA3_4==15) ) {
							alt3=3;
						}

						else {
							if (state.backtracking>0) {state.failed=true; return val;}
							int nvaeMark = input.mark();
							try {
								for (int nvaeConsume = 0; nvaeConsume < 4 - 1; nvaeConsume++) {
									input.consume();
								}
								NoViableAltException nvae =
									new NoViableAltException("", 3, 4, input);
								dbg.recognitionException(nvae);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}

					}
					else if ( ((LA3_6 >= 12 && LA3_6 <= 13)||(LA3_6 >= 17 && LA3_6 <= 19)||(LA3_6 >= 21 && LA3_6 <= 24)) ) {
						alt3=1;
					}

					else {
						if (state.backtracking>0) {state.failed=true; return val;}
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 3, 6, input);
							dbg.recognitionException(nvae);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

					}
					break;
				default:
					if (state.backtracking>0) {state.failed=true; return val;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 3, 1, input);
						dbg.recognitionException(nvae);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
				}
				break;
			case 12:
				{
				int LA3_2 = input.LA(2);
				if ( (LA3_2==ID) ) {
					int LA3_7 = input.LA(3);
					if ( (LA3_7==15) ) {
						alt3=4;
					}
					else if ( ((LA3_7 >= 12 && LA3_7 <= 13)||(LA3_7 >= 17 && LA3_7 <= 19)||(LA3_7 >= 21 && LA3_7 <= 24)) ) {
						alt3=2;
					}

					else {
						if (state.backtracking>0) {state.failed=true; return val;}
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 3, 7, input);
							dbg.recognitionException(nvae);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

				}
				else if ( ((LA3_2 >= 12 && LA3_2 <= 13)||(LA3_2 >= 17 && LA3_2 <= 19)||(LA3_2 >= 21 && LA3_2 <= 24)) ) {
					alt3=2;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return val;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 3, 2, input);
						dbg.recognitionException(nvae);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case 13:
				{
				alt3=5;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return val;}
				NoViableAltException nvae =
					new NoViableAltException("", 3, 0, input);
				dbg.recognitionException(nvae);
				throw nvae;
			}
			} finally {dbg.exitDecision(3);}

			switch (alt3) {
				case 1 :
					dbg.enterAlt(1);

					// /Users/xuyi/Downloads/ANTLR/test.g:38:4: type var_assign next_var= variable
					{
					dbg.location(38,4);
					pushFollow(FOLLOW_type_in_variable86);
					type();
					state._fsp--;
					if (state.failed) return val;dbg.location(38,9);
					pushFollow(FOLLOW_var_assign_in_variable88);
					var_assign5=var_assign();
					state._fsp--;
					if (state.failed) return val;dbg.location(38,29);
					pushFollow(FOLLOW_variable_in_variable94);
					next_var=variable();
					state._fsp--;
					if (state.failed) return val;dbg.location(39,2);
					if ( state.backtracking==0 ) {
							val = "var " + var_assign5 + next_var;
						}
					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// /Users/xuyi/Downloads/ANTLR/test.g:42:4: ',' var_assign next_var= variable
					{
					dbg.location(42,4);
					match(input,12,FOLLOW_12_in_variable102); if (state.failed) return val;dbg.location(42,8);
					pushFollow(FOLLOW_var_assign_in_variable104);
					var_assign6=var_assign();
					state._fsp--;
					if (state.failed) return val;dbg.location(42,27);
					pushFollow(FOLLOW_variable_in_variable108);
					next_var=variable();
					state._fsp--;
					if (state.failed) return val;dbg.location(43,2);
					if ( state.backtracking==0 ) {
							val = ", "+ var_assign6 + next_var;
						}
					}
					break;
				case 3 :
					dbg.enterAlt(3);

					// /Users/xuyi/Downloads/ANTLR/test.g:46:4: type ID array_length array_assign next_var= variable
					{
					dbg.location(46,4);
					pushFollow(FOLLOW_type_in_variable116);
					type();
					state._fsp--;
					if (state.failed) return val;dbg.location(46,9);
					ID7=(Token)match(input,ID,FOLLOW_ID_in_variable118); if (state.failed) return val;dbg.location(46,12);
					pushFollow(FOLLOW_array_length_in_variable120);
					array_length8=array_length();
					state._fsp--;
					if (state.failed) return val;dbg.location(46,25);
					pushFollow(FOLLOW_array_assign_in_variable122);
					array_assign9=array_assign();
					state._fsp--;
					if (state.failed) return val;dbg.location(46,47);
					pushFollow(FOLLOW_variable_in_variable128);
					next_var=variable();
					state._fsp--;
					if (state.failed) return val;dbg.location(47,2);
					if ( state.backtracking==0 ) {
							val = "var " + (ID7!=null?ID7.getText():null) + array_length8 + array_assign9 + next_var;
						}
					}
					break;
				case 4 :
					dbg.enterAlt(4);

					// /Users/xuyi/Downloads/ANTLR/test.g:50:4: ',' ID array_length array_assign next_var= variable
					{
					dbg.location(50,4);
					match(input,12,FOLLOW_12_in_variable136); if (state.failed) return val;dbg.location(50,8);
					ID10=(Token)match(input,ID,FOLLOW_ID_in_variable138); if (state.failed) return val;dbg.location(50,11);
					pushFollow(FOLLOW_array_length_in_variable140);
					array_length11=array_length();
					state._fsp--;
					if (state.failed) return val;dbg.location(50,24);
					pushFollow(FOLLOW_array_assign_in_variable142);
					array_assign12=array_assign();
					state._fsp--;
					if (state.failed) return val;dbg.location(50,46);
					pushFollow(FOLLOW_variable_in_variable148);
					next_var=variable();
					state._fsp--;
					if (state.failed) return val;dbg.location(51,2);
					if ( state.backtracking==0 ) {
							val = "," + (ID10!=null?ID10.getText():null) + array_length11 + array_assign12 + next_var;
						}
					}
					break;
				case 5 :
					dbg.enterAlt(5);

					// /Users/xuyi/Downloads/ANTLR/test.g:54:4: ';'
					{
					dbg.location(54,4);
					match(input,13,FOLLOW_13_in_variable156); if (state.failed) return val;dbg.location(55,2);
					if ( state.backtracking==0 ) {
							val = ";\n";
						}
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(58, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "variable");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return val;
	}
	// $ANTLR end "variable"



	// $ANTLR start "var_assign"
	// /Users/xuyi/Downloads/ANTLR/test.g:63:1: var_assign returns [String val] : ( ID |);
	public final String var_assign() throws RecognitionException {
		String val = null;



			val = null;

		try { dbg.enterRule(getGrammarFileName(), "var_assign");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(63, 0);

		try {
			// /Users/xuyi/Downloads/ANTLR/test.g:67:2: ( ID |)
			int alt4=2;
			try { dbg.enterDecision(4, decisionCanBacktrack[4]);

			int LA4_0 = input.LA(1);
			if ( (LA4_0==ID) ) {
				alt4=1;
			}
			else if ( ((LA4_0 >= 12 && LA4_0 <= 13)||(LA4_0 >= 17 && LA4_0 <= 19)||(LA4_0 >= 21 && LA4_0 <= 24)) ) {
				alt4=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return val;}
				NoViableAltException nvae =
					new NoViableAltException("", 4, 0, input);
				dbg.recognitionException(nvae);
				throw nvae;
			}

			} finally {dbg.exitDecision(4);}

			switch (alt4) {
				case 1 :
					dbg.enterAlt(1);

					// /Users/xuyi/Downloads/ANTLR/test.g:67:4: ID
					{
					dbg.location(67,4);
					match(input,ID,FOLLOW_ID_in_var_assign181); if (state.failed) return val;dbg.location(68,2);
					if ( state.backtracking==0 ) {
							val = "";
						}
					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// /Users/xuyi/Downloads/ANTLR/test.g:72:2: 
					{
					dbg.location(72,2);
					if ( state.backtracking==0 ) {
							val = "";
						}
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(75, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "var_assign");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return val;
	}
	// $ANTLR end "var_assign"



	// $ANTLR start "array_length"
	// /Users/xuyi/Downloads/ANTLR/test.g:77:1: array_length returns [String val] : ( '[' ID ']' | '[' INT ']' | '[' ']' );
	public final String array_length() throws RecognitionException {
		String val = null;


		Token ID13=null;
		Token INT14=null;


			val = null;

		try { dbg.enterRule(getGrammarFileName(), "array_length");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(77, 0);

		try {
			// /Users/xuyi/Downloads/ANTLR/test.g:81:2: ( '[' ID ']' | '[' INT ']' | '[' ']' )
			int alt5=3;
			try { dbg.enterDecision(5, decisionCanBacktrack[5]);

			int LA5_0 = input.LA(1);
			if ( (LA5_0==15) ) {
				switch ( input.LA(2) ) {
				case ID:
					{
					alt5=1;
					}
					break;
				case INT:
					{
					alt5=2;
					}
					break;
				case 16:
					{
					alt5=3;
					}
					break;
				default:
					if (state.backtracking>0) {state.failed=true; return val;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 5, 1, input);
						dbg.recognitionException(nvae);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
			}

			else {
				if (state.backtracking>0) {state.failed=true; return val;}
				NoViableAltException nvae =
					new NoViableAltException("", 5, 0, input);
				dbg.recognitionException(nvae);
				throw nvae;
			}

			} finally {dbg.exitDecision(5);}

			switch (alt5) {
				case 1 :
					dbg.enterAlt(1);

					// /Users/xuyi/Downloads/ANTLR/test.g:81:4: '[' ID ']'
					{
					dbg.location(81,4);
					match(input,15,FOLLOW_15_in_array_length209); if (state.failed) return val;dbg.location(81,8);
					ID13=(Token)match(input,ID,FOLLOW_ID_in_array_length211); if (state.failed) return val;dbg.location(81,11);
					match(input,16,FOLLOW_16_in_array_length213); if (state.failed) return val;dbg.location(82,2);
					if ( state.backtracking==0 ) {
							val = "[" + (ID13!=null?ID13.getText():null) + "]";
						}
					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// /Users/xuyi/Downloads/ANTLR/test.g:85:4: '[' INT ']'
					{
					dbg.location(85,4);
					match(input,15,FOLLOW_15_in_array_length221); if (state.failed) return val;dbg.location(85,8);
					INT14=(Token)match(input,INT,FOLLOW_INT_in_array_length223); if (state.failed) return val;dbg.location(85,12);
					match(input,16,FOLLOW_16_in_array_length225); if (state.failed) return val;dbg.location(86,2);
					if ( state.backtracking==0 ) {
							val = "[" + (INT14!=null?INT14.getText():null) + "]";
						}
					}
					break;
				case 3 :
					dbg.enterAlt(3);

					// /Users/xuyi/Downloads/ANTLR/test.g:89:4: '[' ']'
					{
					dbg.location(89,4);
					match(input,15,FOLLOW_15_in_array_length233); if (state.failed) return val;dbg.location(89,8);
					match(input,16,FOLLOW_16_in_array_length235); if (state.failed) return val;dbg.location(90,2);
					if ( state.backtracking==0 ) {
							val = "[" + "]";
						}
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(93, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "array_length");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return val;
	}
	// $ANTLR end "array_length"



	// $ANTLR start "array_assign"
	// /Users/xuyi/Downloads/ANTLR/test.g:98:1: array_assign returns [String val] : ( '=' '{' '}' |);
	public final String array_assign() throws RecognitionException {
		String val = null;



			val = null;

		try { dbg.enterRule(getGrammarFileName(), "array_assign");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(98, 0);

		try {
			// /Users/xuyi/Downloads/ANTLR/test.g:102:2: ( '=' '{' '}' |)
			int alt6=2;
			try { dbg.enterDecision(6, decisionCanBacktrack[6]);

			int LA6_0 = input.LA(1);
			if ( (LA6_0==14) ) {
				alt6=1;
			}
			else if ( ((LA6_0 >= 12 && LA6_0 <= 13)||(LA6_0 >= 17 && LA6_0 <= 19)||(LA6_0 >= 21 && LA6_0 <= 24)) ) {
				alt6=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return val;}
				NoViableAltException nvae =
					new NoViableAltException("", 6, 0, input);
				dbg.recognitionException(nvae);
				throw nvae;
			}

			} finally {dbg.exitDecision(6);}

			switch (alt6) {
				case 1 :
					dbg.enterAlt(1);

					// /Users/xuyi/Downloads/ANTLR/test.g:102:4: '=' '{' '}'
					{
					dbg.location(102,4);
					match(input,14,FOLLOW_14_in_array_assign260); if (state.failed) return val;dbg.location(102,8);
					match(input,25,FOLLOW_25_in_array_assign262); if (state.failed) return val;dbg.location(102,12);
					match(input,26,FOLLOW_26_in_array_assign264); if (state.failed) return val;dbg.location(103,2);
					if ( state.backtracking==0 ) {
							val = "";
						}
					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// /Users/xuyi/Downloads/ANTLR/test.g:107:2: 
					{
					dbg.location(107,2);
					if ( state.backtracking==0 ) {
							val = "";
						}
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(110, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "array_assign");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return val;
	}
	// $ANTLR end "array_assign"



	// $ANTLR start "function_declaration"
	// /Users/xuyi/Downloads/ANTLR/test.g:113:1: function_declaration returns [String val] : type ID '(' function_parameters ')' ;
	public final String function_declaration() throws RecognitionException {
		String val = null;


		Token ID15=null;
		String function_parameters16 =null;


			val = null;

		try { dbg.enterRule(getGrammarFileName(), "function_declaration");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(113, 0);

		try {
			// /Users/xuyi/Downloads/ANTLR/test.g:117:2: ( type ID '(' function_parameters ')' )
			dbg.enterAlt(1);

			// /Users/xuyi/Downloads/ANTLR/test.g:117:4: type ID '(' function_parameters ')'
			{
			dbg.location(117,4);
			pushFollow(FOLLOW_type_in_function_declaration293);
			type();
			state._fsp--;
			if (state.failed) return val;dbg.location(117,9);
			ID15=(Token)match(input,ID,FOLLOW_ID_in_function_declaration295); if (state.failed) return val;dbg.location(117,12);
			match(input,9,FOLLOW_9_in_function_declaration297); if (state.failed) return val;dbg.location(117,16);
			pushFollow(FOLLOW_function_parameters_in_function_declaration299);
			function_parameters16=function_parameters();
			state._fsp--;
			if (state.failed) return val;dbg.location(117,35);
			match(input,10,FOLLOW_10_in_function_declaration300); if (state.failed) return val;dbg.location(118,2);
			if ( state.backtracking==0 ) {
					val = "function " + (ID15!=null?ID15.getText():null) + "(" + function_parameters16 + ")";
				}
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(121, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "function_declaration");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return val;
	}
	// $ANTLR end "function_declaration"



	// $ANTLR start "function_parameters"
	// /Users/xuyi/Downloads/ANTLR/test.g:124:1: function_parameters returns [String val] : ( type ID next_param= function_parameters | ',' type ID next_param= function_parameters | 'void' |);
	public final String function_parameters() throws RecognitionException {
		String val = null;


		Token ID17=null;
		Token ID18=null;
		String next_param =null;


			val = null;

		try { dbg.enterRule(getGrammarFileName(), "function_parameters");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(124, 0);

		try {
			// /Users/xuyi/Downloads/ANTLR/test.g:128:2: ( type ID next_param= function_parameters | ',' type ID next_param= function_parameters | 'void' |)
			int alt7=4;
			try { dbg.enterDecision(7, decisionCanBacktrack[7]);

			switch ( input.LA(1) ) {
			case 24:
				{
				int LA7_1 = input.LA(2);
				if ( (LA7_1==ID||LA7_1==11) ) {
					alt7=1;
				}
				else if ( (LA7_1==EOF||LA7_1==10) ) {
					alt7=3;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return val;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 7, 1, input);
						dbg.recognitionException(nvae);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case 12:
				{
				alt7=2;
				}
				break;
			case 17:
			case 18:
			case 19:
			case 21:
			case 22:
			case 23:
				{
				alt7=1;
				}
				break;
			case EOF:
			case 10:
				{
				alt7=4;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return val;}
				NoViableAltException nvae =
					new NoViableAltException("", 7, 0, input);
				dbg.recognitionException(nvae);
				throw nvae;
			}
			} finally {dbg.exitDecision(7);}

			switch (alt7) {
				case 1 :
					dbg.enterAlt(1);

					// /Users/xuyi/Downloads/ANTLR/test.g:128:4: type ID next_param= function_parameters
					{
					dbg.location(128,4);
					pushFollow(FOLLOW_type_in_function_parameters324);
					type();
					state._fsp--;
					if (state.failed) return val;dbg.location(128,9);
					ID17=(Token)match(input,ID,FOLLOW_ID_in_function_parameters326); if (state.failed) return val;dbg.location(128,23);
					pushFollow(FOLLOW_function_parameters_in_function_parameters332);
					next_param=function_parameters();
					state._fsp--;
					if (state.failed) return val;dbg.location(129,2);
					if ( state.backtracking==0 ) {
							val = (ID17!=null?ID17.getText():null) + next_param;
						}
					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// /Users/xuyi/Downloads/ANTLR/test.g:132:4: ',' type ID next_param= function_parameters
					{
					dbg.location(132,4);
					match(input,12,FOLLOW_12_in_function_parameters340); if (state.failed) return val;dbg.location(132,8);
					pushFollow(FOLLOW_type_in_function_parameters342);
					type();
					state._fsp--;
					if (state.failed) return val;dbg.location(132,13);
					ID18=(Token)match(input,ID,FOLLOW_ID_in_function_parameters344); if (state.failed) return val;dbg.location(132,27);
					pushFollow(FOLLOW_function_parameters_in_function_parameters350);
					next_param=function_parameters();
					state._fsp--;
					if (state.failed) return val;dbg.location(133,2);
					if ( state.backtracking==0 ) {
							val = ',' + (ID18!=null?ID18.getText():null) + next_param;
						}
					}
					break;
				case 3 :
					dbg.enterAlt(3);

					// /Users/xuyi/Downloads/ANTLR/test.g:136:4: 'void'
					{
					dbg.location(136,4);
					match(input,24,FOLLOW_24_in_function_parameters358); if (state.failed) return val;dbg.location(137,2);
					if ( state.backtracking==0 ) {
							val = "";
						}
					}
					break;
				case 4 :
					dbg.enterAlt(4);

					// /Users/xuyi/Downloads/ANTLR/test.g:141:2: 
					{
					dbg.location(141,2);
					if ( state.backtracking==0 ) {
							val = "";
						}
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(144, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "function_parameters");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return val;
	}
	// $ANTLR end "function_parameters"



	// $ANTLR start "function_body"
	// /Users/xuyi/Downloads/ANTLR/test.g:156:1: function_body returns [String val] : '{' variablePart statPart '}' ;
	public final String function_body() throws RecognitionException {
		String val = null;


		String variablePart19 =null;
		String statPart20 =null;


			val = null;

		try { dbg.enterRule(getGrammarFileName(), "function_body");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(156, 0);

		try {
			// /Users/xuyi/Downloads/ANTLR/test.g:160:2: ( '{' variablePart statPart '}' )
			dbg.enterAlt(1);

			// /Users/xuyi/Downloads/ANTLR/test.g:160:4: '{' variablePart statPart '}'
			{
			dbg.location(160,4);
			match(input,25,FOLLOW_25_in_function_body388); if (state.failed) return val;dbg.location(160,8);
			pushFollow(FOLLOW_variablePart_in_function_body390);
			variablePart19=variablePart();
			state._fsp--;
			if (state.failed) return val;dbg.location(160,21);
			pushFollow(FOLLOW_statPart_in_function_body392);
			statPart20=statPart();
			state._fsp--;
			if (state.failed) return val;dbg.location(160,30);
			match(input,26,FOLLOW_26_in_function_body394); if (state.failed) return val;dbg.location(161,2);
			if ( state.backtracking==0 ) {
					val = "{\n" + variablePart19 + statPart20 + "}\n";
				}
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(164, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "function_body");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return val;
	}
	// $ANTLR end "function_body"



	// $ANTLR start "variablePart"
	// /Users/xuyi/Downloads/ANTLR/test.g:172:1: variablePart returns [String val] : ( variable next_variable= variablePart |);
	public final String variablePart() throws RecognitionException {
		String val = null;


		String next_variable =null;
		String variable21 =null;


			val = null;

		try { dbg.enterRule(getGrammarFileName(), "variablePart");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(172, 0);

		try {
			// /Users/xuyi/Downloads/ANTLR/test.g:176:2: ( variable next_variable= variablePart |)
			int alt8=2;
			try { dbg.enterDecision(8, decisionCanBacktrack[8]);

			int LA8_0 = input.LA(1);
			if ( ((LA8_0 >= 12 && LA8_0 <= 13)||(LA8_0 >= 17 && LA8_0 <= 19)||(LA8_0 >= 21 && LA8_0 <= 24)) ) {
				alt8=1;
			}
			else if ( (LA8_0==EOF||LA8_0==20||LA8_0==26) ) {
				alt8=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return val;}
				NoViableAltException nvae =
					new NoViableAltException("", 8, 0, input);
				dbg.recognitionException(nvae);
				throw nvae;
			}

			} finally {dbg.exitDecision(8);}

			switch (alt8) {
				case 1 :
					dbg.enterAlt(1);

					// /Users/xuyi/Downloads/ANTLR/test.g:176:4: variable next_variable= variablePart
					{
					dbg.location(176,4);
					pushFollow(FOLLOW_variable_in_variablePart418);
					variable21=variable();
					state._fsp--;
					if (state.failed) return val;dbg.location(176,27);
					pushFollow(FOLLOW_variablePart_in_variablePart424);
					next_variable=variablePart();
					state._fsp--;
					if (state.failed) return val;dbg.location(177,2);
					if ( state.backtracking==0 ) {
							val = variable21 + next_variable;
						}
					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// /Users/xuyi/Downloads/ANTLR/test.g:181:2: 
					{
					dbg.location(181,2);
					if ( state.backtracking==0 ) {
							val = "";
						}
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(184, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "variablePart");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return val;
	}
	// $ANTLR end "variablePart"



	// $ANTLR start "statPart"
	// /Users/xuyi/Downloads/ANTLR/test.g:186:1: statPart returns [String val] : ( stat next_stat= statPart |);
	public final String statPart() throws RecognitionException {
		String val = null;


		String next_stat =null;
		String stat22 =null;


			val = null;

		try { dbg.enterRule(getGrammarFileName(), "statPart");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(186, 0);

		try {
			// /Users/xuyi/Downloads/ANTLR/test.g:190:2: ( stat next_stat= statPart |)
			int alt9=2;
			try { dbg.enterDecision(9, decisionCanBacktrack[9]);

			int LA9_0 = input.LA(1);
			if ( (LA9_0==20) ) {
				alt9=1;
			}
			else if ( (LA9_0==EOF||LA9_0==26) ) {
				alt9=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return val;}
				NoViableAltException nvae =
					new NoViableAltException("", 9, 0, input);
				dbg.recognitionException(nvae);
				throw nvae;
			}

			} finally {dbg.exitDecision(9);}

			switch (alt9) {
				case 1 :
					dbg.enterAlt(1);

					// /Users/xuyi/Downloads/ANTLR/test.g:190:4: stat next_stat= statPart
					{
					dbg.location(190,4);
					pushFollow(FOLLOW_stat_in_statPart452);
					stat22=stat();
					state._fsp--;
					if (state.failed) return val;dbg.location(190,19);
					pushFollow(FOLLOW_statPart_in_statPart458);
					next_stat=statPart();
					state._fsp--;
					if (state.failed) return val;dbg.location(191,2);
					if ( state.backtracking==0 ) {
							val = stat22 + next_stat;
						}
					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// /Users/xuyi/Downloads/ANTLR/test.g:195:2: 
					{
					dbg.location(195,2);
					if ( state.backtracking==0 ) {
							val = "";
						}
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(198, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "statPart");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return val;
	}
	// $ANTLR end "statPart"



	// $ANTLR start "stat"
	// /Users/xuyi/Downloads/ANTLR/test.g:202:1: stat returns [String val] : 'if' ;
	public final String stat() throws RecognitionException {
		String val = null;


		try { dbg.enterRule(getGrammarFileName(), "stat");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(202, 0);

		try {
			// /Users/xuyi/Downloads/ANTLR/test.g:206:2: ( 'if' )
			dbg.enterAlt(1);

			// /Users/xuyi/Downloads/ANTLR/test.g:206:4: 'if'
			{
			dbg.location(206,4);
			match(input,20,FOLLOW_20_in_stat489); if (state.failed) return val;dbg.location(207,2);
			if ( state.backtracking==0 ) {
					val = "";
				}
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(210, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "stat");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return val;
	}
	// $ANTLR end "stat"



	// $ANTLR start "type"
	// /Users/xuyi/Downloads/ANTLR/test.g:214:1: type : ( basicType | basicType '*' );
	public final void type() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "type");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(214, 0);

		try {
			// /Users/xuyi/Downloads/ANTLR/test.g:215:2: ( basicType | basicType '*' )
			int alt10=2;
			try { dbg.enterDecision(10, decisionCanBacktrack[10]);

			int LA10_0 = input.LA(1);
			if ( ((LA10_0 >= 17 && LA10_0 <= 19)||(LA10_0 >= 21 && LA10_0 <= 24)) ) {
				int LA10_1 = input.LA(2);
				if ( (LA10_1==ID||(LA10_1 >= 12 && LA10_1 <= 13)||(LA10_1 >= 17 && LA10_1 <= 19)||(LA10_1 >= 21 && LA10_1 <= 24)) ) {
					alt10=1;
				}
				else if ( (LA10_1==11) ) {
					alt10=2;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 10, 1, input);
						dbg.recognitionException(nvae);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 10, 0, input);
				dbg.recognitionException(nvae);
				throw nvae;
			}

			} finally {dbg.exitDecision(10);}

			switch (alt10) {
				case 1 :
					dbg.enterAlt(1);

					// /Users/xuyi/Downloads/ANTLR/test.g:215:4: basicType
					{
					dbg.location(215,4);
					pushFollow(FOLLOW_basicType_in_type505);
					basicType();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// /Users/xuyi/Downloads/ANTLR/test.g:216:4: basicType '*'
					{
					dbg.location(216,4);
					pushFollow(FOLLOW_basicType_in_type510);
					basicType();
					state._fsp--;
					if (state.failed) return;dbg.location(216,14);
					match(input,11,FOLLOW_11_in_type512); if (state.failed) return;
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(217, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "type");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "type"



	// $ANTLR start "basicType"
	// /Users/xuyi/Downloads/ANTLR/test.g:219:1: basicType : ( 'int' | 'char' | 'float' | 'double' | 'short' | 'long' | 'void' );
	public final void basicType() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "basicType");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(219, 0);

		try {
			// /Users/xuyi/Downloads/ANTLR/test.g:220:2: ( 'int' | 'char' | 'float' | 'double' | 'short' | 'long' | 'void' )
			dbg.enterAlt(1);

			// /Users/xuyi/Downloads/ANTLR/test.g:
			{
			dbg.location(220,2);
			if ( (input.LA(1) >= 17 && input.LA(1) <= 19)||(input.LA(1) >= 21 && input.LA(1) <= 24) ) {
				input.consume();
				state.errorRecovery=false;
				state.failed=false;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return;}
				MismatchedSetException mse = new MismatchedSetException(null,input);
				dbg.recognitionException(mse);
				throw mse;
			}
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(227, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "basicType");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "basicType"

	// $ANTLR start synpred2_test
	public final void synpred2_test_fragment() throws RecognitionException {
		// /Users/xuyi/Downloads/ANTLR/test.g:17:4: ( variable )
		dbg.enterAlt(1);

		// /Users/xuyi/Downloads/ANTLR/test.g:17:4: variable
		{
		dbg.location(17,4);
		pushFollow(FOLLOW_variable_in_synpred2_test41);
		variable();
		state._fsp--;
		if (state.failed) return;
		}

	}
	// $ANTLR end synpred2_test

	// $ANTLR start synpred3_test
	public final void synpred3_test_fragment() throws RecognitionException {
		// /Users/xuyi/Downloads/ANTLR/test.g:22:4: ( function_declaration ';' )
		dbg.enterAlt(1);

		// /Users/xuyi/Downloads/ANTLR/test.g:22:4: function_declaration ';'
		{
		dbg.location(22,4);
		pushFollow(FOLLOW_function_declaration_in_synpred3_test50);
		function_declaration();
		state._fsp--;
		if (state.failed) return;dbg.location(22,25);
		match(input,13,FOLLOW_13_in_synpred3_test52); if (state.failed) return;
		}

	}
	// $ANTLR end synpred3_test

	// Delegated rules

	public final boolean synpred2_test() {
		state.backtracking++;
		dbg.beginBacktrack(state.backtracking);
		int start = input.mark();
		try {
			synpred2_test_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		dbg.endBacktrack(state.backtracking, success);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred3_test() {
		state.backtracking++;
		dbg.beginBacktrack(state.backtracking);
		int start = input.mark();
		try {
			synpred3_test_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		dbg.endBacktrack(state.backtracking, success);
		state.backtracking--;
		state.failed=false;
		return success;
	}



	public static final BitSet FOLLOW_declaration_in_program28 = new BitSet(new long[]{0x0000000001EE3002L});
	public static final BitSet FOLLOW_variable_in_declaration41 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_function_declaration_in_declaration50 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_13_in_declaration52 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_function_declaration_in_declaration61 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_function_body_in_declaration63 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_type_in_variable86 = new BitSet(new long[]{0x0000000001EE3080L});
	public static final BitSet FOLLOW_var_assign_in_variable88 = new BitSet(new long[]{0x0000000001EE3000L});
	public static final BitSet FOLLOW_variable_in_variable94 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_12_in_variable102 = new BitSet(new long[]{0x0000000001EE3080L});
	public static final BitSet FOLLOW_var_assign_in_variable104 = new BitSet(new long[]{0x0000000001EE3000L});
	public static final BitSet FOLLOW_variable_in_variable108 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_type_in_variable116 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_ID_in_variable118 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_array_length_in_variable120 = new BitSet(new long[]{0x0000000001EE7000L});
	public static final BitSet FOLLOW_array_assign_in_variable122 = new BitSet(new long[]{0x0000000001EE3000L});
	public static final BitSet FOLLOW_variable_in_variable128 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_12_in_variable136 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_ID_in_variable138 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_array_length_in_variable140 = new BitSet(new long[]{0x0000000001EE7000L});
	public static final BitSet FOLLOW_array_assign_in_variable142 = new BitSet(new long[]{0x0000000001EE3000L});
	public static final BitSet FOLLOW_variable_in_variable148 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_13_in_variable156 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_var_assign181 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_15_in_array_length209 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_ID_in_array_length211 = new BitSet(new long[]{0x0000000000010000L});
	public static final BitSet FOLLOW_16_in_array_length213 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_15_in_array_length221 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_INT_in_array_length223 = new BitSet(new long[]{0x0000000000010000L});
	public static final BitSet FOLLOW_16_in_array_length225 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_15_in_array_length233 = new BitSet(new long[]{0x0000000000010000L});
	public static final BitSet FOLLOW_16_in_array_length235 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_14_in_array_assign260 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_25_in_array_assign262 = new BitSet(new long[]{0x0000000004000000L});
	public static final BitSet FOLLOW_26_in_array_assign264 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_type_in_function_declaration293 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_ID_in_function_declaration295 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_9_in_function_declaration297 = new BitSet(new long[]{0x0000000001EE1400L});
	public static final BitSet FOLLOW_function_parameters_in_function_declaration299 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_10_in_function_declaration300 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_type_in_function_parameters324 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_ID_in_function_parameters326 = new BitSet(new long[]{0x0000000001EE1000L});
	public static final BitSet FOLLOW_function_parameters_in_function_parameters332 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_12_in_function_parameters340 = new BitSet(new long[]{0x0000000001EE0000L});
	public static final BitSet FOLLOW_type_in_function_parameters342 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_ID_in_function_parameters344 = new BitSet(new long[]{0x0000000001EE1000L});
	public static final BitSet FOLLOW_function_parameters_in_function_parameters350 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_24_in_function_parameters358 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_25_in_function_body388 = new BitSet(new long[]{0x0000000005FE3000L});
	public static final BitSet FOLLOW_variablePart_in_function_body390 = new BitSet(new long[]{0x0000000004100000L});
	public static final BitSet FOLLOW_statPart_in_function_body392 = new BitSet(new long[]{0x0000000004000000L});
	public static final BitSet FOLLOW_26_in_function_body394 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_variable_in_variablePart418 = new BitSet(new long[]{0x0000000001EE3000L});
	public static final BitSet FOLLOW_variablePart_in_variablePart424 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_stat_in_statPart452 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_statPart_in_statPart458 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_20_in_stat489 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_basicType_in_type505 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_basicType_in_type510 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_11_in_type512 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_variable_in_synpred2_test41 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_function_declaration_in_synpred3_test50 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_13_in_synpred3_test52 = new BitSet(new long[]{0x0000000000000002L});
}
