/**
 */
package diagramapseudocodigo.impl;

import diagramapseudocodigo.DiagramapseudocodigoPackage;
import diagramapseudocodigo.inc;
import diagramapseudocodigo.incremento;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>incremento</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link diagramapseudocodigo.impl.incrementoImpl#getNombre <em>Nombre</em>}</li>
 *   <li>{@link diagramapseudocodigo.impl.incrementoImpl#getSsigno <em>Ssigno</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class incrementoImpl extends SentenciasImpl implements incremento {
	/**
	 * The default value of the '{@link #getNombre() <em>Nombre</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNombre()
	 * @generated
	 * @ordered
	 */
	public static final String NOMBRE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNombre() <em>Nombre</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNombre()
	 * @generated
	 * @ordered
	 */
	public String nombre = NOMBRE_EDEFAULT;

	/**
	 * The default value of the '{@link #getSsigno() <em>Ssigno</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSsigno()
	 * @generated
	 * @ordered
	 */
	public static final inc SSIGNO_EDEFAULT = inc.MASMAS;

	/**
	 * The cached value of the '{@link #getSsigno() <em>Ssigno</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSsigno()
	 * @generated
	 * @ordered
	 */
	public inc ssigno = SSIGNO_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public incrementoImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass eStaticClass() {
		return DiagramapseudocodigoPackage.Literals.INCREMENTO;
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
			eNotify(new ENotificationImpl(this, Notification.SET, DiagramapseudocodigoPackage.INCREMENTO__NOMBRE, oldNombre, nombre));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public inc getSsigno() {
		return ssigno;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSsigno(inc newSsigno) {
		inc oldSsigno = ssigno;
		ssigno = newSsigno == null ? SSIGNO_EDEFAULT : newSsigno;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DiagramapseudocodigoPackage.INCREMENTO__SSIGNO, oldSsigno, ssigno));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DiagramapseudocodigoPackage.INCREMENTO__NOMBRE:
				return getNombre();
			case DiagramapseudocodigoPackage.INCREMENTO__SSIGNO:
				return getSsigno();
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
			case DiagramapseudocodigoPackage.INCREMENTO__NOMBRE:
				setNombre((String)newValue);
				return;
			case DiagramapseudocodigoPackage.INCREMENTO__SSIGNO:
				setSsigno((inc)newValue);
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
			case DiagramapseudocodigoPackage.INCREMENTO__NOMBRE:
				setNombre(NOMBRE_EDEFAULT);
				return;
			case DiagramapseudocodigoPackage.INCREMENTO__SSIGNO:
				setSsigno(SSIGNO_EDEFAULT);
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
			case DiagramapseudocodigoPackage.INCREMENTO__NOMBRE:
				return NOMBRE_EDEFAULT == null ? nombre != null : !NOMBRE_EDEFAULT.equals(nombre);
			case DiagramapseudocodigoPackage.INCREMENTO__SSIGNO:
				return ssigno != SSIGNO_EDEFAULT;
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
		result.append(" (nombre: ");
		result.append(nombre);
		result.append(", ssigno: ");
		result.append(ssigno);
		result.append(')');
		return result.toString();
	}

} //incrementoImpl
