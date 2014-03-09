package org.xtext.example.mydsl.validation;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.xtext.validation.Check;

import diagramapseudocodigo.*;
public class MyDslJavaValidator extends AbstractMyDslJavaValidator {

//	@Check
//	public void checkGreetingStartsWithCapital(Greeting greeting) {
//		if (!Character.isUpperCase(greeting.getName().charAt(0))) {
//			warning("Name should start with a capital", MyDslPackage.Literals.GREETING__NAME);
//		}
//	}
	
	
	@Check
	//Función que se encarga de comprobar si el limite inferior de un subrango es siempre inferior al superior.
	protected void checkSubrango(Subrango s) {
		if(s instanceof SubrangoNumerico) {
			SubrangoNumerico sn = (SubrangoNumerico) s;
			if(sn.getLimite_inf() > sn.getLimite_sup()) {
				error("El limite inferior del subrango no puede ser mayor que el superior.",DiagramapseudocodigoPackage.Literals.SUBRANGO__NOMBRE);
			}
		}
	}
	
	@Check
	//Función que se encarga de comprobar que no existen casos repetidos en la estructura segun_sea
	protected void checkCasos(segun s) {
		List<Integer> numeros = new ArrayList<Integer>();
		for(Caso c: s.getCaso()) {
			Operador op = c.getOperador();
			if(op instanceof NumeroEntero) {
				NumeroEntero e = (NumeroEntero) op;
				if(!numeros.contains(e.getValor())) {
					//Si no esta repetido lo registramos
					numeros.add(e.getValor());
				}
				else {
					//Si esta repetido lanzamos el error
					error("No pueden exitir dos valores identificadores de los casos de la estructura segun_sea repetidos.", DiagramapseudocodigoPackage.Literals.SEGUN__CASO, s.getCaso().indexOf(c));
				}
			}
		}
	}
	
	
	@Check
	//Función que se encarga de comprobar que no existan dos parámetros en un subproceso con el mismo nombre
	protected void checkParametros(Subproceso s) {
		List<String> parametros = new ArrayList<String>();
		for(ParametroFuncion p: s.getParametrofuncion()) {
			if(!parametros.contains(p.getVariable().getNombre())) {
				//Si no esta repetida la registramos
				parametros.add(p.getVariable().getNombre());
			}
			else {
				//Si esta repetida lanzamos el error
				error("No pueden existir dos parámetros con el mismo nombre en la misma función o procedimiento", DiagramapseudocodigoPackage.Literals.SUBPROCESO__NOMBRE);
			}
		}
	}
	
	@Check
	//Función que se encarga de comprobar que no existan dos variables declaradas en un registro con el mismo nombre
	protected void checkRegistro(Registro r) {
		List<String> variables = new ArrayList<String>();
		for(DeclaracionVariable d: r.getVariable()) {
			for(Variable v: d.getVariable()) {
				if(!variables.contains(v.getNombre())) {
					//Si no esta repetida la registramos
					variables.add(v.getNombre());
				}
				else {
					//Si esta repetida lanzamos el error
					error("No se pueden declarar dos variables con el mismo nombre dentro de la declaración de un registro", DiagramapseudocodigoPackage.Literals.REGISTRO__VARIABLE, r.getVariable().indexOf(d));
				}
			}
		}
	}
	
