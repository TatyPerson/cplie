/**
 */
package diagramapseudocodigo;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see diagramapseudocodigo.DiagramapseudocodigoFactory
 * @model kind="package"
 * @generated
 */
public interface DiagramapseudocodigoPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "diagramapseudocodigo";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://diagramapseudocodigo/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "diagramapseudocodigo";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DiagramapseudocodigoPackage eINSTANCE = diagramapseudocodigo.impl.DiagramapseudocodigoPackageImpl.init();

	/**
	 * The meta object id for the '{@link diagramapseudocodigo.impl.CodigoImpl <em>Codigo</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see diagramapseudocodigo.impl.CodigoImpl
	 * @see diagramapseudocodigo.impl.DiagramapseudocodigoPackageImpl#getCodigo()
	 * @generated
	 */
	int CODIGO = 0;

	/**
	 * The feature id for the '<em><b>Tiene</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODIGO__TIENE = 0;

	/**
	 * The feature id for the '<em><b>Funcion</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODIGO__FUNCION = 1;

	/**
	 * The feature id for the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODIGO__NOMBRE = 2;

	/**
	 * The number of structural features of the '<em>Codigo</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODIGO_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Codigo</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODIGO_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link diagramapseudocodigo.impl.InicioImpl <em>Inicio</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see diagramapseudocodigo.impl.InicioImpl
	 * @see diagramapseudocodigo.impl.DiagramapseudocodigoPackageImpl#getInicio()
	 * @generated
	 */
	int INICIO = 1;

	/**
	 * The feature id for the '<em><b>Tiene</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INICIO__TIENE = 0;

	/**
	 * The feature id for the '<em><b>Declaracionvariable</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INICIO__DECLARACIONVARIABLE = 1;

	/**
	 * The number of structural features of the '<em>Inicio</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INICIO_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Inicio</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INICIO_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link diagramapseudocodigo.impl.SentenciasImpl <em>Sentencias</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see diagramapseudocodigo.impl.SentenciasImpl
	 * @see diagramapseudocodigo.impl.DiagramapseudocodigoPackageImpl#getSentencias()
	 * @generated
	 */
	int SENTENCIAS = 2;

	/**
	 * The number of structural features of the '<em>Sentencias</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENTENCIAS_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Sentencias</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENTENCIAS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link diagramapseudocodigo.impl.DeclaracionVariableImpl <em>Declaracion Variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see diagramapseudocodigo.impl.DeclaracionVariableImpl
	 * @see diagramapseudocodigo.impl.DiagramapseudocodigoPackageImpl#getDeclaracionVariable()
	 * @generated
	 */
	int DECLARACION_VARIABLE = 3;

	/**
	 * The feature id for the '<em><b>Tipo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECLARACION_VARIABLE__TIPO = 0;

	/**
	 * The feature id for the '<em><b>Tiene IDs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECLARACION_VARIABLE__TIENE_IDS = 1;

	/**
	 * The number of structural features of the '<em>Declaracion Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECLARACION_VARIABLE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Declaracion Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECLARACION_VARIABLE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link diagramapseudocodigo.impl.LlamadaFuncionImpl <em>Llamada Funcion</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see diagramapseudocodigo.impl.LlamadaFuncionImpl
	 * @see diagramapseudocodigo.impl.DiagramapseudocodigoPackageImpl#getLlamadaFuncion()
	 * @generated
	 */
	int LLAMADA_FUNCION = 4;

	/**
	 * The feature id for the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LLAMADA_FUNCION__NOMBRE = SENTENCIAS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Operador</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LLAMADA_FUNCION__OPERADOR = SENTENCIAS_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Llamada Funcion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LLAMADA_FUNCION_FEATURE_COUNT = SENTENCIAS_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Llamada Funcion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LLAMADA_FUNCION_OPERATION_COUNT = SENTENCIAS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link diagramapseudocodigo.impl.valorImpl <em>valor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see diagramapseudocodigo.impl.valorImpl
	 * @see diagramapseudocodigo.impl.DiagramapseudocodigoPackageImpl#getvalor()
	 * @generated
	 */
	int VALOR = 17;

	/**
	 * The number of structural features of the '<em>valor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALOR_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>valor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALOR_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link diagramapseudocodigo.impl.OperadorImpl <em>Operador</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see diagramapseudocodigo.impl.OperadorImpl
	 * @see diagramapseudocodigo.impl.DiagramapseudocodigoPackageImpl#getOperador()
	 * @generated
	 */
	int OPERADOR = 9;

	/**
	 * The number of structural features of the '<em>Operador</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERADOR_FEATURE_COUNT = VALOR_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Operador</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERADOR_OPERATION_COUNT = VALOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link diagramapseudocodigo.impl.VariableIDImpl <em>Variable ID</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see diagramapseudocodigo.impl.VariableIDImpl
	 * @see diagramapseudocodigo.impl.DiagramapseudocodigoPackageImpl#getVariableID()
	 * @generated
	 */
	int VARIABLE_ID = 5;

	/**
	 * The feature id for the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_ID__NOMBRE = OPERADOR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Mat</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_ID__MAT = OPERADOR_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Variable ID</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_ID_FEATURE_COUNT = OPERADOR_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Variable ID</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_ID_OPERATION_COUNT = OPERADOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link diagramapseudocodigo.impl.cadenaImpl <em>cadena</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see diagramapseudocodigo.impl.cadenaImpl
	 * @see diagramapseudocodigo.impl.DiagramapseudocodigoPackageImpl#getcadena()
	 * @generated
	 */
	int CADENA = 6;

	/**
	 * The number of structural features of the '<em>cadena</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CADENA_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>cadena</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CADENA_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link diagramapseudocodigo.impl.ConstCadenaImpl <em>Const Cadena</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see diagramapseudocodigo.impl.ConstCadenaImpl
	 * @see diagramapseudocodigo.impl.DiagramapseudocodigoPackageImpl#getConstCadena()
	 * @generated
	 */
	int CONST_CADENA = 7;

	/**
	 * The feature id for the '<em><b>Contenido</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONST_CADENA__CONTENIDO = OPERADOR_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Const Cadena</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONST_CADENA_FEATURE_COUNT = OPERADOR_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Const Cadena</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONST_CADENA_OPERATION_COUNT = OPERADOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link diagramapseudocodigo.impl.VariableImpl <em>Variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see diagramapseudocodigo.impl.VariableImpl
	 * @see diagramapseudocodigo.impl.DiagramapseudocodigoPackageImpl#getVariable()
	 * @generated
	 */
	int VARIABLE = 8;

	/**
	 * The feature id for the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__NOMBRE = 0;

	/**
	 * The feature id for the '<em><b>Mat</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__MAT = 1;

	/**
	 * The number of structural features of the '<em>Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link diagramapseudocodigo.impl.NumeroEnteroImpl <em>Numero Entero</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see diagramapseudocodigo.impl.NumeroEnteroImpl
	 * @see diagramapseudocodigo.impl.DiagramapseudocodigoPackageImpl#getNumeroEntero()
	 * @generated
	 */
	int NUMERO_ENTERO = 10;

	/**
	 * The feature id for the '<em><b>Valor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMERO_ENTERO__VALOR = OPERADOR_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Numero Entero</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMERO_ENTERO_FEATURE_COUNT = OPERADOR_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Numero Entero</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMERO_ENTERO_OPERATION_COUNT = OPERADOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link diagramapseudocodigo.impl.AsignacionImpl <em>Asignacion</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see diagramapseudocodigo.impl.AsignacionImpl
	 * @see diagramapseudocodigo.impl.DiagramapseudocodigoPackageImpl#getAsignacion()
	 * @generated
	 */
	int ASIGNACION = 11;

	/**
	 * The feature id for the '<em><b>Lvalue</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASIGNACION__LVALUE = SENTENCIAS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Operador</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASIGNACION__OPERADOR = SENTENCIAS_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Mat</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASIGNACION__MAT = SENTENCIAS_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Asignacion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASIGNACION_FEATURE_COUNT = SENTENCIAS_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Asignacion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASIGNACION_OPERATION_COUNT = SENTENCIAS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link diagramapseudocodigo.impl.EscribirImpl <em>Escribir</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see diagramapseudocodigo.impl.EscribirImpl
	 * @see diagramapseudocodigo.impl.DiagramapseudocodigoPackageImpl#getEscribir()
	 * @generated
	 */
	int ESCRIBIR = 12;

	/**
	 * The feature id for the '<em><b>Operador</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESCRIBIR__OPERADOR = SENTENCIAS_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Escribir</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESCRIBIR_FEATURE_COUNT = SENTENCIAS_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Escribir</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESCRIBIR_OPERATION_COUNT = SENTENCIAS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link diagramapseudocodigo.impl.SubprocesoImpl <em>Subproceso</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see diagramapseudocodigo.impl.SubprocesoImpl
	 * @see diagramapseudocodigo.impl.DiagramapseudocodigoPackageImpl#getSubproceso()
	 * @generated
	 */
	int SUBPROCESO = 29;

	/**
	 * The feature id for the '<em><b>Parametrofuncion</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBPROCESO__PARAMETROFUNCION = 0;

	/**
	 * The feature id for the '<em><b>Sentencias</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBPROCESO__SENTENCIAS = 1;

	/**
	 * The feature id for the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBPROCESO__NOMBRE = 2;

	/**
	 * The feature id for the '<em><b>Declaracionvariable</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBPROCESO__DECLARACIONVARIABLE = 3;

	/**
	 * The number of structural features of the '<em>Subproceso</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBPROCESO_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Subproceso</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBPROCESO_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link diagramapseudocodigo.impl.FuncionImpl <em>Funcion</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see diagramapseudocodigo.impl.FuncionImpl
	 * @see diagramapseudocodigo.impl.DiagramapseudocodigoPackageImpl#getFuncion()
	 * @generated
	 */
	int FUNCION = 13;

	/**
	 * The feature id for the '<em><b>Parametrofuncion</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCION__PARAMETROFUNCION = SUBPROCESO__PARAMETROFUNCION;

	/**
	 * The feature id for the '<em><b>Sentencias</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCION__SENTENCIAS = SUBPROCESO__SENTENCIAS;

	/**
	 * The feature id for the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCION__NOMBRE = SUBPROCESO__NOMBRE;

	/**
	 * The feature id for the '<em><b>Declaracionvariable</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCION__DECLARACIONVARIABLE = SUBPROCESO__DECLARACIONVARIABLE;

	/**
	 * The feature id for the '<em><b>Tipo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCION__TIPO = SUBPROCESO_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Devuelve</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCION__DEVUELVE = SUBPROCESO_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Funcion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCION_FEATURE_COUNT = SUBPROCESO_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Funcion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCION_OPERATION_COUNT = SUBPROCESO_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link diagramapseudocodigo.impl.ParametroFuncionImpl <em>Parametro Funcion</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see diagramapseudocodigo.impl.ParametroFuncionImpl
	 * @see diagramapseudocodigo.impl.DiagramapseudocodigoPackageImpl#getParametroFuncion()
	 * @generated
	 */
	int PARAMETRO_FUNCION = 14;

	/**
	 * The feature id for the '<em><b>Tipo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETRO_FUNCION__TIPO = 0;

	/**
	 * The feature id for the '<em><b>Variable</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETRO_FUNCION__VARIABLE = 1;

	/**
	 * The feature id for the '<em><b>Paso</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETRO_FUNCION__PASO = 2;

	/**
	 * The number of structural features of the '<em>Parametro Funcion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETRO_FUNCION_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Parametro Funcion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETRO_FUNCION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link diagramapseudocodigo.impl.LeerImpl <em>Leer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see diagramapseudocodigo.impl.LeerImpl
	 * @see diagramapseudocodigo.impl.DiagramapseudocodigoPackageImpl#getLeer()
	 * @generated
	 */
	int LEER = 15;

	/**
	 * The feature id for the '<em><b>Variable</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEER__VARIABLE = SENTENCIAS_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Leer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEER_FEATURE_COUNT = SENTENCIAS_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Leer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEER_OPERATION_COUNT = SENTENCIAS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link diagramapseudocodigo.impl.NumeroDecimalImpl <em>Numero Decimal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see diagramapseudocodigo.impl.NumeroDecimalImpl
	 * @see diagramapseudocodigo.impl.DiagramapseudocodigoPackageImpl#getNumeroDecimal()
	 * @generated
	 */
	int NUMERO_DECIMAL = 16;

	/**
	 * The feature id for the '<em><b>Valor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMERO_DECIMAL__VALOR = OPERADOR_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Numero Decimal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMERO_DECIMAL_FEATURE_COUNT = OPERADOR_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Numero Decimal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMERO_DECIMAL_OPERATION_COUNT = OPERADOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link diagramapseudocodigo.impl.operacionImpl <em>operacion</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see diagramapseudocodigo.impl.operacionImpl
	 * @see diagramapseudocodigo.impl.DiagramapseudocodigoPackageImpl#getoperacion()
	 * @generated
	 */
	int OPERACION = 18;

	/**
	 * The feature id for the '<em><b>Signo op</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERACION__SIGNO_OP = VALOR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Op izq</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERACION__OP_IZQ = VALOR_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Op der</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERACION__OP_DER = VALOR_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>operacion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERACION_FEATURE_COUNT = VALOR_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>operacion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERACION_OPERATION_COUNT = VALOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link diagramapseudocodigo.impl.operando_izqImpl <em>operando izq</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see diagramapseudocodigo.impl.operando_izqImpl
	 * @see diagramapseudocodigo.impl.DiagramapseudocodigoPackageImpl#getoperando_izq()
	 * @generated
	 */
	int OPERANDO_IZQ = 19;

	/**
	 * The feature id for the '<em><b>Oper izq</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERANDO_IZQ__OPER_IZQ = 0;

	/**
	 * The number of structural features of the '<em>operando izq</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERANDO_IZQ_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>operando izq</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERANDO_IZQ_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link diagramapseudocodigo.impl.operando_derImpl <em>operando der</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see diagramapseudocodigo.impl.operando_derImpl
	 * @see diagramapseudocodigo.impl.DiagramapseudocodigoPackageImpl#getoperando_der()
	 * @generated
	 */
	int OPERANDO_DER = 20;

	/**
	 * The feature id for the '<em><b>Oper der</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERANDO_DER__OPER_DER = 0;

	/**
	 * The number of structural features of the '<em>operando der</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERANDO_DER_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>operando der</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERANDO_DER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link diagramapseudocodigo.impl.ValorBooleanoImpl <em>Valor Booleano</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see diagramapseudocodigo.impl.ValorBooleanoImpl
	 * @see diagramapseudocodigo.impl.DiagramapseudocodigoPackageImpl#getValorBooleano()
	 * @generated
	 */
	int VALOR_BOOLEANO = 21;

	/**
	 * The feature id for the '<em><b>Valor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALOR_BOOLEANO__VALOR = OPERADOR_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Valor Booleano</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALOR_BOOLEANO_FEATURE_COUNT = OPERADOR_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Valor Booleano</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALOR_BOOLEANO_OPERATION_COUNT = OPERADOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link diagramapseudocodigo.impl.BloqueImpl <em>Bloque</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see diagramapseudocodigo.impl.BloqueImpl
	 * @see diagramapseudocodigo.impl.DiagramapseudocodigoPackageImpl#getBloque()
	 * @generated
	 */
	int BLOQUE = 24;

	/**
	 * The feature id for the '<em><b>Valor</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOQUE__VALOR = SENTENCIAS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Sentencias</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOQUE__SENTENCIAS = SENTENCIAS_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Bloque</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOQUE_FEATURE_COUNT = SENTENCIAS_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Bloque</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOQUE_OPERATION_COUNT = SENTENCIAS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link diagramapseudocodigo.impl.SiImpl <em>Si</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see diagramapseudocodigo.impl.SiImpl
	 * @see diagramapseudocodigo.impl.DiagramapseudocodigoPackageImpl#getSi()
	 * @generated
	 */
	int SI = 22;

	/**
	 * The feature id for the '<em><b>Valor</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SI__VALOR = BLOQUE__VALOR;

	/**
	 * The feature id for the '<em><b>Sentencias</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SI__SENTENCIAS = BLOQUE__SENTENCIAS;

	/**
	 * The feature id for the '<em><b>Sino</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SI__SINO = BLOQUE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Si</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SI_FEATURE_COUNT = BLOQUE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Si</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SI_OPERATION_COUNT = BLOQUE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link diagramapseudocodigo.impl.SinoImpl <em>Sino</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see diagramapseudocodigo.impl.SinoImpl
	 * @see diagramapseudocodigo.impl.DiagramapseudocodigoPackageImpl#getSino()
	 * @generated
	 */
	int SINO = 23;

	/**
	 * The feature id for the '<em><b>Sentencias</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINO__SENTENCIAS = 0;

	/**
	 * The number of structural features of the '<em>Sino</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINO_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Sino</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINO_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link diagramapseudocodigo.impl.mientrasImpl <em>mientras</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see diagramapseudocodigo.impl.mientrasImpl
	 * @see diagramapseudocodigo.impl.DiagramapseudocodigoPackageImpl#getmientras()
	 * @generated
	 */
	int MIENTRAS = 25;

	/**
	 * The feature id for the '<em><b>Valor</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIENTRAS__VALOR = BLOQUE__VALOR;

	/**
	 * The feature id for the '<em><b>Sentencias</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIENTRAS__SENTENCIAS = BLOQUE__SENTENCIAS;

	/**
	 * The number of structural features of the '<em>mientras</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIENTRAS_FEATURE_COUNT = BLOQUE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>mientras</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIENTRAS_OPERATION_COUNT = BLOQUE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link diagramapseudocodigo.impl.repetirImpl <em>repetir</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see diagramapseudocodigo.impl.repetirImpl
	 * @see diagramapseudocodigo.impl.DiagramapseudocodigoPackageImpl#getrepetir()
	 * @generated
	 */
	int REPETIR = 26;

	/**
	 * The feature id for the '<em><b>Valor</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPETIR__VALOR = BLOQUE__VALOR;

	/**
	 * The feature id for the '<em><b>Sentencias</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPETIR__SENTENCIAS = BLOQUE__SENTENCIAS;

	/**
	 * The number of structural features of the '<em>repetir</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPETIR_FEATURE_COUNT = BLOQUE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>repetir</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPETIR_OPERATION_COUNT = BLOQUE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link diagramapseudocodigo.impl.desdeImpl <em>desde</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see diagramapseudocodigo.impl.desdeImpl
	 * @see diagramapseudocodigo.impl.DiagramapseudocodigoPackageImpl#getdesde()
	 * @generated
	 */
	int DESDE = 27;

	/**
	 * The feature id for the '<em><b>Valor</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESDE__VALOR = BLOQUE__VALOR;

	/**
	 * The feature id for the '<em><b>Sentencias</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESDE__SENTENCIAS = BLOQUE__SENTENCIAS;

	/**
	 * The feature id for the '<em><b>Asignacion</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESDE__ASIGNACION = BLOQUE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>desde</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESDE_FEATURE_COUNT = BLOQUE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>desde</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESDE_OPERATION_COUNT = BLOQUE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link diagramapseudocodigo.impl.incrementoImpl <em>incremento</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see diagramapseudocodigo.impl.incrementoImpl
	 * @see diagramapseudocodigo.impl.DiagramapseudocodigoPackageImpl#getincremento()
	 * @generated
	 */
	int INCREMENTO = 28;

	/**
	 * The feature id for the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCREMENTO__NOMBRE = SENTENCIAS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Ssigno</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCREMENTO__SSIGNO = SENTENCIAS_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>incremento</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCREMENTO_FEATURE_COUNT = SENTENCIAS_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>incremento</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCREMENTO_OPERATION_COUNT = SENTENCIAS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link diagramapseudocodigo.impl.ProcedimientoImpl <em>Procedimiento</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see diagramapseudocodigo.impl.ProcedimientoImpl
	 * @see diagramapseudocodigo.impl.DiagramapseudocodigoPackageImpl#getProcedimiento()
	 * @generated
	 */
	int PROCEDIMIENTO = 30;

	/**
	 * The feature id for the '<em><b>Parametrofuncion</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCEDIMIENTO__PARAMETROFUNCION = SUBPROCESO__PARAMETROFUNCION;

	/**
	 * The feature id for the '<em><b>Sentencias</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCEDIMIENTO__SENTENCIAS = SUBPROCESO__SENTENCIAS;

	/**
	 * The feature id for the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCEDIMIENTO__NOMBRE = SUBPROCESO__NOMBRE;

	/**
	 * The feature id for the '<em><b>Declaracionvariable</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCEDIMIENTO__DECLARACIONVARIABLE = SUBPROCESO__DECLARACIONVARIABLE;

	/**
	 * The number of structural features of the '<em>Procedimiento</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCEDIMIENTO_FEATURE_COUNT = SUBPROCESO_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Procedimiento</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCEDIMIENTO_OPERATION_COUNT = SUBPROCESO_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link diagramapseudocodigo.impl.CaracterImpl <em>Caracter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see diagramapseudocodigo.impl.CaracterImpl
	 * @see diagramapseudocodigo.impl.DiagramapseudocodigoPackageImpl#getCaracter()
	 * @generated
	 */
	int CARACTER = 31;

	/**
	 * The feature id for the '<em><b>Contenido</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARACTER__CONTENIDO = OPERADOR_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Caracter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARACTER_FEATURE_COUNT = OPERADOR_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Caracter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARACTER_OPERATION_COUNT = OPERADOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link diagramapseudocodigo.impl.InternasImpl <em>Internas</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see diagramapseudocodigo.impl.InternasImpl
	 * @see diagramapseudocodigo.impl.DiagramapseudocodigoPackageImpl#getInternas()
	 * @generated
	 */
	int INTERNAS = 32;

	/**
	 * The feature id for the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAS__NOMBRE = SENTENCIAS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Operador</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAS__OPERADOR = SENTENCIAS_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Internas</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAS_FEATURE_COUNT = SENTENCIAS_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Internas</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAS_OPERATION_COUNT = SENTENCIAS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link diagramapseudocodigo.TipoVariable <em>Tipo Variable</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see diagramapseudocodigo.TipoVariable
	 * @see diagramapseudocodigo.impl.DiagramapseudocodigoPackageImpl#getTipoVariable()
	 * @generated
	 */
	int TIPO_VARIABLE = 33;

	/**
	 * The meta object id for the '{@link diagramapseudocodigo.signo <em>signo</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see diagramapseudocodigo.signo
	 * @see diagramapseudocodigo.impl.DiagramapseudocodigoPackageImpl#getsigno()
	 * @generated
	 */
	int SIGNO = 34;

	/**
	 * The meta object id for the '{@link diagramapseudocodigo.booleano <em>booleano</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see diagramapseudocodigo.booleano
	 * @see diagramapseudocodigo.impl.DiagramapseudocodigoPackageImpl#getbooleano()
	 * @generated
	 */
	int BOOLEANO = 35;

	/**
	 * The meta object id for the '{@link diagramapseudocodigo.inc <em>inc</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see diagramapseudocodigo.inc
	 * @see diagramapseudocodigo.impl.DiagramapseudocodigoPackageImpl#getinc()
	 * @generated
	 */
	int INC = 36;

	/**
	 * The meta object id for the '{@link diagramapseudocodigo.TipoPaso <em>Tipo Paso</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see diagramapseudocodigo.TipoPaso
	 * @see diagramapseudocodigo.impl.DiagramapseudocodigoPackageImpl#getTipoPaso()
	 * @generated
	 */
	int TIPO_PASO = 37;


	/**
	 * The meta object id for the '{@link diagramapseudocodigo.NombreInterna <em>Nombre Interna</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see diagramapseudocodigo.NombreInterna
	 * @see diagramapseudocodigo.impl.DiagramapseudocodigoPackageImpl#getNombreInterna()
	 * @generated
	 */
	int NOMBRE_INTERNA = 38;


	/**
	 * Returns the meta object for class '{@link diagramapseudocodigo.Codigo <em>Codigo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Codigo</em>'.
	 * @see diagramapseudocodigo.Codigo
	 * @generated
	 */
	EClass getCodigo();

	/**
	 * Returns the meta object for the containment reference '{@link diagramapseudocodigo.Codigo#getTiene <em>Tiene</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Tiene</em>'.
	 * @see diagramapseudocodigo.Codigo#getTiene()
	 * @see #getCodigo()
	 * @generated
	 */
	EReference getCodigo_Tiene();

	/**
	 * Returns the meta object for the containment reference list '{@link diagramapseudocodigo.Codigo#getFuncion <em>Funcion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Funcion</em>'.
	 * @see diagramapseudocodigo.Codigo#getFuncion()
	 * @see #getCodigo()
	 * @generated
	 */
	EReference getCodigo_Funcion();

	/**
	 * Returns the meta object for the attribute '{@link diagramapseudocodigo.Codigo#getNombre <em>Nombre</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nombre</em>'.
	 * @see diagramapseudocodigo.Codigo#getNombre()
	 * @see #getCodigo()
	 * @generated
	 */
	EAttribute getCodigo_Nombre();

	/**
	 * Returns the meta object for class '{@link diagramapseudocodigo.Inicio <em>Inicio</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Inicio</em>'.
	 * @see diagramapseudocodigo.Inicio
	 * @generated
	 */
	EClass getInicio();

	/**
	 * Returns the meta object for the containment reference list '{@link diagramapseudocodigo.Inicio#getTiene <em>Tiene</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Tiene</em>'.
	 * @see diagramapseudocodigo.Inicio#getTiene()
	 * @see #getInicio()
	 * @generated
	 */
	EReference getInicio_Tiene();

	/**
	 * Returns the meta object for the containment reference list '{@link diagramapseudocodigo.Inicio#getDeclaracionvariable <em>Declaracionvariable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Declaracionvariable</em>'.
	 * @see diagramapseudocodigo.Inicio#getDeclaracionvariable()
	 * @see #getInicio()
	 * @generated
	 */
	EReference getInicio_Declaracionvariable();

	/**
	 * Returns the meta object for class '{@link diagramapseudocodigo.Sentencias <em>Sentencias</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sentencias</em>'.
	 * @see diagramapseudocodigo.Sentencias
	 * @generated
	 */
	EClass getSentencias();

	/**
	 * Returns the meta object for class '{@link diagramapseudocodigo.DeclaracionVariable <em>Declaracion Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Declaracion Variable</em>'.
	 * @see diagramapseudocodigo.DeclaracionVariable
	 * @generated
	 */
	EClass getDeclaracionVariable();

	/**
	 * Returns the meta object for the attribute '{@link diagramapseudocodigo.DeclaracionVariable#getTipo <em>Tipo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tipo</em>'.
	 * @see diagramapseudocodigo.DeclaracionVariable#getTipo()
	 * @see #getDeclaracionVariable()
	 * @generated
	 */
	EAttribute getDeclaracionVariable_Tipo();

	/**
	 * Returns the meta object for the containment reference list '{@link diagramapseudocodigo.DeclaracionVariable#getTieneIDs <em>Tiene IDs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Tiene IDs</em>'.
	 * @see diagramapseudocodigo.DeclaracionVariable#getTieneIDs()
	 * @see #getDeclaracionVariable()
	 * @generated
	 */
	EReference getDeclaracionVariable_TieneIDs();

	/**
	 * Returns the meta object for class '{@link diagramapseudocodigo.LlamadaFuncion <em>Llamada Funcion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Llamada Funcion</em>'.
	 * @see diagramapseudocodigo.LlamadaFuncion
	 * @generated
	 */
	EClass getLlamadaFuncion();

	/**
	 * Returns the meta object for the attribute '{@link diagramapseudocodigo.LlamadaFuncion#getNombre <em>Nombre</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nombre</em>'.
	 * @see diagramapseudocodigo.LlamadaFuncion#getNombre()
	 * @see #getLlamadaFuncion()
	 * @generated
	 */
	EAttribute getLlamadaFuncion_Nombre();

	/**
	 * Returns the meta object for the containment reference list '{@link diagramapseudocodigo.LlamadaFuncion#getOperador <em>Operador</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Operador</em>'.
	 * @see diagramapseudocodigo.LlamadaFuncion#getOperador()
	 * @see #getLlamadaFuncion()
	 * @generated
	 */
	EReference getLlamadaFuncion_Operador();

	/**
	 * Returns the meta object for class '{@link diagramapseudocodigo.VariableID <em>Variable ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Variable ID</em>'.
	 * @see diagramapseudocodigo.VariableID
	 * @generated
	 */
	EClass getVariableID();

	/**
	 * Returns the meta object for the attribute '{@link diagramapseudocodigo.VariableID#getNombre <em>Nombre</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nombre</em>'.
	 * @see diagramapseudocodigo.VariableID#getNombre()
	 * @see #getVariableID()
	 * @generated
	 */
	EAttribute getVariableID_Nombre();

	/**
	 * Returns the meta object for the attribute list '{@link diagramapseudocodigo.VariableID#getMat <em>Mat</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mat</em>'.
	 * @see diagramapseudocodigo.VariableID#getMat()
	 * @see #getVariableID()
	 * @generated
	 */
	EAttribute getVariableID_Mat();

	/**
	 * Returns the meta object for class '{@link diagramapseudocodigo.cadena <em>cadena</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>cadena</em>'.
	 * @see diagramapseudocodigo.cadena
	 * @generated
	 */
	EClass getcadena();

	/**
	 * Returns the meta object for class '{@link diagramapseudocodigo.ConstCadena <em>Const Cadena</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Const Cadena</em>'.
	 * @see diagramapseudocodigo.ConstCadena
	 * @generated
	 */
	EClass getConstCadena();

	/**
	 * Returns the meta object for the attribute '{@link diagramapseudocodigo.ConstCadena#getContenido <em>Contenido</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Contenido</em>'.
	 * @see diagramapseudocodigo.ConstCadena#getContenido()
	 * @see #getConstCadena()
	 * @generated
	 */
	EAttribute getConstCadena_Contenido();

	/**
	 * Returns the meta object for class '{@link diagramapseudocodigo.Variable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Variable</em>'.
	 * @see diagramapseudocodigo.Variable
	 * @generated
	 */
	EClass getVariable();

	/**
	 * Returns the meta object for the attribute '{@link diagramapseudocodigo.Variable#getNombre <em>Nombre</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nombre</em>'.
	 * @see diagramapseudocodigo.Variable#getNombre()
	 * @see #getVariable()
	 * @generated
	 */
	EAttribute getVariable_Nombre();

	/**
	 * Returns the meta object for the attribute list '{@link diagramapseudocodigo.Variable#getMat <em>Mat</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mat</em>'.
	 * @see diagramapseudocodigo.Variable#getMat()
	 * @see #getVariable()
	 * @generated
	 */
	EAttribute getVariable_Mat();

	/**
	 * Returns the meta object for class '{@link diagramapseudocodigo.Operador <em>Operador</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Operador</em>'.
	 * @see diagramapseudocodigo.Operador
	 * @generated
	 */
	EClass getOperador();

	/**
	 * Returns the meta object for class '{@link diagramapseudocodigo.NumeroEntero <em>Numero Entero</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Numero Entero</em>'.
	 * @see diagramapseudocodigo.NumeroEntero
	 * @generated
	 */
	EClass getNumeroEntero();

	/**
	 * Returns the meta object for the attribute '{@link diagramapseudocodigo.NumeroEntero#getValor <em>Valor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Valor</em>'.
	 * @see diagramapseudocodigo.NumeroEntero#getValor()
	 * @see #getNumeroEntero()
	 * @generated
	 */
	EAttribute getNumeroEntero_Valor();

	/**
	 * Returns the meta object for class '{@link diagramapseudocodigo.Asignacion <em>Asignacion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Asignacion</em>'.
	 * @see diagramapseudocodigo.Asignacion
	 * @generated
	 */
	EClass getAsignacion();

	/**
	 * Returns the meta object for the attribute '{@link diagramapseudocodigo.Asignacion#getLvalue <em>Lvalue</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lvalue</em>'.
	 * @see diagramapseudocodigo.Asignacion#getLvalue()
	 * @see #getAsignacion()
	 * @generated
	 */
	EAttribute getAsignacion_Lvalue();

	/**
	 * Returns the meta object for the containment reference '{@link diagramapseudocodigo.Asignacion#getOperador <em>Operador</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Operador</em>'.
	 * @see diagramapseudocodigo.Asignacion#getOperador()
	 * @see #getAsignacion()
	 * @generated
	 */
	EReference getAsignacion_Operador();

	/**
	 * Returns the meta object for the attribute list '{@link diagramapseudocodigo.Asignacion#getMat <em>Mat</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mat</em>'.
	 * @see diagramapseudocodigo.Asignacion#getMat()
	 * @see #getAsignacion()
	 * @generated
	 */
	EAttribute getAsignacion_Mat();

	/**
	 * Returns the meta object for class '{@link diagramapseudocodigo.Escribir <em>Escribir</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Escribir</em>'.
	 * @see diagramapseudocodigo.Escribir
	 * @generated
	 */
	EClass getEscribir();

	/**
	 * Returns the meta object for the containment reference list '{@link diagramapseudocodigo.Escribir#getOperador <em>Operador</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Operador</em>'.
	 * @see diagramapseudocodigo.Escribir#getOperador()
	 * @see #getEscribir()
	 * @generated
	 */
	EReference getEscribir_Operador();

	/**
	 * Returns the meta object for class '{@link diagramapseudocodigo.Funcion <em>Funcion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Funcion</em>'.
	 * @see diagramapseudocodigo.Funcion
	 * @generated
	 */
	EClass getFuncion();

	/**
	 * Returns the meta object for the attribute '{@link diagramapseudocodigo.Funcion#getTipo <em>Tipo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tipo</em>'.
	 * @see diagramapseudocodigo.Funcion#getTipo()
	 * @see #getFuncion()
	 * @generated
	 */
	EAttribute getFuncion_Tipo();

	/**
	 * Returns the meta object for the containment reference '{@link diagramapseudocodigo.Funcion#getDevuelve <em>Devuelve</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Devuelve</em>'.
	 * @see diagramapseudocodigo.Funcion#getDevuelve()
	 * @see #getFuncion()
	 * @generated
	 */
	EReference getFuncion_Devuelve();

	/**
	 * Returns the meta object for class '{@link diagramapseudocodigo.ParametroFuncion <em>Parametro Funcion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parametro Funcion</em>'.
	 * @see diagramapseudocodigo.ParametroFuncion
	 * @generated
	 */
	EClass getParametroFuncion();

	/**
	 * Returns the meta object for the attribute '{@link diagramapseudocodigo.ParametroFuncion#getTipo <em>Tipo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tipo</em>'.
	 * @see diagramapseudocodigo.ParametroFuncion#getTipo()
	 * @see #getParametroFuncion()
	 * @generated
	 */
	EAttribute getParametroFuncion_Tipo();

	/**
	 * Returns the meta object for the containment reference '{@link diagramapseudocodigo.ParametroFuncion#getVariable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Variable</em>'.
	 * @see diagramapseudocodigo.ParametroFuncion#getVariable()
	 * @see #getParametroFuncion()
	 * @generated
	 */
	EReference getParametroFuncion_Variable();

	/**
	 * Returns the meta object for the attribute '{@link diagramapseudocodigo.ParametroFuncion#getPaso <em>Paso</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Paso</em>'.
	 * @see diagramapseudocodigo.ParametroFuncion#getPaso()
	 * @see #getParametroFuncion()
	 * @generated
	 */
	EAttribute getParametroFuncion_Paso();

	/**
	 * Returns the meta object for class '{@link diagramapseudocodigo.Leer <em>Leer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Leer</em>'.
	 * @see diagramapseudocodigo.Leer
	 * @generated
	 */
	EClass getLeer();

	/**
	 * Returns the meta object for the containment reference '{@link diagramapseudocodigo.Leer#getVariable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Variable</em>'.
	 * @see diagramapseudocodigo.Leer#getVariable()
	 * @see #getLeer()
	 * @generated
	 */
	EReference getLeer_Variable();

	/**
	 * Returns the meta object for class '{@link diagramapseudocodigo.NumeroDecimal <em>Numero Decimal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Numero Decimal</em>'.
	 * @see diagramapseudocodigo.NumeroDecimal
	 * @generated
	 */
	EClass getNumeroDecimal();

	/**
	 * Returns the meta object for the attribute '{@link diagramapseudocodigo.NumeroDecimal#getValor <em>Valor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Valor</em>'.
	 * @see diagramapseudocodigo.NumeroDecimal#getValor()
	 * @see #getNumeroDecimal()
	 * @generated
	 */
	EAttribute getNumeroDecimal_Valor();

	/**
	 * Returns the meta object for class '{@link diagramapseudocodigo.valor <em>valor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>valor</em>'.
	 * @see diagramapseudocodigo.valor
	 * @generated
	 */
	EClass getvalor();

	/**
	 * Returns the meta object for class '{@link diagramapseudocodigo.operacion <em>operacion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>operacion</em>'.
	 * @see diagramapseudocodigo.operacion
	 * @generated
	 */
	EClass getoperacion();

	/**
	 * Returns the meta object for the attribute '{@link diagramapseudocodigo.operacion#getSigno_op <em>Signo op</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Signo op</em>'.
	 * @see diagramapseudocodigo.operacion#getSigno_op()
	 * @see #getoperacion()
	 * @generated
	 */
	EAttribute getoperacion_Signo_op();

	/**
	 * Returns the meta object for the containment reference '{@link diagramapseudocodigo.operacion#getOp_izq <em>Op izq</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Op izq</em>'.
	 * @see diagramapseudocodigo.operacion#getOp_izq()
	 * @see #getoperacion()
	 * @generated
	 */
	EReference getoperacion_Op_izq();

	/**
	 * Returns the meta object for the containment reference '{@link diagramapseudocodigo.operacion#getOp_der <em>Op der</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Op der</em>'.
	 * @see diagramapseudocodigo.operacion#getOp_der()
	 * @see #getoperacion()
	 * @generated
	 */
	EReference getoperacion_Op_der();

	/**
	 * Returns the meta object for class '{@link diagramapseudocodigo.operando_izq <em>operando izq</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>operando izq</em>'.
	 * @see diagramapseudocodigo.operando_izq
	 * @generated
	 */
	EClass getoperando_izq();

	/**
	 * Returns the meta object for the containment reference '{@link diagramapseudocodigo.operando_izq#getOper_izq <em>Oper izq</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Oper izq</em>'.
	 * @see diagramapseudocodigo.operando_izq#getOper_izq()
	 * @see #getoperando_izq()
	 * @generated
	 */
	EReference getoperando_izq_Oper_izq();

	/**
	 * Returns the meta object for class '{@link diagramapseudocodigo.operando_der <em>operando der</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>operando der</em>'.
	 * @see diagramapseudocodigo.operando_der
	 * @generated
	 */
	EClass getoperando_der();

	/**
	 * Returns the meta object for the containment reference '{@link diagramapseudocodigo.operando_der#getOper_der <em>Oper der</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Oper der</em>'.
	 * @see diagramapseudocodigo.operando_der#getOper_der()
	 * @see #getoperando_der()
	 * @generated
	 */
	EReference getoperando_der_Oper_der();

	/**
	 * Returns the meta object for class '{@link diagramapseudocodigo.ValorBooleano <em>Valor Booleano</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Valor Booleano</em>'.
	 * @see diagramapseudocodigo.ValorBooleano
	 * @generated
	 */
	EClass getValorBooleano();

	/**
	 * Returns the meta object for the attribute '{@link diagramapseudocodigo.ValorBooleano#getValor <em>Valor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Valor</em>'.
	 * @see diagramapseudocodigo.ValorBooleano#getValor()
	 * @see #getValorBooleano()
	 * @generated
	 */
	EAttribute getValorBooleano_Valor();

	/**
	 * Returns the meta object for class '{@link diagramapseudocodigo.Si <em>Si</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Si</em>'.
	 * @see diagramapseudocodigo.Si
	 * @generated
	 */
	EClass getSi();

	/**
	 * Returns the meta object for the containment reference '{@link diagramapseudocodigo.Si#getSino <em>Sino</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Sino</em>'.
	 * @see diagramapseudocodigo.Si#getSino()
	 * @see #getSi()
	 * @generated
	 */
	EReference getSi_Sino();

	/**
	 * Returns the meta object for class '{@link diagramapseudocodigo.Sino <em>Sino</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sino</em>'.
	 * @see diagramapseudocodigo.Sino
	 * @generated
	 */
	EClass getSino();

	/**
	 * Returns the meta object for the containment reference list '{@link diagramapseudocodigo.Sino#getSentencias <em>Sentencias</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sentencias</em>'.
	 * @see diagramapseudocodigo.Sino#getSentencias()
	 * @see #getSino()
	 * @generated
	 */
	EReference getSino_Sentencias();

	/**
	 * Returns the meta object for class '{@link diagramapseudocodigo.Bloque <em>Bloque</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bloque</em>'.
	 * @see diagramapseudocodigo.Bloque
	 * @generated
	 */
	EClass getBloque();

	/**
	 * Returns the meta object for the containment reference '{@link diagramapseudocodigo.Bloque#getValor <em>Valor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Valor</em>'.
	 * @see diagramapseudocodigo.Bloque#getValor()
	 * @see #getBloque()
	 * @generated
	 */
	EReference getBloque_Valor();

	/**
	 * Returns the meta object for the containment reference list '{@link diagramapseudocodigo.Bloque#getSentencias <em>Sentencias</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sentencias</em>'.
	 * @see diagramapseudocodigo.Bloque#getSentencias()
	 * @see #getBloque()
	 * @generated
	 */
	EReference getBloque_Sentencias();

	/**
	 * Returns the meta object for class '{@link diagramapseudocodigo.mientras <em>mientras</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>mientras</em>'.
	 * @see diagramapseudocodigo.mientras
	 * @generated
	 */
	EClass getmientras();

	/**
	 * Returns the meta object for class '{@link diagramapseudocodigo.repetir <em>repetir</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>repetir</em>'.
	 * @see diagramapseudocodigo.repetir
	 * @generated
	 */
	EClass getrepetir();

	/**
	 * Returns the meta object for class '{@link diagramapseudocodigo.desde <em>desde</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>desde</em>'.
	 * @see diagramapseudocodigo.desde
	 * @generated
	 */
	EClass getdesde();

	/**
	 * Returns the meta object for the containment reference '{@link diagramapseudocodigo.desde#getAsignacion <em>Asignacion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Asignacion</em>'.
	 * @see diagramapseudocodigo.desde#getAsignacion()
	 * @see #getdesde()
	 * @generated
	 */
	EReference getdesde_Asignacion();

	/**
	 * Returns the meta object for class '{@link diagramapseudocodigo.incremento <em>incremento</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>incremento</em>'.
	 * @see diagramapseudocodigo.incremento
	 * @generated
	 */
	EClass getincremento();

	/**
	 * Returns the meta object for the attribute '{@link diagramapseudocodigo.incremento#getNombre <em>Nombre</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nombre</em>'.
	 * @see diagramapseudocodigo.incremento#getNombre()
	 * @see #getincremento()
	 * @generated
	 */
	EAttribute getincremento_Nombre();

	/**
	 * Returns the meta object for the attribute '{@link diagramapseudocodigo.incremento#getSsigno <em>Ssigno</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ssigno</em>'.
	 * @see diagramapseudocodigo.incremento#getSsigno()
	 * @see #getincremento()
	 * @generated
	 */
	EAttribute getincremento_Ssigno();

	/**
	 * Returns the meta object for class '{@link diagramapseudocodigo.Subproceso <em>Subproceso</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Subproceso</em>'.
	 * @see diagramapseudocodigo.Subproceso
	 * @generated
	 */
	EClass getSubproceso();

	/**
	 * Returns the meta object for the containment reference list '{@link diagramapseudocodigo.Subproceso#getParametrofuncion <em>Parametrofuncion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parametrofuncion</em>'.
	 * @see diagramapseudocodigo.Subproceso#getParametrofuncion()
	 * @see #getSubproceso()
	 * @generated
	 */
	EReference getSubproceso_Parametrofuncion();

	/**
	 * Returns the meta object for the containment reference list '{@link diagramapseudocodigo.Subproceso#getSentencias <em>Sentencias</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sentencias</em>'.
	 * @see diagramapseudocodigo.Subproceso#getSentencias()
	 * @see #getSubproceso()
	 * @generated
	 */
	EReference getSubproceso_Sentencias();

	/**
	 * Returns the meta object for the attribute '{@link diagramapseudocodigo.Subproceso#getNombre <em>Nombre</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nombre</em>'.
	 * @see diagramapseudocodigo.Subproceso#getNombre()
	 * @see #getSubproceso()
	 * @generated
	 */
	EAttribute getSubproceso_Nombre();

	/**
	 * Returns the meta object for the containment reference list '{@link diagramapseudocodigo.Subproceso#getDeclaracionvariable <em>Declaracionvariable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Declaracionvariable</em>'.
	 * @see diagramapseudocodigo.Subproceso#getDeclaracionvariable()
	 * @see #getSubproceso()
	 * @generated
	 */
	EReference getSubproceso_Declaracionvariable();

	/**
	 * Returns the meta object for class '{@link diagramapseudocodigo.Procedimiento <em>Procedimiento</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Procedimiento</em>'.
	 * @see diagramapseudocodigo.Procedimiento
	 * @generated
	 */
	EClass getProcedimiento();

	/**
	 * Returns the meta object for class '{@link diagramapseudocodigo.Caracter <em>Caracter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Caracter</em>'.
	 * @see diagramapseudocodigo.Caracter
	 * @generated
	 */
	EClass getCaracter();

	/**
	 * Returns the meta object for the attribute '{@link diagramapseudocodigo.Caracter#getContenido <em>Contenido</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Contenido</em>'.
	 * @see diagramapseudocodigo.Caracter#getContenido()
	 * @see #getCaracter()
	 * @generated
	 */
	EAttribute getCaracter_Contenido();

	/**
	 * Returns the meta object for class '{@link diagramapseudocodigo.Internas <em>Internas</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Internas</em>'.
	 * @see diagramapseudocodigo.Internas
	 * @generated
	 */
	EClass getInternas();

	/**
	 * Returns the meta object for the attribute '{@link diagramapseudocodigo.Internas#getNombre <em>Nombre</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nombre</em>'.
	 * @see diagramapseudocodigo.Internas#getNombre()
	 * @see #getInternas()
	 * @generated
	 */
	EAttribute getInternas_Nombre();

	/**
	 * Returns the meta object for the containment reference list '{@link diagramapseudocodigo.Internas#getOperador <em>Operador</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Operador</em>'.
	 * @see diagramapseudocodigo.Internas#getOperador()
	 * @see #getInternas()
	 * @generated
	 */
	EReference getInternas_Operador();

	/**
	 * Returns the meta object for enum '{@link diagramapseudocodigo.TipoVariable <em>Tipo Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Tipo Variable</em>'.
	 * @see diagramapseudocodigo.TipoVariable
	 * @generated
	 */
	EEnum getTipoVariable();

	/**
	 * Returns the meta object for enum '{@link diagramapseudocodigo.signo <em>signo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>signo</em>'.
	 * @see diagramapseudocodigo.signo
	 * @generated
	 */
	EEnum getsigno();

	/**
	 * Returns the meta object for enum '{@link diagramapseudocodigo.booleano <em>booleano</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>booleano</em>'.
	 * @see diagramapseudocodigo.booleano
	 * @generated
	 */
	EEnum getbooleano();

	/**
	 * Returns the meta object for enum '{@link diagramapseudocodigo.inc <em>inc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>inc</em>'.
	 * @see diagramapseudocodigo.inc
	 * @generated
	 */
	EEnum getinc();

	/**
	 * Returns the meta object for enum '{@link diagramapseudocodigo.TipoPaso <em>Tipo Paso</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Tipo Paso</em>'.
	 * @see diagramapseudocodigo.TipoPaso
	 * @generated
	 */
	EEnum getTipoPaso();

	/**
	 * Returns the meta object for enum '{@link diagramapseudocodigo.NombreInterna <em>Nombre Interna</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Nombre Interna</em>'.
	 * @see diagramapseudocodigo.NombreInterna
	 * @generated
	 */
	EEnum getNombreInterna();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	DiagramapseudocodigoFactory getDiagramapseudocodigoFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link diagramapseudocodigo.impl.CodigoImpl <em>Codigo</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see diagramapseudocodigo.impl.CodigoImpl
		 * @see diagramapseudocodigo.impl.DiagramapseudocodigoPackageImpl#getCodigo()
		 * @generated
		 */
		EClass CODIGO = eINSTANCE.getCodigo();

		/**
		 * The meta object literal for the '<em><b>Tiene</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CODIGO__TIENE = eINSTANCE.getCodigo_Tiene();

		/**
		 * The meta object literal for the '<em><b>Funcion</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CODIGO__FUNCION = eINSTANCE.getCodigo_Funcion();

		/**
		 * The meta object literal for the '<em><b>Nombre</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CODIGO__NOMBRE = eINSTANCE.getCodigo_Nombre();

		/**
		 * The meta object literal for the '{@link diagramapseudocodigo.impl.InicioImpl <em>Inicio</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see diagramapseudocodigo.impl.InicioImpl
		 * @see diagramapseudocodigo.impl.DiagramapseudocodigoPackageImpl#getInicio()
		 * @generated
		 */
		EClass INICIO = eINSTANCE.getInicio();

		/**
		 * The meta object literal for the '<em><b>Tiene</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INICIO__TIENE = eINSTANCE.getInicio_Tiene();

		/**
		 * The meta object literal for the '<em><b>Declaracionvariable</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INICIO__DECLARACIONVARIABLE = eINSTANCE.getInicio_Declaracionvariable();

		/**
		 * The meta object literal for the '{@link diagramapseudocodigo.impl.SentenciasImpl <em>Sentencias</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see diagramapseudocodigo.impl.SentenciasImpl
		 * @see diagramapseudocodigo.impl.DiagramapseudocodigoPackageImpl#getSentencias()
		 * @generated
		 */
		EClass SENTENCIAS = eINSTANCE.getSentencias();

		/**
		 * The meta object literal for the '{@link diagramapseudocodigo.impl.DeclaracionVariableImpl <em>Declaracion Variable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see diagramapseudocodigo.impl.DeclaracionVariableImpl
		 * @see diagramapseudocodigo.impl.DiagramapseudocodigoPackageImpl#getDeclaracionVariable()
		 * @generated
		 */
		EClass DECLARACION_VARIABLE = eINSTANCE.getDeclaracionVariable();

		/**
		 * The meta object literal for the '<em><b>Tipo</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DECLARACION_VARIABLE__TIPO = eINSTANCE.getDeclaracionVariable_Tipo();

		/**
		 * The meta object literal for the '<em><b>Tiene IDs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DECLARACION_VARIABLE__TIENE_IDS = eINSTANCE.getDeclaracionVariable_TieneIDs();

		/**
		 * The meta object literal for the '{@link diagramapseudocodigo.impl.LlamadaFuncionImpl <em>Llamada Funcion</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see diagramapseudocodigo.impl.LlamadaFuncionImpl
		 * @see diagramapseudocodigo.impl.DiagramapseudocodigoPackageImpl#getLlamadaFuncion()
		 * @generated
		 */
		EClass LLAMADA_FUNCION = eINSTANCE.getLlamadaFuncion();

		/**
		 * The meta object literal for the '<em><b>Nombre</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LLAMADA_FUNCION__NOMBRE = eINSTANCE.getLlamadaFuncion_Nombre();

		/**
		 * The meta object literal for the '<em><b>Operador</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LLAMADA_FUNCION__OPERADOR = eINSTANCE.getLlamadaFuncion_Operador();

		/**
		 * The meta object literal for the '{@link diagramapseudocodigo.impl.VariableIDImpl <em>Variable ID</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see diagramapseudocodigo.impl.VariableIDImpl
		 * @see diagramapseudocodigo.impl.DiagramapseudocodigoPackageImpl#getVariableID()
		 * @generated
		 */
		EClass VARIABLE_ID = eINSTANCE.getVariableID();

		/**
		 * The meta object literal for the '<em><b>Nombre</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VARIABLE_ID__NOMBRE = eINSTANCE.getVariableID_Nombre();

		/**
		 * The meta object literal for the '<em><b>Mat</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VARIABLE_ID__MAT = eINSTANCE.getVariableID_Mat();

		/**
		 * The meta object literal for the '{@link diagramapseudocodigo.impl.cadenaImpl <em>cadena</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see diagramapseudocodigo.impl.cadenaImpl
		 * @see diagramapseudocodigo.impl.DiagramapseudocodigoPackageImpl#getcadena()
		 * @generated
		 */
		EClass CADENA = eINSTANCE.getcadena();

		/**
		 * The meta object literal for the '{@link diagramapseudocodigo.impl.ConstCadenaImpl <em>Const Cadena</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see diagramapseudocodigo.impl.ConstCadenaImpl
		 * @see diagramapseudocodigo.impl.DiagramapseudocodigoPackageImpl#getConstCadena()
		 * @generated
		 */
		EClass CONST_CADENA = eINSTANCE.getConstCadena();

		/**
		 * The meta object literal for the '<em><b>Contenido</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONST_CADENA__CONTENIDO = eINSTANCE.getConstCadena_Contenido();

		/**
		 * The meta object literal for the '{@link diagramapseudocodigo.impl.VariableImpl <em>Variable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see diagramapseudocodigo.impl.VariableImpl
		 * @see diagramapseudocodigo.impl.DiagramapseudocodigoPackageImpl#getVariable()
		 * @generated
		 */
		EClass VARIABLE = eINSTANCE.getVariable();

		/**
		 * The meta object literal for the '<em><b>Nombre</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VARIABLE__NOMBRE = eINSTANCE.getVariable_Nombre();

		/**
		 * The meta object literal for the '<em><b>Mat</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VARIABLE__MAT = eINSTANCE.getVariable_Mat();

		/**
		 * The meta object literal for the '{@link diagramapseudocodigo.impl.OperadorImpl <em>Operador</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see diagramapseudocodigo.impl.OperadorImpl
		 * @see diagramapseudocodigo.impl.DiagramapseudocodigoPackageImpl#getOperador()
		 * @generated
		 */
		EClass OPERADOR = eINSTANCE.getOperador();

		/**
		 * The meta object literal for the '{@link diagramapseudocodigo.impl.NumeroEnteroImpl <em>Numero Entero</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see diagramapseudocodigo.impl.NumeroEnteroImpl
		 * @see diagramapseudocodigo.impl.DiagramapseudocodigoPackageImpl#getNumeroEntero()
		 * @generated
		 */
		EClass NUMERO_ENTERO = eINSTANCE.getNumeroEntero();

		/**
		 * The meta object literal for the '<em><b>Valor</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NUMERO_ENTERO__VALOR = eINSTANCE.getNumeroEntero_Valor();

		/**
		 * The meta object literal for the '{@link diagramapseudocodigo.impl.AsignacionImpl <em>Asignacion</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see diagramapseudocodigo.impl.AsignacionImpl
		 * @see diagramapseudocodigo.impl.DiagramapseudocodigoPackageImpl#getAsignacion()
		 * @generated
		 */
		EClass ASIGNACION = eINSTANCE.getAsignacion();

		/**
		 * The meta object literal for the '<em><b>Lvalue</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASIGNACION__LVALUE = eINSTANCE.getAsignacion_Lvalue();

		/**
		 * The meta object literal for the '<em><b>Operador</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASIGNACION__OPERADOR = eINSTANCE.getAsignacion_Operador();

		/**
		 * The meta object literal for the '<em><b>Mat</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASIGNACION__MAT = eINSTANCE.getAsignacion_Mat();

		/**
		 * The meta object literal for the '{@link diagramapseudocodigo.impl.EscribirImpl <em>Escribir</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see diagramapseudocodigo.impl.EscribirImpl
		 * @see diagramapseudocodigo.impl.DiagramapseudocodigoPackageImpl#getEscribir()
		 * @generated
		 */
		EClass ESCRIBIR = eINSTANCE.getEscribir();

		/**
		 * The meta object literal for the '<em><b>Operador</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ESCRIBIR__OPERADOR = eINSTANCE.getEscribir_Operador();

		/**
		 * The meta object literal for the '{@link diagramapseudocodigo.impl.FuncionImpl <em>Funcion</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see diagramapseudocodigo.impl.FuncionImpl
		 * @see diagramapseudocodigo.impl.DiagramapseudocodigoPackageImpl#getFuncion()
		 * @generated
		 */
		EClass FUNCION = eINSTANCE.getFuncion();

		/**
		 * The meta object literal for the '<em><b>Tipo</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FUNCION__TIPO = eINSTANCE.getFuncion_Tipo();

		/**
		 * The meta object literal for the '<em><b>Devuelve</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCION__DEVUELVE = eINSTANCE.getFuncion_Devuelve();

		/**
		 * The meta object literal for the '{@link diagramapseudocodigo.impl.ParametroFuncionImpl <em>Parametro Funcion</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see diagramapseudocodigo.impl.ParametroFuncionImpl
		 * @see diagramapseudocodigo.impl.DiagramapseudocodigoPackageImpl#getParametroFuncion()
		 * @generated
		 */
		EClass PARAMETRO_FUNCION = eINSTANCE.getParametroFuncion();

		/**
		 * The meta object literal for the '<em><b>Tipo</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETRO_FUNCION__TIPO = eINSTANCE.getParametroFuncion_Tipo();

		/**
		 * The meta object literal for the '<em><b>Variable</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARAMETRO_FUNCION__VARIABLE = eINSTANCE.getParametroFuncion_Variable();

		/**
		 * The meta object literal for the '<em><b>Paso</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETRO_FUNCION__PASO = eINSTANCE.getParametroFuncion_Paso();

		/**
		 * The meta object literal for the '{@link diagramapseudocodigo.impl.LeerImpl <em>Leer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see diagramapseudocodigo.impl.LeerImpl
		 * @see diagramapseudocodigo.impl.DiagramapseudocodigoPackageImpl#getLeer()
		 * @generated
		 */
		EClass LEER = eINSTANCE.getLeer();

		/**
		 * The meta object literal for the '<em><b>Variable</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LEER__VARIABLE = eINSTANCE.getLeer_Variable();

		/**
		 * The meta object literal for the '{@link diagramapseudocodigo.impl.NumeroDecimalImpl <em>Numero Decimal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see diagramapseudocodigo.impl.NumeroDecimalImpl
		 * @see diagramapseudocodigo.impl.DiagramapseudocodigoPackageImpl#getNumeroDecimal()
		 * @generated
		 */
		EClass NUMERO_DECIMAL = eINSTANCE.getNumeroDecimal();

		/**
		 * The meta object literal for the '<em><b>Valor</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NUMERO_DECIMAL__VALOR = eINSTANCE.getNumeroDecimal_Valor();

		/**
		 * The meta object literal for the '{@link diagramapseudocodigo.impl.valorImpl <em>valor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see diagramapseudocodigo.impl.valorImpl
		 * @see diagramapseudocodigo.impl.DiagramapseudocodigoPackageImpl#getvalor()
		 * @generated
		 */
		EClass VALOR = eINSTANCE.getvalor();

		/**
		 * The meta object literal for the '{@link diagramapseudocodigo.impl.operacionImpl <em>operacion</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see diagramapseudocodigo.impl.operacionImpl
		 * @see diagramapseudocodigo.impl.DiagramapseudocodigoPackageImpl#getoperacion()
		 * @generated
		 */
		EClass OPERACION = eINSTANCE.getoperacion();

		/**
		 * The meta object literal for the '<em><b>Signo op</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPERACION__SIGNO_OP = eINSTANCE.getoperacion_Signo_op();

		/**
		 * The meta object literal for the '<em><b>Op izq</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERACION__OP_IZQ = eINSTANCE.getoperacion_Op_izq();

		/**
		 * The meta object literal for the '<em><b>Op der</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERACION__OP_DER = eINSTANCE.getoperacion_Op_der();

		/**
		 * The meta object literal for the '{@link diagramapseudocodigo.impl.operando_izqImpl <em>operando izq</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see diagramapseudocodigo.impl.operando_izqImpl
		 * @see diagramapseudocodigo.impl.DiagramapseudocodigoPackageImpl#getoperando_izq()
		 * @generated
		 */
		EClass OPERANDO_IZQ = eINSTANCE.getoperando_izq();

		/**
		 * The meta object literal for the '<em><b>Oper izq</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERANDO_IZQ__OPER_IZQ = eINSTANCE.getoperando_izq_Oper_izq();

		/**
		 * The meta object literal for the '{@link diagramapseudocodigo.impl.operando_derImpl <em>operando der</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see diagramapseudocodigo.impl.operando_derImpl
		 * @see diagramapseudocodigo.impl.DiagramapseudocodigoPackageImpl#getoperando_der()
		 * @generated
		 */
		EClass OPERANDO_DER = eINSTANCE.getoperando_der();

		/**
		 * The meta object literal for the '<em><b>Oper der</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERANDO_DER__OPER_DER = eINSTANCE.getoperando_der_Oper_der();

		/**
		 * The meta object literal for the '{@link diagramapseudocodigo.impl.ValorBooleanoImpl <em>Valor Booleano</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see diagramapseudocodigo.impl.ValorBooleanoImpl
		 * @see diagramapseudocodigo.impl.DiagramapseudocodigoPackageImpl#getValorBooleano()
		 * @generated
		 */
		EClass VALOR_BOOLEANO = eINSTANCE.getValorBooleano();

		/**
		 * The meta object literal for the '<em><b>Valor</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VALOR_BOOLEANO__VALOR = eINSTANCE.getValorBooleano_Valor();

		/**
		 * The meta object literal for the '{@link diagramapseudocodigo.impl.SiImpl <em>Si</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see diagramapseudocodigo.impl.SiImpl
		 * @see diagramapseudocodigo.impl.DiagramapseudocodigoPackageImpl#getSi()
		 * @generated
		 */
		EClass SI = eINSTANCE.getSi();

		/**
		 * The meta object literal for the '<em><b>Sino</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SI__SINO = eINSTANCE.getSi_Sino();

		/**
		 * The meta object literal for the '{@link diagramapseudocodigo.impl.SinoImpl <em>Sino</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see diagramapseudocodigo.impl.SinoImpl
		 * @see diagramapseudocodigo.impl.DiagramapseudocodigoPackageImpl#getSino()
		 * @generated
		 */
		EClass SINO = eINSTANCE.getSino();

		/**
		 * The meta object literal for the '<em><b>Sentencias</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SINO__SENTENCIAS = eINSTANCE.getSino_Sentencias();

		/**
		 * The meta object literal for the '{@link diagramapseudocodigo.impl.BloqueImpl <em>Bloque</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see diagramapseudocodigo.impl.BloqueImpl
		 * @see diagramapseudocodigo.impl.DiagramapseudocodigoPackageImpl#getBloque()
		 * @generated
		 */
		EClass BLOQUE = eINSTANCE.getBloque();

		/**
		 * The meta object literal for the '<em><b>Valor</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BLOQUE__VALOR = eINSTANCE.getBloque_Valor();

		/**
		 * The meta object literal for the '<em><b>Sentencias</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BLOQUE__SENTENCIAS = eINSTANCE.getBloque_Sentencias();

		/**
		 * The meta object literal for the '{@link diagramapseudocodigo.impl.mientrasImpl <em>mientras</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see diagramapseudocodigo.impl.mientrasImpl
		 * @see diagramapseudocodigo.impl.DiagramapseudocodigoPackageImpl#getmientras()
		 * @generated
		 */
		EClass MIENTRAS = eINSTANCE.getmientras();

		/**
		 * The meta object literal for the '{@link diagramapseudocodigo.impl.repetirImpl <em>repetir</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see diagramapseudocodigo.impl.repetirImpl
		 * @see diagramapseudocodigo.impl.DiagramapseudocodigoPackageImpl#getrepetir()
		 * @generated
		 */
		EClass REPETIR = eINSTANCE.getrepetir();

		/**
		 * The meta object literal for the '{@link diagramapseudocodigo.impl.desdeImpl <em>desde</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see diagramapseudocodigo.impl.desdeImpl
		 * @see diagramapseudocodigo.impl.DiagramapseudocodigoPackageImpl#getdesde()
		 * @generated
		 */
		EClass DESDE = eINSTANCE.getdesde();

		/**
		 * The meta object literal for the '<em><b>Asignacion</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DESDE__ASIGNACION = eINSTANCE.getdesde_Asignacion();

		/**
		 * The meta object literal for the '{@link diagramapseudocodigo.impl.incrementoImpl <em>incremento</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see diagramapseudocodigo.impl.incrementoImpl
		 * @see diagramapseudocodigo.impl.DiagramapseudocodigoPackageImpl#getincremento()
		 * @generated
		 */
		EClass INCREMENTO = eINSTANCE.getincremento();

		/**
		 * The meta object literal for the '<em><b>Nombre</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INCREMENTO__NOMBRE = eINSTANCE.getincremento_Nombre();

		/**
		 * The meta object literal for the '<em><b>Ssigno</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INCREMENTO__SSIGNO = eINSTANCE.getincremento_Ssigno();

		/**
		 * The meta object literal for the '{@link diagramapseudocodigo.impl.SubprocesoImpl <em>Subproceso</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see diagramapseudocodigo.impl.SubprocesoImpl
		 * @see diagramapseudocodigo.impl.DiagramapseudocodigoPackageImpl#getSubproceso()
		 * @generated
		 */
		EClass SUBPROCESO = eINSTANCE.getSubproceso();

		/**
		 * The meta object literal for the '<em><b>Parametrofuncion</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUBPROCESO__PARAMETROFUNCION = eINSTANCE.getSubproceso_Parametrofuncion();

		/**
		 * The meta object literal for the '<em><b>Sentencias</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUBPROCESO__SENTENCIAS = eINSTANCE.getSubproceso_Sentencias();

		/**
		 * The meta object literal for the '<em><b>Nombre</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUBPROCESO__NOMBRE = eINSTANCE.getSubproceso_Nombre();

		/**
		 * The meta object literal for the '<em><b>Declaracionvariable</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUBPROCESO__DECLARACIONVARIABLE = eINSTANCE.getSubproceso_Declaracionvariable();

		/**
		 * The meta object literal for the '{@link diagramapseudocodigo.impl.ProcedimientoImpl <em>Procedimiento</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see diagramapseudocodigo.impl.ProcedimientoImpl
		 * @see diagramapseudocodigo.impl.DiagramapseudocodigoPackageImpl#getProcedimiento()
		 * @generated
		 */
		EClass PROCEDIMIENTO = eINSTANCE.getProcedimiento();

		/**
		 * The meta object literal for the '{@link diagramapseudocodigo.impl.CaracterImpl <em>Caracter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see diagramapseudocodigo.impl.CaracterImpl
		 * @see diagramapseudocodigo.impl.DiagramapseudocodigoPackageImpl#getCaracter()
		 * @generated
		 */
		EClass CARACTER = eINSTANCE.getCaracter();

		/**
		 * The meta object literal for the '<em><b>Contenido</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CARACTER__CONTENIDO = eINSTANCE.getCaracter_Contenido();

		/**
		 * The meta object literal for the '{@link diagramapseudocodigo.impl.InternasImpl <em>Internas</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see diagramapseudocodigo.impl.InternasImpl
		 * @see diagramapseudocodigo.impl.DiagramapseudocodigoPackageImpl#getInternas()
		 * @generated
		 */
		EClass INTERNAS = eINSTANCE.getInternas();

		/**
		 * The meta object literal for the '<em><b>Nombre</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTERNAS__NOMBRE = eINSTANCE.getInternas_Nombre();

		/**
		 * The meta object literal for the '<em><b>Operador</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERNAS__OPERADOR = eINSTANCE.getInternas_Operador();

		/**
		 * The meta object literal for the '{@link diagramapseudocodigo.TipoVariable <em>Tipo Variable</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see diagramapseudocodigo.TipoVariable
		 * @see diagramapseudocodigo.impl.DiagramapseudocodigoPackageImpl#getTipoVariable()
		 * @generated
		 */
		EEnum TIPO_VARIABLE = eINSTANCE.getTipoVariable();

		/**
		 * The meta object literal for the '{@link diagramapseudocodigo.signo <em>signo</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see diagramapseudocodigo.signo
		 * @see diagramapseudocodigo.impl.DiagramapseudocodigoPackageImpl#getsigno()
		 * @generated
		 */
		EEnum SIGNO = eINSTANCE.getsigno();

		/**
		 * The meta object literal for the '{@link diagramapseudocodigo.booleano <em>booleano</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see diagramapseudocodigo.booleano
		 * @see diagramapseudocodigo.impl.DiagramapseudocodigoPackageImpl#getbooleano()
		 * @generated
		 */
		EEnum BOOLEANO = eINSTANCE.getbooleano();

		/**
		 * The meta object literal for the '{@link diagramapseudocodigo.inc <em>inc</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see diagramapseudocodigo.inc
		 * @see diagramapseudocodigo.impl.DiagramapseudocodigoPackageImpl#getinc()
		 * @generated
		 */
		EEnum INC = eINSTANCE.getinc();

		/**
		 * The meta object literal for the '{@link diagramapseudocodigo.TipoPaso <em>Tipo Paso</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see diagramapseudocodigo.TipoPaso
		 * @see diagramapseudocodigo.impl.DiagramapseudocodigoPackageImpl#getTipoPaso()
		 * @generated
		 */
		EEnum TIPO_PASO = eINSTANCE.getTipoPaso();

		/**
		 * The meta object literal for the '{@link diagramapseudocodigo.NombreInterna <em>Nombre Interna</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see diagramapseudocodigo.NombreInterna
		 * @see diagramapseudocodigo.impl.DiagramapseudocodigoPackageImpl#getNombreInterna()
		 * @generated
		 */
		EEnum NOMBRE_INTERNA = eINSTANCE.getNombreInterna();

	}

} //DiagramapseudocodigoPackage
