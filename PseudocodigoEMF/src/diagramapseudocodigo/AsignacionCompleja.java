/**
 */
package diagramapseudocodigo;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Asignacion Compleja</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link diagramapseudocodigo.AsignacionCompleja#getComplejo <em>Complejo</em>}</li>
 * </ul>
 * </p>
 *
 * @see diagramapseudocodigo.DiagramapseudocodigoPackage#getAsignacionCompleja()
 * @model
 * @generated
 */
public interface AsignacionCompleja extends Asignacion {
	/**
	 * Returns the value of the '<em><b>Complejo</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Complejo</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Complejo</em>' containment reference.
	 * @see #setComplejo(ValorComplejo)
	 * @see diagramapseudocodigo.DiagramapseudocodigoPackage#getAsignacionCompleja_Complejo()
	 * @model containment="true" required="true"
	 * @generated
	 */
	ValorComplejo getComplejo();

	/**
	 * Sets the value of the '{@link diagramapseudocodigo.AsignacionCompleja#getComplejo <em>Complejo</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Complejo</em>' containment reference.
	 * @see #getComplejo()
	 * @generated
	 */
	void setComplejo(ValorComplejo value);

} // AsignacionCompleja
