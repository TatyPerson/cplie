/**
 */
package diagramapseudocodigo;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Llamada Funcion</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link diagramapseudocodigo.LlamadaFuncion#getNombre <em>Nombre</em>}</li>
 *   <li>{@link diagramapseudocodigo.LlamadaFuncion#getOperador <em>Operador</em>}</li>
 * </ul>
 * </p>
 *
 * @see diagramapseudocodigo.DiagramapseudocodigoPackage#getLlamadaFuncion()
 * @model
 * @generated
 */
public interface LlamadaFuncion extends Sentencias, valor {
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
	 * @see diagramapseudocodigo.DiagramapseudocodigoPackage#getLlamadaFuncion_Nombre()
	 * @model required="true"
	 * @generated
	 */
	String getNombre();

	/**
	 * Sets the value of the '{@link diagramapseudocodigo.LlamadaFuncion#getNombre <em>Nombre</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nombre</em>' attribute.
	 * @see #getNombre()
	 * @generated
	 */
	void setNombre(String value);

	/**
	 * Returns the value of the '<em><b>Operador</b></em>' containment reference list.
	 * The list contents are of type {@link diagramapseudocodigo.Operador}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operador</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operador</em>' containment reference list.
	 * @see diagramapseudocodigo.DiagramapseudocodigoPackage#getLlamadaFuncion_Operador()
	 * @model containment="true"
	 * @generated
	 */
	EList<Operador> getOperador();

} // LlamadaFuncion
