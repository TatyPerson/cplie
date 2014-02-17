/**
 */
package diagramapseudocodigo.impl;

import diagramapseudocodigo.DiagramapseudocodigoPackage;
import diagramapseudocodigo.Matriz;
import diagramapseudocodigo.TipoVariable;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Matriz</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link diagramapseudocodigo.impl.MatrizImpl#getConstante <em>Constante</em>}</li>
 *   <li>{@link diagramapseudocodigo.impl.MatrizImpl#getTipoInterno <em>Tipo Interno</em>}</li>
 *   <li>{@link diagramapseudocodigo.impl.MatrizImpl#getNombre <em>Nombre</em>}</li>
 *   <li>{@link diagramapseudocodigo.impl.MatrizImpl#getConstante2 <em>Constante2</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MatrizImpl extends TipoComplejoImpl implements Matriz {
	/**
	 * The default value of the '{@link #getConstante() <em>Constante</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConstante()
	 * @generated
	 * @ordered
	 */
	protected static final String CONSTANTE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getConstante() <em>Constante</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConstante()
	 * @generated
	 * @ordered
	 */
	protected String constante = CONSTANTE_EDEFAULT;

	/**
	 * The default value of the '{@link #getTipoInterno() <em>Tipo Interno</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTipoInterno()
	 * @generated
	 * @ordered
	 */
	protected static final TipoVariable TIPO_INTERNO_EDEFAULT = TipoVariable.ENTERO;

	/**
	 * The cached value of the '{@link #getTipoInterno() <em>Tipo Interno</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTipoInterno()
	 * @generated
	 * @ordered
	 */
	protected TipoVariable tipoInterno = TIPO_INTERNO_EDEFAULT;

	/**
	 * The default value of the '{@link #getNombre() <em>Nombre</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNombre()
	 * @generated
	 * @ordered
	 */
	protected static final String NOMBRE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNombre() <em>Nombre</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNombre()
	 * @generated
	 * @ordered
	 */
	protected String nombre = NOMBRE_EDEFAULT;

	/**
	 * The default value of the '{@link #getConstante2() <em>Constante2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConstante2()
	 * @generated
	 * @ordered
	 */
	protected static final String CONSTANTE2_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getConstante2() <em>Constante2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConstante2()
	 * @generated
	 * @ordered
	 */
	protected String constante2 = CONSTANTE2_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MatrizImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DiagramapseudocodigoPackage.Literals.MATRIZ;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getConstante() {
		return constante;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConstante(String newConstante) {
		String oldConstante = constante;
		constante = newConstante;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DiagramapseudocodigoPackage.MATRIZ__CONSTANTE, oldConstante, constante));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TipoVariable getTipoInterno() {
		return tipoInterno;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTipoInterno(TipoVariable newTipoInterno) {
		TipoVariable oldTipoInterno = tipoInterno;
		tipoInterno = newTipoInterno == null ? TIPO_INTERNO_EDEFAULT : newTipoInterno;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DiagramapseudocodigoPackage.MATRIZ__TIPO_INTERNO, oldTipoInterno, tipoInterno));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNombre(String newNombre) {
		String oldNombre = nombre;
		nombre = newNombre;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DiagramapseudocodigoPackage.MATRIZ__NOMBRE, oldNombre, nombre));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getConstante2() {
		return constante2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConstante2(String newConstante2) {
		String oldConstante2 = constante2;
		constante2 = newConstante2;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DiagramapseudocodigoPackage.MATRIZ__CONSTANTE2, oldConstante2, constante2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DiagramapseudocodigoPackage.MATRIZ__CONSTANTE:
				return getConstante();
			case DiagramapseudocodigoPackage.MATRIZ__TIPO_INTERNO:
				return getTipoInterno();
			case DiagramapseudocodigoPackage.MATRIZ__NOMBRE:
				return getNombre();
			case DiagramapseudocodigoPackage.MATRIZ__CONSTANTE2:
				return getConstante2();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case DiagramapseudocodigoPackage.MATRIZ__CONSTANTE:
				setConstante((String)newValue);
				return;
			case DiagramapseudocodigoPackage.MATRIZ__TIPO_INTERNO:
				setTipoInterno((TipoVariable)newValue);
				return;
			case DiagramapseudocodigoPackage.MATRIZ__NOMBRE:
				setNombre((String)newValue);
				return;
			case DiagramapseudocodigoPackage.MATRIZ__CONSTANTE2:
				setConstante2((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case DiagramapseudocodigoPackage.MATRIZ__CONSTANTE:
				setConstante(CONSTANTE_EDEFAULT);
				return;
			case DiagramapseudocodigoPackage.MATRIZ__TIPO_INTERNO:
				setTipoInterno(TIPO_INTERNO_EDEFAULT);
				return;
			case DiagramapseudocodigoPackage.MATRIZ__NOMBRE:
				setNombre(NOMBRE_EDEFAULT);
				return;
			case DiagramapseudocodigoPackage.MATRIZ__CONSTANTE2:
				setConstante2(CONSTANTE2_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case DiagramapseudocodigoPackage.MATRIZ__CONSTANTE:
				return CONSTANTE_EDEFAULT == null ? constante != null : !CONSTANTE_EDEFAULT.equals(constante);
			case DiagramapseudocodigoPackage.MATRIZ__TIPO_INTERNO:
				return tipoInterno != TIPO_INTERNO_EDEFAULT;
			case DiagramapseudocodigoPackage.MATRIZ__NOMBRE:
				return NOMBRE_EDEFAULT == null ? nombre != null : !NOMBRE_EDEFAULT.equals(nombre);
			case DiagramapseudocodigoPackage.MATRIZ__CONSTANTE2:
				return CONSTANTE2_EDEFAULT == null ? constante2 != null : !CONSTANTE2_EDEFAULT.equals(constante2);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (constante: ");
		result.append(constante);
		result.append(", tipoInterno: ");
		result.append(tipoInterno);
		result.append(", nombre: ");
		result.append(nombre);
		result.append(", constante2: ");
		result.append(constante2);
		result.append(')');
		return result.toString();
	}

} //MatrizImpl
