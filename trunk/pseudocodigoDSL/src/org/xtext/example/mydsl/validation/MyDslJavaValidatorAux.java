package org.xtext.example.mydsl.validation;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.util.EList;

import diagramapseudocodigo.Archivo;
import diagramapseudocodigo.Caracter;
import diagramapseudocodigo.ConstCadena;
import diagramapseudocodigo.Declaracion;
import diagramapseudocodigo.DeclaracionPropia;
import diagramapseudocodigo.DeclaracionVariable;
import diagramapseudocodigo.DiagramapseudocodigoPackage;
import diagramapseudocodigo.Enumerado;
import diagramapseudocodigo.Funcion;
import diagramapseudocodigo.Inicio;
import diagramapseudocodigo.LlamadaFuncion;
import diagramapseudocodigo.Matriz;
import diagramapseudocodigo.NumeroDecimal;
import diagramapseudocodigo.NumeroEntero;
import diagramapseudocodigo.Operador;
import diagramapseudocodigo.ParametroFuncion;
import diagramapseudocodigo.Registro;
import diagramapseudocodigo.Sentencias;
import diagramapseudocodigo.Subproceso;
import diagramapseudocodigo.Subrango;
import diagramapseudocodigo.Tipo;
import diagramapseudocodigo.TipoComplejo;
import diagramapseudocodigo.TipoDefinido;
import diagramapseudocodigo.TipoExistente;
import diagramapseudocodigo.ValorBooleano;
import diagramapseudocodigo.ValorMatriz;
import diagramapseudocodigo.ValorRegistro;
import diagramapseudocodigo.ValorVector;
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
	
	protected void registrarParametros(List<Operador> operadores, List<String> nombresVariables, Map<String,String> nombresVariablesCampos) {
		for(Operador o: operadores) {
			if(o instanceof VariableID) {
				VariableID v = (VariableID) o;
				nombresVariables.add(v.getNombre());	
			}
			else if(o instanceof ValorVector) {
				ValorVector v = (ValorVector) o;
				nombresVariables.add(v.getNombre_vector());
			}
			else if(o instanceof ValorMatriz) {
				ValorMatriz m = (ValorMatriz) o;
				nombresVariables.add(m.getNombre_matriz());
			}
			else if(o instanceof ValorRegistro) {
				ValorRegistro r = (ValorRegistro) o;
				nombresVariables.add(r.getNombre_registro());
				String campo = r.getCampo().get(r.getCampo().size()-1).getNombre_campo();
				nombresVariablesCampos.put(r.getNombre_registro(), campo);
			}
		}
	}
	
	protected String getCadenaTiposCorrectos(List<String> nombres, List<String> tipos) {
		String salidaCorrecta = "";
		for(int i=0; i < nombres.size()-1; i++) {
			salidaCorrecta += tipos.get(nombres.indexOf(nombres.get(i))) + ", ";
		}
		salidaCorrecta += tipos.get(nombres.size()-1);
		return salidaCorrecta;
	}
	
	protected String getCadenaTiposIncorrectos(List<String> nombresVariablesUsadas, Map<String,String> variablesDeclaradas, Map<String,String> tiposVectoresMatrices, Map<String,HashMap<String,String>> tiposRegistros, Map<String,String> nombresVariablesCampos) {
		String salidaIncorrecta = "";
		for(int i=0; i < nombresVariablesUsadas.size()-1; i++) {
			if(tiposVectoresMatrices.containsKey(variablesDeclaradas.get(nombresVariablesUsadas.get(i)))) {
				//Si lo contiene es un vector o una matriz
				salidaIncorrecta += tiposVectoresMatrices.get(variablesDeclaradas.get(nombresVariablesUsadas.get(i))) + ", ";
			}
			else if(tiposRegistros.containsKey(variablesDeclaradas.get(nombresVariablesUsadas.get(i))) && nombresVariablesCampos.get(nombresVariablesUsadas.get(i)) != null) {
				//Si lo contiene es un registro y si además tiene un campo es que es del tipo nombreRegistro.campo, por lo tanto debemos averiguar de que tipo es ese campo.
				salidaIncorrecta += tiposRegistros.get(variablesDeclaradas.get(nombresVariablesUsadas.get(i))).get(nombresVariablesCampos.get(nombresVariablesUsadas.get(i))) + ", ";

			}
			else {
				salidaIncorrecta += variablesDeclaradas.get(nombresVariablesUsadas.get(i)) + ", ";
			}
		}
		if(tiposVectoresMatrices.containsKey(variablesDeclaradas.get(nombresVariablesUsadas.get(nombresVariablesUsadas.size()-1)))) {
			//Si lo contiene es un vector o una matriz
			salidaIncorrecta += tiposVectoresMatrices.get(variablesDeclaradas.get(nombresVariablesUsadas.get(nombresVariablesUsadas.size()-1)));
		}
		else if(tiposRegistros.containsKey(variablesDeclaradas.get(nombresVariablesUsadas.get(nombresVariablesUsadas.size()-1))) && nombresVariablesCampos.get(nombresVariablesUsadas.get(nombresVariablesUsadas.size()-1)) != null) {
			//Si lo contiene es un registro
			salidaIncorrecta += tiposRegistros.get(variablesDeclaradas.get(nombresVariablesUsadas.get(nombresVariablesUsadas.size()-1))).get(nombresVariablesCampos.get(nombresVariablesUsadas.get(nombresVariablesUsadas.size()-1)));

		}
		else {
			salidaIncorrecta += variablesDeclaradas.get(nombresVariablesUsadas.get(nombresVariablesUsadas.size()-1));
		}
		return salidaIncorrecta;
	}
	
	protected String getTipoComplejo(Tipo tipo) {
		if(tipo instanceof TipoExistente) {
			TipoExistente t = (TipoExistente) tipo;
			return t.getTipo().getName();
		}
		else {
			TipoDefinido t = (TipoDefinido) tipo;
			return t.getTipo();
		}
	}
	
	protected Map<String,String> registrarTiposNativosdeComplejos(List<TipoComplejo> complejos) {
		Map<String,String> tiposNativos = new HashMap<String,String>();
		for(TipoComplejo t: complejos) {
			if(t instanceof Vector) {
				Vector v = (Vector) t;
				tiposNativos.put(v.getNombre(), getTipoComplejo(v.getTipo()));
			}
			else if(t instanceof Matriz) {
				Matriz m = (Matriz) t;
				tiposNativos.put(m.getNombre(), getTipoComplejo(m.getTipo()));
			}
		}
		return tiposNativos;
	}
	
	protected Map<String,HashMap<String,String>>registrarTiposNativosRegistros(List<TipoComplejo> complejos) {
		Map<String,HashMap<String,String>> tiposNativos = new HashMap<String,HashMap<String,String>>();
		for(TipoComplejo t: complejos) {
			if(t instanceof Registro) {
				Registro r = (Registro) t;
				tiposNativos.put(r.getNombre(), registrarCamposRegistro(r.getVariable()));
			}
		}
		return tiposNativos;
	}
	
	protected boolean comprobarCorreccionTiposLlamada(List<String> nombres, Map<String,String> variablesDeclaradas, List<String> tipos) {
		boolean tiposCorrectos = true;
		for(String n: nombres) {
			if(variablesDeclaradas.get(n) != tipos.get(nombres.indexOf(n)) && variablesDeclaradas.containsKey(n)) {
				tiposCorrectos = false;
			}
		}
		return tiposCorrectos;
	}
	
	protected List<String> getTiposCabecera(List<ParametroFuncion> parametros) {
		List<String> tipos = new ArrayList<String>();
		for(ParametroFuncion p: parametros) {
			//Registramos los tipos que requiere la función en su cabecera
			tipos.add(getTipoComplejo(p.getTipo()));
		}
		return tipos;
	}
	
	protected void getTiposCabecera(List<ParametroFuncion> parametros, Map<String,String> variablesDeclaradas) {
		for(ParametroFuncion p: parametros) {
			//Registramos los tipos que requiere la función en su cabecera
			variablesDeclaradas.put(p.getVariable().getNombre(), getTipoComplejo(p.getTipo()));
		}
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
	
	protected List<valor> buscarProblemasOperacion(String tipo, List<valor> valores) {
		List<valor> valoresProblem = new ArrayList<valor>();
		if(tipo == "entero") {
			for(valor v: valores) {
				if(!(v instanceof NumeroEntero)) {
					valoresProblem.add(v);
				}
			}
		}
		else if(tipo == "real") {
			for(valor v: valores) {
				if(!(v instanceof NumeroDecimal) && !(v instanceof NumeroEntero)) {
					valoresProblem.add(v);
				}
			}
		}
		else if(tipo == "logico") {
			for(valor v: valores) {
				if(!(v instanceof ValorBooleano)) {
					valoresProblem.add(v);
				}
			}
		}
		else if(tipo == "cadena") {
			for(valor v: valores) {
				if(!(v instanceof ConstCadena)) {
					valoresProblem.add(v);
				}
			}
		}
		else if(tipo == "caracter") {
			for(valor v: valores) {
				if(!(v instanceof Caracter)) {
					valoresProblem.add(v);
				}
			}
		}
		
		return valoresProblem;
		
	}
	
	protected int asignacionOperacionVariable(List<valor> valoresProblem, Map<String,String> variables, List<String> tiposValidos) {
		int check = 1;
			for(valor v: valoresProblem) {
				if(v instanceof NumeroDecimal && tiposValidos.get(0) == "entero") {
					check = 2;
				}
				else if(v instanceof VariableID) {
					VariableID var = (VariableID) v;
					if(tiposValidos.get(0) == "entero") {
						if(variables.get(var.getNombre()) != tiposValidos.get(0) && variables.get(var.getNombre()) != tiposValidos.get(1) && variables.containsKey(var.getNombre())) {
							return 3;
						}
						else if(variables.get(var.getNombre()) == tiposValidos.get(1)) {
							check = 2;
						}
					}
					else if(tiposValidos.get(0) == "real") {
						if(variables.get(var.getNombre()) != tiposValidos.get(0) && variables.get(var.getNombre()) != tiposValidos.get(1) && variables.containsKey(var.getNombre())) {
							return 3;
						}
					}
					else {
						if(variables.get(var.getNombre()) != tiposValidos.get(0) && variables.containsKey(var.getNombre())) {
							return 3;
						}
					}

				}
			}
		return check;
	}
	
	protected int asignacionOperacionRegistro(List<valor> valoresProblem, Map<String,String> variables, List<String> tiposValidos, Map<String,HashMap<String,String>> registros, List<String> nombresRegistros) {
		int check = 1;
		for(valor v: valoresProblem) {
			if(v instanceof ValorRegistro) {
				//Lo buscamos y miramos su tipo
				ValorRegistro vr = (ValorRegistro) v;
				for(String nombre: nombresRegistros) {
					if(nombre.equals(variables.get(vr.getNombre_registro()))) {
						if(tiposValidos.get(0) == "entero") {
							if(registros.get(nombre).get(vr.getCampo().get(0).getNombre_campo()) != tiposValidos.get(0) && registros.get(nombre).get(vr.getCampo().get(0).getNombre_campo()) != tiposValidos.get(1)) {
								return 3;
							}
							else if(registros.get(nombre).get(vr.getCampo().get(0).getNombre_campo()) == tiposValidos.get(1)) {
								check = 2;
							}
						}
						else if(tiposValidos.get(0) == "real") {
							if(registros.get(nombre).get(vr.getCampo().get(0).getNombre_campo()) != tiposValidos.get(0) && registros.get(nombre).get(vr.getCampo().get(0).getNombre_campo()) != tiposValidos.get(1)) {
								return 3;
							}
						}
						else {
							if(registros.get(nombre).get(vr.getCampo().get(0).getNombre_campo()) != tiposValidos.get(0)) {
								return 3;
							}
						}
					}
				}
			}
		}
		return check;
	}
	
	protected int asignacionOperacionFuncion(List<valor> valoresProblem, Map<String,String> variables, List<String> tiposValidos, Map<String,HashMap<Integer,String>> funcionesTipadas) {
		int check = 1;
		for(valor v: valoresProblem) {
			if(v instanceof LlamadaFuncion) {
				LlamadaFuncion f = (LlamadaFuncion) v;
				if(tiposValidos.get(0) == "entero") {
					if(funcionesTipadas.get(f.getNombre()).get(f.getOperador().size()) != tiposValidos.get(0) && funcionesTipadas.get(f.getNombre()).get(f.getOperador().size()) != tiposValidos.get(1) && funcionesTipadas.containsKey(f.getNombre()) && funcionesTipadas.get(f.getNombre()).containsKey(f.getOperador().size())) {
						return 3;
					}
					else if(funcionesTipadas.get(f.getNombre()).get(f.getOperador().size()) == tiposValidos.get(1) &&  funcionesTipadas.get(f.getNombre()).containsKey(f.getOperador().size())) {
						check = 2;
					}
				}
				else if(tiposValidos.get(0) == "real") {
					if(funcionesTipadas.get(f.getNombre()).get(f.getOperador().size()) != tiposValidos.get(0) && funcionesTipadas.get(f.getNombre()).get(f.getOperador().size()) != tiposValidos.get(1) && funcionesTipadas.containsKey(f.getNombre()) && funcionesTipadas.get(f.getNombre()).containsKey(f.getOperador().size())) {
						return 3;
					}
				}
				else {
					if(funcionesTipadas.get(f.getNombre()).get(f.getOperador().size()) != tiposValidos.get(0) && funcionesTipadas.containsKey(f.getNombre()) && funcionesTipadas.get(f.getNombre()).containsKey(f.getOperador().size())) {
						return 3;
					}
				}
			}
		}
		return check;
	}
	
	protected int asignacionOperacionVector(List<valor> valoresProblem, Map<String,String> variables, List<String> tiposValidos, Map<String,String> vectores) {
		int check = 1;
		for(valor v: valoresProblem) {
			if(v instanceof ValorVector) {
				ValorVector vector = (ValorVector) v;
				if(tiposValidos.get(0) == "entero") {
					if(vectores.get(variables.get(vector.getNombre_vector())) != tiposValidos.get(0) && vectores.get(variables.get(vector.getNombre_vector())) != tiposValidos.get(1) && vectores.containsKey(variables.get(vector.getNombre_vector()))) {
						return 3;
					}
					else if(vectores.get(variables.get(vector.getNombre_vector())) == tiposValidos.get(1)) {
						check = 2;
					}
				}
				else if(tiposValidos.get(0) == "real") {
					if(vectores.get(variables.get(vector.getNombre_vector())) != tiposValidos.get(0) && vectores.get(variables.get(vector.getNombre_vector())) != tiposValidos.get(1) && vectores.containsKey(variables.get(vector.getNombre_vector()))) {
						return 3;
					}
				}
				else {
					if(vectores.get(variables.get(vector.getNombre_vector())) != tiposValidos.get(0) && vectores.containsKey(variables.get(vector.getNombre_vector()))) {
						return 3;
					}
				}
			}
		}
		return check;
	}
	
	protected int asignacionOperacionMatriz(List<valor> valoresProblem, Map<String,String> variables, List<String> tiposValidos, Map<String,String> matrices) {
		int check = 1;
		for(valor v: valoresProblem) {
			if(v instanceof ValorMatriz) {
				ValorMatriz matriz = (ValorMatriz) v;
				if(tiposValidos.get(0) == "entero") {
					if(matrices.get(variables.get(matriz.getNombre_matriz())) != tiposValidos.get(0) && matrices.get(variables.get(matriz.getNombre_matriz())) != tiposValidos.get(1) && matrices.containsKey(variables.get(matriz.getNombre_matriz()))) {
						return 3;
					}
					else if(matrices.get(variables.get(matriz.getNombre_matriz())) == tiposValidos.get(1)) {
						check = 2;
					}
				}
				else if(tiposValidos.get(0) == "real") {
					if(matrices.get(variables.get(matriz.getNombre_matriz())) != tiposValidos.get(0) && matrices.get(variables.get(matriz.getNombre_matriz())) != tiposValidos.get(1) && matrices.containsKey(variables.get(matriz.getNombre_matriz()))) {
						return 3;
					}
				}
				else {
					if(matrices.get(variables.get(matriz.getNombre_matriz())) != tiposValidos.get(0) && matrices.containsKey(variables.get(matriz.getNombre_matriz()))) {
						return 3;
					}
				}
			}
		}
		return check;
	}
	
	protected List<ValorRegistro> variablesRegistroExistentes(List<valor> valores, Map<String,String> variables, List<String> nombresRegistros) {
		List<ValorRegistro> valoresRegistro = new ArrayList<ValorRegistro>();
		for(valor v: valores) {
			if(v instanceof ValorRegistro) {
				//Buscamos si el tipo con el que se declaró es uno de tipo registro
				ValorRegistro vr = (ValorRegistro) v;
				if(!nombresRegistros.contains(variables.get(vr.getNombre_registro())) && variables.containsKey(vr.getNombre_registro())) {
					valoresRegistro.add(vr);
				}
			}
		}
		//Devolvemos todas las variables que se estan usando como registro y no lo son
		return valoresRegistro;
	}
	
	protected List<ValorVector> variablesVectorExistentes(List<valor> valores, Map<String,String> variables, List<String> nombresVectores) {
		List<ValorVector> valoresVector = new ArrayList<ValorVector>();
		for(valor v: valores) {
			if(v instanceof ValorVector) {
				//Buscamos si el tipo con el que se declaró es uno de tipo registro
				ValorVector vv = (ValorVector) v;
				if(!nombresVectores.contains(variables.get(vv.getNombre_vector())) && variables.containsKey(vv.getNombre_vector())) {
					valoresVector.add(vv);
				}
			}
		}
		//Devolvemos todas las variables que se estan usando como registro y no lo son
		return valoresVector;
	}
	
	protected List<ValorMatriz> variablesMatrizExistentes(List<valor> valores, Map<String,String> variables, List<String> nombresMatrices) {
		List<ValorMatriz> valoresMatriz = new ArrayList<ValorMatriz>();
		for(valor v: valores) {
			if(v instanceof ValorMatriz) {
				//Buscamos si el tipo con el que se declaró es uno de tipo registro
				ValorMatriz vm = (ValorMatriz) v;
				if(!nombresMatrices.contains(variables.get(vm.getNombre_matriz())) && variables.containsKey(vm.getNombre_matriz())) {
					valoresMatriz.add(vm);
				}
			}
		}
		//Devolvemos todas las variables que se estan usando como registro y no lo son
		return valoresMatriz;
	}
	
	protected List<ValorRegistro> variablesRegistroDeclaradas(List<valor> valores, List<String> variables) {
		List<ValorRegistro> variablesNoDeclaradas = new ArrayList<ValorRegistro>();
		for(valor v: valores) {
			if(v instanceof ValorRegistro) {
				//Buscamos si ha sido definida (la comprobación de si pertenece al tipo registro lo omitimos porque ya hay otra función
				//que se encarga de ello
				ValorRegistro vr = (ValorRegistro) v;
				if(!variables.contains(vr.getNombre_registro())) {
					variablesNoDeclaradas.add(vr);
				}
			}
		}
		return variablesNoDeclaradas;
	}
	
	protected List<ValorVector> variablesVectorDeclaradas(List<valor> valores, List<String> variables) {
		List<ValorVector> variablesNoDeclaradas = new ArrayList<ValorVector>();
		for(valor v: valores) {
			if(v instanceof ValorVector) {
				ValorVector vv = (ValorVector) v;
				if(!variables.contains(vv.getNombre_vector())) {
					variablesNoDeclaradas.add(vv);
				}
			}
		}
		return variablesNoDeclaradas;
	}
	
	protected List<ValorMatriz> variablesMatrizDeclaradas(List<valor> valores, List<String> variables) {
		List<ValorMatriz> variablesNoDeclaradas = new ArrayList<ValorMatriz>();
		for(valor v: valores) {
			if(v instanceof ValorMatriz) {
				ValorMatriz vm = (ValorMatriz) v;
				if(!variables.contains(vm.getNombre_matriz())) {
					variablesNoDeclaradas.add(vm);
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
			else if(v instanceof LlamadaFuncion) {
				//Comprobamos si alguno de los parámetros es una variable no definida
				LlamadaFuncion f = (LlamadaFuncion) v;
				for(Operador o: f.getOperador()) {
					if(o instanceof VariableID) {
						VariableID var = (VariableID) o;
						if(!variables.contains(var.getNombre())) {
							variablesNoDeclaradas.add(var);
						}
					}
				}
			}
		}
		return variablesNoDeclaradas;
	}
	
	protected List<String> registrarCamposRegistroSinTipo(List<Declaracion> declaraciones) {
		List<String> campos = new ArrayList<String>();
		for(Declaracion d: declaraciones) {
			if(d instanceof DeclaracionPropia) {
				DeclaracionPropia dec = (DeclaracionPropia) d;
				for(Variable v: dec.getVariable()) {
					campos.add(v.getNombre());
				}
			}
			else {
				DeclaracionVariable dec = (DeclaracionVariable) d;
				for(Variable v: dec.getVariable()) {
					campos.add(v.getNombre());
				}
			}
		}
		return campos;
	}
	
	protected HashMap<String,String> registrarCamposRegistro(List<Declaracion> declaraciones) {
		HashMap<String,String> campos = new HashMap<String,String>();
		for(Declaracion d: declaraciones) {
			if(d instanceof DeclaracionPropia) {
				DeclaracionPropia dec = (DeclaracionPropia) d;
				for(Variable v: dec.getVariable()) {
					campos.put(v.getNombre(), dec.getTipo());
				}
			}
			else {
				DeclaracionVariable dec = (DeclaracionVariable) d;
				for(Variable v: dec.getVariable()) {
					campos.put(v.getNombre(), dec.getTipo().getName());
				}
			}
		}
		return campos;
	}
	
	protected void prepararColeccionesTiposComplejos(EList<TipoComplejo> complejos, Map<String,HashMap<String,String>> registros, List<String> nombresRegistros, Map<String,String> vectores, Map<String,String> matrices) {
		
		for(TipoComplejo t: complejos) {
			if(t instanceof Registro) {
				Registro r = (Registro) t;
				registros.put(r.getNombre(), registrarCamposRegistro(r.getVariable()));
				nombresRegistros.add(r.getNombre());
			}
			else if(t instanceof Vector) {
				Vector v = (Vector) t;
				vectores.put(v.getNombre(), getTipoComplejo(v.getTipo()));
				
			}
			else if(t instanceof Matriz) {
				Matriz m = (Matriz) t;
				matrices.put(m.getNombre(), getTipoComplejo(m.getTipo()));
			}
		}
	}
	
	protected void prepararColeccionFunciones(List<Subproceso> funciones, Map<String,HashMap<Integer,String>> funcionesTipadas) {
		
		for(Subproceso s: funciones) {
			if(s instanceof Funcion) {
				Funcion f = (Funcion) s;
				//Como hay otra función que se encarga de que no esten repetidos obviamos la comprobación
				HashMap<Integer,String> aux = new HashMap<Integer,String>();
				for(Subproceso s2: funciones) {
					if(s2 instanceof Funcion) {
						Funcion f2 = (Funcion) s2;
						if(f.getNombre().equals(f2.getNombre())) {
							aux.put(f2.getParametrofuncion().size(), f2.getTipo().getName());
						}
					}
				}
				funcionesTipadas.put(f.getNombre(), aux);
			}
		}
		
	}
	
}
