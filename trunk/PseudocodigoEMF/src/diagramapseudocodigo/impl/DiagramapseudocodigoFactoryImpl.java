/**
 */
package diagramapseudocodigo.impl;

import diagramapseudocodigo.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DiagramapseudocodigoFactoryImpl extends EFactoryImpl implements DiagramapseudocodigoFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static DiagramapseudocodigoFactory init() {
		try {
			DiagramapseudocodigoFactory theDiagramapseudocodigoFactory = (DiagramapseudocodigoFactory)EPackage.Registry.INSTANCE.getEFactory("http://diagramapseudocodigo/1.0"); 
			if (theDiagramapseudocodigoFactory != null) {
				return theDiagramapseudocodigoFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new DiagramapseudocodigoFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DiagramapseudocodigoFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case DiagramapseudocodigoPackage.CODIGO: return createCodigo();
			case DiagramapseudocodigoPackage.INICIO: return createInicio();
			case DiagramapseudocodigoPackage.DECLARACION_VARIABLE: return createDeclaracionVariable();
			case DiagramapseudocodigoPackage.LLAMADA_FUNCION: return createLlamadaFuncion();
			case DiagramapseudocodigoPackage.VARIABLE_ID: return createVariableID();
			case DiagramapseudocodigoPackage.CADENA: return createcadena();
			case DiagramapseudocodigoPackage.CONST_CADENA: return createConstCadena();
			case DiagramapseudocodigoPackage.VARIABLE: return createVariable();
			case DiagramapseudocodigoPackage.NUMERO_ENTERO: return createNumeroEntero();
			case DiagramapseudocodigoPackage.ASIGNACION: return createAsignacion();
			case DiagramapseudocodigoPackage.ESCRIBIR: return createEscribir();
			case DiagramapseudocodigoPackage.FUNCION: return createFuncion();
			case DiagramapseudocodigoPackage.PARAMETRO_FUNCION: return createParametroFuncion();
			case DiagramapseudocodigoPackage.LEER: return createLeer();
			case DiagramapseudocodigoPackage.NUMERO_DECIMAL: return createNumeroDecimal();
			case DiagramapseudocodigoPackage.OPERACION: return createoperacion();
			case DiagramapseudocodigoPackage.OPERANDO_IZQ: return createoperando_izq();
			case DiagramapseudocodigoPackage.OPERANDO_DER: return createoperando_der();
			case DiagramapseudocodigoPackage.VALOR_BOOLEANO: return createValorBooleano();
			case DiagramapseudocodigoPackage.SI: return createSi();
			case DiagramapseudocodigoPackage.SINO: return createSino();
			case DiagramapseudocodigoPackage.MIENTRAS: return createmientras();
			case DiagramapseudocodigoPackage.REPETIR: return createrepetir();
			case DiagramapseudocodigoPackage.DESDE: return createdesde();
			case DiagramapseudocodigoPackage.INCREMENTO: return createincremento();
			case DiagramapseudocodigoPackage.PROCEDIMIENTO: return createProcedimiento();
			case DiagramapseudocodigoPackage.CARACTER: return createCaracter();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case DiagramapseudocodigoPackage.TIPO_VARIABLE:
				return createTipoVariableFromString(eDataType, initialValue);
			case DiagramapseudocodigoPackage.SIGNO:
				return createsignoFromString(eDataType, initialValue);
			case DiagramapseudocodigoPackage.BOOLEANO:
				return createbooleanoFromString(eDataType, initialValue);
			case DiagramapseudocodigoPackage.INC:
				return createincFromString(eDataType, initialValue);
			case DiagramapseudocodigoPackage.TIPO_PASO:
				return createTipoPasoFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case DiagramapseudocodigoPackage.TIPO_VARIABLE:
				return convertTipoVariableToString(eDataType, instanceValue);
			case DiagramapseudocodigoPackage.SIGNO:
				return convertsignoToString(eDataType, instanceValue);
			case DiagramapseudocodigoPackage.BOOLEANO:
				return convertbooleanoToString(eDataType, instanceValue);
			case DiagramapseudocodigoPackage.INC:
				return convertincToString(eDataType, instanceValue);
			case DiagramapseudocodigoPackage.TIPO_PASO:
				return convertTipoPasoToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Codigo createCodigo() {
		CodigoImpl codigo = new CodigoImpl();
		return codigo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Inicio createInicio() {
		InicioImpl inicio = new InicioImpl();
		return inicio;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeclaracionVariable createDeclaracionVariable() {
		DeclaracionVariableImpl declaracionVariable = new DeclaracionVariableImpl();
		return declaracionVariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LlamadaFuncion createLlamadaFuncion() {
		LlamadaFuncionImpl llamadaFuncion = new LlamadaFuncionImpl();
		return llamadaFuncion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VariableID createVariableID() {
		VariableIDImpl variableID = new VariableIDImpl();
		return variableID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public cadena createcadena() {
		cadenaImpl cadena = new cadenaImpl();
		return cadena;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConstCadena createConstCadena() {
		ConstCadenaImpl constCadena = new ConstCadenaImpl();
		return constCadena;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Variable createVariable() {
		VariableImpl variable = new VariableImpl();
		return variable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NumeroEntero createNumeroEntero() {
		NumeroEnteroImpl numeroEntero = new NumeroEnteroImpl();
		return numeroEntero;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Asignacion createAsignacion() {
		AsignacionImpl asignacion = new AsignacionImpl();
		return asignacion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Escribir createEscribir() {
		EscribirImpl escribir = new EscribirImpl();
		return escribir;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Funcion createFuncion() {
		FuncionImpl funcion = new FuncionImpl();
		return funcion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParametroFuncion createParametroFuncion() {
		ParametroFuncionImpl parametroFuncion = new ParametroFuncionImpl();
		return parametroFuncion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Leer createLeer() {
		LeerImpl leer = new LeerImpl();
		return leer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NumeroDecimal createNumeroDecimal() {
		NumeroDecimalImpl numeroDecimal = new NumeroDecimalImpl();
		return numeroDecimal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public operacion createoperacion() {
		operacionImpl operacion = new operacionImpl();
		return operacion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public operando_izq createoperando_izq() {
		operando_izqImpl operando_izq = new operando_izqImpl();
		return operando_izq;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public operando_der createoperando_der() {
		operando_derImpl operando_der = new operando_derImpl();
		return operando_der;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValorBooleano createValorBooleano() {
		ValorBooleanoImpl valorBooleano = new ValorBooleanoImpl();
		return valorBooleano;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Si createSi() {
		SiImpl si = new SiImpl();
		return si;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Sino createSino() {
		SinoImpl sino = new SinoImpl();
		return sino;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public mientras createmientras() {
		mientrasImpl mientras = new mientrasImpl();
		return mientras;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public repetir createrepetir() {
		repetirImpl repetir = new repetirImpl();
		return repetir;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public desde createdesde() {
		desdeImpl desde = new desdeImpl();
		return desde;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public incremento createincremento() {
		incrementoImpl incremento = new incrementoImpl();
		return incremento;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Procedimiento createProcedimiento() {
		ProcedimientoImpl procedimiento = new ProcedimientoImpl();
		return procedimiento;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Caracter createCaracter() {
		CaracterImpl caracter = new CaracterImpl();
		return caracter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TipoVariable createTipoVariableFromString(EDataType eDataType, String initialValue) {
		TipoVariable result = TipoVariable.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTipoVariableToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public signo createsignoFromString(EDataType eDataType, String initialValue) {
		signo result = signo.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertsignoToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public booleano createbooleanoFromString(EDataType eDataType, String initialValue) {
		booleano result = booleano.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertbooleanoToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public inc createincFromString(EDataType eDataType, String initialValue) {
		inc result = inc.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertincToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TipoPaso createTipoPasoFromString(EDataType eDataType, String initialValue) {
		TipoPaso result = TipoPaso.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTipoPasoToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DiagramapseudocodigoPackage getDiagramapseudocodigoPackage() {
		return (DiagramapseudocodigoPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static DiagramapseudocodigoPackage getPackage() {
		return DiagramapseudocodigoPackage.eINSTANCE;
	}

} //DiagramapseudocodigoFactoryImpl