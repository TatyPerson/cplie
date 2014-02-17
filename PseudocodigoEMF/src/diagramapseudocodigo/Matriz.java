/**
 */
package diagramapseudocodigo;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Matriz</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link diagramapseudocodigo.Matriz#getConstante <em>Constante</em>}</li>
 *   <li>{@link diagramapseudocodigo.Matriz#getTipoInterno <em>Tipo Interno</em>}</li>
 *   <li>{@link diagramapseudocodigo.Matriz#getNombre <em>Nombre</em>}</li>
 *   <li>{@link diagramapseudocodigo.Matriz#getConstante2 <em>Constante2</em>}</li>
 * </ul>
 * </p>
 *
 * @see diagramapseudocodigo.DiagramapseudocodigoPackage#getMatriz()
 * @model
 * @generated
 */
public interface Matriz extends TipoComplejo {
	/**
	 * Returns the value of the '<em><b>Constante</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Constante</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Constante</em>' attribute.
	 * @see #setConstante(String)
	 * @see diagramapseudocodigo.DiagramapseudocodigoPackage#getMatriz_Constante()
	 * @model required="true"
	 * @generated
	 */
	String getConstante();

	/**
	 * Sets the value of the '{@link diagramapseudocodigo.Matriz#getConstante <em>Constante</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Constante</em>' attribute.
	 * @see #getConstante()
	 * @generated
	 */
	void setConstante(String value);

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
	 * @see diagramapseudocodigo.DiagramapseudocodigoPackage#getMatriz_TipoInterno()
	 * @model required="true"
	 * @generated
	 */
	TipoVariable getTipoInterno();

	/**
	 * Sets the value of the '{@link diagramapseudocodigo.Matriz#getTipoInterno <em>Tipo Interno</em>}' attribute.
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
	 * @see diagramapseudocodigo.DiagramapseudocodigoPackage#getMatriz_Nombre()
	 * @model required="true"
	 * @generated
	 */
	String getNombre();

	/**
	 * Sets the value of the '{@link diagramapseudocodigo.Matriz#getNombre <em>Nombre</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nombre</em>' attribute.
	 * @see #getNombre()
	 * @generated
	 */
	void setNombre(String value);

	/**
	 * Returns the value of the '<em><b>Constante2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Constante2</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Constante2</em>' attribute.
	 * @see #setConstante2(String)
	 * @see diagramapseudocodigo.DiagramapseudocodigoPackage#getMatriz_Constante2()
	 * @model required="true"
	 * @generated
	 */
	String getConstante2();

	/**
	 * Sets the value of the '{@link diagramapseudocodigo.Matriz#getConstante2 <em>Constante2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Constante2</em>' attribute.
	 * @see #getConstante2()
	 * @generated
	 */
	void setConstante2(String value);

} // Matriz
