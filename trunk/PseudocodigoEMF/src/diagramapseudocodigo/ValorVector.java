/**
 */
package diagramapseudocodigo;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Valor Vector</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link diagramapseudocodigo.ValorVector#getNombre_vector <em>Nombre vector</em>}</li>
 *   <li>{@link diagramapseudocodigo.ValorVector#getCampo <em>Campo</em>}</li>
 *   <li>{@link diagramapseudocodigo.ValorVector#getIndiceCadena <em>Indice Cadena</em>}</li>
 *   <li>{@link diagramapseudocodigo.ValorVector#getIndiceNumerico <em>Indice Numerico</em>}</li>
 * </ul>
 * </p>
 *
 * @see diagramapseudocodigo.DiagramapseudocodigoPackage#getValorVector()
 * @model
 * @generated
 */
public interface ValorVector extends ValorComplejo {
	/**
	 * Returns the value of the '<em><b>Nombre vector</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nombre vector</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nombre vector</em>' attribute.
	 * @see #setNombre_vector(String)
	 * @see diagramapseudocodigo.DiagramapseudocodigoPackage#getValorVector_Nombre_vector()
	 * @model required="true"
	 * @generated
	 */
	String getNombre_vector();

	/**
	 * Sets the value of the '{@link diagramapseudocodigo.ValorVector#getNombre_vector <em>Nombre vector</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nombre vector</em>' attribute.
	 * @see #getNombre_vector()
	 * @generated
	 */
	void setNombre_vector(String value);

	/**
	 * Returns the value of the '<em><b>Campo</b></em>' containment reference list.
	 * The list contents are of type {@link diagramapseudocodigo.CampoRegistro}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Campo</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Campo</em>' containment reference list.
	 * @see diagramapseudocodigo.DiagramapseudocodigoPackage#getValorVector_Campo()
	 * @model containment="true"
	 * @generated
	 */
	EList<CampoRegistro> getCampo();

	/**
	 * Returns the value of the '<em><b>Indice Cadena</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Indice Cadena</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Indice Cadena</em>' attribute.
	 * @see #setIndiceCadena(String)
	 * @see diagramapseudocodigo.DiagramapseudocodigoPackage#getValorVector_IndiceCadena()
	 * @model
	 * @generated
	 */
	String getIndiceCadena();

	/**
	 * Sets the value of the '{@link diagramapseudocodigo.ValorVector#getIndiceCadena <em>Indice Cadena</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Indice Cadena</em>' attribute.
	 * @see #getIndiceCadena()
	 * @generated
	 */
	void setIndiceCadena(String value);

	/**
	 * Returns the value of the '<em><b>Indice Numerico</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Indice Numerico</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Indice Numerico</em>' attribute.
	 * @see #setIndiceNumerico(int)
	 * @see diagramapseudocodigo.DiagramapseudocodigoPackage#getValorVector_IndiceNumerico()
	 * @model
	 * @generated
	 */
	int getIndiceNumerico();

	/**
	 * Sets the value of the '{@link diagramapseudocodigo.ValorVector#getIndiceNumerico <em>Indice Numerico</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Indice Numerico</em>' attribute.
	 * @see #getIndiceNumerico()
	 * @generated
	 */
	void setIndiceNumerico(int value);

} // ValorVector
