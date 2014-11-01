package org.xtext.example.mydsl.validation;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.xtext.validation.Check;

import diagramapseudocodigo.*;

import org.xtext.example.mydsl.validation.MyDslJavaValidatorAux;
public class MyDslJavaValidator extends AbstractMyDslJavaValidator {
	private static MyDslJavaValidatorAux funciones = new MyDslJavaValidatorAux();

//	@Check
//	public void checkGreetingStartsWithCapital(Greeting greeting) {
//		if (!Character.isUpperCase(greeting.getName().charAt(0))) {
//			warning("Name should start with a capital", MyDslPackage.Literals.GREETING__NAME);
//		}
//	}
	
	public static final String INVALID_VAR_NAME = "xtext.workshop.advanced.quickfix.InvalidTypeName";
	
	
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
	//Función que se encarga de comprobar si el limite inferior y superior de un SubrangoEnumerado estan ordenados
	protected void checkSubrangoEnumerado(Codigo c) {
		ArrayList<String> enumerados = new ArrayList<String>();
		Map<String, ArrayList<String>> variablesEnumerados = new HashMap<String, ArrayList<String>>();
		
		for(TipoComplejo t: c.getTipocomplejo()) {
			if(t instanceof Enumerado) {
				Enumerado enumerado = (Enumerado) t;
				enumerados.add(enumerado.getNombre());
				variablesEnumerados.put(enumerado.getNombre(), new ArrayList<String>());
				for(valor v: enumerado.getValor()) {
					if(v instanceof Operador) {
						Operador op = (Operador) v;
						if(op instanceof VariableID) {
							VariableID var = (VariableID) op;
							variablesEnumerados.get(enumerado.getNombre()).add(var.getNombre());
						}
					}
				}
			}
		}
		
		for(TipoComplejo t: c.getTipocomplejo()) {
			if(t instanceof SubrangoEnumerado) {
				SubrangoEnumerado subrango = (SubrangoEnumerado) t;
				String limite_inf = subrango.getLimite_inf();
				String limite_sup = subrango.getLimite_sup();
				boolean loTiene = false;
				
				for(String nombreEnumerado: enumerados) {
					if(variablesEnumerados.get(nombreEnumerado).contains(limite_inf) && variablesEnumerados.get(nombreEnumerado).contains(limite_sup)) {
						loTiene = true;
						if(variablesEnumerados.get(nombreEnumerado).indexOf(limite_inf) > variablesEnumerados.get(nombreEnumerado).indexOf(limite_sup)) {
							error("El límite inferior del subrango no puede ser posterior en el enumerado de referencia que el límite superior", subrango, DiagramapseudocodigoPackage.Literals.SUBRANGO__NOMBRE);
						}
					}
				}
				if(loTiene == false) {
					error("Los límites inferior y superior del subrango deben pertenecer a un enumerado previamente definido", subrango, DiagramapseudocodigoPackage.Literals.SUBRANGO__NOMBRE);
				}
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
	//Función que se encarga de comprobar si la operación de la condición de la estructura "Si" es de tipo lógico
	protected void checkCondicionesSi(Si si) {
		if(si.getValor() instanceof  operacion) {
			operacion op = (operacion) si.getValor();
			List<signo> signos = funciones.registrarSignosOperacion(op);
			//Insertamos el primero también
			signos.add(op.getSigno_op());
			//Comprobamos que todos los signos sean de tipo lógico
			for(signo s: signos) {
				if(s.getName() == "sum" || s.getName() == "res" || s.getName() == "mult" || s.getName() == "div") {
					error("La expresión debe ser de tipo lógico", op, DiagramapseudocodigoPackage.Literals.OPERACION__SIGNO_OP);
				}
			}
		}
	}
	
	@Check
	//Función que se encarga de comprobar si la operación de la condición de la estructura "Mientras" es de tipo lógico
	protected void checkCondicionesMientras(mientras miMientras) {
		if(miMientras.getValor() instanceof  operacion) {
			operacion op = (operacion) miMientras.getValor();
			List<signo> signos = funciones.registrarSignosOperacion(op);
			//Insertamos el primero también
			signos.add(op.getSigno_op());
			//Comprobamos que todos los signos sean de tipo lógico
			for(signo s: signos) {
				if(s.getName() == "sum" || s.getName() == "res" || s.getName() == "mult" || s.getName() == "div") {
					error("La expresión debe ser de tipo lógico", op, DiagramapseudocodigoPackage.Literals.OPERACION__SIGNO_OP);
				}
			}
		}
	}
	
	@Check
	//Función que se encarga de comprobar si la operación de la condición de la estructura "Repetir" es de tipo lógico
	protected void checkCondicionesRepetir(repetir miRepetir) {
		if(miRepetir.getValor() instanceof  operacion) {
			operacion op = (operacion) miRepetir.getValor();
			List<signo> signos = funciones.registrarSignosOperacion(op);
			//Insertamos el primero también
			signos.add(op.getSigno_op());
			//Comprobamos que todos los signos sean de tipo lógico
			for(signo s: signos) {
				if(s.getName() == "sum" || s.getName() == "res" || s.getName() == "mult" || s.getName() == "div") {
					error("La expresión debe ser de tipo lógico", op, DiagramapseudocodigoPackage.Literals.OPERACION__SIGNO_OP);
				}
			}
		}
	}
	
	@Check
	//Función que se encarga de comprobar si un vector al que se accede a un campo es un vector de registro
	protected void checkValorVectorMatriz(Codigo c) {
		//Registramos todos los nombres de los registros existentes y registramos los vectores con sus respectivos tipos declarados
		List<String> nombresRegistros = new ArrayList<String>();
		Map<String,String> vectoresTipados = new HashMap<String,String>();
		List<String> nombresVectores = new ArrayList<String>();
		Map<String,String> matricesTipadas = new HashMap<String,String>();
		List<String> nombresMatrices = new ArrayList<String>();
		for(TipoComplejo t: c.getTipocomplejo()) {
			if(t instanceof Registro) {
				Registro r = (Registro) t;
				nombresRegistros.add(r.getNombre());
			}
			else if(t instanceof Vector) {
				Vector v = (Vector) t;
				vectoresTipados.put(v.getNombre(), funciones.getTipoComplejo(v.getTipo()));
				nombresVectores.add(v.getNombre());
			}
			else if(t instanceof Matriz) {
				Matriz m = (Matriz) t;
				matricesTipadas.put(m.getNombre(), funciones.getTipoComplejo(m.getTipo()));
				nombresMatrices.add(m.getNombre());
				
			}
		}
		
		//Despues comprobamos si todos los vectores que utilicen campos son de un tipo de registro
		//En el programa de inicio:
		
		Map<String,String> variablesTipadas = funciones.registrarVariablesTipadas(c.getTiene().getDeclaracion());
		
		checkValorVectorAux(nombresRegistros,c.getTiene().getTiene(), variablesTipadas, vectoresTipados, nombresVectores);
		checkValorMatrizAux(nombresRegistros,c.getTiene().getTiene(), variablesTipadas, matricesTipadas, nombresMatrices);
		
		for(Sentencias s: c.getTiene().getTiene()) {
			if(s instanceof Bloque) {
				Bloque bloque = (Bloque) s;
				if(bloque instanceof segun) {
					segun seg = (segun) bloque;
					for(Caso caso: seg.getCaso()) {
						checkValorVectorAux(nombresRegistros,caso.getSentencias(), variablesTipadas, vectoresTipados, nombresVectores);
						checkValorMatrizAux(nombresRegistros,caso.getSentencias(), variablesTipadas, matricesTipadas, nombresMatrices);

						
						for(Sentencias sentencias: caso.getSentencias()) {
							if(sentencias instanceof Bloque) {
								Bloque bloqueAux = (Bloque) sentencias;
								checkValorVectorAux(nombresRegistros,bloqueAux.getSentencias(), variablesTipadas, vectoresTipados, nombresVectores);
								checkValorMatrizAux(nombresRegistros,bloqueAux.getSentencias(), variablesTipadas, matricesTipadas, nombresMatrices);

							}
						}
					}
				}
				else {
					checkValorVectorAux(nombresRegistros,bloque.getSentencias(), variablesTipadas, vectoresTipados, nombresVectores);
					checkValorMatrizAux(nombresRegistros,bloque.getSentencias(), variablesTipadas, matricesTipadas, nombresMatrices);

					
					for(Sentencias sentencias: bloque.getSentencias()) {
						if(sentencias instanceof Bloque) {
							Bloque bloqueAux = (Bloque) sentencias;
							checkValorVectorAux(nombresRegistros,bloqueAux.getSentencias(), variablesTipadas, vectoresTipados, nombresVectores);
							checkValorMatrizAux(nombresRegistros,bloqueAux.getSentencias(), variablesTipadas, matricesTipadas, nombresMatrices);

						}
					}
				}
			}
		}
		
		//En los subprocesos:
		
		for(Subproceso sub: c.getFuncion()) {
			variablesTipadas = funciones.registrarVariablesTipadas(sub.getDeclaracion());
			checkValorVectorAux(nombresRegistros, sub.getSentencias(), variablesTipadas, vectoresTipados, nombresVectores);
			checkValorMatrizAux(nombresRegistros, sub.getSentencias(), variablesTipadas, matricesTipadas, nombresMatrices);
			
			for(Sentencias s: sub.getSentencias()) {
				if(s instanceof Bloque) {
					Bloque bloque = (Bloque) s;
					if(bloque instanceof segun) {
						segun seg = (segun) bloque;
						for(Caso caso: seg.getCaso()) {
							checkValorVectorAux(nombresRegistros,caso.getSentencias(), variablesTipadas, vectoresTipados, nombresVectores);
							checkValorMatrizAux(nombresRegistros,caso.getSentencias(), variablesTipadas, matricesTipadas, nombresMatrices);

							
							for(Sentencias sentencias: caso.getSentencias()) {
								if(sentencias instanceof Bloque) {
									Bloque bloqueAux = (Bloque) sentencias;
									checkValorVectorAux(nombresRegistros,bloqueAux.getSentencias(), variablesTipadas, vectoresTipados, nombresVectores);
									checkValorMatrizAux(nombresRegistros,bloqueAux.getSentencias(), variablesTipadas, matricesTipadas, nombresMatrices);

								}
							}
						}
					}
					else {
						checkValorVectorAux(nombresRegistros,bloque.getSentencias(), variablesTipadas, vectoresTipados, nombresVectores);
						checkValorMatrizAux(nombresRegistros,bloque.getSentencias(), variablesTipadas, matricesTipadas, nombresMatrices);

						
						for(Sentencias sentencias: bloque.getSentencias()) {
							if(sentencias instanceof Bloque) {
								Bloque bloqueAux = (Bloque) sentencias;
								checkValorVectorAux(nombresRegistros,bloqueAux.getSentencias(), variablesTipadas, vectoresTipados, nombresVectores);
								checkValorMatrizAux(nombresRegistros,bloqueAux.getSentencias(), variablesTipadas, matricesTipadas, nombresMatrices);

							}
						}
					}
				}
			}
			
		}	
	}
	
	private void checkValorVectorAux(List<String> nombresRegistros, List<Sentencias> sentencias, Map<String,String> variablesTipadas, Map<String,String> vectoresTipados, List<String> nombresVectores) {
		for(Sentencias s: sentencias) {
			if(s instanceof AsignacionNormal) {
				AsignacionNormal a = (AsignacionNormal) s;
				if(a.getOperador() instanceof ValorVector) {
					ValorVector v = (ValorVector) a.getOperador();
					if(!nombresVectores.contains(variablesTipadas.get(v.getNombre_vector()))) {
						error("La variable no pertenece al tipo vector", v, DiagramapseudocodigoPackage.Literals.VALOR_VECTOR__NOMBRE_VECTOR);
					}
					else if(v.getCampo().size() != 0 && !nombresRegistros.contains(vectoresTipados.get(variablesTipadas.get(v.getNombre_vector())))) {
						error("El vector no pertenece al tipo registro", v, DiagramapseudocodigoPackage.Literals.VALOR_VECTOR__NOMBRE_VECTOR);
					}
				}
				else if(a.getOperador() instanceof operacion) {
					operacion o = (operacion) a.getOperador();
					List<valor> valores = funciones.registrarValoresOperacion(o);
					for(valor val: valores) {
						if(val instanceof ValorVector) {
							ValorVector v = (ValorVector) val;
							if(!nombresVectores.contains(variablesTipadas.get(v.getNombre_vector()))) {
								error("La variable no pertenece al tipo vector", v, DiagramapseudocodigoPackage.Literals.VALOR_VECTOR__NOMBRE_VECTOR);
							}
							else if(v.getCampo().size() != 0 && !nombresRegistros.contains(vectoresTipados.get(variablesTipadas.get(v.getNombre_vector())))) {
								error("El vector no pertenece al tipo registro", v, DiagramapseudocodigoPackage.Literals.VALOR_VECTOR__NOMBRE_VECTOR);
							}
						}
						else if(val instanceof LlamadaFuncion) {
							LlamadaFuncion l = (LlamadaFuncion) val;
							for(valor valAux: l.getOperador()) {
								if(valAux instanceof Operador) {
									Operador op = (Operador) valAux;
									if(op instanceof ValorVector) {
										ValorVector v = (ValorVector) op;
										if(!nombresVectores.contains(variablesTipadas.get(v.getNombre_vector()))) {
											error("La variable no pertenece al tipo vector", v, DiagramapseudocodigoPackage.Literals.VALOR_VECTOR__NOMBRE_VECTOR);
										}
										else if(v.getCampo().size() != 0 && !nombresRegistros.contains(vectoresTipados.get(variablesTipadas.get(v.getNombre_vector())))) {
											error("El vector no pertenece al tipo registro", v, DiagramapseudocodigoPackage.Literals.VALOR_VECTOR__NOMBRE_VECTOR);
										}
									}
								}
							}
						}
					}
				}
				else if(a.getOperador() instanceof LlamadaFuncion) {
					LlamadaFuncion l = (LlamadaFuncion) a.getOperador();
					for(valor valAux: l.getOperador()) {
						if(valAux instanceof Operador) {
							Operador op = (Operador) valAux;
							if(op instanceof ValorVector) {
								ValorVector v = (ValorVector) op;
								if(!nombresVectores.contains(variablesTipadas.get(v.getNombre_vector()))) {
									error("La variable no pertenece al tipo vector", v, DiagramapseudocodigoPackage.Literals.VALOR_VECTOR__NOMBRE_VECTOR);
								}
								else if(v.getCampo().size() != 0 && !nombresRegistros.contains(vectoresTipados.get(variablesTipadas.get(v.getNombre_vector())))) {
									error("El vector no pertenece al tipo registro", v, DiagramapseudocodigoPackage.Literals.VALOR_VECTOR__NOMBRE_VECTOR);
								}
							}
						}
					}
				}
			}
			else if(s instanceof AsignacionCompleja) {
				AsignacionCompleja a = (AsignacionCompleja) s;
				if(a.getComplejo() instanceof ValorVector) {
					ValorVector v = (ValorVector) a.getComplejo();
					if(!nombresVectores.contains(variablesTipadas.get(v.getNombre_vector()))) {
						error("La variable no pertenece al tipo vector", v, DiagramapseudocodigoPackage.Literals.VALOR_VECTOR__NOMBRE_VECTOR);
					}
					else if(v.getCampo().size() != 0 && !nombresRegistros.contains(vectoresTipados.get(variablesTipadas.get(v.getNombre_vector())))) {
						error("El vector no pertenece al tipo registro", v, DiagramapseudocodigoPackage.Literals.VALOR_VECTOR__NOMBRE_VECTOR);
					}
				}
				if(a.getOperador() instanceof ValorVector) {
					ValorVector v = (ValorVector) a.getOperador();
					if(!nombresVectores.contains(variablesTipadas.get(v.getNombre_vector()))) {
						error("La variable no pertenece al tipo vector", v, DiagramapseudocodigoPackage.Literals.VALOR_VECTOR__NOMBRE_VECTOR);
					}
					else if(v.getCampo().size() != 0 && !nombresRegistros.contains(vectoresTipados.get(variablesTipadas.get(v.getNombre_vector())))) {
						error("El vector no pertenece al tipo registro", v, DiagramapseudocodigoPackage.Literals.VALOR_VECTOR__NOMBRE_VECTOR);
					}
				}
				else if(a.getOperador() instanceof operacion) {
					operacion o = (operacion) a.getOperador();
					List<valor> valores = funciones.registrarValoresOperacion(o);
					for(valor val: valores) {
						if(val instanceof ValorVector) {
							ValorVector v = (ValorVector) val;
							if(!nombresVectores.contains(variablesTipadas.get(v.getNombre_vector()))) {
								error("La variable no pertenece al tipo vector", v, DiagramapseudocodigoPackage.Literals.VALOR_VECTOR__NOMBRE_VECTOR);
							}
							else if(v.getCampo().size() != 0 && !nombresRegistros.contains(vectoresTipados.get(variablesTipadas.get(v.getNombre_vector())))) {
								error("El vector no pertenece al tipo registro", v, DiagramapseudocodigoPackage.Literals.VALOR_VECTOR__NOMBRE_VECTOR);
							}
						}
						else if(val instanceof LlamadaFuncion) {
							LlamadaFuncion l = (LlamadaFuncion) val;
							for(valor valAux: l.getOperador()) {
								if(valAux instanceof Operador) {
									Operador op = (Operador) valAux;
									if(op instanceof ValorVector) {
										ValorVector v = (ValorVector) op;
										if(!nombresVectores.contains(variablesTipadas.get(v.getNombre_vector()))) {
											error("La variable no pertenece al tipo vector", v, DiagramapseudocodigoPackage.Literals.VALOR_VECTOR__NOMBRE_VECTOR);
										}
										else if(v.getCampo().size() != 0 && !nombresRegistros.contains(vectoresTipados.get(variablesTipadas.get(v.getNombre_vector())))) {
											error("El vector no pertenece al tipo registro", v, DiagramapseudocodigoPackage.Literals.VALOR_VECTOR__NOMBRE_VECTOR);
										}
									}
								}
							}
						}
					}
				}
				else if(a.getOperador() instanceof LlamadaFuncion) {
					LlamadaFuncion l = (LlamadaFuncion) a.getOperador();
					for(valor valAux: l.getOperador()) {
						if(valAux instanceof Operador) {
							Operador op = (Operador) valAux;
							if(op instanceof ValorVector) {
								ValorVector v = (ValorVector) op;
								if(!nombresVectores.contains(variablesTipadas.get(v.getNombre_vector()))) {
									error("La variable no pertenece al tipo vector", v, DiagramapseudocodigoPackage.Literals.VALOR_VECTOR__NOMBRE_VECTOR);
								}
								else if(v.getCampo().size() != 0 && !nombresRegistros.contains(vectoresTipados.get(variablesTipadas.get(v.getNombre_vector())))) {
									error("El vector no pertenece al tipo registro", v, DiagramapseudocodigoPackage.Literals.VALOR_VECTOR__NOMBRE_VECTOR);
								}
							}
						}
					}
				}
			}
		}
	}
	
	
	private void checkValorMatrizAux(List<String> nombresRegistros, List<Sentencias> sentencias, Map<String,String> variablesTipadas, Map<String,String> matricesTipadas, List<String> nombresMatrices) {
		for(Sentencias s: sentencias) {
			if(s instanceof AsignacionNormal) {
				AsignacionNormal a = (AsignacionNormal) s;
				if(a.getOperador() instanceof ValorMatriz) {
					ValorMatriz m = (ValorMatriz) a.getOperador();
					if(!nombresMatrices.contains(variablesTipadas.get(m.getNombre_matriz()))) {
						error("La variable no pertenece al tipo matriz", m, DiagramapseudocodigoPackage.Literals.VALOR_MATRIZ__NOMBRE_MATRIZ);
					}
					else if(m.getCampo().size() != 0 && !nombresRegistros.contains(matricesTipadas.get(variablesTipadas.get(m.getNombre_matriz())))) {
						error("La matriz no pertenece al tipo registro", m, DiagramapseudocodigoPackage.Literals.VALOR_MATRIZ__NOMBRE_MATRIZ);
					}
				}
				else if(a.getOperador() instanceof operacion) {
					operacion o = (operacion) a.getOperador();
					List<valor> valores = funciones.registrarValoresOperacion(o);
					for(valor val: valores) {
						if(val instanceof ValorMatriz) {
							ValorMatriz m = (ValorMatriz) val;
							if(!nombresMatrices.contains(variablesTipadas.get(m.getNombre_matriz()))) {
								error("La variable no pertenece al tipo matriz", m, DiagramapseudocodigoPackage.Literals.VALOR_MATRIZ__NOMBRE_MATRIZ);
							}
							else if(m.getCampo().size() != 0 && !nombresRegistros.contains(matricesTipadas.get(variablesTipadas.get(m.getNombre_matriz())))) {
								error("La matriz no pertenece al tipo registro", m, DiagramapseudocodigoPackage.Literals.VALOR_MATRIZ__NOMBRE_MATRIZ);
							}
						}
						else if(val instanceof LlamadaFuncion) {
							LlamadaFuncion l = (LlamadaFuncion) val;
							for(valor valAux: l.getOperador()) {
								if(valAux instanceof Operador) {
									Operador op = (Operador) valAux;
									if(op instanceof ValorMatriz) {
										ValorMatriz m = (ValorMatriz) op;
										if(!nombresMatrices.contains(variablesTipadas.get(m.getNombre_matriz()))) {
											error("La variable no pertenece al tipo matriz", m, DiagramapseudocodigoPackage.Literals.VALOR_MATRIZ__NOMBRE_MATRIZ);
										}
										else if(m.getCampo().size() != 0 && !nombresRegistros.contains(matricesTipadas.get(variablesTipadas.get(m.getNombre_matriz())))) {
											error("La matriz no pertenece al tipo registro", m, DiagramapseudocodigoPackage.Literals.VALOR_MATRIZ__NOMBRE_MATRIZ);
										}
									}
								}
							}
						}
					}
				}
				else if(a.getOperador() instanceof LlamadaFuncion) {
					LlamadaFuncion l = (LlamadaFuncion) a.getOperador();
					for(valor valAux: l.getOperador()) {
						if(valAux instanceof Operador) {
							Operador op = (Operador) valAux;
							if(op instanceof ValorMatriz) {
								ValorMatriz m = (ValorMatriz) op;
								if(!nombresMatrices.contains(variablesTipadas.get(m.getNombre_matriz()))) {
									error("La variable no pertenece al tipo matriz", m, DiagramapseudocodigoPackage.Literals.VALOR_MATRIZ__NOMBRE_MATRIZ);
								}
								else if(m.getCampo().size() != 0 && !nombresRegistros.contains(matricesTipadas.get(variablesTipadas.get(m.getNombre_matriz())))) {
									error("La matriz no pertenece al tipo registro", m, DiagramapseudocodigoPackage.Literals.VALOR_MATRIZ__NOMBRE_MATRIZ);
								}
							}
						}
					}
				}
			}
			else if(s instanceof AsignacionCompleja) {
				AsignacionCompleja a = (AsignacionCompleja) s;
				if(a.getComplejo() instanceof ValorMatriz) {
					ValorMatriz m = (ValorMatriz) a.getComplejo();
					if(!nombresMatrices.contains(variablesTipadas.get(m.getNombre_matriz()))) {
						error("La variable no pertenece al tipo matriz", m, DiagramapseudocodigoPackage.Literals.VALOR_MATRIZ__NOMBRE_MATRIZ);
					}
					else if(m.getCampo().size() != 0 && !nombresRegistros.contains(matricesTipadas.get(variablesTipadas.get(m.getNombre_matriz())))) {
						error("La matriz no pertenece al tipo registro", m, DiagramapseudocodigoPackage.Literals.VALOR_MATRIZ__NOMBRE_MATRIZ);
					}
				}
				if(a.getOperador() instanceof ValorMatriz) {
					ValorMatriz m = (ValorMatriz) a.getOperador();
					if(!nombresMatrices.contains(variablesTipadas.get(m.getNombre_matriz()))) {
						error("La variable no pertenece al tipo matriz", m, DiagramapseudocodigoPackage.Literals.VALOR_MATRIZ__NOMBRE_MATRIZ);
					}
					else if(m.getCampo().size() != 0 && !nombresRegistros.contains(matricesTipadas.get(variablesTipadas.get(m.getNombre_matriz())))) {
						error("La matriz no pertenece al tipo registro", m, DiagramapseudocodigoPackage.Literals.VALOR_MATRIZ__NOMBRE_MATRIZ);
					}
				}
				else if(a.getOperador() instanceof operacion) {
					operacion o = (operacion) a.getOperador();
					List<valor> valores = funciones.registrarValoresOperacion(o);
					for(valor val: valores) {
						if(val instanceof ValorMatriz) {
							ValorMatriz m = (ValorMatriz) val;
							if(!nombresMatrices.contains(variablesTipadas.get(m.getNombre_matriz()))) {
								error("La variable no pertenece al tipo matriz", m, DiagramapseudocodigoPackage.Literals.VALOR_MATRIZ__NOMBRE_MATRIZ);
							}
							else if(m.getCampo().size() != 0 && !nombresRegistros.contains(matricesTipadas.get(variablesTipadas.get(m.getNombre_matriz())))) {
								error("La matriz no pertenece al tipo registro", m, DiagramapseudocodigoPackage.Literals.VALOR_MATRIZ__NOMBRE_MATRIZ);
							}
						}
						else if(val instanceof LlamadaFuncion) {
							LlamadaFuncion l = (LlamadaFuncion) val;
							for(valor valAux: l.getOperador()) {
								if(valAux instanceof Operador) {
									Operador op = (Operador) valAux;
									if(op instanceof ValorMatriz) {
										ValorMatriz m = (ValorMatriz) op;
										if(!nombresMatrices.contains(variablesTipadas.get(m.getNombre_matriz()))) {
											error("La variable no pertenece al tipo matriz", m, DiagramapseudocodigoPackage.Literals.VALOR_MATRIZ__NOMBRE_MATRIZ);
										}
										else if(m.getCampo().size() != 0 && !nombresRegistros.contains(matricesTipadas.get(variablesTipadas.get(m.getNombre_matriz())))) {
											error("La matriz no pertenece al tipo registro", m, DiagramapseudocodigoPackage.Literals.VALOR_MATRIZ__NOMBRE_MATRIZ);
										}
									}
								}
							}
						}
					}
				}
				else if(a.getOperador() instanceof LlamadaFuncion) {
					LlamadaFuncion l = (LlamadaFuncion) a.getOperador();
					for(valor valAux: l.getOperador()) {
						if(valAux instanceof Operador) {
							Operador op = (Operador) valAux;
							if(op instanceof ValorMatriz) {
								ValorMatriz m = (ValorMatriz) op;
								if(!nombresMatrices.contains(variablesTipadas.get(m.getNombre_matriz()))) {
									error("La variable no pertenece al tipo matriz", m, DiagramapseudocodigoPackage.Literals.VALOR_MATRIZ__NOMBRE_MATRIZ);
								}
								else if(m.getCampo().size() != 0 && !nombresRegistros.contains(matricesTipadas.get(variablesTipadas.get(m.getNombre_matriz())))) {
									error("La matriz no pertenece al tipo registro", m, DiagramapseudocodigoPackage.Literals.VALOR_MATRIZ__NOMBRE_MATRIZ);
								}
							}
						}
					}
				}
			}
		}
	}
	
	@Check
	//Función que se encarga de comprobar que no existan dos variables declaradas en un registro con el mismo nombre
	protected void checkRegistro(Registro r) {
		List<String> variables = new ArrayList<String>();
		for(Declaracion d: r.getVariable()) {
			if(d instanceof DeclaracionPropia) {
				DeclaracionPropia dec = (DeclaracionPropia) d;
				for(Variable v: dec.getVariable()) {
					//Si no esta repetida la registramos
					if(!variables.contains(v.getNombre())) {
						variables.add(v.getNombre());
					}
					//Si esta repetida lanzamos el error
					else {
						error("No se pueden declarar dos variables con el mismo nombre dentro de la declaración de un registro", DiagramapseudocodigoPackage.Literals.REGISTRO__VARIABLE, r.getVariable().indexOf(d));
					}
				}
			}
			else {
				DeclaracionVariable dec = (DeclaracionVariable) d;
				for(Variable v: dec.getVariable()) {
					//Si no esta repetida la registramos
					if(!variables.contains(v.getNombre())) {
						variables.add(v.getNombre());
					}
					//Si esta repetida lanzamos el error
					else {
						error("No se pueden declarar dos variables con el mismo nombre dentro de la declaración de un registro", DiagramapseudocodigoPackage.Literals.REGISTRO__VARIABLE, r.getVariable().indexOf(d));
					}
				}
			}
		}
	}
	
	private void checkFuncionesAbrirCerrarFicheroAux(List<Sentencias> sentencias, List<String> nombresFicheros, Map<String,String> variablesDeclaradas) {
		for(Sentencias s: sentencias) {
			if(s instanceof FuncionFicheroAbrir) {
				FuncionFicheroAbrir f = (FuncionFicheroAbrir) s;
				if(f.getVariable().get(0) instanceof VariableID) {
					VariableID v = (VariableID) f.getVariable().get(0);
					if(!nombresFicheros.contains(variablesDeclaradas.get(v.getNombre()))) {
						error("La variable debe pertenecer al tipo Archivo", f, DiagramapseudocodigoPackage.Literals.FUNCION_FICHERO_ABRIR__VARIABLE, 0);
					}
				}
			}
			else if(s instanceof FuncionFicheroCerrar) {
				FuncionFicheroCerrar f = (FuncionFicheroCerrar) s;
				if(f.getVariable() instanceof VariableID) {
					VariableID v = (VariableID) f.getVariable();
					if(!nombresFicheros.contains(variablesDeclaradas.get(v.getNombre()))) {
						error("La variable debe pertenecer al tipo Archivo", f, DiagramapseudocodigoPackage.Literals.FUNCION_FICHERO_CERRAR__VARIABLE);
					}
				}
			}
		}
	}
	
	@Check
	//Función que se encarga de comprobar si la variable que se le pasa a las funciones "abrir" y "cerrar" es de tipo fichero
	protected void checkFuncionesAbrirCerrarFichero(Codigo c) {
		List<String> nombresFicheros = new ArrayList<String>();
		for(TipoComplejo t: c.getTipocomplejo()) {
			if(t instanceof Archivo) {
				Archivo a = (Archivo) t;
				nombresFicheros.add(a.getNombre());
			}
		}
		
		Map<String,String> variablesDeclaradas = funciones.registrarVariablesTipadas(c.getTiene().getDeclaracion());
		
		//Para el programa de inicio
		checkFuncionesAbrirCerrarFicheroAux(c.getTiene().getTiene(), nombresFicheros, variablesDeclaradas);
		
		for(Sentencias s: c.getTiene().getTiene()) {
			if(s instanceof Bloque) {
				Bloque bloque = (Bloque) s;
				if(bloque instanceof segun) {
					segun seg = (segun) bloque;
					for(Caso caso: seg.getCaso()) {
						checkFuncionesAbrirCerrarFicheroAux(caso.getSentencias(), nombresFicheros, variablesDeclaradas);

						
						for(Sentencias sentencias: caso.getSentencias()) {
							if(sentencias instanceof Bloque) {
								Bloque bloqueAux = (Bloque) sentencias;
								checkFuncionesAbrirCerrarFicheroAux(bloqueAux.getSentencias(), nombresFicheros, variablesDeclaradas);

							}
						}
					}
				}
				else {
					checkFuncionesAbrirCerrarFicheroAux(bloque.getSentencias(), nombresFicheros, variablesDeclaradas);

					
					for(Sentencias sentencias: bloque.getSentencias()) {
						if(sentencias instanceof Bloque) {
							Bloque bloqueAux = (Bloque) sentencias;
							checkFuncionesAbrirCerrarFicheroAux(bloqueAux.getSentencias(), nombresFicheros, variablesDeclaradas);

						}
					}
				}
			}
		}
		
		//Para los subprocesos
		for(Subproceso sub: c.getFuncion()) {
			variablesDeclaradas = funciones.registrarVariablesTipadas(sub.getDeclaracion());
			checkFuncionesAbrirCerrarFicheroAux(sub.getSentencias(), nombresFicheros, variablesDeclaradas);
			
			for(Sentencias s: sub.getSentencias()) {
				if(s instanceof Bloque) {
					Bloque bloque = (Bloque) s;
					if(bloque instanceof segun) {
						segun seg = (segun) bloque;
						for(Caso caso: seg.getCaso()) {
							checkFuncionesAbrirCerrarFicheroAux(caso.getSentencias(), nombresFicheros, variablesDeclaradas);

							
							for(Sentencias sentencias: caso.getSentencias()) {
								if(sentencias instanceof Bloque) {
									Bloque bloqueAux = (Bloque) sentencias;
									checkFuncionesAbrirCerrarFicheroAux(bloqueAux.getSentencias(), nombresFicheros, variablesDeclaradas);

								}
							}
						}
					}
					else {
						checkFuncionesAbrirCerrarFicheroAux(bloque.getSentencias(), nombresFicheros, variablesDeclaradas);

						
						for(Sentencias sentencias: bloque.getSentencias()) {
							if(sentencias instanceof Bloque) {
								Bloque bloqueAux = (Bloque) sentencias;
								checkFuncionesAbrirCerrarFicheroAux(bloqueAux.getSentencias(), nombresFicheros, variablesDeclaradas);

							}
						}
					}
				}
			}
			
		}
	}
	
	private void checkFuncionAbrirAux(List<Sentencias> sentencias, Map<String,String> variablesDeclaradas) {
		for(Sentencias s: sentencias) {
			if(s instanceof FuncionFicheroAbrir) {
				FuncionFicheroAbrir f = (FuncionFicheroAbrir) s;
				if(f.getVariable().size() == 2 && f.getVariable().get(1) instanceof VariableID) {
					VariableID v = (VariableID) f.getVariable().get(1);
					if(variablesDeclaradas.get(v.getNombre()) != "cadena" && variablesDeclaradas.get(v.getNombre()) != "caracter") {
						error("La variable no es compatible, debe ser de tipo cadena o caracter", f, DiagramapseudocodigoPackage.Literals.FUNCION_FICHERO_ABRIR__VARIABLE, 1);
					}
				}
				else if(!(f.getVariable().get(1) instanceof ConstCadena) && !(f.getVariable().get(1) instanceof Caracter)) {
					error("La variable no es compatible, debe ser de tipo cadena o caracter", f, DiagramapseudocodigoPackage.Literals.FUNCION_FICHERO_ABRIR__VARIABLE, 1);
				}
			}
		}
	}
	
	@Check
	//Función que se encarga de comprobar si la segunda variable es de tipo cadena o caracter en la función "abrir"
	protected void checkFuncionAbrir(Codigo c) {
		Map<String,String> variablesDeclaradas = funciones.registrarVariablesTipadas(c.getTiene().getDeclaracion());
		
		//En el programa principal
		checkFuncionAbrirAux(c.getTiene().getTiene(), variablesDeclaradas);
		
		for(Subproceso s: c.getFuncion()) {
			variablesDeclaradas = funciones.registrarVariablesTipadas(s.getDeclaracion());
			checkFuncionAbrirAux(s.getSentencias(), variablesDeclaradas);
		}
	}
	
	@Check
	//Función que se encarga de comprobar que los tipos introducidos en los registros han sido definidos anteriormente
	protected void checkDeclaracionesRegistroTiposComplejos(Codigo c) {
		//Registramos los nombres de todos los tipos complejos suponiendo que no estan repetidos ya que hay otra función que lo comprueba
		List<String >tipos = funciones.registrarTipos(c.getTipocomplejo());
		
		//Comprobamos que todas las declaraciones de variables complejas en todos los registros son de tipos existentes
		
		for(TipoComplejo t: c.getTipocomplejo()) {
			if(t instanceof Registro) {
				Registro r = (Registro) t;
				for(Declaracion d: r.getVariable()) {
					if(d instanceof DeclaracionPropia) {
						//Solo nos interesa validar los tipos definidos por el usuario
						DeclaracionPropia dec = (DeclaracionPropia) d;
						if(!tipos.contains(dec.getTipo())) {
							error("El tipo de la variable debe estar previamente definido", dec, DiagramapseudocodigoPackage.Literals.DECLARACION_PROPIA__VARIABLE);
						}
					}
				}
			}
		}
	}
	
	@Check
	//Función que se encarga de comprobar si el tipo complejo asignado a un vector o a una matriz ha sido previamente definido
	protected void checkTipoDefinidoVectorMatriz(Codigo c) {
		//Registramos todos los nombres de los tipos complejos hasta ahora:
		List<String> tipos = funciones.registrarTipos(c.getTipocomplejo());
		
		//Comprobamos que todos los tipos asignados a los vectores o a las matrices en su declaración sean tipos existentes
		
		for(TipoComplejo t: c.getTipocomplejo()) {
			if(t instanceof Vector) {
				Vector v = (Vector) t;
				if(v.getTipo() instanceof TipoDefinido) {
					TipoDefinido tipo = (TipoDefinido) v.getTipo();
					if(!tipos.contains(tipo.getTipo())) {
						error("El tipo de la variable debe estar previamente definido", v, DiagramapseudocodigoPackage.Literals.VECTOR__TIPO);
					}
				}
			}
			else if(t instanceof Matriz) {
				Matriz m = (Matriz) t;
				if(m.getTipo() instanceof TipoDefinido) {
					TipoDefinido tipo = (TipoDefinido) m.getTipo();
					if(!tipos.contains(tipo.getTipo())) {
						error("El tipo de la variable debe estar previamente definido", m, DiagramapseudocodigoPackage.Literals.MATRIZ__TIPO);
					}
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
						error("No pueden existir dos variables con el mismo nombre dentro de la misma función o procedimiento", v,  DiagramapseudocodigoPackage.Literals.VARIABLE__NOMBRE);
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
						error("No pueden existir dos variables con el mismo nombre dentro de la misma función o procedimiento", v, DiagramapseudocodigoPackage.Literals.VARIABLE__NOMBRE);	
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
						error("No pueden existir dos variables con el mismo nombre dentro del mismo programa principal", v, DiagramapseudocodigoPackage.Literals.VARIABLE__NOMBRE);
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
						error("No pueden existir dos variables con el mismo nombre dentro del mismo programa principal", v,  DiagramapseudocodigoPackage.Literals.VARIABLE__NOMBRE);
					}
				}
			}
		}
	}
	
	
	@Check
	//Función que comprueba en el programa principal que la variable utilizada en el segun_sea haya sido declarada con anterioridad
	protected void checkSegun(Inicio i) {
		//Registramos todas las variables declaradas dando por hecho que son correctas ya que hay otra función encargada de comprobarlo
		List<String> variables = funciones.registrarVariables(i.getDeclaracion());
		//Despues de tener todas las variables declaradas comprobamos si la que se usa en el según esta entre ellas
		for(Sentencias s: i.getTiene()) {
			if(s instanceof segun) {
				segun se = (segun) s;
				if(se.getValor() instanceof Operador) {
					Operador op = (Operador) se.getValor();
					if(op instanceof VariableID) {
						VariableID v = (VariableID) op; //Siempre es una variable
						
						if(!variables.contains(v.getNombre())) {
							error("La variable utilizada como parámetro en el segun_sea debe haber sido previamente declarada", v, DiagramapseudocodigoPackage.Literals.VARIABLE_ID__NOMBRE);
						}
					}
				}
			}
		}
	}
	
	@Check
	//Función que comprueba en las funciones que la variable utilizada en el segun_sea haya sido declarada con anterioridad
	protected void checkSegun(Funcion f) {
		//Registramos todas las variables declaradas dando por hecho que son correctas ya que hay otra función encargada de comprobarlo
		List<String> variables = funciones.registrarVariables(f.getDeclaracion());
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
		List<String> variables = funciones.registrarVariables(p.getDeclaracion());
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
		List<String >tipos = funciones.registrarTipos(c.getTipocomplejo());
		
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
	
	private void checkVariablesUsadasAux(List<Sentencias> sentencias, List<String> variables) {
		for(Sentencias sen: sentencias) {
			if(sen instanceof LlamadaFuncion) {
				LlamadaFuncion f = (LlamadaFuncion) sen;
				for(valor val: f.getOperador()) {
					if(val instanceof Operador) {
						Operador o = (Operador) val;
						if(o instanceof VariableID) {
							VariableID v = (VariableID) o;
							if(!variables.contains(v.getNombre())) {
								error("La variable debe haber sido previamente definida", v, DiagramapseudocodigoPackage.Literals.VARIABLE_ID__NOMBRE);
							}
						}
					}
				}
			}
			else if(sen instanceof Leer) {
				Leer l = (Leer) sen;
				if(l.getVariable() instanceof VariableID) {
					VariableID v = (VariableID) l.getVariable();
					if(!variables.contains(v.getNombre())) {
						error("La variable debe haber sido previamente definida", v, DiagramapseudocodigoPackage.Literals.VARIABLE_ID__NOMBRE);
					}
				}
			}
			
			else if(sen instanceof Escribir) {
				Escribir e = (Escribir) sen;
				for(Operador o: e.getOperador()) {
					if(o instanceof VariableID) {
						VariableID v = (VariableID) o;
						if(!variables.contains(v.getNombre())) {
							error("La variable debe haber sido previamente definida", v, DiagramapseudocodigoPackage.Literals.VARIABLE_ID__NOMBRE);
						}
					}
				}
			}
			
			else if(sen instanceof incremento) {
				incremento ic = (incremento) sen;
				if(!variables.contains(ic.getNombre())) {
					error("La variable debe haber sido previamente definida", ic, DiagramapseudocodigoPackage.Literals.INCREMENTO__NOMBRE);
				}
			}
			
			else if(sen instanceof Asignacion) {
				Asignacion a = (Asignacion) sen;
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
					else if(as.getOperador() instanceof unaria) {
						unaria u = (unaria) as.getOperador();
						if(u.getVariable() instanceof VariableID) {
							VariableID v = (VariableID) u.getVariable();
							if(!variables.contains(v.getNombre())) {
								error("La variable debe haber sido previamente definida", v, DiagramapseudocodigoPackage.Literals.VARIABLE_ID__NOMBRE);
							}
						}
					}
					else if(as.getOperador() instanceof operacion) {
						operacion o = (operacion) as.getOperador();
						List<valor> valores = funciones.registrarValoresOperacion(o);
						
						List<ValorRegistro> variablesRegistroNoDeclaradas = funciones.variablesRegistroDeclaradas(valores, variables);
						if(variablesRegistroNoDeclaradas.size() != 0) {
							for(ValorRegistro vr: variablesRegistroNoDeclaradas) {
								error("La variable debe haber sido previamente definida", vr, DiagramapseudocodigoPackage.Literals.VALOR_REGISTRO__NOMBRE_REGISTRO);
							}
						}
						List<VariableID> variablesNoDeclaradas = funciones.variablesDeclaradas(valores, variables);
						if(variablesNoDeclaradas.size() != 0) {
							for(VariableID v: variablesNoDeclaradas) {
								error("La variable debe haber sido previamente definida", v, DiagramapseudocodigoPackage.Literals.VARIABLE_ID__NOMBRE);
							}
						}
						List<ValorVector> variablesVectorNoDeclaradas = funciones.variablesVectorDeclaradas(valores, variables);
						if(variablesVectorNoDeclaradas.size() != 0) {
							for(ValorVector v: variablesVectorNoDeclaradas) {
								error("La variable debe haber sido previamente definida", v, DiagramapseudocodigoPackage.Literals.VALOR_VECTOR__NOMBRE_VECTOR);
							}
						}
						List<ValorMatriz> variablesMatrizNoDeclaradas = funciones.variablesMatrizDeclaradas(valores, variables);
						if(variablesMatrizNoDeclaradas.size() != 0) {
							for(ValorMatriz m: variablesMatrizNoDeclaradas) {
								error("La variable debe haber sido previamente definida", m, DiagramapseudocodigoPackage.Literals.VALOR_MATRIZ__NOMBRE_MATRIZ);
							}
						}
						
						for(valor v: valores) {
							if(v instanceof ValorVector) {
								ValorVector vector = (ValorVector) v;
								if(vector.getIndice() instanceof VariableID) {
									VariableID var = (VariableID) vector.getIndice();
									if(!variables.contains(var.getNombre())) {
										error("La variable debe haber sido previamente definida", var, DiagramapseudocodigoPackage.Literals.VARIABLE_ID__NOMBRE);
									}
								}
							}
							else if(v instanceof ValorMatriz) {
								ValorMatriz m = (ValorMatriz) v;
								for(Operador op: m.getIndices()) {
									if(op instanceof VariableID) {
										VariableID var = (VariableID) op;
										if(!variables.contains(var.getNombre())) {
											error("La variable debe haber sido previamente definida", var, DiagramapseudocodigoPackage.Literals.VARIABLE_ID__NOMBRE);
										}
									}
								}
							}
							else if(v instanceof LlamadaFuncion) {
								LlamadaFuncion f = (LlamadaFuncion) v;
								for(valor val: f.getOperador()) {
									if(val instanceof Operador) {
										Operador op = (Operador) val;
										if(op instanceof VariableID) {
											VariableID var = (VariableID) op;
											if(!variables.contains(var.getNombre())) {
												error("La variable debe haber sido previamente definida", var, DiagramapseudocodigoPackage.Literals.VARIABLE_ID__NOMBRE);
											}
										}
										else if(op instanceof ValorVector) {
											ValorVector vector = (ValorVector) op;
											if(vector.getIndice() instanceof VariableID) {
												VariableID var = (VariableID) vector.getIndice();
												if(!variables.contains(var.getNombre())) {
													error("La variable debe haber sido previamente definida", var, DiagramapseudocodigoPackage.Literals.VARIABLE_ID__NOMBRE);
												}
											}
										}
										else if(op instanceof ValorMatriz) {
											ValorMatriz m = (ValorMatriz) op;
											for(Operador operador: m.getIndices()) {
												if(operador instanceof VariableID) {
													VariableID var = (VariableID) operador;
													if(!variables.contains(var.getNombre())) {
														error("La variable debe haber sido previamente definida", var, DiagramapseudocodigoPackage.Literals.VARIABLE_ID__NOMBRE);
													}
												}
											}
										}
									}	
								}
							}
						}
					}
					else if(as.getOperador() instanceof LlamadaFuncion) {
						LlamadaFuncion f = (LlamadaFuncion) as.getOperador();
						for(valor v: f.getOperador()) {
							if(v instanceof Operador) {
								Operador o = (Operador) v;
								if(o instanceof VariableID) {
									VariableID var = (VariableID) o;
									if(!variables.contains(var.getNombre())) {
										error("La variable debe haber sido previamente definida", var, DiagramapseudocodigoPackage.Literals.VARIABLE_ID__NOMBRE);
									}
								}
								else if(o instanceof ValorVector) {
									ValorVector vector = (ValorVector) o;
									if(vector.getIndice() instanceof VariableID) {
										VariableID var = (VariableID) vector.getIndice();
										if(!variables.contains(var.getNombre())) {
											error("La variable debe haber sido previamente definida", var, DiagramapseudocodigoPackage.Literals.VARIABLE_ID__NOMBRE);
										}
									}
								}
								else if(o instanceof ValorMatriz) {
									ValorMatriz m = (ValorMatriz) o;
									for(Operador op: m.getIndices()) {
										if(op instanceof VariableID) {
											VariableID var = (VariableID) op;
											if(!variables.contains(var.getNombre())) {
												error("La variable debe haber sido previamente definida", var, DiagramapseudocodigoPackage.Literals.VARIABLE_ID__NOMBRE);
											}
										}
									}
								}
							}
						}
					}
					else if(as.getOperador() instanceof ValorVector) {
						ValorVector v = (ValorVector) as.getOperador();
						if(v.getIndice() instanceof VariableID) {
							VariableID var = (VariableID) v.getIndice();
							if(!variables.contains(var.getNombre())) {
								error("La variable debe haber sido previamente definida", var, DiagramapseudocodigoPackage.Literals.VARIABLE_ID__NOMBRE);
							}
						}
					}
					else if(as.getOperador() instanceof ValorMatriz) {
						ValorMatriz m = (ValorMatriz) as.getOperador();
						for(Operador op: m.getIndices()) {
							if(op instanceof VariableID) {
								VariableID var = (VariableID) op;
								if(!variables.contains(var.getNombre())) {
									error("La variable debe haber sido previamente definida", var, DiagramapseudocodigoPackage.Literals.VARIABLE_ID__NOMBRE);
								}
							}
						}
					}
				}
				else if(a instanceof AsignacionCompleja) {
					AsignacionCompleja ac = (AsignacionCompleja) a;
					if(ac.getComplejo() instanceof ValorRegistro) {
						ValorRegistro r = (ValorRegistro) ac.getComplejo();
						if(!variables.contains(r.getNombre_registro())) {
							error("La variable debe haber sido previamente definida", r, DiagramapseudocodigoPackage.Literals.VALOR_REGISTRO__NOMBRE_REGISTRO);
						}
					}
					else if(ac.getComplejo() instanceof ValorVector) {
						ValorVector v = (ValorVector) ac.getComplejo();
						if(v.getIndice() instanceof VariableID) {
							VariableID var = (VariableID) v.getIndice();
							if(!variables.contains(var.getNombre())) {
								error("La variable debe haber sido previamente definida", var, DiagramapseudocodigoPackage.Literals.VARIABLE_ID__NOMBRE);
							}
						}
					}
					else if(ac.getOperador() instanceof ValorMatriz) {
						ValorMatriz m = (ValorMatriz) ac.getOperador();
						for(Operador op: m.getIndices()) {
							if(op instanceof VariableID) {
								VariableID var = (VariableID) op;
								if(!variables.contains(var.getNombre())) {
									error("La variable debe haber sido previamente definida", var, DiagramapseudocodigoPackage.Literals.VARIABLE_ID__NOMBRE);
								}
							}
						}
					}
					if(ac.getOperador() instanceof VariableID) {
						VariableID v = (VariableID) ac.getOperador();
						if(!variables.contains(v.getNombre())) {
							error("La variable debe haber sido previamente definida", v, DiagramapseudocodigoPackage.Literals.VARIABLE_ID__NOMBRE);
						}
					}
					else if(ac.getOperador() instanceof unaria) {
						unaria u = (unaria) ac.getOperador();
						if(u.getVariable() instanceof VariableID) {
							VariableID v = (VariableID) u.getVariable();
							if(!variables.contains(v.getNombre())) {
								error("La variable debe haber sido previamente definida", v, DiagramapseudocodigoPackage.Literals.VARIABLE_ID__NOMBRE);
							}
						}
					}
					else if(ac.getOperador() instanceof operacion) {
						operacion o = (operacion) ac.getOperador();
						List<valor> valores = funciones.registrarValoresOperacion(o);
						
						List<ValorRegistro> variablesRegistroNoDeclaradas = funciones.variablesRegistroDeclaradas(valores, variables);
						if(variablesRegistroNoDeclaradas.size() != 0) {
							for(ValorRegistro vr: variablesRegistroNoDeclaradas) {
								error("La variable debe haber sido previamente definida", vr, DiagramapseudocodigoPackage.Literals.VALOR_REGISTRO__NOMBRE_REGISTRO);
							}
						}
						List<VariableID> variablesNoDeclaradas = funciones.variablesDeclaradas(valores, variables);
						if(variablesNoDeclaradas.size() != 0) {
							for(VariableID v: variablesNoDeclaradas) {
								error("La variable debe haber sido previamente definida", v, DiagramapseudocodigoPackage.Literals.VARIABLE_ID__NOMBRE);
							}
						}
						List<ValorVector> variablesVectorNoDeclaradas = funciones.variablesVectorDeclaradas(valores, variables);
						if(variablesVectorNoDeclaradas.size() != 0) {
							for(ValorVector v: variablesVectorNoDeclaradas) {
								error("La variable debe haber sido previamente definida", v, DiagramapseudocodigoPackage.Literals.VALOR_VECTOR__NOMBRE_VECTOR);
							}
						}
						List<ValorMatriz> variablesMatrizNoDeclaradas = funciones.variablesMatrizDeclaradas(valores, variables);
						if(variablesMatrizNoDeclaradas.size() != 0) {
							for(ValorMatriz m: variablesMatrizNoDeclaradas) {
								error("La variable debe haber sido previamente definida", m, DiagramapseudocodigoPackage.Literals.VALOR_MATRIZ__NOMBRE_MATRIZ);
							}
						}
						
						for(valor v: valores) {
							if(v instanceof ValorVector) {
								ValorVector vector = (ValorVector) v;
								if(vector.getIndice() instanceof VariableID) {
									VariableID var = (VariableID) vector.getIndice();
									if(!variables.contains(var.getNombre())) {
										error("La variable debe haber sido previamente definida", var, DiagramapseudocodigoPackage.Literals.VARIABLE_ID__NOMBRE);
									}
								}
							}
							else if(v instanceof ValorMatriz) {
								ValorMatriz m = (ValorMatriz) v;
								for(Operador op: m.getIndices()) {
									if(op instanceof VariableID) {
										VariableID var = (VariableID) op;
										if(!variables.contains(var.getNombre())) {
											error("La variable debe haber sido previamente definida", var, DiagramapseudocodigoPackage.Literals.VARIABLE_ID__NOMBRE);
										}
									}
								}
							}
							else if(v instanceof LlamadaFuncion) {
								LlamadaFuncion f = (LlamadaFuncion) v;
								for(valor val: f.getOperador()) {
									if(val instanceof Operador) {
										Operador op = (Operador) val;
										if(op instanceof VariableID) {
											VariableID var = (VariableID) op;
											if(!variables.contains(var.getNombre())) {
												error("La variable debe haber sido previamente definida", var, DiagramapseudocodigoPackage.Literals.VARIABLE_ID__NOMBRE);
											}
										}
										else if(op instanceof ValorVector) {
											ValorVector vector = (ValorVector) op;
											if(vector.getIndice() instanceof VariableID) {
												VariableID var = (VariableID) vector.getIndice();
												if(!variables.contains(var.getNombre())) {
													error("La variable debe haber sido previamente definida", var, DiagramapseudocodigoPackage.Literals.VARIABLE_ID__NOMBRE);
												}
											}
										}
										else if(op instanceof ValorMatriz) {
											ValorMatriz m = (ValorMatriz) op;
											for(Operador operador: m.getIndices()) {
												if(operador instanceof VariableID) {
													VariableID var = (VariableID) operador;
													if(!variables.contains(var.getNombre())) {
														error("La variable debe haber sido previamente definida", var, DiagramapseudocodigoPackage.Literals.VARIABLE_ID__NOMBRE);
													}
												}
											}
										}
									}	
								}
							}
						}
					}
					else if(ac.getOperador() instanceof LlamadaFuncion) {
						LlamadaFuncion f = (LlamadaFuncion) ac.getOperador();
						for(valor v: f.getOperador()) {
							if(v instanceof Operador) {
								Operador o = (Operador) v;
								if(o instanceof VariableID) {
									VariableID var = (VariableID) o;
									if(!variables.contains(var.getNombre())) {
										error("La variable debe haber sido previamente definida", var, DiagramapseudocodigoPackage.Literals.VARIABLE_ID__NOMBRE);
									}
								}
								else if(o instanceof ValorVector) {
									ValorVector vector = (ValorVector) o;
									if(vector.getIndice() instanceof VariableID) {
										VariableID var = (VariableID) vector.getIndice();
										if(!variables.contains(var.getNombre())) {
											error("La variable debe haber sido previamente definida", var, DiagramapseudocodigoPackage.Literals.VARIABLE_ID__NOMBRE);
										}
									}
								}
								else if(o instanceof ValorMatriz) {
									ValorMatriz m = (ValorMatriz) o;
									for(Operador op: m.getIndices()) {
										if(op instanceof VariableID) {
											VariableID var = (VariableID) op;
											if(!variables.contains(var.getNombre())) {
												error("La variable debe haber sido previamente definida", var, DiagramapseudocodigoPackage.Literals.VARIABLE_ID__NOMBRE);
											}
										}
									}
								}
							}	
						}
					}
					else if(ac.getOperador() instanceof ValorVector) {
						ValorVector v = (ValorVector) ac.getOperador();
						if(v.getIndice() instanceof VariableID) {
							VariableID var = (VariableID) v.getIndice();
							if(!variables.contains(var.getNombre())) {
								error("La variable debe haber sido previamente definida", var, DiagramapseudocodigoPackage.Literals.VARIABLE_ID__NOMBRE);
							}
						}
					}
					else if(ac.getOperador() instanceof ValorMatriz) {
						ValorMatriz m = (ValorMatriz) ac.getOperador();
						for(Operador op: m.getIndices()) {
							if(op instanceof VariableID) {
								VariableID var = (VariableID) op;
								if(!variables.contains(var.getNombre())) {
									error("La variable debe haber sido previamente definida", var, DiagramapseudocodigoPackage.Literals.VARIABLE_ID__NOMBRE);
								}
							}
						}
					}
				}
			}
		}
	}
	
	@Check
	//Función que comprueba que una variable deba estar definida antes de usarse
	protected void checkVariablesUsadas(Inicio i) {
		List<String> variables = funciones.registrarVariables(i.getDeclaracion());
		
		checkVariablesUsadasAux(i.getTiene(), variables);
		
		//Ahora vamos a comprobar las sentencias que están en los bloques
		
		for(Sentencias s: i.getTiene()) {
			if(s instanceof Bloque) {
				Bloque bloque = (Bloque) s;
				if(bloque instanceof segun) {
					segun seg = (segun) bloque;
					for(Caso c: seg.getCaso()) {
						checkVariablesUsadasAux(c.getSentencias(), variables);
						
						for(Sentencias sentencias: c.getSentencias()) {
							if(sentencias instanceof Bloque) {
								Bloque bloqueAux = (Bloque) sentencias;
								checkVariablesUsadasAux(bloqueAux.getSentencias(), variables);
							}
						}
					}
				}
				else {
					checkVariablesUsadasAux(bloque.getSentencias(), variables);
					
					for(Sentencias sentencias: bloque.getSentencias()) {
						if(sentencias instanceof Bloque) {
							Bloque bloqueAux = (Bloque) sentencias;
							checkVariablesUsadasAux(bloqueAux.getSentencias(), variables);
						}
					}
				}
			}
		}
	}
	
	@Check
	//Función que comprueba que una variable deba estar definida antes de usarse
	protected void checkVariablesUsadas(Subproceso s) {
		List<String> variables = funciones.registrarVariables(s.getDeclaracion());
		
		//Como son subprocesos también se añaden a la lista los parámetros
		for(ParametroFuncion p: s.getParametrofuncion()) {
			variables.add(p.getVariable().getNombre());
		}
		
		checkVariablesUsadasAux(s.getSentencias(), variables);
		
		//Ahora vamos a comprobar las sentencias que están en los bloques
		
		for(Sentencias sentencias: s.getSentencias()) {
			if(s instanceof Bloque) {
				Bloque bloque = (Bloque) sentencias;
				if(bloque instanceof segun) {
					segun seg = (segun) bloque;
					for(Caso c: seg.getCaso()) {
						checkVariablesUsadasAux(c.getSentencias(), variables);
						
						for(Sentencias sen: c.getSentencias()) {
							if(sen instanceof Bloque) {
								Bloque bloqueAux = (Bloque) sen;
								checkVariablesUsadasAux(bloqueAux.getSentencias(), variables);
							}
						}
					}
				}
				else {
					checkVariablesUsadasAux(bloque.getSentencias(), variables);
					
					for(Sentencias sen: bloque.getSentencias()) {
						if(sen instanceof Bloque) {
							Bloque bloqueAux = (Bloque) sen;
							checkVariablesUsadasAux(bloqueAux.getSentencias(), variables);
						}
					}
				}
			}
		}
	}
	
	private void checkLlamadaFuncionAux(List<Sentencias> sentencias, List<String> funciones, List<ArrayList<Integer>> parametros) {
		for(Sentencias s: sentencias) {
			if(s instanceof LlamadaFuncion) {
				LlamadaFuncion l = (LlamadaFuncion) s;
				if(!funciones.contains(l.getNombre())) {
					error("La función debe haber sido previamente declarada", l, DiagramapseudocodigoPackage.Literals.LLAMADA_FUNCION__NOMBRE);
				}
				else if(!parametros.get(funciones.indexOf(l.getNombre())).contains(l.getOperador().size())) {
					error("El número de parámetros de la función no es el esperado", l, DiagramapseudocodigoPackage.Literals.LLAMADA_FUNCION__NOMBRE);
				}
			}
			else if(s instanceof Asignacion) {
				Asignacion a = (Asignacion) s;
				if(a instanceof AsignacionNormal) {
					AsignacionNormal an = (AsignacionNormal) a;
					if(an.getOperador() instanceof LlamadaFuncion) {
						LlamadaFuncion f = (LlamadaFuncion) an.getOperador();
						if(!funciones.contains(f.getNombre())) {
							error("La función debe haber sido previamente declarada", f, DiagramapseudocodigoPackage.Literals.LLAMADA_FUNCION__NOMBRE);
						}
						else if(!parametros.get(funciones.indexOf(f.getNombre())).contains(f.getOperador().size())) {
							error("El número de parámetros de la función no es el esperado", f, DiagramapseudocodigoPackage.Literals.LLAMADA_FUNCION__NOMBRE);
						}
					}
				}
			}
		}
	}
	
	@Check
	//Función que comprueba que las funciones que se llamen hayan sido declaradas previamente y se les pase el número de parámetros oportuno
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
		
		checkLlamadaFuncionAux(c.getTiene().getTiene(), funciones, parametros);
		
		for(Sentencias s: c.getTiene().getTiene()) {
			if(s instanceof Bloque) {
				Bloque bloque = (Bloque) s;
				if(bloque instanceof segun) {
					segun seg = (segun) bloque;
					for(Caso caso: seg.getCaso()) {
						checkLlamadaFuncionAux(caso.getSentencias(), funciones, parametros);
						
						for(Sentencias sentencias: caso.getSentencias()) {
							if(sentencias instanceof Bloque) {
								Bloque bloqueAux = (Bloque) sentencias;
								checkLlamadaFuncionAux(bloqueAux.getSentencias(), funciones, parametros);
							}
						}
					}
				}
				else {
					checkLlamadaFuncionAux(bloque.getSentencias(), funciones, parametros);
					
					for(Sentencias sentencias: bloque.getSentencias()) {
						if(sentencias instanceof Bloque) {
							Bloque bloqueAux = (Bloque) sentencias;
							checkLlamadaFuncionAux(bloqueAux.getSentencias(), funciones, parametros);
						}
					}
				}
			}
		}
		
		for(Subproceso sub: c.getFuncion()) {
			checkLlamadaFuncionAux(sub.getSentencias(), funciones, parametros);
			
			for(Sentencias s: sub.getSentencias()) {
				if(s instanceof Bloque) {
					Bloque bloque = (Bloque) s;
					if(bloque instanceof segun) {
						segun seg = (segun) bloque;
						for(Caso caso: seg.getCaso()) {
							checkLlamadaFuncionAux(caso.getSentencias(), funciones, parametros);
							
							for(Sentencias sentencias: caso.getSentencias()) {
								if(sentencias instanceof Bloque) {
									Bloque bloqueAux = (Bloque) sentencias;
									checkLlamadaFuncionAux(bloqueAux.getSentencias(), funciones, parametros);
								}
							}
						}
					}
					else {
						checkLlamadaFuncionAux(bloque.getSentencias(), funciones, parametros);
						
						for(Sentencias sentencias: bloque.getSentencias()) {
							if(sentencias instanceof Bloque) {
								Bloque bloqueAux = (Bloque) sentencias;
								checkLlamadaFuncionAux(bloqueAux.getSentencias(), funciones, parametros);
							}
						}
					}
				}
			}
			
		}
	}
	
	//Función auxiliar para cumplir el principio DRY
	private void checkParametrosLlamadaAux(List<Sentencias> sentencias, List<String> tipos, String nombre, int parametros, Map<String,String> variablesDeclaradas, Map<String,String> tiposVectoresMatrices, Map<String,HashMap<String,String>> tiposRegistros) {
		for(Sentencias sen: sentencias) {
			if(sen instanceof LlamadaFuncion) {
				LlamadaFuncion f = (LlamadaFuncion) sen;
				if(f.getNombre().equals(nombre) && f.getOperador().size() == parametros) {
					List<String> nombresVariables = new ArrayList<String>();
					Map<String,String> nombresVariablesCampos = new HashMap<String,String>();
					List<String> tiposNativos = new ArrayList<String>();
					funciones.registrarParametros(f.getOperador(), nombresVariables, nombresVariablesCampos, tiposNativos, variablesDeclaradas, tiposVectoresMatrices, tiposRegistros);
					String salidaBuena = funciones.getCadenaTiposCorrectos(tipos);
					String salidaMala = funciones.getCadenaTiposIncorrectos(nombresVariables, variablesDeclaradas, tiposVectoresMatrices, tiposRegistros, nombresVariablesCampos, tiposNativos);
					//!funciones.comprobarCorreccionTiposLlamada(nombresVariables, variablesDeclaradas, tipos)
					if(!salidaBuena.equals(salidaMala)) {
						error("Los tipos de las variables no coinciden con los de la declaración de la cabecera de la función: " +nombre+"("+salidaMala+") "+ "en lugar de " +nombre+"("+salidaBuena+")", f, DiagramapseudocodigoPackage.Literals.LLAMADA_FUNCION__NOMBRE);
					}
				}
			}
			else if(sen instanceof Asignacion) {
				Asignacion a = (Asignacion) sen;
				if(a instanceof AsignacionNormal) {
					AsignacionNormal an = (AsignacionNormal) a;
					if(an.getOperador() instanceof LlamadaFuncion) {
						LlamadaFuncion f = (LlamadaFuncion) a.getOperador();
						if(f.getNombre().equals(nombre) && f.getOperador().size() == parametros) {
							List<String> nombresVariables = new ArrayList<String>();
							Map<String,String> nombresVariablesCampos = new HashMap<String,String>();
							List<String> tiposNativos = new ArrayList<String>();
							funciones.registrarParametros(f.getOperador(), nombresVariables, nombresVariablesCampos, tiposNativos, variablesDeclaradas, tiposVectoresMatrices, tiposRegistros);
							String salidaBuena = funciones.getCadenaTiposCorrectos(tipos);
							String salidaMala = funciones.getCadenaTiposIncorrectos(nombresVariables, variablesDeclaradas, tiposVectoresMatrices, tiposRegistros, nombresVariablesCampos, tiposNativos);
							if(!salidaBuena.equals(salidaMala)) {
								error("Los tipos de las variables no coinciden con los de la declaración de la cabecera de la función: " +nombre+"("+salidaMala+") "+ "en lugar de " +nombre+"("+salidaBuena+")", f, DiagramapseudocodigoPackage.Literals.LLAMADA_FUNCION__NOMBRE);
							}
						}
					}
					else if(an.getOperador() instanceof operacion) {
						operacion o = (operacion) an.getOperador();
						List<valor> valores = funciones.registrarValoresOperacion(o);
						for(valor v: valores) {
							if(v instanceof LlamadaFuncion) {
								LlamadaFuncion f = (LlamadaFuncion) v;
								if(f.getNombre().equals(nombre) && f.getOperador().size() == parametros) {
									List<String> nombresVariables = new ArrayList<String>();
									Map<String,String> nombresVariablesCampos = new HashMap<String,String>();
									List<String> tiposNativos = new ArrayList<String>();
									funciones.registrarParametros(f.getOperador(), nombresVariables, nombresVariablesCampos, tiposNativos, variablesDeclaradas, tiposVectoresMatrices, tiposRegistros);
									String salidaBuena = funciones.getCadenaTiposCorrectos(tipos);
									String salidaMala = funciones.getCadenaTiposIncorrectos(nombresVariables, variablesDeclaradas, tiposVectoresMatrices, tiposRegistros, nombresVariablesCampos, tiposNativos);
									if(!salidaBuena.equals(salidaMala)) {
										error("Los tipos de las variables no coinciden con los de la declaración de la cabecera de la función: " +nombre+"("+salidaMala+") "+ "en lugar de " +nombre+"("+salidaBuena+")", f, DiagramapseudocodigoPackage.Literals.LLAMADA_FUNCION__NOMBRE);
									}
								}
							}
						}
					}
				}
				else if(a instanceof AsignacionCompleja) {
					AsignacionCompleja ac = (AsignacionCompleja) a;
					if(ac.getOperador() instanceof LlamadaFuncion) {
						LlamadaFuncion f = (LlamadaFuncion) a.getOperador();
						if(f.getNombre().equals(nombre) && f.getOperador().size() == parametros) {
							List<String> nombresVariables = new ArrayList<String>();
							Map<String,String> nombresVariablesCampos = new HashMap<String,String>();
							List<String> tiposNativos = new ArrayList<String>();
							funciones.registrarParametros(f.getOperador(), nombresVariables, nombresVariablesCampos, tiposNativos, variablesDeclaradas, tiposVectoresMatrices, tiposRegistros);
							String salidaBuena = funciones.getCadenaTiposCorrectos(tipos);
							String salidaMala = funciones.getCadenaTiposIncorrectos(nombresVariables, variablesDeclaradas, tiposVectoresMatrices, tiposRegistros, nombresVariablesCampos, tiposNativos);
							if(!salidaBuena.equals(salidaMala)) {
								error("Los tipos de las variables no coinciden con los de la declaración de la cabecera de la función: " +nombre+"("+salidaMala+") "+ "en lugar de " +nombre+"("+salidaBuena+")", f, DiagramapseudocodigoPackage.Literals.LLAMADA_FUNCION__NOMBRE);
							}
						}
					}
					else if(ac.getOperador() instanceof operacion) {
						operacion o = (operacion) ac.getOperador();
						List<valor> valores = funciones.registrarValoresOperacion(o);
						for(valor v: valores) {
							if(v instanceof LlamadaFuncion) {
								LlamadaFuncion f = (LlamadaFuncion) v;
								if(f.getNombre().equals(nombre) && f.getOperador().size() == parametros) {
									List<String> nombresVariables = new ArrayList<String>();
									Map<String,String> nombresVariablesCampos = new HashMap<String,String>();
									List<String> tiposNativos = new ArrayList<String>();
									funciones.registrarParametros(f.getOperador(), nombresVariables, nombresVariablesCampos, tiposNativos, variablesDeclaradas, tiposVectoresMatrices, tiposRegistros);
									String salidaBuena = funciones.getCadenaTiposCorrectos(tipos);
									String salidaMala = funciones.getCadenaTiposIncorrectos(nombresVariables, variablesDeclaradas, tiposVectoresMatrices, tiposRegistros, nombresVariablesCampos, tiposNativos);
									if(!salidaBuena.equals(salidaMala)) {
										error("Los tipos de las variables no coinciden con los de la declaración de la cabecera de la función: " +nombre+"("+salidaMala+") "+ "en lugar de " +nombre+"("+salidaBuena+")", f, DiagramapseudocodigoPackage.Literals.LLAMADA_FUNCION__NOMBRE);
									}
								}
							}
						}
					}
				}
			}
		}
	}
	
	@Check
	//Función que comprueba que las funciones que se llaman dentro del programa principal se llamen con parámetros del tipo adecuado
	protected void checkParametrosLlamadaInicio(Codigo c) {
		//Recogemos los tipos nativos de los tipos complejos
		Map<String,String> tiposVectoresMatrices = funciones.registrarTiposNativosdeComplejos(c.getTipocomplejo());
		//Recogemos los tipos nativos de los registros	
		Map<String,HashMap<String,String>> tiposRegistros = funciones.registrarTiposNativosRegistros(c.getTipocomplejo());
		
		for(Subproceso sub: c.getFuncion()) {
			List<String> tipos = funciones.getTiposCabecera(sub.getParametrofuncion());
			String nombre = sub.getNombre();
			int parametros = sub.getParametrofuncion().size();
			//Registramos todas las variables que hay declaradas con sus respectivos tipos para buscar luego las necesarias (no hay repetidas)
			Map<String,String> variablesDeclaradas = funciones.registrarVariablesTipadas(c.getTiene().getDeclaracion());
			
			checkParametrosLlamadaAux(c.getTiene().getTiene(),tipos,nombre,parametros,variablesDeclaradas, tiposVectoresMatrices, tiposRegistros);
			
			for(Sentencias s: c.getTiene().getTiene()) {
				if(s instanceof Bloque) {
					Bloque bloque = (Bloque) s;
					if(bloque instanceof segun) {
						segun seg = (segun) bloque;
						for(Caso caso: seg.getCaso()) {
							checkParametrosLlamadaAux(caso.getSentencias(),tipos,nombre,parametros,variablesDeclaradas, tiposVectoresMatrices, tiposRegistros);

							
							for(Sentencias sentencias: caso.getSentencias()) {
								if(sentencias instanceof Bloque) {
									Bloque bloqueAux = (Bloque) sentencias;
									checkParametrosLlamadaAux(bloqueAux.getSentencias(),tipos,nombre,parametros,variablesDeclaradas, tiposVectoresMatrices, tiposRegistros);

								}
							}
						}
					}
					else {
						checkParametrosLlamadaAux(bloque.getSentencias(),tipos,nombre,parametros,variablesDeclaradas, tiposVectoresMatrices, tiposRegistros);
						
						for(Sentencias sentencias: bloque.getSentencias()) {
							if(sentencias instanceof Bloque) {
								Bloque bloqueAux = (Bloque) sentencias;
								checkParametrosLlamadaAux(bloqueAux.getSentencias(),tipos,nombre,parametros,variablesDeclaradas, tiposVectoresMatrices, tiposRegistros);

							}
						}
					}
				}
			}
		}
	}
	
	
	@Check
	//Función que comprueba que las funciones que se llaman dentro de los subprocesos se llamen con parámetros del tipo adecuado
	protected void checkParametrosLlamadaSubproceso(Codigo c) {
		//Recogemos los tipos nativos de los tipos complejos
		Map<String,String> tiposVectoresMatrices = funciones.registrarTiposNativosdeComplejos(c.getTipocomplejo());
		//Recogemos los tipos nativos de los registros	
		Map<String,HashMap<String,String>> tiposRegistros = funciones.registrarTiposNativosRegistros(c.getTipocomplejo());
		
		//Registramos los tipos de parámetros necesarios para todos los subprocesos
		for(Subproceso sub: c.getFuncion()) {
			List<String> tipos = funciones.getTiposCabecera(sub.getParametrofuncion());
			String nombre = sub.getNombre();
			int parametros = sub.getParametrofuncion().size();
			
			for(Subproceso sub2: c.getFuncion()) {
				//Registramos todas las variables que hay declaradas con sus respectivos tipos para buscar luego las necesarias (no hay repetidas)
				Map<String,String> variablesDeclaradas = funciones.registrarVariablesTipadas(sub2.getDeclaracion());
				//Como estamos en el caso de los subprocesos debemos registrar los parámetros también
				funciones.getTiposCabecera(sub2.getParametrofuncion(), variablesDeclaradas);
				
				checkParametrosLlamadaAux(sub2.getSentencias(),tipos,nombre,parametros,variablesDeclaradas, tiposVectoresMatrices, tiposRegistros);
				
				for(Sentencias s: sub2.getSentencias()) {
					if(s instanceof Bloque) {
						Bloque bloque = (Bloque) s;
						if(bloque instanceof segun) {
							segun seg = (segun) bloque;
							for(Caso caso: seg.getCaso()) {
								checkParametrosLlamadaAux(caso.getSentencias(),tipos,nombre,parametros,variablesDeclaradas, tiposVectoresMatrices, tiposRegistros);

								
								for(Sentencias sentencias: caso.getSentencias()) {
									if(sentencias instanceof Bloque) {
										Bloque bloqueAux = (Bloque) sentencias;
										checkParametrosLlamadaAux(bloqueAux.getSentencias(),tipos,nombre,parametros,variablesDeclaradas, tiposVectoresMatrices, tiposRegistros);

									}
								}
							}
						}
						else {
							checkParametrosLlamadaAux(bloque.getSentencias(),tipos,nombre,parametros,variablesDeclaradas, tiposVectoresMatrices, tiposRegistros);
							
							for(Sentencias sentencias: bloque.getSentencias()) {
								if(sentencias instanceof Bloque) {
									Bloque bloqueAux = (Bloque) sentencias;
									checkParametrosLlamadaAux(bloqueAux.getSentencias(),tipos,nombre,parametros,variablesDeclaradas, tiposVectoresMatrices, tiposRegistros);

								}
							}
						}
					}
				}
				
			}
		}
	}
	
	
	@Check
	//Función que comprueba que el tipo de devolución de una función sea compatible o igual al tipo realmente devuelto
	protected void checkTipoDevolucionFuncion(Subproceso s) {
		if(s instanceof Funcion) {
			Funcion f = (Funcion) s;
			String tipoDevuelve = f.getTipo().getName();
			if(f.getDevuelve().getDevuelve() instanceof VariableID) {
				VariableID v = (VariableID) f.getDevuelve().getDevuelve();
				String nombreVar = v.getNombre();
				//Buscamos las variables en las declaraciones y en los parametros para averiguar de que tipo es
				Map<String,String> variables = funciones.registrarVariablesTipadas(f.getDeclaracion());
				//Registramos los parámetros
				funciones.getTiposCabecera(f.getParametrofuncion(), variables);
				
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
	
	@Check
	//Función que comprueba que un campo utilizado de un registro pertenezca realmente a ese tipo de registro
	protected void checkVariablesRegistroInicio(Codigo c) {
		//Preparamos todos los campos clasificados por el nombre del registro (utilizado como identificador)
		Map<String,List<String>> registros = new HashMap<String,List<String>>();
		for(TipoComplejo t: c.getTipocomplejo()) {
			if(t instanceof Registro) {
				Registro r = (Registro) t;
				registros.put(r.getNombre(), funciones.registrarCamposRegistroSinTipo(r.getVariable()));
			}
		}
		
		Map<String,String> variablesTipadas = funciones.registrarVariablesTipadas(c.getTiene().getDeclaracion());
		
		for(Sentencias s: c.getTiene().getTiene()) {
			if(s instanceof AsignacionCompleja) {
				AsignacionCompleja a = (AsignacionCompleja) s;
				if(a.getComplejo() instanceof ValorRegistro) {
					ValorRegistro r = (ValorRegistro) a.getComplejo();
					for(CampoRegistro campo: r.getCampo()) {
						if(!registros.get(variablesTipadas.get(r.getNombre_registro())).contains(campo.getNombre_campo())) {
							error("El campo especificado no pertenece al Registro de tipo "+variablesTipadas.get(r.getNombre_registro())+" definido", campo, DiagramapseudocodigoPackage.Literals.CAMPO_REGISTRO__NOMBRE_CAMPO);
						}	
					}
				}
				if(a.getOperador() instanceof ValorRegistro) {
					ValorRegistro r = (ValorRegistro) a.getOperador();
					for(CampoRegistro campo: r.getCampo()) {
						if(!registros.get(variablesTipadas.get(r.getNombre_registro())).contains(campo.getNombre_campo())) {
							error("El campo especificado no pertenece al Registro de tipo "+variablesTipadas.get(r.getNombre_registro())+" definido", campo, DiagramapseudocodigoPackage.Literals.CAMPO_REGISTRO__NOMBRE_CAMPO);
						}	
					}
				}
			}
			else if(s instanceof AsignacionNormal) {
				AsignacionNormal a = (AsignacionNormal) s;
				if(a.getOperador() instanceof LlamadaFuncion) {
					LlamadaFuncion f = (LlamadaFuncion) a.getOperador();
					for(valor v: f.getOperador()) {
						if(v instanceof Operador) {
							Operador o = (Operador) v;
							if(o instanceof ValorRegistro) {
								ValorRegistro r = (ValorRegistro) o;
								for(CampoRegistro campo: r.getCampo()) {
									if(!registros.get(variablesTipadas.get(r.getNombre_registro())).contains(campo.getNombre_campo())) {
										error("El campo especificado no pertenece al Registro de tipo "+variablesTipadas.get(r.getNombre_registro())+" definido", campo, DiagramapseudocodigoPackage.Literals.CAMPO_REGISTRO__NOMBRE_CAMPO);
									}	
								}
							}
						}
					}
				}
				if(a.getOperador() instanceof ValorRegistro) {
					ValorRegistro r = (ValorRegistro) a.getOperador();
					for(CampoRegistro campo: r.getCampo()) {
						if(!registros.get(variablesTipadas.get(r.getNombre_registro())).contains(campo.getNombre_campo())) {
							error("El campo especificado no pertenece al Registro de tipo "+variablesTipadas.get(r.getNombre_registro())+" definido", campo, DiagramapseudocodigoPackage.Literals.CAMPO_REGISTRO__NOMBRE_CAMPO);
						}	
					}
				}
			}
		}
	}
	
	@Check
	//Función que comprueba que un campo utilizado de un registro pertenezca realmente a ese tipo de registro
	protected void checkVariablesRegistroSubproceso(Codigo c) {
		//Preparamos todos los campos clasificados por el nombre del registro (utilizado como identificador)
		Map<String,List<String>> registros = new HashMap<String,List<String>>();
			for(TipoComplejo t: c.getTipocomplejo()) {
				if(t instanceof Registro) {
					Registro r = (Registro) t;
					registros.put(r.getNombre(), funciones.registrarCamposRegistroSinTipo(r.getVariable()));
				}
			}
			
			for(Subproceso sub: c.getFuncion()) {
				Map<String,String> variablesTipadas = funciones.registrarVariablesTipadas(sub.getDeclaracion());
				
				for(Sentencias s: sub.getSentencias()) {
					if(s instanceof AsignacionCompleja) {
						AsignacionCompleja a = (AsignacionCompleja) s;
						if(a.getComplejo() instanceof ValorRegistro) {
							ValorRegistro r = (ValorRegistro) a.getComplejo();
							for(CampoRegistro campo: r.getCampo()) {
								if(!registros.get(variablesTipadas.get(r.getNombre_registro())).contains(campo.getNombre_campo())) {
									error("El campo especificado no pertenece al Registro de tipo "+variablesTipadas.get(r.getNombre_registro())+" definido", campo, DiagramapseudocodigoPackage.Literals.CAMPO_REGISTRO__NOMBRE_CAMPO);
								}	
							}
						}
						if(a.getOperador() instanceof ValorRegistro) {
							ValorRegistro r = (ValorRegistro) a.getOperador();
							for(CampoRegistro campo: r.getCampo()) {
								if(!registros.get(variablesTipadas.get(r.getNombre_registro())).contains(campo.getNombre_campo())) {
									error("El campo especificado no pertenece al Registro de tipo "+variablesTipadas.get(r.getNombre_registro())+" definido", campo, DiagramapseudocodigoPackage.Literals.CAMPO_REGISTRO__NOMBRE_CAMPO);
								}	
							}
						}
					}
					else if(s instanceof AsignacionNormal) {
						AsignacionNormal a = (AsignacionNormal) s;
						if(a.getOperador() instanceof LlamadaFuncion) {
							LlamadaFuncion f = (LlamadaFuncion) a.getOperador();
							for(valor v: f.getOperador()) {
								if(v instanceof Operador) {
									Operador o = (Operador) v;
									if(o instanceof ValorRegistro) {
										ValorRegistro r = (ValorRegistro) o;
										for(CampoRegistro campo: r.getCampo()) {
											if(!registros.get(variablesTipadas.get(r.getNombre_registro())).contains(campo.getNombre_campo())) {
												error("El campo especificado no pertenece al Registro de tipo "+variablesTipadas.get(r.getNombre_registro())+" definido", campo, DiagramapseudocodigoPackage.Literals.CAMPO_REGISTRO__NOMBRE_CAMPO);
											}	
										}
									}
								}
							}
						}
					}
				}
			}
	}
	
	private void errorAsignacion(Asignacion a, String mensaje, boolean error) {
		if(a instanceof AsignacionNormal) {
			AsignacionNormal an = (AsignacionNormal) a;
			if(error) {
				error(mensaje, an, DiagramapseudocodigoPackage.Literals.ASIGNACION_NORMAL__LVALUE);
			}
			else {
				warning(mensaje, an, DiagramapseudocodigoPackage.Literals.ASIGNACION_NORMAL__LVALUE);
			}
		}
		else {
			AsignacionCompleja ac = (AsignacionCompleja) a;
			if(error) {
				error(mensaje, ac, DiagramapseudocodigoPackage.Literals.ASIGNACION_COMPLEJA__COMPLEJO);
			}
			else {
				warning(mensaje, ac, DiagramapseudocodigoPackage.Literals.ASIGNACION_COMPLEJA__COMPLEJO);
			}
		}
	}
	
	//Función auxiliar para evitar la repetición de código (DRY)
	private void checkAsignacionesAux(Asignacion a, String tipo, valor operador, Map<String,String> variables, Map<String,HashMap<String,String>> registros, List<String> nombresRegistros, Map<String,HashMap<Integer,String>> funcionesTipadas, Map<String,String> vectores, Map<String,String> matrices, Map<String,Map<String,String>> registrosCamposTipados) {
					if(tipo == "entero" && !(operador instanceof NumeroEntero)) {
						if(operador instanceof NumeroDecimal) {
							errorAsignacion(a, "Posible pérdida de precisión al asignar un real a un entero", false);
						}
						else if(operador instanceof operacion) {
							operacion o = (operacion) operador;
							List<valor> valores = funciones.registrarValoresOperacion(o);
							//Primero buscamos las dificultades en la operación
							List<valor> valoresProblem = funciones.buscarProblemasOperacion("entero", valores);
							//Preparamos los tipos validos
							ArrayList<String> tiposValidos = new ArrayList<String>();
							tiposValidos.add(0, "entero"); 
							tiposValidos.add(1, "real");
							if(funciones.asignacionOperacionVariable(valoresProblem, variables, tiposValidos) == 3 || funciones.asignacionOperacionFuncion(valoresProblem, variables, tiposValidos, funcionesTipadas) == 3 || funciones.asignacionOperacionRegistro(valoresProblem, variables, tiposValidos, registros, nombresRegistros) == 3 || funciones.asignacionOperacionVector(valoresProblem, variables, tiposValidos, vectores) == 3 || funciones.asignacionOperacionMatriz(valoresProblem, variables, tiposValidos, matrices) == 3) {
								errorAsignacion(a, "El tipo de asignación es incompatible", true);
							}
							else if(funciones.asignacionOperacionVariable(valoresProblem, variables, tiposValidos) == 2 || funciones.asignacionOperacionFuncion(valoresProblem, variables, tiposValidos, funcionesTipadas) == 2 || funciones.asignacionOperacionRegistro(valoresProblem, variables, tiposValidos, registros, nombresRegistros) == 2 || funciones.asignacionOperacionVector(valoresProblem, variables, tiposValidos, vectores) == 2 || funciones.asignacionOperacionMatriz(valoresProblem, variables, tiposValidos, matrices) == 2) {
								errorAsignacion(a, "Posible pérdida de precisión al asignar un real a un entero", false);
							}
						}
						else if(operador instanceof LlamadaFuncion) {
							LlamadaFuncion f = (LlamadaFuncion) operador;
							if(funcionesTipadas.get(f.getNombre()).get(f.getOperador().size()) != "entero" && funcionesTipadas.get(f.getNombre()).get(f.getOperador().size()) != "real" && funcionesTipadas.containsKey(f.getNombre()) && funcionesTipadas.get(f.getNombre()).containsKey(f.getOperador().size())) {
								errorAsignacion(a, "El tipo de asignación es incompatible", true);
							}
							else if(funcionesTipadas.get(f.getNombre()).get(f.getOperador().size()) == "real" && funcionesTipadas.containsKey(f.getNombre()) && funcionesTipadas.get(f.getNombre()).containsKey(f.getOperador().size())) {
								errorAsignacion(a, "Posible pérdida de precisión al asignar un real a un entero", false);
							}
						}
						else if(operador instanceof VariableID) {
							VariableID v = (VariableID) operador;
							if(variables.get(v.getNombre()) != "entero" && variables.get(v.getNombre()) != "real" && variables.containsKey(v.getNombre())) {
								errorAsignacion(a, "El tipo de asignación es incompatible", true);
								
							}
							else if(variables.get(v.getNombre()) == "real" && variables.containsKey(v.getNombre())) {
								errorAsignacion(a, "Posible pérdida de precisión al asignar un real a un entero", false);
							}
						}
						else if(operador instanceof ValorRegistro) {
							ValorRegistro vr = (ValorRegistro) operador;
							//Buscamos el registro del que proviene esa variable
							for(String nombre: nombresRegistros) {
								if(nombre.equals(variables.get(vr.getNombre_registro()))) {
									if(registros.get(nombre).get(vr.getCampo().get(0).getNombre_campo()) != "entero" && registros.get(nombre).get(vr.getCampo().get(0).getNombre_campo()) != "real") {
										errorAsignacion(a, "El tipo de asignación es incompatible", true);
									}
									else if(registros.get(nombre).get(vr.getCampo().get(0).getNombre_campo()) == "real") {
										errorAsignacion(a, "Posible pérdida de precisión al asignar un real a un entero", false);
									}
								}
							}
						}
						else if(operador instanceof ValorVector) {
							ValorVector v = (ValorVector) operador;
							if(vectores.get(variables.get(v.getNombre_vector())) != "entero" && vectores.get(variables.get(v.getNombre_vector())) != "real") {
								errorAsignacion(a, "El tipo de asignación es incompatible", true);
							}
							else if(vectores.get(variables.get(v.getNombre_vector())) == "real") {
								errorAsignacion(a, "Posible pérdida de precisión al asignar un real a un entero", false);
							}
						}
						else if(operador instanceof ValorMatriz) {
							ValorMatriz m = (ValorMatriz) operador;
							if(matrices.get(variables.get(m.getNombre_matriz())) != "entero" && matrices.get(variables.get(m.getNombre_matriz())) != "real") {
								errorAsignacion(a, "El tipo de asignación es incompatible", true);
							}
							else {
								errorAsignacion(a, "Posible pérdida de precisión al asignar un real a un entero", false);
							}
						}
						
						else {
							errorAsignacion(a, "El tipo de asignación es incompatible", true);
						}
					}
					else if(tipo == "logico" && !(operador instanceof ValorBooleano)) {
						if(operador instanceof operacion) {
							operacion o = (operacion) operador;
							List<valor> valores = funciones.registrarValoresOperacion(o);
							//Primero buscamos las dificultades en la operación
							List<valor> valoresProblem = funciones.buscarProblemasOperacion("logico", valores);
							//Preparamos los tipos validos
							ArrayList<String> tiposValidos = new ArrayList<String>();
							tiposValidos.add(0, "logico"); 
							if(funciones.asignacionOperacionVariable(valoresProblem, variables, tiposValidos) == 3 || funciones.asignacionOperacionFuncion(valoresProblem, variables, tiposValidos, funcionesTipadas) == 3 || funciones.asignacionOperacionRegistro(valoresProblem, variables, tiposValidos, registros, nombresRegistros) == 3 || funciones.asignacionOperacionVector(valoresProblem, variables, tiposValidos, vectores) == 3 || funciones.asignacionOperacionMatriz(valoresProblem, variables, tiposValidos, matrices) == 3) {
								errorAsignacion(a, "El tipo de asignación es incompatible", true);
							}
						}
						else if(operador instanceof LlamadaFuncion) {
							LlamadaFuncion f = (LlamadaFuncion) operador;
							if(funcionesTipadas.get(f.getNombre()).get(f.getOperador().size()) != "logico" && funcionesTipadas.containsKey(f.getNombre()) && funcionesTipadas.get(f.getNombre()).containsKey(f.getOperador().size())) {
								errorAsignacion(a, "El tipo de asignación es incompatible", true);
							}
						}
						else if(operador instanceof unaria) {
							unaria u = (unaria) operador;
							if(!(u.getVariable() instanceof ValorBooleano) && (!(u.getVariable() instanceof VariableID))) {
								errorAsignacion(a, "El tipo de asignación es incompatible", true);
							}
							else if(u.getVariable() instanceof VariableID) {
								VariableID var = (VariableID) u.getVariable();
								if(variables.get(var.getNombre()) != "logico" && variables.containsKey(var.getNombre())) {
									errorAsignacion(a, "El tipo de asignación es incompatible", true);
								}
							}
						}
						else if(operador instanceof VariableID) {
							VariableID v = (VariableID) operador;
							if(variables.get(v.getNombre()) != "logico" && variables.containsKey(v.getNombre())) {
								errorAsignacion(a, "El tipo de asignación es incompatible", true);
							}
						}
						else if(operador instanceof ValorRegistro) {
							ValorRegistro vr = (ValorRegistro) operador;
							//Buscamos el registro del que proviene esa variable
							for(String nombre: nombresRegistros) {
								if(nombre.equals(variables.get(vr.getNombre_registro()))) {
									if(registros.get(nombre).get(vr.getCampo().get(0).getNombre_campo()) != "logico") {
										errorAsignacion(a, "El tipo de asignación es incompatible", true);
									}
								}
							}
						}
						else if(operador instanceof ValorVector) {
							ValorVector v = (ValorVector) operador;
							if(vectores.get(variables.get(v.getNombre_vector())) != "logico") {
								errorAsignacion(a, "El tipo de asignación es incompatible", true);
							}
						}
						else if(operador instanceof ValorMatriz) {
							ValorMatriz m = (ValorMatriz) operador;
							if(matrices.get(variables.get(m.getNombre_matriz())) != "logico") {
								errorAsignacion(a, "El tipo de asignación es incompatible", true);
							}
						}
						else {
							errorAsignacion(a, "El tipo de asignación es incompatible", true);
						}
					}
					else if(tipo == "real" && !(operador instanceof NumeroEntero) && !(operador instanceof NumeroDecimal)) {
						if(operador instanceof operacion) {
							operacion o = (operacion) operador;
							List<valor> valores = funciones.registrarValoresOperacion(o);
							//Primero buscamos las dificultades en la operación
							List<valor> valoresProblem = funciones.buscarProblemasOperacion("real", valores);
							//Preparamos los tipos validos
							ArrayList<String> tiposValidos = new ArrayList<String>();
							tiposValidos.add(0, "real"); 
							tiposValidos.add(1, "entero");
							if(funciones.asignacionOperacionVariable(valoresProblem, variables, tiposValidos) == 3 || funciones.asignacionOperacionFuncion(valoresProblem, variables, tiposValidos, funcionesTipadas) == 3 || funciones.asignacionOperacionRegistro(valoresProblem, variables, tiposValidos, registros, nombresRegistros) == 3 || funciones.asignacionOperacionVector(valoresProblem, variables, tiposValidos, vectores) == 3 || funciones.asignacionOperacionMatriz(valoresProblem, variables, tiposValidos, matrices) == 3) {
								errorAsignacion(a, "El tipo de asignación es incompatible", true);
							}
						}
						else if(operador instanceof LlamadaFuncion) {
							LlamadaFuncion f = (LlamadaFuncion) operador;
							if(funcionesTipadas.get(f.getNombre()).get(f.getOperador().size()) != "real" && funcionesTipadas.get(f.getNombre()).get(f.getOperador().size()) != "entero" && funcionesTipadas.containsKey(f.getNombre()) && funcionesTipadas.get(f.getNombre()).containsKey(f.getOperador().size())) {
								errorAsignacion(a, "El tipo de asignación es incompatible", true);
							}
						}
						else if(operador instanceof VariableID) {
							VariableID v = (VariableID) operador;
							if(variables.get(v.getNombre()) != "real" && variables.get(v.getNombre()) != "entero" && variables.containsKey(v.getNombre())) {
								errorAsignacion(a, "El tipo de asignación es incompatible", true);
							}
						}
						else if(operador instanceof ValorRegistro) {
							ValorRegistro vr = (ValorRegistro) operador;
							//Buscamos el registro del que proviene esa variable
							for(String nombre: nombresRegistros) {
								if(nombre.equals(variables.get(vr.getNombre_registro()))) {
									if(registros.get(nombre).get(vr.getCampo().get(0).getNombre_campo()) != "entero" && registros.get(nombre).get(vr.getCampo().get(0).getNombre_campo()) != "real") {
										errorAsignacion(a, "El tipo de asignación es incompatible", true);
									}
								}
							}
						}
						else if(operador instanceof ValorVector) {
							ValorVector v = (ValorVector) operador;
							if(vectores.get(variables.get(v.getNombre_vector())) != "entero" && vectores.get(variables.get(v.getNombre_vector())) != "real") {
								errorAsignacion(a, "El tipo de asignación es incompatible", true);
							}
						}
						else if(operador instanceof ValorMatriz) {
							ValorMatriz m = (ValorMatriz) operador;
							if(matrices.get(variables.get(m.getNombre_matriz())) != "entero" && matrices.get(variables.get(m.getNombre_matriz())) != "real") {
								errorAsignacion(a, "El tipo de asignación es incompatible", true);
							}
						}
						else {
							errorAsignacion(a, "El tipo de asignación es incompatible", true);
						}
					}
					else if(tipo == "cadena" && !(operador instanceof ConstCadena)) {
						if(operador instanceof operacion) {
							operacion o = (operacion) operador;
							List<valor> valores = funciones.registrarValoresOperacion(o);
							//Primero buscamos las dificultades en la operación
							List<valor> valoresProblem = funciones.buscarProblemasOperacion("cadena", valores);
							//Preparamos los tipos validos
							ArrayList<String> tiposValidos = new ArrayList<String>();
							tiposValidos.add(0, "cadena"); 
							if(funciones.asignacionOperacionVariable(valoresProblem, variables, tiposValidos) == 3 || funciones.asignacionOperacionFuncion(valoresProblem, variables, tiposValidos, funcionesTipadas) == 3 || funciones.asignacionOperacionRegistro(valoresProblem, variables, tiposValidos, registros, nombresRegistros) == 3 || funciones.asignacionOperacionVector(valoresProblem, variables, tiposValidos, vectores) == 3 || funciones.asignacionOperacionMatriz(valoresProblem, variables, tiposValidos, matrices) == 3) {
								errorAsignacion(a, "El tipo de asignación es incompatible", true);
							}
						}
						else if(operador instanceof LlamadaFuncion) {
							LlamadaFuncion f = (LlamadaFuncion) operador;
							if(funcionesTipadas.get(f.getNombre()).get(f.getOperador().size()) != "cadena" && funcionesTipadas.containsKey(f.getNombre()) && funcionesTipadas.get(f.getNombre()).containsKey(f.getOperador().size())) {
								errorAsignacion(a, "El tipo de asignación es incompatible", true);
							}
						}
						else if(operador instanceof VariableID) {
							VariableID v = (VariableID) operador;
							if(variables.get(v.getNombre()) != "cadena" && variables.containsKey(v.getNombre())) {
								errorAsignacion(a, "El tipo de asignación es incompatible", true);
							}
						}
						else if(operador instanceof ValorRegistro) {
							ValorRegistro vr = (ValorRegistro) operador;
							//Buscamos el registro del que proviene esa variable
							for(String nombre: nombresRegistros) {
								if(nombre.equals(variables.get(vr.getNombre_registro()))) {
									if(registros.get(nombre).get(vr.getCampo().get(0).getNombre_campo()) != "cadena") {
										errorAsignacion(a, "El tipo de asignación es incompatible", true);
									}
								}
							}
						}
						else if(operador instanceof ValorVector) {
							ValorVector v = (ValorVector) operador;
							if(vectores.get(variables.get(v.getNombre_vector())) != "cadena") {
								errorAsignacion(a, "El tipo de asignación es incompatible", true);
							}
						}
						else if(operador instanceof ValorMatriz) {
							ValorMatriz m = (ValorMatriz) operador;
							if(matrices.get(variables.get(m.getNombre_matriz())) != "cadena") {
								errorAsignacion(a, "El tipo de asignación es incompatible", true);
							}
						}
						else {
							errorAsignacion(a,"El tipo de asignación es incompatible", true);
						}
					}
					else if(tipo == "caracter" && !(operador instanceof Caracter)) {
						if(operador instanceof operacion) {
							operacion o = (operacion) operador;
							List<valor> valores = funciones.registrarValoresOperacion(o);
							//Primero buscamos las dificultades en la operación
							List<valor> valoresProblem = funciones.buscarProblemasOperacion("caracter", valores);
							//Preparamos los tipos validos
							ArrayList<String> tiposValidos = new ArrayList<String>();
							tiposValidos.add(0, "caracter"); 
							if(funciones.asignacionOperacionVariable(valoresProblem, variables, tiposValidos) == 3 || funciones.asignacionOperacionFuncion(valoresProblem, variables, tiposValidos, funcionesTipadas) == 3 || funciones.asignacionOperacionRegistro(valoresProblem, variables, tiposValidos, registros, nombresRegistros) == 3 || funciones.asignacionOperacionVector(valoresProblem, variables, tiposValidos, vectores) == 3 || funciones.asignacionOperacionMatriz(valoresProblem, variables, tiposValidos, matrices) == 3) {
								errorAsignacion(a, "El tipo de asignación es incompatible", true);
							}
						}
						else if(operador instanceof LlamadaFuncion) {
							LlamadaFuncion f = (LlamadaFuncion) operador;
							if(funcionesTipadas.get(f.getNombre()).get(f.getOperador().size()) != "caracter" && funcionesTipadas.containsKey(f.getNombre()) && funcionesTipadas.get(f.getNombre()).containsKey(f.getOperador().size())) {
								errorAsignacion(a, "El tipo de asignación es incompatible", true);
							}
						}
						else if(operador instanceof VariableID) {
							VariableID v = (VariableID) operador;
							if(variables.get(v.getNombre()) != "caracter" && variables.containsKey(v.getNombre())) {
								errorAsignacion(a, "El tipo de asignación es incompatible", true);
							}
						}
						else if(operador instanceof ValorRegistro) {
							ValorRegistro vr = (ValorRegistro) operador;
							//Buscamos el registro del que proviene esa variable
							for(String nombre: nombresRegistros) {
								if(nombre.equals(variables.get(vr.getNombre_registro()))) {
									if(registros.get(nombre).get(vr.getCampo().get(0).getNombre_campo()) != "caracter") {
										errorAsignacion(a, "El tipo de asignación es incompatible", true);
									}
								}
							}
						}
						else if(operador instanceof ValorVector) {
							ValorVector v = (ValorVector) operador;
							if(vectores.get(variables.get(v.getNombre_vector())) != "caracter") {
								errorAsignacion(a, "El tipo de asignación es incompatible", true);
							}
						}
						else if(operador instanceof ValorMatriz) {
							ValorMatriz m = (ValorMatriz) operador;
							if(matrices.get(variables.get(m.getNombre_matriz())) != "caracter") {
								errorAsignacion(a, "El tipo de asignación es incompatible", true);
							}
						}
						else {
							errorAsignacion(a, "El tipo de asignación es incompatible", true);
						}
				}
	}
	
	private void checkSentenciasAsignaciones(List<Sentencias> sentencias, Map<String,String> variablesTipadas, Map<String,HashMap<String,String>> registros, List<String> nombresRegistros, Map<String,HashMap<Integer,String>> funcionesTipadas, Map<String,String> vectores, Map<String,String> matrices, Map<String, Map<String,String>> registrosCamposTipados) {
		for(Sentencias s: sentencias) {
			if(s instanceof Asignacion) {
				Asignacion a = (Asignacion) s;
				if(a instanceof AsignacionNormal) {
					AsignacionNormal an = (AsignacionNormal) a;
					String tipo = variablesTipadas.get(an.getLvalue());
					checkAsignacionesAux(a, tipo, an.getOperador(), variablesTipadas, registros, nombresRegistros,funcionesTipadas, vectores, matrices, registrosCamposTipados);
				}
				else if(a instanceof AsignacionCompleja) {
					AsignacionCompleja ac = (AsignacionCompleja) a;
					if(ac.getComplejo() instanceof ValorRegistro) {
						ValorRegistro r = (ValorRegistro) ac.getComplejo();
						for(CampoRegistro campo: r.getCampo()) {
							String tipo = registros.get(variablesTipadas.get(r.getNombre_registro())).get(campo.getNombre_campo());
							checkAsignacionesAux(a, tipo, ac.getOperador(), variablesTipadas, registros, nombresRegistros, funcionesTipadas, vectores, matrices, registrosCamposTipados);
						}
					}
					else if(ac.getComplejo() instanceof ValorVector) {
						ValorVector v = (ValorVector) ac.getComplejo();
						if(v.getCampo().size() == 0) {
							String tipo = vectores.get(variablesTipadas.get(v.getNombre_vector()));
							checkAsignacionesAux(a, tipo, ac.getOperador(), variablesTipadas, registros, nombresRegistros, funcionesTipadas, vectores, matrices, registrosCamposTipados);
						}
						else {
							//Cogemos el último campo:
							String campo = v.getCampo().get(v.getCampo().size()-1).getNombre_campo();
							String tipo = registrosCamposTipados.get(vectores.get(variablesTipadas.get(v.getNombre_vector()))).get(campo);
							checkAsignacionesAux(a, tipo, ac.getOperador(), variablesTipadas, registros, nombresRegistros, funcionesTipadas, vectores, matrices, registrosCamposTipados);
						}
					}
					else if(ac.getComplejo() instanceof ValorMatriz) {
						ValorMatriz m = (ValorMatriz) ac.getComplejo();
						if(m.getCampo().size() == 0) {
							String tipo = matrices.get(variablesTipadas.get(m.getNombre_matriz()));
							checkAsignacionesAux(a, tipo, ac.getOperador(), variablesTipadas, registros, nombresRegistros, funcionesTipadas, vectores, matrices, registrosCamposTipados);
						}
						else {
							//Cogemos el último campo:
							String campo = m.getCampo().get(m.getCampo().size()-1).getNombre_campo();
							String tipo = registrosCamposTipados.get(matrices.get(variablesTipadas.get(m.getNombre_matriz()))).get(campo);
							checkAsignacionesAux(a, tipo, ac.getOperador(), variablesTipadas, registros, nombresRegistros, funcionesTipadas, vectores, matrices, registrosCamposTipados);
						}
					}
				}
			}
		}
	}
	
	@Check
	//Función que valida que el tipo de dato que se quiere asignar sea compatible con el tipo de la variable (asignación normal)
	protected void checkAsignacionesInicio(Codigo c) {
		//Preparamos las variables de tipo registro para permitir asignación
		Map<String,HashMap<String,String>> registros = new HashMap<String,HashMap<String,String>>();
		Map<String,String> vectores = new HashMap<String,String>();
		List<String> nombresRegistros = new ArrayList<String>();
		Map<String,String> matrices = new HashMap<String,String>();
		
		funciones.prepararColeccionesTiposComplejos(c.getTipocomplejo(), registros, nombresRegistros, vectores, matrices);
		
		//Registramos todas las variables declaradas con sus respectivos tipos
		Map<String,String> variablesTipadas = funciones.registrarVariablesTipadas(c.getTiene().getDeclaracion());
		
		//Registramos todas las funciones que están definidas
		Map<String,HashMap<Integer,String>> funcionesTipadas = new HashMap<String,HashMap<Integer,String>>();
		
		//Registramos todos los campos tipados de cada registro
		Map<String, Map<String,String>> registrosCamposTipados = new HashMap<String,Map<String,String>>();
		
		for(TipoComplejo t: c.getTipocomplejo()) {
			if(t instanceof Registro) {
				Registro r = (Registro) t;
				registrosCamposTipados.put(r.getNombre(), funciones.registrarCamposRegistro(r.getVariable()));
			}
		}
		
		funciones.prepararColeccionFunciones(c.getFuncion(), funcionesTipadas);
		checkSentenciasAsignaciones(c.getTiene().getTiene(), variablesTipadas, registros, nombresRegistros, funcionesTipadas, vectores, matrices, registrosCamposTipados);
		
		for(Sentencias s: c.getTiene().getTiene()) {
			if(s instanceof Bloque) {
				Bloque bloque = (Bloque) s;
				if(bloque instanceof segun) {
					segun seg = (segun) bloque;
					for(Caso caso: seg.getCaso()) {
						checkSentenciasAsignaciones(caso.getSentencias(), variablesTipadas, registros, nombresRegistros, funcionesTipadas, vectores, matrices, registrosCamposTipados);

						
						for(Sentencias sentencias: caso.getSentencias()) {
							if(sentencias instanceof Bloque) {
								Bloque bloqueAux = (Bloque) sentencias;
								checkSentenciasAsignaciones(bloqueAux.getSentencias(), variablesTipadas, registros, nombresRegistros, funcionesTipadas, vectores, matrices, registrosCamposTipados);

							}
						}
					}
				}
				else {
					checkSentenciasAsignaciones(bloque.getSentencias(), variablesTipadas, registros, nombresRegistros, funcionesTipadas, vectores, matrices, registrosCamposTipados);

					
					for(Sentencias sentencias: bloque.getSentencias()) {
						if(sentencias instanceof Bloque) {
							Bloque bloqueAux = (Bloque) sentencias;
							checkSentenciasAsignaciones(bloqueAux.getSentencias(), variablesTipadas, registros, nombresRegistros, funcionesTipadas, vectores, matrices, registrosCamposTipados);

						}
					}
				}
			}
		}
	}
	
	@Check
	//Función que valida que el tipo de dato que se quiere asignar sea compatible con el tipo de la variable (asignación normal)
	protected void checkAsignacionesSubproceso(Codigo c) {
		//Preparamos las variables de tipo registro para permitir asignación
		Map<String,HashMap<String,String>> registros = new HashMap<String,HashMap<String,String>>();
		Map<String,String> vectores = new HashMap<String,String>();
		List<String> nombresRegistros = new ArrayList<String>();
		Map<String,String> matrices = new HashMap<String,String>();
		
		funciones.prepararColeccionesTiposComplejos(c.getTipocomplejo(), registros, nombresRegistros, vectores, matrices);
		
		//Registramos todas las funciones que están definidas
		Map<String,HashMap<Integer,String>> funcionesTipadas = new HashMap<String,HashMap<Integer,String>>();
		
		funciones.prepararColeccionFunciones(c.getFuncion(), funcionesTipadas);
		
		//Registramos todos los campos tipados de cada registro
		Map<String, Map<String,String>> registrosCamposTipados = new HashMap<String,Map<String,String>>();
				
		for(TipoComplejo t: c.getTipocomplejo()) {
			if(t instanceof Registro) {
				Registro r = (Registro) t;
				registrosCamposTipados.put(r.getNombre(), funciones.registrarCamposRegistro(r.getVariable()));
			}
		}
		
		for(Subproceso sub: c.getFuncion()) {
			//Registramos todas las variables declaradas con sus respectivos tipos
			Map<String,String> variablesTipadas = funciones.registrarVariablesTipadas(sub.getDeclaracion());
			
			//Como es una función también debemos registrar los parámetros
			
			funciones.getTiposCabecera(sub.getParametrofuncion(), variablesTipadas);
			checkSentenciasAsignaciones(sub.getSentencias(), variablesTipadas, registros, nombresRegistros, funcionesTipadas, vectores, matrices, registrosCamposTipados);
			
			for(Sentencias s: sub.getSentencias()) {
				if(s instanceof Bloque) {
					Bloque bloque = (Bloque) s;
					if(bloque instanceof segun) {
						segun seg = (segun) bloque;
						for(Caso caso: seg.getCaso()) {
							checkSentenciasAsignaciones(caso.getSentencias(), variablesTipadas, registros, nombresRegistros, funcionesTipadas, vectores, matrices, registrosCamposTipados);

							
							for(Sentencias sentencias: caso.getSentencias()) {
								if(sentencias instanceof Bloque) {
									Bloque bloqueAux = (Bloque) sentencias;
									checkSentenciasAsignaciones(bloqueAux.getSentencias(), variablesTipadas, registros, nombresRegistros, funcionesTipadas, vectores, matrices, registrosCamposTipados);

								}
							}
						}
					}
					else {
						checkSentenciasAsignaciones(bloque.getSentencias(), variablesTipadas, registros, nombresRegistros, funcionesTipadas, vectores, matrices, registrosCamposTipados);

						
						for(Sentencias sentencias: bloque.getSentencias()) {
							if(sentencias instanceof Bloque) {
								Bloque bloqueAux = (Bloque) sentencias;
								checkSentenciasAsignaciones(bloqueAux.getSentencias(), variablesTipadas, registros, nombresRegistros, funcionesTipadas, vectores, matrices, registrosCamposTipados);

							}
						}
					}
				}
			}
		}
			
	}
	
	private void comprobarParametrosTipoComplejoLlamada(List<valor> operadores, List<String> nombresRegistros, List<String> nombresVectores, List<String> nombresMatrices, Map<String,String> variables) {
		for(valor v: operadores) {
			if(v instanceof Operador) {
				Operador op = (Operador) v;
				if(op instanceof ValorVector) {
					ValorVector vector = (ValorVector) op;
					if(!nombresVectores.contains(variables.get(vector.getNombre_vector()))) {
						error("La variable "+vector.getNombre_vector()+" no pertenece al tipo vector", vector, DiagramapseudocodigoPackage.Literals.VALOR_VECTOR__NOMBRE_VECTOR);
					}
				}
				else if(op instanceof ValorMatriz) {
					ValorMatriz matriz = (ValorMatriz) op;
					if(!nombresMatrices.contains(variables.get(matriz.getNombre_matriz()))) {
						error("La variable "+matriz.getNombre_matriz()+" no pertenece al tipo matriz", matriz, DiagramapseudocodigoPackage.Literals.VALOR_MATRIZ__NOMBRE_MATRIZ);
					}
				}
				else if(op instanceof ValorRegistro) {
					ValorRegistro registro = (ValorRegistro) op;
					if(!nombresRegistros.contains(variables.get(registro.getNombre_registro()))) {
						//Si no lo contiene es que el tipo de la variable no era un registro
						error("La variable "+registro.getNombre_registro()+" no pertenece al tipo registro", registro, DiagramapseudocodigoPackage.Literals.VALOR_REGISTRO__NOMBRE_REGISTRO);
					}
				}
			}
		}		
	}
	
	private void checkVariblesUsadasTiposComplejosAux(List<Sentencias> sentencias, Map<String,String> variables, List<String> nombresRegistros, List<String> nombresVectores, List<String> nombresMatrices) {
		
		for(Sentencias s: sentencias) {
			if(s instanceof AsignacionNormal) {
				AsignacionNormal a = (AsignacionNormal) s;
				if(a.getOperador() instanceof ValorRegistro) {
					ValorRegistro r = (ValorRegistro) a.getOperador();
					if(!nombresRegistros.contains(variables.get(r.getNombre_registro()))) {
						//Si no lo contiene es que el tipo de la variable no era un registro
						error("La variable "+r.getNombre_registro()+" no pertenece al tipo registro", r, DiagramapseudocodigoPackage.Literals.VALOR_REGISTRO__NOMBRE_REGISTRO);
					}
				}
				else if(a.getOperador() instanceof ValorVector) {
					ValorVector v = (ValorVector) a.getOperador();
					if(!nombresVectores.contains(variables.get(v.getNombre_vector()))) {
						error("La variable "+v.getNombre_vector()+" no pertenece al tipo vector", v, DiagramapseudocodigoPackage.Literals.VALOR_VECTOR__NOMBRE_VECTOR);
					}
				}
				else if(a.getOperador() instanceof ValorMatriz) {
					ValorMatriz m = (ValorMatriz) a.getOperador();
					if(!nombresMatrices.contains(variables.get(m.getNombre_matriz()))) {
						error("La variable "+m.getNombre_matriz()+" no pertenece al tipo matriz", m, DiagramapseudocodigoPackage.Literals.VALOR_MATRIZ__NOMBRE_MATRIZ);
					}
				}
				else if(a.getOperador() instanceof LlamadaFuncion) {
					LlamadaFuncion l = (LlamadaFuncion) a.getOperador();
					comprobarParametrosTipoComplejoLlamada(l.getOperador(), nombresRegistros, nombresVectores, nombresMatrices, variables);	
				}
				
				else if(a.getOperador() instanceof operacion) {
					operacion o = (operacion) a.getOperador();
					//Si es una operación debemos comprobar la lista de operadores completa
					List<valor> valores = funciones.registrarValoresOperacion(o);
					List<ValorRegistro> valoresRegistro = funciones.variablesRegistroExistentes(valores, variables, nombresRegistros);
					for(ValorRegistro vr: valoresRegistro) {
						error("La variable "+vr.getNombre_registro()+" no pertenece al tipo registro", vr, DiagramapseudocodigoPackage.Literals.VALOR_REGISTRO__NOMBRE_REGISTRO);
					}
					List<ValorVector> valoresVector = funciones.variablesVectorExistentes(valores, variables, nombresVectores);
					for(ValorVector vv: valoresVector) {
						error("La variable "+vv.getNombre_vector()+" no pertenece al tipo vector", vv, DiagramapseudocodigoPackage.Literals.VALOR_VECTOR__NOMBRE_VECTOR);
					}
					List<ValorMatriz> valoresMatriz = funciones.variablesMatrizExistentes(valores, variables, nombresMatrices);
					for(ValorMatriz vm: valoresMatriz) {
						error("La variable "+vm.getNombre_matriz()+" no pertenece al tipo matriz", vm, DiagramapseudocodigoPackage.Literals.VALOR_MATRIZ__NOMBRE_MATRIZ);
					}
					//Comprobamos los parámetros de las funciones
					
					for(valor v: valores) {
						if(v instanceof LlamadaFuncion) {
							LlamadaFuncion l = (LlamadaFuncion) v;
							comprobarParametrosTipoComplejoLlamada(l.getOperador(), nombresRegistros, nombresVectores, nombresMatrices, variables);
						}
					}
					
				}
			}
			else if(s instanceof AsignacionCompleja) {
				AsignacionCompleja a = (AsignacionCompleja) s;
				if(a.getComplejo() instanceof ValorRegistro) {
					ValorRegistro r = (ValorRegistro) a.getComplejo();
					if(!nombresRegistros.contains(variables.get(r.getNombre_registro()))) {
						//Si no lo contiene es que el tipo de la variable no era un registro
						error("La variable "+r.getNombre_registro()+" no pertenece al tipo registro", r, DiagramapseudocodigoPackage.Literals.VALOR_REGISTRO__NOMBRE_REGISTRO);
					}
				}
				else if(a.getComplejo() instanceof ValorVector) {
					ValorVector v = (ValorVector) a.getComplejo();
					if(!nombresVectores.contains(variables.get(v.getNombre_vector()))) {
						error("La variable "+v.getNombre_vector()+" no pertenece al tipo vector", v, DiagramapseudocodigoPackage.Literals.VALOR_VECTOR__NOMBRE_VECTOR);
					}
				}
				else if(a.getComplejo() instanceof ValorMatriz) {
					ValorMatriz m = (ValorMatriz) a.getComplejo();
					if(!nombresMatrices.contains(variables.get(m.getNombre_matriz()))) {
						error("La variable "+m.getNombre_matriz()+" no pertenece al tipo matriz", m, DiagramapseudocodigoPackage.Literals.VALOR_MATRIZ__NOMBRE_MATRIZ);
					}
				}
				if(a.getOperador() instanceof ValorRegistro) {
					ValorRegistro r = (ValorRegistro) a.getOperador();
					if(!nombresRegistros.contains(variables.get(r.getNombre_registro()))) {
						//Si no lo contiene es que el tipo de la variable no era un registro
						error("La variable "+r.getNombre_registro()+" no pertenece al tipo registro", r, DiagramapseudocodigoPackage.Literals.VALOR_REGISTRO__NOMBRE_REGISTRO);
					}
				}
				else if(a.getOperador() instanceof ValorVector) {
					ValorVector v = (ValorVector) a.getOperador();
					if(!nombresVectores.contains(variables.get(v.getNombre_vector()))) {
						error("La variable "+v.getNombre_vector()+" no pertenece al tipo vector", v, DiagramapseudocodigoPackage.Literals.VALOR_VECTOR__NOMBRE_VECTOR);
					}
				}
				else if(a.getOperador() instanceof ValorMatriz) {
					ValorMatriz m = (ValorMatriz) a.getOperador();
					if(!nombresMatrices.contains(variables.get(m.getNombre_matriz()))) {
						error("La variable "+m.getNombre_matriz()+" no pertenece al tipo matriz", m, DiagramapseudocodigoPackage.Literals.VALOR_MATRIZ__NOMBRE_MATRIZ);
					}
				}
				else if(a.getOperador() instanceof LlamadaFuncion) {
					LlamadaFuncion l = (LlamadaFuncion) a.getOperador();
					comprobarParametrosTipoComplejoLlamada(l.getOperador(), nombresRegistros, nombresVectores, nombresMatrices, variables);	
				}
				else if(a.getOperador() instanceof operacion) {
					operacion o = (operacion) a.getOperador();
					//Si es una operación debemos comprobar la lista de operadores completa
					List<valor> valores = funciones.registrarValoresOperacion(o);
					List<ValorRegistro> valoresRegistro = funciones.variablesRegistroExistentes(valores, variables, nombresRegistros);
					for(ValorRegistro vr: valoresRegistro) {
						error("La variable "+vr.getNombre_registro()+" no pertenece al tipo registro", vr, DiagramapseudocodigoPackage.Literals.VALOR_REGISTRO__NOMBRE_REGISTRO);
					}
					List<ValorVector> valoresVector = funciones.variablesVectorExistentes(valores, variables, nombresVectores);
					for(ValorVector vv: valoresVector) {
						error("La variable "+vv.getNombre_vector()+" no pertenece al tipo vector", vv, DiagramapseudocodigoPackage.Literals.VALOR_VECTOR__NOMBRE_VECTOR);
					}
					List<ValorMatriz> valoresMatriz = funciones.variablesMatrizExistentes(valores, variables, nombresMatrices);
					for(ValorMatriz vm: valoresMatriz) {
						error("La variable "+vm.getNombre_matriz()+" no pertenece al tipo matriz", vm, DiagramapseudocodigoPackage.Literals.VALOR_MATRIZ__NOMBRE_MATRIZ);
					}
					
					//Comprobamos los parámetros de las funciones:
					
					for(valor v: valores) {
						if(v instanceof LlamadaFuncion) {
							LlamadaFuncion l = (LlamadaFuncion) v;
							comprobarParametrosTipoComplejoLlamada(l.getOperador(), nombresRegistros, nombresVectores, nombresMatrices, variables);
						}
					}
				}
			}
		}
	}
	
	@Check
	protected void checkVariableUsadaTipoComplejo(Codigo c) {
		//Recogemos todos los registros, con los nombres nos vale porque ya tenemos una función que se encarga de
		//validar si un campo es o no de un determinado registro
		List<String> nombresRegistros = new ArrayList<String>();
		List<String> nombresVectores = new ArrayList<String>();
		List<String> nombresMatrices = new ArrayList<String>();
		for(TipoComplejo t: c.getTipocomplejo()) {
			if(t instanceof Registro) {
				Registro r = (Registro) t;
				nombresRegistros.add(r.getNombre());
			}
			else if(t instanceof Vector) {
				Vector v = (Vector) t;
				nombresVectores.add(v.getNombre());
			}
			else if(t instanceof Matriz) {
				Matriz m = (Matriz) t;
				nombresMatrices.add(m.getNombre());
			}
		}
		
		//Ahora comprobamos que ni en el programa principal ni en los subprocesos se utilice una variable declarada
		//como si fuese un registro sin serlo.
		
		//1) En el programa principal:
		
		Map<String,String> variables = funciones.registrarVariablesTipadas(c.getTiene().getDeclaracion());
		
		checkVariblesUsadasTiposComplejosAux(c.getTiene().getTiene(), variables, nombresRegistros, nombresVectores, nombresMatrices);
		
		for(Sentencias s: c.getTiene().getTiene()) {
			if(s instanceof Bloque) {
				Bloque bloque = (Bloque) s;
				if(bloque instanceof segun) {
					segun seg = (segun) bloque;
					for(Caso caso: seg.getCaso()) {
						checkVariblesUsadasTiposComplejosAux(caso.getSentencias(), variables, nombresRegistros, nombresVectores, nombresMatrices);

						
						for(Sentencias sentencias: caso.getSentencias()) {
							if(sentencias instanceof Bloque) {
								Bloque bloqueAux = (Bloque) sentencias;
								checkVariblesUsadasTiposComplejosAux(bloqueAux.getSentencias(), variables, nombresRegistros, nombresVectores, nombresMatrices);

							}
						}
					}
				}
				else {
					checkVariblesUsadasTiposComplejosAux(bloque.getSentencias(), variables, nombresRegistros, nombresVectores, nombresMatrices);

					
					for(Sentencias sentencias: bloque.getSentencias()) {
						if(sentencias instanceof Bloque) {
							Bloque bloqueAux = (Bloque) sentencias;
							checkVariblesUsadasTiposComplejosAux(bloqueAux.getSentencias(), variables, nombresRegistros, nombresVectores, nombresMatrices);

						}
					}
				}
			}
		}
		
		//2) En los subprocesos:
		
		for(Subproceso sub: c.getFuncion()) {
			variables = funciones.registrarVariablesTipadas(sub.getDeclaracion());
			
			//Como son subprocesos también debemos registrar sus parámetros
			
			funciones.getTiposCabecera(sub.getParametrofuncion(), variables);
			
			checkVariblesUsadasTiposComplejosAux(sub.getSentencias(), variables, nombresRegistros, nombresVectores, nombresMatrices);
			
			for(Sentencias s: sub.getSentencias()) {
				if(s instanceof Bloque) {
					Bloque bloque = (Bloque) s;
					if(bloque instanceof segun) {
						segun seg = (segun) bloque;
						for(Caso caso: seg.getCaso()) {
							checkVariblesUsadasTiposComplejosAux(caso.getSentencias(), variables, nombresRegistros, nombresVectores, nombresMatrices);

							
							for(Sentencias sentencias: caso.getSentencias()) {
								if(sentencias instanceof Bloque) {
									Bloque bloqueAux = (Bloque) sentencias;
									checkVariblesUsadasTiposComplejosAux(bloqueAux.getSentencias(), variables, nombresRegistros, nombresVectores, nombresMatrices);

								}
							}
						}
					}
					else {
						checkVariblesUsadasTiposComplejosAux(bloque.getSentencias(), variables, nombresRegistros, nombresVectores, nombresMatrices);

						
						for(Sentencias sentencias: bloque.getSentencias()) {
							if(sentencias instanceof Bloque) {
								Bloque bloqueAux = (Bloque) sentencias;
								checkVariblesUsadasTiposComplejosAux(bloqueAux.getSentencias(), variables, nombresRegistros, nombresVectores, nombresMatrices);

							}
						}
					}
				}
			}
		}
		
	}

}
