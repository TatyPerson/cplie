/**
 */
package diagramapseudocodigo.impl;

import diagramapseudocodigo.DiagramapseudocodigoPackage;
import diagramapseudocodigo.operando_izq;
import diagramapseudocodigo.valor;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>operando izq</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link diagramapseudocodigo.impl.operando_izqImpl#getOper_izq <em>Oper izq</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class operando_izqImpl extends EObjectImpl implements operando_izq {
	/**
	 * The cached value of the '{@link #getOper_izq() <em>Oper izq</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOper_izq()
	 * @generated
	 * @ordered
	 */
	public valor oper_izq;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public operando_izqImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass eStaticClass() {
		return DiagramapseudocodigoPackage.Literals.OPERANDO_IZQ;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public valor getOper_izq() {
		return oper_izq;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOper_izq(valor newOper_izq, NotificationChain msgs) {
		valor oldOper_izq = oper_izq;
		oper_izq = newOper_izq;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DiagramapseudocodigoPackage.OPERANDO_IZQ__OPER_IZQ, oldOper_izq, newOper_izq);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOper_izq(valor newOper_izq) {
		if (newOper_izq != oper_izq) {
			NotificationChain msgs = null;
			if (oper_izq != null)
				msgs = ((InternalEObject)oper_izq).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DiagramapseudocodigoPackage.OPERANDO_IZQ__OPER_IZQ, null, msgs);
			if (newOper_izq != null)
				msgs = ((InternalEObject)newOper_izq).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DiagramapseudocodigoPackage.OPERANDO_IZQ__OPER_IZQ, null, msgs);
			msgs = basicSetOper_izq(newOper_izq, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DiagramapseudocodigoPackage.OPERANDO_IZQ__OPER_IZQ, newOper_izq, newOper_izq));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DiagramapseudocodigoPackage.OPERANDO_IZQ__OPER_IZQ:
				return basicSetOper_izq(null, msgs);
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
			case DiagramapseudocodigoPackage.OPERANDO_IZQ__OPER_IZQ:
				return getOper_izq();
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
			case DiagramapseudocodigoPackage.OPERANDO_IZQ__OPER_IZQ:
				setOper_izq((valor)newValue);
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
			case DiagramapseudocodigoPackage.OPERANDO_IZQ__OPER_IZQ:
				setOper_izq((valor)null);
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
			case DiagramapseudocodigoPackage.OPERANDO_IZQ__OPER_IZQ:
				return oper_izq != null;
		}
		return super.eIsSet(featureID);
	}

} //operando_izqImpl
