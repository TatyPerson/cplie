/*
* generated by Xtext
*/
package vary.pseudocodigo.dsl.cpp;

import org.eclipse.xtext.junit4.IInjectorProvider;

import com.google.inject.Injector;

public class VaryGrammarUiInjectorProvider implements IInjectorProvider {
	
	public Injector getInjector() {
		return vary.pseudocodigo.dsl.cpp.ui.internal.VaryGrammarActivator.getInstance().getInjector("vary.pseudocodigo.dsl.cpp.VaryGrammar");
	}
	
}