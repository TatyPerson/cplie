/**
 */
package diagramapseudocodigo.impl;

import diagramapseudocodigo.DiagramapseudocodigoPackage;
import diagramapseudocodigo.operando_der;
import diagramapseudocodigo.valor;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>operando der</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link diagramapseudocodigo.impl.operando_derImpl#getOper_der <em>Oper der</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class operando_derImpl extends EObjectImpl implements operando_der {
	/**
	 * The cached value of the '{@link #getOper_der() <em>Oper der</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOper_der()
	 * @generated
	 * @ordered
	 */
	public valor oper_der;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public operando_derImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass eStaticClass() {
		return DiagramapseudocodigoPackage.Literals.OPERANDO_DER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public valor getOper_der() {
		return oper_der;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOper_der(valor newOper_der, NotificationChain msgs) {
		valor oldOper_der = oper_der;
		oper_der = newOper_der;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DiagramapseudocodigoPackage.OPERANDO_DER__OPER_DER, oldOper_der, newOper_der);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOper_der(valor newOper_der) {
		if (newOper_der != oper_der) {
			NotificationChain msgs = null;
			if (oper_der != null)
				msgs = ((InternalEObject)oper_der).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DiagramapseudocodigoPackage.OPERANDO_DER__OPER_DER, null, msgs);
			if (newOper_der != null)
				msgs = ((InternalEObject)newOper_der).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DiagramapseudocodigoPackage.OPERANDO_DER__OPER_DER, null, msgs);
			msgs = basicSetOper_der(newOper_der, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DiagramapseudocodigoPackage.OPERANDO_DER__OPER_DER, newOper_der, newOper_der));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DiagramapseudocodigoPackage.OPERANDO_DER__OPER_DER:
				return basicSetOper_der(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DiagramapseudocodigoPackage.OPERANDO_DER__OPER_DER:
				return getOper_der();
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
			case DiagramapseudocodigoPackage.OPERANDO_DER__OPER_DER:
				setOper_der((valor)newValue);
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
			case DiagramapseudocodigoPackage.OPERANDO_DER__OPER_DER:
				setOper_der((valor)null);
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
			case DiagramapseudocodigoPackage.OPERANDO_DER__OPER_DER:
				return oper_der != null;
		}
		return super.eIsSet(featureID);
	}

} //operando_derImpl
