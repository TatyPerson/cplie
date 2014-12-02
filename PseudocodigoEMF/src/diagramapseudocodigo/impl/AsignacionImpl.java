/**
 */
package diagramapseudocodigo.impl;

import diagramapseudocodigo.Asignacion;
import diagramapseudocodigo.DiagramapseudocodigoPackage;
import diagramapseudocodigo.operacion;
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
 *   <li>{@link diagramapseudocodigo.impl.AsignacionImpl#getMat <em>Mat</em>}</li>
 *   <li>{@link diagramapseudocodigo.impl.AsignacionImpl#getOperadores <em>Operadores</em>}</li>
 *   <li>{@link diagramapseudocodigo.impl.AsignacionImpl#getValor_asignacion <em>Valor asignacion</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AsignacionImpl extends SentenciasImpl implements Asignacion {
	/**
	 * The cached value of the '{@link #getMat() <em>Mat</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMat()
	 * @generated
	 * @ordered
	 */
	protected EList<String> mat;

	/**
	 * The cached value of the '{@link #getOperadores() <em>Operadores</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperadores()
	 * @generated
	 * @ordered
	 */
	protected operacion operadores;

	/**
	 * The default value of the '{@link #getValor_asignacion() <em>Valor asignacion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValor_asignacion()
	 * @generated
	 * @ordered
	 */
	protected static final String VALOR_ASIGNACION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getValor_asignacion() <em>Valor asignacion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValor_asignacion()
	 * @generated
	 * @ordered
	 */
	protected String valor_asignacion = VALOR_ASIGNACION_EDEFAULT;

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
	protected EClass eStaticClass() {
		return DiagramapseudocodigoPackage.Literals.ASIGNACION;
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
	public operacion getOperadores() {
		return operadores;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOperadores(operacion newOperadores, NotificationChain msgs) {
		operacion oldOperadores = operadores;
		operadores = newOperadores;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DiagramapseudocodigoPackage.ASIGNACION__OPERADORES, oldOperadores, newOperadores);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOperadores(operacion newOperadores) {
		if (newOperadores != operadores) {
			NotificationChain msgs = null;
			if (operadores != null)
				msgs = ((InternalEObject)operadores).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DiagramapseudocodigoPackage.ASIGNACION__OPERADORES, null, msgs);
			if (newOperadores != null)
				msgs = ((InternalEObject)newOperadores).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DiagramapseudocodigoPackage.ASIGNACION__OPERADORES, null, msgs);
			msgs = basicSetOperadores(newOperadores, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DiagramapseudocodigoPackage.ASIGNACION__OPERADORES, newOperadores, newOperadores));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getValor_asignacion() {
		return valor_asignacion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValor_asignacion(String newValor_asignacion) {
		String oldValor_asignacion = valor_asignacion;
		valor_asignacion = newValor_asignacion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DiagramapseudocodigoPackage.ASIGNACION__VALOR_ASIGNACION, oldValor_asignacion, valor_asignacion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DiagramapseudocodigoPackage.ASIGNACION__OPERADORES:
				return basicSetOperadores(null, msgs);
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
			case DiagramapseudocodigoPackage.ASIGNACION__MAT:
				return getMat();
			case DiagramapseudocodigoPackage.ASIGNACION__OPERADORES:
				return getOperadores();
			case DiagramapseudocodigoPackage.ASIGNACION__VALOR_ASIGNACION:
				return getValor_asignacion();
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
			case DiagramapseudocodigoPackage.ASIGNACION__MAT:
				getMat().clear();
				getMat().addAll((Collection<? extends String>)newValue);
				return;
			case DiagramapseudocodigoPackage.ASIGNACION__OPERADORES:
				setOperadores((operacion)newValue);
				return;
			case DiagramapseudocodigoPackage.ASIGNACION__VALOR_ASIGNACION:
				setValor_asignacion((String)newValue);
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
			case DiagramapseudocodigoPackage.ASIGNACION__MAT:
				getMat().clear();
				return;
			case DiagramapseudocodigoPackage.ASIGNACION__OPERADORES:
				setOperadores((operacion)null);
				return;
			case DiagramapseudocodigoPackage.ASIGNACION__VALOR_ASIGNACION:
				setValor_asignacion(VALOR_ASIGNACION_EDEFAULT);
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
			case DiagramapseudocodigoPackage.ASIGNACION__MAT:
				return mat != null && !mat.isEmpty();
			case DiagramapseudocodigoPackage.ASIGNACION__OPERADORES:
				return operadores != null;
			case DiagramapseudocodigoPackage.ASIGNACION__VALOR_ASIGNACION:
				return VALOR_ASIGNACION_EDEFAULT == null ? valor_asignacion != null : !VALOR_ASIGNACION_EDEFAULT.equals(valor_asignacion);
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
		result.append(" (Mat: ");
		result.append(mat);
		result.append(", valor_asignacion: ");
		result.append(valor_asignacion);
		result.append(')');
		return result.toString();
	}

} //AsignacionImpl
