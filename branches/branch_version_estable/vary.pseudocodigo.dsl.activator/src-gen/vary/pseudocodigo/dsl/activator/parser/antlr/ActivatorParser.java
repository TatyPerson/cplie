/*
* generated by Xtext
*/
package vary.pseudocodigo.dsl.activator.parser.antlr;

import com.google.inject.Inject;

import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import vary.pseudocodigo.dsl.activator.services.ActivatorGrammarAccess;

public class ActivatorParser extends org.eclipse.xtext.parser.antlr.AbstractAntlrParser {
	
	@Inject
	private ActivatorGrammarAccess grammarAccess;
	
	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	
	@Override
	protected vary.pseudocodigo.dsl.activator.parser.antlr.internal.InternalActivatorParser createParser(XtextTokenStream stream) {
		return new vary.pseudocodigo.dsl.activator.parser.antlr.internal.InternalActivatorParser(stream, getGrammarAccess());
	}
	
	@Override 
	protected String getDefaultRuleName() {
		return "Model";
	}
	
	public ActivatorGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(ActivatorGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
}
