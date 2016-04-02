package org.angulartranslator.main;

import org.angulartranslator.parsers.*;
import org.angulartranslator.lexers.*;
import org.angulartranslator.models.*;
import org.angulartranslator.emitters.*;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.*;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.IOException;

public class AngularTranslatorMain {
    public static void main(String[] args) throws Exception {
        String inputFile = null;
        if ( args.length>0 ) inputFile = args[0];
        InputStream is = System.in;
        if ( inputFile!=null ) {
            is = new FileInputStream(inputFile);
        }
        ANTLRInputStream input = new ANTLRInputStream(is);
		        
		AngularTranslatorLexer lexer = new AngularTranslatorLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        AngularTranslatorParser parser = new AngularTranslatorParser(tokens);
        ParseTree tree = parser.initialProduction(); // parse
        
		AngularTranslatorSemanticModel model = new AngularTranslatorSemanticModel();
        AngularTranslatorSemanticParser semanticParser = new AngularTranslatorSemanticParser(model);
		
		ParseTreeWalker walker = new ParseTreeWalker();
        walker.walk(semanticParser, tree); 
		
		AngularTranslatorEmitter emitter = new AngularTranslatorEmitter(model);
		
		try {
			System.out.println("Emitindo arquivo no diretorio corrente...");			
			emitFile(model, emitter);
			System.out.println("Operacao finalizada.");
		} catch(Exception ex){
			System.err.println("Error: " + ex.getMessage());
			ex.printStackTrace();		
		}
    }
	
	private static void emitFile(AngularTranslatorSemanticModel model, AngularTranslatorEmitter emitter) 
		throws Exception, IOException {
		
		String fileName = model.getDirectiveName().contains("Directive") ? 
						  model.getDirectiveName().replace("Directive", "Component") :
						  model.getDirectiveName();
		FileWriter fw = new FileWriter(fileName + ".ts");
		BufferedWriter bw = new BufferedWriter(fw);
		bw.write(emitter.emitFromModel());			
		bw.close();
		fw.close();		
	}
}