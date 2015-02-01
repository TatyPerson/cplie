package vary.pseudocodigo.dsl.cpp.generator.util;

import org.eclipse.osgi.util.NLS;

public class Options extends NLS {
	private static final String BUNDLE_NAME = "vary.pseudocodigo.dsl.cpp.generator.util.options";
	public static String ficheroCabeceras;
	
	static {
		NLS.initializeMessages(BUNDLE_NAME, Options.class);
	}

	private Options() {}

}
