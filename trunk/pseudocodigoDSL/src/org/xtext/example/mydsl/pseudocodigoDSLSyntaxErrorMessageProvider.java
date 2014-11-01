package org.xtext.example.mydsl;

import org.antlr.runtime.*;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.diagnostics.Diagnostic;
import org.eclipse.xtext.nodemodel.SyntaxErrorMessage;
import org.eclipse.xtext.parser.antlr.SyntaxErrorMessageProvider;

public class pseudocodigoDSLSyntaxErrorMessageProvider extends SyntaxErrorMessageProvider {
	
	@Override
	public SyntaxErrorMessage getSyntaxErrorMessage(final IParserErrorContext context) {
		EObject contextobj = context.getCurrentContext();
		RecognitionException ex = context.getRecognitionException();
		String msg = context.getDefaultMessage();
		if ( ex == null ) {
			if ( msg.endsWith("'_'") ) {
				msg = "Illegal identifier";
			} else if ( msg.startsWith("mismatched ch") ) {
				msg = "Identifier cannot end with '_'";
			}
		}
		if ( ex instanceof MissingTokenException ) {
			msg = msg.replaceFirst("RULE_ID at", "identifier before");
			msg = msg.replaceFirst("missing", "Requerido");
			msg = msg.replaceFirst("at", " antes de");
		}
		if ( ex instanceof MismatchedTokenException ) {
			// mismatched input 'xxx' expecting 'end'
			msg = msg.replaceFirst("mismatched input", "Expresión no permitida: ");
			msg = msg.replaceFirst("expecting", " se esperaba");
			msg = msg.replaceFirst("extraneous input", "Expresión inesperada");
		}
		if ( ex instanceof NoViableAltException ) {
			// no viable alternative at input 'xxx'
			Token t = ((NoViableAltException) ex).token;
			String s = t == null ? " this symbol " : t.getText();
			msg =
				msg.replaceFirst("no viable alternative at input", "Error en: ") +
					". La palabra clave anterior puede estar colocada fuera de lugar o el bloque al que pertenece '" + s +
					"' no ha sido completado correctamente.";
		}
		if ( contextobj == null ) {
			msg = "Incomplete model or species";
		}
		return new SyntaxErrorMessage(msg, Diagnostic.SYNTAX_DIAGNOSTIC);
	}

	
}
