/**
 */
package diagramapseudocodigo.impl;

import diagramapseudocodigo.DiagramapseudocodigoPackage;
import diagramapseudocodigo.Subrango;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Subrango</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link diagramapseudocodigo.impl.SubrangoImpl#getNombre <em>Nombre</em>}</li>
 *   <li>{@link diagramapseudocodigo.impl.SubrangoImpl#getLimite_inf <em>Limite inf</em>}</li>
 *   <li>{@link diagramapseudocodigo.impl.SubrangoImpl#getLimite_sup <em>Limite sup</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SubrangoImpl extends TipoComplejoImpl implements Subrango {
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
	 * The default value of the '{@link #getLimite_inf() <em>Limite inf</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLimite_inf()
	 * @generated
	 * @ordered
	 */
	protected static final int LIMITE_INF_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getLimite_inf() <em>Limite inf</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLimite_inf()
	 * @generated
	 * @ordered
	 */
	protected int limite_inf = LIMITE_INF_EDEFAULT;

	/**
	 * The default value of the '{@link #getLimite_sup() <em>Limite sup</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLimite_sup()
	 * @generated
	 * @ordered
	 */
	protected static final int LIMITE_SUP_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getLimite_sup() <em>Limite sup</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLimite_sup()
	 * @generated
	 * @ordered
	 */
	protected int limite_sup = LIMITE_SUP_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubrangoImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DiagramapseudocodigoPackage.Literals.SUBRANGO;
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
			eNotify(new ENotificationImpl(this, Notification.SET, DiagramapseudocodigoPackage.SUBRANGO__NOMBRE, oldNombre, nombre));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getLimite_inf() {
		return limite_inf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLimite_inf(int newLimite_inf) {
		int oldLimite_inf = limite_inf;
		limite_inf = newLimite_inf;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DiagramapseudocodigoPackage.SUBRANGO__LIMITE_INF, oldLimite_inf, limite_inf));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getLimite_sup() {
		return limite_sup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLimite_sup(int newLimite_sup) {
		int oldLimite_sup = limite_sup;
		limite_sup = newLimite_sup;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DiagramapseudocodigoPackage.SUBRANGO__LIMITE_SUP, oldLimite_sup, limite_sup));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DiagramapseudocodigoPackage.SUBRANGO__NOMBRE:
				return getNombre();
			case DiagramapseudocodigoPackage.SUBRANGO__LIMITE_INF:
				return getLimite_inf();
			case DiagramapseudocodigoPackage.SUBRANGO__LIMITE_SUP:
				return getLimite_sup();
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
			case DiagramapseudocodigoPackage.SUBRANGO__NOMBRE:
				setNombre((String)newValue);
				return;
			case DiagramapseudocodigoPackage.SUBRANGO__LIMITE_INF:
				setLimite_inf((Integer)newValue);
				return;
			case DiagramapseudocodigoPackage.SUBRANGO__LIMITE_SUP:
				setLimite_sup((Integer)newValue);
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
			case DiagramapseudocodigoPackage.SUBRANGO__NOMBRE:
				setNombre(NOMBRE_EDEFAULT);
				return;
			case DiagramapseudocodigoPackage.SUBRANGO__LIMITE_INF:
				setLimite_inf(LIMITE_INF_EDEFAULT);
				return;
			case DiagramapseudocodigoPackage.SUBRANGO__LIMITE_SUP:
				setLimite_sup(LIMITE_SUP_EDEFAULT);
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
			case DiagramapseudocodigoPackage.SUBRANGO__NOMBRE:
				return NOMBRE_EDEFAULT == null ? nombre != null : !NOMBRE_EDEFAULT.equals(nombre);
			case DiagramapseudocodigoPackage.SUBRANGO__LIMITE_INF:
				return limite_inf != LIMITE_INF_EDEFAULT;
			case DiagramapseudocodigoPackage.SUBRANGO__LIMITE_SUP:
				return limite_sup != LIMITE_SUP_EDEFAULT;
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
		result.append(", limite_inf: ");
		result.append(limite_inf);
		result.append(", limite_sup: ");
		result.append(limite_sup);
		result.append(')');
		return result.toString();
	}

} //SubrangoImpl