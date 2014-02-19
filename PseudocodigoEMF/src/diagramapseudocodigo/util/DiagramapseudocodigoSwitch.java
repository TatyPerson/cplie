/**
 */
package diagramapseudocodigo.util;

import diagramapseudocodigo.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see diagramapseudocodigo.DiagramapseudocodigoPackage
 * @generated
 */
public class DiagramapseudocodigoSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static DiagramapseudocodigoPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DiagramapseudocodigoSwitch() {
		if (modelPackage == null) {
			modelPackage = DiagramapseudocodigoPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @parameter ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case DiagramapseudocodigoPackage.CODIGO: {
				Codigo codigo = (Codigo)theEObject;
				T result = caseCodigo(codigo);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DiagramapseudocodigoPackage.INICIO: {
				Inicio inicio = (Inicio)theEObject;
				T result = caseInicio(inicio);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DiagramapseudocodigoPackage.SENTENCIAS: {
				Sentencias sentencias = (Sentencias)theEObject;
				T result = caseSentencias(sentencias);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DiagramapseudocodigoPackage.DECLARACION_VARIABLE: {
				DeclaracionVariable declaracionVariable = (DeclaracionVariable)theEObject;
				T result = caseDeclaracionVariable(declaracionVariable);
				if (result == null) result = caseDeclaracion(declaracionVariable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DiagramapseudocodigoPackage.LLAMADA_FUNCION: {
				LlamadaFuncion llamadaFuncion = (LlamadaFuncion)theEObject;
				T result = caseLlamadaFuncion(llamadaFuncion);
				if (result == null) result = caseSentencias(llamadaFuncion);
				if (result == null) result = casevalor(llamadaFuncion);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DiagramapseudocodigoPackage.VARIABLE_ID: {
				VariableID variableID = (VariableID)theEObject;
				T result = caseVariableID(variableID);
				if (result == null) result = caseOperador(variableID);
				if (result == null) result = casevalor(variableID);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DiagramapseudocodigoPackage.CADENA: {
				cadena cadena = (cadena)theEObject;
				T result = casecadena(cadena);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DiagramapseudocodigoPackage.CONST_CADENA: {
				ConstCadena constCadena = (ConstCadena)theEObject;
				T result = caseConstCadena(constCadena);
				if (result == null) result = caseOperador(constCadena);
				if (result == null) result = casevalor(constCadena);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DiagramapseudocodigoPackage.VARIABLE: {
				Variable variable = (Variable)theEObject;
				T result = caseVariable(variable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DiagramapseudocodigoPackage.OPERADOR: {
				Operador operador = (Operador)theEObject;
				T result = caseOperador(operador);
				if (result == null) result = casevalor(operador);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DiagramapseudocodigoPackage.NUMERO_ENTERO: {
				NumeroEntero numeroEntero = (NumeroEntero)theEObject;
				T result = caseNumeroEntero(numeroEntero);
				if (result == null) result = caseOperador(numeroEntero);
				if (result == null) result = casevalor(numeroEntero);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DiagramapseudocodigoPackage.ASIGNACION: {
				Asignacion asignacion = (Asignacion)theEObject;
				T result = caseAsignacion(asignacion);
				if (result == null) result = caseSentencias(asignacion);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DiagramapseudocodigoPackage.ESCRIBIR: {
				Escribir escribir = (Escribir)theEObject;
				T result = caseEscribir(escribir);
				if (result == null) result = caseSentencias(escribir);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DiagramapseudocodigoPackage.FUNCION: {
				Funcion funcion = (Funcion)theEObject;
				T result = caseFuncion(funcion);
				if (result == null) result = caseSubproceso(funcion);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DiagramapseudocodigoPackage.PARAMETRO_FUNCION: {
				ParametroFuncion parametroFuncion = (ParametroFuncion)theEObject;
				T result = caseParametroFuncion(parametroFuncion);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DiagramapseudocodigoPackage.LEER: {
				Leer leer = (Leer)theEObject;
				T result = caseLeer(leer);
				if (result == null) result = caseSentencias(leer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DiagramapseudocodigoPackage.NUMERO_DECIMAL: {
				NumeroDecimal numeroDecimal = (NumeroDecimal)theEObject;
				T result = caseNumeroDecimal(numeroDecimal);
				if (result == null) result = caseOperador(numeroDecimal);
				if (result == null) result = casevalor(numeroDecimal);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DiagramapseudocodigoPackage.VALOR: {
				valor valor = (valor)theEObject;
				T result = casevalor(valor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DiagramapseudocodigoPackage.OPERACION: {
				operacion operacion = (operacion)theEObject;
				T result = caseoperacion(operacion);
				if (result == null) result = casevalor(operacion);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DiagramapseudocodigoPackage.OPERANDO_IZQ: {
				operando_izq operando_izq = (operando_izq)theEObject;
				T result = caseoperando_izq(operando_izq);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DiagramapseudocodigoPackage.OPERANDO_DER: {
				operando_der operando_der = (operando_der)theEObject;
				T result = caseoperando_der(operando_der);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DiagramapseudocodigoPackage.VALOR_BOOLEANO: {
				ValorBooleano valorBooleano = (ValorBooleano)theEObject;
				T result = caseValorBooleano(valorBooleano);
				if (result == null) result = caseOperador(valorBooleano);
				if (result == null) result = casevalor(valorBooleano);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DiagramapseudocodigoPackage.SI: {
				Si si = (Si)theEObject;
				T result = caseSi(si);
				if (result == null) result = caseBloque(si);
				if (result == null) result = caseSentencias(si);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DiagramapseudocodigoPackage.SINO: {
				Sino sino = (Sino)theEObject;
				T result = caseSino(sino);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DiagramapseudocodigoPackage.BLOQUE: {
				Bloque bloque = (Bloque)theEObject;
				T result = caseBloque(bloque);
				if (result == null) result = caseSentencias(bloque);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DiagramapseudocodigoPackage.MIENTRAS: {
				mientras mientras = (mientras)theEObject;
				T result = casemientras(mientras);
				if (result == null) result = caseBloque(mientras);
				if (result == null) result = caseSentencias(mientras);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DiagramapseudocodigoPackage.REPETIR: {
				repetir repetir = (repetir)theEObject;
				T result = caserepetir(repetir);
				if (result == null) result = caseBloque(repetir);
				if (result == null) result = caseSentencias(repetir);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DiagramapseudocodigoPackage.DESDE: {
				desde desde = (desde)theEObject;
				T result = casedesde(desde);
				if (result == null) result = caseBloque(desde);
				if (result == null) result = caseSentencias(desde);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DiagramapseudocodigoPackage.INCREMENTO: {
				incremento incremento = (incremento)theEObject;
				T result = caseincremento(incremento);
				if (result == null) result = caseSentencias(incremento);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DiagramapseudocodigoPackage.SUBPROCESO: {
				Subproceso subproceso = (Subproceso)theEObject;
				T result = caseSubproceso(subproceso);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DiagramapseudocodigoPackage.PROCEDIMIENTO: {
				Procedimiento procedimiento = (Procedimiento)theEObject;
				T result = caseProcedimiento(procedimiento);
				if (result == null) result = caseSubproceso(procedimiento);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DiagramapseudocodigoPackage.CARACTER: {
				Caracter caracter = (Caracter)theEObject;
				T result = caseCaracter(caracter);
				if (result == null) result = caseOperador(caracter);
				if (result == null) result = casevalor(caracter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DiagramapseudocodigoPackage.INTERNAS: {
				Internas internas = (Internas)theEObject;
				T result = caseInternas(internas);
				if (result == null) result = casevalor(internas);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DiagramapseudocodigoPackage.SEGUN: {
				segun segun = (segun)theEObject;
				T result = casesegun(segun);
				if (result == null) result = caseBloque(segun);
				if (result == null) result = caseSentencias(segun);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DiagramapseudocodigoPackage.DEVOLVER: {
				Devolver devolver = (Devolver)theEObject;
				T result = caseDevolver(devolver);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DiagramapseudocodigoPackage.CASO: {
				Caso caso = (Caso)theEObject;
				T result = caseCaso(caso);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DiagramapseudocodigoPackage.UNARIA: {
				unaria unaria = (unaria)theEObject;
				T result = caseunaria(unaria);
				if (result == null) result = casevalor(unaria);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DiagramapseudocodigoPackage.CONSTANTES: {
				Constantes constantes = (Constantes)theEObject;
				T result = caseConstantes(constantes);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DiagramapseudocodigoPackage.VECTOR: {
				Vector vector = (Vector)theEObject;
				T result = caseVector(vector);
				if (result == null) result = caseTipoComplejo(vector);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DiagramapseudocodigoPackage.DECLARACION_PROPIA: {
				DeclaracionPropia declaracionPropia = (DeclaracionPropia)theEObject;
				T result = caseDeclaracionPropia(declaracionPropia);
				if (result == null) result = caseDeclaracion(declaracionPropia);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DiagramapseudocodigoPackage.DECLARACION: {
				Declaracion declaracion = (Declaracion)theEObject;
				T result = caseDeclaracion(declaracion);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DiagramapseudocodigoPackage.MATRIZ: {
				Matriz matriz = (Matriz)theEObject;
				T result = caseMatriz(matriz);
				if (result == null) result = caseTipoComplejo(matriz);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DiagramapseudocodigoPackage.TIPO_COMPLEJO: {
				TipoComplejo tipoComplejo = (TipoComplejo)theEObject;
				T result = caseTipoComplejo(tipoComplejo);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DiagramapseudocodigoPackage.REGISTRO: {
				Registro registro = (Registro)theEObject;
				T result = caseRegistro(registro);
				if (result == null) result = caseTipoComplejo(registro);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DiagramapseudocodigoPackage.TIPO: {
				Tipo tipo = (Tipo)theEObject;
				T result = caseTipo(tipo);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DiagramapseudocodigoPackage.TIPO_DEFINIDO: {
				TipoDefinido tipoDefinido = (TipoDefinido)theEObject;
				T result = caseTipoDefinido(tipoDefinido);
				if (result == null) result = caseTipo(tipoDefinido);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DiagramapseudocodigoPackage.TIPO_EXISTENTE: {
				TipoExistente tipoExistente = (TipoExistente)theEObject;
				T result = caseTipoExistente(tipoExistente);
				if (result == null) result = caseTipo(tipoExistente);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DiagramapseudocodigoPackage.ARCHIVO: {
				Archivo archivo = (Archivo)theEObject;
				T result = caseArchivo(archivo);
				if (result == null) result = caseTipoComplejo(archivo);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DiagramapseudocodigoPackage.ENUMERADO: {
				Enumerado enumerado = (Enumerado)theEObject;
				T result = caseEnumerado(enumerado);
				if (result == null) result = caseTipoComplejo(enumerado);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DiagramapseudocodigoPackage.SUBRANGO: {
				Subrango subrango = (Subrango)theEObject;
				T result = caseSubrango(subrango);
				if (result == null) result = caseTipoComplejo(subrango);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DiagramapseudocodigoPackage.VALOR_COMPLEJO: {
				ValorComplejo valorComplejo = (ValorComplejo)theEObject;
				T result = caseValorComplejo(valorComplejo);
				if (result == null) result = caseOperador(valorComplejo);
				if (result == null) result = caseSentencias(valorComplejo);
				if (result == null) result = casevalor(valorComplejo);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DiagramapseudocodigoPackage.VALOR_REGISTRO: {
				ValorRegistro valorRegistro = (ValorRegistro)theEObject;
				T result = caseValorRegistro(valorRegistro);
				if (result == null) result = caseValorComplejo(valorRegistro);
				if (result == null) result = caseOperador(valorRegistro);
				if (result == null) result = caseSentencias(valorRegistro);
				if (result == null) result = casevalor(valorRegistro);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DiagramapseudocodigoPackage.CAMPO_REGISTRO: {
				CampoRegistro campoRegistro = (CampoRegistro)theEObject;
				T result = caseCampoRegistro(campoRegistro);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DiagramapseudocodigoPackage.ASIGNACION_NORMAL: {
				AsignacionNormal asignacionNormal = (AsignacionNormal)theEObject;
				T result = caseAsignacionNormal(asignacionNormal);
				if (result == null) result = caseAsignacion(asignacionNormal);
				if (result == null) result = caseSentencias(asignacionNormal);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DiagramapseudocodigoPackage.ASIGNACION_COMPLEJA: {
				AsignacionCompleja asignacionCompleja = (AsignacionCompleja)theEObject;
				T result = caseAsignacionCompleja(asignacionCompleja);
				if (result == null) result = caseAsignacion(asignacionCompleja);
				if (result == null) result = caseSentencias(asignacionCompleja);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Codigo</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Codigo</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCodigo(Codigo object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Inicio</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Inicio</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInicio(Inicio object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sentencias</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sentencias</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSentencias(Sentencias object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Declaracion Variable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Declaracion Variable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDeclaracionVariable(DeclaracionVariable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Llamada Funcion</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Llamada Funcion</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLlamadaFuncion(LlamadaFuncion object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Variable ID</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Variable ID</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVariableID(VariableID object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>cadena</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>cadena</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casecadena(cadena object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Const Cadena</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Const Cadena</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConstCadena(ConstCadena object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Variable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Variable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVariable(Variable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Operador</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Operador</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOperador(Operador object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Numero Entero</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Numero Entero</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNumeroEntero(NumeroEntero object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Asignacion</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Asignacion</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAsignacion(Asignacion object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Escribir</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Escribir</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEscribir(Escribir object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Funcion</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Funcion</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFuncion(Funcion object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Parametro Funcion</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Parametro Funcion</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseParametroFuncion(ParametroFuncion object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Leer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Leer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLeer(Leer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Numero Decimal</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Numero Decimal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNumeroDecimal(NumeroDecimal object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>valor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>valor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casevalor(valor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>operacion</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>operacion</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseoperacion(operacion object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>operando izq</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>operando izq</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseoperando_izq(operando_izq object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>operando der</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>operando der</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseoperando_der(operando_der object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Valor Booleano</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Valor Booleano</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseValorBooleano(ValorBooleano object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Si</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Si</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSi(Si object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sino</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sino</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSino(Sino object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bloque</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bloque</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBloque(Bloque object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>mientras</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>mientras</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casemientras(mientras object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>repetir</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>repetir</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caserepetir(repetir object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>desde</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>desde</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casedesde(desde object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>incremento</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>incremento</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseincremento(incremento object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Subproceso</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Subproceso</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSubproceso(Subproceso object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Procedimiento</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Procedimiento</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProcedimiento(Procedimiento object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Caracter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Caracter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCaracter(Caracter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Internas</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Internas</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInternas(Internas object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>segun</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>segun</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casesegun(segun object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Devolver</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Devolver</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDevolver(Devolver object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Caso</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Caso</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCaso(Caso object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>unaria</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>unaria</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseunaria(unaria object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Constantes</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Constantes</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConstantes(Constantes object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Vector</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Vector</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVector(Vector object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Declaracion Propia</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Declaracion Propia</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDeclaracionPropia(DeclaracionPropia object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Declaracion</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Declaracion</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDeclaracion(Declaracion object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Matriz</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Matriz</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMatriz(Matriz object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tipo Complejo</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tipo Complejo</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTipoComplejo(TipoComplejo object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Registro</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Registro</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRegistro(Registro object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tipo</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tipo</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTipo(Tipo object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tipo Definido</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tipo Definido</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTipoDefinido(TipoDefinido object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tipo Existente</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tipo Existente</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTipoExistente(TipoExistente object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Archivo</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Archivo</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArchivo(Archivo object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Enumerado</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Enumerado</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEnumerado(Enumerado object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Subrango</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Subrango</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSubrango(Subrango object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Valor Complejo</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Valor Complejo</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseValorComplejo(ValorComplejo object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Valor Registro</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Valor Registro</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseValorRegistro(ValorRegistro object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Campo Registro</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Campo Registro</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCampoRegistro(CampoRegistro object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Asignacion Normal</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Asignacion Normal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAsignacionNormal(AsignacionNormal object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Asignacion Compleja</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Asignacion Compleja</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAsignacionCompleja(AsignacionCompleja object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //DiagramapseudocodigoSwitch
