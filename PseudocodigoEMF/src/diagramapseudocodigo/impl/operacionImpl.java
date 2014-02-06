/**
 */
package diagramapseudocodigo.impl;

import diagramapseudocodigo.DiagramapseudocodigoPackage;
import diagramapseudocodigo.operacion;
import diagramapseudocodigo.operando_der;
import diagramapseudocodigo.operando_izq;
import diagramapseudocodigo.signo;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>operacion</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link diagramapseudocodigo.impl.operacionImpl#getSigno_op <em>Signo op</em>}</li>
 *   <li>{@link diagramapseudocodigo.impl.operacionImpl#getOp_izq <em>Op izq</em>}</li>
 *   <li>{@link diagramapseudocodigo.impl.operacionImpl#getOp_der <em>Op der</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class operacionImpl extends valorImpl implements operacion {
	/**
	 * The default value of the '{@link #getSigno_op() <em>Signo op</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSigno_op()
	 * @generated
	 * @ordered
	 */
	public static final signo SIGNO_OP_EDEFAULT = signo.SUM;

	/**
	 * The cached value of the '{@link #getSigno_op() <em>Signo op</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSigno_op()
	 * @generated
	 * @ordered
	 */
	public signo signo_op = SIGNO_OP_EDEFAULT;

	/**
	 * The cached value of the '{@link #getOp_izq() <em>Op izq</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOp_izq()
	 * @generated
	 * @ordered
	 */
	public operando_izq op_izq;

	/**
	 * The cached value of the '{@link #getOp_der() <em>Op der</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOp_der()
	 * @generated
	 * @ordered
	 */
	public operando_der op_der;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public operacionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass eStaticClass() {
		return DiagramapseudocodigoPackage.Literals.OPERACION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public signo getSigno_op() {
		return signo_op;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSigno_op(signo newSigno_op) {
		signo oldSigno_op = signo_op;
		signo_op = newSigno_op == null ? SIGNO_OP_EDEFAULT : newSigno_op;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DiagramapseudocodigoPackage.OPERACION__SIGNO_OP, oldSigno_op, signo_op));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public operando_izq getOp_izq() {
		return op_izq;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOp_izq(operando_izq newOp_izq, NotificationChain msgs) {
		operando_izq oldOp_izq = op_izq;
		op_izq = newOp_izq;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DiagramapseudocodigoPackage.OPERACION__OP_IZQ, oldOp_izq, newOp_izq);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOp_izq(operando_izq newOp_izq) {
		if (newOp_izq != op_izq) {
			NotificationChain msgs = null;
			if (op_izq != null)
				msgs = ((InternalEObject)op_izq).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DiagramapseudocodigoPackage.OPERACION__OP_IZQ, null, msgs);
			if (newOp_izq != null)
				msgs = ((InternalEObject)newOp_izq).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DiagramapseudocodigoPackage.OPERACION__OP_IZQ, null, msgs);
			msgs = basicSetOp_izq(newOp_izq, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DiagramapseudocodigoPackage.OPERACION__OP_IZQ, newOp_izq, newOp_izq));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public operando_der getOp_der() {
		return op_der;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOp_der(operando_der newOp_der, NotificationChain msgs) {
		operando_der oldOp_der = op_der;
		op_der = newOp_der;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DiagramapseudocodigoPackage.OPERACION__OP_DER, oldOp_der, newOp_der);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOp_der(operando_der newOp_der) {
		if (newOp_der != op_der) {
			NotificationChain msgs = null;
			if (op_der != null)
				msgs = ((InternalEObject)op_der).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DiagramapseudocodigoPackage.OPERACION__OP_DER, null, msgs);
			if (newOp_der != null)
				msgs = ((InternalEObject)newOp_der).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DiagramapseudocodigoPackage.OPERACION__OP_DER, null, msgs);
			msgs = basicSetOp_der(newOp_der, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DiagramapseudocodigoPackage.OPERACION__OP_DER, newOp_der, newOp_der));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DiagramapseudocodigoPackage.OPERACION__OP_IZQ:
				return basicSetOp_izq(null, msgs);
			case DiagramapseudocodigoPackage.OPERACION__OP_DER:
				return basicSetOp_der(null, msgs);
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
			case DiagramapseudocodigoPackage.OPERACION__SIGNO_OP:
				return getSigno_op();
			case DiagramapseudocodigoPackage.OPERACION__OP_IZQ:
				return getOp_izq();
			case DiagramapseudocodigoPackage.OPERACION__OP_DER:
				return getOp_der();
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
			case DiagramapseudocodigoPackage.OPERACION__SIGNO_OP:
				setSigno_op((signo)newValue);
				return;
			case DiagramapseudocodigoPackage.OPERACION__OP_IZQ:
				setOp_izq((operando_izq)newValue);
				return;
			case DiagramapseudocodigoPackage.OPERACION__OP_DER:
				setOp_der((operando_der)newValue);
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
			case DiagramapseudocodigoPackage.OPERACION__SIGNO_OP:
				setSigno_op(SIGNO_OP_EDEFAULT);
				return;
			case DiagramapseudocodigoPackage.OPERACION__OP_IZQ:
				setOp_izq((operando_izq)null);
				return;
			case DiagramapseudocodigoPackage.OPERACION__OP_DER:
				setOp_der((operando_der)null);
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
			case DiagramapseudocodigoPackage.OPERACION__SIGNO_OP:
				return signo_op != SIGNO_OP_EDEFAULT;
			case DiagramapseudocodigoPackage.OPERACION__OP_IZQ:
				return op_izq != null;
			case DiagramapseudocodigoPackage.OPERACION__OP_DER:
				return op_der != null;
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
		result.append(" (signo_op: ");
		result.append(signo_op);
		result.append(')');
		return result.toString();
	}

} //operacionImpl
