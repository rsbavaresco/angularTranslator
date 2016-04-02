package org.angulartranslator.emitters;

import org.angulartranslator.models.AngularTranslatorSemanticModel;
import org.stringtemplate.v4.*;
import java.util.ArrayList;

public class AngularTranslatorEmitter {
	private AngularTranslatorSemanticModel model;
	private String file;
	
	public AngularTranslatorEmitter(AngularTranslatorSemanticModel model){
		this.model = model;
		this.file = "AngularComponent";
	}
	
	public String emitFromModel() throws Exception {
		if (model == null) return "";
		
		STGroup group = new STGroupFile("template\\AngularComponent.stg");
		ST st = group.getInstanceOf("angularComponent");
		if (st == null) throw new Exception("Nao foi possivel ler arquivo .stg. St é nulo em emitFromModel.");
		
		if (this.model.getDirectiveName() != null)		
			st.add("directiveName", this.model.getDirectiveName());
		
		if (this.model.getTemplateUrl() != null)
			st.add("templateUrl", this.model.getTemplateUrl());
		else
			st.add("templateUrl", "\"\"");
		
		if (this.model.getInjectedParamsController().size() <= 0)
			st.add("injections", "");	
		else 
			insertInjectedConstructorParams(st);
			
		if (this.model.getFunctionBodyController() != null)
			st.add("functionBodyController", this.model.getFunctionBodyController());		
		else
			st.add("functionBodyController", "");		
		return st.render();		
	}
	
	public void insertInjectedConstructorParams(ST st){
		String injections = "";
		ArrayList<String> params = this.model.getInjectedParamsController();
		for (int i = 0; i < params.size(); i++) {
			String param = params.get(i);
			if (i == params.size()-1)
				injections += param;
			else				
				injections += param + ", ";
		}		
		st.add("injections", injections);
	}
}