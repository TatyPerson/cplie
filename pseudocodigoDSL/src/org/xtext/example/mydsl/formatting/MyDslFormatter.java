/*
 * generated by Xtext
 */
package org.xtext.example.mydsl.formatting;

import org.eclipse.xtext.formatting.impl.AbstractDeclarativeFormatter;
import org.eclipse.xtext.formatting.impl.FormattingConfig;
import org.eclipse.xtext.Keyword;

/**
 * This class contains custom formatting description.
 * 
 * see : http://www.eclipse.org/Xtext/documentation/latest/xtext.html#formatting
 * on how and when to use it
 * 
 * Also see {@link org.eclipse.xtext.xtext.XtextFormattingTokenSerializer} as an
 * example
 */
public class MyDslFormatter extends AbstractDeclarativeFormatter {

	@Override
	protected void configureFormatting(FormattingConfig c) {
		org.xtext.example.mydsl.services.MyDslGrammarAccess f = (org.xtext.example.mydsl.services.MyDslGrammarAccess) getGrammarAccess();
    
        for(Keyword comma: f.findKeywords(",")) {
            c.setNoLinewrap().before(comma);
            c.setNoSpace().before(comma);
            c.setSpace(" ").after(comma);
        }
        
        for(Keyword comentario: f.findKeywords("//")) {
        	c.setLinewrap(2).before(comentario);
        }
        
        for(Keyword dosPuntos: f.findKeywords(":")) {
        	c.setNoSpace().before(dosPuntos);
        	c.setNoSpace().after(dosPuntos);
        }
        
        for(Keyword menosMenos: f.findKeywords("--")) {
        	c.setNoSpace().before(menosMenos);
        }
        
        for(Keyword masMas: f.findKeywords("++")) {
        	c.setNoSpace().before(masMas);
        }
        
        //Para el formato de los registros:
        for(Keyword registro: f.findKeywords("registro:")) {
        	c.setLinewrap(1).before(registro);
        }
        for(Keyword finRegistro: f.findKeywords("fin_registro")) {
        	c.setLinewrap(2).after(finRegistro);
        }
        c.setLinewrap(1).after(f.getRegistroAccess().getNombreEStringParserRuleCall_1_0());
        c.setLinewrap(2).after(f.getTipoComplejoRule());
        c.setLinewrap(1).after(f.getDeclaracionRule());
        
        
        c.setLinewrap(1).after(f.getDeclaracionVariableRule());
        
        for(Keyword var: f.findKeywords(".")) {
        	c.setNoSpace().before(var);
        	c.setNoSpace().after(var);
        }
        
        c.setLinewrap(2).after(f.getSentenciasRule());
        
        for(Keyword keyEntonces: f.findKeywords("entonces")) {
        	c.setLinewrap(2).after(keyEntonces);
        }
        
        for(Keyword llave: f.findKeywords("[")) {
        	c.setNoSpace().before(llave);
        	c.setNoSpace().after(llave);
        }
        
        for(Keyword llave: f.findKeywords("]")) {
        	c.setNoSpace().before(llave);
        }
        
        for(Keyword llave: f.findKeywords("][")) {
        	c.setNoSpace().before(llave);
        	c.setNoSpace().after(llave);
        }
        
        for(Keyword llave: f.findKeywords("(")) {
        	c.setNoSpace().after(llave);
        	c.setNoSpace().before(llave);
        }
        
        for(Keyword llave: f.findKeywords(")")) {
        	c.setNoSpace().before(llave);
        }
        
        for(Keyword keyConst: f.findKeywords("const")) {
        	c.setLinewrap(2).before(keyConst);
        }
        
        for(Keyword keyTipo: f.findKeywords("tipo")) {
        	c.setLinewrap(2).before(keyTipo);
        }
        
        
        for(Keyword keyInicio: f.findKeywords("inicio")) {
        	c.setLinewrap(2).before(keyInicio);
        }
        
        for(Keyword keyFinDesde: f.findKeywords("fin_desde")) {
        	c.setLinewrap(2).after(keyFinDesde);
        }
        
        for(Keyword keyConst: f.findKeywords("const")) {
        	c.setIndentationIncrement().after(keyConst);
        }
        
        for(Keyword keyTipo: f.findKeywords("tipo")) {
        	c.setIndentationDecrement().before(keyTipo);
        	c.setIndentationIncrement().after(keyTipo);
        }
        
        c.setIndentationDecrement().before(f.getSubprocesoRule());
        
        
        for(Keyword keyVar: f.findKeywords("var")) {
        	c.setLinewrap(2).before(keyVar);
        	c.setLinewrap(2).after(keyVar);
        	c.setIndentationIncrement().before(keyVar);
        	c.setIndentationIncrement().after(keyVar);
        }
        
        c.setLinewrap(2).after(f.getSubprocesoRule());

        c.setLinewrap(2).after(f.getTipoComplejoRule());
        
        for(Keyword keyInicio: f.findKeywords("inicio")) {
        	c.setIndentationDecrement().before(keyInicio);
        	c.setIndentationIncrement().after(keyInicio);
        }
        
        c.setLinewrap(2).after(f.getDevolverRule());
        
        for(Keyword keyFinFuncion: f.findKeywords("fin_funcion")) {
        	c.setIndentationDecrement().before(keyFinFuncion);
        }
        
        c.setIndentationDecrement().between(f.getSubprocesoRule(), f.getInicioRule());
        c.setIndentationDecrement().between(f.getSubprocesoRule(), f.getInicioRule());
        
        for(Keyword keyFinProc: f.findKeywords("fin_procedimiento")) {
        	c.setIndentationDecrement().before(keyFinProc);
        }
        
        for(Keyword keyFinInicio: f.findKeywords("fin_inicio")) {
        	c.setIndentationDecrement().before(keyFinInicio);
        }
        
        for(Keyword keyHacerDesde: f.findKeywords("hacer")) {
        	c.setLinewrap(1).after(keyHacerDesde);
        	c.setIndentationIncrement().before(keyHacerDesde);
        }
        
        for(Keyword keyFinDesde: f.findKeywords("fin_desde")) {
        	c.setIndentationDecrement().before(keyFinDesde);
        }
        
        for(Keyword keyEntoncesSi: f.findKeywords("entonces")) {
        	c.setIndentationIncrement().before(keyEntoncesSi);
        }
        
        for(Keyword keySinoSi: f.findKeywords("sino")) {
        	c.setIndentationDecrement().before(keySinoSi);
        	c.setIndentationIncrement().after(keySinoSi);
        }
        
        for(Keyword keyFinSi: f.findKeywords("fin_si")) {
        	c.setIndentationDecrement().before(keyFinSi);
        }
        
        for(Keyword keyFinMientras: f.findKeywords("fin_mientras")) {
        	c.setIndentationDecrement().before(keyFinMientras);
        }
        
        for(Keyword keyRepetir: f.findKeywords("repetir")) {
        	c.setIndentationIncrement().after(keyRepetir);
        }
        
        for(Keyword keyHastaQueRepetir: f.findKeywords("hasta_que")) {
        	c.setIndentationDecrement().before(keyHastaQueRepetir);
        }
        
        for(Keyword keyFinSegun: f.findKeywords("fin_segun")) {
        	c.setIndentationDecrement().before(keyFinSegun);
        }
        
        c.setLinewrap(1).after(f.getSentenciasRule());
	}
}
