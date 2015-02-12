package vary.pseudocodigo.dsl.cpp.ui.util.libreriasCDT;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;

/**
* This class gets a URI (or just a string) that is relative to the calling class such that,
* if a file "x.dat" is in the same subdirectory as the class, or on a known, relative path
* to it, this can be used to open or create a file in the same filesystem subdirectory as
* or nearby to the class.
*
* @author Russell Bateman
*/


public class ClassToUri {

	private String  classname = null;           // name of the class (including ".class")
	private URL     classUrl  = null;           // initial URL obtained from Class interfaces
	private String  urlPath   = null;           // the result, intermediate or final, of this utility
 
	/* Note that, when fully processed, urlPath should begin with PREFIX and end
	 * in "/" (since the classname will have been chopped off).
	 *
	 * TODO: What to do if the prefix is missing? Does this every happen? Be prepared
	 * to come back in here and fix this case.
	 */

	private static final String PREFIX = "file:/";

	/**
	 * Set up instance for getting a URI to the class. Also, this does the actual
	 * massaging of the URL into a proper string ready to use for whatever purpose
	 * we have in mind (getting a URI or merely returning the string).
	 *
	 * If this constructor fails, look to the specified class passed as argument.
	 *
	 * @param c - class for which this munging around is desired.
	 */

	public ClassToUri( Class< ? > c ) {
	
		// determine the classname and get a URL to it...
	
		this.classname = c.getSimpleName() + ".class";
		this.classUrl  = c.getResource( this.classname );

		// locate the classname in the path and strip it out...
		String  str = this.classUrl.toString();
		int     pos = str.indexOf( this.classname );

		// this is the path we're going to work with...
		this.urlPath = str.substring( 0, pos );
	}

	private String renderAsString( String filename ) {
		
		String  string = this.urlPath;

		if( filename != null )
			string += filename;
		
		return string;
	}

	/**
	 * This returns the path as a string rather than a URI. If this method fails
	 * to return a usable string, it is probably the utility's fault, but it
	 * could also be the argument passed.
	 *
	 * In the absence of an argument, the returned path should end in a directory
	 * delimiter.
	 *
	 * @param filename - name to add to the end of the parent subdirectory derived
	 *      from the class when we created a new instance of it.
	 */

	
	public String toString( String filename ) {
		
		String  string = renderAsString( filename );

		if( string.startsWith( PREFIX ) )
			string = string.substring( PREFIX.length() );

		return string;
	}

	/**
	 * This method returns the promised URI including the filename passed in.
	 * If none, then the URI is to the parent (directory) of the class we were
	 * called with.
	 *
	 * @param filename - name to add to the end of the parent subdirectory derived
	 *      from the class when we created a new instance of it.
	 *
	 * @throws MalformedURLException probably a mistake in this utility.
	 * @throws URISyntaxException probably a mistake in this utility.
	 */

	public URI toURI( String filename ) throws MalformedURLException, URISyntaxException {
		String  string = renderAsString( filename );
		URL     url    = new URL( string );
		return url.toURI();
	}
}
