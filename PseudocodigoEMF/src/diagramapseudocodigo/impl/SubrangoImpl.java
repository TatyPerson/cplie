/**
 */
package diagramapseudocodigo.impl;

import diagramapseudocodigo.DiagramapseudocodigoPackage;
import diagramapseudocodigo.Subrango;

import diagramapseudocodigo.operacion;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
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
	 * The cached value of the '{@link #getLimite_inf() <em>Limite inf</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLimite_inf()
	 * @generated
	 * @ordered
	 */
	protected operacion limite_inf;

	/**
	 * The cached value of the '{@link #getLimite_sup() <em>Limite sup</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLimite_sup()
	 * @generated
	 * @ordered
	 */
	protected operacion limite_sup;

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
	public operacion getLimite_inf() {
		return limite_inf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLimite_inf(operacion newLimite_inf, NotificationChain msgs) {
		operacion oldLimite_inf = limite_inf;
		limite_inf = newLimite_inf;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DiagramapseudocodigoPackage.SUBRANGO__LIMITE_INF, oldLimite_inf, newLimite_inf);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLimite_inf(operacion newLimite_inf) {
		if (newLimite_inf != limite_inf) {
			NotificationChain msgs = null;
			if (limite_inf != null)
				msgs = ((InternalEObject)limite_inf).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DiagramapseudocodigoPackage.SUBRANGO__LIMITE_INF, null, msgs);
			if (newLimite_inf != null)
				msgs = ((InternalEObject)newLimite_inf).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DiagramapseudocodigoPackage.SUBRANGO__LIMITE_INF, null, msgs);
			msgs = basicSetLimite_inf(newLimite_inf, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DiagramapseudocodigoPackage.SUBRANGO__LIMITE_INF, newLimite_inf, newLimite_inf));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public operacion getLimite_sup() {
		return limite_sup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLimite_sup(operacion newLimite_sup, NotificationChain msgs) {
		operacion oldLimite_sup = limite_sup;
		limite_sup = newLimite_sup;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DiagramapseudocodigoPackage.SUBRANGO__LIMITE_SUP, oldLimite_sup, newLimite_sup);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLimite_sup(operacion newLimite_sup) {
		if (newLimite_sup != limite_sup) {
			NotificationChain msgs = null;
			if (limite_sup != null)
				msgs = ((InternalEObject)limite_sup).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DiagramapseudocodigoPackage.SUBRANGO__LIMITE_SUP, null, msgs);
			if (newLimite_sup != null)
				msgs = ((InternalEObject)newLimite_sup).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DiagramapseudocodigoPackage.SUBRANGO__LIMITE_SUP, null, msgs);
			msgs = basicSetLimite_sup(newLimite_sup, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DiagramapseudocodigoPackage.SUBRANGO__LIMITE_SUP, newLimite_sup, newLimite_sup));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DiagramapseudocodigoPackage.SUBRANGO__LIMITE_INF:
				return basicSetLimite_inf(null, msgs);
			case DiagramapseudocodigoPackage.SUBRANGO__LIMITE_SUP:
				return basicSetLimite_sup(null, msgs);
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
				setLimite_inf((operacion)newValue);
				return;
			case DiagramapseudocodigoPackage.SUBRANGO__LIMITE_SUP:
				setLimite_sup((operacion)newValue);
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
				setLimite_inf((operacion)null);
				return;
			case DiagramapseudocodigoPackage.SUBRANGO__LIMITE_SUP:
				setLimite_sup((operacion)null);
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
				return limite_inf != null;
			case DiagramapseudocodigoPackage.SUBRANGO__LIMITE_SUP:
				return limite_sup != null;
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
		result.append(')');
		return result.toString();
	}

} //SubrangoImpl