	@Check
	//Función que se encarga de comprobar que no existan dos variables con el mismo nombre dentro de un subproceso
	protected void checkDeclaraciones(Subproceso s) {
		List<String> variables = new ArrayList<String>();
		//Registramos los parámetros que ya son válidados por otra función y se presuponen correctos sin repeticiones
		for(ParametroFuncion p: s.getParametrofuncion()) {
			variables.add(p.getVariable().getNombre());
		}
		for(Declaracion d: s.getDeclaracion()) {
			//Si la actual se ha instanciado como una subclase de tipo DeclaracionVariable
			if(d instanceof DeclaracionVariable) {
				DeclaracionVariable dec = (DeclaracionVariable) d;
				for(Variable v: dec.getVariable()) {
					if(!variables.contains(v.getNombre())) {
						//Si no esta repetida la registramos
						variables.add(v.getNombre());
					}
					else {
						//Si esta repetida lanzamos el error
						error("No pueden existir dos variables con el mismo nombre dentro de la misma función o procedimiento", DiagramapseudocodigoPackage.Literals.SUBPROCESO__NOMBRE);
					}
				}
			}
			else {
				//Si la actual se ha instanciado como una subclase de tipo DeclaracionPropia
				DeclaracionPropia dec = (DeclaracionPropia) d;
				for(Variable v: dec.getVariable()) {
					if(!variables.contains(v.getNombre())) {
						//Si no esta repetida la registramos
						variables.add(v.getNombre());
					}
					else {
						//Si esta repetida lanzamos el error
						error("No pueden existir dos variables con el mismo nombre dentro de la misma función o procedimiento", DiagramapseudocodigoPackage.Literals.SUBPROCESO__NOMBRE);	
					}
				}
			}
		}
	}
	
	
	@Check
	//Función que se encarga de comprobar que no existan dos variables con el mismo nombre dentro de un programa principal
	protected void checkDeclaraciones(Inicio i) {
		List<String> variables = new ArrayList<String>();
		for(Declaracion d: i.getDeclaracion()) {
			if(d instanceof DeclaracionVariable) {
				//Si la actual se ha instanciado como una subclase de tipo DeclaracionVariable
				DeclaracionVariable dec = (DeclaracionVariable) d;
				for(Variable v: dec.getVariable()) {
					if(!variables.contains(v.getNombre())) {
						//Si no esta repetida la registramos
						variables.add(v.getNombre());
					}
					else {
						//Si esta repetida lanzamos el error
						error("No pueden existir dos variables con el mismo nombre dentro del mismo programa principal", DiagramapseudocodigoPackage.Literals.INICIO__DECLARACION, i.getDeclaracion().indexOf(d));
					}
				}
			}
			else {
				//Si la actual se ha instanciado como una subclase del tipo DeclaracionPropia
				DeclaracionPropia dec = (DeclaracionPropia) d;
				for(Variable v: dec.getVariable()) {
					if(!variables.contains(v.getNombre())) {
						//Si no esta repetida la registramos
						variables.add(v.getNombre());
					}
					else {
						//Si esta repetida lanzamos el error
						error("No pueden existir dos variables con el mismo nombre dentro del mismo programa principal", DiagramapseudocodigoPackage.Literals.INICIO__DECLARACION, i.getDeclaracion().indexOf(d));
					}
				}
			}
		}
	}
	
	
	@Check
	//Función que comprueba en el programa principal que la variable utilizada en el segun_sea haya sido declarada con anterioridad
	protected void checkSegun(Inicio i) {
		//Registramos todas las variables declaradas dando por hecho que son correctas ya que hay otra función encargada de comprobarlo
		List<String> variables = registrarVariables(i.getDeclaracion());
		//Despues de tener todas las variables declaradas comprobamos si la que se usa en el según esta entre ellas
		for(Sentencias s: i.getTiene()) {
			if(s instanceof segun) {
				segun se = (segun) s;
				VariableID v = (VariableID) se.getValor(); //Siempre es una variable
				if(!variables.contains(v.getNombre())) {
					error("La variable utilizada como parámetro en el segun_sea debe haber sido previamente declarada", DiagramapseudocodigoPackage.Literals.INICIO__TIENE, i.getTiene().indexOf(s));
				}
			}
		}
	}
	
