package org.xtext.example.mydsl.validation;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import diagramapseudocodigo.Archivo;
import diagramapseudocodigo.Caracter;
import diagramapseudocodigo.ConstCadena;
import diagramapseudocodigo.Declaracion;
import diagramapseudocodigo.DeclaracionPropia;
import diagramapseudocodigo.DeclaracionVariable;
import diagramapseudocodigo.DiagramapseudocodigoPackage;
import diagramapseudocodigo.Enumerado;
import diagramapseudocodigo.Inicio;
import diagramapseudocodigo.LlamadaFuncion;
import diagramapseudocodigo.Matriz;
import diagramapseudocodigo.NumeroDecimal;
import diagramapseudocodigo.NumeroEntero;
import diagramapseudocodigo.Operador;
import diagramapseudocodigo.ParametroFuncion;
import diagramapseudocodigo.Registro;
import diagramapseudocodigo.Sentencias;
import diagramapseudocodigo.Subrango;
import diagramapseudocodigo.TipoComplejo;
import diagramapseudocodigo.ValorBooleano;
import diagramapseudocodigo.ValorRegistro;
import diagramapseudocodigo.Variable;
import diagramapseudocodigo.VariableID;
import diagramapseudocodigo.Vector;
import diagramapseudocodigo.operacion;
import diagramapseudocodigo.valor;

public class MyDslJavaValidatorAux extends AbstractMyDslJavaValidator {
	
	protected Map<String,String> registrarVariablesTipadas(List<Declaracion> declaraciones) {
		Map<String,String> variablesDeclaradas = new HashMap<String,String>();
		for(Declaracion d: declaraciones) {
			if(d instanceof DeclaracionVariable) {
				DeclaracionVariable dec = (DeclaracionVariable) d;
				//Registramos todas las variables declaradas y sus respectivos tipos
				//Nota: No se comprueba si están repetidas porque ya hay una función que se encarga de ello.
				for(Variable var: dec.getVariable()) {
					variablesDeclaradas.put(var.getNombre(), dec.getTipo().getName());
				}
			}
			else if(d instanceof DeclaracionPropia) {
				DeclaracionPropia dec = (DeclaracionPropia) d;
				//Registramos todas las variables declaradas y sus respectivos tipos
				//Nota: No se comprueba si están repetidas porque ya hay una función que se encarga de ello.
				for(Variable var: dec.getVariable()) {
					variablesDeclaradas.put(var.getNombre(), dec.getTipo());
				}
			}
		}
		return variablesDeclaradas;
	}
	
	protected void checkLlamadasInicio(Inicio i, List<String> tipos, String nombre, int parametros) {
		//Recogemos todas las variables que hay declaradas con sus respectivos tipos para buscar luego las necesarias (no hay repetidas)
		Map<String,String> variablesDeclaradas = registrarVariablesTipadas(i.getDeclaracion());
		List<String> nombresVariables = new ArrayList<String>();
		for(Sentencias s: i.getTiene()) {
			if(s instanceof LlamadaFuncion) {
				LlamadaFuncion f = (LlamadaFuncion) s;
				if(f.getNombre().equals(nombre) && f.getOperador().size() == parametros) {
					for(Operador o: f.getOperador()) {
						if(o instanceof VariableID) {
							VariableID v = (VariableID) o;
							nombresVariables.add(v.getNombre());	
						}
					}
					boolean correcto = true; 
					for(String n: nombresVariables) {
						if(variablesDeclaradas.get(n) != tipos.get(nombresVariables.indexOf(n))) {
							correcto = false;
						}
					}
					if(!correcto) {
						error("Los tipos de las variables no coinciden con los de la declaración de la cabecera de la función", f, DiagramapseudocodigoPackage.Literals.LLAMADA_FUNCION__NOMBRE);
					}
				}
			}
		}
	}
	
	protected List<String> registrarTipos(List<TipoComplejo> tipoComplejo) {
		List<String> tipos = new ArrayList<String>();
		
		for(TipoComplejo com: tipoComplejo) {
			if(com instanceof Vector) {
				Vector v = (Vector) com;
				tipos.add(v.getNombre());
			}
			else if(com instanceof Matriz) {
				Matriz m = (Matriz) com;
				tipos.add(m.getNombre());
			}
			else if(com instanceof Registro) {
				Registro r = (Registro) com;
				tipos.add(r.getNombre());
			}
			else if(com instanceof Enumerado) {
				Enumerado e = (Enumerado) com;
				tipos.add(e.getNombre());
			}
			else if(com instanceof Archivo) {
				Archivo a = (Archivo) com;
				tipos.add(a.getNombre());
			}
			else {
				Subrango s = (Subrango) com;
				tipos.add(s.getNombre());
			}
		}
		
		return tipos;
	}
	
