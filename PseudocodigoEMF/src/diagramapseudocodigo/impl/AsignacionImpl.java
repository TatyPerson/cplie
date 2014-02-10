/**
 */
package diagramapseudocodigo.impl;

import diagramapseudocodigo.Asignacion;
import diagramapseudocodigo.DiagramapseudocodigoPackage;
import diagramapseudocodigo.valor;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Asignacion</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link diagramapseudocodigo.impl.AsignacionImpl#getLvalue <em>Lvalue</em>}</li>
 *   <li>{@link diagramapseudocodigo.impl.AsignacionImpl#getOperador <em>Operador</em>}</li>
 *   <li>{@link diagramapseudocodigo.impl.AsignacionImpl#getMat <em>Mat</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AsignacionImpl extends SentenciasImpl implements Asignacion {
	/**
	 * The default value of the '{@link #getLvalue() <em>Lvalue</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLvalue()
	 * @generated
	 * @ordered
	 */
	public static final String LVALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLvalue() <em>Lvalue</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLvalue()
	 * @generated
	 * @ordered
	 */
	public String lvalue = LVALUE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getOperador() <em>Operador</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperador()
	 * @generated
	 * @ordered
	 */
	public valor operador;

	/**
	 * The cached value of the '{@link #getMat() <em>Mat</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMat()
	 * @generated
	 * @ordered
	 */
	public EList<String> mat;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AsignacionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass eStaticClass() {
		return DiagramapseudocodigoPackage.Literals.ASIGNACION;
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
			eNotify(new ENotificationImpl(this, Notification.SET, DiagramapseudocodigoPackage.ASIGNACION__LVALUE, oldLvalue, lvalue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public valor getOperador() {
		return operador;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOperador(valor newOperador, NotificationChain msgs) {
		valor oldOperador = operador;
		operador = newOperador;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DiagramapseudocodigoPackage.ASIGNACION__OPERADOR, oldOperador, newOperador);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOperador(valor newOperador) {
		if (newOperador != operador) {
			NotificationChain msgs = null;
			if (operador != null)
				msgs = ((InternalEObject)operador).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DiagramapseudocodigoPackage.ASIGNACION__OPERADOR, null, msgs);
			if (newOperador != null)
				msgs = ((InternalEObject)newOperador).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DiagramapseudocodigoPackage.ASIGNACION__OPERADOR, null, msgs);
			msgs = basicSetOperador(newOperador, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DiagramapseudocodigoPackage.ASIGNACION__OPERADOR, newOperador, newOperador));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getMat() {
		if (mat == null) {
			mat = new EDataTypeUniqueEList<String>(String.class, this, DiagramapseudocodigoPackage.ASIGNACION__MAT);
		}
		return mat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DiagramapseudocodigoPackage.ASIGNACION__OPERADOR:
				return basicSetOperador(null, msgs);
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
			case DiagramapseudocodigoPackage.ASIGNACION__LVALUE:
				return getLvalue();
			case DiagramapseudocodigoPackage.ASIGNACION__OPERADOR:
				return getOperador();
			case DiagramapseudocodigoPackage.ASIGNACION__MAT:
				return getMat();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case DiagramapseudocodigoPackage.ASIGNACION__LVALUE:
				setLvalue((String)newValue);
				return;
			case DiagramapseudocodigoPackage.ASIGNACION__OPERADOR:
				setOperador((valor)newValue);
				return;
			case DiagramapseudocodigoPackage.ASIGNACION__MAT:
				getMat().clear();
				getMat().addAll((Collection<? extends String>)newValue);
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
			case DiagramapseudocodigoPackage.ASIGNACION__LVALUE:
				setLvalue(LVALUE_EDEFAULT);
				return;
			case DiagramapseudocodigoPackage.ASIGNACION__OPERADOR:
				setOperador((valor)null);
				return;
			case DiagramapseudocodigoPackage.ASIGNACION__MAT:
				getMat().clear();
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
			case DiagramapseudocodigoPackage.ASIGNACION__LVALUE:
				return LVALUE_EDEFAULT == null ? lvalue != null : !LVALUE_EDEFAULT.equals(lvalue);
			case DiagramapseudocodigoPackage.ASIGNACION__OPERADOR:
				return operador != null;
			case DiagramapseudocodigoPackage.ASIGNACION__MAT:
				return mat != null && !mat.isEmpty();
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
		result.append(", Mat: ");
		result.append(mat);
		result.append(')');
		return result.toString();
	}

} //AsignacionImpl