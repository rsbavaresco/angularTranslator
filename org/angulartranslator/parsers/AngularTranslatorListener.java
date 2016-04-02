// Generated from AngularTranslator.g4 by ANTLR 4.5.1

  package org.angulartranslator.parsers;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link AngularTranslatorParser}.
 */
public interface AngularTranslatorListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link AngularTranslatorParser#initialProduction}.
	 * @param ctx the parse tree
	 */
	void enterInitialProduction(AngularTranslatorParser.InitialProductionContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularTranslatorParser#initialProduction}.
	 * @param ctx the parse tree
	 */
	void exitInitialProduction(AngularTranslatorParser.InitialProductionContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularTranslatorParser#functionDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterFunctionDeclaration(AngularTranslatorParser.FunctionDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularTranslatorParser#functionDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitFunctionDeclaration(AngularTranslatorParser.FunctionDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularTranslatorParser#simpleFunctionBody}.
	 * @param ctx the parse tree
	 */
	void enterSimpleFunctionBody(AngularTranslatorParser.SimpleFunctionBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularTranslatorParser#simpleFunctionBody}.
	 * @param ctx the parse tree
	 */
	void exitSimpleFunctionBody(AngularTranslatorParser.SimpleFunctionBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularTranslatorParser#returnDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterReturnDeclaration(AngularTranslatorParser.ReturnDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularTranslatorParser#returnDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitReturnDeclaration(AngularTranslatorParser.ReturnDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularTranslatorParser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void enterReturnStatement(AngularTranslatorParser.ReturnStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularTranslatorParser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void exitReturnStatement(AngularTranslatorParser.ReturnStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularTranslatorParser#objectLiteral}.
	 * @param ctx the parse tree
	 */
	void enterObjectLiteral(AngularTranslatorParser.ObjectLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularTranslatorParser#objectLiteral}.
	 * @param ctx the parse tree
	 */
	void exitObjectLiteral(AngularTranslatorParser.ObjectLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularTranslatorParser#propertyNameAndValueList}.
	 * @param ctx the parse tree
	 */
	void enterPropertyNameAndValueList(AngularTranslatorParser.PropertyNameAndValueListContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularTranslatorParser#propertyNameAndValueList}.
	 * @param ctx the parse tree
	 */
	void exitPropertyNameAndValueList(AngularTranslatorParser.PropertyNameAndValueListContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularTranslatorParser#propertyAssignment}.
	 * @param ctx the parse tree
	 */
	void enterPropertyAssignment(AngularTranslatorParser.PropertyAssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularTranslatorParser#propertyAssignment}.
	 * @param ctx the parse tree
	 */
	void exitPropertyAssignment(AngularTranslatorParser.PropertyAssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularTranslatorParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void enterSingleExpression(AngularTranslatorParser.SingleExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularTranslatorParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void exitSingleExpression(AngularTranslatorParser.SingleExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularTranslatorParser#propertyFunction}.
	 * @param ctx the parse tree
	 */
	void enterPropertyFunction(AngularTranslatorParser.PropertyFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularTranslatorParser#propertyFunction}.
	 * @param ctx the parse tree
	 */
	void exitPropertyFunction(AngularTranslatorParser.PropertyFunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularTranslatorParser#injectMember}.
	 * @param ctx the parse tree
	 */
	void enterInjectMember(AngularTranslatorParser.InjectMemberContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularTranslatorParser#injectMember}.
	 * @param ctx the parse tree
	 */
	void exitInjectMember(AngularTranslatorParser.InjectMemberContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularTranslatorParser#formalParameterList}.
	 * @param ctx the parse tree
	 */
	void enterFormalParameterList(AngularTranslatorParser.FormalParameterListContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularTranslatorParser#formalParameterList}.
	 * @param ctx the parse tree
	 */
	void exitFormalParameterList(AngularTranslatorParser.FormalParameterListContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularTranslatorParser#typeDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterTypeDeclaration(AngularTranslatorParser.TypeDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularTranslatorParser#typeDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitTypeDeclaration(AngularTranslatorParser.TypeDeclarationContext ctx);
}