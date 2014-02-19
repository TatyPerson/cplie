/**
 */
package diagramapseudocodigo.impl;

import diagramapseudocodigo.AsignacionNormal;
import diagramapseudocodigo.DiagramapseudocodigoPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Asignacion Normal</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link diagramapseudocodigo.impl.AsignacionNormalImpl#getLvalue <em>Lvalue</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AsignacionNormalImpl extends AsignacionImpl implements AsignacionNormal {
	/**
	 * The default value of the '{@link #getLvalue() <em>Lvalue</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLvalue()
	 * @generated
	 * @ordered
	 */
	protected static final String LVALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLvalue() <em>Lvalue</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLvalue()
	 * @generated
	 * @ordered
	 */
	protected String lvalue = LVALUE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AsignacionNormalImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DiagramapseudocodigoPackage.Literals.ASIGNACION_NORMAL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLvalue() {
		return lvalue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLvalue(String newLvalue) {
		String oldLvalue = lvalue;
		lvalue = newLvalue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DiagramapseudocodigoPackage.ASIGNACION_NORMAL__LVALUE, oldLvalue, lvalue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DiagramapseudocodigoPackage.ASIGNACION_NORMAL__LVALUE:
				return getLvalue();
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
			case DiagramapseudocodigoPackage.ASIGNACION_NORMAL__LVALUE:
				setLvalue((String)newValue);
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
			case DiagramapseudocodigoPackage.ASIGNACION_NORMAL__LVALUE:
				setLvalue(LVALUE_EDEFAULT);
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
			case DiagramapseudocodigoPackage.ASIGNACION_NORMAL__LVALUE:
				return LVALUE_EDEFAULT == null ? lvalue != null : !LVALUE_EDEFAULT.equals(lvalue);
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
		result.append(" (lvalue: ");
		result.append(lvalue);
		result.append(')');
		return result.toString();
	}

} //AsignacionNormalImpl