	@Check
	//Función que comprueba en las funciones que la variable utilizada en el segun_sea haya sido declarada con anterioridad
	protected void checkSegun(Funcion f) {
		//Registramos todas las variables declaradas dando por hecho que son correctas ya que hay otra función encargada de comprobarlo
		List<String> variables = registrarVariables(f.getDeclaracion());
		//Despues de tener todas las variables declaradas comprobamos si la que se usa en el según esta entre ellas
		for(Sentencias s: f.getSentencias()) {
			if(s instanceof segun) {
				segun se = (segun) s;
				VariableID v = (VariableID) se.getValor(); //Siempre es una variable
				if(!variables.contains(v.getNombre())) {
					error("La variable utilizada como parámetro en el segun_sea debe haber sido previamente declarada", DiagramapseudocodigoPackage.Literals.SUBPROCESO__SENTENCIAS, f.getSentencias().indexOf(s));
				}
			}
		}
	}
	
	@Check
	//Función que comprueba en los procedimientos que la variable utilizada en el segun_sea haya sido declarada con anterioridad
	protected void checkSegun(Procedimiento p) {
		//Registramos todas las variables declaradas dando por hecho que son correctas ya que hay otra función encargada de comprobarlo
		List<String> variables = registrarVariables(p.getDeclaracion());
		//Despues de tener todas las variables declaradas comprobamos si la que se usa en el según esta entre ellas
		for(Sentencias s: p.getSentencias()) {
			if(s instanceof segun) {
				segun se = (segun) s;
				VariableID v = (VariableID) se.getValor(); //Siempre es una variable
				if(!variables.contains(v.getNombre())) {
					error("La variable utilizada como parámetro en el segun_sea debe haber sido previamente declarada", DiagramapseudocodigoPackage.Literals.SUBPROCESO__SENTENCIAS, p.getSentencias().indexOf(s));
				}
			}
		}
	}
	
	@Check
	protected void checkTipoSegun(Inicio i) {
		//Primero Ahora buscamos la variable y averiguamos su tipo
		segun se = null;
		for(Sentencias s: i.getTiene()) {
			if(s instanceof segun) {
				se = (segun) s;
			}
		}
		String nombre = null;
		if(se != null) {
			//Siempre es una variable
			VariableID v = (VariableID) se.getValor();
			nombre = v.getNombre();
			
			//Después seleccionamos el tipo de la variable de entrada del segun_sea (damos por hecho que esta declarada porque hay otra función que lo comprueba)
			
			DeclaracionVariable parametro = null;
			
			for(Declaracion d: i.getDeclaracion()) {
				if(d instanceof DeclaracionVariable) {
					DeclaracionVariable dec = (DeclaracionVariable) d;
					for(Variable var: dec.getVariable()) {
						if(var.getNombre() == nombre) {
							parametro = dec;
						}
					}
				}
			}
			int cont = 0;
			boolean valido = true;
			
			if(parametro.getTipo() == TipoVariable.getByName("entero")) {
				//Comprobamos que las variables de los casos sean todas del mismo tipo
				for(Caso c: se.getCaso()) {
					if(!(c.getOperador() instanceof NumeroEntero)) {
						valido = false;
					}
					cont++;
				}
			}
			
			if(!valido) {
				warning("Todos los parámetros del segun_caso deben ser del mismo tipo que el parámetro de entrada del segun_caso", DiagramapseudocodigoPackage.Literals.SEGUN__CASO,cont);
			}
		}
		
	}
	
	@Check
	//Función que compueba que las constantes utilizadas para definir los tamaños de los vectores y matrices han sido declaradas con anterioridad
	protected void checkConstantes(Codigo c) {
		List<String> constantes = new ArrayList<String>();
		for(Constantes cons: c.getConstantes()) {
			constantes.add(cons.getVariable().getNombre());
		}
		for(TipoComplejo t: c.getTipocomplejo()) {
			if(t instanceof Vector) {
				Vector v = (Vector) t;
				if(v.getValor() instanceof VariableID) {
					VariableID var = (VariableID) v.getValor();
					if(!constantes.contains(var.getNombre())) {
						error("La constante debe estar definida", DiagramapseudocodigoPackage.Literals.CODIGO__TIPOCOMPLEJO, c.getTipocomplejo().indexOf(t));
					}
				}
			}
			if(t instanceof Matriz) {
				Matriz m = (Matriz) t;
				if(m.getValor().get(0) instanceof VariableID) {
					VariableID var = (VariableID) m.getValor().get(0);
					if(!constantes.contains(var.getNombre())) {
						error("La constante debe estar definida", DiagramapseudocodigoPackage.Literals.CODIGO__TIPOCOMPLEJO, c.getTipocomplejo().indexOf(t));
					}
				}
				if(m.getValor().size() > 1 && m.getValor().get(1) instanceof VariableID) {
					VariableID var = (VariableID) m.getValor().get(1);
					if(!constantes.contains(var.getNombre())) {
						error("La constante debe estar definida", DiagramapseudocodigoPackage.Literals.CODIGO__TIPOCOMPLEJO, c.getTipocomplejo().indexOf(t));
					}
				}
			}
		}
	}
	
