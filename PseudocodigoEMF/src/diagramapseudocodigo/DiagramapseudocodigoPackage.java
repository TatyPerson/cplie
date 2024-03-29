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
	 * The feature id for the '<em><b>Constantes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODIGO__CONSTANTES = 3;

	/**
	 * The feature id for the '<em><b>Tipocomplejo</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODIGO__TIPOCOMPLEJO = 4;

	/**
	 * The feature id for the '<em><b>Comentarios</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODIGO__COMENTARIOS = 5;

	/**
	 * The feature id for the '<em><b>Global</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODIGO__GLOBAL = 6;

	/**
	 * The number of structural features of the '<em>Codigo</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODIGO_FEATURE_COUNT = 7;

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
	 * The feature id for the '<em><b>Declaracion</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INICIO__DECLARACION = 1;

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
	 * The meta object id for the '{@link diagramapseudocodigo.impl.DeclaracionImpl <em>Declaracion</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see diagramapseudocodigo.impl.DeclaracionImpl
	 * @see diagramapseudocodigo.impl.DiagramapseudocodigoPackageImpl#getDeclaracion()
	 * @generated
	 */
	int DECLARACION = 37;

	/**
	 * The number of structural features of the '<em>Declaracion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECLARACION_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Declaracion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECLARACION_OPERATION_COUNT = 0;

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
	int DECLARACION_VARIABLE__TIPO = DECLARACION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Variable</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECLARACION_VARIABLE__VARIABLE = DECLARACION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Declaracion Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECLARACION_VARIABLE_FEATURE_COUNT = DECLARACION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Declaracion Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECLARACION_VARIABLE_OPERATION_COUNT = DECLARACION_OPERATION_COUNT + 0;

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
	 * The feature id for the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LLAMADA_FUNCION__NOMBRE = VALOR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Operadores</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LLAMADA_FUNCION__OPERADORES = VALOR_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Llamada Funcion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LLAMADA_FUNCION_FEATURE_COUNT = VALOR_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Llamada Funcion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LLAMADA_FUNCION_OPERATION_COUNT = VALOR_OPERATION_COUNT + 0;

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
	 * The number of structural features of the '<em>Asignacion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASIGNACION_FEATURE_COUNT = SENTENCIAS_FEATURE_COUNT + 0;

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
	int SUBPROCESO = 26;

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
	 * The feature id for the '<em><b>Declaracion</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBPROCESO__DECLARACION = 3;

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
	 * The feature id for the '<em><b>Declaracion</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCION__DECLARACION = SUBPROCESO__DECLARACION;

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
	 * The feature id for the '<em><b>Variable</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETRO_FUNCION__VARIABLE = 0;

	/**
	 * The feature id for the '<em><b>Paso</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETRO_FUNCION__PASO = 1;

	/**
	 * The feature id for the '<em><b>Tipo</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETRO_FUNCION__TIPO = 2;

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
	 * The number of structural features of the '<em>operacion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERACION_FEATURE_COUNT = VALOR_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>operacion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERACION_OPERATION_COUNT = VALOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link diagramapseudocodigo.impl.ValorBooleanoImpl <em>Valor Booleano</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see diagramapseudocodigo.impl.ValorBooleanoImpl
	 * @see diagramapseudocodigo.impl.DiagramapseudocodigoPackageImpl#getValorBooleano()
	 * @generated
	 */
	int VALOR_BOOLEANO = 19;

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
	int BLOQUE = 22;

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
	int SI = 20;

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
	 * The feature id for the '<em><b>Devuelve</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SI__DEVUELVE = BLOQUE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Si</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SI_FEATURE_COUNT = BLOQUE_FEATURE_COUNT + 2;

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
	int SINO = 21;

	/**
	 * The feature id for the '<em><b>Sentencias</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINO__SENTENCIAS = 0;

	/**
	 * The feature id for the '<em><b>Devuelve</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINO__DEVUELVE = 1;

	/**
	 * The number of structural features of the '<em>Sino</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINO_FEATURE_COUNT = 2;

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
	int MIENTRAS = 23;

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
	int REPETIR = 24;

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
	int DESDE = 25;

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
	 * The meta object id for the '{@link diagramapseudocodigo.impl.NegacionImpl <em>Negacion</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see diagramapseudocodigo.impl.NegacionImpl
	 * @see diagramapseudocodigo.impl.DiagramapseudocodigoPackageImpl#getNegacion()
	 * @generated
	 */
	int NEGACION = 66;

	/**
	 * The meta object id for the '{@link diagramapseudocodigo.impl.ProcedimientoImpl <em>Procedimiento</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see diagramapseudocodigo.impl.ProcedimientoImpl
	 * @see diagramapseudocodigo.impl.DiagramapseudocodigoPackageImpl#getProcedimiento()
	 * @generated
	 */
	int PROCEDIMIENTO = 27;

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
	 * The feature id for the '<em><b>Declaracion</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCEDIMIENTO__DECLARACION = SUBPROCESO__DECLARACION;

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
	int CARACTER = 28;

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
	int INTERNAS = 29;

	/**
	 * The feature id for the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAS__NOMBRE = VALOR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Operadores</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAS__OPERADORES = VALOR_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Internas</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAS_FEATURE_COUNT = VALOR_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Internas</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAS_OPERATION_COUNT = VALOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link diagramapseudocodigo.impl.segunImpl <em>segun</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see diagramapseudocodigo.impl.segunImpl
	 * @see diagramapseudocodigo.impl.DiagramapseudocodigoPackageImpl#getsegun()
	 * @generated
	 */
	int SEGUN = 30;

	/**
	 * The feature id for the '<em><b>Valor</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEGUN__VALOR = BLOQUE__VALOR;

	/**
	 * The feature id for the '<em><b>Sentencias</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEGUN__SENTENCIAS = BLOQUE__SENTENCIAS;

	/**
	 * The feature id for the '<em><b>Caso</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEGUN__CASO = BLOQUE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Devuelve</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEGUN__DEVUELVE = BLOQUE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>segun</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEGUN_FEATURE_COUNT = BLOQUE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>segun</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEGUN_OPERATION_COUNT = BLOQUE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link diagramapseudocodigo.impl.DevolverImpl <em>Devolver</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see diagramapseudocodigo.impl.DevolverImpl
	 * @see diagramapseudocodigo.impl.DiagramapseudocodigoPackageImpl#getDevolver()
	 * @generated
	 */
	int DEVOLVER = 31;

	/**
	 * The feature id for the '<em><b>EReference0</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVOLVER__EREFERENCE0 = 0;

	/**
	 * The feature id for the '<em><b>Devuelve</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVOLVER__DEVUELVE = 1;

	/**
	 * The number of structural features of the '<em>Devolver</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVOLVER_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Devolver</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVOLVER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link diagramapseudocodigo.impl.CasoImpl <em>Caso</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see diagramapseudocodigo.impl.CasoImpl
	 * @see diagramapseudocodigo.impl.DiagramapseudocodigoPackageImpl#getCaso()
	 * @generated
	 */
	int CASO = 32;

	/**
	 * The feature id for the '<em><b>Devuelve</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASO__DEVUELVE = 0;

	/**
	 * The feature id for the '<em><b>Sentencias</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASO__SENTENCIAS = 1;

	/**
	 * The feature id for the '<em><b>Operador</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASO__OPERADOR = 2;

	/**
	 * The number of structural features of the '<em>Caso</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASO_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Caso</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASO_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link diagramapseudocodigo.impl.unariaImpl <em>unaria</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see diagramapseudocodigo.impl.unariaImpl
	 * @see diagramapseudocodigo.impl.DiagramapseudocodigoPackageImpl#getunaria()
	 * @generated
	 */
	int UNARIA = 33;

	/**
	 * The feature id for the '<em><b>Ssigno</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARIA__SSIGNO = VALOR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Variable</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARIA__VARIABLE = VALOR_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>unaria</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARIA_FEATURE_COUNT = VALOR_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>unaria</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARIA_OPERATION_COUNT = VALOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link diagramapseudocodigo.impl.ConstantesImpl <em>Constantes</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see diagramapseudocodigo.impl.ConstantesImpl
	 * @see diagramapseudocodigo.impl.DiagramapseudocodigoPackageImpl#getConstantes()
	 * @generated
	 */
	int CONSTANTES = 34;

	/**
	 * The feature id for the '<em><b>Variable</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTANTES__VARIABLE = 0;

	/**
	 * The feature id for the '<em><b>Valor</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTANTES__VALOR = 1;

	/**
	 * The number of structural features of the '<em>Constantes</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTANTES_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Constantes</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTANTES_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link diagramapseudocodigo.impl.TipoComplejoImpl <em>Tipo Complejo</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see diagramapseudocodigo.impl.TipoComplejoImpl
	 * @see diagramapseudocodigo.impl.DiagramapseudocodigoPackageImpl#getTipoComplejo()
	 * @generated
	 */
	int TIPO_COMPLEJO = 39;

	/**
	 * The number of structural features of the '<em>Tipo Complejo</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIPO_COMPLEJO_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Tipo Complejo</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIPO_COMPLEJO_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link diagramapseudocodigo.impl.VectorImpl <em>Vector</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see diagramapseudocodigo.impl.VectorImpl
	 * @see diagramapseudocodigo.impl.DiagramapseudocodigoPackageImpl#getVector()
	 * @generated
	 */
	int VECTOR = 35;

	/**
	 * The feature id for the '<em><b>Valor</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VECTOR__VALOR = TIPO_COMPLEJO_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Tipo</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VECTOR__TIPO = TIPO_COMPLEJO_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VECTOR__NOMBRE = TIPO_COMPLEJO_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Vector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VECTOR_FEATURE_COUNT = TIPO_COMPLEJO_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Vector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VECTOR_OPERATION_COUNT = TIPO_COMPLEJO_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link diagramapseudocodigo.impl.DeclaracionPropiaImpl <em>Declaracion Propia</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see diagramapseudocodigo.impl.DeclaracionPropiaImpl
	 * @see diagramapseudocodigo.impl.DiagramapseudocodigoPackageImpl#getDeclaracionPropia()
	 * @generated
	 */
	int DECLARACION_PROPIA = 36;

	/**
	 * The feature id for the '<em><b>Tipo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECLARACION_PROPIA__TIPO = DECLARACION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Variable</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECLARACION_PROPIA__VARIABLE = DECLARACION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Declaracion Propia</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECLARACION_PROPIA_FEATURE_COUNT = DECLARACION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Declaracion Propia</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECLARACION_PROPIA_OPERATION_COUNT = DECLARACION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link diagramapseudocodigo.impl.MatrizImpl <em>Matriz</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see diagramapseudocodigo.impl.MatrizImpl
	 * @see diagramapseudocodigo.impl.DiagramapseudocodigoPackageImpl#getMatriz()
	 * @generated
	 */
	int MATRIZ = 38;

	/**
	 * The feature id for the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATRIZ__NOMBRE = TIPO_COMPLEJO_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Valor</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATRIZ__VALOR = TIPO_COMPLEJO_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Tipo</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATRIZ__TIPO = TIPO_COMPLEJO_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Matriz</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATRIZ_FEATURE_COUNT = TIPO_COMPLEJO_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Matriz</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATRIZ_OPERATION_COUNT = TIPO_COMPLEJO_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link diagramapseudocodigo.impl.RegistroImpl <em>Registro</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see diagramapseudocodigo.impl.RegistroImpl
	 * @see diagramapseudocodigo.impl.DiagramapseudocodigoPackageImpl#getRegistro()
	 * @generated
	 */
	int REGISTRO = 40;

	/**
	 * The feature id for the '<em><b>Variable</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTRO__VARIABLE = TIPO_COMPLEJO_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTRO__NOMBRE = TIPO_COMPLEJO_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Registro</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTRO_FEATURE_COUNT = TIPO_COMPLEJO_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Registro</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTRO_OPERATION_COUNT = TIPO_COMPLEJO_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link diagramapseudocodigo.impl.TipoImpl <em>Tipo</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see diagramapseudocodigo.impl.TipoImpl
	 * @see diagramapseudocodigo.impl.DiagramapseudocodigoPackageImpl#getTipo()
	 * @generated
	 */
	int TIPO = 41;

	/**
	 * The number of structural features of the '<em>Tipo</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIPO_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Tipo</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIPO_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link diagramapseudocodigo.impl.TipoDefinidoImpl <em>Tipo Definido</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see diagramapseudocodigo.impl.TipoDefinidoImpl
	 * @see diagramapseudocodigo.impl.DiagramapseudocodigoPackageImpl#getTipoDefinido()
	 * @generated
	 */
	int TIPO_DEFINIDO = 42;

	/**
	 * The feature id for the '<em><b>Tipo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIPO_DEFINIDO__TIPO = TIPO_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Tipo Definido</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIPO_DEFINIDO_FEATURE_COUNT = TIPO_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Tipo Definido</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIPO_DEFINIDO_OPERATION_COUNT = TIPO_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link diagramapseudocodigo.impl.TipoExistenteImpl <em>Tipo Existente</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see diagramapseudocodigo.impl.TipoExistenteImpl
	 * @see diagramapseudocodigo.impl.DiagramapseudocodigoPackageImpl#getTipoExistente()
	 * @generated
	 */
	int TIPO_EXISTENTE = 43;

	/**
	 * The feature id for the '<em><b>Tipo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIPO_EXISTENTE__TIPO = TIPO_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Tipo Existente</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIPO_EXISTENTE_FEATURE_COUNT = TIPO_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Tipo Existente</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIPO_EXISTENTE_OPERATION_COUNT = TIPO_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link diagramapseudocodigo.impl.ArchivoImpl <em>Archivo</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see diagramapseudocodigo.impl.ArchivoImpl
	 * @see diagramapseudocodigo.impl.DiagramapseudocodigoPackageImpl#getArchivo()
	 * @generated
	 */
	int ARCHIVO = 44;

	/**
	 * The feature id for the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHIVO__NOMBRE = TIPO_COMPLEJO_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Tipo</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHIVO__TIPO = TIPO_COMPLEJO_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Archivo</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHIVO_FEATURE_COUNT = TIPO_COMPLEJO_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Archivo</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHIVO_OPERATION_COUNT = TIPO_COMPLEJO_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link diagramapseudocodigo.impl.EnumeradoImpl <em>Enumerado</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see diagramapseudocodigo.impl.EnumeradoImpl
	 * @see diagramapseudocodigo.impl.DiagramapseudocodigoPackageImpl#getEnumerado()
	 * @generated
	 */
	int ENUMERADO = 45;

	/**
	 * The feature id for the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERADO__NOMBRE = TIPO_COMPLEJO_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Valor</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERADO__VALOR = TIPO_COMPLEJO_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Enumerado</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERADO_FEATURE_COUNT = TIPO_COMPLEJO_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Enumerado</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERADO_OPERATION_COUNT = TIPO_COMPLEJO_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link diagramapseudocodigo.impl.SubrangoImpl <em>Subrango</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see diagramapseudocodigo.impl.SubrangoImpl
	 * @see diagramapseudocodigo.impl.DiagramapseudocodigoPackageImpl#getSubrango()
	 * @generated
	 */
	int SUBRANGO = 46;

	/**
	 * The feature id for the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBRANGO__NOMBRE = TIPO_COMPLEJO_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Subrango</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBRANGO_FEATURE_COUNT = TIPO_COMPLEJO_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Subrango</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBRANGO_OPERATION_COUNT = TIPO_COMPLEJO_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link diagramapseudocodigo.impl.ValorComplejoImpl <em>Valor Complejo</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see diagramapseudocodigo.impl.ValorComplejoImpl
	 * @see diagramapseudocodigo.impl.DiagramapseudocodigoPackageImpl#getValorComplejo()
	 * @generated
	 */
	int VALOR_COMPLEJO = 47;

	/**
	 * The number of structural features of the '<em>Valor Complejo</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALOR_COMPLEJO_FEATURE_COUNT = OPERADOR_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Valor Complejo</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALOR_COMPLEJO_OPERATION_COUNT = OPERADOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link diagramapseudocodigo.impl.ValorRegistroImpl <em>Valor Registro</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see diagramapseudocodigo.impl.ValorRegistroImpl
	 * @see diagramapseudocodigo.impl.DiagramapseudocodigoPackageImpl#getValorRegistro()
	 * @generated
	 */
	int VALOR_REGISTRO = 48;

	/**
	 * The feature id for the '<em><b>Nombre registro</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALOR_REGISTRO__NOMBRE_REGISTRO = VALOR_COMPLEJO_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Campo</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALOR_REGISTRO__CAMPO = VALOR_COMPLEJO_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Valor Registro</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALOR_REGISTRO_FEATURE_COUNT = VALOR_COMPLEJO_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Valor Registro</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALOR_REGISTRO_OPERATION_COUNT = VALOR_COMPLEJO_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link diagramapseudocodigo.impl.CampoRegistroImpl <em>Campo Registro</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see diagramapseudocodigo.impl.CampoRegistroImpl
	 * @see diagramapseudocodigo.impl.DiagramapseudocodigoPackageImpl#getCampoRegistro()
	 * @generated
	 */
	int CAMPO_REGISTRO = 49;

	/**
	 * The feature id for the '<em><b>Nombre campo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAMPO_REGISTRO__NOMBRE_CAMPO = 0;

	/**
	 * The number of structural features of the '<em>Campo Registro</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAMPO_REGISTRO_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Campo Registro</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAMPO_REGISTRO_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link diagramapseudocodigo.impl.ValorVectorImpl <em>Valor Vector</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see diagramapseudocodigo.impl.ValorVectorImpl
	 * @see diagramapseudocodigo.impl.DiagramapseudocodigoPackageImpl#getValorVector()
	 * @generated
	 */
	int VALOR_VECTOR = 50;

	/**
	 * The feature id for the '<em><b>Nombre vector</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALOR_VECTOR__NOMBRE_VECTOR = VALOR_COMPLEJO_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Campo</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALOR_VECTOR__CAMPO = VALOR_COMPLEJO_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Indice</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALOR_VECTOR__INDICE = VALOR_COMPLEJO_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Valor Vector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALOR_VECTOR_FEATURE_COUNT = VALOR_COMPLEJO_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Valor Vector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALOR_VECTOR_OPERATION_COUNT = VALOR_COMPLEJO_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link diagramapseudocodigo.impl.ValorMatrizImpl <em>Valor Matriz</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see diagramapseudocodigo.impl.ValorMatrizImpl
	 * @see diagramapseudocodigo.impl.DiagramapseudocodigoPackageImpl#getValorMatriz()
	 * @generated
	 */
	int VALOR_MATRIZ = 51;

	/**
	 * The feature id for the '<em><b>Nombre matriz</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALOR_MATRIZ__NOMBRE_MATRIZ = VALOR_COMPLEJO_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Campo</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALOR_MATRIZ__CAMPO = VALOR_COMPLEJO_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Primer Indice</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALOR_MATRIZ__PRIMER_INDICE = VALOR_COMPLEJO_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Segundo Indice</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALOR_MATRIZ__SEGUNDO_INDICE = VALOR_COMPLEJO_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Valor Matriz</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALOR_MATRIZ_FEATURE_COUNT = VALOR_COMPLEJO_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Valor Matriz</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALOR_MATRIZ_OPERATION_COUNT = VALOR_COMPLEJO_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link diagramapseudocodigo.impl.ComentarioImpl <em>Comentario</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see diagramapseudocodigo.impl.ComentarioImpl
	 * @see diagramapseudocodigo.impl.DiagramapseudocodigoPackageImpl#getComentario()
	 * @generated
	 */
	int COMENTARIO = 52;

	/**
	 * The feature id for the '<em><b>Mensaje</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMENTARIO__MENSAJE = 0;

	/**
	 * The number of structural features of the '<em>Comentario</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMENTARIO_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Comentario</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMENTARIO_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link diagramapseudocodigo.impl.FuncionFicheroAbrirImpl <em>Funcion Fichero Abrir</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see diagramapseudocodigo.impl.FuncionFicheroAbrirImpl
	 * @see diagramapseudocodigo.impl.DiagramapseudocodigoPackageImpl#getFuncionFicheroAbrir()
	 * @generated
	 */
	int FUNCION_FICHERO_ABRIR = 53;

	/**
	 * The feature id for the '<em><b>Modo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCION_FICHERO_ABRIR__MODO = SENTENCIAS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Variable</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCION_FICHERO_ABRIR__VARIABLE = SENTENCIAS_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Funcion Fichero Abrir</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCION_FICHERO_ABRIR_FEATURE_COUNT = SENTENCIAS_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Funcion Fichero Abrir</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCION_FICHERO_ABRIR_OPERATION_COUNT = SENTENCIAS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link diagramapseudocodigo.impl.FuncionFicheroCerrarImpl <em>Funcion Fichero Cerrar</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see diagramapseudocodigo.impl.FuncionFicheroCerrarImpl
	 * @see diagramapseudocodigo.impl.DiagramapseudocodigoPackageImpl#getFuncionFicheroCerrar()
	 * @generated
	 */
	int FUNCION_FICHERO_CERRAR = 54;

	/**
	 * The feature id for the '<em><b>Variable</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCION_FICHERO_CERRAR__VARIABLE = SENTENCIAS_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Funcion Fichero Cerrar</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCION_FICHERO_CERRAR_FEATURE_COUNT = SENTENCIAS_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Funcion Fichero Cerrar</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCION_FICHERO_CERRAR_OPERATION_COUNT = SENTENCIAS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link diagramapseudocodigo.impl.SumaImpl <em>Suma</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see diagramapseudocodigo.impl.SumaImpl
	 * @see diagramapseudocodigo.impl.DiagramapseudocodigoPackageImpl#getSuma()
	 * @generated
	 */
	int SUMA = 55;

	/**
	 * The feature id for the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUMA__LEFT = OPERACION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUMA__RIGHT = OPERACION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Signo op</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUMA__SIGNO_OP = OPERACION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Suma</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUMA_FEATURE_COUNT = OPERACION_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Suma</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUMA_OPERATION_COUNT = OPERACION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link diagramapseudocodigo.impl.RestaImpl <em>Resta</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see diagramapseudocodigo.impl.RestaImpl
	 * @see diagramapseudocodigo.impl.DiagramapseudocodigoPackageImpl#getResta()
	 * @generated
	 */
	int RESTA = 56;

	/**
	 * The feature id for the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESTA__LEFT = OPERACION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESTA__RIGHT = OPERACION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Signo op</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESTA__SIGNO_OP = OPERACION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Resta</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESTA_FEATURE_COUNT = OPERACION_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Resta</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESTA_OPERATION_COUNT = OPERACION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link diagramapseudocodigo.impl.MultiplicacionImpl <em>Multiplicacion</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see diagramapseudocodigo.impl.MultiplicacionImpl
	 * @see diagramapseudocodigo.impl.DiagramapseudocodigoPackageImpl#getMultiplicacion()
	 * @generated
	 */
	int MULTIPLICACION = 57;

	/**
	 * The feature id for the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLICACION__LEFT = OPERACION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLICACION__RIGHT = OPERACION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Signo op</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLICACION__SIGNO_OP = OPERACION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Multiplicacion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLICACION_FEATURE_COUNT = OPERACION_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Multiplicacion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLICACION_OPERATION_COUNT = OPERACION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link diagramapseudocodigo.impl.DivisionImpl <em>Division</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see diagramapseudocodigo.impl.DivisionImpl
	 * @see diagramapseudocodigo.impl.DiagramapseudocodigoPackageImpl#getDivision()
	 * @generated
	 */
	int DIVISION = 58;

	/**
	 * The feature id for the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIVISION__LEFT = OPERACION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIVISION__RIGHT = OPERACION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Signo op</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIVISION__SIGNO_OP = OPERACION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Division</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIVISION_FEATURE_COUNT = OPERACION_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Division</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIVISION_OPERATION_COUNT = OPERACION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link diagramapseudocodigo.impl.OrImpl <em>Or</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see diagramapseudocodigo.impl.OrImpl
	 * @see diagramapseudocodigo.impl.DiagramapseudocodigoPackageImpl#getOr()
	 * @generated
	 */
	int OR = 59;

	/**
	 * The feature id for the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR__LEFT = OPERACION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR__RIGHT = OPERACION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Signo op</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR__SIGNO_OP = OPERACION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Or</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR_FEATURE_COUNT = OPERACION_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Or</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR_OPERATION_COUNT = OPERACION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link diagramapseudocodigo.impl.AndImpl <em>And</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see diagramapseudocodigo.impl.AndImpl
	 * @see diagramapseudocodigo.impl.DiagramapseudocodigoPackageImpl#getAnd()
	 * @generated
	 */
	int AND = 60;

	/**
	 * The feature id for the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND__LEFT = OPERACION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND__RIGHT = OPERACION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Signo op</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND__SIGNO_OP = OPERACION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>And</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND_FEATURE_COUNT = OPERACION_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>And</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND_OPERATION_COUNT = OPERACION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link diagramapseudocodigo.impl.ComparacionImpl <em>Comparacion</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see diagramapseudocodigo.impl.ComparacionImpl
	 * @see diagramapseudocodigo.impl.DiagramapseudocodigoPackageImpl#getComparacion()
	 * @generated
	 */
	int COMPARACION = 61;

	/**
	 * The feature id for the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARACION__LEFT = OPERACION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARACION__RIGHT = OPERACION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Signo op</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARACION__SIGNO_OP = OPERACION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Comparacion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARACION_FEATURE_COUNT = OPERACION_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Comparacion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARACION_OPERATION_COUNT = OPERACION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link diagramapseudocodigo.impl.IgualdadImpl <em>Igualdad</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see diagramapseudocodigo.impl.IgualdadImpl
	 * @see diagramapseudocodigo.impl.DiagramapseudocodigoPackageImpl#getIgualdad()
	 * @generated
	 */
	int IGUALDAD = 62;

	/**
	 * The feature id for the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IGUALDAD__LEFT = OPERACION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IGUALDAD__RIGHT = OPERACION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Signo op</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IGUALDAD__SIGNO_OP = OPERACION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Igualdad</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IGUALDAD_FEATURE_COUNT = OPERACION_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Igualdad</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IGUALDAD_OPERATION_COUNT = OPERACION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link diagramapseudocodigo.impl.SubrangoNumericoImpl <em>Subrango Numerico</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see diagramapseudocodigo.impl.SubrangoNumericoImpl
	 * @see diagramapseudocodigo.impl.DiagramapseudocodigoPackageImpl#getSubrangoNumerico()
	 * @generated
	 */
	int SUBRANGO_NUMERICO = 63;

	/**
	 * The feature id for the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBRANGO_NUMERICO__NOMBRE = SUBRANGO__NOMBRE;

	/**
	 * The feature id for the '<em><b>Limite inf</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBRANGO_NUMERICO__LIMITE_INF = SUBRANGO_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Limite sup</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBRANGO_NUMERICO__LIMITE_SUP = SUBRANGO_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Subrango Numerico</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBRANGO_NUMERICO_FEATURE_COUNT = SUBRANGO_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Subrango Numerico</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBRANGO_NUMERICO_OPERATION_COUNT = SUBRANGO_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link diagramapseudocodigo.impl.SubrangoEnumeradoImpl <em>Subrango Enumerado</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see diagramapseudocodigo.impl.SubrangoEnumeradoImpl
	 * @see diagramapseudocodigo.impl.DiagramapseudocodigoPackageImpl#getSubrangoEnumerado()
	 * @generated
	 */
	int SUBRANGO_ENUMERADO = 64;

	/**
	 * The feature id for the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBRANGO_ENUMERADO__NOMBRE = SUBRANGO__NOMBRE;

	/**
	 * The feature id for the '<em><b>Limite inf</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBRANGO_ENUMERADO__LIMITE_INF = SUBRANGO_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Limite sup</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBRANGO_ENUMERADO__LIMITE_SUP = SUBRANGO_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Subrango Enumerado</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBRANGO_ENUMERADO_FEATURE_COUNT = SUBRANGO_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Subrango Enumerado</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBRANGO_ENUMERADO_OPERATION_COUNT = SUBRANGO_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link diagramapseudocodigo.impl.NegativaImpl <em>Negativa</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see diagramapseudocodigo.impl.NegativaImpl
	 * @see diagramapseudocodigo.impl.DiagramapseudocodigoPackageImpl#getNegativa()
	 * @generated
	 */
	int NEGATIVA = 65;

	/**
	 * The feature id for the '<em><b>Valor operacion</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEGATIVA__VALOR_OPERACION = OPERACION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Negativa</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEGATIVA_FEATURE_COUNT = OPERACION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Negativa</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEGATIVA_OPERATION_COUNT = OPERACION_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Valor operacion</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEGACION__VALOR_OPERACION = OPERACION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Negacion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEGACION_FEATURE_COUNT = OPERACION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Negacion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEGACION_OPERATION_COUNT = OPERACION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link diagramapseudocodigo.impl.AsignacionNormalImpl <em>Asignacion Normal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see diagramapseudocodigo.impl.AsignacionNormalImpl
	 * @see diagramapseudocodigo.impl.DiagramapseudocodigoPackageImpl#getAsignacionNormal()
	 * @generated
	 */
	int ASIGNACION_NORMAL = 67;

	/**
	 * The feature id for the '<em><b>Mat</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASIGNACION_NORMAL__MAT = ASIGNACION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Valor asignacion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASIGNACION_NORMAL__VALOR_ASIGNACION = ASIGNACION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Operador</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASIGNACION_NORMAL__OPERADOR = ASIGNACION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Asignacion Normal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASIGNACION_NORMAL_FEATURE_COUNT = ASIGNACION_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Asignacion Normal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASIGNACION_NORMAL_OPERATION_COUNT = ASIGNACION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link diagramapseudocodigo.impl.AsignacionComplejaImpl <em>Asignacion Compleja</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see diagramapseudocodigo.impl.AsignacionComplejaImpl
	 * @see diagramapseudocodigo.impl.DiagramapseudocodigoPackageImpl#getAsignacionCompleja()
	 * @generated
	 */
	int ASIGNACION_COMPLEJA = 68;

	/**
	 * The feature id for the '<em><b>Operador</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASIGNACION_COMPLEJA__OPERADOR = ASIGNACION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Valor asignacion</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASIGNACION_COMPLEJA__VALOR_ASIGNACION = ASIGNACION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Asignacion Compleja</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASIGNACION_COMPLEJA_FEATURE_COUNT = ASIGNACION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Asignacion Compleja</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASIGNACION_COMPLEJA_OPERATION_COUNT = ASIGNACION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link diagramapseudocodigo.TipoVariable <em>Tipo Variable</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see diagramapseudocodigo.TipoVariable
	 * @see diagramapseudocodigo.impl.DiagramapseudocodigoPackageImpl#getTipoVariable()
	 * @generated
	 */
	int TIPO_VARIABLE = 69;

	/**
	 * The meta object id for the '{@link diagramapseudocodigo.signo <em>signo</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see diagramapseudocodigo.signo
	 * @see diagramapseudocodigo.impl.DiagramapseudocodigoPackageImpl#getsigno()
	 * @generated
	 */
	int SIGNO = 70;

	/**
	 * The meta object id for the '{@link diagramapseudocodigo.booleano <em>booleano</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see diagramapseudocodigo.booleano
	 * @see diagramapseudocodigo.impl.DiagramapseudocodigoPackageImpl#getbooleano()
	 * @generated
	 */
	int BOOLEANO = 71;

	/**
	 * The meta object id for the '{@link diagramapseudocodigo.neg <em>neg</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see diagramapseudocodigo.neg
	 * @see diagramapseudocodigo.impl.DiagramapseudocodigoPackageImpl#getneg()
	 * @generated
	 */
	int NEG = 72;

	/**
	 * The meta object id for the '{@link diagramapseudocodigo.TipoPaso <em>Tipo Paso</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see diagramapseudocodigo.TipoPaso
	 * @see diagramapseudocodigo.impl.DiagramapseudocodigoPackageImpl#getTipoPaso()
	 * @generated
	 */
	int TIPO_PASO = 73;


	/**
	 * The meta object id for the '{@link diagramapseudocodigo.NombreInterna <em>Nombre Interna</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see diagramapseudocodigo.NombreInterna
	 * @see diagramapseudocodigo.impl.DiagramapseudocodigoPackageImpl#getNombreInterna()
	 * @generated
	 */
	int NOMBRE_INTERNA = 74;


	/**
	 * The meta object id for the '{@link diagramapseudocodigo.ModoApertura <em>Modo Apertura</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see diagramapseudocodigo.ModoApertura
	 * @see diagramapseudocodigo.impl.DiagramapseudocodigoPackageImpl#getModoApertura()
	 * @generated
	 */
	int MODO_APERTURA = 75;


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
	 * Returns the meta object for the containment reference list '{@link diagramapseudocodigo.Codigo#getConstantes <em>Constantes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Constantes</em>'.
	 * @see diagramapseudocodigo.Codigo#getConstantes()
	 * @see #getCodigo()
	 * @generated
	 */
	EReference getCodigo_Constantes();

	/**
	 * Returns the meta object for the containment reference list '{@link diagramapseudocodigo.Codigo#getTipocomplejo <em>Tipocomplejo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Tipocomplejo</em>'.
	 * @see diagramapseudocodigo.Codigo#getTipocomplejo()
	 * @see #getCodigo()
	 * @generated
	 */
	EReference getCodigo_Tipocomplejo();

	/**
	 * Returns the meta object for the containment reference list '{@link diagramapseudocodigo.Codigo#getComentarios <em>Comentarios</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Comentarios</em>'.
	 * @see diagramapseudocodigo.Codigo#getComentarios()
	 * @see #getCodigo()
	 * @generated
	 */
	EReference getCodigo_Comentarios();

	/**
	 * Returns the meta object for the containment reference list '{@link diagramapseudocodigo.Codigo#getGlobal <em>Global</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Global</em>'.
	 * @see diagramapseudocodigo.Codigo#getGlobal()
	 * @see #getCodigo()
	 * @generated
	 */
	EReference getCodigo_Global();

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
	 * Returns the meta object for the containment reference list '{@link diagramapseudocodigo.Inicio#getDeclaracion <em>Declaracion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Declaracion</em>'.
	 * @see diagramapseudocodigo.Inicio#getDeclaracion()
	 * @see #getInicio()
	 * @generated
	 */
	EReference getInicio_Declaracion();

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
	 * Returns the meta object for the containment reference list '{@link diagramapseudocodigo.DeclaracionVariable#getVariable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Variable</em>'.
	 * @see diagramapseudocodigo.DeclaracionVariable#getVariable()
	 * @see #getDeclaracionVariable()
	 * @generated
	 */
	EReference getDeclaracionVariable_Variable();

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
	 * Returns the meta object for the containment reference list '{@link diagramapseudocodigo.LlamadaFuncion#getOperadores <em>Operadores</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Operadores</em>'.
	 * @see diagramapseudocodigo.LlamadaFuncion#getOperadores()
	 * @see #getLlamadaFuncion()
	 * @generated
	 */
	EReference getLlamadaFuncion_Operadores();

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
	 * Returns the meta object for the containment reference '{@link diagramapseudocodigo.ParametroFuncion#getTipo <em>Tipo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Tipo</em>'.
	 * @see diagramapseudocodigo.ParametroFuncion#getTipo()
	 * @see #getParametroFuncion()
	 * @generated
	 */
	EReference getParametroFuncion_Tipo();

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
	 * Returns the meta object for the containment reference '{@link diagramapseudocodigo.Si#getDevuelve <em>Devuelve</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Devuelve</em>'.
	 * @see diagramapseudocodigo.Si#getDevuelve()
	 * @see #getSi()
	 * @generated
	 */
	EReference getSi_Devuelve();

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
	 * Returns the meta object for the containment reference '{@link diagramapseudocodigo.Sino#getDevuelve <em>Devuelve</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Devuelve</em>'.
	 * @see diagramapseudocodigo.Sino#getDevuelve()
	 * @see #getSino()
	 * @generated
	 */
	EReference getSino_Devuelve();

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
	 * Returns the meta object for the containment reference list '{@link diagramapseudocodigo.Subproceso#getDeclaracion <em>Declaracion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Declaracion</em>'.
	 * @see diagramapseudocodigo.Subproceso#getDeclaracion()
	 * @see #getSubproceso()
	 * @generated
	 */
	EReference getSubproceso_Declaracion();

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
	 * Returns the meta object for the containment reference list '{@link diagramapseudocodigo.Internas#getOperadores <em>Operadores</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Operadores</em>'.
	 * @see diagramapseudocodigo.Internas#getOperadores()
	 * @see #getInternas()
	 * @generated
	 */
	EReference getInternas_Operadores();

	/**
	 * Returns the meta object for class '{@link diagramapseudocodigo.segun <em>segun</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>segun</em>'.
	 * @see diagramapseudocodigo.segun
	 * @generated
	 */
	EClass getsegun();

	/**
	 * Returns the meta object for the containment reference list '{@link diagramapseudocodigo.segun#getCaso <em>Caso</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Caso</em>'.
	 * @see diagramapseudocodigo.segun#getCaso()
	 * @see #getsegun()
	 * @generated
	 */
	EReference getsegun_Caso();

	/**
	 * Returns the meta object for the containment reference '{@link diagramapseudocodigo.segun#getDevuelve <em>Devuelve</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Devuelve</em>'.
	 * @see diagramapseudocodigo.segun#getDevuelve()
	 * @see #getsegun()
	 * @generated
	 */
	EReference getsegun_Devuelve();

	/**
	 * Returns the meta object for class '{@link diagramapseudocodigo.Devolver <em>Devolver</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Devolver</em>'.
	 * @see diagramapseudocodigo.Devolver
	 * @generated
	 */
	EClass getDevolver();

	/**
	 * Returns the meta object for the reference '{@link diagramapseudocodigo.Devolver#getEReference0 <em>EReference0</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>EReference0</em>'.
	 * @see diagramapseudocodigo.Devolver#getEReference0()
	 * @see #getDevolver()
	 * @generated
	 */
	EReference getDevolver_EReference0();

	/**
	 * Returns the meta object for the containment reference '{@link diagramapseudocodigo.Devolver#getDevuelve <em>Devuelve</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Devuelve</em>'.
	 * @see diagramapseudocodigo.Devolver#getDevuelve()
	 * @see #getDevolver()
	 * @generated
	 */
	EReference getDevolver_Devuelve();

	/**
	 * Returns the meta object for class '{@link diagramapseudocodigo.Caso <em>Caso</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Caso</em>'.
	 * @see diagramapseudocodigo.Caso
	 * @generated
	 */
	EClass getCaso();

	/**
	 * Returns the meta object for the containment reference '{@link diagramapseudocodigo.Caso#getDevuelve <em>Devuelve</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Devuelve</em>'.
	 * @see diagramapseudocodigo.Caso#getDevuelve()
	 * @see #getCaso()
	 * @generated
	 */
	EReference getCaso_Devuelve();

	/**
	 * Returns the meta object for the containment reference list '{@link diagramapseudocodigo.Caso#getSentencias <em>Sentencias</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sentencias</em>'.
	 * @see diagramapseudocodigo.Caso#getSentencias()
	 * @see #getCaso()
	 * @generated
	 */
	EReference getCaso_Sentencias();

	/**
	 * Returns the meta object for the containment reference '{@link diagramapseudocodigo.Caso#getOperador <em>Operador</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Operador</em>'.
	 * @see diagramapseudocodigo.Caso#getOperador()
	 * @see #getCaso()
	 * @generated
	 */
	EReference getCaso_Operador();

	/**
	 * Returns the meta object for class '{@link diagramapseudocodigo.unaria <em>unaria</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>unaria</em>'.
	 * @see diagramapseudocodigo.unaria
	 * @generated
	 */
	EClass getunaria();

	/**
	 * Returns the meta object for the containment reference '{@link diagramapseudocodigo.unaria#getVariable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Variable</em>'.
	 * @see diagramapseudocodigo.unaria#getVariable()
	 * @see #getunaria()
	 * @generated
	 */
	EReference getunaria_Variable();

	/**
	 * Returns the meta object for class '{@link diagramapseudocodigo.Constantes <em>Constantes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Constantes</em>'.
	 * @see diagramapseudocodigo.Constantes
	 * @generated
	 */
	EClass getConstantes();

	/**
	 * Returns the meta object for the containment reference '{@link diagramapseudocodigo.Constantes#getVariable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Variable</em>'.
	 * @see diagramapseudocodigo.Constantes#getVariable()
	 * @see #getConstantes()
	 * @generated
	 */
	EReference getConstantes_Variable();

	/**
	 * Returns the meta object for the containment reference '{@link diagramapseudocodigo.Constantes#getValor <em>Valor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Valor</em>'.
	 * @see diagramapseudocodigo.Constantes#getValor()
	 * @see #getConstantes()
	 * @generated
	 */
	EReference getConstantes_Valor();

	/**
	 * Returns the meta object for class '{@link diagramapseudocodigo.Vector <em>Vector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Vector</em>'.
	 * @see diagramapseudocodigo.Vector
	 * @generated
	 */
	EClass getVector();

	/**
	 * Returns the meta object for class '{@link diagramapseudocodigo.DeclaracionPropia <em>Declaracion Propia</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Declaracion Propia</em>'.
	 * @see diagramapseudocodigo.DeclaracionPropia
	 * @generated
	 */
	EClass getDeclaracionPropia();

	/**
	 * Returns the meta object for the attribute '{@link diagramapseudocodigo.DeclaracionPropia#getTipo <em>Tipo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tipo</em>'.
	 * @see diagramapseudocodigo.DeclaracionPropia#getTipo()
	 * @see #getDeclaracionPropia()
	 * @generated
	 */
	EAttribute getDeclaracionPropia_Tipo();

	/**
	 * Returns the meta object for the containment reference list '{@link diagramapseudocodigo.DeclaracionPropia#getVariable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Variable</em>'.
	 * @see diagramapseudocodigo.DeclaracionPropia#getVariable()
	 * @see #getDeclaracionPropia()
	 * @generated
	 */
	EReference getDeclaracionPropia_Variable();

	/**
	 * Returns the meta object for class '{@link diagramapseudocodigo.Declaracion <em>Declaracion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Declaracion</em>'.
	 * @see diagramapseudocodigo.Declaracion
	 * @generated
	 */
	EClass getDeclaracion();

	/**
	 * Returns the meta object for class '{@link diagramapseudocodigo.Matriz <em>Matriz</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Matriz</em>'.
	 * @see diagramapseudocodigo.Matriz
	 * @generated
	 */
	EClass getMatriz();

	/**
	 * Returns the meta object for the attribute '{@link diagramapseudocodigo.Matriz#getNombre <em>Nombre</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nombre</em>'.
	 * @see diagramapseudocodigo.Matriz#getNombre()
	 * @see #getMatriz()
	 * @generated
	 */
	EAttribute getMatriz_Nombre();

	/**
	 * Returns the meta object for the containment reference list '{@link diagramapseudocodigo.Matriz#getValor <em>Valor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Valor</em>'.
	 * @see diagramapseudocodigo.Matriz#getValor()
	 * @see #getMatriz()
	 * @generated
	 */
	EReference getMatriz_Valor();

	/**
	 * Returns the meta object for the containment reference '{@link diagramapseudocodigo.Matriz#getTipo <em>Tipo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Tipo</em>'.
	 * @see diagramapseudocodigo.Matriz#getTipo()
	 * @see #getMatriz()
	 * @generated
	 */
	EReference getMatriz_Tipo();

	/**
	 * Returns the meta object for class '{@link diagramapseudocodigo.TipoComplejo <em>Tipo Complejo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tipo Complejo</em>'.
	 * @see diagramapseudocodigo.TipoComplejo
	 * @generated
	 */
	EClass getTipoComplejo();

	/**
	 * Returns the meta object for class '{@link diagramapseudocodigo.Registro <em>Registro</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Registro</em>'.
	 * @see diagramapseudocodigo.Registro
	 * @generated
	 */
	EClass getRegistro();

	/**
	 * Returns the meta object for the containment reference list '{@link diagramapseudocodigo.Registro#getVariable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Variable</em>'.
	 * @see diagramapseudocodigo.Registro#getVariable()
	 * @see #getRegistro()
	 * @generated
	 */
	EReference getRegistro_Variable();

	/**
	 * Returns the meta object for the attribute '{@link diagramapseudocodigo.Registro#getNombre <em>Nombre</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nombre</em>'.
	 * @see diagramapseudocodigo.Registro#getNombre()
	 * @see #getRegistro()
	 * @generated
	 */
	EAttribute getRegistro_Nombre();

	/**
	 * Returns the meta object for class '{@link diagramapseudocodigo.Tipo <em>Tipo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tipo</em>'.
	 * @see diagramapseudocodigo.Tipo
	 * @generated
	 */
	EClass getTipo();

	/**
	 * Returns the meta object for class '{@link diagramapseudocodigo.TipoDefinido <em>Tipo Definido</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tipo Definido</em>'.
	 * @see diagramapseudocodigo.TipoDefinido
	 * @generated
	 */
	EClass getTipoDefinido();

	/**
	 * Returns the meta object for the attribute '{@link diagramapseudocodigo.TipoDefinido#getTipo <em>Tipo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tipo</em>'.
	 * @see diagramapseudocodigo.TipoDefinido#getTipo()
	 * @see #getTipoDefinido()
	 * @generated
	 */
	EAttribute getTipoDefinido_Tipo();

	/**
	 * Returns the meta object for class '{@link diagramapseudocodigo.TipoExistente <em>Tipo Existente</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tipo Existente</em>'.
	 * @see diagramapseudocodigo.TipoExistente
	 * @generated
	 */
	EClass getTipoExistente();

	/**
	 * Returns the meta object for the attribute '{@link diagramapseudocodigo.TipoExistente#getTipo <em>Tipo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tipo</em>'.
	 * @see diagramapseudocodigo.TipoExistente#getTipo()
	 * @see #getTipoExistente()
	 * @generated
	 */
	EAttribute getTipoExistente_Tipo();

	/**
	 * Returns the meta object for class '{@link diagramapseudocodigo.Archivo <em>Archivo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Archivo</em>'.
	 * @see diagramapseudocodigo.Archivo
	 * @generated
	 */
	EClass getArchivo();

	/**
	 * Returns the meta object for the attribute '{@link diagramapseudocodigo.Archivo#getNombre <em>Nombre</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nombre</em>'.
	 * @see diagramapseudocodigo.Archivo#getNombre()
	 * @see #getArchivo()
	 * @generated
	 */
	EAttribute getArchivo_Nombre();

	/**
	 * Returns the meta object for the containment reference '{@link diagramapseudocodigo.Archivo#getTipo <em>Tipo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Tipo</em>'.
	 * @see diagramapseudocodigo.Archivo#getTipo()
	 * @see #getArchivo()
	 * @generated
	 */
	EReference getArchivo_Tipo();

	/**
	 * Returns the meta object for class '{@link diagramapseudocodigo.Enumerado <em>Enumerado</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Enumerado</em>'.
	 * @see diagramapseudocodigo.Enumerado
	 * @generated
	 */
	EClass getEnumerado();

	/**
	 * Returns the meta object for the attribute '{@link diagramapseudocodigo.Enumerado#getNombre <em>Nombre</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nombre</em>'.
	 * @see diagramapseudocodigo.Enumerado#getNombre()
	 * @see #getEnumerado()
	 * @generated
	 */
	EAttribute getEnumerado_Nombre();

	/**
	 * Returns the meta object for the containment reference list '{@link diagramapseudocodigo.Enumerado#getValor <em>Valor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Valor</em>'.
	 * @see diagramapseudocodigo.Enumerado#getValor()
	 * @see #getEnumerado()
	 * @generated
	 */
	EReference getEnumerado_Valor();

	/**
	 * Returns the meta object for class '{@link diagramapseudocodigo.Subrango <em>Subrango</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Subrango</em>'.
	 * @see diagramapseudocodigo.Subrango
	 * @generated
	 */
	EClass getSubrango();

	/**
	 * Returns the meta object for the attribute '{@link diagramapseudocodigo.Subrango#getNombre <em>Nombre</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nombre</em>'.
	 * @see diagramapseudocodigo.Subrango#getNombre()
	 * @see #getSubrango()
	 * @generated
	 */
	EAttribute getSubrango_Nombre();

	/**
	 * Returns the meta object for class '{@link diagramapseudocodigo.ValorComplejo <em>Valor Complejo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Valor Complejo</em>'.
	 * @see diagramapseudocodigo.ValorComplejo
	 * @generated
	 */
	EClass getValorComplejo();

	/**
	 * Returns the meta object for class '{@link diagramapseudocodigo.ValorRegistro <em>Valor Registro</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Valor Registro</em>'.
	 * @see diagramapseudocodigo.ValorRegistro
	 * @generated
	 */
	EClass getValorRegistro();

	/**
	 * Returns the meta object for the attribute '{@link diagramapseudocodigo.ValorRegistro#getNombre_registro <em>Nombre registro</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nombre registro</em>'.
	 * @see diagramapseudocodigo.ValorRegistro#getNombre_registro()
	 * @see #getValorRegistro()
	 * @generated
	 */
	EAttribute getValorRegistro_Nombre_registro();

	/**
	 * Returns the meta object for the containment reference list '{@link diagramapseudocodigo.ValorRegistro#getCampo <em>Campo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Campo</em>'.
	 * @see diagramapseudocodigo.ValorRegistro#getCampo()
	 * @see #getValorRegistro()
	 * @generated
	 */
	EReference getValorRegistro_Campo();

	/**
	 * Returns the meta object for class '{@link diagramapseudocodigo.CampoRegistro <em>Campo Registro</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Campo Registro</em>'.
	 * @see diagramapseudocodigo.CampoRegistro
	 * @generated
	 */
	EClass getCampoRegistro();

	/**
	 * Returns the meta object for the attribute '{@link diagramapseudocodigo.CampoRegistro#getNombre_campo <em>Nombre campo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nombre campo</em>'.
	 * @see diagramapseudocodigo.CampoRegistro#getNombre_campo()
	 * @see #getCampoRegistro()
	 * @generated
	 */
	EAttribute getCampoRegistro_Nombre_campo();

	/**
	 * Returns the meta object for class '{@link diagramapseudocodigo.ValorVector <em>Valor Vector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Valor Vector</em>'.
	 * @see diagramapseudocodigo.ValorVector
	 * @generated
	 */
	EClass getValorVector();

	/**
	 * Returns the meta object for the attribute '{@link diagramapseudocodigo.ValorVector#getNombre_vector <em>Nombre vector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nombre vector</em>'.
	 * @see diagramapseudocodigo.ValorVector#getNombre_vector()
	 * @see #getValorVector()
	 * @generated
	 */
	EAttribute getValorVector_Nombre_vector();

	/**
	 * Returns the meta object for the containment reference list '{@link diagramapseudocodigo.ValorVector#getCampo <em>Campo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Campo</em>'.
	 * @see diagramapseudocodigo.ValorVector#getCampo()
	 * @see #getValorVector()
	 * @generated
	 */
	EReference getValorVector_Campo();

	/**
	 * Returns the meta object for the containment reference '{@link diagramapseudocodigo.ValorVector#getIndice <em>Indice</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Indice</em>'.
	 * @see diagramapseudocodigo.ValorVector#getIndice()
	 * @see #getValorVector()
	 * @generated
	 */
	EReference getValorVector_Indice();

	/**
	 * Returns the meta object for class '{@link diagramapseudocodigo.ValorMatriz <em>Valor Matriz</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Valor Matriz</em>'.
	 * @see diagramapseudocodigo.ValorMatriz
	 * @generated
	 */
	EClass getValorMatriz();

	/**
	 * Returns the meta object for the attribute '{@link diagramapseudocodigo.ValorMatriz#getNombre_matriz <em>Nombre matriz</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nombre matriz</em>'.
	 * @see diagramapseudocodigo.ValorMatriz#getNombre_matriz()
	 * @see #getValorMatriz()
	 * @generated
	 */
	EAttribute getValorMatriz_Nombre_matriz();

	/**
	 * Returns the meta object for the containment reference list '{@link diagramapseudocodigo.ValorMatriz#getCampo <em>Campo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Campo</em>'.
	 * @see diagramapseudocodigo.ValorMatriz#getCampo()
	 * @see #getValorMatriz()
	 * @generated
	 */
	EReference getValorMatriz_Campo();

	/**
	 * Returns the meta object for the containment reference '{@link diagramapseudocodigo.ValorMatriz#getPrimerIndice <em>Primer Indice</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Primer Indice</em>'.
	 * @see diagramapseudocodigo.ValorMatriz#getPrimerIndice()
	 * @see #getValorMatriz()
	 * @generated
	 */
	EReference getValorMatriz_PrimerIndice();

	/**
	 * Returns the meta object for the containment reference '{@link diagramapseudocodigo.ValorMatriz#getSegundoIndice <em>Segundo Indice</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Segundo Indice</em>'.
	 * @see diagramapseudocodigo.ValorMatriz#getSegundoIndice()
	 * @see #getValorMatriz()
	 * @generated
	 */
	EReference getValorMatriz_SegundoIndice();

	/**
	 * Returns the meta object for class '{@link diagramapseudocodigo.Comentario <em>Comentario</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Comentario</em>'.
	 * @see diagramapseudocodigo.Comentario
	 * @generated
	 */
	EClass getComentario();

	/**
	 * Returns the meta object for the attribute '{@link diagramapseudocodigo.Comentario#getMensaje <em>Mensaje</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mensaje</em>'.
	 * @see diagramapseudocodigo.Comentario#getMensaje()
	 * @see #getComentario()
	 * @generated
	 */
	EAttribute getComentario_Mensaje();

	/**
	 * Returns the meta object for class '{@link diagramapseudocodigo.FuncionFicheroAbrir <em>Funcion Fichero Abrir</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Funcion Fichero Abrir</em>'.
	 * @see diagramapseudocodigo.FuncionFicheroAbrir
	 * @generated
	 */
	EClass getFuncionFicheroAbrir();

	/**
	 * Returns the meta object for the attribute '{@link diagramapseudocodigo.FuncionFicheroAbrir#getModo <em>Modo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Modo</em>'.
	 * @see diagramapseudocodigo.FuncionFicheroAbrir#getModo()
	 * @see #getFuncionFicheroAbrir()
	 * @generated
	 */
	EAttribute getFuncionFicheroAbrir_Modo();

	/**
	 * Returns the meta object for the containment reference list '{@link diagramapseudocodigo.FuncionFicheroAbrir#getVariable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Variable</em>'.
	 * @see diagramapseudocodigo.FuncionFicheroAbrir#getVariable()
	 * @see #getFuncionFicheroAbrir()
	 * @generated
	 */
	EReference getFuncionFicheroAbrir_Variable();

	/**
	 * Returns the meta object for class '{@link diagramapseudocodigo.FuncionFicheroCerrar <em>Funcion Fichero Cerrar</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Funcion Fichero Cerrar</em>'.
	 * @see diagramapseudocodigo.FuncionFicheroCerrar
	 * @generated
	 */
	EClass getFuncionFicheroCerrar();

	/**
	 * Returns the meta object for the containment reference '{@link diagramapseudocodigo.FuncionFicheroCerrar#getVariable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Variable</em>'.
	 * @see diagramapseudocodigo.FuncionFicheroCerrar#getVariable()
	 * @see #getFuncionFicheroCerrar()
	 * @generated
	 */
	EReference getFuncionFicheroCerrar_Variable();

	/**
	 * Returns the meta object for class '{@link diagramapseudocodigo.Suma <em>Suma</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Suma</em>'.
	 * @see diagramapseudocodigo.Suma
	 * @generated
	 */
	EClass getSuma();

	/**
	 * Returns the meta object for the containment reference '{@link diagramapseudocodigo.Suma#getLeft <em>Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Left</em>'.
	 * @see diagramapseudocodigo.Suma#getLeft()
	 * @see #getSuma()
	 * @generated
	 */
	EReference getSuma_Left();

	/**
	 * Returns the meta object for the containment reference '{@link diagramapseudocodigo.Suma#getRight <em>Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Right</em>'.
	 * @see diagramapseudocodigo.Suma#getRight()
	 * @see #getSuma()
	 * @generated
	 */
	EReference getSuma_Right();

	/**
	 * Returns the meta object for the attribute '{@link diagramapseudocodigo.Suma#getSigno_op <em>Signo op</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Signo op</em>'.
	 * @see diagramapseudocodigo.Suma#getSigno_op()
	 * @see #getSuma()
	 * @generated
	 */
	EAttribute getSuma_Signo_op();

	/**
	 * Returns the meta object for class '{@link diagramapseudocodigo.Resta <em>Resta</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Resta</em>'.
	 * @see diagramapseudocodigo.Resta
	 * @generated
	 */
	EClass getResta();

	/**
	 * Returns the meta object for the containment reference '{@link diagramapseudocodigo.Resta#getLeft <em>Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Left</em>'.
	 * @see diagramapseudocodigo.Resta#getLeft()
	 * @see #getResta()
	 * @generated
	 */
	EReference getResta_Left();

	/**
	 * Returns the meta object for the containment reference '{@link diagramapseudocodigo.Resta#getRight <em>Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Right</em>'.
	 * @see diagramapseudocodigo.Resta#getRight()
	 * @see #getResta()
	 * @generated
	 */
	EReference getResta_Right();

	/**
	 * Returns the meta object for the attribute '{@link diagramapseudocodigo.Resta#getSigno_op <em>Signo op</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Signo op</em>'.
	 * @see diagramapseudocodigo.Resta#getSigno_op()
	 * @see #getResta()
	 * @generated
	 */
	EAttribute getResta_Signo_op();

	/**
	 * Returns the meta object for class '{@link diagramapseudocodigo.Multiplicacion <em>Multiplicacion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Multiplicacion</em>'.
	 * @see diagramapseudocodigo.Multiplicacion
	 * @generated
	 */
	EClass getMultiplicacion();

	/**
	 * Returns the meta object for the containment reference '{@link diagramapseudocodigo.Multiplicacion#getLeft <em>Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Left</em>'.
	 * @see diagramapseudocodigo.Multiplicacion#getLeft()
	 * @see #getMultiplicacion()
	 * @generated
	 */
	EReference getMultiplicacion_Left();

	/**
	 * Returns the meta object for the containment reference '{@link diagramapseudocodigo.Multiplicacion#getRight <em>Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Right</em>'.
	 * @see diagramapseudocodigo.Multiplicacion#getRight()
	 * @see #getMultiplicacion()
	 * @generated
	 */
	EReference getMultiplicacion_Right();

	/**
	 * Returns the meta object for the attribute '{@link diagramapseudocodigo.Multiplicacion#getSigno_op <em>Signo op</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Signo op</em>'.
	 * @see diagramapseudocodigo.Multiplicacion#getSigno_op()
	 * @see #getMultiplicacion()
	 * @generated
	 */
	EAttribute getMultiplicacion_Signo_op();

	/**
	 * Returns the meta object for class '{@link diagramapseudocodigo.Division <em>Division</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Division</em>'.
	 * @see diagramapseudocodigo.Division
	 * @generated
	 */
	EClass getDivision();

	/**
	 * Returns the meta object for the containment reference '{@link diagramapseudocodigo.Division#getLeft <em>Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Left</em>'.
	 * @see diagramapseudocodigo.Division#getLeft()
	 * @see #getDivision()
	 * @generated
	 */
	EReference getDivision_Left();

	/**
	 * Returns the meta object for the containment reference '{@link diagramapseudocodigo.Division#getRight <em>Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Right</em>'.
	 * @see diagramapseudocodigo.Division#getRight()
	 * @see #getDivision()
	 * @generated
	 */
	EReference getDivision_Right();

	/**
	 * Returns the meta object for the attribute '{@link diagramapseudocodigo.Division#getSigno_op <em>Signo op</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Signo op</em>'.
	 * @see diagramapseudocodigo.Division#getSigno_op()
	 * @see #getDivision()
	 * @generated
	 */
	EAttribute getDivision_Signo_op();

	/**
	 * Returns the meta object for class '{@link diagramapseudocodigo.Or <em>Or</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Or</em>'.
	 * @see diagramapseudocodigo.Or
	 * @generated
	 */
	EClass getOr();

	/**
	 * Returns the meta object for the containment reference '{@link diagramapseudocodigo.Or#getLeft <em>Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Left</em>'.
	 * @see diagramapseudocodigo.Or#getLeft()
	 * @see #getOr()
	 * @generated
	 */
	EReference getOr_Left();

	/**
	 * Returns the meta object for the containment reference '{@link diagramapseudocodigo.Or#getRight <em>Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Right</em>'.
	 * @see diagramapseudocodigo.Or#getRight()
	 * @see #getOr()
	 * @generated
	 */
	EReference getOr_Right();

	/**
	 * Returns the meta object for the attribute '{@link diagramapseudocodigo.Or#getSigno_op <em>Signo op</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Signo op</em>'.
	 * @see diagramapseudocodigo.Or#getSigno_op()
	 * @see #getOr()
	 * @generated
	 */
	EAttribute getOr_Signo_op();

	/**
	 * Returns the meta object for class '{@link diagramapseudocodigo.And <em>And</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>And</em>'.
	 * @see diagramapseudocodigo.And
	 * @generated
	 */
	EClass getAnd();

	/**
	 * Returns the meta object for the containment reference '{@link diagramapseudocodigo.And#getLeft <em>Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Left</em>'.
	 * @see diagramapseudocodigo.And#getLeft()
	 * @see #getAnd()
	 * @generated
	 */
	EReference getAnd_Left();

	/**
	 * Returns the meta object for the containment reference '{@link diagramapseudocodigo.And#getRight <em>Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Right</em>'.
	 * @see diagramapseudocodigo.And#getRight()
	 * @see #getAnd()
	 * @generated
	 */
	EReference getAnd_Right();

	/**
	 * Returns the meta object for the attribute '{@link diagramapseudocodigo.And#getSigno_op <em>Signo op</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Signo op</em>'.
	 * @see diagramapseudocodigo.And#getSigno_op()
	 * @see #getAnd()
	 * @generated
	 */
	EAttribute getAnd_Signo_op();

	/**
	 * Returns the meta object for class '{@link diagramapseudocodigo.Comparacion <em>Comparacion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Comparacion</em>'.
	 * @see diagramapseudocodigo.Comparacion
	 * @generated
	 */
	EClass getComparacion();

	/**
	 * Returns the meta object for the containment reference '{@link diagramapseudocodigo.Comparacion#getLeft <em>Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Left</em>'.
	 * @see diagramapseudocodigo.Comparacion#getLeft()
	 * @see #getComparacion()
	 * @generated
	 */
	EReference getComparacion_Left();

	/**
	 * Returns the meta object for the containment reference '{@link diagramapseudocodigo.Comparacion#getRight <em>Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Right</em>'.
	 * @see diagramapseudocodigo.Comparacion#getRight()
	 * @see #getComparacion()
	 * @generated
	 */
	EReference getComparacion_Right();

	/**
	 * Returns the meta object for the attribute '{@link diagramapseudocodigo.Comparacion#getSigno_op <em>Signo op</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Signo op</em>'.
	 * @see diagramapseudocodigo.Comparacion#getSigno_op()
	 * @see #getComparacion()
	 * @generated
	 */
	EAttribute getComparacion_Signo_op();

	/**
	 * Returns the meta object for class '{@link diagramapseudocodigo.Igualdad <em>Igualdad</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Igualdad</em>'.
	 * @see diagramapseudocodigo.Igualdad
	 * @generated
	 */
	EClass getIgualdad();

	/**
	 * Returns the meta object for the containment reference '{@link diagramapseudocodigo.Igualdad#getLeft <em>Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Left</em>'.
	 * @see diagramapseudocodigo.Igualdad#getLeft()
	 * @see #getIgualdad()
	 * @generated
	 */
	EReference getIgualdad_Left();

	/**
	 * Returns the meta object for the containment reference '{@link diagramapseudocodigo.Igualdad#getRight <em>Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Right</em>'.
	 * @see diagramapseudocodigo.Igualdad#getRight()
	 * @see #getIgualdad()
	 * @generated
	 */
	EReference getIgualdad_Right();

	/**
	 * Returns the meta object for the attribute '{@link diagramapseudocodigo.Igualdad#getSigno_op <em>Signo op</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Signo op</em>'.
	 * @see diagramapseudocodigo.Igualdad#getSigno_op()
	 * @see #getIgualdad()
	 * @generated
	 */
	EAttribute getIgualdad_Signo_op();

	/**
	 * Returns the meta object for class '{@link diagramapseudocodigo.SubrangoNumerico <em>Subrango Numerico</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Subrango Numerico</em>'.
	 * @see diagramapseudocodigo.SubrangoNumerico
	 * @generated
	 */
	EClass getSubrangoNumerico();

	/**
	 * Returns the meta object for the attribute '{@link diagramapseudocodigo.SubrangoNumerico#getLimite_inf <em>Limite inf</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Limite inf</em>'.
	 * @see diagramapseudocodigo.SubrangoNumerico#getLimite_inf()
	 * @see #getSubrangoNumerico()
	 * @generated
	 */
	EAttribute getSubrangoNumerico_Limite_inf();

	/**
	 * Returns the meta object for the attribute '{@link diagramapseudocodigo.SubrangoNumerico#getLimite_sup <em>Limite sup</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Limite sup</em>'.
	 * @see diagramapseudocodigo.SubrangoNumerico#getLimite_sup()
	 * @see #getSubrangoNumerico()
	 * @generated
	 */
	EAttribute getSubrangoNumerico_Limite_sup();

	/**
	 * Returns the meta object for class '{@link diagramapseudocodigo.SubrangoEnumerado <em>Subrango Enumerado</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Subrango Enumerado</em>'.
	 * @see diagramapseudocodigo.SubrangoEnumerado
	 * @generated
	 */
	EClass getSubrangoEnumerado();

	/**
	 * Returns the meta object for the attribute '{@link diagramapseudocodigo.SubrangoEnumerado#getLimite_inf <em>Limite inf</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Limite inf</em>'.
	 * @see diagramapseudocodigo.SubrangoEnumerado#getLimite_inf()
	 * @see #getSubrangoEnumerado()
	 * @generated
	 */
	EAttribute getSubrangoEnumerado_Limite_inf();

	/**
	 * Returns the meta object for the attribute '{@link diagramapseudocodigo.SubrangoEnumerado#getLimite_sup <em>Limite sup</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Limite sup</em>'.
	 * @see diagramapseudocodigo.SubrangoEnumerado#getLimite_sup()
	 * @see #getSubrangoEnumerado()
	 * @generated
	 */
	EAttribute getSubrangoEnumerado_Limite_sup();

	/**
	 * Returns the meta object for class '{@link diagramapseudocodigo.Negativa <em>Negativa</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Negativa</em>'.
	 * @see diagramapseudocodigo.Negativa
	 * @generated
	 */
	EClass getNegativa();

	/**
	 * Returns the meta object for the containment reference '{@link diagramapseudocodigo.Negativa#getValor_operacion <em>Valor operacion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Valor operacion</em>'.
	 * @see diagramapseudocodigo.Negativa#getValor_operacion()
	 * @see #getNegativa()
	 * @generated
	 */
	EReference getNegativa_Valor_operacion();

	/**
	 * Returns the meta object for class '{@link diagramapseudocodigo.Negacion <em>Negacion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Negacion</em>'.
	 * @see diagramapseudocodigo.Negacion
	 * @generated
	 */
	EClass getNegacion();

	/**
	 * Returns the meta object for the containment reference '{@link diagramapseudocodigo.Negacion#getValor_operacion <em>Valor operacion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Valor operacion</em>'.
	 * @see diagramapseudocodigo.Negacion#getValor_operacion()
	 * @see #getNegacion()
	 * @generated
	 */
	EReference getNegacion_Valor_operacion();

	/**
	 * Returns the meta object for class '{@link diagramapseudocodigo.AsignacionNormal <em>Asignacion Normal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Asignacion Normal</em>'.
	 * @see diagramapseudocodigo.AsignacionNormal
	 * @generated
	 */
	EClass getAsignacionNormal();

	/**
	 * Returns the meta object for the attribute list '{@link diagramapseudocodigo.AsignacionNormal#getMat <em>Mat</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mat</em>'.
	 * @see diagramapseudocodigo.AsignacionNormal#getMat()
	 * @see #getAsignacionNormal()
	 * @generated
	 */
	EAttribute getAsignacionNormal_Mat();

	/**
	 * Returns the meta object for the attribute '{@link diagramapseudocodigo.AsignacionNormal#getValor_asignacion <em>Valor asignacion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Valor asignacion</em>'.
	 * @see diagramapseudocodigo.AsignacionNormal#getValor_asignacion()
	 * @see #getAsignacionNormal()
	 * @generated
	 */
	EAttribute getAsignacionNormal_Valor_asignacion();

	/**
	 * Returns the meta object for the containment reference '{@link diagramapseudocodigo.AsignacionNormal#getOperador <em>Operador</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Operador</em>'.
	 * @see diagramapseudocodigo.AsignacionNormal#getOperador()
	 * @see #getAsignacionNormal()
	 * @generated
	 */
	EReference getAsignacionNormal_Operador();

	/**
	 * Returns the meta object for class '{@link diagramapseudocodigo.AsignacionCompleja <em>Asignacion Compleja</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Asignacion Compleja</em>'.
	 * @see diagramapseudocodigo.AsignacionCompleja
	 * @generated
	 */
	EClass getAsignacionCompleja();

	/**
	 * Returns the meta object for the containment reference '{@link diagramapseudocodigo.AsignacionCompleja#getOperador <em>Operador</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Operador</em>'.
	 * @see diagramapseudocodigo.AsignacionCompleja#getOperador()
	 * @see #getAsignacionCompleja()
	 * @generated
	 */
	EReference getAsignacionCompleja_Operador();

	/**
	 * Returns the meta object for the containment reference '{@link diagramapseudocodigo.AsignacionCompleja#getValor_asignacion <em>Valor asignacion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Valor asignacion</em>'.
	 * @see diagramapseudocodigo.AsignacionCompleja#getValor_asignacion()
	 * @see #getAsignacionCompleja()
	 * @generated
	 */
	EReference getAsignacionCompleja_Valor_asignacion();

	/**
	 * Returns the meta object for the attribute '{@link diagramapseudocodigo.Vector#getNombre <em>Nombre</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nombre</em>'.
	 * @see diagramapseudocodigo.Vector#getNombre()
	 * @see #getVector()
	 * @generated
	 */
	EAttribute getVector_Nombre();

	/**
	 * Returns the meta object for the containment reference '{@link diagramapseudocodigo.Vector#getValor <em>Valor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Valor</em>'.
	 * @see diagramapseudocodigo.Vector#getValor()
	 * @see #getVector()
	 * @generated
	 */
	EReference getVector_Valor();

	/**
	 * Returns the meta object for the containment reference '{@link diagramapseudocodigo.Vector#getTipo <em>Tipo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Tipo</em>'.
	 * @see diagramapseudocodigo.Vector#getTipo()
	 * @see #getVector()
	 * @generated
	 */
	EReference getVector_Tipo();

	/**
	 * Returns the meta object for the attribute '{@link diagramapseudocodigo.unaria#getSsigno <em>Ssigno</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ssigno</em>'.
	 * @see diagramapseudocodigo.unaria#getSsigno()
	 * @see #getunaria()
	 * @generated
	 */
	EAttribute getunaria_Ssigno();

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
	 * Returns the meta object for enum '{@link diagramapseudocodigo.neg <em>neg</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>neg</em>'.
	 * @see diagramapseudocodigo.neg
	 * @generated
	 */
	EEnum getneg();

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
	 * Returns the meta object for enum '{@link diagramapseudocodigo.ModoApertura <em>Modo Apertura</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Modo Apertura</em>'.
	 * @see diagramapseudocodigo.ModoApertura
	 * @generated
	 */
	EEnum getModoApertura();

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
		 * The meta object literal for the '<em><b>Constantes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CODIGO__CONSTANTES = eINSTANCE.getCodigo_Constantes();

		/**
		 * The meta object literal for the '<em><b>Tipocomplejo</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CODIGO__TIPOCOMPLEJO = eINSTANCE.getCodigo_Tipocomplejo();

		/**
		 * The meta object literal for the '<em><b>Comentarios</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CODIGO__COMENTARIOS = eINSTANCE.getCodigo_Comentarios();

		/**
		 * The meta object literal for the '<em><b>Global</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CODIGO__GLOBAL = eINSTANCE.getCodigo_Global();

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
		 * The meta object literal for the '<em><b>Declaracion</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INICIO__DECLARACION = eINSTANCE.getInicio_Declaracion();

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
		 * The meta object literal for the '<em><b>Variable</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DECLARACION_VARIABLE__VARIABLE = eINSTANCE.getDeclaracionVariable_Variable();

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
		 * The meta object literal for the '<em><b>Operadores</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LLAMADA_FUNCION__OPERADORES = eINSTANCE.getLlamadaFuncion_Operadores();

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
		 * The meta object literal for the '<em><b>Tipo</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARAMETRO_FUNCION__TIPO = eINSTANCE.getParametroFuncion_Tipo();

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
		 * The meta object literal for the '<em><b>Devuelve</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SI__DEVUELVE = eINSTANCE.getSi_Devuelve();

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
		 * The meta object literal for the '<em><b>Devuelve</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SINO__DEVUELVE = eINSTANCE.getSino_Devuelve();

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
		 * The meta object literal for the '{@link diagramapseudocodigo.impl.NegacionImpl <em>Negacion</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see diagramapseudocodigo.impl.NegacionImpl
		 * @see diagramapseudocodigo.impl.DiagramapseudocodigoPackageImpl#getNegacion()
		 * @generated
		 */
		EClass NEGACION = eINSTANCE.getNegacion();

		/**
		 * The meta object literal for the '<em><b>Valor operacion</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NEGACION__VALOR_OPERACION = eINSTANCE.getNegacion_Valor_operacion();

		/**
		 * The meta object literal for the '{@link diagramapseudocodigo.impl.AsignacionNormalImpl <em>Asignacion Normal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see diagramapseudocodigo.impl.AsignacionNormalImpl
		 * @see diagramapseudocodigo.impl.DiagramapseudocodigoPackageImpl#getAsignacionNormal()
		 * @generated
		 */
		EClass ASIGNACION_NORMAL = eINSTANCE.getAsignacionNormal();

		/**
		 * The meta object literal for the '<em><b>Mat</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASIGNACION_NORMAL__MAT = eINSTANCE.getAsignacionNormal_Mat();

		/**
		 * The meta object literal for the '<em><b>Valor asignacion</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASIGNACION_NORMAL__VALOR_ASIGNACION = eINSTANCE.getAsignacionNormal_Valor_asignacion();

		/**
		 * The meta object literal for the '<em><b>Operador</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASIGNACION_NORMAL__OPERADOR = eINSTANCE.getAsignacionNormal_Operador();

		/**
		 * The meta object literal for the '{@link diagramapseudocodigo.impl.AsignacionComplejaImpl <em>Asignacion Compleja</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see diagramapseudocodigo.impl.AsignacionComplejaImpl
		 * @see diagramapseudocodigo.impl.DiagramapseudocodigoPackageImpl#getAsignacionCompleja()
		 * @generated
		 */
		EClass ASIGNACION_COMPLEJA = eINSTANCE.getAsignacionCompleja();

		/**
		 * The meta object literal for the '<em><b>Operador</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASIGNACION_COMPLEJA__OPERADOR = eINSTANCE.getAsignacionCompleja_Operador();

		/**
		 * The meta object literal for the '<em><b>Valor asignacion</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASIGNACION_COMPLEJA__VALOR_ASIGNACION = eINSTANCE.getAsignacionCompleja_Valor_asignacion();

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
		 * The meta object literal for the '<em><b>Declaracion</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUBPROCESO__DECLARACION = eINSTANCE.getSubproceso_Declaracion();

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
		 * The meta object literal for the '<em><b>Operadores</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERNAS__OPERADORES = eINSTANCE.getInternas_Operadores();

		/**
		 * The meta object literal for the '{@link diagramapseudocodigo.impl.segunImpl <em>segun</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see diagramapseudocodigo.impl.segunImpl
		 * @see diagramapseudocodigo.impl.DiagramapseudocodigoPackageImpl#getsegun()
		 * @generated
		 */
		EClass SEGUN = eINSTANCE.getsegun();

		/**
		 * The meta object literal for the '<em><b>Caso</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEGUN__CASO = eINSTANCE.getsegun_Caso();

		/**
		 * The meta object literal for the '<em><b>Devuelve</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEGUN__DEVUELVE = eINSTANCE.getsegun_Devuelve();

		/**
		 * The meta object literal for the '{@link diagramapseudocodigo.impl.DevolverImpl <em>Devolver</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see diagramapseudocodigo.impl.DevolverImpl
		 * @see diagramapseudocodigo.impl.DiagramapseudocodigoPackageImpl#getDevolver()
		 * @generated
		 */
		EClass DEVOLVER = eINSTANCE.getDevolver();

		/**
		 * The meta object literal for the '<em><b>EReference0</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEVOLVER__EREFERENCE0 = eINSTANCE.getDevolver_EReference0();

		/**
		 * The meta object literal for the '<em><b>Devuelve</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEVOLVER__DEVUELVE = eINSTANCE.getDevolver_Devuelve();

		/**
		 * The meta object literal for the '{@link diagramapseudocodigo.impl.CasoImpl <em>Caso</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see diagramapseudocodigo.impl.CasoImpl
		 * @see diagramapseudocodigo.impl.DiagramapseudocodigoPackageImpl#getCaso()
		 * @generated
		 */
		EClass CASO = eINSTANCE.getCaso();

		/**
		 * The meta object literal for the '<em><b>Devuelve</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CASO__DEVUELVE = eINSTANCE.getCaso_Devuelve();

		/**
		 * The meta object literal for the '<em><b>Sentencias</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CASO__SENTENCIAS = eINSTANCE.getCaso_Sentencias();

		/**
		 * The meta object literal for the '<em><b>Operador</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CASO__OPERADOR = eINSTANCE.getCaso_Operador();

		/**
		 * The meta object literal for the '{@link diagramapseudocodigo.impl.unariaImpl <em>unaria</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see diagramapseudocodigo.impl.unariaImpl
		 * @see diagramapseudocodigo.impl.DiagramapseudocodigoPackageImpl#getunaria()
		 * @generated
		 */
		EClass UNARIA = eINSTANCE.getunaria();

		/**
		 * The meta object literal for the '<em><b>Variable</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UNARIA__VARIABLE = eINSTANCE.getunaria_Variable();

		/**
		 * The meta object literal for the '{@link diagramapseudocodigo.impl.ConstantesImpl <em>Constantes</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see diagramapseudocodigo.impl.ConstantesImpl
		 * @see diagramapseudocodigo.impl.DiagramapseudocodigoPackageImpl#getConstantes()
		 * @generated
		 */
		EClass CONSTANTES = eINSTANCE.getConstantes();

		/**
		 * The meta object literal for the '<em><b>Variable</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONSTANTES__VARIABLE = eINSTANCE.getConstantes_Variable();

		/**
		 * The meta object literal for the '<em><b>Valor</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONSTANTES__VALOR = eINSTANCE.getConstantes_Valor();

		/**
		 * The meta object literal for the '{@link diagramapseudocodigo.impl.VectorImpl <em>Vector</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see diagramapseudocodigo.impl.VectorImpl
		 * @see diagramapseudocodigo.impl.DiagramapseudocodigoPackageImpl#getVector()
		 * @generated
		 */
		EClass VECTOR = eINSTANCE.getVector();

		/**
		 * The meta object literal for the '{@link diagramapseudocodigo.impl.DeclaracionPropiaImpl <em>Declaracion Propia</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see diagramapseudocodigo.impl.DeclaracionPropiaImpl
		 * @see diagramapseudocodigo.impl.DiagramapseudocodigoPackageImpl#getDeclaracionPropia()
		 * @generated
		 */
		EClass DECLARACION_PROPIA = eINSTANCE.getDeclaracionPropia();

		/**
		 * The meta object literal for the '<em><b>Tipo</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DECLARACION_PROPIA__TIPO = eINSTANCE.getDeclaracionPropia_Tipo();

		/**
		 * The meta object literal for the '<em><b>Variable</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DECLARACION_PROPIA__VARIABLE = eINSTANCE.getDeclaracionPropia_Variable();

		/**
		 * The meta object literal for the '{@link diagramapseudocodigo.impl.DeclaracionImpl <em>Declaracion</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see diagramapseudocodigo.impl.DeclaracionImpl
		 * @see diagramapseudocodigo.impl.DiagramapseudocodigoPackageImpl#getDeclaracion()
		 * @generated
		 */
		EClass DECLARACION = eINSTANCE.getDeclaracion();

		/**
		 * The meta object literal for the '{@link diagramapseudocodigo.impl.MatrizImpl <em>Matriz</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see diagramapseudocodigo.impl.MatrizImpl
		 * @see diagramapseudocodigo.impl.DiagramapseudocodigoPackageImpl#getMatriz()
		 * @generated
		 */
		EClass MATRIZ = eINSTANCE.getMatriz();

		/**
		 * The meta object literal for the '<em><b>Nombre</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MATRIZ__NOMBRE = eINSTANCE.getMatriz_Nombre();

		/**
		 * The meta object literal for the '<em><b>Valor</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MATRIZ__VALOR = eINSTANCE.getMatriz_Valor();

		/**
		 * The meta object literal for the '<em><b>Tipo</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MATRIZ__TIPO = eINSTANCE.getMatriz_Tipo();

		/**
		 * The meta object literal for the '{@link diagramapseudocodigo.impl.TipoComplejoImpl <em>Tipo Complejo</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see diagramapseudocodigo.impl.TipoComplejoImpl
		 * @see diagramapseudocodigo.impl.DiagramapseudocodigoPackageImpl#getTipoComplejo()
		 * @generated
		 */
		EClass TIPO_COMPLEJO = eINSTANCE.getTipoComplejo();

		/**
		 * The meta object literal for the '{@link diagramapseudocodigo.impl.RegistroImpl <em>Registro</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see diagramapseudocodigo.impl.RegistroImpl
		 * @see diagramapseudocodigo.impl.DiagramapseudocodigoPackageImpl#getRegistro()
		 * @generated
		 */
		EClass REGISTRO = eINSTANCE.getRegistro();

		/**
		 * The meta object literal for the '<em><b>Variable</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REGISTRO__VARIABLE = eINSTANCE.getRegistro_Variable();

		/**
		 * The meta object literal for the '<em><b>Nombre</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REGISTRO__NOMBRE = eINSTANCE.getRegistro_Nombre();

		/**
		 * The meta object literal for the '{@link diagramapseudocodigo.impl.TipoImpl <em>Tipo</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see diagramapseudocodigo.impl.TipoImpl
		 * @see diagramapseudocodigo.impl.DiagramapseudocodigoPackageImpl#getTipo()
		 * @generated
		 */
		EClass TIPO = eINSTANCE.getTipo();

		/**
		 * The meta object literal for the '{@link diagramapseudocodigo.impl.TipoDefinidoImpl <em>Tipo Definido</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see diagramapseudocodigo.impl.TipoDefinidoImpl
		 * @see diagramapseudocodigo.impl.DiagramapseudocodigoPackageImpl#getTipoDefinido()
		 * @generated
		 */
		EClass TIPO_DEFINIDO = eINSTANCE.getTipoDefinido();

		/**
		 * The meta object literal for the '<em><b>Tipo</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIPO_DEFINIDO__TIPO = eINSTANCE.getTipoDefinido_Tipo();

		/**
		 * The meta object literal for the '{@link diagramapseudocodigo.impl.TipoExistenteImpl <em>Tipo Existente</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see diagramapseudocodigo.impl.TipoExistenteImpl
		 * @see diagramapseudocodigo.impl.DiagramapseudocodigoPackageImpl#getTipoExistente()
		 * @generated
		 */
		EClass TIPO_EXISTENTE = eINSTANCE.getTipoExistente();

		/**
		 * The meta object literal for the '<em><b>Tipo</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIPO_EXISTENTE__TIPO = eINSTANCE.getTipoExistente_Tipo();

		/**
		 * The meta object literal for the '{@link diagramapseudocodigo.impl.ArchivoImpl <em>Archivo</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see diagramapseudocodigo.impl.ArchivoImpl
		 * @see diagramapseudocodigo.impl.DiagramapseudocodigoPackageImpl#getArchivo()
		 * @generated
		 */
		EClass ARCHIVO = eINSTANCE.getArchivo();

		/**
		 * The meta object literal for the '<em><b>Nombre</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARCHIVO__NOMBRE = eINSTANCE.getArchivo_Nombre();

		/**
		 * The meta object literal for the '<em><b>Tipo</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARCHIVO__TIPO = eINSTANCE.getArchivo_Tipo();

		/**
		 * The meta object literal for the '{@link diagramapseudocodigo.impl.EnumeradoImpl <em>Enumerado</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see diagramapseudocodigo.impl.EnumeradoImpl
		 * @see diagramapseudocodigo.impl.DiagramapseudocodigoPackageImpl#getEnumerado()
		 * @generated
		 */
		EClass ENUMERADO = eINSTANCE.getEnumerado();

		/**
		 * The meta object literal for the '<em><b>Nombre</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENUMERADO__NOMBRE = eINSTANCE.getEnumerado_Nombre();

		/**
		 * The meta object literal for the '<em><b>Valor</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENUMERADO__VALOR = eINSTANCE.getEnumerado_Valor();

		/**
		 * The meta object literal for the '{@link diagramapseudocodigo.impl.SubrangoImpl <em>Subrango</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see diagramapseudocodigo.impl.SubrangoImpl
		 * @see diagramapseudocodigo.impl.DiagramapseudocodigoPackageImpl#getSubrango()
		 * @generated
		 */
		EClass SUBRANGO = eINSTANCE.getSubrango();

		/**
		 * The meta object literal for the '<em><b>Nombre</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUBRANGO__NOMBRE = eINSTANCE.getSubrango_Nombre();

		/**
		 * The meta object literal for the '{@link diagramapseudocodigo.impl.ValorComplejoImpl <em>Valor Complejo</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see diagramapseudocodigo.impl.ValorComplejoImpl
		 * @see diagramapseudocodigo.impl.DiagramapseudocodigoPackageImpl#getValorComplejo()
		 * @generated
		 */
		EClass VALOR_COMPLEJO = eINSTANCE.getValorComplejo();

		/**
		 * The meta object literal for the '{@link diagramapseudocodigo.impl.ValorRegistroImpl <em>Valor Registro</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see diagramapseudocodigo.impl.ValorRegistroImpl
		 * @see diagramapseudocodigo.impl.DiagramapseudocodigoPackageImpl#getValorRegistro()
		 * @generated
		 */
		EClass VALOR_REGISTRO = eINSTANCE.getValorRegistro();

		/**
		 * The meta object literal for the '<em><b>Nombre registro</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VALOR_REGISTRO__NOMBRE_REGISTRO = eINSTANCE.getValorRegistro_Nombre_registro();

		/**
		 * The meta object literal for the '<em><b>Campo</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VALOR_REGISTRO__CAMPO = eINSTANCE.getValorRegistro_Campo();

		/**
		 * The meta object literal for the '{@link diagramapseudocodigo.impl.CampoRegistroImpl <em>Campo Registro</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see diagramapseudocodigo.impl.CampoRegistroImpl
		 * @see diagramapseudocodigo.impl.DiagramapseudocodigoPackageImpl#getCampoRegistro()
		 * @generated
		 */
		EClass CAMPO_REGISTRO = eINSTANCE.getCampoRegistro();

		/**
		 * The meta object literal for the '<em><b>Nombre campo</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CAMPO_REGISTRO__NOMBRE_CAMPO = eINSTANCE.getCampoRegistro_Nombre_campo();

		/**
		 * The meta object literal for the '{@link diagramapseudocodigo.impl.ValorVectorImpl <em>Valor Vector</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see diagramapseudocodigo.impl.ValorVectorImpl
		 * @see diagramapseudocodigo.impl.DiagramapseudocodigoPackageImpl#getValorVector()
		 * @generated
		 */
		EClass VALOR_VECTOR = eINSTANCE.getValorVector();

		/**
		 * The meta object literal for the '<em><b>Nombre vector</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VALOR_VECTOR__NOMBRE_VECTOR = eINSTANCE.getValorVector_Nombre_vector();

		/**
		 * The meta object literal for the '<em><b>Campo</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VALOR_VECTOR__CAMPO = eINSTANCE.getValorVector_Campo();

		/**
		 * The meta object literal for the '<em><b>Indice</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VALOR_VECTOR__INDICE = eINSTANCE.getValorVector_Indice();

		/**
		 * The meta object literal for the '{@link diagramapseudocodigo.impl.ValorMatrizImpl <em>Valor Matriz</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see diagramapseudocodigo.impl.ValorMatrizImpl
		 * @see diagramapseudocodigo.impl.DiagramapseudocodigoPackageImpl#getValorMatriz()
		 * @generated
		 */
		EClass VALOR_MATRIZ = eINSTANCE.getValorMatriz();

		/**
		 * The meta object literal for the '<em><b>Nombre matriz</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VALOR_MATRIZ__NOMBRE_MATRIZ = eINSTANCE.getValorMatriz_Nombre_matriz();

		/**
		 * The meta object literal for the '<em><b>Campo</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VALOR_MATRIZ__CAMPO = eINSTANCE.getValorMatriz_Campo();

		/**
		 * The meta object literal for the '<em><b>Primer Indice</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VALOR_MATRIZ__PRIMER_INDICE = eINSTANCE.getValorMatriz_PrimerIndice();

		/**
		 * The meta object literal for the '<em><b>Segundo Indice</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VALOR_MATRIZ__SEGUNDO_INDICE = eINSTANCE.getValorMatriz_SegundoIndice();

		/**
		 * The meta object literal for the '{@link diagramapseudocodigo.impl.ComentarioImpl <em>Comentario</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see diagramapseudocodigo.impl.ComentarioImpl
		 * @see diagramapseudocodigo.impl.DiagramapseudocodigoPackageImpl#getComentario()
		 * @generated
		 */
		EClass COMENTARIO = eINSTANCE.getComentario();

		/**
		 * The meta object literal for the '<em><b>Mensaje</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMENTARIO__MENSAJE = eINSTANCE.getComentario_Mensaje();

		/**
		 * The meta object literal for the '{@link diagramapseudocodigo.impl.FuncionFicheroAbrirImpl <em>Funcion Fichero Abrir</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see diagramapseudocodigo.impl.FuncionFicheroAbrirImpl
		 * @see diagramapseudocodigo.impl.DiagramapseudocodigoPackageImpl#getFuncionFicheroAbrir()
		 * @generated
		 */
		EClass FUNCION_FICHERO_ABRIR = eINSTANCE.getFuncionFicheroAbrir();

		/**
		 * The meta object literal for the '<em><b>Modo</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FUNCION_FICHERO_ABRIR__MODO = eINSTANCE.getFuncionFicheroAbrir_Modo();

		/**
		 * The meta object literal for the '<em><b>Variable</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCION_FICHERO_ABRIR__VARIABLE = eINSTANCE.getFuncionFicheroAbrir_Variable();

		/**
		 * The meta object literal for the '{@link diagramapseudocodigo.impl.FuncionFicheroCerrarImpl <em>Funcion Fichero Cerrar</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see diagramapseudocodigo.impl.FuncionFicheroCerrarImpl
		 * @see diagramapseudocodigo.impl.DiagramapseudocodigoPackageImpl#getFuncionFicheroCerrar()
		 * @generated
		 */
		EClass FUNCION_FICHERO_CERRAR = eINSTANCE.getFuncionFicheroCerrar();

		/**
		 * The meta object literal for the '<em><b>Variable</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCION_FICHERO_CERRAR__VARIABLE = eINSTANCE.getFuncionFicheroCerrar_Variable();

		/**
		 * The meta object literal for the '{@link diagramapseudocodigo.impl.SumaImpl <em>Suma</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see diagramapseudocodigo.impl.SumaImpl
		 * @see diagramapseudocodigo.impl.DiagramapseudocodigoPackageImpl#getSuma()
		 * @generated
		 */
		EClass SUMA = eINSTANCE.getSuma();

		/**
		 * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUMA__LEFT = eINSTANCE.getSuma_Left();

		/**
		 * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUMA__RIGHT = eINSTANCE.getSuma_Right();

		/**
		 * The meta object literal for the '<em><b>Signo op</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUMA__SIGNO_OP = eINSTANCE.getSuma_Signo_op();

		/**
		 * The meta object literal for the '{@link diagramapseudocodigo.impl.RestaImpl <em>Resta</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see diagramapseudocodigo.impl.RestaImpl
		 * @see diagramapseudocodigo.impl.DiagramapseudocodigoPackageImpl#getResta()
		 * @generated
		 */
		EClass RESTA = eINSTANCE.getResta();

		/**
		 * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESTA__LEFT = eINSTANCE.getResta_Left();

		/**
		 * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESTA__RIGHT = eINSTANCE.getResta_Right();

		/**
		 * The meta object literal for the '<em><b>Signo op</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESTA__SIGNO_OP = eINSTANCE.getResta_Signo_op();

		/**
		 * The meta object literal for the '{@link diagramapseudocodigo.impl.MultiplicacionImpl <em>Multiplicacion</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see diagramapseudocodigo.impl.MultiplicacionImpl
		 * @see diagramapseudocodigo.impl.DiagramapseudocodigoPackageImpl#getMultiplicacion()
		 * @generated
		 */
		EClass MULTIPLICACION = eINSTANCE.getMultiplicacion();

		/**
		 * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MULTIPLICACION__LEFT = eINSTANCE.getMultiplicacion_Left();

		/**
		 * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MULTIPLICACION__RIGHT = eINSTANCE.getMultiplicacion_Right();

		/**
		 * The meta object literal for the '<em><b>Signo op</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MULTIPLICACION__SIGNO_OP = eINSTANCE.getMultiplicacion_Signo_op();

		/**
		 * The meta object literal for the '{@link diagramapseudocodigo.impl.DivisionImpl <em>Division</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see diagramapseudocodigo.impl.DivisionImpl
		 * @see diagramapseudocodigo.impl.DiagramapseudocodigoPackageImpl#getDivision()
		 * @generated
		 */
		EClass DIVISION = eINSTANCE.getDivision();

		/**
		 * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DIVISION__LEFT = eINSTANCE.getDivision_Left();

		/**
		 * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DIVISION__RIGHT = eINSTANCE.getDivision_Right();

		/**
		 * The meta object literal for the '<em><b>Signo op</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIVISION__SIGNO_OP = eINSTANCE.getDivision_Signo_op();

		/**
		 * The meta object literal for the '{@link diagramapseudocodigo.impl.OrImpl <em>Or</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see diagramapseudocodigo.impl.OrImpl
		 * @see diagramapseudocodigo.impl.DiagramapseudocodigoPackageImpl#getOr()
		 * @generated
		 */
		EClass OR = eINSTANCE.getOr();

		/**
		 * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OR__LEFT = eINSTANCE.getOr_Left();

		/**
		 * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OR__RIGHT = eINSTANCE.getOr_Right();

		/**
		 * The meta object literal for the '<em><b>Signo op</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OR__SIGNO_OP = eINSTANCE.getOr_Signo_op();

		/**
		 * The meta object literal for the '{@link diagramapseudocodigo.impl.AndImpl <em>And</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see diagramapseudocodigo.impl.AndImpl
		 * @see diagramapseudocodigo.impl.DiagramapseudocodigoPackageImpl#getAnd()
		 * @generated
		 */
		EClass AND = eINSTANCE.getAnd();

		/**
		 * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AND__LEFT = eINSTANCE.getAnd_Left();

		/**
		 * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AND__RIGHT = eINSTANCE.getAnd_Right();

		/**
		 * The meta object literal for the '<em><b>Signo op</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AND__SIGNO_OP = eINSTANCE.getAnd_Signo_op();

		/**
		 * The meta object literal for the '{@link diagramapseudocodigo.impl.ComparacionImpl <em>Comparacion</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see diagramapseudocodigo.impl.ComparacionImpl
		 * @see diagramapseudocodigo.impl.DiagramapseudocodigoPackageImpl#getComparacion()
		 * @generated
		 */
		EClass COMPARACION = eINSTANCE.getComparacion();

		/**
		 * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPARACION__LEFT = eINSTANCE.getComparacion_Left();

		/**
		 * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPARACION__RIGHT = eINSTANCE.getComparacion_Right();

		/**
		 * The meta object literal for the '<em><b>Signo op</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPARACION__SIGNO_OP = eINSTANCE.getComparacion_Signo_op();

		/**
		 * The meta object literal for the '{@link diagramapseudocodigo.impl.IgualdadImpl <em>Igualdad</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see diagramapseudocodigo.impl.IgualdadImpl
		 * @see diagramapseudocodigo.impl.DiagramapseudocodigoPackageImpl#getIgualdad()
		 * @generated
		 */
		EClass IGUALDAD = eINSTANCE.getIgualdad();

		/**
		 * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IGUALDAD__LEFT = eINSTANCE.getIgualdad_Left();

		/**
		 * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IGUALDAD__RIGHT = eINSTANCE.getIgualdad_Right();

		/**
		 * The meta object literal for the '<em><b>Signo op</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IGUALDAD__SIGNO_OP = eINSTANCE.getIgualdad_Signo_op();

		/**
		 * The meta object literal for the '{@link diagramapseudocodigo.impl.SubrangoNumericoImpl <em>Subrango Numerico</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see diagramapseudocodigo.impl.SubrangoNumericoImpl
		 * @see diagramapseudocodigo.impl.DiagramapseudocodigoPackageImpl#getSubrangoNumerico()
		 * @generated
		 */
		EClass SUBRANGO_NUMERICO = eINSTANCE.getSubrangoNumerico();

		/**
		 * The meta object literal for the '<em><b>Limite inf</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUBRANGO_NUMERICO__LIMITE_INF = eINSTANCE.getSubrangoNumerico_Limite_inf();

		/**
		 * The meta object literal for the '<em><b>Limite sup</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUBRANGO_NUMERICO__LIMITE_SUP = eINSTANCE.getSubrangoNumerico_Limite_sup();

		/**
		 * The meta object literal for the '{@link diagramapseudocodigo.impl.SubrangoEnumeradoImpl <em>Subrango Enumerado</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see diagramapseudocodigo.impl.SubrangoEnumeradoImpl
		 * @see diagramapseudocodigo.impl.DiagramapseudocodigoPackageImpl#getSubrangoEnumerado()
		 * @generated
		 */
		EClass SUBRANGO_ENUMERADO = eINSTANCE.getSubrangoEnumerado();

		/**
		 * The meta object literal for the '<em><b>Limite inf</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUBRANGO_ENUMERADO__LIMITE_INF = eINSTANCE.getSubrangoEnumerado_Limite_inf();

		/**
		 * The meta object literal for the '<em><b>Limite sup</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUBRANGO_ENUMERADO__LIMITE_SUP = eINSTANCE.getSubrangoEnumerado_Limite_sup();

		/**
		 * The meta object literal for the '{@link diagramapseudocodigo.impl.NegativaImpl <em>Negativa</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see diagramapseudocodigo.impl.NegativaImpl
		 * @see diagramapseudocodigo.impl.DiagramapseudocodigoPackageImpl#getNegativa()
		 * @generated
		 */
		EClass NEGATIVA = eINSTANCE.getNegativa();

		/**
		 * The meta object literal for the '<em><b>Valor operacion</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NEGATIVA__VALOR_OPERACION = eINSTANCE.getNegativa_Valor_operacion();

		/**
		 * The meta object literal for the '<em><b>Nombre</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VECTOR__NOMBRE = eINSTANCE.getVector_Nombre();

		/**
		 * The meta object literal for the '<em><b>Valor</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VECTOR__VALOR = eINSTANCE.getVector_Valor();

		/**
		 * The meta object literal for the '<em><b>Tipo</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VECTOR__TIPO = eINSTANCE.getVector_Tipo();

		/**
		 * The meta object literal for the '<em><b>Ssigno</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UNARIA__SSIGNO = eINSTANCE.getunaria_Ssigno();

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
		 * The meta object literal for the '{@link diagramapseudocodigo.neg <em>neg</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see diagramapseudocodigo.neg
		 * @see diagramapseudocodigo.impl.DiagramapseudocodigoPackageImpl#getneg()
		 * @generated
		 */
		EEnum NEG = eINSTANCE.getneg();

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

		/**
		 * The meta object literal for the '{@link diagramapseudocodigo.ModoApertura <em>Modo Apertura</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see diagramapseudocodigo.ModoApertura
		 * @see diagramapseudocodigo.impl.DiagramapseudocodigoPackageImpl#getModoApertura()
		 * @generated
		 */
		EEnum MODO_APERTURA = eINSTANCE.getModoApertura();

	}

} //DiagramapseudocodigoPackage
