/**
 */
package diagramapseudocodigo;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>negacion</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link diagramapseudocodigo.negacion#getNombre <em>Nombre</em>}</li>
 *   <li>{@link diagramapseudocodigo.negacion#getSsigno <em>Ssigno</em>}</li>
 * </ul>
 * </p>
 *
 * @see diagramapseudocodigo.DiagramapseudocodigoPackage#getnegacion()
 * @model
 * @generated
 */
public interface negacion extends Sentencias {
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
	 * @see diagramapseudocodigo.DiagramapseudocodigoPackage#getnegacion_Nombre()
	 * @model required="true"
	 * @generated
	 */
	String getNombre();

	/**
	 * Sets the value of the '{@link diagramapseudocodigo.negacion#getNombre <em>Nombre</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nombre</em>' attribute.
	 * @see #getNombre()
	 * @generated
	 */
	void setNombre(String value);

	/**
	 * Returns the value of the '<em><b>Ssigno</b></em>' attribute.
	 * The literals are from the enumeration {@link diagramapseudocodigo.neg}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ssigno</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ssigno</em>' attribute.
	 * @see diagramapseudocodigo.neg
	 * @see #setSsigno(neg)
	 * @see diagramapseudocodigo.DiagramapseudocodigoPackage#getnegacion_Ssigno()
	 * @model required="true"
	 * @generated
	 */
	neg getSsigno();

	/**
	 * Sets the value of the '{@link diagramapseudocodigo.negacion#getSsigno <em>Ssigno</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ssigno</em>' attribute.
	 * @see diagramapseudocodigo.neg
	 * @see #getSsigno()
	 * @generated
	 */
	void setSsigno(neg value);

} // negacion