	@Check
	//Función que comprueba que no existen dos constantes con el mismo nombre
	protected void checkConstantesRepetidas(Codigo c) {
		List<String> constantes = new ArrayList<String>();
		for(Constantes cons: c.getConstantes()) {
			if(constantes.contains(cons.getVariable().getNombre())) {
				//Si ya ha sido registrada lanzamos el error
				error("No pueden existir dos constantes con el mismo nombre", DiagramapseudocodigoPackage.Literals.CODIGO__CONSTANTES, c.getConstantes().indexOf(cons));
			}
			else {
				//Si no ha sido registrada la registramos
				constantes.add(cons.getVariable().getNombre());
			}
		}
	}
	
	@Check
	//Función que comprueba que el tipo de una variable ha sido definido con anterioridad
	protected void checkDeclaracionesTiposComplejos(Codigo c) {
		//Registramos los nombres de todos los tipos complejos suponiendo que no estan repetidos ya que hay otra funci�n que lo comprueba
		List<String >tipos = registrarTipos(c.getTipocomplejo());
		
		//Comprobamos que todas las declaraciones de variables complejas en el programa principal y en los subprocesos son de tipos existentes
		
		for(Declaracion d: c.getTiene().getDeclaracion()) {
			if(d instanceof DeclaracionPropia) {
				DeclaracionPropia dec = (DeclaracionPropia) d;
				if(!tipos.contains(dec.getTipo())) {
					//Si el tipo no existe entonces lanzamos el error
					error("El tipo de la variable debe estar previamente definido", c.getTiene(), DiagramapseudocodigoPackage.Literals.INICIO__DECLARACION, c.getTiene().getDeclaracion().indexOf(d));
				}
			}
		}
		
		for(Subproceso s: c.getFuncion()) {
			for(Declaracion d: s.getDeclaracion()) {
				if(d instanceof DeclaracionPropia) {
					DeclaracionPropia dec = (DeclaracionPropia) d;
					if(!tipos.contains(dec.getTipo())) {
						//Si el tipo no existe entonces lanzamos el error
						error("El tipo de la variable debe estar previamente definido", s, DiagramapseudocodigoPackage.Literals.SUBPROCESO__DECLARACION, s.getDeclaracion().indexOf(d));
					}
				}
			}
		}
	}
	
