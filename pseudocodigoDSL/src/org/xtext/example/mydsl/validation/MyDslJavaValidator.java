package org.xtext.example.mydsl.validation;

import java.util.ArrayList;
import java.util.List;

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
		int caso = 0;
		List<Integer> numeros = new ArrayList<Integer>();
		for(Caso c: s.getCaso()) {
			Operador op = c.getOperador();
			caso = caso + 1;
			if(op instanceof NumeroEntero) {
				NumeroEntero e = (NumeroEntero) op;
				if(!numeros.contains(e.getValor())) {
					//Si no esta repetido lo registramos
					numeros.add(e.getValor());
				}
				else {
					//Si esta repetido lanzamos el error
					error("No pueden exitir dos valores identificadores de los casos de la estructura segun_sea repetidos.", DiagramapseudocodigoPackage.Literals.SEGUN__CASO, caso-1);
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
					error("No se pueden declarar dos variables con el mismo nombre dentro de la declaración de un registro", DiagramapseudocodigoPackage.Literals.REGISTRO__NOMBRE);
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
		int cont = 0;
		List<String> variables = new ArrayList<String>();
		for(Declaracion d: i.getDeclaracion()) {
			if(d instanceof DeclaracionVariable) {
				//Si la actual se ha instanciado como una subclase de tipo DeclaracionVariable
				DeclaracionVariable dec = (DeclaracionVariable) d;
				for(Variable v: dec.getVariable()) {
					if(!variables.contains(v.getNombre())) {
						//Si no esta repetida la registramos
						variables.add(v.getNombre());
						cont++;
					}
					else {
						//Si esta repetida lanzamos el error
						error("No pueden existir dos variables con el mismo nombre dentro del mismo programa principal", DiagramapseudocodigoPackage.Literals.INICIO__DECLARACION, cont);
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
						cont++;
					}
					else {
						//Si esta repetida lanzamos el error
						error("No pueden existir dos variables con el mismo nombre dentro del mismo programa principal", DiagramapseudocodigoPackage.Literals.INICIO__DECLARACION, cont);
					}
				}
			}
		}
	}
	
	
	@Check
	//Función que comprueba en el programa principal que la variable utilizada en el segun_sea haya sido declarada con anterioridad
	protected void checkSegun(Inicio i) {
		//Registramos todas las variables declaradas dando por hecho que son correctas ya que hay otra función encargada de comprobarlo
		List<String> variables = new ArrayList<String>();
		for(Declaracion d: i.getDeclaracion()) {
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
		//Despues de tener todas las variables declaradas comprobamos si la que se usa en el según esta entre ellas
		int cont = 0;
		segun se = null;
		for(Sentencias s: i.getTiene()) {
			if(s instanceof segun) {
				se = (segun) s;
				cont = i.getTiene().indexOf(s);
			}
		}
		if(se != null) {
			VariableID v = (VariableID) se.getValor(); //Siempre es una variable
			if(!variables.contains(v.getNombre())) {
				error("La variable utilizada como parámetro en el segun_sea debe haber sido previamente declarada", DiagramapseudocodigoPackage.Literals.INICIO__TIENE,cont);
			}
		}
	}
	
	@Check
	//Función que comprueba en las funciones que la variable utilizada en el segun_sea haya sido declarada con anterioridad
	protected void checkSegun(Funcion f) {
		//Registramos todas las variables declaradas dando por hecho que son correctas ya que hay otra función encargada de comprobarlo
		List<String> variables = new ArrayList<String>();
		for(Declaracion d: f.getDeclaracion()) {
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
		//Despues de tener todas las variables declaradas comprobamos si la que se usa en el según esta entre ellas
		int cont = 0;
		segun se = null;
		for(Sentencias s: f.getSentencias()) {
			if(s instanceof segun) {
				se = (segun) s;
				cont = f.getSentencias().indexOf(s);
			}
		}
		if(se != null) {
			VariableID v = (VariableID) se.getValor(); //Siempre es una variable
			if(!variables.contains(v.getNombre())) {
				error("La variable utilizada como parámetro en el segun_sea debe haber sido previamente declarada", DiagramapseudocodigoPackage.Literals.SUBPROCESO__SENTENCIAS,cont);
			}
		}
	}
	
	@Check
	//Función que comprueba en los procedimientos que la variable utilizada en el segun_sea haya sido declarada con anterioridad
	protected void checkSegun(Procedimiento p) {
		//Registramos todas las variables declaradas dando por hecho que son correctas ya que hay otra función encargada de comprobarlo
		List<String> variables = new ArrayList<String>();
		for(Declaracion d: p.getDeclaracion()) {
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
		//Despues de tener todas las variables declaradas comprobamos si la que se usa en el según esta entre ellas
		int cont = 0;
		segun se = null;
		for(Sentencias s: p.getSentencias()) {
			if(s instanceof segun) {
				se = (segun) s;
				cont = p.getSentencias().indexOf(s);
			}
		}
		if(se != null) {
			VariableID v = (VariableID) se.getValor(); //Siempre es una variable
			if(!variables.contains(v.getNombre())) {
				error("La variable utilizada como parámetro en el segun_sea debe haber sido previamente declarada", DiagramapseudocodigoPackage.Literals.SUBPROCESO__SENTENCIAS,cont);
			}
		}
	}

}
