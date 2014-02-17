/**
 */
package diagramapseudocodigo;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see diagramapseudocodigo.DiagramapseudocodigoPackage
 * @generated
 */
public interface DiagramapseudocodigoFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DiagramapseudocodigoFactory eINSTANCE = diagramapseudocodigo.impl.DiagramapseudocodigoFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Codigo</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Codigo</em>'.
	 * @generated
	 */
	Codigo createCodigo();

	/**
	 * Returns a new object of class '<em>Inicio</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Inicio</em>'.
	 * @generated
	 */
	Inicio createInicio();

	/**
	 * Returns a new object of class '<em>Declaracion Variable</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Declaracion Variable</em>'.
	 * @generated
	 */
	DeclaracionVariable createDeclaracionVariable();

	/**
	 * Returns a new object of class '<em>Llamada Funcion</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Llamada Funcion</em>'.
	 * @generated
	 */
	LlamadaFuncion createLlamadaFuncion();

	/**
	 * Returns a new object of class '<em>Variable ID</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Variable ID</em>'.
	 * @generated
	 */
	VariableID createVariableID();

	/**
	 * Returns a new object of class '<em>cadena</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>cadena</em>'.
	 * @generated
	 */
	cadena createcadena();

	/**
	 * Returns a new object of class '<em>Const Cadena</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Const Cadena</em>'.
	 * @generated
	 */
	ConstCadena createConstCadena();

	/**
	 * Returns a new object of class '<em>Variable</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Variable</em>'.
	 * @generated
	 */
	Variable createVariable();

	/**
	 * Returns a new object of class '<em>Numero Entero</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Numero Entero</em>'.
	 * @generated
	 */
	NumeroEntero createNumeroEntero();

	/**
	 * Returns a new object of class '<em>Asignacion</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Asignacion</em>'.
	 * @generated
	 */
	Asignacion createAsignacion();

	/**
	 * Returns a new object of class '<em>Escribir</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Escribir</em>'.
	 * @generated
	 */
	Escribir createEscribir();

	/**
	 * Returns a new object of class '<em>Funcion</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Funcion</em>'.
	 * @generated
	 */
	Funcion createFuncion();

	/**
	 * Returns a new object of class '<em>Parametro Funcion</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Parametro Funcion</em>'.
	 * @generated
	 */
	ParametroFuncion createParametroFuncion();

	/**
	 * Returns a new object of class '<em>Leer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Leer</em>'.
	 * @generated
	 */
	Leer createLeer();

	/**
	 * Returns a new object of class '<em>Numero Decimal</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Numero Decimal</em>'.
	 * @generated
	 */
	NumeroDecimal createNumeroDecimal();

	/**
	 * Returns a new object of class '<em>operacion</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>operacion</em>'.
	 * @generated
	 */
	operacion createoperacion();

	/**
	 * Returns a new object of class '<em>operando izq</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>operando izq</em>'.
	 * @generated
	 */
	operando_izq createoperando_izq();

	/**
	 * Returns a new object of class '<em>operando der</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>operando der</em>'.
	 * @generated
	 */
	operando_der createoperando_der();

	/**
	 * Returns a new object of class '<em>Valor Booleano</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Valor Booleano</em>'.
	 * @generated
	 */
	ValorBooleano createValorBooleano();

	/**
	 * Returns a new object of class '<em>Si</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Si</em>'.
	 * @generated
	 */
	Si createSi();

	/**
	 * Returns a new object of class '<em>Sino</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sino</em>'.
	 * @generated
	 */
	Sino createSino();

	/**
	 * Returns a new object of class '<em>mientras</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>mientras</em>'.
	 * @generated
	 */
	mientras createmientras();

	/**
	 * Returns a new object of class '<em>repetir</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>repetir</em>'.
	 * @generated
	 */
	repetir createrepetir();

	/**
	 * Returns a new object of class '<em>desde</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>desde</em>'.
	 * @generated
	 */
	desde createdesde();

	/**
	 * Returns a new object of class '<em>incremento</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>incremento</em>'.
	 * @generated
	 */
	incremento createincremento();

	/**
	 * Returns a new object of class '<em>Procedimiento</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Procedimiento</em>'.
	 * @generated
	 */
	Procedimiento createProcedimiento();

	/**
	 * Returns a new object of class '<em>Caracter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Caracter</em>'.
	 * @generated
	 */
	Caracter createCaracter();

	/**
	 * Returns a new object of class '<em>Internas</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Internas</em>'.
	 * @generated
	 */
	Internas createInternas();

	/**
	 * Returns a new object of class '<em>segun</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>segun</em>'.
	 * @generated
	 */
	segun createsegun();

	/**
	 * Returns a new object of class '<em>Devolver</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Devolver</em>'.
	 * @generated
	 */
	Devolver createDevolver();

	/**
	 * Returns a new object of class '<em>Caso</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Caso</em>'.
	 * @generated
	 */
	Caso createCaso();

	/**
	 * Returns a new object of class '<em>unaria</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>unaria</em>'.
	 * @generated
	 */
	unaria createunaria();

	/**
	 * Returns a new object of class '<em>Constantes</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Constantes</em>'.
	 * @generated
	 */
	Constantes createConstantes();

	/**
	 * Returns a new object of class '<em>Vector</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Vector</em>'.
	 * @generated
	 */
	Vector createVector();

	/**
	 * Returns a new object of class '<em>Declaracion Propia</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Declaracion Propia</em>'.
	 * @generated
	 */
	DeclaracionPropia createDeclaracionPropia();

	/**
	 * Returns a new object of class '<em>Declaracion</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Declaracion</em>'.
	 * @generated
	 */
	Declaracion createDeclaracion();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	DiagramapseudocodigoPackage getDiagramapseudocodigoPackage();

} //DiagramapseudocodigoFactory
