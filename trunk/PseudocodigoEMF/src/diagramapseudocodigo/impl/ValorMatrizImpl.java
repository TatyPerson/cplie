/**
 */
package diagramapseudocodigo.impl;

import diagramapseudocodigo.DiagramapseudocodigoPackage;
import diagramapseudocodigo.ValorMatriz;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Valor Matriz</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link diagramapseudocodigo.impl.ValorMatrizImpl#getNombre_matriz <em>Nombre matriz</em>}</li>
 *   <li>{@link diagramapseudocodigo.impl.ValorMatrizImpl#getElemento_i <em>Elemento i</em>}</li>
 *   <li>{@link diagramapseudocodigo.impl.ValorMatrizImpl#getElemento_j <em>Elemento j</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ValorMatrizImpl extends ValorComplejoImpl implements ValorMatriz {
	/**
	 * The default value of the '{@link #getNombre_matriz() <em>Nombre matriz</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNombre_matriz()
	 * @generated
	 * @ordered
	 */
	protected static final String NOMBRE_MATRIZ_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNombre_matriz() <em>Nombre matriz</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNombre_matriz()
	 * @generated
	 * @ordered
	 */
	protected String nombre_matriz = NOMBRE_MATRIZ_EDEFAULT;

	/**
	 * The default value of the '{@link #getElemento_i() <em>Elemento i</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElemento_i()
	 * @generated
	 * @ordered
	 */
	protected static final int ELEMENTO_I_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getElemento_i() <em>Elemento i</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElemento_i()
	 * @generated
	 * @ordered
	 */
	protected int elemento_i = ELEMENTO_I_EDEFAULT;

	/**
	 * The default value of the '{@link #getElemento_j() <em>Elemento j</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElemento_j()
	 * @generated
	 * @ordered
	 */
	protected static final int ELEMENTO_J_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getElemento_j() <em>Elemento j</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElemento_j()
	 * @generated
	 * @ordered
	 */
	protected int elemento_j = ELEMENTO_J_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValorMatrizImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DiagramapseudocodigoPackage.Literals.VALOR_MATRIZ;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNombre_matriz() {
		return nombre_matriz;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNombre_matriz(String newNombre_matriz) {
		String oldNombre_matriz = nombre_matriz;
		nombre_matriz = newNombre_matriz;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DiagramapseudocodigoPackage.VALOR_MATRIZ__NOMBRE_MATRIZ, oldNombre_matriz, nombre_matriz));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getElemento_i() {
		return elemento_i;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setElemento_i(int newElemento_i) {
		int oldElemento_i = elemento_i;
		elemento_i = newElemento_i;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DiagramapseudocodigoPackage.VALOR_MATRIZ__ELEMENTO_I, oldElemento_i, elemento_i));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getElemento_j() {
		return elemento_j;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setElemento_j(int newElemento_j) {
		int oldElemento_j = elemento_j;
		elemento_j = newElemento_j;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DiagramapseudocodigoPackage.VALOR_MATRIZ__ELEMENTO_J, oldElemento_j, elemento_j));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DiagramapseudocodigoPackage.VALOR_MATRIZ__NOMBRE_MATRIZ:
				return getNombre_matriz();
			case DiagramapseudocodigoPackage.VALOR_MATRIZ__ELEMENTO_I:
				return getElemento_i();
			case DiagramapseudocodigoPackage.VALOR_MATRIZ__ELEMENTO_J:
				return getElemento_j();
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
			case DiagramapseudocodigoPackage.VALOR_MATRIZ__NOMBRE_MATRIZ:
				setNombre_matriz((String)newValue);
				return;
			case DiagramapseudocodigoPackage.VALOR_MATRIZ__ELEMENTO_I:
				setElemento_i((Integer)newValue);
				return;
			case DiagramapseudocodigoPackage.VALOR_MATRIZ__ELEMENTO_J:
				setElemento_j((Integer)newValue);
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
			case DiagramapseudocodigoPackage.VALOR_MATRIZ__NOMBRE_MATRIZ:
				setNombre_matriz(NOMBRE_MATRIZ_EDEFAULT);
				return;
			case DiagramapseudocodigoPackage.VALOR_MATRIZ__ELEMENTO_I:
				setElemento_i(ELEMENTO_I_EDEFAULT);
				return;
			case DiagramapseudocodigoPackage.VALOR_MATRIZ__ELEMENTO_J:
				setElemento_j(ELEMENTO_J_EDEFAULT);
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
			case DiagramapseudocodigoPackage.VALOR_MATRIZ__NOMBRE_MATRIZ:
				return NOMBRE_MATRIZ_EDEFAULT == null ? nombre_matriz != null : !NOMBRE_MATRIZ_EDEFAULT.equals(nombre_matriz);
			case DiagramapseudocodigoPackage.VALOR_MATRIZ__ELEMENTO_I:
				return elemento_i != ELEMENTO_I_EDEFAULT;
			case DiagramapseudocodigoPackage.VALOR_MATRIZ__ELEMENTO_J:
				return elemento_j != ELEMENTO_J_EDEFAULT;
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
		result.append(" (nombre_matriz: ");
		result.append(nombre_matriz);
		result.append(", elemento_i: ");
		result.append(elemento_i);
		result.append(", elemento_j: ");
		result.append(elemento_j);
		result.append(')');
		return result.toString();
	}

} //ValorMatrizImpl
