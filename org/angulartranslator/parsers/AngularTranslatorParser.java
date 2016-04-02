// Generated from AngularTranslator.g4 by ANTLR 4.5.1

  package org.angulartranslator.parsers;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class AngularTranslatorParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, EXPORT=11, FUNCTION=12, NEWLINE=13, EOS=14, WS=15, MLC=16, SLC=17, 
		Identifier=18, StringLiteral=19, DoubleStringCharacter=20, SingleStringCharacter=21;
	public static final int
		RULE_initialProduction = 0, RULE_functionDeclaration = 1, RULE_simpleFunctionBody = 2, 
		RULE_returnDeclaration = 3, RULE_returnStatement = 4, RULE_objectLiteral = 5, 
		RULE_propertyNameAndValueList = 6, RULE_propertyAssignment = 7, RULE_singleExpression = 8, 
		RULE_propertyFunction = 9, RULE_injectMember = 10, RULE_formalParameterList = 11, 
		RULE_typeDeclaration = 12;
	public static final String[] ruleNames = {
		"initialProduction", "functionDeclaration", "simpleFunctionBody", "returnDeclaration", 
		"returnStatement", "objectLiteral", "propertyNameAndValueList", "propertyAssignment", 
		"singleExpression", "propertyFunction", "injectMember", "formalParameterList", 
		"typeDeclaration"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'('", "')'", "'{'", "'}'", "'return'", "','", "':'", "'['", "']'", 
		"'.'", "'export'", "'function'", null, "';'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, "EXPORT", 
		"FUNCTION", "NEWLINE", "EOS", "WS", "MLC", "SLC", "Identifier", "StringLiteral", 
		"DoubleStringCharacter", "SingleStringCharacter"
	};
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
	public String getGrammarFileName() { return "AngularTranslator.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public AngularTranslatorParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class InitialProductionContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(AngularTranslatorParser.EOF, 0); }
		public List<FunctionDeclarationContext> functionDeclaration() {
			return getRuleContexts(FunctionDeclarationContext.class);
		}
		public FunctionDeclarationContext functionDeclaration(int i) {
			return getRuleContext(FunctionDeclarationContext.class,i);
		}
		public InitialProductionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initialProduction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularTranslatorListener ) ((AngularTranslatorListener)listener).enterInitialProduction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularTranslatorListener ) ((AngularTranslatorListener)listener).exitInitialProduction(this);
		}
	}

	public final InitialProductionContext initialProduction() throws RecognitionException {
		InitialProductionContext _localctx = new InitialProductionContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_initialProduction);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(27); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(26);
				functionDeclaration();
				}
				}
				setState(29); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==EXPORT || _la==FUNCTION );
			setState(31);
			match(EOF);
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

	public static class FunctionDeclarationContext extends ParserRuleContext {
		public TerminalNode FUNCTION() { return getToken(AngularTranslatorParser.FUNCTION, 0); }
		public TerminalNode Identifier() { return getToken(AngularTranslatorParser.Identifier, 0); }
		public SimpleFunctionBodyContext simpleFunctionBody() {
			return getRuleContext(SimpleFunctionBodyContext.class,0);
		}
		public TerminalNode EXPORT() { return getToken(AngularTranslatorParser.EXPORT, 0); }
		public FormalParameterListContext formalParameterList() {
			return getRuleContext(FormalParameterListContext.class,0);
		}
		public ReturnDeclarationContext returnDeclaration() {
			return getRuleContext(ReturnDeclarationContext.class,0);
		}
		public FunctionDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularTranslatorListener ) ((AngularTranslatorListener)listener).enterFunctionDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularTranslatorListener ) ((AngularTranslatorListener)listener).exitFunctionDeclaration(this);
		}
	}

	public final FunctionDeclarationContext functionDeclaration() throws RecognitionException {
		FunctionDeclarationContext _localctx = new FunctionDeclarationContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_functionDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(34);
			_la = _input.LA(1);
			if (_la==EXPORT) {
				{
				setState(33);
				match(EXPORT);
				}
			}

			setState(36);
			match(FUNCTION);
			setState(37);
			match(Identifier);
			setState(38);
			match(T__0);
			setState(40);
			_la = _input.LA(1);
			if (_la==Identifier) {
				{
				setState(39);
				formalParameterList();
				}
			}

			setState(42);
			match(T__1);
			setState(44);
			_la = _input.LA(1);
			if (_la==T__6) {
				{
				setState(43);
				returnDeclaration();
				}
			}

			setState(46);
			match(T__2);
			setState(47);
			simpleFunctionBody();
			setState(48);
			match(T__3);
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

	public static class SimpleFunctionBodyContext extends ParserRuleContext {
		public ReturnStatementContext returnStatement() {
			return getRuleContext(ReturnStatementContext.class,0);
		}
		public SimpleFunctionBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simpleFunctionBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularTranslatorListener ) ((AngularTranslatorListener)listener).enterSimpleFunctionBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularTranslatorListener ) ((AngularTranslatorListener)listener).exitSimpleFunctionBody(this);
		}
	}

	public final SimpleFunctionBodyContext simpleFunctionBody() throws RecognitionException {
		SimpleFunctionBodyContext _localctx = new SimpleFunctionBodyContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_simpleFunctionBody);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(50);
			returnStatement();
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

	public static class ReturnDeclarationContext extends ParserRuleContext {
		public TypeDeclarationContext typeDeclaration() {
			return getRuleContext(TypeDeclarationContext.class,0);
		}
		public ReturnDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularTranslatorListener ) ((AngularTranslatorListener)listener).enterReturnDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularTranslatorListener ) ((AngularTranslatorListener)listener).exitReturnDeclaration(this);
		}
	}

	public final ReturnDeclarationContext returnDeclaration() throws RecognitionException {
		ReturnDeclarationContext _localctx = new ReturnDeclarationContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_returnDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(52);
			typeDeclaration();
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

	public static class ReturnStatementContext extends ParserRuleContext {
		public TerminalNode EOS() { return getToken(AngularTranslatorParser.EOS, 0); }
		public ObjectLiteralContext objectLiteral() {
			return getRuleContext(ObjectLiteralContext.class,0);
		}
		public ReturnStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularTranslatorListener ) ((AngularTranslatorListener)listener).enterReturnStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularTranslatorListener ) ((AngularTranslatorListener)listener).exitReturnStatement(this);
		}
	}

	public final ReturnStatementContext returnStatement() throws RecognitionException {
		ReturnStatementContext _localctx = new ReturnStatementContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_returnStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(54);
			match(T__4);
			setState(56);
			_la = _input.LA(1);
			if (_la==T__2) {
				{
				setState(55);
				objectLiteral();
				}
			}

			setState(58);
			match(EOS);
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

	public static class ObjectLiteralContext extends ParserRuleContext {
		public PropertyNameAndValueListContext propertyNameAndValueList() {
			return getRuleContext(PropertyNameAndValueListContext.class,0);
		}
		public ObjectLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_objectLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularTranslatorListener ) ((AngularTranslatorListener)listener).enterObjectLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularTranslatorListener ) ((AngularTranslatorListener)listener).exitObjectLiteral(this);
		}
	}

	public final ObjectLiteralContext objectLiteral() throws RecognitionException {
		ObjectLiteralContext _localctx = new ObjectLiteralContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_objectLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(60);
			match(T__2);
			setState(62);
			_la = _input.LA(1);
			if (_la==Identifier) {
				{
				setState(61);
				propertyNameAndValueList();
				}
			}

			setState(65);
			_la = _input.LA(1);
			if (_la==T__5) {
				{
				setState(64);
				match(T__5);
				}
			}

			setState(67);
			match(T__3);
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

	public static class PropertyNameAndValueListContext extends ParserRuleContext {
		public List<PropertyAssignmentContext> propertyAssignment() {
			return getRuleContexts(PropertyAssignmentContext.class);
		}
		public PropertyAssignmentContext propertyAssignment(int i) {
			return getRuleContext(PropertyAssignmentContext.class,i);
		}
		public PropertyNameAndValueListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_propertyNameAndValueList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularTranslatorListener ) ((AngularTranslatorListener)listener).enterPropertyNameAndValueList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularTranslatorListener ) ((AngularTranslatorListener)listener).exitPropertyNameAndValueList(this);
		}
	}

	public final PropertyNameAndValueListContext propertyNameAndValueList() throws RecognitionException {
		PropertyNameAndValueListContext _localctx = new PropertyNameAndValueListContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_propertyNameAndValueList);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(69);
			propertyAssignment();
			setState(74);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(70);
					match(T__5);
					setState(71);
					propertyAssignment();
					}
					} 
				}
				setState(76);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
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

	public static class PropertyAssignmentContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(AngularTranslatorParser.Identifier, 0); }
		public SingleExpressionContext singleExpression() {
			return getRuleContext(SingleExpressionContext.class,0);
		}
		public PropertyAssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_propertyAssignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularTranslatorListener ) ((AngularTranslatorListener)listener).enterPropertyAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularTranslatorListener ) ((AngularTranslatorListener)listener).exitPropertyAssignment(this);
		}
	}

	public final PropertyAssignmentContext propertyAssignment() throws RecognitionException {
		PropertyAssignmentContext _localctx = new PropertyAssignmentContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_propertyAssignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(77);
			match(Identifier);
			setState(78);
			match(T__6);
			setState(79);
			singleExpression();
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

	public static class SingleExpressionContext extends ParserRuleContext {
		public TerminalNode StringLiteral() { return getToken(AngularTranslatorParser.StringLiteral, 0); }
		public PropertyFunctionContext propertyFunction() {
			return getRuleContext(PropertyFunctionContext.class,0);
		}
		public InjectMemberContext injectMember() {
			return getRuleContext(InjectMemberContext.class,0);
		}
		public SingleExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_singleExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularTranslatorListener ) ((AngularTranslatorListener)listener).enterSingleExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularTranslatorListener ) ((AngularTranslatorListener)listener).exitSingleExpression(this);
		}
	}

	public final SingleExpressionContext singleExpression() throws RecognitionException {
		SingleExpressionContext _localctx = new SingleExpressionContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_singleExpression);
		try {
			setState(84);
			switch (_input.LA(1)) {
			case StringLiteral:
				enterOuterAlt(_localctx, 1);
				{
				setState(81);
				match(StringLiteral);
				}
				break;
			case FUNCTION:
				enterOuterAlt(_localctx, 2);
				{
				setState(82);
				propertyFunction();
				}
				break;
			case T__7:
				enterOuterAlt(_localctx, 3);
				{
				setState(83);
				injectMember();
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

	public static class PropertyFunctionContext extends ParserRuleContext {
		public TerminalNode FUNCTION() { return getToken(AngularTranslatorParser.FUNCTION, 0); }
		public FormalParameterListContext formalParameterList() {
			return getRuleContext(FormalParameterListContext.class,0);
		}
		public PropertyFunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_propertyFunction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularTranslatorListener ) ((AngularTranslatorListener)listener).enterPropertyFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularTranslatorListener ) ((AngularTranslatorListener)listener).exitPropertyFunction(this);
		}
	}

	public final PropertyFunctionContext propertyFunction() throws RecognitionException {
		PropertyFunctionContext _localctx = new PropertyFunctionContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_propertyFunction);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(86);
			match(FUNCTION);
			setState(87);
			match(T__0);
			setState(89);
			_la = _input.LA(1);
			if (_la==Identifier) {
				{
				setState(88);
				formalParameterList();
				}
			}

			setState(91);
			match(T__1);
			setState(92);
			match(T__2);
			setState(96);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1+1 ) {
					{
					{
					setState(93);
					matchWildcard();
					}
					} 
				}
				setState(98);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			}
			setState(99);
			match(T__3);
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

	public static class InjectMemberContext extends ParserRuleContext {
		public List<TerminalNode> StringLiteral() { return getTokens(AngularTranslatorParser.StringLiteral); }
		public TerminalNode StringLiteral(int i) {
			return getToken(AngularTranslatorParser.StringLiteral, i);
		}
		public PropertyFunctionContext propertyFunction() {
			return getRuleContext(PropertyFunctionContext.class,0);
		}
		public InjectMemberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_injectMember; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularTranslatorListener ) ((AngularTranslatorListener)listener).enterInjectMember(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularTranslatorListener ) ((AngularTranslatorListener)listener).exitInjectMember(this);
		}
	}

	public final InjectMemberContext injectMember() throws RecognitionException {
		InjectMemberContext _localctx = new InjectMemberContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_injectMember);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(101);
			match(T__7);
			setState(102);
			match(StringLiteral);
			setState(107);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(103);
					match(T__5);
					setState(104);
					match(StringLiteral);
					}
					} 
				}
				setState(109);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			}
			{
			setState(110);
			match(T__5);
			setState(111);
			propertyFunction();
			}
			setState(113);
			match(T__8);
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

	public static class FormalParameterListContext extends ParserRuleContext {
		public List<TerminalNode> Identifier() { return getTokens(AngularTranslatorParser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(AngularTranslatorParser.Identifier, i);
		}
		public FormalParameterListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formalParameterList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularTranslatorListener ) ((AngularTranslatorListener)listener).enterFormalParameterList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularTranslatorListener ) ((AngularTranslatorListener)listener).exitFormalParameterList(this);
		}
	}

	public final FormalParameterListContext formalParameterList() throws RecognitionException {
		FormalParameterListContext _localctx = new FormalParameterListContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_formalParameterList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(115);
			match(Identifier);
			setState(120);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__5) {
				{
				{
				setState(116);
				match(T__5);
				setState(117);
				match(Identifier);
				}
				}
				setState(122);
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

	public static class TypeDeclarationContext extends ParserRuleContext {
		public List<TerminalNode> Identifier() { return getTokens(AngularTranslatorParser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(AngularTranslatorParser.Identifier, i);
		}
		public TypeDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularTranslatorListener ) ((AngularTranslatorListener)listener).enterTypeDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularTranslatorListener ) ((AngularTranslatorListener)listener).exitTypeDeclaration(this);
		}
	}

	public final TypeDeclarationContext typeDeclaration() throws RecognitionException {
		TypeDeclarationContext _localctx = new TypeDeclarationContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_typeDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(123);
			match(T__6);
			setState(124);
			match(Identifier);
			setState(129);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__9) {
				{
				{
				setState(125);
				match(T__9);
				setState(126);
				match(Identifier);
				}
				}
				setState(131);
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

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\27\u0087\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\3\2\6\2\36\n\2\r\2\16\2\37\3\2\3\2\3\3"+
		"\5\3%\n\3\3\3\3\3\3\3\3\3\5\3+\n\3\3\3\3\3\5\3/\n\3\3\3\3\3\3\3\3\3\3"+
		"\4\3\4\3\5\3\5\3\6\3\6\5\6;\n\6\3\6\3\6\3\7\3\7\5\7A\n\7\3\7\5\7D\n\7"+
		"\3\7\3\7\3\b\3\b\3\b\7\bK\n\b\f\b\16\bN\13\b\3\t\3\t\3\t\3\t\3\n\3\n\3"+
		"\n\5\nW\n\n\3\13\3\13\3\13\5\13\\\n\13\3\13\3\13\3\13\7\13a\n\13\f\13"+
		"\16\13d\13\13\3\13\3\13\3\f\3\f\3\f\3\f\7\fl\n\f\f\f\16\fo\13\f\3\f\3"+
		"\f\3\f\3\f\3\f\3\r\3\r\3\r\7\ry\n\r\f\r\16\r|\13\r\3\16\3\16\3\16\3\16"+
		"\7\16\u0082\n\16\f\16\16\16\u0085\13\16\3\16\3b\2\17\2\4\6\b\n\f\16\20"+
		"\22\24\26\30\32\2\2\u0088\2\35\3\2\2\2\4$\3\2\2\2\6\64\3\2\2\2\b\66\3"+
		"\2\2\2\n8\3\2\2\2\f>\3\2\2\2\16G\3\2\2\2\20O\3\2\2\2\22V\3\2\2\2\24X\3"+
		"\2\2\2\26g\3\2\2\2\30u\3\2\2\2\32}\3\2\2\2\34\36\5\4\3\2\35\34\3\2\2\2"+
		"\36\37\3\2\2\2\37\35\3\2\2\2\37 \3\2\2\2 !\3\2\2\2!\"\7\2\2\3\"\3\3\2"+
		"\2\2#%\7\r\2\2$#\3\2\2\2$%\3\2\2\2%&\3\2\2\2&\'\7\16\2\2\'(\7\24\2\2("+
		"*\7\3\2\2)+\5\30\r\2*)\3\2\2\2*+\3\2\2\2+,\3\2\2\2,.\7\4\2\2-/\5\b\5\2"+
		".-\3\2\2\2./\3\2\2\2/\60\3\2\2\2\60\61\7\5\2\2\61\62\5\6\4\2\62\63\7\6"+
		"\2\2\63\5\3\2\2\2\64\65\5\n\6\2\65\7\3\2\2\2\66\67\5\32\16\2\67\t\3\2"+
		"\2\28:\7\7\2\29;\5\f\7\2:9\3\2\2\2:;\3\2\2\2;<\3\2\2\2<=\7\20\2\2=\13"+
		"\3\2\2\2>@\7\5\2\2?A\5\16\b\2@?\3\2\2\2@A\3\2\2\2AC\3\2\2\2BD\7\b\2\2"+
		"CB\3\2\2\2CD\3\2\2\2DE\3\2\2\2EF\7\6\2\2F\r\3\2\2\2GL\5\20\t\2HI\7\b\2"+
		"\2IK\5\20\t\2JH\3\2\2\2KN\3\2\2\2LJ\3\2\2\2LM\3\2\2\2M\17\3\2\2\2NL\3"+
		"\2\2\2OP\7\24\2\2PQ\7\t\2\2QR\5\22\n\2R\21\3\2\2\2SW\7\25\2\2TW\5\24\13"+
		"\2UW\5\26\f\2VS\3\2\2\2VT\3\2\2\2VU\3\2\2\2W\23\3\2\2\2XY\7\16\2\2Y[\7"+
		"\3\2\2Z\\\5\30\r\2[Z\3\2\2\2[\\\3\2\2\2\\]\3\2\2\2]^\7\4\2\2^b\7\5\2\2"+
		"_a\13\2\2\2`_\3\2\2\2ad\3\2\2\2bc\3\2\2\2b`\3\2\2\2ce\3\2\2\2db\3\2\2"+
		"\2ef\7\6\2\2f\25\3\2\2\2gh\7\n\2\2hm\7\25\2\2ij\7\b\2\2jl\7\25\2\2ki\3"+
		"\2\2\2lo\3\2\2\2mk\3\2\2\2mn\3\2\2\2np\3\2\2\2om\3\2\2\2pq\7\b\2\2qr\5"+
		"\24\13\2rs\3\2\2\2st\7\13\2\2t\27\3\2\2\2uz\7\24\2\2vw\7\b\2\2wy\7\24"+
		"\2\2xv\3\2\2\2y|\3\2\2\2zx\3\2\2\2z{\3\2\2\2{\31\3\2\2\2|z\3\2\2\2}~\7"+
		"\t\2\2~\u0083\7\24\2\2\177\u0080\7\f\2\2\u0080\u0082\7\24\2\2\u0081\177"+
		"\3\2\2\2\u0082\u0085\3\2\2\2\u0083\u0081\3\2\2\2\u0083\u0084\3\2\2\2\u0084"+
		"\33\3\2\2\2\u0085\u0083\3\2\2\2\20\37$*.:@CLV[bmz\u0083";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}