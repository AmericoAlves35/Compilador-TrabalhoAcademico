// Generated from Atres.g4 by ANTLR 4.13.1

	package antlr;
	import java.util.*;
	import java.util.Scanner;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class AtresParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, INT_TIPO=19, DEC_TIPO=20, STR_TIPO=21, ID=22, STRING=23, INT=24, 
		DECIMAL=25, OP_RELACIONAL=26, OP_ATRIBUICAO=27, WS=28, PV=29, AC=30, FC=31, 
		AP=32, FP=33, V=34;
	public static final int
		RULE_comeco = 0, RULE_tipo = 1, RULE_declararpv = 2, RULE_declarar = 3, 
		RULE_atribuirpv = 4, RULE_atribuir = 5, RULE_pegarpv = 6, RULE_pegar = 7, 
		RULE_mostrar = 8, RULE_comp = 9, RULE_exprcomp = 10, RULE_compstr = 11, 
		RULE_expr = 12, RULE_exprmath = 13, RULE_adcsub = 14, RULE_multdiv = 15, 
		RULE_num = 16, RULE_cmd = 17, RULE_textovariavel = 18, RULE_cond = 19, 
		RULE_paracada = 20, RULE_enquanto = 21, RULE_bloco = 22;
	private static String[] makeRuleNames() {
		return new String[] {
			"comeco", "tipo", "declararpv", "declarar", "atribuirpv", "atribuir", 
			"pegarpv", "pegar", "mostrar", "comp", "exprcomp", "compstr", "expr", 
			"exprmath", "adcsub", "multdiv", "num", "cmd", "textovariavel", "cond", 
			"paracada", "enquanto", "bloco"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'iniciar'", "'finalizar'", "'pegar'", "'mostrar'", "'=='", "'!='", 
			"'>'", "'<'", "'>='", "'<='", "'+'", "'-'", "'*'", "'/'", "'se'", "'else '", 
			"'paracada'", "'enquanto'", "'inteiro'", "'decimal'", "'texto'", null, 
			null, null, null, null, "'='", null, "';'", "'{'", "'}'", "'('", "')'", 
			"','"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, "INT_TIPO", "DEC_TIPO", "STR_TIPO", 
			"ID", "STRING", "INT", "DECIMAL", "OP_RELACIONAL", "OP_ATRIBUICAO", "WS", 
			"PV", "AC", "FC", "AP", "FP", "V"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "Atres.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }


	    Scanner teclado = new Scanner(System.in);
		NovasVariaveis novaV = new NovasVariaveis();
	    ValidacaoVariavel validV = new ValidacaoVariavel();
	    String codigoJava = "";
	    int escopo, tipo;
	    String id, variavelSalva;

	public AtresParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ComecoContext extends ParserRuleContext {
		public TerminalNode AC() { return getToken(AtresParser.AC, 0); }
		public TerminalNode FC() { return getToken(AtresParser.FC, 0); }
		public List<BlocoContext> bloco() {
			return getRuleContexts(BlocoContext.class);
		}
		public BlocoContext bloco(int i) {
			return getRuleContext(BlocoContext.class,i);
		}
		public ComecoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comeco; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AtresListener ) ((AtresListener)listener).enterComeco(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AtresListener ) ((AtresListener)listener).exitComeco(this);
		}
	}

	public final ComecoContext comeco() throws RecognitionException {
		ComecoContext _localctx = new ComecoContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_comeco);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{

			    escopo = 0;
			    codigoJava += "import java.util.*;\nimport java.util.Scanner;\npublic class Atres{\n";
			    
			setState(47);
			match(T__0);
			setState(48);
			match(AC);

			    escopo = 1;
			    codigoJava += "public static void main(String args[]){\nScanner teclado = new Scanner(System.in);\n";
			    
			setState(51); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(50);
				bloco();
				}
				}
				setState(53); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 4361977880L) != 0) );
			setState(55);
			match(FC);
			setState(56);
			match(T__1);

			    codigoJava += "}\n}";
			    System.out.println(codigoJava);
			    
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TipoContext extends ParserRuleContext {
		public TerminalNode INT_TIPO() { return getToken(AtresParser.INT_TIPO, 0); }
		public TerminalNode DEC_TIPO() { return getToken(AtresParser.DEC_TIPO, 0); }
		public TerminalNode STR_TIPO() { return getToken(AtresParser.STR_TIPO, 0); }
		public TipoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AtresListener ) ((AtresListener)listener).enterTipo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AtresListener ) ((AtresListener)listener).exitTipo(this);
		}
	}

	public final TipoContext tipo() throws RecognitionException {
		TipoContext _localctx = new TipoContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_tipo);
		try {
			setState(65);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT_TIPO:
				enterOuterAlt(_localctx, 1);
				{
				setState(59);
				match(INT_TIPO);

				    tipo = 0;
				    codigoJava += "int ";
				    
				}
				break;
			case DEC_TIPO:
				enterOuterAlt(_localctx, 2);
				{
				setState(61);
				match(DEC_TIPO);

				    tipo = 1;
				    codigoJava += "double ";
				    
				}
				break;
			case STR_TIPO:
				enterOuterAlt(_localctx, 3);
				{
				setState(63);
				match(STR_TIPO);

				    tipo = 2;
				    codigoJava += "String ";
				    
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DeclararpvContext extends ParserRuleContext {
		public DeclararContext declarar() {
			return getRuleContext(DeclararContext.class,0);
		}
		public TerminalNode PV() { return getToken(AtresParser.PV, 0); }
		public DeclararpvContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declararpv; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AtresListener ) ((AtresListener)listener).enterDeclararpv(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AtresListener ) ((AtresListener)listener).exitDeclararpv(this);
		}
	}

	public final DeclararpvContext declararpv() throws RecognitionException {
		DeclararpvContext _localctx = new DeclararpvContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_declararpv);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(67);
			declarar();
			setState(68);
			match(PV);
			codigoJava += ";\n";
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DeclararContext extends ParserRuleContext {
		public Token ID;
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public TerminalNode ID() { return getToken(AtresParser.ID, 0); }
		public DeclararContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declarar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AtresListener ) ((AtresListener)listener).enterDeclarar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AtresListener ) ((AtresListener)listener).exitDeclarar(this);
		}
	}

	public final DeclararContext declarar() throws RecognitionException {
		DeclararContext _localctx = new DeclararContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_declarar);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(71);
			tipo();
			setState(72);
			((DeclararContext)_localctx).ID = match(ID);

			    NovasVariaveis nVar = new NovasVariaveis((((DeclararContext)_localctx).ID!=null?((DeclararContext)_localctx).ID.getText():null), tipo, escopo);
			    boolean declarado = validV.adiciona(nVar);
			    if(!declarado){
			        System.err.println("Variavel '"+(((DeclararContext)_localctx).ID!=null?((DeclararContext)_localctx).ID.getText():null)+"' ID de variavel esta em uso");
			        System.exit(0);
			    }
			    codigoJava += (((DeclararContext)_localctx).ID!=null?((DeclararContext)_localctx).ID.getText():null);
			    
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AtribuirpvContext extends ParserRuleContext {
		public AtribuirContext atribuir() {
			return getRuleContext(AtribuirContext.class,0);
		}
		public TerminalNode PV() { return getToken(AtresParser.PV, 0); }
		public AtribuirpvContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atribuirpv; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AtresListener ) ((AtresListener)listener).enterAtribuirpv(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AtresListener ) ((AtresListener)listener).exitAtribuirpv(this);
		}
	}

	public final AtribuirpvContext atribuirpv() throws RecognitionException {
		AtribuirpvContext _localctx = new AtribuirpvContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_atribuirpv);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(75);
			atribuir();
			setState(76);
			match(PV);
			codigoJava += ";\n";
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AtribuirContext extends ParserRuleContext {
		public Token ID;
		public Token INT;
		public Token DECIMAL;
		public Token STRING;
		public List<TerminalNode> ID() { return getTokens(AtresParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(AtresParser.ID, i);
		}
		public TerminalNode OP_ATRIBUICAO() { return getToken(AtresParser.OP_ATRIBUICAO, 0); }
		public TerminalNode INT() { return getToken(AtresParser.INT, 0); }
		public TerminalNode DECIMAL() { return getToken(AtresParser.DECIMAL, 0); }
		public TerminalNode STRING() { return getToken(AtresParser.STRING, 0); }
		public PegarContext pegar() {
			return getRuleContext(PegarContext.class,0);
		}
		public ExprmathContext exprmath() {
			return getRuleContext(ExprmathContext.class,0);
		}
		public AtribuirContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atribuir; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AtresListener ) ((AtresListener)listener).enterAtribuir(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AtresListener ) ((AtresListener)listener).exitAtribuir(this);
		}
	}

	public final AtribuirContext atribuir() throws RecognitionException {
		AtribuirContext _localctx = new AtribuirContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_atribuir);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(79);
			((AtribuirContext)_localctx).ID = match(ID);
				boolean declarado = validV.jaExiste((((AtribuirContext)_localctx).ID!=null?((AtribuirContext)_localctx).ID.getText():null));
			                variavelSalva = (((AtribuirContext)_localctx).ID!=null?((AtribuirContext)_localctx).ID.getText():null);
			             	if(!declarado){
			             	    System.err.println("A variavel '"+(((AtribuirContext)_localctx).ID!=null?((AtribuirContext)_localctx).ID.getText():null)+"' não foi declarada");
			             		System.exit(0);
			             	}
			                codigoJava += variavelSalva;
			             
			setState(81);
			match(OP_ATRIBUICAO);

			                codigoJava += " = ";
			             
			setState(95);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				{
				setState(83);
				((AtribuirContext)_localctx).ID = match(ID);
				  if(validV.busca((((AtribuirContext)_localctx).ID!=null?((AtribuirContext)_localctx).ID.getText():null)).getTipo() != validV.busca(variavelSalva).getTipo()){
				                    System.err.println("A variavel '" + variavelSalva + "' e '" + (((AtribuirContext)_localctx).ID!=null?((AtribuirContext)_localctx).ID.getText():null) + "' sao de tipos divergentes!");
				                    System.exit(0);
				                }
				                codigoJava += (((AtribuirContext)_localctx).ID!=null?((AtribuirContext)_localctx).ID.getText():null);
				             
				}
				break;
			case 2:
				{
				setState(85);
				((AtribuirContext)_localctx).INT = match(INT);
				  if(validV.busca(variavelSalva).getTipo() != 0){
				                    System.err.println("A variavel '" + variavelSalva + "' nao e do tipo inteiro!");
				                    System.exit(0);
				                 }
				                 codigoJava += (((AtribuirContext)_localctx).INT!=null?((AtribuirContext)_localctx).INT.getText():null);
				             
				}
				break;
			case 3:
				{
				setState(87);
				((AtribuirContext)_localctx).DECIMAL = match(DECIMAL);
				  if(validV.busca(variavelSalva).getTipo() != 1){
				                    System.err.println("A variavel '" + variavelSalva + "' nao e do tipo decimal!");
				                    System.exit(0);
				                }
				                codigoJava += (((AtribuirContext)_localctx).DECIMAL!=null?((AtribuirContext)_localctx).DECIMAL.getText():null);
				             
				}
				break;
			case 4:
				{
				setState(89);
				((AtribuirContext)_localctx).STRING = match(STRING);
				  if(validV.busca(variavelSalva).getTipo() != 2){
				                    System.err.println("A variavel '" + variavelSalva + "' nao e do tipo texto!");
				                    System.exit(0);
				                }
				                codigoJava += (((AtribuirContext)_localctx).STRING!=null?((AtribuirContext)_localctx).STRING.getText():null);
				             
				}
				break;
			case 5:
				{
				setState(91);
				pegar();
				  if(validV.busca(variavelSalva).getTipo() != tipo){
				                    System.err.println("o valor nao correponde ao tipo da variavel '" + variavelSalva + "'");
				                    System.exit(0);
				                 }
				             
				}
				break;
			case 6:
				{
				setState(94);
				exprmath();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PegarpvContext extends ParserRuleContext {
		public PegarContext pegar() {
			return getRuleContext(PegarContext.class,0);
		}
		public TerminalNode PV() { return getToken(AtresParser.PV, 0); }
		public PegarpvContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pegarpv; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AtresListener ) ((AtresListener)listener).enterPegarpv(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AtresListener ) ((AtresListener)listener).exitPegarpv(this);
		}
	}

	public final PegarpvContext pegarpv() throws RecognitionException {
		PegarpvContext _localctx = new PegarpvContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_pegarpv);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(97);
			pegar();
			setState(98);
			match(PV);
			codigoJava += ";\n";
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PegarContext extends ParserRuleContext {
		public Token ID;
		public TerminalNode AP() { return getToken(AtresParser.AP, 0); }
		public TerminalNode FP() { return getToken(AtresParser.FP, 0); }
		public TerminalNode STRING() { return getToken(AtresParser.STRING, 0); }
		public TerminalNode INT() { return getToken(AtresParser.INT, 0); }
		public TerminalNode DECIMAL() { return getToken(AtresParser.DECIMAL, 0); }
		public TerminalNode ID() { return getToken(AtresParser.ID, 0); }
		public PegarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pegar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AtresListener ) ((AtresListener)listener).enterPegar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AtresListener ) ((AtresListener)listener).exitPegar(this);
		}
	}

	public final PegarContext pegar() throws RecognitionException {
		PegarContext _localctx = new PegarContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_pegar);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(101);
			match(T__2);
			setState(102);
			match(AP);
			setState(111);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRING:
				{
				setState(103);
				match(STRING);
				 codigoJava += "teclado.next()";
				                  tipo = 2;
				                
				}
				break;
			case INT:
				{
				setState(105);
				match(INT);
				   codigoJava += "teclado.nextInt()";
				                tipo = 0;
				            
				}
				break;
			case DECIMAL:
				{
				setState(107);
				match(DECIMAL);
				 codigoJava += "teclado.nextFloat()";
				                  tipo = 1;
				                
				}
				break;
			case ID:
				{
				setState(109);
				((PegarContext)_localctx).ID = match(ID);
				 boolean declarado = validV.jaExiste((((PegarContext)_localctx).ID!=null?((PegarContext)_localctx).ID.getText():null));
				             variavelSalva = (((PegarContext)_localctx).ID!=null?((PegarContext)_localctx).ID.getText():null);
				             if(!declarado){
				                System.err.println("A variavel '" + (((PegarContext)_localctx).ID!=null?((PegarContext)_localctx).ID.getText():null) + "' não foi declarada");
				                System.exit(0);
				             }
				             else if(validV.busca((((PegarContext)_localctx).ID!=null?((PegarContext)_localctx).ID.getText():null)).getTipo() == 0){
				                tipo = 0;
				                codigoJava += "teclado.nextInt()";
				             }else if(validV.busca((((PegarContext)_localctx).ID!=null?((PegarContext)_localctx).ID.getText():null)).getTipo() == 1){
				                tipo = 1;
				                codigoJava += "teclado.nextFloat()";
				             }else{
				                tipo = 2;
				                codigoJava += "teclado.next()";
				             }

				           
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(113);
			match(FP);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class MostrarContext extends ParserRuleContext {
		public TerminalNode AP() { return getToken(AtresParser.AP, 0); }
		public TextovariavelContext textovariavel() {
			return getRuleContext(TextovariavelContext.class,0);
		}
		public TerminalNode FP() { return getToken(AtresParser.FP, 0); }
		public TerminalNode PV() { return getToken(AtresParser.PV, 0); }
		public MostrarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mostrar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AtresListener ) ((AtresListener)listener).enterMostrar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AtresListener ) ((AtresListener)listener).exitMostrar(this);
		}
	}

	public final MostrarContext mostrar() throws RecognitionException {
		MostrarContext _localctx = new MostrarContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_mostrar);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(115);
			match(T__3);
			setState(116);
			match(AP);

			            codigoJava += "System.out.println(";
			         
			setState(118);
			textovariavel(0);
			setState(119);
			match(FP);
			setState(120);
			match(PV);

			            codigoJava += ");\n";
			         
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CompContext extends ParserRuleContext {
		public TerminalNode PV() { return getToken(AtresParser.PV, 0); }
		public ExprcompContext exprcomp() {
			return getRuleContext(ExprcompContext.class,0);
		}
		public CompContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AtresListener ) ((AtresListener)listener).enterComp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AtresListener ) ((AtresListener)listener).exitComp(this);
		}
	}

	public final CompContext comp() throws RecognitionException {
		CompContext _localctx = new CompContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_comp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(123);
			exprcomp();
			}
			setState(124);
			match(PV);
			codigoJava += ";\n";
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExprcompContext extends ParserRuleContext {
		public CompstrContext compstr() {
			return getRuleContext(CompstrContext.class,0);
		}
		public List<AdcsubContext> adcsub() {
			return getRuleContexts(AdcsubContext.class);
		}
		public AdcsubContext adcsub(int i) {
			return getRuleContext(AdcsubContext.class,i);
		}
		public ExprcompContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprcomp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AtresListener ) ((AtresListener)listener).enterExprcomp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AtresListener ) ((AtresListener)listener).exitExprcomp(this);
		}
	}

	public final ExprcompContext exprcomp() throws RecognitionException {
		ExprcompContext _localctx = new ExprcompContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_exprcomp);
		int _la;
		try {
			setState(152);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(127);
				compstr();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(128);
				adcsub();
				setState(149);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 2016L) != 0)) {
					{
					setState(147);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case T__4:
						{
						setState(129);
						match(T__4);
						codigoJava += "==";
						setState(131);
						adcsub();
						}
						break;
					case T__5:
						{
						setState(132);
						match(T__5);
						codigoJava += "!=";
						setState(134);
						adcsub();
						}
						break;
					case T__6:
						{
						setState(135);
						match(T__6);
						codigoJava += ">";
						setState(137);
						adcsub();
						}
						break;
					case T__7:
						{
						setState(138);
						match(T__7);
						codigoJava += "<";
						setState(140);
						adcsub();
						}
						break;
					case T__8:
						{
						setState(141);
						match(T__8);
						codigoJava += ">=";
						setState(143);
						adcsub();
						}
						break;
					case T__9:
						{
						setState(144);
						match(T__9);
						codigoJava += "<=";
						setState(146);
						adcsub();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					setState(151);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CompstrContext extends ParserRuleContext {
		public Token ID;
		public Token STRING;
		public List<TerminalNode> ID() { return getTokens(AtresParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(AtresParser.ID, i);
		}
		public List<TerminalNode> STRING() { return getTokens(AtresParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(AtresParser.STRING, i);
		}
		public PegarContext pegar() {
			return getRuleContext(PegarContext.class,0);
		}
		public CompstrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compstr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AtresListener ) ((AtresListener)listener).enterCompstr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AtresListener ) ((AtresListener)listener).exitCompstr(this);
		}
	}

	public final CompstrContext compstr() throws RecognitionException {
		CompstrContext _localctx = new CompstrContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_compstr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(158);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				{
				setState(154);
				((CompstrContext)_localctx).ID = match(ID);

				boolean declarado = validV.jaExiste((((CompstrContext)_localctx).ID!=null?((CompstrContext)_localctx).ID.getText():null));
				variavelSalva = (((CompstrContext)_localctx).ID!=null?((CompstrContext)_localctx).ID.getText():null);
				if(!declarado){
				    System.err.println("A variavel '" + (((CompstrContext)_localctx).ID!=null?((CompstrContext)_localctx).ID.getText():null) + "' não foi declarada");
				    System.exit(0);
				} codigoJava += (((CompstrContext)_localctx).ID!=null?((CompstrContext)_localctx).ID.getText():null) + ".equals("; 
				}
				break;
			case STRING:
				{
				setState(156);
				((CompstrContext)_localctx).STRING = match(STRING);
				codigoJava += (((CompstrContext)_localctx).STRING!=null?((CompstrContext)_localctx).STRING.getText():null) + ".equals("; 
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(160);
			match(T__4);
			setState(166);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				{
				setState(161);
				((CompstrContext)_localctx).ID = match(ID);

				boolean declarado = validV.jaExiste((((CompstrContext)_localctx).ID!=null?((CompstrContext)_localctx).ID.getText():null));
				if(!declarado){
				    System.err.println("A variavel '" + (((CompstrContext)_localctx).ID!=null?((CompstrContext)_localctx).ID.getText():null) + "' não foi declarada");
				    System.exit(0);
				} else if(validV.busca(variavelSalva).getTipo() != validV.busca((((CompstrContext)_localctx).ID!=null?((CompstrContext)_localctx).ID.getText():null)).getTipo()){
				    System.err.println("A variavel '" + variavelSalva + "' ou '" + (((CompstrContext)_localctx).ID!=null?((CompstrContext)_localctx).ID.getText():null) + "' nao e tipo do texto!");
				    System.exit(0);
				} codigoJava += (((CompstrContext)_localctx).ID!=null?((CompstrContext)_localctx).ID.getText():null) + ")"; 
				}
				break;
			case STRING:
				{
				setState(163);
				((CompstrContext)_localctx).STRING = match(STRING);
				codigoJava += (((CompstrContext)_localctx).STRING!=null?((CompstrContext)_localctx).STRING.getText():null) + ")";
				}
				break;
			case T__2:
				{
				setState(165);
				pegar();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExprContext extends ParserRuleContext {
		public ExprmathContext exprmath() {
			return getRuleContext(ExprmathContext.class,0);
		}
		public TerminalNode PV() { return getToken(AtresParser.PV, 0); }
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AtresListener ) ((AtresListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AtresListener ) ((AtresListener)listener).exitExpr(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_expr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(168);
			exprmath();
			setState(169);
			match(PV);
			codigoJava += ";\n";
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExprmathContext extends ParserRuleContext {
		public AdcsubContext adcsub() {
			return getRuleContext(AdcsubContext.class,0);
		}
		public TextovariavelContext textovariavel() {
			return getRuleContext(TextovariavelContext.class,0);
		}
		public ExprmathContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprmath; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AtresListener ) ((AtresListener)listener).enterExprmath(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AtresListener ) ((AtresListener)listener).exitExprmath(this);
		}
	}

	public final ExprmathContext exprmath() throws RecognitionException {
		ExprmathContext _localctx = new ExprmathContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_exprmath);
		try {
			setState(174);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(172);
				adcsub();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(173);
				textovariavel(0);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AdcsubContext extends ParserRuleContext {
		public List<MultdivContext> multdiv() {
			return getRuleContexts(MultdivContext.class);
		}
		public MultdivContext multdiv(int i) {
			return getRuleContext(MultdivContext.class,i);
		}
		public AdcsubContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_adcsub; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AtresListener ) ((AtresListener)listener).enterAdcsub(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AtresListener ) ((AtresListener)listener).exitAdcsub(this);
		}
	}

	public final AdcsubContext adcsub() throws RecognitionException {
		AdcsubContext _localctx = new AdcsubContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_adcsub);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(176);
			multdiv();
			setState(185);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__10 || _la==T__11) {
				{
				setState(183);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__10:
					{
					setState(177);
					match(T__10);
					codigoJava += "+";
					setState(179);
					multdiv();
					}
					break;
				case T__11:
					{
					setState(180);
					match(T__11);
					codigoJava += "-";
					setState(182);
					multdiv();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(187);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class MultdivContext extends ParserRuleContext {
		public List<NumContext> num() {
			return getRuleContexts(NumContext.class);
		}
		public NumContext num(int i) {
			return getRuleContext(NumContext.class,i);
		}
		public MultdivContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multdiv; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AtresListener ) ((AtresListener)listener).enterMultdiv(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AtresListener ) ((AtresListener)listener).exitMultdiv(this);
		}
	}

	public final MultdivContext multdiv() throws RecognitionException {
		MultdivContext _localctx = new MultdivContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_multdiv);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(188);
			num();
			setState(197);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__12 || _la==T__13) {
				{
				setState(195);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__12:
					{
					setState(189);
					match(T__12);
					codigoJava += "*";
					setState(191);
					num();
					}
					break;
				case T__13:
					{
					setState(192);
					match(T__13);
					codigoJava += "/";
					setState(194);
					num();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(199);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class NumContext extends ParserRuleContext {
		public Token INT;
		public Token DECIMAL;
		public Token ID;
		public TerminalNode INT() { return getToken(AtresParser.INT, 0); }
		public TerminalNode DECIMAL() { return getToken(AtresParser.DECIMAL, 0); }
		public TerminalNode ID() { return getToken(AtresParser.ID, 0); }
		public TerminalNode AP() { return getToken(AtresParser.AP, 0); }
		public ExprmathContext exprmath() {
			return getRuleContext(ExprmathContext.class,0);
		}
		public TerminalNode FP() { return getToken(AtresParser.FP, 0); }
		public NumContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_num; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AtresListener ) ((AtresListener)listener).enterNum(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AtresListener ) ((AtresListener)listener).exitNum(this);
		}
	}

	public final NumContext num() throws RecognitionException {
		NumContext _localctx = new NumContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_num);
		try {
			setState(210);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
				enterOuterAlt(_localctx, 1);
				{
				setState(200);
				((NumContext)_localctx).INT = match(INT);
				codigoJava += (((NumContext)_localctx).INT!=null?((NumContext)_localctx).INT.getText():null);
				}
				break;
			case DECIMAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(202);
				((NumContext)_localctx).DECIMAL = match(DECIMAL);
				codigoJava += (((NumContext)_localctx).DECIMAL!=null?((NumContext)_localctx).DECIMAL.getText():null);
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 3);
				{
				setState(204);
				((NumContext)_localctx).ID = match(ID);

				    boolean declarado = validV.jaExiste((((NumContext)_localctx).ID!=null?((NumContext)_localctx).ID.getText():null));
				    variavelSalva = (((NumContext)_localctx).ID!=null?((NumContext)_localctx).ID.getText():null);
				    if(!declarado){
				        System.err.println("A variavel "+(((NumContext)_localctx).ID!=null?((NumContext)_localctx).ID.getText():null)+" não foi declarada");
				        System.exit(0);
				    }else if(validV.busca((((NumContext)_localctx).ID!=null?((NumContext)_localctx).ID.getText():null)).getTipo() == 2){
				        System.err.println("Nao e possivel realizar essa operacao");
				        System.exit(0);
				    }
				    codigoJava += (((NumContext)_localctx).ID!=null?((NumContext)_localctx).ID.getText():null);
				    
				}
				break;
			case AP:
				enterOuterAlt(_localctx, 4);
				{
				setState(206);
				match(AP);
				setState(207);
				exprmath();
				setState(208);
				match(FP);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CmdContext extends ParserRuleContext {
		public ExprcompContext exprcomp() {
			return getRuleContext(ExprcompContext.class,0);
		}
		public ExprmathContext exprmath() {
			return getRuleContext(ExprmathContext.class,0);
		}
		public CmdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmd; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AtresListener ) ((AtresListener)listener).enterCmd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AtresListener ) ((AtresListener)listener).exitCmd(this);
		}
	}

	public final CmdContext cmd() throws RecognitionException {
		CmdContext _localctx = new CmdContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_cmd);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(214);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				{
				setState(212);
				exprcomp();
				}
				break;
			case 2:
				{
				setState(213);
				exprmath();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TextovariavelContext extends ParserRuleContext {
		public Token STRING;
		public Token ID;
		public TerminalNode STRING() { return getToken(AtresParser.STRING, 0); }
		public TerminalNode ID() { return getToken(AtresParser.ID, 0); }
		public PegarContext pegar() {
			return getRuleContext(PegarContext.class,0);
		}
		public List<TextovariavelContext> textovariavel() {
			return getRuleContexts(TextovariavelContext.class);
		}
		public TextovariavelContext textovariavel(int i) {
			return getRuleContext(TextovariavelContext.class,i);
		}
		public TextovariavelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_textovariavel; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AtresListener ) ((AtresListener)listener).enterTextovariavel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AtresListener ) ((AtresListener)listener).exitTextovariavel(this);
		}
	}

	public final TextovariavelContext textovariavel() throws RecognitionException {
		return textovariavel(0);
	}

	private TextovariavelContext textovariavel(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		TextovariavelContext _localctx = new TextovariavelContext(_ctx, _parentState);
		TextovariavelContext _prevctx = _localctx;
		int _startState = 36;
		enterRecursionRule(_localctx, 36, RULE_textovariavel, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(222);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRING:
				{
				setState(217);
				((TextovariavelContext)_localctx).STRING = match(STRING);
				 codigoJava += (((TextovariavelContext)_localctx).STRING!=null?((TextovariavelContext)_localctx).STRING.getText():null);
				}
				break;
			case ID:
				{
				setState(219);
				((TextovariavelContext)_localctx).ID = match(ID);

				boolean declarado = validV.jaExiste((((TextovariavelContext)_localctx).ID!=null?((TextovariavelContext)_localctx).ID.getText():null));
				if(!declarado){
				    System.err.println("A variavel " + (((TextovariavelContext)_localctx).ID!=null?((TextovariavelContext)_localctx).ID.getText():null) + " não foi declarada");
				    System.exit(0);
				}
				codigoJava += (((TextovariavelContext)_localctx).ID!=null?((TextovariavelContext)_localctx).ID.getText():null);

				}
				break;
			case T__2:
				{
				setState(221);
				pegar();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(230);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new TextovariavelContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_textovariavel);
					setState(224);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					codigoJava += " + ";
					setState(226);
					match(T__10);
					setState(227);
					textovariavel(2);
					}
					} 
				}
				setState(232);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CondContext extends ParserRuleContext {
		public TerminalNode AP() { return getToken(AtresParser.AP, 0); }
		public CmdContext cmd() {
			return getRuleContext(CmdContext.class,0);
		}
		public TerminalNode FP() { return getToken(AtresParser.FP, 0); }
		public List<TerminalNode> AC() { return getTokens(AtresParser.AC); }
		public TerminalNode AC(int i) {
			return getToken(AtresParser.AC, i);
		}
		public List<BlocoContext> bloco() {
			return getRuleContexts(BlocoContext.class);
		}
		public BlocoContext bloco(int i) {
			return getRuleContext(BlocoContext.class,i);
		}
		public List<TerminalNode> FC() { return getTokens(AtresParser.FC); }
		public TerminalNode FC(int i) {
			return getToken(AtresParser.FC, i);
		}
		public CondContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cond; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AtresListener ) ((AtresListener)listener).enterCond(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AtresListener ) ((AtresListener)listener).exitCond(this);
		}
	}

	public final CondContext cond() throws RecognitionException {
		CondContext _localctx = new CondContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_cond);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(233);
			match(T__14);
			setState(234);
			match(AP);

					codigoJava += "if(";
				
			setState(236);
			cmd();
			setState(237);
			match(FP);

					codigoJava += ")";
				
			setState(239);
			match(AC);

					codigoJava+= "{\n";
				
			setState(241);
			bloco();
			setState(242);
			match(FC);

					codigoJava += "}\n";
				
			setState(251);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__15) {
				{
				setState(244);
				match(T__15);
				setState(245);
				match(AC);

						codigoJava+= "else{\n";
					
				setState(247);
				bloco();
				setState(248);
				match(FC);

						codigoJava+= "}\n";
					
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ParacadaContext extends ParserRuleContext {
		public TerminalNode AP() { return getToken(AtresParser.AP, 0); }
		public List<AtribuirContext> atribuir() {
			return getRuleContexts(AtribuirContext.class);
		}
		public AtribuirContext atribuir(int i) {
			return getRuleContext(AtribuirContext.class,i);
		}
		public List<TerminalNode> V() { return getTokens(AtresParser.V); }
		public TerminalNode V(int i) {
			return getToken(AtresParser.V, i);
		}
		public CmdContext cmd() {
			return getRuleContext(CmdContext.class,0);
		}
		public TerminalNode FP() { return getToken(AtresParser.FP, 0); }
		public TerminalNode AC() { return getToken(AtresParser.AC, 0); }
		public BlocoContext bloco() {
			return getRuleContext(BlocoContext.class,0);
		}
		public TerminalNode FC() { return getToken(AtresParser.FC, 0); }
		public ParacadaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_paracada; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AtresListener ) ((AtresListener)listener).enterParacada(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AtresListener ) ((AtresListener)listener).exitParacada(this);
		}
	}

	public final ParacadaContext paracada() throws RecognitionException {
		ParacadaContext _localctx = new ParacadaContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_paracada);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(253);
			match(T__16);
			setState(254);
			match(AP);
			codigoJava += "for(";
			setState(256);
			atribuir();
			setState(257);
			match(V);
			codigoJava+= ";";
			setState(259);
			cmd();
			setState(260);
			match(V);
			codigoJava+= ";";
			setState(262);
			atribuir();
			setState(263);
			match(FP);
			codigoJava+= ")";
			setState(265);
			match(AC);
			codigoJava += "{\n";
			setState(267);
			bloco();
			setState(268);
			match(FC);
			codigoJava += "}\n";
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class EnquantoContext extends ParserRuleContext {
		public TerminalNode AP() { return getToken(AtresParser.AP, 0); }
		public CmdContext cmd() {
			return getRuleContext(CmdContext.class,0);
		}
		public TerminalNode FP() { return getToken(AtresParser.FP, 0); }
		public TerminalNode AC() { return getToken(AtresParser.AC, 0); }
		public BlocoContext bloco() {
			return getRuleContext(BlocoContext.class,0);
		}
		public TerminalNode FC() { return getToken(AtresParser.FC, 0); }
		public EnquantoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enquanto; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AtresListener ) ((AtresListener)listener).enterEnquanto(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AtresListener ) ((AtresListener)listener).exitEnquanto(this);
		}
	}

	public final EnquantoContext enquanto() throws RecognitionException {
		EnquantoContext _localctx = new EnquantoContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_enquanto);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(271);
			match(T__17);
			setState(272);
			match(AP);

			        codigoJava += "while (";
			    
			setState(274);
			cmd();
			setState(275);
			match(FP);

			        codigoJava += "){\n";
			    
			setState(277);
			match(AC);
			setState(278);
			bloco();
			setState(279);
			match(FC);

			        codigoJava += "}\n";
			    
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class BlocoContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<CompContext> comp() {
			return getRuleContexts(CompContext.class);
		}
		public CompContext comp(int i) {
			return getRuleContext(CompContext.class,i);
		}
		public List<DeclararpvContext> declararpv() {
			return getRuleContexts(DeclararpvContext.class);
		}
		public DeclararpvContext declararpv(int i) {
			return getRuleContext(DeclararpvContext.class,i);
		}
		public List<AtribuirpvContext> atribuirpv() {
			return getRuleContexts(AtribuirpvContext.class);
		}
		public AtribuirpvContext atribuirpv(int i) {
			return getRuleContext(AtribuirpvContext.class,i);
		}
		public List<CondContext> cond() {
			return getRuleContexts(CondContext.class);
		}
		public CondContext cond(int i) {
			return getRuleContext(CondContext.class,i);
		}
		public List<EnquantoContext> enquanto() {
			return getRuleContexts(EnquantoContext.class);
		}
		public EnquantoContext enquanto(int i) {
			return getRuleContext(EnquantoContext.class,i);
		}
		public List<ParacadaContext> paracada() {
			return getRuleContexts(ParacadaContext.class);
		}
		public ParacadaContext paracada(int i) {
			return getRuleContext(ParacadaContext.class,i);
		}
		public List<MostrarContext> mostrar() {
			return getRuleContexts(MostrarContext.class);
		}
		public MostrarContext mostrar(int i) {
			return getRuleContext(MostrarContext.class,i);
		}
		public List<PegarpvContext> pegarpv() {
			return getRuleContexts(PegarpvContext.class);
		}
		public PegarpvContext pegarpv(int i) {
			return getRuleContext(PegarpvContext.class,i);
		}
		public BlocoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bloco; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AtresListener ) ((AtresListener)listener).enterBloco(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AtresListener ) ((AtresListener)listener).exitBloco(this);
		}
	}

	public final BlocoContext bloco() throws RecognitionException {
		BlocoContext _localctx = new BlocoContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_bloco);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(291); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					setState(291);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
					case 1:
						{
						setState(282);
						expr();
						}
						break;
					case 2:
						{
						setState(283);
						comp();
						}
						break;
					case 3:
						{
						setState(284);
						declararpv();
						}
						break;
					case 4:
						{
						setState(285);
						atribuirpv();
						}
						break;
					case 5:
						{
						setState(286);
						cond();
						}
						break;
					case 6:
						{
						setState(287);
						enquanto();
						}
						break;
					case 7:
						{
						setState(288);
						paracada();
						}
						break;
					case 8:
						{
						setState(289);
						mostrar();
						}
						break;
					case 9:
						{
						setState(290);
						pegarpv();
						}
						break;
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(293); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 18:
			return textovariavel_sempred((TextovariavelContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean textovariavel_sempred(TextovariavelContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001\"\u0128\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0004\u00004\b\u0000\u000b\u0000\f\u00005\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0003\u0001B\b\u0001\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0003\u0005`\b\u0005\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0003\u0007p\b\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0005\n\u0094\b\n\n\n\f\n\u0097\t\n\u0003\n\u0099\b"+
		"\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0003\u000b\u009f\b"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0003\u000b\u00a7\b\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\r\u0001\r\u0003\r\u00af\b\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0005\u000e\u00b8\b\u000e\n"+
		"\u000e\f\u000e\u00bb\t\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0005\u000f\u00c4\b\u000f\n"+
		"\u000f\f\u000f\u00c7\t\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0003\u0010\u00d3\b\u0010\u0001\u0011\u0001\u0011\u0003\u0011\u00d7"+
		"\b\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001"+
		"\u0012\u0003\u0012\u00df\b\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001"+
		"\u0012\u0005\u0012\u00e5\b\u0012\n\u0012\f\u0012\u00e8\t\u0012\u0001\u0013"+
		"\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013"+
		"\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013"+
		"\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0003\u0013"+
		"\u00fc\b\u0013\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014"+
		"\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014"+
		"\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014"+
		"\u0001\u0014\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015"+
		"\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015"+
		"\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016"+
		"\u0001\u0016\u0001\u0016\u0001\u0016\u0004\u0016\u0124\b\u0016\u000b\u0016"+
		"\f\u0016\u0125\u0001\u0016\u0000\u0001$\u0017\u0000\u0002\u0004\u0006"+
		"\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*,\u0000"+
		"\u0000\u013b\u0000.\u0001\u0000\u0000\u0000\u0002A\u0001\u0000\u0000\u0000"+
		"\u0004C\u0001\u0000\u0000\u0000\u0006G\u0001\u0000\u0000\u0000\bK\u0001"+
		"\u0000\u0000\u0000\nO\u0001\u0000\u0000\u0000\fa\u0001\u0000\u0000\u0000"+
		"\u000ee\u0001\u0000\u0000\u0000\u0010s\u0001\u0000\u0000\u0000\u0012{"+
		"\u0001\u0000\u0000\u0000\u0014\u0098\u0001\u0000\u0000\u0000\u0016\u009e"+
		"\u0001\u0000\u0000\u0000\u0018\u00a8\u0001\u0000\u0000\u0000\u001a\u00ae"+
		"\u0001\u0000\u0000\u0000\u001c\u00b0\u0001\u0000\u0000\u0000\u001e\u00bc"+
		"\u0001\u0000\u0000\u0000 \u00d2\u0001\u0000\u0000\u0000\"\u00d6\u0001"+
		"\u0000\u0000\u0000$\u00de\u0001\u0000\u0000\u0000&\u00e9\u0001\u0000\u0000"+
		"\u0000(\u00fd\u0001\u0000\u0000\u0000*\u010f\u0001\u0000\u0000\u0000,"+
		"\u0123\u0001\u0000\u0000\u0000./\u0006\u0000\uffff\uffff\u0000/0\u0005"+
		"\u0001\u0000\u000001\u0005\u001e\u0000\u000013\u0006\u0000\uffff\uffff"+
		"\u000024\u0003,\u0016\u000032\u0001\u0000\u0000\u000045\u0001\u0000\u0000"+
		"\u000053\u0001\u0000\u0000\u000056\u0001\u0000\u0000\u000067\u0001\u0000"+
		"\u0000\u000078\u0005\u001f\u0000\u000089\u0005\u0002\u0000\u00009:\u0006"+
		"\u0000\uffff\uffff\u0000:\u0001\u0001\u0000\u0000\u0000;<\u0005\u0013"+
		"\u0000\u0000<B\u0006\u0001\uffff\uffff\u0000=>\u0005\u0014\u0000\u0000"+
		">B\u0006\u0001\uffff\uffff\u0000?@\u0005\u0015\u0000\u0000@B\u0006\u0001"+
		"\uffff\uffff\u0000A;\u0001\u0000\u0000\u0000A=\u0001\u0000\u0000\u0000"+
		"A?\u0001\u0000\u0000\u0000B\u0003\u0001\u0000\u0000\u0000CD\u0003\u0006"+
		"\u0003\u0000DE\u0005\u001d\u0000\u0000EF\u0006\u0002\uffff\uffff\u0000"+
		"F\u0005\u0001\u0000\u0000\u0000GH\u0003\u0002\u0001\u0000HI\u0005\u0016"+
		"\u0000\u0000IJ\u0006\u0003\uffff\uffff\u0000J\u0007\u0001\u0000\u0000"+
		"\u0000KL\u0003\n\u0005\u0000LM\u0005\u001d\u0000\u0000MN\u0006\u0004\uffff"+
		"\uffff\u0000N\t\u0001\u0000\u0000\u0000OP\u0005\u0016\u0000\u0000PQ\u0006"+
		"\u0005\uffff\uffff\u0000QR\u0005\u001b\u0000\u0000R_\u0006\u0005\uffff"+
		"\uffff\u0000ST\u0005\u0016\u0000\u0000T`\u0006\u0005\uffff\uffff\u0000"+
		"UV\u0005\u0018\u0000\u0000V`\u0006\u0005\uffff\uffff\u0000WX\u0005\u0019"+
		"\u0000\u0000X`\u0006\u0005\uffff\uffff\u0000YZ\u0005\u0017\u0000\u0000"+
		"Z`\u0006\u0005\uffff\uffff\u0000[\\\u0003\u000e\u0007\u0000\\]\u0006\u0005"+
		"\uffff\uffff\u0000]`\u0001\u0000\u0000\u0000^`\u0003\u001a\r\u0000_S\u0001"+
		"\u0000\u0000\u0000_U\u0001\u0000\u0000\u0000_W\u0001\u0000\u0000\u0000"+
		"_Y\u0001\u0000\u0000\u0000_[\u0001\u0000\u0000\u0000_^\u0001\u0000\u0000"+
		"\u0000`\u000b\u0001\u0000\u0000\u0000ab\u0003\u000e\u0007\u0000bc\u0005"+
		"\u001d\u0000\u0000cd\u0006\u0006\uffff\uffff\u0000d\r\u0001\u0000\u0000"+
		"\u0000ef\u0005\u0003\u0000\u0000fo\u0005 \u0000\u0000gh\u0005\u0017\u0000"+
		"\u0000hp\u0006\u0007\uffff\uffff\u0000ij\u0005\u0018\u0000\u0000jp\u0006"+
		"\u0007\uffff\uffff\u0000kl\u0005\u0019\u0000\u0000lp\u0006\u0007\uffff"+
		"\uffff\u0000mn\u0005\u0016\u0000\u0000np\u0006\u0007\uffff\uffff\u0000"+
		"og\u0001\u0000\u0000\u0000oi\u0001\u0000\u0000\u0000ok\u0001\u0000\u0000"+
		"\u0000om\u0001\u0000\u0000\u0000pq\u0001\u0000\u0000\u0000qr\u0005!\u0000"+
		"\u0000r\u000f\u0001\u0000\u0000\u0000st\u0005\u0004\u0000\u0000tu\u0005"+
		" \u0000\u0000uv\u0006\b\uffff\uffff\u0000vw\u0003$\u0012\u0000wx\u0005"+
		"!\u0000\u0000xy\u0005\u001d\u0000\u0000yz\u0006\b\uffff\uffff\u0000z\u0011"+
		"\u0001\u0000\u0000\u0000{|\u0003\u0014\n\u0000|}\u0005\u001d\u0000\u0000"+
		"}~\u0006\t\uffff\uffff\u0000~\u0013\u0001\u0000\u0000\u0000\u007f\u0099"+
		"\u0003\u0016\u000b\u0000\u0080\u0095\u0003\u001c\u000e\u0000\u0081\u0082"+
		"\u0005\u0005\u0000\u0000\u0082\u0083\u0006\n\uffff\uffff\u0000\u0083\u0094"+
		"\u0003\u001c\u000e\u0000\u0084\u0085\u0005\u0006\u0000\u0000\u0085\u0086"+
		"\u0006\n\uffff\uffff\u0000\u0086\u0094\u0003\u001c\u000e\u0000\u0087\u0088"+
		"\u0005\u0007\u0000\u0000\u0088\u0089\u0006\n\uffff\uffff\u0000\u0089\u0094"+
		"\u0003\u001c\u000e\u0000\u008a\u008b\u0005\b\u0000\u0000\u008b\u008c\u0006"+
		"\n\uffff\uffff\u0000\u008c\u0094\u0003\u001c\u000e\u0000\u008d\u008e\u0005"+
		"\t\u0000\u0000\u008e\u008f\u0006\n\uffff\uffff\u0000\u008f\u0094\u0003"+
		"\u001c\u000e\u0000\u0090\u0091\u0005\n\u0000\u0000\u0091\u0092\u0006\n"+
		"\uffff\uffff\u0000\u0092\u0094\u0003\u001c\u000e\u0000\u0093\u0081\u0001"+
		"\u0000\u0000\u0000\u0093\u0084\u0001\u0000\u0000\u0000\u0093\u0087\u0001"+
		"\u0000\u0000\u0000\u0093\u008a\u0001\u0000\u0000\u0000\u0093\u008d\u0001"+
		"\u0000\u0000\u0000\u0093\u0090\u0001\u0000\u0000\u0000\u0094\u0097\u0001"+
		"\u0000\u0000\u0000\u0095\u0093\u0001\u0000\u0000\u0000\u0095\u0096\u0001"+
		"\u0000\u0000\u0000\u0096\u0099\u0001\u0000\u0000\u0000\u0097\u0095\u0001"+
		"\u0000\u0000\u0000\u0098\u007f\u0001\u0000\u0000\u0000\u0098\u0080\u0001"+
		"\u0000\u0000\u0000\u0099\u0015\u0001\u0000\u0000\u0000\u009a\u009b\u0005"+
		"\u0016\u0000\u0000\u009b\u009f\u0006\u000b\uffff\uffff\u0000\u009c\u009d"+
		"\u0005\u0017\u0000\u0000\u009d\u009f\u0006\u000b\uffff\uffff\u0000\u009e"+
		"\u009a\u0001\u0000\u0000\u0000\u009e\u009c\u0001\u0000\u0000\u0000\u009f"+
		"\u00a0\u0001\u0000\u0000\u0000\u00a0\u00a6\u0005\u0005\u0000\u0000\u00a1"+
		"\u00a2\u0005\u0016\u0000\u0000\u00a2\u00a7\u0006\u000b\uffff\uffff\u0000"+
		"\u00a3\u00a4\u0005\u0017\u0000\u0000\u00a4\u00a7\u0006\u000b\uffff\uffff"+
		"\u0000\u00a5\u00a7\u0003\u000e\u0007\u0000\u00a6\u00a1\u0001\u0000\u0000"+
		"\u0000\u00a6\u00a3\u0001\u0000\u0000\u0000\u00a6\u00a5\u0001\u0000\u0000"+
		"\u0000\u00a7\u0017\u0001\u0000\u0000\u0000\u00a8\u00a9\u0003\u001a\r\u0000"+
		"\u00a9\u00aa\u0005\u001d\u0000\u0000\u00aa\u00ab\u0006\f\uffff\uffff\u0000"+
		"\u00ab\u0019\u0001\u0000\u0000\u0000\u00ac\u00af\u0003\u001c\u000e\u0000"+
		"\u00ad\u00af\u0003$\u0012\u0000\u00ae\u00ac\u0001\u0000\u0000\u0000\u00ae"+
		"\u00ad\u0001\u0000\u0000\u0000\u00af\u001b\u0001\u0000\u0000\u0000\u00b0"+
		"\u00b9\u0003\u001e\u000f\u0000\u00b1\u00b2\u0005\u000b\u0000\u0000\u00b2"+
		"\u00b3\u0006\u000e\uffff\uffff\u0000\u00b3\u00b8\u0003\u001e\u000f\u0000"+
		"\u00b4\u00b5\u0005\f\u0000\u0000\u00b5\u00b6\u0006\u000e\uffff\uffff\u0000"+
		"\u00b6\u00b8\u0003\u001e\u000f\u0000\u00b7\u00b1\u0001\u0000\u0000\u0000"+
		"\u00b7\u00b4\u0001\u0000\u0000\u0000\u00b8\u00bb\u0001\u0000\u0000\u0000"+
		"\u00b9\u00b7\u0001\u0000\u0000\u0000\u00b9\u00ba\u0001\u0000\u0000\u0000"+
		"\u00ba\u001d\u0001\u0000\u0000\u0000\u00bb\u00b9\u0001\u0000\u0000\u0000"+
		"\u00bc\u00c5\u0003 \u0010\u0000\u00bd\u00be\u0005\r\u0000\u0000\u00be"+
		"\u00bf\u0006\u000f\uffff\uffff\u0000\u00bf\u00c4\u0003 \u0010\u0000\u00c0"+
		"\u00c1\u0005\u000e\u0000\u0000\u00c1\u00c2\u0006\u000f\uffff\uffff\u0000"+
		"\u00c2\u00c4\u0003 \u0010\u0000\u00c3\u00bd\u0001\u0000\u0000\u0000\u00c3"+
		"\u00c0\u0001\u0000\u0000\u0000\u00c4\u00c7\u0001\u0000\u0000\u0000\u00c5"+
		"\u00c3\u0001\u0000\u0000\u0000\u00c5\u00c6\u0001\u0000\u0000\u0000\u00c6"+
		"\u001f\u0001\u0000\u0000\u0000\u00c7\u00c5\u0001\u0000\u0000\u0000\u00c8"+
		"\u00c9\u0005\u0018\u0000\u0000\u00c9\u00d3\u0006\u0010\uffff\uffff\u0000"+
		"\u00ca\u00cb\u0005\u0019\u0000\u0000\u00cb\u00d3\u0006\u0010\uffff\uffff"+
		"\u0000\u00cc\u00cd\u0005\u0016\u0000\u0000\u00cd\u00d3\u0006\u0010\uffff"+
		"\uffff\u0000\u00ce\u00cf\u0005 \u0000\u0000\u00cf\u00d0\u0003\u001a\r"+
		"\u0000\u00d0\u00d1\u0005!\u0000\u0000\u00d1\u00d3\u0001\u0000\u0000\u0000"+
		"\u00d2\u00c8\u0001\u0000\u0000\u0000\u00d2\u00ca\u0001\u0000\u0000\u0000"+
		"\u00d2\u00cc\u0001\u0000\u0000\u0000\u00d2\u00ce\u0001\u0000\u0000\u0000"+
		"\u00d3!\u0001\u0000\u0000\u0000\u00d4\u00d7\u0003\u0014\n\u0000\u00d5"+
		"\u00d7\u0003\u001a\r\u0000\u00d6\u00d4\u0001\u0000\u0000\u0000\u00d6\u00d5"+
		"\u0001\u0000\u0000\u0000\u00d7#\u0001\u0000\u0000\u0000\u00d8\u00d9\u0006"+
		"\u0012\uffff\uffff\u0000\u00d9\u00da\u0005\u0017\u0000\u0000\u00da\u00df"+
		"\u0006\u0012\uffff\uffff\u0000\u00db\u00dc\u0005\u0016\u0000\u0000\u00dc"+
		"\u00df\u0006\u0012\uffff\uffff\u0000\u00dd\u00df\u0003\u000e\u0007\u0000"+
		"\u00de\u00d8\u0001\u0000\u0000\u0000\u00de\u00db\u0001\u0000\u0000\u0000"+
		"\u00de\u00dd\u0001\u0000\u0000\u0000\u00df\u00e6\u0001\u0000\u0000\u0000"+
		"\u00e0\u00e1\n\u0001\u0000\u0000\u00e1\u00e2\u0006\u0012\uffff\uffff\u0000"+
		"\u00e2\u00e3\u0005\u000b\u0000\u0000\u00e3\u00e5\u0003$\u0012\u0002\u00e4"+
		"\u00e0\u0001\u0000\u0000\u0000\u00e5\u00e8\u0001\u0000\u0000\u0000\u00e6"+
		"\u00e4\u0001\u0000\u0000\u0000\u00e6\u00e7\u0001\u0000\u0000\u0000\u00e7"+
		"%\u0001\u0000\u0000\u0000\u00e8\u00e6\u0001\u0000\u0000\u0000\u00e9\u00ea"+
		"\u0005\u000f\u0000\u0000\u00ea\u00eb\u0005 \u0000\u0000\u00eb\u00ec\u0006"+
		"\u0013\uffff\uffff\u0000\u00ec\u00ed\u0003\"\u0011\u0000\u00ed\u00ee\u0005"+
		"!\u0000\u0000\u00ee\u00ef\u0006\u0013\uffff\uffff\u0000\u00ef\u00f0\u0005"+
		"\u001e\u0000\u0000\u00f0\u00f1\u0006\u0013\uffff\uffff\u0000\u00f1\u00f2"+
		"\u0003,\u0016\u0000\u00f2\u00f3\u0005\u001f\u0000\u0000\u00f3\u00fb\u0006"+
		"\u0013\uffff\uffff\u0000\u00f4\u00f5\u0005\u0010\u0000\u0000\u00f5\u00f6"+
		"\u0005\u001e\u0000\u0000\u00f6\u00f7\u0006\u0013\uffff\uffff\u0000\u00f7"+
		"\u00f8\u0003,\u0016\u0000\u00f8\u00f9\u0005\u001f\u0000\u0000\u00f9\u00fa"+
		"\u0006\u0013\uffff\uffff\u0000\u00fa\u00fc\u0001\u0000\u0000\u0000\u00fb"+
		"\u00f4\u0001\u0000\u0000\u0000\u00fb\u00fc\u0001\u0000\u0000\u0000\u00fc"+
		"\'\u0001\u0000\u0000\u0000\u00fd\u00fe\u0005\u0011\u0000\u0000\u00fe\u00ff"+
		"\u0005 \u0000\u0000\u00ff\u0100\u0006\u0014\uffff\uffff\u0000\u0100\u0101"+
		"\u0003\n\u0005\u0000\u0101\u0102\u0005\"\u0000\u0000\u0102\u0103\u0006"+
		"\u0014\uffff\uffff\u0000\u0103\u0104\u0003\"\u0011\u0000\u0104\u0105\u0005"+
		"\"\u0000\u0000\u0105\u0106\u0006\u0014\uffff\uffff\u0000\u0106\u0107\u0003"+
		"\n\u0005\u0000\u0107\u0108\u0005!\u0000\u0000\u0108\u0109\u0006\u0014"+
		"\uffff\uffff\u0000\u0109\u010a\u0005\u001e\u0000\u0000\u010a\u010b\u0006"+
		"\u0014\uffff\uffff\u0000\u010b\u010c\u0003,\u0016\u0000\u010c\u010d\u0005"+
		"\u001f\u0000\u0000\u010d\u010e\u0006\u0014\uffff\uffff\u0000\u010e)\u0001"+
		"\u0000\u0000\u0000\u010f\u0110\u0005\u0012\u0000\u0000\u0110\u0111\u0005"+
		" \u0000\u0000\u0111\u0112\u0006\u0015\uffff\uffff\u0000\u0112\u0113\u0003"+
		"\"\u0011\u0000\u0113\u0114\u0005!\u0000\u0000\u0114\u0115\u0006\u0015"+
		"\uffff\uffff\u0000\u0115\u0116\u0005\u001e\u0000\u0000\u0116\u0117\u0003"+
		",\u0016\u0000\u0117\u0118\u0005\u001f\u0000\u0000\u0118\u0119\u0006\u0015"+
		"\uffff\uffff\u0000\u0119+\u0001\u0000\u0000\u0000\u011a\u0124\u0003\u0018"+
		"\f\u0000\u011b\u0124\u0003\u0012\t\u0000\u011c\u0124\u0003\u0004\u0002"+
		"\u0000\u011d\u0124\u0003\b\u0004\u0000\u011e\u0124\u0003&\u0013\u0000"+
		"\u011f\u0124\u0003*\u0015\u0000\u0120\u0124\u0003(\u0014\u0000\u0121\u0124"+
		"\u0003\u0010\b\u0000\u0122\u0124\u0003\f\u0006\u0000\u0123\u011a\u0001"+
		"\u0000\u0000\u0000\u0123\u011b\u0001\u0000\u0000\u0000\u0123\u011c\u0001"+
		"\u0000\u0000\u0000\u0123\u011d\u0001\u0000\u0000\u0000\u0123\u011e\u0001"+
		"\u0000\u0000\u0000\u0123\u011f\u0001\u0000\u0000\u0000\u0123\u0120\u0001"+
		"\u0000\u0000\u0000\u0123\u0121\u0001\u0000\u0000\u0000\u0123\u0122\u0001"+
		"\u0000\u0000\u0000\u0124\u0125\u0001\u0000\u0000\u0000\u0125\u0123\u0001"+
		"\u0000\u0000\u0000\u0125\u0126\u0001\u0000\u0000\u0000\u0126-\u0001\u0000"+
		"\u0000\u0000\u00155A_o\u0093\u0095\u0098\u009e\u00a6\u00ae\u00b7\u00b9"+
		"\u00c3\u00c5\u00d2\u00d6\u00de\u00e6\u00fb\u0123\u0125";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}