	protected List<String> registrarVariables(List<Declaracion> declaraciones) {
		List<String> variables = new ArrayList<String>();
		for(Declaracion d: declaraciones) {
			if(d instanceof DeclaracionVariable) {
				DeclaracionVariable dec = (DeclaracionVariable) d;
				for(Variable v: dec.getVariable()) {
					variables.add(v.getNombre());
				}
			}
			else {
				DeclaracionPropia dec = (DeclaracionPropia) d;
				for(Variable v: dec.getVariable()) {
					variables.add(v.getNombre());
				}
			}
		}
		return variables;
	}
	
	protected List<String> registrarParametros(List<Operador> operadores) {
		List<String> parametros = new ArrayList<String>();
		for(Operador o: operadores) {
			if(o instanceof VariableID) {
				VariableID v = (VariableID) o;
				parametros.add(v.getNombre());	
			}
		}
		return parametros;
	}
	
	protected String getCadenaTiposCorrectos(List<String> nombres, List<String> tipos) {
		String salidaCorrecta = "";
		for(int i=0; i < nombres.size()-1; i++) {
			salidaCorrecta += tipos.get(nombres.indexOf(nombres.get(i))) + ", ";
		}
		salidaCorrecta += tipos.get(nombres.size()-1);
		return salidaCorrecta;
	}
	
	protected String getCadenaTiposIncorrectos(List<String> nombres, Map<String,String> variablesDeclaradas) {
		String salidaIncorrecta = "";
		for(int i=0; i < nombres.size()-1; i++) {
			salidaIncorrecta += variablesDeclaradas.get(nombres.get(i)) + ", ";
		}
		salidaIncorrecta += variablesDeclaradas.get(nombres.get(nombres.size()-1));
		return salidaIncorrecta;
	}
	
	protected boolean comprobarCorreccionTiposLlamada(List<String> nombres, Map<String,String> variablesDeclaradas, List<String> tipos) {
		boolean tiposCorrectos = true;
		for(String n: nombres) {
			if(variablesDeclaradas.get(n) != tipos.get(nombres.indexOf(n))) {
				tiposCorrectos = false;
			}
		}
		return tiposCorrectos;
	}
	
	protected List<String> getTiposCabecera(List<ParametroFuncion> parametros) {
		List<String> tipos = new ArrayList<String>();
		for(ParametroFuncion p: parametros) {
			//Registramos los tipos que requiere la función en su cabecera
			tipos.add(p.getTipo().getName());
		}
		return tipos;
	}
	
	protected List<valor> registrarValoresOperacion(operacion o) {
		List<valor> valores = new ArrayList<valor>();
		if(!(o.getOp_der().getOper_der() instanceof operacion)) {
			valor v = (valor) o.getOp_der().getOper_der();
			valores.add(v);
		}
		if(!(o.getOp_izq().getOper_izq() instanceof operacion)) {
			valor v = (valor) o.getOp_izq().getOper_izq();
			valores.add(v);
		}
		else {
			registrarValoresOperacionRec((operacion)o.getOp_der().getOper_der(), valores);
			registrarValoresOperacionRec((operacion)o.getOp_izq().getOper_izq(), valores);
			
		}
		return valores;
	}
	
	protected void registrarValoresOperacionRec(operacion o, List<valor> valores) {
		if(!(o.getOp_der().getOper_der() instanceof operacion)) {
			valor v = (valor) o.getOp_der().getOper_der();
			valores.add(v);
		}
		if(!(o.getOp_izq().getOper_izq() instanceof operacion)) {
			valor v = (valor) o.getOp_izq().getOper_izq();
			valores.add(v);
		}
		else {
			registrarValoresOperacionRec((operacion)o.getOp_der().getOper_der(), valores);
			registrarValoresOperacionRec((operacion)o.getOp_izq().getOper_izq(), valores);
			
		}
	}
	
