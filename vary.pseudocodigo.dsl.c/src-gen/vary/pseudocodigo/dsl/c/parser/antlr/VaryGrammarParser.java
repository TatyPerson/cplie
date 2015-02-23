/*
* generated by Xtext
*/
package vary.pseudocodigo.dsl.c.parser.antlr;

import com.google.inject.Inject;

import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import vary.pseudocodigo.dsl.c.services.VaryGrammarGrammarAccess;

public class VaryGrammarParser extends org.eclipse.xtext.parser.antlr.AbstractAntlrParser {
	
	@Inject
	private VaryGrammarGrammarAccess grammarAccess;
	
	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	
	@Override
	protected vary.pseudocodigo.dsl.c.parser.antlr.internal.InternalVaryGrammarParser createParser(XtextTokenStream stream) {
		return new vary.pseudocodigo.dsl.c.parser.antlr.internal.InternalVaryGrammarParser(stream, getGrammarAccess());
	}
	
	@Override 
	protected String getDefaultRuleName() {
		return "Codigo";
	}
	
	public VaryGrammarGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(VaryGrammarGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
}