	@Check
	//Función que comprueba que no hay dos tipos complejos diferentes con el mismo nombre
	protected void checkTipos(Codigo c) {
		List<String> tipos = new ArrayList<String>();
		
		for(TipoComplejo com: c.getTipocomplejo()) {
			if(com instanceof Vector) {
				Vector v = (Vector) com;
				if(!tipos.contains(v.getNombre())) {
					//Si no existe lo registramos
					tipos.add(v.getNombre());
				}
				else {
					//Si existe lanzamos el error
					error("El nombre del tipo debe ser único", DiagramapseudocodigoPackage.Literals.CODIGO__TIPOCOMPLEJO, c.getTipocomplejo().indexOf(com));
				}
			}
			else if(com instanceof Matriz) {
				Matriz m = (Matriz) com;
				if(!tipos.contains(m.getNombre())) {
					//Si no existe lo registramos
					tipos.add(m.getNombre());
				}
				else {
					//Si existe lanzamos el error
					error("El nombre del tipo debe ser único", DiagramapseudocodigoPackage.Literals.CODIGO__TIPOCOMPLEJO, c.getTipocomplejo().indexOf(com));
				}
			}
			else if(com instanceof Registro) {
				Registro r = (Registro) com;
				if(!tipos.contains(r.getNombre())) {
					//Si no existe lo registramos
					tipos.add(r.getNombre());
				}
				else {
					//Si existe lanzamos el error
					error("El nombre del tipo debe ser único", DiagramapseudocodigoPackage.Literals.CODIGO__TIPOCOMPLEJO, c.getTipocomplejo().indexOf(com));
				}
			}
			else if(com instanceof Enumerado) {
				Enumerado e = (Enumerado) com;
				if(!tipos.contains(e.getNombre())) {
					//Si no existe lo registramos
					tipos.add(e.getNombre());
				}
				else {
					//Si existe lanzamos el error
					error("El nombre del tipo debe ser único", DiagramapseudocodigoPackage.Literals.CODIGO__TIPOCOMPLEJO, c.getTipocomplejo().indexOf(com));
				}
			}
			else if(com instanceof Archivo) {
				Archivo a = (Archivo) com;
				if(!tipos.contains(a.getNombre())) {
					//Si no existe lo registramos
					tipos.add(a.getNombre());
				}
				else {
					//Si existe lanzamos el error
					error("El nombre del tipo debe ser único", DiagramapseudocodigoPackage.Literals.CODIGO__TIPOCOMPLEJO, c.getTipocomplejo().indexOf(com));
				}
			}
			else {
				Subrango s = (Subrango) com;
				if(!tipos.contains(s.getNombre())) {
					//Si no existe lo registramos
					tipos.add(s.getNombre());
				}
				else {
					//Si existe lanzamos el error
					error("El nombre del tipo debe ser único", DiagramapseudocodigoPackage.Literals.CODIGO__TIPOCOMPLEJO, c.getTipocomplejo().indexOf(com));
				}
			}
		}
	}
	
	@Check
	//Función que comprueba que no haya declaradas dos funciones con el mismo nombre y mismo número de parámetros
	protected void checkFunciones(Codigo c) {
		List<String> nombres = new ArrayList<String>();
		List<ArrayList<Integer>> parametros = new ArrayList<ArrayList<Integer>>();
		for(Subproceso s: c.getFuncion()) {
			//Comprobamos que no haya otro subproceso con el mismo nombre y el mismo número de parámetros
			if(!nombres.contains(s.getNombre())) {
				//Si todavia no hay ninguna que se llame así, la registramos
				nombres.add(s.getNombre());
				parametros.add(new ArrayList<Integer>());
				parametros.get(nombres.indexOf(s.getNombre())).add(s.getParametrofuncion().size());
			}
			else if(nombres.contains(s.getNombre()) && !parametros.get(nombres.indexOf(s.getNombre())).contains(s.getParametrofuncion().size())) {
				//Si el nombre existe y no tiene el mismo número de parámetros lo registramos
				parametros.get(nombres.indexOf(s.getNombre())).add(s.getParametrofuncion().size());
				
			}
			else {
				error("No puede existir dos subprocesos con el mismo nombre y mismo número de parámetros", s, DiagramapseudocodigoPackage.Literals.SUBPROCESO__NOMBRE, c.getFuncion().indexOf(s));
			}
		}
	}
	
