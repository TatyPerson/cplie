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
 *   <li>{@link diagramapseudocodigo.Asignacion#getMat <em>Mat</em>}</li>
 *   <li>{@link diagramapseudocodigo.Asignacion#getOperadores <em>Operadores</em>}</li>
 *   <li>{@link diagramapseudocodigo.Asignacion#getValor_asignacion <em>Valor asignacion</em>}</li>
 * </ul>
 * </p>
 *
 * @see diagramapseudocodigo.DiagramapseudocodigoPackage#getAsignacion()
 * @model
 * @generated
 */
public interface Asignacion extends Sentencias {
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

	/**
	 * Returns the value of the '<em><b>Operadores</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operadores</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operadores</em>' containment reference.
	 * @see #setOperadores(operacion)
	 * @see diagramapseudocodigo.DiagramapseudocodigoPackage#getAsignacion_Operadores()
	 * @model containment="true" required="true"
	 * @generated
	 */
	operacion getOperadores();

	/**
	 * Sets the value of the '{@link diagramapseudocodigo.Asignacion#getOperadores <em>Operadores</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operadores</em>' containment reference.
	 * @see #getOperadores()
	 * @generated
	 */
	void setOperadores(operacion value);

	/**
	 * Returns the value of the '<em><b>Valor asignacion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Valor asignacion</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Valor asignacion</em>' attribute.
	 * @see #setValor_asignacion(String)
	 * @see diagramapseudocodigo.DiagramapseudocodigoPackage#getAsignacion_Valor_asignacion()
	 * @model required="true"
	 * @generated
	 */
	String getValor_asignacion();

	/**
	 * Sets the value of the '{@link diagramapseudocodigo.Asignacion#getValor_asignacion <em>Valor asignacion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Valor asignacion</em>' attribute.
	 * @see #getValor_asignacion()
	 * @generated
	 */
	void setValor_asignacion(String value);

} // Asignacion
