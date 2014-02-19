/**
 */
package diagramapseudocodigo.impl;

import diagramapseudocodigo.AsignacionCompleja;
import diagramapseudocodigo.DiagramapseudocodigoPackage;
import diagramapseudocodigo.ValorComplejo;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Asignacion Compleja</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link diagramapseudocodigo.impl.AsignacionComplejaImpl#getComplejo <em>Complejo</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AsignacionComplejaImpl extends AsignacionImpl implements AsignacionCompleja {
	/**
	 * The cached value of the '{@link #getComplejo() <em>Complejo</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComplejo()
	 * @generated
	 * @ordered
	 */
	protected ValorComplejo complejo;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AsignacionComplejaImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DiagramapseudocodigoPackage.Literals.ASIGNACION_COMPLEJA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValorComplejo getComplejo() {
		return complejo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetComplejo(ValorComplejo newComplejo, NotificationChain msgs) {
		ValorComplejo oldComplejo = complejo;
		complejo = newComplejo;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DiagramapseudocodigoPackage.ASIGNACION_COMPLEJA__COMPLEJO, oldComplejo, newComplejo);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setComplejo(ValorComplejo newComplejo) {
		if (newComplejo != complejo) {
			NotificationChain msgs = null;
			if (complejo != null)
				msgs = ((InternalEObject)complejo).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DiagramapseudocodigoPackage.ASIGNACION_COMPLEJA__COMPLEJO, null, msgs);
			if (newComplejo != null)
				msgs = ((InternalEObject)newComplejo).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DiagramapseudocodigoPackage.ASIGNACION_COMPLEJA__COMPLEJO, null, msgs);
			msgs = basicSetComplejo(newComplejo, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DiagramapseudocodigoPackage.ASIGNACION_COMPLEJA__COMPLEJO, newComplejo, newComplejo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DiagramapseudocodigoPackage.ASIGNACION_COMPLEJA__COMPLEJO:
				return basicSetComplejo(null, msgs);
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
			case DiagramapseudocodigoPackage.ASIGNACION_COMPLEJA__COMPLEJO:
				return getComplejo();
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
			case DiagramapseudocodigoPackage.ASIGNACION_COMPLEJA__COMPLEJO:
				setComplejo((ValorComplejo)newValue);
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
			case DiagramapseudocodigoPackage.ASIGNACION_COMPLEJA__COMPLEJO:
				setComplejo((ValorComplejo)null);
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
			case DiagramapseudocodigoPackage.ASIGNACION_COMPLEJA__COMPLEJO:
				return complejo != null;
		}
		return super.eIsSet(featureID);
	}

} //AsignacionComplejaImpl
