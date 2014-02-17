/**
 */
package diagramapseudocodigo.impl;

import diagramapseudocodigo.Asignacion;
import diagramapseudocodigo.Bloque;
import diagramapseudocodigo.Caracter;
import diagramapseudocodigo.Caso;
import diagramapseudocodigo.Codigo;
import diagramapseudocodigo.ConstCadena;
import diagramapseudocodigo.Constantes;
import diagramapseudocodigo.Declaracion;
import diagramapseudocodigo.DeclaracionPropia;
import diagramapseudocodigo.DeclaracionVariable;
import diagramapseudocodigo.Devolver;
import diagramapseudocodigo.DiagramapseudocodigoFactory;
import diagramapseudocodigo.DiagramapseudocodigoPackage;
import diagramapseudocodigo.Escribir;
import diagramapseudocodigo.Funcion;
import diagramapseudocodigo.Inicio;
import diagramapseudocodigo.Internas;
import diagramapseudocodigo.Leer;
import diagramapseudocodigo.LlamadaFuncion;
import diagramapseudocodigo.Matriz;
import diagramapseudocodigo.NombreInterna;
import diagramapseudocodigo.NumeroDecimal;
import diagramapseudocodigo.NumeroEntero;
import diagramapseudocodigo.Operador;
import diagramapseudocodigo.ParametroFuncion;
import diagramapseudocodigo.Procedimiento;
import diagramapseudocodigo.Sentencias;
import diagramapseudocodigo.Si;
import diagramapseudocodigo.Sino;
import diagramapseudocodigo.Subproceso;
import diagramapseudocodigo.TipoComplejo;
import diagramapseudocodigo.TipoPaso;
import diagramapseudocodigo.TipoVariable;
import diagramapseudocodigo.ValorBooleano;
import diagramapseudocodigo.Variable;
import diagramapseudocodigo.VariableID;
import diagramapseudocodigo.Vector;
import diagramapseudocodigo.booleano;
import diagramapseudocodigo.cadena;
import diagramapseudocodigo.desde;
import diagramapseudocodigo.inc;
import diagramapseudocodigo.incremento;
import diagramapseudocodigo.mientras;
import diagramapseudocodigo.operacion;
import diagramapseudocodigo.operando_der;
import diagramapseudocodigo.operando_izq;
import diagramapseudocodigo.repetir;
import diagramapseudocodigo.segun;
import diagramapseudocodigo.signo;
import diagramapseudocodigo.unaria;
import diagramapseudocodigo.valor;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DiagramapseudocodigoPackageImpl extends EPackageImpl implements DiagramapseudocodigoPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass codigoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass inicioEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sentenciasEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass declaracionVariableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass llamadaFuncionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass variableIDEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cadenaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass constCadenaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass variableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass operadorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass numeroEnteroEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass asignacionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass escribirEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass funcionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass parametroFuncionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass leerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass numeroDecimalEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass valorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass operacionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass operando_izqEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass operando_derEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass valorBooleanoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass siEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sinoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bloqueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mientrasEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass repetirEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass desdeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass incrementoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass subprocesoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass procedimientoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass caracterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass internasEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass segunEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass devolverEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass casoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass unariaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass constantesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vectorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass declaracionPropiaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass declaracionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass matrizEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tipoComplejoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum tipoVariableEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum signoEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum booleanoEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum incEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum tipoPasoEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum nombreInternaEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see diagramapseudocodigo.DiagramapseudocodigoPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private DiagramapseudocodigoPackageImpl() {
		super(eNS_URI, DiagramapseudocodigoFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link DiagramapseudocodigoPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static DiagramapseudocodigoPackage init() {
		if (isInited) return (DiagramapseudocodigoPackage)EPackage.Registry.INSTANCE.getEPackage(DiagramapseudocodigoPackage.eNS_URI);

		// Obtain or create and register package
		DiagramapseudocodigoPackageImpl theDiagramapseudocodigoPackage = (DiagramapseudocodigoPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof DiagramapseudocodigoPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new DiagramapseudocodigoPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theDiagramapseudocodigoPackage.createPackageContents();

		// Initialize created meta-data
		theDiagramapseudocodigoPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theDiagramapseudocodigoPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(DiagramapseudocodigoPackage.eNS_URI, theDiagramapseudocodigoPackage);
		return theDiagramapseudocodigoPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCodigo() {
		return codigoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCodigo_Tiene() {
		return (EReference)codigoEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCodigo_Funcion() {
		return (EReference)codigoEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCodigo_Nombre() {
		return (EAttribute)codigoEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCodigo_Constantes() {
		return (EReference)codigoEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCodigo_Tipocomplejo() {
		return (EReference)codigoEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInicio() {
		return inicioEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInicio_Tiene() {
		return (EReference)inicioEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInicio_Declaracion() {
		return (EReference)inicioEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSentencias() {
		return sentenciasEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDeclaracionVariable() {
		return declaracionVariableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDeclaracionVariable_Tipo() {
		return (EAttribute)declaracionVariableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDeclaracionVariable_TieneIDs() {
		return (EReference)declaracionVariableEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLlamadaFuncion() {
		return llamadaFuncionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLlamadaFuncion_Nombre() {
		return (EAttribute)llamadaFuncionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLlamadaFuncion_Operador() {
		return (EReference)llamadaFuncionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVariableID() {
		return variableIDEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVariableID_Nombre() {
		return (EAttribute)variableIDEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVariableID_Mat() {
		return (EAttribute)variableIDEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getcadena() {
		return cadenaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConstCadena() {
		return constCadenaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConstCadena_Contenido() {
		return (EAttribute)constCadenaEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVariable() {
		return variableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVariable_Nombre() {
		return (EAttribute)variableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVariable_Mat() {
		return (EAttribute)variableEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOperador() {
		return operadorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNumeroEntero() {
		return numeroEnteroEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNumeroEntero_Valor() {
		return (EAttribute)numeroEnteroEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAsignacion() {
		return asignacionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAsignacion_Lvalue() {
		return (EAttribute)asignacionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAsignacion_Operador() {
		return (EReference)asignacionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAsignacion_Mat() {
		return (EAttribute)asignacionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEscribir() {
		return escribirEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEscribir_Operador() {
		return (EReference)escribirEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFuncion() {
		return funcionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFuncion_Tipo() {
		return (EAttribute)funcionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFuncion_Devuelve() {
		return (EReference)funcionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getParametroFuncion() {
		return parametroFuncionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParametroFuncion_Tipo() {
		return (EAttribute)parametroFuncionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getParametroFuncion_Variable() {
		return (EReference)parametroFuncionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParametroFuncion_Paso() {
		return (EAttribute)parametroFuncionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLeer() {
		return leerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLeer_Variable() {
		return (EReference)leerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNumeroDecimal() {
		return numeroDecimalEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNumeroDecimal_Valor() {
		return (EAttribute)numeroDecimalEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getvalor() {
		return valorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getoperacion() {
		return operacionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getoperacion_Signo_op() {
		return (EAttribute)operacionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getoperacion_Op_izq() {
		return (EReference)operacionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getoperacion_Op_der() {
		return (EReference)operacionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getoperando_izq() {
		return operando_izqEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getoperando_izq_Oper_izq() {
		return (EReference)operando_izqEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getoperando_der() {
		return operando_derEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getoperando_der_Oper_der() {
		return (EReference)operando_derEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getValorBooleano() {
		return valorBooleanoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getValorBooleano_Valor() {
		return (EAttribute)valorBooleanoEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSi() {
		return siEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSi_Sino() {
		return (EReference)siEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSi_Devuelve() {
		return (EReference)siEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSino() {
		return sinoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSino_Sentencias() {
		return (EReference)sinoEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSino_Devuelve() {
		return (EReference)sinoEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBloque() {
		return bloqueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBloque_Valor() {
		return (EReference)bloqueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBloque_Sentencias() {
		return (EReference)bloqueEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getmientras() {
		return mientrasEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getrepetir() {
		return repetirEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getdesde() {
		return desdeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getdesde_Asignacion() {
		return (EReference)desdeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getincremento() {
		return incrementoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getincremento_Nombre() {
		return (EAttribute)incrementoEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getincremento_Ssigno() {
		return (EAttribute)incrementoEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSubproceso() {
		return subprocesoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSubproceso_Parametrofuncion() {
		return (EReference)subprocesoEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSubproceso_Sentencias() {
		return (EReference)subprocesoEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSubproceso_Nombre() {
		return (EAttribute)subprocesoEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSubproceso_Declaracion() {
		return (EReference)subprocesoEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProcedimiento() {
		return procedimientoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCaracter() {
		return caracterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCaracter_Contenido() {
		return (EAttribute)caracterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInternas() {
		return internasEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInternas_Nombre() {
		return (EAttribute)internasEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInternas_Operador() {
		return (EReference)internasEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getsegun() {
		return segunEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getsegun_Caso() {
		return (EReference)segunEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getsegun_Devuelve() {
		return (EReference)segunEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDevolver() {
		return devolverEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDevolver_EReference0() {
		return (EReference)devolverEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDevolver_Devuelve() {
		return (EReference)devolverEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCaso() {
		return casoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCaso_Operador() {
		return (EReference)casoEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCaso_Devuelve() {
		return (EReference)casoEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCaso_Sentencias() {
		return (EReference)casoEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getunaria() {
		return unariaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getunaria_Variable() {
		return (EReference)unariaEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConstantes() {
		return constantesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConstantes_Variable() {
		return (EReference)constantesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConstantes_Valor() {
		return (EReference)constantesEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVector() {
		return vectorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVector_Constante() {
		return (EAttribute)vectorEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDeclaracionPropia() {
		return declaracionPropiaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDeclaracionPropia_Tipo() {
		return (EAttribute)declaracionPropiaEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDeclaracionPropia_Variable() {
		return (EReference)declaracionPropiaEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDeclaracion() {
		return declaracionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMatriz() {
		return matrizEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMatriz_Constante() {
		return (EAttribute)matrizEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMatriz_TipoInterno() {
		return (EAttribute)matrizEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMatriz_Nombre() {
		return (EAttribute)matrizEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMatriz_Constante2() {
		return (EAttribute)matrizEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTipoComplejo() {
		return tipoComplejoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVector_TipoInterno() {
		return (EAttribute)vectorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVector_Nombre() {
		return (EAttribute)vectorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getunaria_Ssigno() {
		return (EAttribute)unariaEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getTipoVariable() {
		return tipoVariableEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getsigno() {
		return signoEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getbooleano() {
		return booleanoEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getinc() {
		return incEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getTipoPaso() {
		return tipoPasoEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getNombreInterna() {
		return nombreInternaEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DiagramapseudocodigoFactory getDiagramapseudocodigoFactory() {
		return (DiagramapseudocodigoFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		codigoEClass = createEClass(CODIGO);
		createEReference(codigoEClass, CODIGO__TIENE);
		createEReference(codigoEClass, CODIGO__FUNCION);
		createEAttribute(codigoEClass, CODIGO__NOMBRE);
		createEReference(codigoEClass, CODIGO__CONSTANTES);
		createEReference(codigoEClass, CODIGO__TIPOCOMPLEJO);

		inicioEClass = createEClass(INICIO);
		createEReference(inicioEClass, INICIO__TIENE);
		createEReference(inicioEClass, INICIO__DECLARACION);

		sentenciasEClass = createEClass(SENTENCIAS);

		declaracionVariableEClass = createEClass(DECLARACION_VARIABLE);
		createEAttribute(declaracionVariableEClass, DECLARACION_VARIABLE__TIPO);
		createEReference(declaracionVariableEClass, DECLARACION_VARIABLE__TIENE_IDS);

		llamadaFuncionEClass = createEClass(LLAMADA_FUNCION);
		createEAttribute(llamadaFuncionEClass, LLAMADA_FUNCION__NOMBRE);
		createEReference(llamadaFuncionEClass, LLAMADA_FUNCION__OPERADOR);

		variableIDEClass = createEClass(VARIABLE_ID);
		createEAttribute(variableIDEClass, VARIABLE_ID__NOMBRE);
		createEAttribute(variableIDEClass, VARIABLE_ID__MAT);

		cadenaEClass = createEClass(CADENA);

		constCadenaEClass = createEClass(CONST_CADENA);
		createEAttribute(constCadenaEClass, CONST_CADENA__CONTENIDO);

		variableEClass = createEClass(VARIABLE);
		createEAttribute(variableEClass, VARIABLE__NOMBRE);
		createEAttribute(variableEClass, VARIABLE__MAT);

		operadorEClass = createEClass(OPERADOR);

		numeroEnteroEClass = createEClass(NUMERO_ENTERO);
		createEAttribute(numeroEnteroEClass, NUMERO_ENTERO__VALOR);

		asignacionEClass = createEClass(ASIGNACION);
		createEAttribute(asignacionEClass, ASIGNACION__LVALUE);
		createEReference(asignacionEClass, ASIGNACION__OPERADOR);
		createEAttribute(asignacionEClass, ASIGNACION__MAT);

		escribirEClass = createEClass(ESCRIBIR);
		createEReference(escribirEClass, ESCRIBIR__OPERADOR);

		funcionEClass = createEClass(FUNCION);
		createEAttribute(funcionEClass, FUNCION__TIPO);
		createEReference(funcionEClass, FUNCION__DEVUELVE);

		parametroFuncionEClass = createEClass(PARAMETRO_FUNCION);
		createEAttribute(parametroFuncionEClass, PARAMETRO_FUNCION__TIPO);
		createEReference(parametroFuncionEClass, PARAMETRO_FUNCION__VARIABLE);
		createEAttribute(parametroFuncionEClass, PARAMETRO_FUNCION__PASO);

		leerEClass = createEClass(LEER);
		createEReference(leerEClass, LEER__VARIABLE);

		numeroDecimalEClass = createEClass(NUMERO_DECIMAL);
		createEAttribute(numeroDecimalEClass, NUMERO_DECIMAL__VALOR);

		valorEClass = createEClass(VALOR);

		operacionEClass = createEClass(OPERACION);
		createEAttribute(operacionEClass, OPERACION__SIGNO_OP);
		createEReference(operacionEClass, OPERACION__OP_IZQ);
		createEReference(operacionEClass, OPERACION__OP_DER);

		operando_izqEClass = createEClass(OPERANDO_IZQ);
		createEReference(operando_izqEClass, OPERANDO_IZQ__OPER_IZQ);

		operando_derEClass = createEClass(OPERANDO_DER);
		createEReference(operando_derEClass, OPERANDO_DER__OPER_DER);

		valorBooleanoEClass = createEClass(VALOR_BOOLEANO);
		createEAttribute(valorBooleanoEClass, VALOR_BOOLEANO__VALOR);

		siEClass = createEClass(SI);
		createEReference(siEClass, SI__SINO);
		createEReference(siEClass, SI__DEVUELVE);

		sinoEClass = createEClass(SINO);
		createEReference(sinoEClass, SINO__SENTENCIAS);
		createEReference(sinoEClass, SINO__DEVUELVE);

		bloqueEClass = createEClass(BLOQUE);
		createEReference(bloqueEClass, BLOQUE__VALOR);
		createEReference(bloqueEClass, BLOQUE__SENTENCIAS);

		mientrasEClass = createEClass(MIENTRAS);

		repetirEClass = createEClass(REPETIR);

		desdeEClass = createEClass(DESDE);
		createEReference(desdeEClass, DESDE__ASIGNACION);

		incrementoEClass = createEClass(INCREMENTO);
		createEAttribute(incrementoEClass, INCREMENTO__NOMBRE);
		createEAttribute(incrementoEClass, INCREMENTO__SSIGNO);

		subprocesoEClass = createEClass(SUBPROCESO);
		createEReference(subprocesoEClass, SUBPROCESO__PARAMETROFUNCION);
		createEReference(subprocesoEClass, SUBPROCESO__SENTENCIAS);
		createEAttribute(subprocesoEClass, SUBPROCESO__NOMBRE);
		createEReference(subprocesoEClass, SUBPROCESO__DECLARACION);

		procedimientoEClass = createEClass(PROCEDIMIENTO);

		caracterEClass = createEClass(CARACTER);
		createEAttribute(caracterEClass, CARACTER__CONTENIDO);

		internasEClass = createEClass(INTERNAS);
		createEAttribute(internasEClass, INTERNAS__NOMBRE);
		createEReference(internasEClass, INTERNAS__OPERADOR);

		segunEClass = createEClass(SEGUN);
		createEReference(segunEClass, SEGUN__CASO);
		createEReference(segunEClass, SEGUN__DEVUELVE);

		devolverEClass = createEClass(DEVOLVER);
		createEReference(devolverEClass, DEVOLVER__EREFERENCE0);
		createEReference(devolverEClass, DEVOLVER__DEVUELVE);

		casoEClass = createEClass(CASO);
		createEReference(casoEClass, CASO__OPERADOR);
		createEReference(casoEClass, CASO__DEVUELVE);
		createEReference(casoEClass, CASO__SENTENCIAS);

		unariaEClass = createEClass(UNARIA);
		createEAttribute(unariaEClass, UNARIA__SSIGNO);
		createEReference(unariaEClass, UNARIA__VARIABLE);

		constantesEClass = createEClass(CONSTANTES);
		createEReference(constantesEClass, CONSTANTES__VARIABLE);
		createEReference(constantesEClass, CONSTANTES__VALOR);

		vectorEClass = createEClass(VECTOR);
		createEAttribute(vectorEClass, VECTOR__TIPO_INTERNO);
		createEAttribute(vectorEClass, VECTOR__NOMBRE);
		createEAttribute(vectorEClass, VECTOR__CONSTANTE);

		declaracionPropiaEClass = createEClass(DECLARACION_PROPIA);
		createEAttribute(declaracionPropiaEClass, DECLARACION_PROPIA__TIPO);
		createEReference(declaracionPropiaEClass, DECLARACION_PROPIA__VARIABLE);

		declaracionEClass = createEClass(DECLARACION);

		matrizEClass = createEClass(MATRIZ);
		createEAttribute(matrizEClass, MATRIZ__CONSTANTE);
		createEAttribute(matrizEClass, MATRIZ__TIPO_INTERNO);
		createEAttribute(matrizEClass, MATRIZ__NOMBRE);
		createEAttribute(matrizEClass, MATRIZ__CONSTANTE2);

		tipoComplejoEClass = createEClass(TIPO_COMPLEJO);

		// Create enums
		tipoVariableEEnum = createEEnum(TIPO_VARIABLE);
		signoEEnum = createEEnum(SIGNO);
		booleanoEEnum = createEEnum(BOOLEANO);
		incEEnum = createEEnum(INC);
		tipoPasoEEnum = createEEnum(TIPO_PASO);
		nombreInternaEEnum = createEEnum(NOMBRE_INTERNA);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		declaracionVariableEClass.getESuperTypes().add(this.getDeclaracion());
		llamadaFuncionEClass.getESuperTypes().add(this.getSentencias());
		llamadaFuncionEClass.getESuperTypes().add(this.getvalor());
		variableIDEClass.getESuperTypes().add(this.getOperador());
		constCadenaEClass.getESuperTypes().add(this.getOperador());
		operadorEClass.getESuperTypes().add(this.getvalor());
		numeroEnteroEClass.getESuperTypes().add(this.getOperador());
		asignacionEClass.getESuperTypes().add(this.getSentencias());
		escribirEClass.getESuperTypes().add(this.getSentencias());
		funcionEClass.getESuperTypes().add(this.getSubproceso());
		leerEClass.getESuperTypes().add(this.getSentencias());
		numeroDecimalEClass.getESuperTypes().add(this.getOperador());
		operacionEClass.getESuperTypes().add(this.getvalor());
		valorBooleanoEClass.getESuperTypes().add(this.getOperador());
		siEClass.getESuperTypes().add(this.getBloque());
		bloqueEClass.getESuperTypes().add(this.getSentencias());
		mientrasEClass.getESuperTypes().add(this.getBloque());
		repetirEClass.getESuperTypes().add(this.getBloque());
		desdeEClass.getESuperTypes().add(this.getBloque());
		incrementoEClass.getESuperTypes().add(this.getSentencias());
		procedimientoEClass.getESuperTypes().add(this.getSubproceso());
		caracterEClass.getESuperTypes().add(this.getOperador());
		internasEClass.getESuperTypes().add(this.getvalor());
		segunEClass.getESuperTypes().add(this.getBloque());
		unariaEClass.getESuperTypes().add(this.getvalor());
		vectorEClass.getESuperTypes().add(this.getTipoComplejo());
		declaracionPropiaEClass.getESuperTypes().add(this.getDeclaracion());
		matrizEClass.getESuperTypes().add(this.getTipoComplejo());

		// Initialize classes, features, and operations; add parameters
		initEClass(codigoEClass, Codigo.class, "Codigo", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCodigo_Tiene(), this.getInicio(), null, "tiene", null, 1, 1, Codigo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCodigo_Funcion(), this.getSubproceso(), null, "funcion", null, 0, -1, Codigo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCodigo_Nombre(), ecorePackage.getEString(), "nombre", null, 0, 1, Codigo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCodigo_Constantes(), this.getConstantes(), null, "constantes", null, 0, -1, Codigo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCodigo_Tipocomplejo(), this.getTipoComplejo(), null, "tipocomplejo", null, 0, -1, Codigo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(inicioEClass, Inicio.class, "Inicio", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInicio_Tiene(), this.getSentencias(), null, "tiene", null, 0, -1, Inicio.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInicio_Declaracion(), this.getDeclaracion(), null, "declaracion", null, 0, -1, Inicio.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(sentenciasEClass, Sentencias.class, "Sentencias", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(declaracionVariableEClass, DeclaracionVariable.class, "DeclaracionVariable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDeclaracionVariable_Tipo(), this.getTipoVariable(), "tipo", null, 1, 1, DeclaracionVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDeclaracionVariable_TieneIDs(), this.getVariable(), null, "tieneIDs", null, 1, -1, DeclaracionVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(llamadaFuncionEClass, LlamadaFuncion.class, "LlamadaFuncion", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLlamadaFuncion_Nombre(), ecorePackage.getEString(), "nombre", null, 1, 1, LlamadaFuncion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLlamadaFuncion_Operador(), this.getOperador(), null, "operador", null, 0, -1, LlamadaFuncion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(variableIDEClass, VariableID.class, "VariableID", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getVariableID_Nombre(), ecorePackage.getEString(), "nombre", null, 1, 1, VariableID.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVariableID_Mat(), ecorePackage.getEString(), "Mat", null, 0, -1, VariableID.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(cadenaEClass, cadena.class, "cadena", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(constCadenaEClass, ConstCadena.class, "ConstCadena", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getConstCadena_Contenido(), ecorePackage.getEString(), "contenido", null, 1, 1, ConstCadena.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(variableEClass, Variable.class, "Variable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getVariable_Nombre(), ecorePackage.getEString(), "nombre", null, 1, 1, Variable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVariable_Mat(), ecorePackage.getEString(), "Mat", null, 0, -1, Variable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(operadorEClass, Operador.class, "Operador", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(numeroEnteroEClass, NumeroEntero.class, "NumeroEntero", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNumeroEntero_Valor(), ecorePackage.getEInt(), "valor", null, 1, 1, NumeroEntero.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(asignacionEClass, Asignacion.class, "Asignacion", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAsignacion_Lvalue(), ecorePackage.getEString(), "lvalue", null, 1, 1, Asignacion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAsignacion_Operador(), this.getvalor(), null, "operador", null, 1, 1, Asignacion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAsignacion_Mat(), ecorePackage.getEString(), "Mat", null, 0, -1, Asignacion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(escribirEClass, Escribir.class, "Escribir", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEscribir_Operador(), this.getOperador(), null, "operador", null, 1, -1, Escribir.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(funcionEClass, Funcion.class, "Funcion", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFuncion_Tipo(), this.getTipoVariable(), "tipo", null, 0, 1, Funcion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFuncion_Devuelve(), this.getDevolver(), null, "devuelve", null, 0, 1, Funcion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(parametroFuncionEClass, ParametroFuncion.class, "ParametroFuncion", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getParametroFuncion_Tipo(), this.getTipoVariable(), "tipo", null, 1, 1, ParametroFuncion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getParametroFuncion_Variable(), this.getVariable(), null, "variable", null, 1, 1, ParametroFuncion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getParametroFuncion_Paso(), this.getTipoPaso(), "paso", null, 1, 1, ParametroFuncion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(leerEClass, Leer.class, "Leer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLeer_Variable(), this.getVariableID(), null, "variable", null, 1, 1, Leer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(numeroDecimalEClass, NumeroDecimal.class, "NumeroDecimal", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNumeroDecimal_Valor(), ecorePackage.getEFloat(), "valor", null, 1, 1, NumeroDecimal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(valorEClass, valor.class, "valor", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(operacionEClass, operacion.class, "operacion", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getoperacion_Signo_op(), this.getsigno(), "signo_op", null, 0, 1, operacion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getoperacion_Op_izq(), this.getoperando_izq(), null, "op_izq", null, 1, 1, operacion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getoperacion_Op_der(), this.getoperando_der(), null, "op_der", null, 1, 1, operacion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(operando_izqEClass, operando_izq.class, "operando_izq", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getoperando_izq_Oper_izq(), this.getvalor(), null, "oper_izq", null, 1, 1, operando_izq.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(operando_derEClass, operando_der.class, "operando_der", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getoperando_der_Oper_der(), this.getvalor(), null, "oper_der", null, 1, 1, operando_der.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(valorBooleanoEClass, ValorBooleano.class, "ValorBooleano", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getValorBooleano_Valor(), this.getbooleano(), "valor", null, 1, 1, ValorBooleano.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(siEClass, Si.class, "Si", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSi_Sino(), this.getSino(), null, "sino", null, 0, 1, Si.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSi_Devuelve(), this.getDevolver(), null, "devuelve", null, 0, 1, Si.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(sinoEClass, Sino.class, "Sino", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSino_Sentencias(), this.getSentencias(), null, "sentencias", null, 0, -1, Sino.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSino_Devuelve(), this.getDevolver(), null, "devuelve", null, 0, 1, Sino.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(bloqueEClass, Bloque.class, "Bloque", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBloque_Valor(), this.getvalor(), null, "valor", null, 1, 1, Bloque.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBloque_Sentencias(), this.getSentencias(), null, "sentencias", null, 0, -1, Bloque.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(mientrasEClass, mientras.class, "mientras", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(repetirEClass, repetir.class, "repetir", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(desdeEClass, desde.class, "desde", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getdesde_Asignacion(), this.getAsignacion(), null, "asignacion", null, 1, 1, desde.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(incrementoEClass, incremento.class, "incremento", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getincremento_Nombre(), ecorePackage.getEString(), "nombre", null, 1, 1, incremento.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getincremento_Ssigno(), this.getinc(), "ssigno", null, 1, 1, incremento.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(subprocesoEClass, Subproceso.class, "Subproceso", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSubproceso_Parametrofuncion(), this.getParametroFuncion(), null, "parametrofuncion", null, 0, -1, Subproceso.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSubproceso_Sentencias(), this.getSentencias(), null, "sentencias", null, 0, -1, Subproceso.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSubproceso_Nombre(), ecorePackage.getEString(), "nombre", null, 1, 1, Subproceso.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSubproceso_Declaracion(), this.getDeclaracion(), null, "declaracion", null, 0, -1, Subproceso.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(procedimientoEClass, Procedimiento.class, "Procedimiento", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(caracterEClass, Caracter.class, "Caracter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCaracter_Contenido(), ecorePackage.getEString(), "contenido", null, 1, 1, Caracter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(internasEClass, Internas.class, "Internas", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getInternas_Nombre(), this.getNombreInterna(), "nombre", null, 0, 1, Internas.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInternas_Operador(), this.getOperador(), null, "operador", null, 1, 1, Internas.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(segunEClass, segun.class, "segun", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getsegun_Caso(), this.getCaso(), null, "caso", null, 0, -1, segun.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getsegun_Devuelve(), this.getDevolver(), null, "devuelve", null, 0, 1, segun.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(devolverEClass, Devolver.class, "Devolver", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDevolver_EReference0(), this.getDevolver(), null, "EReference0", null, 0, 1, Devolver.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDevolver_Devuelve(), this.getvalor(), null, "devuelve", null, 1, 1, Devolver.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(casoEClass, Caso.class, "Caso", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCaso_Operador(), this.getOperador(), null, "operador", null, 1, 1, Caso.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCaso_Devuelve(), this.getDevolver(), null, "devuelve", null, 0, 1, Caso.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCaso_Sentencias(), this.getSentencias(), null, "sentencias", null, 0, -1, Caso.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(unariaEClass, unaria.class, "unaria", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getunaria_Ssigno(), this.getinc(), "ssigno", null, 1, 1, unaria.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getunaria_Variable(), this.getvalor(), null, "variable", null, 1, 1, unaria.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(constantesEClass, Constantes.class, "Constantes", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getConstantes_Variable(), this.getVariable(), null, "variable", null, 1, 1, Constantes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConstantes_Valor(), this.getvalor(), null, "valor", null, 1, 1, Constantes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(vectorEClass, Vector.class, "Vector", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getVector_TipoInterno(), this.getTipoVariable(), "tipoInterno", null, 1, 1, Vector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVector_Nombre(), ecorePackage.getEString(), "nombre", null, 1, 1, Vector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVector_Constante(), ecorePackage.getEString(), "constante", null, 1, 1, Vector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(declaracionPropiaEClass, DeclaracionPropia.class, "DeclaracionPropia", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDeclaracionPropia_Tipo(), ecorePackage.getEString(), "tipo", null, 1, 1, DeclaracionPropia.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDeclaracionPropia_Variable(), this.getVariable(), null, "variable", null, 0, -1, DeclaracionPropia.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(declaracionEClass, Declaracion.class, "Declaracion", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(matrizEClass, Matriz.class, "Matriz", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMatriz_Constante(), ecorePackage.getEString(), "constante", null, 1, 1, Matriz.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMatriz_TipoInterno(), this.getTipoVariable(), "tipoInterno", null, 1, 1, Matriz.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMatriz_Nombre(), ecorePackage.getEString(), "nombre", null, 1, 1, Matriz.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMatriz_Constante2(), ecorePackage.getEString(), "constante2", null, 1, 1, Matriz.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tipoComplejoEClass, TipoComplejo.class, "TipoComplejo", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Initialize enums and add enum literals
		initEEnum(tipoVariableEEnum, TipoVariable.class, "TipoVariable");
		addEEnumLiteral(tipoVariableEEnum, TipoVariable.ENTERO);
		addEEnumLiteral(tipoVariableEEnum, TipoVariable.CARACTER);
		addEEnumLiteral(tipoVariableEEnum, TipoVariable.CADENA);
		addEEnumLiteral(tipoVariableEEnum, TipoVariable.LOGICO);
		addEEnumLiteral(tipoVariableEEnum, TipoVariable.REAL);

		initEEnum(signoEEnum, signo.class, "signo");
		addEEnumLiteral(signoEEnum, signo.SUM);
		addEEnumLiteral(signoEEnum, signo.RES);
		addEEnumLiteral(signoEEnum, signo.MULT);
		addEEnumLiteral(signoEEnum, signo.DIV);
		addEEnumLiteral(signoEEnum, signo.MAYOR);
		addEEnumLiteral(signoEEnum, signo.MENOR);
		addEEnumLiteral(signoEEnum, signo.MAYORIGUAL);
		addEEnumLiteral(signoEEnum, signo.MENORIGUAL);
		addEEnumLiteral(signoEEnum, signo.Y);
		addEEnumLiteral(signoEEnum, signo.O);
		addEEnumLiteral(signoEEnum, signo.IGUALIGUAL);
		addEEnumLiteral(signoEEnum, signo.DISTINTO);

		initEEnum(booleanoEEnum, booleano.class, "booleano");
		addEEnumLiteral(booleanoEEnum, booleano.VERDADERO);
		addEEnumLiteral(booleanoEEnum, booleano.FALSO);

		initEEnum(incEEnum, inc.class, "inc");
		addEEnumLiteral(incEEnum, inc.MASMAS);
		addEEnumLiteral(incEEnum, inc.MENOSMENOS);
		addEEnumLiteral(incEEnum, inc.NO);

		initEEnum(tipoPasoEEnum, TipoPaso.class, "TipoPaso");
		addEEnumLiteral(tipoPasoEEnum, TipoPaso.ENTRADA);
		addEEnumLiteral(tipoPasoEEnum, TipoPaso.ENTRADA_SALIDA);
		addEEnumLiteral(tipoPasoEEnum, TipoPaso.SALIDA);

		initEEnum(nombreInternaEEnum, NombreInterna.class, "NombreInterna");
		addEEnumLiteral(nombreInternaEEnum, NombreInterna.COS);
		addEEnumLiteral(nombreInternaEEnum, NombreInterna.CUADRADO);
		addEEnumLiteral(nombreInternaEEnum, NombreInterna.EXP);
		addEEnumLiteral(nombreInternaEEnum, NombreInterna.LN);
		addEEnumLiteral(nombreInternaEEnum, NombreInterna.LOG);
		addEEnumLiteral(nombreInternaEEnum, NombreInterna.SEN);
		addEEnumLiteral(nombreInternaEEnum, NombreInterna.SQRT);

		// Create resource
		createResource(eNS_URI);
	}

} //DiagramapseudocodigoPackageImpl
