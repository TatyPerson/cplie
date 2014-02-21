/**
 */
package diagramapseudocodigo;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Valor Matriz</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link diagramapseudocodigo.ValorMatriz#getNombre_matriz <em>Nombre matriz</em>}</li>
 *   <li>{@link diagramapseudocodigo.ValorMatriz#getElemento_i <em>Elemento i</em>}</li>
 *   <li>{@link diagramapseudocodigo.ValorMatriz#getElemento_j <em>Elemento j</em>}</li>
 * </ul>
 * </p>
 *
 * @see diagramapseudocodigo.DiagramapseudocodigoPackage#getValorMatriz()
 * @model
 * @generated
 */
public interface ValorMatriz extends ValorComplejo {
	/**
	 * Returns the value of the '<em><b>Nombre matriz</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nombre matriz</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nombre matriz</em>' attribute.
	 * @see #setNombre_matriz(String)
	 * @see diagramapseudocodigo.DiagramapseudocodigoPackage#getValorMatriz_Nombre_matriz()
	 * @model required="true"
	 * @generated
	 */
	String getNombre_matriz();

	/**
	 * Sets the value of the '{@link diagramapseudocodigo.ValorMatriz#getNombre_matriz <em>Nombre matriz</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nombre matriz</em>' attribute.
	 * @see #getNombre_matriz()
	 * @generated
	 */
	void setNombre_matriz(String value);

	/**
	 * Returns the value of the '<em><b>Elemento i</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Elemento i</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Elemento i</em>' attribute.
	 * @see #setElemento_i(int)
	 * @see diagramapseudocodigo.DiagramapseudocodigoPackage#getValorMatriz_Elemento_i()
	 * @model required="true"
	 * @generated
	 */
	int getElemento_i();

	/**
	 * Sets the value of the '{@link diagramapseudocodigo.ValorMatriz#getElemento_i <em>Elemento i</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Elemento i</em>' attribute.
	 * @see #getElemento_i()
	 * @generated
	 */
	void setElemento_i(int value);

	/**
	 * Returns the value of the '<em><b>Elemento j</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Elemento j</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Elemento j</em>' attribute.
	 * @see #setElemento_j(int)
	 * @see diagramapseudocodigo.DiagramapseudocodigoPackage#getValorMatriz_Elemento_j()
	 * @model required="true"
	 * @generated
	 */
	int getElemento_j();

	/**
	 * Sets the value of the '{@link diagramapseudocodigo.ValorMatriz#getElemento_j <em>Elemento j</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Elemento j</em>' attribute.
	 * @see #getElemento_j()
	 * @generated
	 */
	void setElemento_j(int value);

} // ValorMatriz