	protected int asignacionEntero(List<valor> valores, Map<String,String> variables, Map<String,HashMap<String,String>> registros, List<String> nombresRegistros) {
		List<valor> valoresProblem = new ArrayList<valor>();
		for(valor v: valores) {
			if(!(v instanceof NumeroEntero)) {
				valoresProblem.add(v);
			}
		}
		if(valoresProblem.size() == 0) {
			return 1;
		}
		else {
			int check = 1;
			for(valor v: valoresProblem) {
				if(v instanceof NumeroDecimal) {
					check = 2;
				}
				else if(v instanceof VariableID) {
					//La buscamos y miramos su tipo
					VariableID var = (VariableID) v;
					if(variables.get(var.getNombre()) != "entero" && variables.get(var.getNombre()) != "real" && variables.containsKey(var.getNombre())) {
						return 3;
					}
					else if(variables.get(var.getNombre()) == "real") {
						check = 2;
					}
				}
				else if(v instanceof ValorRegistro) {
					//Lo buscamos y miramos su tipo
					ValorRegistro vr = (ValorRegistro) v;
					for(String nombre: nombresRegistros) {
						if(nombre.equals(variables.get(vr.getNombre_registro()))) {
							if(registros.get(nombre).get(vr.getCampo().get(0).getNombre_campo()) != "entero" && registros.get(nombre).get(vr.getCampo().get(0).getNombre_campo()) != "real") {
								return 3;
							}
							else if(registros.get(nombre).get(vr.getCampo().get(0).getNombre_campo()) == "real") {
								check = 2;
							}
						}
					}
				}
				else {
					return 3;
				}
			}
			return check;
		}
	}
	
	
	protected int asignacionLogico(List<valor> valores, Map<String,String> variables, Map<String,HashMap<String,String>> registros, List<String> nombresRegistros) {
		List<valor> valoresProblem = new ArrayList<valor>();
		for(valor v: valores) {
			if(!(v instanceof ValorBooleano)) {
				valoresProblem.add(v);
			}
		}
		if(valoresProblem.size() == 0) {
			return 1;
		}
		else {
			int check = 1;
			for(valor v: valoresProblem) {
				if(v instanceof VariableID) {
					//La buscamos y miramos su tipo
					VariableID var = (VariableID) v;
					if(variables.get(var.getNombre()) != "logico" && variables.containsKey(var.getNombre())) {
						return 3;
					}
				}
				else if(v instanceof ValorRegistro) {
					//Lo buscamos y miramos su tipo
					ValorRegistro vr = (ValorRegistro) v;
					for(String nombre: nombresRegistros) {
						if(nombre.equals(variables.get(vr.getNombre_registro()))) {
							if(registros.get(nombre).get(vr.getCampo().get(0).getNombre_campo()) != "logico") {
								return 3;
							}
						}
					}
				}
				else {
					return 3;
				}
			}
			return check;
		}
	}
	
	protected int asignacionReal(List<valor> valores, Map<String,String> variables, Map<String,HashMap<String,String>> registros, List<String> nombresRegistros) {
		List<valor> valoresProblem = new ArrayList<valor>();
		for(valor v: valores) {
			if(!(v instanceof NumeroDecimal) && !(v instanceof NumeroEntero)) {
				valoresProblem.add(v);
			}
		}
		if(valoresProblem.size() == 0) {
			return 1;
		}
		else {
			int check = 1;
			for(valor v: valoresProblem) {
				if(v instanceof VariableID) {
					//La buscamos y miramos su tipo
					VariableID var = (VariableID) v;
					if(variables.get(var.getNombre()) != "entero" && variables.get(var.getNombre()) != "real" && variables.containsKey(var.getNombre())) {
						return 3;
					}
				}
				else if(v instanceof ValorRegistro) {
					//Lo buscamos y miramos su tipo
					ValorRegistro vr = (ValorRegistro) v;
					for(String nombre: nombresRegistros) {
						if(nombre.equals(variables.get(vr.getNombre_registro()))) {
							if(registros.get(nombre).get(vr.getCampo().get(0).getNombre_campo()) != "entero" && registros.get(nombre).get(vr.getCampo().get(0).getNombre_campo()) != "real") {
								return 3;
							}
						}
					}
				}
				else {
					return 3;
				}
			}
			return check;
		}
	}
	
	
	protected int asignacionCadena(List<valor> valores, Map<String,String> variables, Map<String,HashMap<String,String>> registros, List<String> nombresRegistros) {
		List<valor> valoresProblem = new ArrayList<valor>();
		for(valor v: valores) {
			if(!(v instanceof ConstCadena)) {
				valoresProblem.add(v);
			}
		}
		if(valoresProblem.size() == 0) {
			return 1;
		}
		else {
			int check = 1;
			for(valor v: valoresProblem) {
				if(v instanceof VariableID) {
					//La buscamos y miramos su tipo
					VariableID var = (VariableID) v;
					if(variables.get(var.getNombre()) != "cadena" && variables.containsKey(var.getNombre())) {
						return 3;
					}
				}
				else if(v instanceof ValorRegistro) {
					//Lo buscamos y miramos su tipo
					ValorRegistro vr = (ValorRegistro) v;
					for(String nombre: nombresRegistros) {
						if(nombre.equals(variables.get(vr.getNombre_registro()))) {
							if(registros.get(nombre).get(vr.getCampo().get(0).getNombre_campo()) != "cadena") {
								return 3;
							}
						}
					}
				}
				else {
					return 3;
				}
			}
			return check;
		}
	}
	
