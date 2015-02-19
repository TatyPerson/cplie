package vary.pseudocodigo.dsl.cpp.generator;

public class ProjectLocationFolder {
	static String path;
	static String OS;
	
	public static void setPath(String path) {
		ProjectLocationFolder.path = path;
	}
	
	public static String getPath() {
		return path;
	}
	
	public static void setOS(String OS) {
		ProjectLocationFolder.OS = OS;
	}
	
	public static String getOS() {
		return OS;
	}
	
}
