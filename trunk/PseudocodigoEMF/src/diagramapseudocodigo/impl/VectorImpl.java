/**
 */
package diagramapseudocodigo.impl;

import diagramapseudocodigo.DiagramapseudocodigoPackage;
import diagramapseudocodigo.TipoVariable;
import diagramapseudocodigo.Vector;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Vector</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link diagramapseudocodigo.impl.VectorImpl#getTipoInterno <em>Tipo Interno</em>}</li>
 *   <li>{@link diagramapseudocodigo.impl.VectorImpl#getNombre <em>Nombre</em>}</li>
 *   <li>{@link diagramapseudocodigo.impl.VectorImpl#getConstante <em>Constante</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class VectorImpl extends MinimalEObjectImpl.Container implements Vector {
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VectorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DiagramapseudocodigoPackage.Literals.VECTOR;
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
			eNotify(new ENotificationImpl(this, Notification.SET, DiagramapseudocodigoPackage.VECTOR__CONSTANTE, oldConstante, constante));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DiagramapseudocodigoPackage.VECTOR__TIPO_INTERNO, oldTipoInterno, tipoInterno));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DiagramapseudocodigoPackage.VECTOR__NOMBRE, oldNombre, nombre));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DiagramapseudocodigoPackage.VECTOR__TIPO_INTERNO:
				return getTipoInterno();
			case DiagramapseudocodigoPackage.VECTOR__NOMBRE:
				return getNombre();
			case DiagramapseudocodigoPackage.VECTOR__CONSTANTE:
				return getConstante();
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
			case DiagramapseudocodigoPackage.VECTOR__TIPO_INTERNO:
				setTipoInterno((TipoVariable)newValue);
				return;
			case DiagramapseudocodigoPackage.VECTOR__NOMBRE:
				setNombre((String)newValue);
				return;
			case DiagramapseudocodigoPackage.VECTOR__CONSTANTE:
				setConstante((String)newValue);
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
			case DiagramapseudocodigoPackage.VECTOR__TIPO_INTERNO:
				setTipoInterno(TIPO_INTERNO_EDEFAULT);
				return;
			case DiagramapseudocodigoPackage.VECTOR__NOMBRE:
				setNombre(NOMBRE_EDEFAULT);
				return;
			case DiagramapseudocodigoPackage.VECTOR__CONSTANTE:
				setConstante(CONSTANTE_EDEFAULT);
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
			case DiagramapseudocodigoPackage.VECTOR__TIPO_INTERNO:
				return tipoInterno != TIPO_INTERNO_EDEFAULT;
			case DiagramapseudocodigoPackage.VECTOR__NOMBRE:
				return NOMBRE_EDEFAULT == null ? nombre != null : !NOMBRE_EDEFAULT.equals(nombre);
			case DiagramapseudocodigoPackage.VECTOR__CONSTANTE:
				return CONSTANTE_EDEFAULT == null ? constante != null : !CONSTANTE_EDEFAULT.equals(constante);
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
		result.append(" (tipoInterno: ");
		result.append(tipoInterno);
		result.append(", nombre: ");
		result.append(nombre);
		result.append(", constante: ");
		result.append(constante);
		result.append(')');
		return result.toString();
	}

} //VectorImpl