	protected int asignacionCaracter(List<valor> valores, Map<String,String> variables, Map<String,HashMap<String,String>> registros, List<String> nombresRegistros) {
		List<valor> valoresProblem = new ArrayList<valor>();
		for(valor v: valores) {
			if(!(v instanceof Caracter)) {
				valoresProblem.add(v);
			}
		}
		if(valoresProblem.size() == 0) {
			return 1;
		}
		else {
			int check = 1;
			for(valor v: valoresProblem) {
				if(v instanceof VariableID) {
					//La buscamos y miramos su tipo
					VariableID var = (VariableID) v;
					if(variables.get(var.getNombre()) != "caracter" && variables.containsKey(var.getNombre())) {
						return 3;
					}
				}
				else if(v instanceof ValorRegistro) {
					//Lo buscamos y miramos su tipo
					ValorRegistro vr = (ValorRegistro) v;
					for(String nombre: nombresRegistros) {
						if(nombre.equals(variables.get(vr.getNombre_registro()))) {
							if(registros.get(nombre).get(vr.getCampo().get(0).getNombre_campo()) != "caracter") {
								return 3;
							}
						}
					}
				}
				else {
					return 3;
				}
			}
			return check;
		}
	}
	
	protected List<ValorRegistro> variablesRegistroExistentes(List<valor> valores, Map<String,String> variables, List<String> nombresRegistros) {
		List<ValorRegistro> valoresRegistro = new ArrayList<ValorRegistro>();
		for(valor v: valores) {
			if(v instanceof ValorRegistro) {
				//Buscamos si el tipo con el que se declaró es uno de tipo registro
				ValorRegistro vr = (ValorRegistro) v;
				if(!nombresRegistros.contains(variables.get(vr.getNombre_registro())) && variables.containsKey(vr.getNombre_registro())) {
					//No lo contiene (no es un tipo registro) y además esta definida
					valoresRegistro.add(vr);
				}
			}
		}
		//Devolvemos todas las variables que se estan usando como registro y no lo son
		return valoresRegistro;
	}
	
	protected List<ValorRegistro> variablesRegistroDeclaradas(List<valor> valores, List<String> variables) {
		List<ValorRegistro> variablesNoDeclaradas = new ArrayList<ValorRegistro>();
		for(valor v: valores) {
			if(v instanceof ValorRegistro) {
				//Buscamos si ha sido definida (si el tipo es de tipo registro lo omitimos porque ya hay otra función
				//que se encarga de ello
				ValorRegistro vr = (ValorRegistro) v;
				if(!variables.contains(vr.getNombre_registro())) {
					variablesNoDeclaradas.add(vr);
				}
			}
		}
		return variablesNoDeclaradas;
	}
	
	protected List<VariableID> variablesDeclaradas(List<valor> valores, List<String> variables) {
		List<VariableID> variablesNoDeclaradas = new ArrayList<VariableID>();
		for(valor v: valores) {
			if(v instanceof VariableID) {
				//Comprobamos si la variable ha sido definida
				VariableID var = (VariableID) v;
				if(!variables.contains(var.getNombre())) {
					variablesNoDeclaradas.add(var);
				}
			}
		}
		return variablesNoDeclaradas;
	}
}
