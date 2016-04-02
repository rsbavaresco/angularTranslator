package org.angulartranslator.parsers;

import org.angulartranslator.models.AngularTranslatorSemanticModel;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;
import java.util.List;

public class AngularTranslatorSemanticParser extends AngularTranslatorBaseListener {
	
	private AngularTranslatorSemanticModel model;
	
	public AngularTranslatorSemanticParser(AngularTranslatorSemanticModel exModel){
		if (exModel == null) exModel = new AngularTranslatorSemanticModel();
		this.model = exModel;
	}
	
	public AngularTranslatorSemanticParser(){
		this(null);
	}
	
	@Override 
	public void enterFunctionDeclaration(AngularTranslatorParser.FunctionDeclarationContext ctx) { 
		this.model.setDirectiveName(ctx.Identifier().getText());
	}
	
	@Override 
	public void enterReturnStatement(AngularTranslatorParser.ReturnStatementContext ctx) { 
		AngularTranslatorParser.ObjectLiteralContext objLiteralCtx = ctx.objectLiteral();
		if (objLiteralCtx == null) return; //error
		
		List<AngularTranslatorParser.PropertyAssignmentContext> properties = objLiteralCtx.propertyNameAndValueList().propertyAssignment();
		if (properties == null) return; //error
		
		for (AngularTranslatorParser.PropertyAssignmentContext pac : properties) {
			if (pac.Identifier().getText().compareToIgnoreCase("templateUrl") == 0) {
				this.setTemplateUrlProperty(pac);				
			} else if (pac.Identifier().getText().compareToIgnoreCase("controller") == 0) {
				if (!this.setInjectedParamsController(pac));
					this.setFunctionBodyController(pac);
			}
		}
	}
	
	private void setFunctionBodyController(AngularTranslatorParser.PropertyAssignmentContext pac){	
		this.setFunctionBodyController(pac.singleExpression().propertyFunction());
	}
	
	private void setFunctionBodyController(AngularTranslatorParser.PropertyFunctionContext pfc){	
		//this.model.setFunctionBodyController(pfc.complexFunctionBody().SOME().getText());
		//this.model.setFunctionBodyController(pfc.SOMET().getText());
	}
	
	private boolean setInjectedParamsController(AngularTranslatorParser.PropertyAssignmentContext pac){	
		AngularTranslatorParser.InjectMemberContext imc = pac.singleExpression().injectMember();
		if (imc == null) return false; //Sem injeção de dependência
		List<TerminalNode> params = imc.StringLiteral();
		if (params == null) return false; //error
		for (TerminalNode node : params)
			this.model.getInjectedParamsController().add(node.getText().replace("'", "").replace("\"", ""));			
		this.setFunctionBodyController(imc.propertyFunction());
		return true;
	}
	
	private void setTemplateUrlProperty(AngularTranslatorParser.PropertyAssignmentContext pac){	
		TerminalNode stringLiteral = pac.singleExpression().StringLiteral();
		if (stringLiteral == null) return; //error
		this.model.setTemplateUrl(stringLiteral.getText());	
	}
}