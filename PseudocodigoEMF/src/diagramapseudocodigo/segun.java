/**
 */
package diagramapseudocodigo;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>segun</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link diagramapseudocodigo.segun#getOperador <em>Operador</em>}</li>
 *   <li>{@link diagramapseudocodigo.segun#getDevuelve <em>Devuelve</em>}</li>
 * </ul>
 * </p>
 *
 * @see diagramapseudocodigo.DiagramapseudocodigoPackage#getsegun()
 * @model
 * @generated
 */
public interface segun extends Bloque {
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
	 * @see diagramapseudocodigo.DiagramapseudocodigoPackage#getsegun_Operador()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Operador> getOperador();

	/**
	 * Returns the value of the '<em><b>Devuelve</b></em>' containment reference list.
	 * The list contents are of type {@link diagramapseudocodigo.Devolver}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Devuelve</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Devuelve</em>' containment reference list.
	 * @see diagramapseudocodigo.DiagramapseudocodigoPackage#getsegun_Devuelve()
	 * @model containment="true"
	 * @generated
	 */
	EList<Devolver> getDevuelve();

} // segun
