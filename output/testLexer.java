// $ANTLR 3.5.1 /Users/xuyi/Downloads/ANTLR/test.g 2015-06-27 11:06:22

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class testLexer extends Lexer {
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
	// delegators
	public Lexer[] getDelegates() {
		return new Lexer[] {};
	}

	public testLexer() {} 
	public testLexer(CharStream input) {
		this(input, new RecognizerSharedState());
	}
	public testLexer(CharStream input, RecognizerSharedState state) {
		super(input,state);
	}
	@Override public String getGrammarFileName() { return "/Users/xuyi/Downloads/ANTLR/test.g"; }

	// $ANTLR start "T__9"
	public final void mT__9() throws RecognitionException {
		try {
			int _type = T__9;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/xuyi/Downloads/ANTLR/test.g:2:6: ( '(' )
			// /Users/xuyi/Downloads/ANTLR/test.g:2:8: '('
			{
			match('('); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__9"

	// $ANTLR start "T__10"
	public final void mT__10() throws RecognitionException {
		try {
			int _type = T__10;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/xuyi/Downloads/ANTLR/test.g:3:7: ( ')' )
			// /Users/xuyi/Downloads/ANTLR/test.g:3:9: ')'
			{
			match(')'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__10"

	// $ANTLR start "T__11"
	public final void mT__11() throws RecognitionException {
		try {
			int _type = T__11;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/xuyi/Downloads/ANTLR/test.g:4:7: ( '*' )
			// /Users/xuyi/Downloads/ANTLR/test.g:4:9: '*'
			{
			match('*'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__11"

	// $ANTLR start "T__12"
	public final void mT__12() throws RecognitionException {
		try {
			int _type = T__12;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/xuyi/Downloads/ANTLR/test.g:5:7: ( ',' )
			// /Users/xuyi/Downloads/ANTLR/test.g:5:9: ','
			{
			match(','); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__12"

	// $ANTLR start "T__13"
	public final void mT__13() throws RecognitionException {
		try {
			int _type = T__13;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/xuyi/Downloads/ANTLR/test.g:6:7: ( ';' )
			// /Users/xuyi/Downloads/ANTLR/test.g:6:9: ';'
			{
			match(';'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__13"

	// $ANTLR start "T__14"
	public final void mT__14() throws RecognitionException {
		try {
			int _type = T__14;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/xuyi/Downloads/ANTLR/test.g:7:7: ( '=' )
			// /Users/xuyi/Downloads/ANTLR/test.g:7:9: '='
			{
			match('='); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__14"

	// $ANTLR start "T__15"
	public final void mT__15() throws RecognitionException {
		try {
			int _type = T__15;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/xuyi/Downloads/ANTLR/test.g:8:7: ( '[' )
			// /Users/xuyi/Downloads/ANTLR/test.g:8:9: '['
			{
			match('['); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__15"

	// $ANTLR start "T__16"
	public final void mT__16() throws RecognitionException {
		try {
			int _type = T__16;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/xuyi/Downloads/ANTLR/test.g:9:7: ( ']' )
			// /Users/xuyi/Downloads/ANTLR/test.g:9:9: ']'
			{
			match(']'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__16"

	// $ANTLR start "T__17"
	public final void mT__17() throws RecognitionException {
		try {
			int _type = T__17;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/xuyi/Downloads/ANTLR/test.g:10:7: ( 'char' )
			// /Users/xuyi/Downloads/ANTLR/test.g:10:9: 'char'
			{
			match("char"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__17"

	// $ANTLR start "T__18"
	public final void mT__18() throws RecognitionException {
		try {
			int _type = T__18;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/xuyi/Downloads/ANTLR/test.g:11:7: ( 'double' )
			// /Users/xuyi/Downloads/ANTLR/test.g:11:9: 'double'
			{
			match("double"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__18"

	// $ANTLR start "T__19"
	public final void mT__19() throws RecognitionException {
		try {
			int _type = T__19;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/xuyi/Downloads/ANTLR/test.g:12:7: ( 'float' )
			// /Users/xuyi/Downloads/ANTLR/test.g:12:9: 'float'
			{
			match("float"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__19"

	// $ANTLR start "T__20"
	public final void mT__20() throws RecognitionException {
		try {
			int _type = T__20;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/xuyi/Downloads/ANTLR/test.g:13:7: ( 'if' )
			// /Users/xuyi/Downloads/ANTLR/test.g:13:9: 'if'
			{
			match("if"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__20"

	// $ANTLR start "T__21"
	public final void mT__21() throws RecognitionException {
		try {
			int _type = T__21;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/xuyi/Downloads/ANTLR/test.g:14:7: ( 'int' )
			// /Users/xuyi/Downloads/ANTLR/test.g:14:9: 'int'
			{
			match("int"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__21"

	// $ANTLR start "T__22"
	public final void mT__22() throws RecognitionException {
		try {
			int _type = T__22;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/xuyi/Downloads/ANTLR/test.g:15:7: ( 'long' )
			// /Users/xuyi/Downloads/ANTLR/test.g:15:9: 'long'
			{
			match("long"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__22"

	// $ANTLR start "T__23"
	public final void mT__23() throws RecognitionException {
		try {
			int _type = T__23;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/xuyi/Downloads/ANTLR/test.g:16:7: ( 'short' )
			// /Users/xuyi/Downloads/ANTLR/test.g:16:9: 'short'
			{
			match("short"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__23"

	// $ANTLR start "T__24"
	public final void mT__24() throws RecognitionException {
		try {
			int _type = T__24;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/xuyi/Downloads/ANTLR/test.g:17:7: ( 'void' )
			// /Users/xuyi/Downloads/ANTLR/test.g:17:9: 'void'
			{
			match("void"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__24"

	// $ANTLR start "T__25"
	public final void mT__25() throws RecognitionException {
		try {
			int _type = T__25;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/xuyi/Downloads/ANTLR/test.g:18:7: ( '{' )
			// /Users/xuyi/Downloads/ANTLR/test.g:18:9: '{'
			{
			match('{'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__25"

	// $ANTLR start "T__26"
	public final void mT__26() throws RecognitionException {
		try {
			int _type = T__26;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/xuyi/Downloads/ANTLR/test.g:19:7: ( '}' )
			// /Users/xuyi/Downloads/ANTLR/test.g:19:9: '}'
			{
			match('}'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__26"

	// $ANTLR start "ID"
	public final void mID() throws RecognitionException {
		try {
			int _type = ID;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/xuyi/Downloads/ANTLR/test.g:229:5: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )* )
			// /Users/xuyi/Downloads/ANTLR/test.g:229:7: ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
			{
			if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			// /Users/xuyi/Downloads/ANTLR/test.g:229:31: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( ((LA1_0 >= '0' && LA1_0 <= '9')||(LA1_0 >= 'A' && LA1_0 <= 'Z')||LA1_0=='_'||(LA1_0 >= 'a' && LA1_0 <= 'z')) ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// /Users/xuyi/Downloads/ANTLR/test.g:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					break loop1;
				}
			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ID"

	// $ANTLR start "INT"
	public final void mINT() throws RecognitionException {
		try {
			int _type = INT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/xuyi/Downloads/ANTLR/test.g:232:5: ( ( '+' | '-' )* ( '0' .. '9' )+ )
			// /Users/xuyi/Downloads/ANTLR/test.g:232:7: ( '+' | '-' )* ( '0' .. '9' )+
			{
			// /Users/xuyi/Downloads/ANTLR/test.g:232:7: ( '+' | '-' )*
			loop2:
			while (true) {
				int alt2=2;
				int LA2_0 = input.LA(1);
				if ( (LA2_0=='+'||LA2_0=='-') ) {
					alt2=1;
				}

				switch (alt2) {
				case 1 :
					// /Users/xuyi/Downloads/ANTLR/test.g:
					{
					if ( input.LA(1)=='+'||input.LA(1)=='-' ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					break loop2;
				}
			}

			// /Users/xuyi/Downloads/ANTLR/test.g:232:17: ( '0' .. '9' )+
			int cnt3=0;
			loop3:
			while (true) {
				int alt3=2;
				int LA3_0 = input.LA(1);
				if ( ((LA3_0 >= '0' && LA3_0 <= '9')) ) {
					alt3=1;
				}

				switch (alt3) {
				case 1 :
					// /Users/xuyi/Downloads/ANTLR/test.g:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					if ( cnt3 >= 1 ) break loop3;
					EarlyExitException eee = new EarlyExitException(3, input);
					throw eee;
				}
				cnt3++;
			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "INT"

	// $ANTLR start "FLOAT"
	public final void mFLOAT() throws RecognitionException {
		try {
			int _type = FLOAT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/xuyi/Downloads/ANTLR/test.g:236:5: ( ( '+' | '-' )* ( '0' .. '9' )+ '.' ( '0' .. '9' )* ( EXPONENT )? | ( '+' | '-' )* '.' ( '0' .. '9' )+ ( EXPONENT )? | ( '+' | '-' )* ( '0' .. '9' )+ EXPONENT )
			int alt13=3;
			alt13 = dfa13.predict(input);
			switch (alt13) {
				case 1 :
					// /Users/xuyi/Downloads/ANTLR/test.g:236:9: ( '+' | '-' )* ( '0' .. '9' )+ '.' ( '0' .. '9' )* ( EXPONENT )?
					{
					// /Users/xuyi/Downloads/ANTLR/test.g:236:9: ( '+' | '-' )*
					loop4:
					while (true) {
						int alt4=2;
						int LA4_0 = input.LA(1);
						if ( (LA4_0=='+'||LA4_0=='-') ) {
							alt4=1;
						}

						switch (alt4) {
						case 1 :
							// /Users/xuyi/Downloads/ANTLR/test.g:
							{
							if ( input.LA(1)=='+'||input.LA(1)=='-' ) {
								input.consume();
							}
							else {
								MismatchedSetException mse = new MismatchedSetException(null,input);
								recover(mse);
								throw mse;
							}
							}
							break;

						default :
							break loop4;
						}
					}

					// /Users/xuyi/Downloads/ANTLR/test.g:236:20: ( '0' .. '9' )+
					int cnt5=0;
					loop5:
					while (true) {
						int alt5=2;
						int LA5_0 = input.LA(1);
						if ( ((LA5_0 >= '0' && LA5_0 <= '9')) ) {
							alt5=1;
						}

						switch (alt5) {
						case 1 :
							// /Users/xuyi/Downloads/ANTLR/test.g:
							{
							if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
								input.consume();
							}
							else {
								MismatchedSetException mse = new MismatchedSetException(null,input);
								recover(mse);
								throw mse;
							}
							}
							break;

						default :
							if ( cnt5 >= 1 ) break loop5;
							EarlyExitException eee = new EarlyExitException(5, input);
							throw eee;
						}
						cnt5++;
					}

					match('.'); 
					// /Users/xuyi/Downloads/ANTLR/test.g:236:36: ( '0' .. '9' )*
					loop6:
					while (true) {
						int alt6=2;
						int LA6_0 = input.LA(1);
						if ( ((LA6_0 >= '0' && LA6_0 <= '9')) ) {
							alt6=1;
						}

						switch (alt6) {
						case 1 :
							// /Users/xuyi/Downloads/ANTLR/test.g:
							{
							if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
								input.consume();
							}
							else {
								MismatchedSetException mse = new MismatchedSetException(null,input);
								recover(mse);
								throw mse;
							}
							}
							break;

						default :
							break loop6;
						}
					}

					// /Users/xuyi/Downloads/ANTLR/test.g:236:48: ( EXPONENT )?
					int alt7=2;
					int LA7_0 = input.LA(1);
					if ( (LA7_0=='E'||LA7_0=='e') ) {
						alt7=1;
					}
					switch (alt7) {
						case 1 :
							// /Users/xuyi/Downloads/ANTLR/test.g:236:48: EXPONENT
							{
							mEXPONENT(); 

							}
							break;

					}

					}
					break;
				case 2 :
					// /Users/xuyi/Downloads/ANTLR/test.g:237:9: ( '+' | '-' )* '.' ( '0' .. '9' )+ ( EXPONENT )?
					{
					// /Users/xuyi/Downloads/ANTLR/test.g:237:9: ( '+' | '-' )*
					loop8:
					while (true) {
						int alt8=2;
						int LA8_0 = input.LA(1);
						if ( (LA8_0=='+'||LA8_0=='-') ) {
							alt8=1;
						}

						switch (alt8) {
						case 1 :
							// /Users/xuyi/Downloads/ANTLR/test.g:
							{
							if ( input.LA(1)=='+'||input.LA(1)=='-' ) {
								input.consume();
							}
							else {
								MismatchedSetException mse = new MismatchedSetException(null,input);
								recover(mse);
								throw mse;
							}
							}
							break;

						default :
							break loop8;
						}
					}

					match('.'); 
					// /Users/xuyi/Downloads/ANTLR/test.g:237:24: ( '0' .. '9' )+
					int cnt9=0;
					loop9:
					while (true) {
						int alt9=2;
						int LA9_0 = input.LA(1);
						if ( ((LA9_0 >= '0' && LA9_0 <= '9')) ) {
							alt9=1;
						}

						switch (alt9) {
						case 1 :
							// /Users/xuyi/Downloads/ANTLR/test.g:
							{
							if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
								input.consume();
							}
							else {
								MismatchedSetException mse = new MismatchedSetException(null,input);
								recover(mse);
								throw mse;
							}
							}
							break;

						default :
							if ( cnt9 >= 1 ) break loop9;
							EarlyExitException eee = new EarlyExitException(9, input);
							throw eee;
						}
						cnt9++;
					}

					// /Users/xuyi/Downloads/ANTLR/test.g:237:36: ( EXPONENT )?
					int alt10=2;
					int LA10_0 = input.LA(1);
					if ( (LA10_0=='E'||LA10_0=='e') ) {
						alt10=1;
					}
					switch (alt10) {
						case 1 :
							// /Users/xuyi/Downloads/ANTLR/test.g:237:36: EXPONENT
							{
							mEXPONENT(); 

							}
							break;

					}

					}
					break;
				case 3 :
					// /Users/xuyi/Downloads/ANTLR/test.g:238:9: ( '+' | '-' )* ( '0' .. '9' )+ EXPONENT
					{
					// /Users/xuyi/Downloads/ANTLR/test.g:238:9: ( '+' | '-' )*
					loop11:
					while (true) {
						int alt11=2;
						int LA11_0 = input.LA(1);
						if ( (LA11_0=='+'||LA11_0=='-') ) {
							alt11=1;
						}

						switch (alt11) {
						case 1 :
							// /Users/xuyi/Downloads/ANTLR/test.g:
							{
							if ( input.LA(1)=='+'||input.LA(1)=='-' ) {
								input.consume();
							}
							else {
								MismatchedSetException mse = new MismatchedSetException(null,input);
								recover(mse);
								throw mse;
							}
							}
							break;

						default :
							break loop11;
						}
					}

					// /Users/xuyi/Downloads/ANTLR/test.g:238:20: ( '0' .. '9' )+
					int cnt12=0;
					loop12:
					while (true) {
						int alt12=2;
						int LA12_0 = input.LA(1);
						if ( ((LA12_0 >= '0' && LA12_0 <= '9')) ) {
							alt12=1;
						}

						switch (alt12) {
						case 1 :
							// /Users/xuyi/Downloads/ANTLR/test.g:
							{
							if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
								input.consume();
							}
							else {
								MismatchedSetException mse = new MismatchedSetException(null,input);
								recover(mse);
								throw mse;
							}
							}
							break;

						default :
							if ( cnt12 >= 1 ) break loop12;
							EarlyExitException eee = new EarlyExitException(12, input);
							throw eee;
						}
						cnt12++;
					}

					mEXPONENT(); 

					}
					break;

			}
			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "FLOAT"

	// $ANTLR start "EXPONENT"
	public final void mEXPONENT() throws RecognitionException {
		try {
			// /Users/xuyi/Downloads/ANTLR/test.g:243:10: ( ( 'e' | 'E' ) ( '+' | '-' )? ( '0' .. '9' )+ )
			// /Users/xuyi/Downloads/ANTLR/test.g:243:12: ( 'e' | 'E' ) ( '+' | '-' )? ( '0' .. '9' )+
			{
			if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			// /Users/xuyi/Downloads/ANTLR/test.g:243:22: ( '+' | '-' )?
			int alt14=2;
			int LA14_0 = input.LA(1);
			if ( (LA14_0=='+'||LA14_0=='-') ) {
				alt14=1;
			}
			switch (alt14) {
				case 1 :
					// /Users/xuyi/Downloads/ANTLR/test.g:
					{
					if ( input.LA(1)=='+'||input.LA(1)=='-' ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

			}

			// /Users/xuyi/Downloads/ANTLR/test.g:243:33: ( '0' .. '9' )+
			int cnt15=0;
			loop15:
			while (true) {
				int alt15=2;
				int LA15_0 = input.LA(1);
				if ( ((LA15_0 >= '0' && LA15_0 <= '9')) ) {
					alt15=1;
				}

				switch (alt15) {
				case 1 :
					// /Users/xuyi/Downloads/ANTLR/test.g:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					if ( cnt15 >= 1 ) break loop15;
					EarlyExitException eee = new EarlyExitException(15, input);
					throw eee;
				}
				cnt15++;
			}

			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "EXPONENT"

	// $ANTLR start "HEX_DIGIT"
	public final void mHEX_DIGIT() throws RecognitionException {
		try {
			// /Users/xuyi/Downloads/ANTLR/test.g:246:11: ( ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) )
			// /Users/xuyi/Downloads/ANTLR/test.g:
			{
			if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'F')||(input.LA(1) >= 'a' && input.LA(1) <= 'f') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "HEX_DIGIT"

	@Override
	public void mTokens() throws RecognitionException {
		// /Users/xuyi/Downloads/ANTLR/test.g:1:8: ( T__9 | T__10 | T__11 | T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | ID | INT | FLOAT )
		int alt16=21;
		alt16 = dfa16.predict(input);
		switch (alt16) {
			case 1 :
				// /Users/xuyi/Downloads/ANTLR/test.g:1:10: T__9
				{
				mT__9(); 

				}
				break;
			case 2 :
				// /Users/xuyi/Downloads/ANTLR/test.g:1:15: T__10
				{
				mT__10(); 

				}
				break;
			case 3 :
				// /Users/xuyi/Downloads/ANTLR/test.g:1:21: T__11
				{
				mT__11(); 

				}
				break;
			case 4 :
				// /Users/xuyi/Downloads/ANTLR/test.g:1:27: T__12
				{
				mT__12(); 

				}
				break;
			case 5 :
				// /Users/xuyi/Downloads/ANTLR/test.g:1:33: T__13
				{
				mT__13(); 

				}
				break;
			case 6 :
				// /Users/xuyi/Downloads/ANTLR/test.g:1:39: T__14
				{
				mT__14(); 

				}
				break;
			case 7 :
				// /Users/xuyi/Downloads/ANTLR/test.g:1:45: T__15
				{
				mT__15(); 

				}
				break;
			case 8 :
				// /Users/xuyi/Downloads/ANTLR/test.g:1:51: T__16
				{
				mT__16(); 

				}
				break;
			case 9 :
				// /Users/xuyi/Downloads/ANTLR/test.g:1:57: T__17
				{
				mT__17(); 

				}
				break;
			case 10 :
				// /Users/xuyi/Downloads/ANTLR/test.g:1:63: T__18
				{
				mT__18(); 

				}
				break;
			case 11 :
				// /Users/xuyi/Downloads/ANTLR/test.g:1:69: T__19
				{
				mT__19(); 

				}
				break;
			case 12 :
				// /Users/xuyi/Downloads/ANTLR/test.g:1:75: T__20
				{
				mT__20(); 

				}
				break;
			case 13 :
				// /Users/xuyi/Downloads/ANTLR/test.g:1:81: T__21
				{
				mT__21(); 

				}
				break;
			case 14 :
				// /Users/xuyi/Downloads/ANTLR/test.g:1:87: T__22
				{
				mT__22(); 

				}
				break;
			case 15 :
				// /Users/xuyi/Downloads/ANTLR/test.g:1:93: T__23
				{
				mT__23(); 

				}
				break;
			case 16 :
				// /Users/xuyi/Downloads/ANTLR/test.g:1:99: T__24
				{
				mT__24(); 

				}
				break;
			case 17 :
				// /Users/xuyi/Downloads/ANTLR/test.g:1:105: T__25
				{
				mT__25(); 

				}
				break;
			case 18 :
				// /Users/xuyi/Downloads/ANTLR/test.g:1:111: T__26
				{
				mT__26(); 

				}
				break;
			case 19 :
				// /Users/xuyi/Downloads/ANTLR/test.g:1:117: ID
				{
				mID(); 

				}
				break;
			case 20 :
				// /Users/xuyi/Downloads/ANTLR/test.g:1:120: INT
				{
				mINT(); 

				}
				break;
			case 21 :
				// /Users/xuyi/Downloads/ANTLR/test.g:1:124: FLOAT
				{
				mFLOAT(); 

				}
				break;

		}
	}


	protected DFA13 dfa13 = new DFA13(this);
	protected DFA16 dfa16 = new DFA16(this);
	static final String DFA13_eotS =
		"\6\uffff";
	static final String DFA13_eofS =
		"\6\uffff";
	static final String DFA13_minS =
		"\2\53\1\56\3\uffff";
	static final String DFA13_maxS =
		"\2\71\1\145\3\uffff";
	static final String DFA13_acceptS =
		"\3\uffff\1\2\1\1\1\3";
	static final String DFA13_specialS =
		"\6\uffff}>";
	static final String[] DFA13_transitionS = {
			"\1\1\1\uffff\1\1\1\3\1\uffff\12\2",
			"\1\1\1\uffff\1\1\1\3\1\uffff\12\2",
			"\1\4\1\uffff\12\2\13\uffff\1\5\37\uffff\1\5",
			"",
			"",
			""
	};

	static final short[] DFA13_eot = DFA.unpackEncodedString(DFA13_eotS);
	static final short[] DFA13_eof = DFA.unpackEncodedString(DFA13_eofS);
	static final char[] DFA13_min = DFA.unpackEncodedStringToUnsignedChars(DFA13_minS);
	static final char[] DFA13_max = DFA.unpackEncodedStringToUnsignedChars(DFA13_maxS);
	static final short[] DFA13_accept = DFA.unpackEncodedString(DFA13_acceptS);
	static final short[] DFA13_special = DFA.unpackEncodedString(DFA13_specialS);
	static final short[][] DFA13_transition;

	static {
		int numStates = DFA13_transitionS.length;
		DFA13_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA13_transition[i] = DFA.unpackEncodedString(DFA13_transitionS[i]);
		}
	}

	protected class DFA13 extends DFA {

		public DFA13(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 13;
			this.eot = DFA13_eot;
			this.eof = DFA13_eof;
			this.min = DFA13_min;
			this.max = DFA13_max;
			this.accept = DFA13_accept;
			this.special = DFA13_special;
			this.transition = DFA13_transition;
		}
		@Override
		public String getDescription() {
			return "235:1: FLOAT : ( ( '+' | '-' )* ( '0' .. '9' )+ '.' ( '0' .. '9' )* ( EXPONENT )? | ( '+' | '-' )* '.' ( '0' .. '9' )+ ( EXPONENT )? | ( '+' | '-' )* ( '0' .. '9' )+ EXPONENT );";
		}
	}

	static final String DFA16_eotS =
		"\11\uffff\7\22\4\uffff\1\36\1\uffff\3\22\1\42\4\22\1\uffff\3\22\1\uffff"+
		"\1\52\3\22\1\56\2\22\1\uffff\1\61\1\22\1\63\1\uffff\1\22\1\65\1\uffff"+
		"\1\66\1\uffff\1\67\3\uffff";
	static final String DFA16_eofS =
		"\70\uffff";
	static final String DFA16_minS =
		"\1\50\10\uffff\1\150\1\157\1\154\1\146\1\157\1\150\1\157\3\uffff\1\53"+
		"\1\56\1\uffff\1\141\1\165\1\157\1\60\1\164\1\156\1\157\1\151\1\uffff\1"+
		"\162\1\142\1\141\1\uffff\1\60\1\147\1\162\1\144\1\60\1\154\1\164\1\uffff"+
		"\1\60\1\164\1\60\1\uffff\1\145\1\60\1\uffff\1\60\1\uffff\1\60\3\uffff";
	static final String DFA16_maxS =
		"\1\175\10\uffff\1\150\1\157\1\154\1\156\1\157\1\150\1\157\3\uffff\1\71"+
		"\1\145\1\uffff\1\141\1\165\1\157\1\172\1\164\1\156\1\157\1\151\1\uffff"+
		"\1\162\1\142\1\141\1\uffff\1\172\1\147\1\162\1\144\1\172\1\154\1\164\1"+
		"\uffff\1\172\1\164\1\172\1\uffff\1\145\1\172\1\uffff\1\172\1\uffff\1\172"+
		"\3\uffff";
	static final String DFA16_acceptS =
		"\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\7\uffff\1\21\1\22\1\23\2\uffff"+
		"\1\25\10\uffff\1\24\3\uffff\1\14\7\uffff\1\15\3\uffff\1\11\2\uffff\1\16"+
		"\1\uffff\1\20\1\uffff\1\13\1\17\1\12";
	static final String DFA16_specialS =
		"\70\uffff}>";
	static final String[] DFA16_transitionS = {
			"\1\1\1\2\1\3\1\23\1\4\1\23\1\25\1\uffff\12\24\1\uffff\1\5\1\uffff\1\6"+
			"\3\uffff\32\22\1\7\1\uffff\1\10\1\uffff\1\22\1\uffff\2\22\1\11\1\12\1"+
			"\22\1\13\2\22\1\14\2\22\1\15\6\22\1\16\2\22\1\17\4\22\1\20\1\uffff\1"+
			"\21",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\26",
			"\1\27",
			"\1\30",
			"\1\31\7\uffff\1\32",
			"\1\33",
			"\1\34",
			"\1\35",
			"",
			"",
			"",
			"\1\23\1\uffff\1\23\1\25\1\uffff\12\24",
			"\1\25\1\uffff\12\24\13\uffff\1\25\37\uffff\1\25",
			"",
			"\1\37",
			"\1\40",
			"\1\41",
			"\12\22\7\uffff\32\22\4\uffff\1\22\1\uffff\32\22",
			"\1\43",
			"\1\44",
			"\1\45",
			"\1\46",
			"",
			"\1\47",
			"\1\50",
			"\1\51",
			"",
			"\12\22\7\uffff\32\22\4\uffff\1\22\1\uffff\32\22",
			"\1\53",
			"\1\54",
			"\1\55",
			"\12\22\7\uffff\32\22\4\uffff\1\22\1\uffff\32\22",
			"\1\57",
			"\1\60",
			"",
			"\12\22\7\uffff\32\22\4\uffff\1\22\1\uffff\32\22",
			"\1\62",
			"\12\22\7\uffff\32\22\4\uffff\1\22\1\uffff\32\22",
			"",
			"\1\64",
			"\12\22\7\uffff\32\22\4\uffff\1\22\1\uffff\32\22",
			"",
			"\12\22\7\uffff\32\22\4\uffff\1\22\1\uffff\32\22",
			"",
			"\12\22\7\uffff\32\22\4\uffff\1\22\1\uffff\32\22",
			"",
			"",
			""
	};

	static final short[] DFA16_eot = DFA.unpackEncodedString(DFA16_eotS);
	static final short[] DFA16_eof = DFA.unpackEncodedString(DFA16_eofS);
	static final char[] DFA16_min = DFA.unpackEncodedStringToUnsignedChars(DFA16_minS);
	static final char[] DFA16_max = DFA.unpackEncodedStringToUnsignedChars(DFA16_maxS);
	static final short[] DFA16_accept = DFA.unpackEncodedString(DFA16_acceptS);
	static final short[] DFA16_special = DFA.unpackEncodedString(DFA16_specialS);
	static final short[][] DFA16_transition;

	static {
		int numStates = DFA16_transitionS.length;
		DFA16_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA16_transition[i] = DFA.unpackEncodedString(DFA16_transitionS[i]);
		}
	}

	protected class DFA16 extends DFA {

		public DFA16(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 16;
			this.eot = DFA16_eot;
			this.eof = DFA16_eof;
			this.min = DFA16_min;
			this.max = DFA16_max;
			this.accept = DFA16_accept;
			this.special = DFA16_special;
			this.transition = DFA16_transition;
		}
		@Override
		public String getDescription() {
			return "1:1: Tokens : ( T__9 | T__10 | T__11 | T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | ID | INT | FLOAT );";
		}
	}

}
