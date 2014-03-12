package org.xtext.example.mydsl.validation;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import diagramapseudocodigo.Archivo;
import diagramapseudocodigo.Declaracion;
import diagramapseudocodigo.DeclaracionPropia;
import diagramapseudocodigo.DeclaracionVariable;
import diagramapseudocodigo.DiagramapseudocodigoPackage;
import diagramapseudocodigo.Enumerado;
import diagramapseudocodigo.Inicio;
import diagramapseudocodigo.LlamadaFuncion;
import diagramapseudocodigo.Matriz;
import diagramapseudocodigo.Operador;
import diagramapseudocodigo.ParametroFuncion;
import diagramapseudocodigo.Registro;
import diagramapseudocodigo.Sentencias;
import diagramapseudocodigo.Subrango;
import diagramapseudocodigo.TipoComplejo;
import diagramapseudocodigo.Variable;
import diagramapseudocodigo.VariableID;
import diagramapseudocodigo.Vector;

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
		System.out.println("Hola estoy aqui!");
		for(Sentencias s: i.getTiene()) {
			if(s instanceof LlamadaFuncion) {
				LlamadaFuncion f = (LlamadaFuncion) s;
				System.out.println("Soy una Llamada a función!");
				System.out.println("Si " +f.getNombre() + " == " +nombre+ " && " +f.getOperador().size()+ " == " +parametros);
				if(f.getNombre().equals(nombre) && f.getOperador().size() == parametros) {
					System.out.println("Nombre: " +nombre);
					System.out.println("Parametros: "+parametros);
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
					System.out.println("jojojo");
					if(!correcto) {
						System.out.println("jijiji");
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
			System.out.println("Si "+variablesDeclaradas.get(n)+ " != "+ tipos.get(nombres.indexOf(n)));
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
}
