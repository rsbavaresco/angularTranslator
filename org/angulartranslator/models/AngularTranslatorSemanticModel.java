package org.angulartranslator.models;

import java.util.ArrayList;

public class AngularTranslatorSemanticModel{
	private String directiveName;
	private String templateUrl;
	private String functionBodyController;
	private ArrayList<String> injectedParamsController;
	
	public AngularTranslatorSemanticModel(){
		this.injectedParamsController = new ArrayList<String>();
	}
	
	public void setDirectiveName(String directiveName){
		this.directiveName = directiveName;
	}
	
	public void setTemplateUrl(String template){
		this.templateUrl = template;
	}
	
	public void setFunctionBodyController(String functionBody){
		this.functionBodyController = functionBody;
	}
	
	public String getDirectiveName(){
		return this.directiveName;
	}
	
	public String getTemplateUrl(){
		return this.templateUrl;
	}
	
	public String getFunctionBodyController(){
		return this.functionBodyController;
	}
	
	public ArrayList<String> getInjectedParamsController(){
		return this.injectedParamsController;
	}
}