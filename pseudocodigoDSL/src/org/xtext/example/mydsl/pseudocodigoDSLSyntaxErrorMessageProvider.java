package org.xtext.example.mydsl;
import org.eclipse.xtext.nodemodel.SyntaxErrorMessage;
import org.eclipse.xtext.parser.antlr.SyntaxErrorMessageProvider;

public class pseudocodigoDSLSyntaxErrorMessageProvider extends SyntaxErrorMessageProvider {
	
	public class BeeLangSyntaxErrorMessageProvider extends SyntaxErrorMessageProvider { 
		@Override 
		public SyntaxErrorMessage getSyntaxErrorMessage ( IValueConverterErrorContext context ) { 
			if ( ! ( context.getValueConverterException () .getCause () instanceof Exception )) 
				return super .getSyntaxErrorMessage ( context ) ; 
			return new SyntaxErrorMessage ( context.getDefaultMessage () , IPseudocodigoDSLDiagnostic.ISSUE_TIMESTAMP__NON_UTC ) ; 
		}
	}
}
