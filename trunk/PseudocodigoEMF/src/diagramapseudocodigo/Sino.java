/**
 */
package diagramapseudocodigo;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sino</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link diagramapseudocodigo.Sino#getSentencias <em>Sentencias</em>}</li>
 * </ul>
 * </p>
 *
 * @see diagramapseudocodigo.DiagramapseudocodigoPackage#getSino()
 * @model
 * @generated
 */
public interface Sino extends EObject {
	/**
	 * Returns the value of the '<em><b>Sentencias</b></em>' containment reference list.
	 * The list contents are of type {@link diagramapseudocodigo.Sentencias}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sentencias</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sentencias</em>' containment reference list.
	 * @see diagramapseudocodigo.DiagramapseudocodigoPackage#getSino_Sentencias()
	 * @model containment="true"
	 * @generated
	 */
	EList<Sentencias> getSentencias();

} // Sino
