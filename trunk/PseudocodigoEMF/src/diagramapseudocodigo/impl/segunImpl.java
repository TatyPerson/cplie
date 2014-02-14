/**
 */
package diagramapseudocodigo.impl;

import diagramapseudocodigo.Devolver;
import diagramapseudocodigo.DiagramapseudocodigoPackage;
import diagramapseudocodigo.Operador;
import diagramapseudocodigo.segun;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>segun</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link diagramapseudocodigo.impl.segunImpl#getOperador <em>Operador</em>}</li>
 *   <li>{@link diagramapseudocodigo.impl.segunImpl#getDevuelve <em>Devuelve</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class segunImpl extends BloqueImpl implements segun {
	/**
	 * The cached value of the '{@link #getOperador() <em>Operador</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperador()
	 * @generated
	 * @ordered
	 */
	protected EList<Operador> operador;

	/**
	 * The cached value of the '{@link #getDevuelve() <em>Devuelve</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDevuelve()
	 * @generated
	 * @ordered
	 */
	protected EList<Devolver> devuelve;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public segunImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DiagramapseudocodigoPackage.Literals.SEGUN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Operador> getOperador() {
		if (operador == null) {
			operador = new EObjectContainmentEList<Operador>(Operador.class, this, DiagramapseudocodigoPackage.SEGUN__OPERADOR);
		}
		return operador;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Devolver> getDevuelve() {
		if (devuelve == null) {
			devuelve = new EObjectContainmentEList<Devolver>(Devolver.class, this, DiagramapseudocodigoPackage.SEGUN__DEVUELVE);
		}
		return devuelve;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DiagramapseudocodigoPackage.SEGUN__OPERADOR:
				return ((InternalEList<?>)getOperador()).basicRemove(otherEnd, msgs);
			case DiagramapseudocodigoPackage.SEGUN__DEVUELVE:
				return ((InternalEList<?>)getDevuelve()).basicRemove(otherEnd, msgs);
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
			case DiagramapseudocodigoPackage.SEGUN__OPERADOR:
				return getOperador();
			case DiagramapseudocodigoPackage.SEGUN__DEVUELVE:
				return getDevuelve();
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
			case DiagramapseudocodigoPackage.SEGUN__OPERADOR:
				getOperador().clear();
				getOperador().addAll((Collection<? extends Operador>)newValue);
				return;
			case DiagramapseudocodigoPackage.SEGUN__DEVUELVE:
				getDevuelve().clear();
				getDevuelve().addAll((Collection<? extends Devolver>)newValue);
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
			case DiagramapseudocodigoPackage.SEGUN__OPERADOR:
				getOperador().clear();
				return;
			case DiagramapseudocodigoPackage.SEGUN__DEVUELVE:
				getDevuelve().clear();
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
			case DiagramapseudocodigoPackage.SEGUN__OPERADOR:
				return operador != null && !operador.isEmpty();
			case DiagramapseudocodigoPackage.SEGUN__DEVUELVE:
				return devuelve != null && !devuelve.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //segunImpl
