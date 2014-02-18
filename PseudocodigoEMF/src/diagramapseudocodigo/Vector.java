/**
 */
package diagramapseudocodigo;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Vector</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link diagramapseudocodigo.Vector#getTipoInterno <em>Tipo Interno</em>}</li>
 *   <li>{@link diagramapseudocodigo.Vector#getNombre <em>Nombre</em>}</li>
 *   <li>{@link diagramapseudocodigo.Vector#getValor <em>Valor</em>}</li>
 * </ul>
 * </p>
 *
 * @see diagramapseudocodigo.DiagramapseudocodigoPackage#getVector()
 * @model
 * @generated
 */
public interface Vector extends TipoComplejo {
	/**
	 * Returns the value of the '<em><b>Tipo Interno</b></em>' attribute.
	 * The literals are from the enumeration {@link diagramapseudocodigo.TipoVariable}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tipo Interno</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tipo Interno</em>' attribute.
	 * @see diagramapseudocodigo.TipoVariable
	 * @see #setTipoInterno(TipoVariable)
	 * @see diagramapseudocodigo.DiagramapseudocodigoPackage#getVector_TipoInterno()
	 * @model required="true"
	 * @generated
	 */
	TipoVariable getTipoInterno();

	/**
	 * Sets the value of the '{@link diagramapseudocodigo.Vector#getTipoInterno <em>Tipo Interno</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tipo Interno</em>' attribute.
	 * @see diagramapseudocodigo.TipoVariable
	 * @see #getTipoInterno()
	 * @generated
	 */
	void setTipoInterno(TipoVariable value);

	/**
	 * Returns the value of the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nombre</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nombre</em>' attribute.
	 * @see #setNombre(String)
	 * @see diagramapseudocodigo.DiagramapseudocodigoPackage#getVector_Nombre()
	 * @model required="true"
	 * @generated
	 */
	String getNombre();

	/**
	 * Sets the value of the '{@link diagramapseudocodigo.Vector#getNombre <em>Nombre</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nombre</em>' attribute.
	 * @see #getNombre()
	 * @generated
	 */
	void setNombre(String value);

	/**
	 * Returns the value of the '<em><b>Valor</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Valor</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Valor</em>' containment reference.
	 * @see #setValor(valor)
	 * @see diagramapseudocodigo.DiagramapseudocodigoPackage#getVector_Valor()
	 * @model containment="true"
	 * @generated
	 */
	valor getValor();

	/**
	 * Sets the value of the '{@link diagramapseudocodigo.Vector#getValor <em>Valor</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Valor</em>' containment reference.
	 * @see #getValor()
	 * @generated
	 */
	void setValor(valor value);

} // Vector
