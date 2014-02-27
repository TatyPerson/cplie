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
	public void checkSubrango(Subrango s) {
		if(s instanceof SubrangoNumerico) {
			SubrangoNumerico sn = (SubrangoNumerico) s;
			if(sn.getLimite_inf() > sn.getLimite_sup()) {
				error("El limite inferior del subrango no puede ser mayor que el superior.",DiagramapseudocodigoPackage.Literals.SUBRANGO__NOMBRE);
			}
		}
	}
	
	@Check
	public void checkCasos(segun s) {
		int caso = 0;
		List<Integer> numeros = new ArrayList<Integer>();
		for(Caso c: s.getCaso()) {
			Operador op = c.getOperador();
			caso = caso + 1;
			if(op instanceof NumeroEntero) {
				NumeroEntero e = (NumeroEntero) op;
				if(!numeros.contains(e.getValor())) {
					numeros.add(e.getValor());
				}
				else {
					error("No pueden exitir dos valores identificadores de los casos de la estructura segun_sea repetidos.", DiagramapseudocodigoPackage.Literals.SEGUN__CASO, caso-1);
				}
			}
		}
	}

	@Check
	public void checkVariableNoRepetida(Inicio inicio) {
		//Preparamos las listas de los tipos de declaracion
		List<DeclaracionVariable> listaVariables = new ArrayList<DeclaracionVariable>();
		List<DeclaracionPropia> listaPropias = new ArrayList<DeclaracionPropia>();
		crearListasDeclaraciones(inicio, listaVariables, listaPropias);
		//Comprobamos si hay repeticiones en alguna de las combinaciones
		//1) Repeticiones entre variables de dos declaraciones distintas del mismo tipo
		for(DeclaracionVariable d1: listaVariables) {
			for(DeclaracionVariable d2: listaVariables) {
				/*
				if(d1.equals(d2)) {
					//Comprobamos si en el mismo hay repeticiones
					List<Variable> lv1 = d1.getVariable();
					List<Variable> lv2 = d2.getVariable();
					int elto = 0;
					for(Variable v1: lv1) {
						lv2.remove(elto); //Eliminamos el primero
						for(Variable v2: lv2) {
							if(v1.getNombre() == v2.getNombre()) {
								error("El nombre de la variable no puede estar repetido.", DiagramapseudocodigoPackage.Literals.INICIO__DECLARACION);
							}
						}
						elto++;
					}
				}
				else {
				*/
				
					variableRepetida(d1.getVariable(),d2.getVariable());
				/*
				}
				*/
			}
		}
		
	}
	
	private void crearListasDeclaraciones(Inicio inicio, List<DeclaracionVariable> lv, List<DeclaracionPropia> lp) {
		for(Declaracion d: inicio.getDeclaracion()) {
			if(d instanceof DeclaracionVariable) {
				lv.add((DeclaracionVariable) d); //Casting por problema con el código generado en el EMF
			}
			else {
				lp.add((DeclaracionPropia) d);
			}
		}
	}
	
	private void variableRepetida(List<Variable> lv1, List<Variable> lv2) {
		int repeticiones = 0;
		for(Variable v1: lv1) {
			for(Variable v2: lv2) {
				if(v1.getNombre() == v2.getNombre()) {
					System.out.println("El nombre de la variable v1 es: "+v1.getNombre());
					System.out.println("El nombre de la variable v2 es: "+v2.getNombre());
					repeticiones = repeticiones + 1;
					System.out.println("El numero de repeticiones es: "+repeticiones);
				}
			}
			if(repeticiones > 1) { //Hay otra más a parte de ella misma
				error("El nombre de la variable no puede estar repetido.", DiagramapseudocodigoPackage.Literals.INICIO__DECLARACION);
			}
		}
	}
	
	/*
	@Check
	public void checkSwitch(Codigo codigo) {
		for(Sentencias sent: codigo.getTiene().getTiene()) {
			if(sent instanceof segun) {
				//Si es un segun hacemos un casting y se lo pasamos a la función que se encargará de validarlo
				//Además le pasamos a la parte del código a la que corresponde este segun
				checkSwitchInter((segun)sent, codigo.getTiene());
				return;
			}
		}
	}
	
	@Check
	public void checkInicio(Codigo codigo) {
		if(codigo.getTiene() == null) {
			error("Todos los programas deben tener un \"inicio\".", DiagramapseudocodigoPackage.Literals.CODIGO__NOMBRE);
			return;
		}
	}
	
	private void checkSwitchInter(segun s, Inicio ini) {
		if(s.getValor() instanceof Caracter) {
			boolean esta = false;
			Caracter c = (Caracter)s.getValor();
			//Recorremos todas las variables que tiene declaradas el bloque
			for(Declaracion d: ini.getDeclaracion()) {
				if(d instanceof DeclaracionVariable) {
					DeclaracionVariable dv = (DeclaracionVariable)d;
					for(Variable var: dv.getTieneIDs()) {
						//Habría que añadir que el tipo fuera el mismo
						if(var.getNombre() == c.getContenido()) {
							esta = true;
							//Si hay una declarada que se llama así OK.
						}
					}
				}
			}
			if(!esta) { //Si no esta la variable declarada
				error("La variable utilizada como parámetro principal del segun_sea debe haber sido anteriormente declarada",DiagramapseudocodigoPackage.Literals.SEGUN__CASO);
				return;
			}
		}
	}
	
	*/

}