	@Check
	//Función que comprueba que una variable deba estar definida antes de usarse
	protected void checkVariablesUsadas(Inicio i) {
		List<String> variables = registrarVariables(i.getDeclaracion());
		
		for(Sentencias s: i.getTiene()) {
			if(s instanceof LlamadaFuncion) {
				LlamadaFuncion f = (LlamadaFuncion) s;
				for(Operador o: f.getOperador()) {
					if(o instanceof VariableID) {
						VariableID v = (VariableID) o;
						if(!variables.contains(v.getNombre())) {
							error("La variable debe haber sido previamente definida", v, DiagramapseudocodigoPackage.Literals.VARIABLE_ID__NOMBRE);
						}
					}
				}
			}
			else if(s instanceof Leer) {
				Leer l = (Leer) s;
				if(!variables.contains(l.getVariable().getNombre())) {
					error("La variable debe haber sido previamente definida", l.getVariable(), DiagramapseudocodigoPackage.Literals.VARIABLE_ID__NOMBRE);
				}
			}
			
			else if(s instanceof Escribir) {
				Escribir e = (Escribir) s;
				for(Operador o: e.getOperador()) {
					if(o instanceof VariableID) {
						VariableID v = (VariableID) o;
						if(!variables.contains(v.getNombre())) {
							error("La variable debe haber sido previamente definida", v, DiagramapseudocodigoPackage.Literals.VARIABLE_ID__NOMBRE);
						}
					}
				}
			}
			
			else if(s instanceof incremento) {
				incremento ic = (incremento) s;
				if(!variables.contains(ic.getNombre())) {
					error("La variable debe haber sido previamente definida", ic, DiagramapseudocodigoPackage.Literals.INCREMENTO__NOMBRE);
				}
			}
			
			else if(s instanceof Asignacion) {
				Asignacion a = (Asignacion) s;
				if(a instanceof AsignacionNormal) {
					AsignacionNormal as = (AsignacionNormal) a;
					if(!variables.contains(as.getLvalue())) {
						error("La variable debe haber sido previamente definida", as, DiagramapseudocodigoPackage.Literals.ASIGNACION_NORMAL__LVALUE);
					}
					if(as.getOperador() instanceof VariableID) {
						VariableID v = (VariableID) as.getOperador();
						if(!variables.contains(v.getNombre())) {
							error("La variable debe haber sido previamente definida", v, DiagramapseudocodigoPackage.Literals.VARIABLE_ID__NOMBRE);
						}
					}
					if(as.getOperador() instanceof operacion) {
						operacion o = (operacion) as.getOperador();
						if(o.getOp_der().getOper_der() instanceof VariableID) {
							VariableID v = (VariableID) o.getOp_der().getOper_der();
							if(!variables.contains(v.getNombre())) {
								error("La variable debe haber sido previamente definida", v, DiagramapseudocodigoPackage.Literals.VARIABLE_ID__NOMBRE);
							}
						}
						if(o.getOp_izq().getOper_izq() instanceof VariableID) {
							VariableID v = (VariableID) o.getOp_izq().getOper_izq();
							if(!variables.contains(v.getNombre())) {
								error("La variable debe haber sido previamente definida", v, DiagramapseudocodigoPackage.Literals.VARIABLE_ID__NOMBRE);
							}
						}
					}
				}
			}
		}
	}
	
