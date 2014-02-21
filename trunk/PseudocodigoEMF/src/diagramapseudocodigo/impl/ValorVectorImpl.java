/**
 */
package diagramapseudocodigo.impl;

import diagramapseudocodigo.CampoRegistro;
import diagramapseudocodigo.DiagramapseudocodigoPackage;
import diagramapseudocodigo.ValorVector;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Valor Vector</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link diagramapseudocodigo.impl.ValorVectorImpl#getNombre_vector <em>Nombre vector</em>}</li>
 *   <li>{@link diagramapseudocodigo.impl.ValorVectorImpl#getCampo <em>Campo</em>}</li>
 *   <li>{@link diagramapseudocodigo.impl.ValorVectorImpl#getElemento <em>Elemento</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ValorVectorImpl extends ValorComplejoImpl implements ValorVector {
	/**
	 * The default value of the '{@link #getNombre_vector() <em>Nombre vector</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNombre_vector()
	 * @generated
	 * @ordered
	 */
	protected static final String NOMBRE_VECTOR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNombre_vector() <em>Nombre vector</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNombre_vector()
	 * @generated
	 * @ordered
	 */
	protected String nombre_vector = NOMBRE_VECTOR_EDEFAULT;

	/**
	 * The cached value of the '{@link #getCampo() <em>Campo</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCampo()
	 * @generated
	 * @ordered
	 */
	protected EList<CampoRegistro> campo;

	/**
	 * The default value of the '{@link #getElemento() <em>Elemento</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElemento()
	 * @generated
	 * @ordered
	 */
	protected static final int ELEMENTO_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getElemento() <em>Elemento</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElemento()
	 * @generated
	 * @ordered
	 */
	protected int elemento = ELEMENTO_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValorVectorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DiagramapseudocodigoPackage.Literals.VALOR_VECTOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNombre_vector() {
		return nombre_vector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNombre_vector(String newNombre_vector) {
		String oldNombre_vector = nombre_vector;
		nombre_vector = newNombre_vector;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DiagramapseudocodigoPackage.VALOR_VECTOR__NOMBRE_VECTOR, oldNombre_vector, nombre_vector));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CampoRegistro> getCampo() {
		if (campo == null) {
			campo = new EObjectContainmentEList<CampoRegistro>(CampoRegistro.class, this, DiagramapseudocodigoPackage.VALOR_VECTOR__CAMPO);
		}
		return campo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getElemento() {
		return elemento;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setElemento(int newElemento) {
		int oldElemento = elemento;
		elemento = newElemento;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DiagramapseudocodigoPackage.VALOR_VECTOR__ELEMENTO, oldElemento, elemento));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DiagramapseudocodigoPackage.VALOR_VECTOR__CAMPO:
				return ((InternalEList<?>)getCampo()).basicRemove(otherEnd, msgs);
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
			case DiagramapseudocodigoPackage.VALOR_VECTOR__NOMBRE_VECTOR:
				return getNombre_vector();
			case DiagramapseudocodigoPackage.VALOR_VECTOR__CAMPO:
				return getCampo();
			case DiagramapseudocodigoPackage.VALOR_VECTOR__ELEMENTO:
				return getElemento();
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
			case DiagramapseudocodigoPackage.VALOR_VECTOR__NOMBRE_VECTOR:
				setNombre_vector((String)newValue);
				return;
			case DiagramapseudocodigoPackage.VALOR_VECTOR__CAMPO:
				getCampo().clear();
				getCampo().addAll((Collection<? extends CampoRegistro>)newValue);
				return;
			case DiagramapseudocodigoPackage.VALOR_VECTOR__ELEMENTO:
				setElemento((Integer)newValue);
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
			case DiagramapseudocodigoPackage.VALOR_VECTOR__NOMBRE_VECTOR:
				setNombre_vector(NOMBRE_VECTOR_EDEFAULT);
				return;
			case DiagramapseudocodigoPackage.VALOR_VECTOR__CAMPO:
				getCampo().clear();
				return;
			case DiagramapseudocodigoPackage.VALOR_VECTOR__ELEMENTO:
				setElemento(ELEMENTO_EDEFAULT);
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
			case DiagramapseudocodigoPackage.VALOR_VECTOR__NOMBRE_VECTOR:
				return NOMBRE_VECTOR_EDEFAULT == null ? nombre_vector != null : !NOMBRE_VECTOR_EDEFAULT.equals(nombre_vector);
			case DiagramapseudocodigoPackage.VALOR_VECTOR__CAMPO:
				return campo != null && !campo.isEmpty();
			case DiagramapseudocodigoPackage.VALOR_VECTOR__ELEMENTO:
				return elemento != ELEMENTO_EDEFAULT;
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
		result.append(" (nombre_vector: ");
		result.append(nombre_vector);
		result.append(", elemento: ");
		result.append(elemento);
		result.append(')');
		return result.toString();
	}

} //ValorVectorImpl
