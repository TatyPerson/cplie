/*
* generated by Xtext
*/
package vary.pseudocodigo.dsl.activator;

/**
 * Initialization support for running Xtext languages 
 * without equinox extension registry
 */
public class ActivatorStandaloneSetup extends ActivatorStandaloneSetupGenerated{

	public static void doSetup() {
		new ActivatorStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}