	@Check
	protected void checkLlamadaFuncion(Codigo c) {
		List<String> funciones = new ArrayList<String>();
		List<ArrayList<Integer>> parametros = new ArrayList<ArrayList<Integer>>();
		for(Subproceso s: c.getFuncion()) {
			//Se presupone que no hay ninguna repetida porque ya existe una función que se encarga de ello
			if(!funciones.contains(s.getNombre())) {
				//Si todavia no hay ninguna que se llame así, la registramos
				funciones.add(s.getNombre());
				parametros.add(new ArrayList<Integer>());
				parametros.get(funciones.indexOf(s.getNombre())).add(s.getParametrofuncion().size());
			}
			else {
				//Si el nombre existe y no tiene el mismo número de parámetros lo registramos
				parametros.get(funciones.indexOf(s.getNombre())).add(s.getParametrofuncion().size());
			}
		}
		
		for(Subproceso s: c.getFuncion()) {
			funciones.add(s.getNombre());
		}
		
		for(Sentencias s: c.getTiene().getTiene()) {
			if(s instanceof LlamadaFuncion) {
				LlamadaFuncion l = (LlamadaFuncion) s;
				if(!funciones.contains(l.getNombre())) {
					error("La función debe haber sido previamente declarada", l, DiagramapseudocodigoPackage.Literals.LLAMADA_FUNCION__NOMBRE);
				}
				else if(!parametros.get(funciones.indexOf(l.getNombre())).contains(l.getOperador().size())) {
					error("El número de parámetros de la función no es el esperado", l, DiagramapseudocodigoPackage.Literals.LLAMADA_FUNCION__NOMBRE);
				}
			}
		}
		
		for(Subproceso s: c.getFuncion()) {
			for(Sentencias sn: s.getSentencias()) {
				if(sn instanceof LlamadaFuncion) {
					LlamadaFuncion l = (LlamadaFuncion) sn;
					if(!funciones.contains(l.getNombre())) {
						error("La función debe haber sido previamente declarada", l, DiagramapseudocodigoPackage.Literals.LLAMADA_FUNCION__NOMBRE);
					}
				}
			}
		}
	}
	
	@Check
	//Función que comprueba que el tipo de devolución de una función sea compatible o igual al tipo realmente devuelto
	protected void checkFuncion(Subproceso s) {
		if(s instanceof Funcion) {
			Funcion f = (Funcion) s;
			String tipoDevuelve = f.getTipo().getName();
			if(f.getDevuelve().getDevuelve() instanceof VariableID) {
				VariableID v = (VariableID) f.getDevuelve().getDevuelve();
				String nombreVar = v.getNombre();
				//Buscamos las variables en las declaraciones y en los parametros para averiguar de que tipo es
				Map<String,String> variables = new HashMap<String,String>();
				//Registramos las declaraciones
				for(Declaracion d: f.getDeclaracion()) {
					if(d instanceof DeclaracionVariable) {
						DeclaracionVariable dec = (DeclaracionVariable) d;
						//Registramos todas las variables declaradas y sus respectivos tipos
						//Nota: No se comprueba si están repetidas porque ya hay una función que se encarga de ello.
						for(Variable var: dec.getVariable()) {
							variables.put(var.getNombre(), dec.getTipo().getName());
						}
					}
					else if(d instanceof DeclaracionPropia) {
						DeclaracionPropia dec = (DeclaracionPropia) d;
						//Registramos todas las variables declaradas y sus respectivos tipos
						//Nota: No se comprueba si están repetidas porque ya hay una función que se encarga de ello.
						for(Variable var: dec.getVariable()) {
							variables.put(var.getNombre(), dec.getTipo());
						}
					}
				}
				//Registramos los parámetros
				for(ParametroFuncion p: f.getParametrofuncion()) {
					//Registramos todos los parámetros declarados y sus respectivos tipos
					variables.put(p.getVariable().getNombre(), p.getTipo().getName());
				}
				
				//Comprobamos que la variable que se quiere devolver este definida y sea del tipo correcto.
				if(!variables.containsKey(nombreVar)) {
					error("La variable no ha sido definida", v, DiagramapseudocodigoPackage.Literals.VARIABLE_ID__NOMBRE);
				}
				else if(variables.get(nombreVar) != tipoDevuelve) {
					if(variables.get(nombreVar) == "real" && tipoDevuelve == "entero") {
						warning("El tipo de devolución no es el indicado, puede haber pérdida de precisión", v, DiagramapseudocodigoPackage.Literals.VARIABLE_ID__NOMBRE);
					}
					else if(variables.get(nombreVar) != "entero" || tipoDevuelve != "real") {
						error("El tipo de devolución no es el indicado, los tipos son incompatibles", v, DiagramapseudocodigoPackage.Literals.VARIABLE_ID__NOMBRE);
					}
				}
			}
		}
	}
	
	private List<String> registrarTipos(List<TipoComplejo> tipoComplejo) {
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
	
	private List<String> registrarVariables(List<Declaracion> declaraciones) {
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

}
