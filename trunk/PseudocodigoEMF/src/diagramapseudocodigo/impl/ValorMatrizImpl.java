/**
 */
package diagramapseudocodigo.impl;

import diagramapseudocodigo.CampoRegistro;
import diagramapseudocodigo.DiagramapseudocodigoPackage;
import diagramapseudocodigo.ValorMatriz;
import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Valor Matriz</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link diagramapseudocodigo.impl.ValorMatrizImpl#getNombre_matriz <em>Nombre matriz</em>}</li>
 *   <li>{@link diagramapseudocodigo.impl.ValorMatrizImpl#getCampo <em>Campo</em>}</li>
 *   <li>{@link diagramapseudocodigo.impl.ValorMatrizImpl#getIndicesCadena <em>Indices Cadena</em>}</li>
 *   <li>{@link diagramapseudocodigo.impl.ValorMatrizImpl#getIndicesNumericos <em>Indices Numericos</em>}</li>
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
	 * The cached value of the '{@link #getCampo() <em>Campo</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCampo()
	 * @generated
	 * @ordered
	 */
	protected EList<CampoRegistro> campo;

	/**
	 * The cached value of the '{@link #getIndicesCadena() <em>Indices Cadena</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIndicesCadena()
	 * @generated
	 * @ordered
	 */
	protected EList<String> indicesCadena;

	/**
	 * The cached value of the '{@link #getIndicesNumericos() <em>Indices Numericos</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIndicesNumericos()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> indicesNumericos;

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
	public EList<CampoRegistro> getCampo() {
		if (campo == null) {
			campo = new EObjectContainmentEList<CampoRegistro>(CampoRegistro.class, this, DiagramapseudocodigoPackage.VALOR_MATRIZ__CAMPO);
		}
		return campo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getIndicesCadena() {
		if (indicesCadena == null) {
			indicesCadena = new EDataTypeUniqueEList<String>(String.class, this, DiagramapseudocodigoPackage.VALOR_MATRIZ__INDICES_CADENA);
		}
		return indicesCadena;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Integer> getIndicesNumericos() {
		if (indicesNumericos == null) {
			indicesNumericos = new EDataTypeUniqueEList<Integer>(Integer.class, this, DiagramapseudocodigoPackage.VALOR_MATRIZ__INDICES_NUMERICOS);
		}
		return indicesNumericos;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DiagramapseudocodigoPackage.VALOR_MATRIZ__CAMPO:
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
			case DiagramapseudocodigoPackage.VALOR_MATRIZ__NOMBRE_MATRIZ:
				return getNombre_matriz();
			case DiagramapseudocodigoPackage.VALOR_MATRIZ__CAMPO:
				return getCampo();
			case DiagramapseudocodigoPackage.VALOR_MATRIZ__INDICES_CADENA:
				return getIndicesCadena();
			case DiagramapseudocodigoPackage.VALOR_MATRIZ__INDICES_NUMERICOS:
				return getIndicesNumericos();
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
			case DiagramapseudocodigoPackage.VALOR_MATRIZ__NOMBRE_MATRIZ:
				setNombre_matriz((String)newValue);
				return;
			case DiagramapseudocodigoPackage.VALOR_MATRIZ__CAMPO:
				getCampo().clear();
				getCampo().addAll((Collection<? extends CampoRegistro>)newValue);
				return;
			case DiagramapseudocodigoPackage.VALOR_MATRIZ__INDICES_CADENA:
				getIndicesCadena().clear();
				getIndicesCadena().addAll((Collection<? extends String>)newValue);
				return;
			case DiagramapseudocodigoPackage.VALOR_MATRIZ__INDICES_NUMERICOS:
				getIndicesNumericos().clear();
				getIndicesNumericos().addAll((Collection<? extends Integer>)newValue);
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
			case DiagramapseudocodigoPackage.VALOR_MATRIZ__CAMPO:
				getCampo().clear();
				return;
			case DiagramapseudocodigoPackage.VALOR_MATRIZ__INDICES_CADENA:
				getIndicesCadena().clear();
				return;
			case DiagramapseudocodigoPackage.VALOR_MATRIZ__INDICES_NUMERICOS:
				getIndicesNumericos().clear();
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
			case DiagramapseudocodigoPackage.VALOR_MATRIZ__CAMPO:
				return campo != null && !campo.isEmpty();
			case DiagramapseudocodigoPackage.VALOR_MATRIZ__INDICES_CADENA:
				return indicesCadena != null && !indicesCadena.isEmpty();
			case DiagramapseudocodigoPackage.VALOR_MATRIZ__INDICES_NUMERICOS:
				return indicesNumericos != null && !indicesNumericos.isEmpty();
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
		result.append(", indicesCadena: ");
		result.append(indicesCadena);
		result.append(", indicesNumericos: ");
		result.append(indicesNumericos);
		result.append(')');
		return result.toString();
	}

} //ValorMatrizImpl
