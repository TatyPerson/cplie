/**
 */
package diagramapseudocodigo;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Asignacion</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link diagramapseudocodigo.Asignacion#getLvalue <em>Lvalue</em>}</li>
 *   <li>{@link diagramapseudocodigo.Asignacion#getOperador <em>Operador</em>}</li>
 *   <li>{@link diagramapseudocodigo.Asignacion#getMat <em>Mat</em>}</li>
 * </ul>
 * </p>
 *
 * @see diagramapseudocodigo.DiagramapseudocodigoPackage#getAsignacion()
 * @model
 * @generated
 */
public interface Asignacion extends Sentencias {
	/**
	 * Returns the value of the '<em><b>Lvalue</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lvalue</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lvalue</em>' attribute.
	 * @see #setLvalue(String)
	 * @see diagramapseudocodigo.DiagramapseudocodigoPackage#getAsignacion_Lvalue()
	 * @model required="true"
	 * @generated
	 */
	String getLvalue();

	/**
	 * Sets the value of the '{@link diagramapseudocodigo.Asignacion#getLvalue <em>Lvalue</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lvalue</em>' attribute.
	 * @see #getLvalue()
	 * @generated
	 */
	void setLvalue(String value);

	/**
	 * Returns the value of the '<em><b>Operador</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operador</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operador</em>' containment reference.
	 * @see #setOperador(valor)
	 * @see diagramapseudocodigo.DiagramapseudocodigoPackage#getAsignacion_Operador()
	 * @model containment="true" required="true"
	 * @generated
	 */
	valor getOperador();

	/**
	 * Sets the value of the '{@link diagramapseudocodigo.Asignacion#getOperador <em>Operador</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operador</em>' containment reference.
	 * @see #getOperador()
	 * @generated
	 */
	void setOperador(valor value);

	/**
	 * Returns the value of the '<em><b>Mat</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mat</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mat</em>' attribute list.
	 * @see diagramapseudocodigo.DiagramapseudocodigoPackage#getAsignacion_Mat()
	 * @model
	 * @generated
	 */
	EList<String> getMat();

} // Asignacion
