package vary.pseudocodigo.dsl.cpp.generator.util;

public class TipoProyecto {
	
	private static String tipo;
	
	public TipoProyecto() {
		tipo = "No";
	}
	
	public static void setTipoProyecto(String tipoAux) {
		tipo = tipoAux;
	}
	
	public static String getTipoProyecto() {
		return tipo;
	}

}
