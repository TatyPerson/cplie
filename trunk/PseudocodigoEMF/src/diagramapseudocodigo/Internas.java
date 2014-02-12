/**
 */
package diagramapseudocodigo;




/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Internas</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link diagramapseudocodigo.Internas#getNombre <em>Nombre</em>}</li>
 *   <li>{@link diagramapseudocodigo.Internas#getOperador <em>Operador</em>}</li>
 * </ul>
 * </p>
 *
 * @see diagramapseudocodigo.DiagramapseudocodigoPackage#getInternas()
 * @model
 * @generated
 */
public interface Internas extends valor {
	/**
	 * Returns the value of the '<em><b>Nombre</b></em>' attribute.
	 * The literals are from the enumeration {@link diagramapseudocodigo.NombreInterna}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nombre</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nombre</em>' attribute.
	 * @see diagramapseudocodigo.NombreInterna
	 * @see #setNombre(NombreInterna)
	 * @see diagramapseudocodigo.DiagramapseudocodigoPackage#getInternas_Nombre()
	 * @model
	 * @generated
	 */
	NombreInterna getNombre();

	/**
	 * Sets the value of the '{@link diagramapseudocodigo.Internas#getNombre <em>Nombre</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nombre</em>' attribute.
	 * @see diagramapseudocodigo.NombreInterna
	 * @see #getNombre()
	 * @generated
	 */
	void setNombre(NombreInterna value);

	/**
	 * Returns the value of the '<em><b>Operador</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operador</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operador</em>' containment reference.
	 * @see #setOperador(Operador)
	 * @see diagramapseudocodigo.DiagramapseudocodigoPackage#getInternas_Operador()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Operador getOperador();

	/**
	 * Sets the value of the '{@link diagramapseudocodigo.Internas#getOperador <em>Operador</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operador</em>' containment reference.
	 * @see #getOperador()
	 * @generated
	 */
	void setOperador(Operador value);

} // Internas
